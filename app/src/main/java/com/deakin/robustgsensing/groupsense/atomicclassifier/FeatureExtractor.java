package com.deakin.robustgsensing.groupsense.atomicclassifier;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;

import java.util.List;

import cern.colt.list.DoubleArrayList;
import cern.jet.stat.Descriptive;

/**
 *
 * @author amin
 */
public class FeatureExtractor {
	
	FastFourierTransformer fft=new FastFourierTransformer(DftNormalization.STANDARD); 
	PearsonsCorrelation pc=new PearsonsCorrelation();
    
	
	private double getMaxFreq(double[] data)
    {
        Complex[] sig=fft.transform(data, TransformType.FORWARD);
        double max= Double.NEGATIVE_INFINITY;
        for (int i=0; i<sig.length; i++) if (max<sig[i].abs()) max=sig[i].abs();
        return max;
    }

    final double[] meanRaw={4.2515,3.2868,3.5501};
    final double[] stdRaw={4.8253,5.0983,4.8814};

	
    private Double[] extractFeaturesPrivate(double[][] channelCopy)
    {
        Double[] features=new Double[25];
        features[features.length-1]=0.0;
        int fcount=0;
        Variance variance=new Variance();
        SumOfSquares sos=new SumOfSquares();
        PearsonsCorrelation pc=new PearsonsCorrelation();
        
        for (int i=0; i<3; i++)
        {
            features[fcount++]=variance.evaluate(channelCopy[i]);
            features[features.length-1]+=features[fcount-1];
            features[fcount++]=pc.correlation(channelCopy[i], channelCopy[(i+1)%3]);
            features[fcount++]=sos.evaluate(channelCopy[i]);
            DoubleArrayList dal=new DoubleArrayList(channelCopy[i]);
            features[fcount++]=Descriptive.autoCorrelation(dal,100,meanRaw[i], stdRaw[i]);
            features[fcount++]=Descriptive.covariance(dal, new DoubleArrayList(channelCopy[(i+1)%3]));
            features[fcount++]=Descriptive.meanDeviation(dal, meanRaw[i]);
            features[fcount++]=Descriptive.durbinWatson(dal);
            features[fcount++]=Descriptive.lag1(dal,meanRaw[i]);
      
        }
 
        for (int i=0; i<features.length; i++)
        {
            if (features[i]== Double.POSITIVE_INFINITY) features[i]=100000.0;
        }
    
        
       // System.out.print(" [");
     //   for (int i=0; i<window.size(); i++) System.out.print(window.get(i)[0].floatValue()+",");
       // System.out.println("]\t"+features[0]);
       // System.out.println(window+"\t"+features[9]);
        return features;
    }
    
    final double[] means={8.50989138,-0.014040251,7580.28985,908.72349,9.08220163,0.0855603565,11204.7067,1370.59209,7.19541022,0.126656788,12171.5591,1482.29976,0.198176893};
    final double[] stds={ 14.069805,0.28183313,7594.0376,757.32821,15.918285,0.33457891,8402.8704,630.63539,12.140133,0.30922308,7860.9836,671.17311,0.64447594};
    
