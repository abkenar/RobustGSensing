/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classifier;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;

import cern.colt.list.DoubleArrayList;
import cern.jet.stat.Descriptive;

/**
 *
 * @author amin
 */
public class FeatureExtractor {

    FastFourierTransformer fft = new FastFourierTransformer(DftNormalization.STANDARD);
    PearsonsCorrelation pc = new PearsonsCorrelation();

    private double getMaxFreq(double[] data) {
        Complex[] sig = fft.transform(data, TransformType.FORWARD);
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < sig.length; i++) {
            if (max < sig[i].abs()) {
                max = sig[i].abs();
            }
        }
        return max;
    }

    //final double[] meanRaw = {4.2515, 3.2868, 3.5501};
    //final double[] stdRaw = {4.8253, 5.0983, 4.8814};
    
    //meanRaw all wear            x      y      y
    final double[] meanRaw = {5.211573, -6.23789, -2.06024};

    //stdRaw all wear            x      y      y
    final double[] stdRaw = {4.26434, 4.655625, 6.251521};

    private Double[] extractFeaturesPrivate(double[][] channelCopy) {
        Double[] features = new Double[25];
        features[features.length - 1] = 0.0;
        int fcount = 0;
        Variance variance = new Variance();
        SumOfSquares sos = new SumOfSquares();
        PearsonsCorrelation pc = new PearsonsCorrelation();

        for (int i = 0; i < 3; i++) {
            features[fcount++] = variance.evaluate(channelCopy[i]);
            features[features.length - 1] += features[fcount - 1];
            features[fcount++] = pc.correlation(channelCopy[i], channelCopy[(i + 1) % 3]);
            features[fcount++] = sos.evaluate(channelCopy[i]);
            DoubleArrayList dal = new DoubleArrayList(channelCopy[i]);
            features[fcount++] = Descriptive.autoCorrelation(dal, 100, meanRaw[i], stdRaw[i]);
            features[fcount++] = Descriptive.covariance(dal, new DoubleArrayList(channelCopy[(i + 1) % 3]));
            features[fcount++] = Descriptive.meanDeviation(dal, meanRaw[i]);
            features[fcount++] = Descriptive.durbinWatson(dal);
            features[fcount++] = Descriptive.lag1(dal, meanRaw[i]);

        }

        for (int i = 0; i < features.length; i++) {
            if (features[i] == Double.POSITIVE_INFINITY) {
                features[i] = 100000.0;
            }
        }

        return features;
    }


    public Double[] extractFeatures(List<Double[]> window) {
        double[][] channelCopy = new double[window.get(0).length][window.size()];
        for (int i = 0; i < window.size(); i++) {
            for (int j = 0; j < window.get(i).length; j++) {
                channelCopy[j][i] = window.get(i)[j];
            }
        }
        Double[] f1 = extractFeaturesPrivate(channelCopy);

        return f1;

    }

    public double sampleSkewness(List<Double[]> data, int index, double mean) {
        double numerator = 0, denominator = 0;

        for (int i = 0; i < data.size(); i++) {
            numerator += Math.pow(data.get(i)[index] - mean, 3); // deviations to the third power
            denominator += Math.pow(data.get(i)[index] - mean, 2); // deviations to the second power
        }

        numerator = (1.0 / data.size()) * numerator; // multiply by 1/ data size

        denominator = Math.pow(denominator * (1.0 / data.size()), 3.0 / 2.0); // multiply by 1/data size and raise to the power of 1.5

        return numerator / denominator;
    }

    public double rms(List<Double[]> data, int index) {
        double t = 0;
        double n = 0;
        for (int i = 0; i < data.size(); i++) {
            double x = data.get(i)[index];
            if (x > 0) {
                t = t + Math.pow(x, 2); // running total
                n = n + 1;
            }

        }
        return Math.sqrt(t / n);
    }

}