    final double[][] p={{2.46424e-15,2.96375,0.257313,-10.012,4.0094,0.11238,0.576379,-4.78798,1.21629,-3.3504,0.0132264,0.834914,-3.71589,0},
    { -0.0000,2.1339,0.4936,-1.7942,0.0671,1.6539,0.0574,-1.0960,1.2135,-1.0320,-0.0927,0.0430,2.2649,0},
    {-0.000,-1.1776,0.1614,4.8101,-4.5927,-0.1518,-0.3169,-0.5640,-1.6491,1.2428,-0.2483,-3.9154,4.0659,0},
    { 0.0000,-0.2597,1.0401,-0.0671,-0.7943,0.1930,0.7224,0.9357,-1.1397,-1.0247,-0.5481,1.6019,-1.9952,0},
    {0.0000,0.4758,0.2127,-0.0312,-0.1592,1.8718,-0.5789,-1.9246,1.6316,-2.1435,-0.5919,3.5624,-4.1187,0},
    {  -0.0000,-0.2316,0.0717,0.3057,-0.4649,-0.2557,-0.0288,0.6989,-0.5078,0.2007,0.0926,-0.5896,0.3640,0},
    {   -0.0000,0.8085,0.2192,0.2893,-0.6746,0.5461,-0.4222,0.0004,-0.1093,-0.3245,0.3182,-3.1222,2.3931,0},
    {   -0.0000,0.4848,-0.4911,-0.2455,-0.8231,-0.7760,0.0007,-0.0836,-0.1436,1.2190,-0.2538,-1.8770,0.5347,0},
    {   -0.0000,-0.1612,-0.4983,1.2512,-0.4038,0.9339,-0.3277,-0.6900,0.9154,-1.2031,0.1487,1.6658,-0.7364,0},
    {   -0.0000,-0.2982,-0.3942,0.4593,-0.1162,0.4189,-0.3609,0.9218,-0.5091,-0.0130,-0.6238,0.0788,0.2088,0} };

    
    private Double[] getRegressed(double[] regMe)
    {
    	Double[] result = new Double[p.length];
    	for (int i=0; i<p.length; i++) result[i]=0.0;
    	
        // multiply
          for (int j=0; j<regMe.length; j++)
            for (int k=0; k<p.length; k++)
            {
            	System.out.println("loop "+j+"\t"+p[k].length);
            	result[k] += regMe[j] * p[k][j];
            }
        return result;
    }
    
    
    private double[] normaliseFeatures(double[] f1)
    {
    	for (int i=0; i<f1.length; i++)
    	{
    		f1[i]=(f1[i]-means[i])/stds[i];
    	}
    	return f1;
    }
    
    public Double[] extractFeatures(List<Double[]> window)
    {
        double[][] channelCopy=new double[window.get(0).length][window.size()];
        for (int i=0; i<window.size(); i++)
        {
            for (int j=0; j<window.get(i).length; j++)
            {
                channelCopy[j][i]=window.get(i)[j];
            }
        }
        Double[] f1=extractFeaturesPrivate(channelCopy);
      /*  f1=normaliseFeatures(f1);
        double[] regMe=new double[f1.length+1];
        regMe[0]=1;
        for (int i=0; i<f1.length; i++) regMe[i+1]=f1[i];
        return getRegressed(regMe);
        FastICA fica=new FastICA(channelCopy,3);
        double[][] icaData=fica.getICVectors();
        Double[] f2=extractFeaturesPrivate(icaData);
        Double[] retval=new Double[f1.length+f2.length];
        for (int i=0; i<f1.length; i++)
        {
            retval[i]=f1[i];
            retval[i+f1.length]=f2[i];
         //   System.out.print(f1[i]+":"+f2[i]+",");
        }
        //System.out.println("");
        return retval;
        */
        return f1;
        
   }
   
    
     public double sampleSkewness(List<Double[]> data, int index, double mean)
    {
        double numerator = 0, denominator = 0;
 
        for (int i = 0; i < data.size(); i++)
        {
            numerator += Math.pow(data.get(i)[index] - mean, 3); // deviations to the third power
            denominator += Math.pow(data.get(i)[index] - mean, 2); // deviations to the second power
        }
 
        numerator = (1.0 / data.size()) * numerator; // multiply by 1/ data size
 
        denominator = Math.pow(denominator * (1.0 / data.size()), 3.0 / 2.0); // multiply by 1/data size and raise to the power of 1.5
 
        return numerator / denominator;
    }
     
     public double rms(List<Double[]> data, int index)
     {
         double t=0;
         double n=0;
         for (int i =0; i < data.size(); i++)
        {
            double x = data.get(i)[index];
            if (x > 0)
            {
                t = t + Math.pow(x,2); // running total
                n = n + 1;
            }

        }
        return Math.sqrt(t / n);
     }
    
}