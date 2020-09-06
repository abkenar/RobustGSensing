package com.deakin.robustgsensing.groupsense.atomicclassifier;


public class ActiveInactiveClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) ActiveInactiveClassifier_0.classify(i)] += 3.661850781726017;
	    sums[(int) ActiveInactiveClassifier_1.classify(i)] += 3.5695326964813714;
	    sums[(int) ActiveInactiveClassifier_2.classify(i)] += 3.557160477028581;
	    sums[(int) ActiveInactiveClassifier_3.classify(i)] += 4.646220725818453;
	    sums[(int) ActiveInactiveClassifier_4.classify(i)] += 4.792110688638335;
	    sums[(int) ActiveInactiveClassifier_5.classify(i)] += 5.351287244918829;
	    sums[(int) ActiveInactiveClassifier_6.classify(i)] += 3.8156120479745597;
	    sums[(int) ActiveInactiveClassifier_7.classify(i)] += 4.078881328509553;
	    sums[(int) ActiveInactiveClassifier_8.classify(i)] += 3.918116442207448;
	    sums[(int) ActiveInactiveClassifier_9.classify(i)] += 4.237821933547166;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 2; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}

class ActiveInactiveClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = ActiveInactiveClassifier_0.Nc071250(i);
	    return p;
	  }
	  static double Nc071250(Object[]i) {
	    double p = Double.NaN;
	    if (i[16] == null) {
	      p = 0;
	    } else if (((Double) i[16]).doubleValue() <= 1.9464) {
	    p = ActiveInactiveClassifier_0.N4437991(i);
	    } else if (((Double) i[16]).doubleValue() > 1.9464) {
	    p = ActiveInactiveClassifier_0.N1d887889(i);
	    } 
	    return p;
	  }
	  static double N4437991(Object[]i) {
	    double p = Double.NaN;
	    if (i[16] == null) {
	      p = 0;
	    } else if (((Double) i[16]).doubleValue() <= 0.82594) {
	      p = 0;
	    } else if (((Double) i[16]).doubleValue() > 0.82594) {
	    p = ActiveInactiveClassifier_0.N9e40d22(i);
	    } 
	    return p;
	  }
	  static double N9e40d22(Object[]i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 0;
	    } else if (((Double) i[14]).doubleValue() <= 0.023761) {
	    p = ActiveInactiveClassifier_0.N1b1c9783(i);
	    } else if (((Double) i[14]).doubleValue() > 0.023761) {
	    p = ActiveInactiveClassifier_0.N198f08c8(i);
	    } 
	    return p;
	  }
	  static double N1b1c9783(Object[]i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 2.0648) {
	    p = ActiveInactiveClassifier_0.N1220c1b4(i);
	    } else if (((Double) i[8]).doubleValue() > 2.0648) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1220c1b4(Object[]i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 6.6768) {
	    p = ActiveInactiveClassifier_0.N48c33e5(i);
	    } else if (((Double) i[11]).doubleValue() > 6.6768) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N48c33e5(Object[]i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() <= 17832.0) {
	    p = ActiveInactiveClassifier_0.N10a5c376(i);
	    } else if (((Double) i[18]).doubleValue() > 17832.0) {
	    p = ActiveInactiveClassifier_0.N12c4d937(i);
	    } 
	    return p;
	  }
	  static double N10a5c376(Object[]i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() <= 0.97155) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() > 0.97155) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N12c4d937(Object[]i) {
	    double p = Double.NaN;
	    if (i[17] == null) {
	      p = 1;
	    } else if (((Double) i[17]).doubleValue() <= 0.12411) {
	      p = 1;
	    } else if (((Double) i[17]).doubleValue() > 0.12411) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N198f08c8(Object[]i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 0.52289) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 0.52289) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1d887889(Object[]i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -0.7705) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > -0.7705) {
	    p = ActiveInactiveClassifier_0.Naa2c1c10(i);
	    } 
	    return p;
	  }
	  static double Naa2c1c10(Object[]i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 5.4832) {
	    p = ActiveInactiveClassifier_0.N36026811(i);
	    } else if (((Double) i[3]).doubleValue() > 5.4832) {
	    p = ActiveInactiveClassifier_0.N1ab057621(i);
	    } 
	    return p;
	  }
	  static double N36026811(Object[]i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 7043.8) {
	    p = ActiveInactiveClassifier_0.N1d8053c12(i);
	    } else if (((Double) i[2]).doubleValue() > 7043.8) {
	    p = ActiveInactiveClassifier_0.N18b724517(i);
	    } 
	    return p;
	  }
	  static double N1d8053c12(Object[]i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 1;
	    } else if (((Double) i[13]).doubleValue() <= 2.3834) {
	      p = 1;
	    } else if (((Double) i[13]).doubleValue() > 2.3834) {
	    p = ActiveInactiveClassifier_0.N13fc0bb13(i);
	    } 
	    return p;
	  }
	  static double N13fc0bb13(Object[]i) {
	    double p = Double.NaN;
	    if (i[22] == null) {
	      p = 0;
	    } else if (((Double) i[22]).doubleValue() <= 0.027279) {
	    p = ActiveInactiveClassifier_0.N864b2b14(i);
	    } else if (((Double) i[22]).doubleValue() > 0.027279) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N864b2b14(Object[]i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= -0.038158) {
	    p = ActiveInactiveClassifier_0.Nb128a215(i);
	    } else if (((Double) i[1]).doubleValue() > -0.038158) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nb128a215(Object[]i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() <= 0.98889) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() > 0.98889) {
	    p = ActiveInactiveClassifier_0.Ne2e29c16(i);
	    } 
	    return p;
	  }
	  static double Ne2e29c16(Object[]i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 0.32724) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 0.32724) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N18b724517(Object[]i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() <= 0.98036) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() > 0.98036) {
	    p = ActiveInactiveClassifier_0.N1fb36c218(i);
	    } 
	    return p;
	  }
	  static double N1fb36c218(Object[]i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 2.0701) {
	    p = ActiveInactiveClassifier_0.N1c8132a19(i);
	    } else if (((Double) i[4]).doubleValue() > 2.0701) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1c8132a19(Object[]i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= -0.42161) {
	    p = ActiveInactiveClassifier_0.N62359220(i);
	    } else if (((Double) i[1]).doubleValue() > -0.42161) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N62359220(Object[]i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= -8.1406) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() > -8.1406) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1ab057621(Object[]i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 0;
	    } else if (((Double) i[14]).doubleValue() <= 0.068241) {
	    p = ActiveInactiveClassifier_0.Nf3c66e22(i);
	    } else if (((Double) i[14]).doubleValue() > 0.068241) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nf3c66e22(Object[]i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 8.1846) {
	    p = ActiveInactiveClassifier_0.N68949023(i);
	    } else if (((Double) i[8]).doubleValue() > 8.1846) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N68949023(Object[]i) {
	    double p = Double.NaN;
	    if (i[17] == null) {
	      p = 1;
	    } else if (((Double) i[17]).doubleValue() <= 0.23966) {
	    p = ActiveInactiveClassifier_0.N1f1815324(i);
	    } else if (((Double) i[17]).doubleValue() > 0.23966) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1f1815324(Object[]i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() <= 12621.0) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() > 12621.0) {
	      p = 1;
	    } 
	    return p;
	  }
	}

class ActiveInactiveClassifier_1 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ActiveInactiveClassifier_1.N61ab9c25(i);
    return p;
  }
  static double N61ab9c25(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 0.30564) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() > 0.30564) {
    p = ActiveInactiveClassifier_1.N49ca7526(i);
    }
    return p;
  }
  static double N49ca7526(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() <= 1.9304) {
    p = ActiveInactiveClassifier_1.N8ae43127(i);
    } else if (((Double) i[13]).doubleValue() > 1.9304) {
    p = ActiveInactiveClassifier_1.N19482ea31(i);
    }
    return p;
  }
  static double N8ae43127(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.8715) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.8715) {
    p = ActiveInactiveClassifier_1.N8b88bd28(i);
    }
    return p;
  }
  static double N8b88bd28(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.017209) {
    p = ActiveInactiveClassifier_1.Nbe568729(i);
    } else if (((Double) i[6]).doubleValue() > 0.017209) {
      p = 1;
    }
    return p;
  }
  static double Nbe568729(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.018488) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() > 0.018488) {
    p = ActiveInactiveClassifier_1.N22c0a030(i);
    }
    return p;
  }
  static double N22c0a030(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() <= 5.7558) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() > 5.7558) {
      p = 0;
    }
    return p;
  }
  static double N19482ea31(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.7705) {
    p = ActiveInactiveClassifier_1.N11ef55c32(i);
    } else if (((Double) i[1]).doubleValue() > -0.7705) {
    p = ActiveInactiveClassifier_1.N17e9fe833(i);
    }
    return p;
  }
  static double N11ef55c32(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.80382) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.80382) {
      p = 1;
    }
    return p;
  }
  static double N17e9fe833(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 10927.0) {
    p = ActiveInactiveClassifier_1.N34498634(i);
    } else if (((Double) i[2]).doubleValue() > 10927.0) {
      p = 1;
    }
    return p;
  }
  static double N34498634(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.99527) {
    p = ActiveInactiveClassifier_1.Nc6fc8435(i);
    } else if (((Double) i[7]).doubleValue() > 0.99527) {
      p = 0;
    }
    return p;
  }
  static double Nc6fc8435(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.53273) {
    p = ActiveInactiveClassifier_1.N1ec73d936(i);
    } else if (((Double) i[9]).doubleValue() > -0.53273) {
    p = ActiveInactiveClassifier_1.Na9dcc237(i);
    }
    return p;
  }
  static double N1ec73d936(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.096694) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.096694) {
      p = 1;
    }
    return p;
  }
  static double Na9dcc237(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 9116.1) {
    p = ActiveInactiveClassifier_1.N1dc534138(i);
    } else if (((Double) i[18]).doubleValue() > 9116.1) {
    p = ActiveInactiveClassifier_1.N1ddfb6a39(i);
    }
    return p;
  }
  static double N1dc534138(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.011825) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 0.011825) {
      p = 1;
    }
    return p;
  }
  static double N1ddfb6a39(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 4558.2) {
    p = ActiveInactiveClassifier_1.Na4ff9240(i);
    } else if (((Double) i[10]).doubleValue() > 4558.2) {
    p = ActiveInactiveClassifier_1.N86d2c741(i);
    }
    return p;
  }
  static double Na4ff9240(Object[]i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= 0.085582) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() > 0.085582) {
      p = 0;
    }
    return p;
  }
  static double N86d2c741(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 11175.0) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 11175.0) {
    p = ActiveInactiveClassifier_1.N17827e942(i);
    }
    return p;
  }
  static double N17827e942(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 0.38444) {
    p = ActiveInactiveClassifier_1.N1845cce43(i);
    } else if (((Double) i[9]).doubleValue() > 0.38444) {
      p = 1;
    }
    return p;
  }
  static double N1845cce43(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= -0.047772) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > -0.047772) {
      p = 0;
    }
    return p;
  }
}

class ActiveInactiveClassifier_2 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ActiveInactiveClassifier_2.Ne914a844(i);
    return p;
  }
  static double Ne914a844(Object[]i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 0.26985) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 0.26985) {
    p = ActiveInactiveClassifier_2.N4b44f045(i);
    }
    return p;
  }
  static double N4b44f045(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.97059) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.97059) {
    p = ActiveInactiveClassifier_2.N19afa2646(i);
    }
    return p;
  }
  static double N19afa2646(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 3297.5) {
    p = ActiveInactiveClassifier_2.N19d142f47(i);
    } else if (((Double) i[18]).doubleValue() > 3297.5) {
    p = ActiveInactiveClassifier_2.Nff2c4e49(i);
    }
    return p;
  }
  static double N19d142f47(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.99258) {
    p = ActiveInactiveClassifier_2.N198591048(i);
    } else if (((Double) i[7]).doubleValue() > 0.99258) {
      p = 0;
    }
    return p;
  }
  static double N198591048(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 15983.0) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 15983.0) {
      p = 1;
    }
    return p;
  }
  static double Nff2c4e49(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 4.3312) {
    p = ActiveInactiveClassifier_2.Nb5e07a50(i);
    } else if (((Double) i[11]).doubleValue() > 4.3312) {
    p = ActiveInactiveClassifier_2.N1b1d7ff58(i);
    }
    return p;
  }
  static double Nb5e07a50(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.29429) {
    p = ActiveInactiveClassifier_2.Na488b951(i);
    } else if (((Double) i[9]).doubleValue() > -0.29429) {
    p = ActiveInactiveClassifier_2.N12c5c853(i);
    }
    return p;
  }
  static double Na488b951(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 0;
    } else if (((Double) i[19]).doubleValue() <= 3.0621) {
      p = 0;
    } else if (((Double) i[19]).doubleValue() > 3.0621) {
    p = ActiveInactiveClassifier_2.Nc4ef152(i);
    }
    return p;
  }
  static double Nc4ef152(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.012424) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 0.012424) {
      p = 1;
    }
    return p;
  }
  static double N12c5c853(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.57342) {
    p = ActiveInactiveClassifier_2.N76d4af54(i);
    } else if (((Double) i[9]).doubleValue() > 0.57342) {
    p = ActiveInactiveClassifier_2.N1363c5057(i);
    }
    return p;
  }
  static double N76d4af54(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.6272) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.6272) {
    p = ActiveInactiveClassifier_2.N18567de55(i);
    }
    return p;
  }
  static double N18567de55(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.43839) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 0.43839) {
    p = ActiveInactiveClassifier_2.N1664cb556(i);
    }
    return p;
  }
  static double N1664cb556(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.081331) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 0.081331) {
      p = 0;
    }
    return p;
  }
  static double N1363c5057(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 4.379) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 4.379) {
      p = 0;
    }
    return p;
  }
  static double N1b1d7ff58(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 11754.0) {
    p = ActiveInactiveClassifier_2.Ndbb07359(i);
    } else if (((Double) i[2]).doubleValue() > 11754.0) {
      p = 1;
    }
    return p;
  }
  static double Ndbb07359(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 8.5497) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 8.5497) {
      p = 0;
    }
    return p;
  }
}

class ActiveInactiveClassifier_3 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ActiveInactiveClassifier_3.N11d4e7560(i);
    return p;
  }
  static double N11d4e7560(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 24832.0) {
    p = ActiveInactiveClassifier_3.N10a100161(i);
    } else if (((Double) i[18]).doubleValue() > 24832.0) {
      p = 1;
    }
    return p;
  }
  static double N10a100161(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.78716) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.78716) {
    p = ActiveInactiveClassifier_3.N1a0d51062(i);
    }
    return p;
  }
  static double N1a0d51062(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 14852.0) {
    p = ActiveInactiveClassifier_3.N4198e63(i);
    } else if (((Double) i[2]).doubleValue() > 14852.0) {
    p = ActiveInactiveClassifier_3.N13f5ff878(i);
    }
    return p;
  }
  static double N4198e63(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 0.39036) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() > 0.39036) {
    p = ActiveInactiveClassifier_3.N129da7764(i);
    }
    return p;
  }
  static double N129da7764(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 307.11) {
    p = ActiveInactiveClassifier_3.Nc5e23465(i);
    } else if (((Double) i[2]).doubleValue() > 307.11) {
    p = ActiveInactiveClassifier_3.N18600d766(i);
    }
    return p;
  }
  static double Nc5e23465(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.53418) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 0.53418) {
      p = 1;
    }
    return p;
  }
  static double N18600d766(Object[]i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() <= 0.99586) {
    p = ActiveInactiveClassifier_3.Na140c267(i);
    } else if (((Double) i[15]).doubleValue() > 0.99586) {
    p = ActiveInactiveClassifier_3.N1999b9677(i);
    }
    return p;
  }
  static double Na140c267(Object[]i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= -0.6074) {
    p = ActiveInactiveClassifier_3.Na2870868(i);
    } else if (((Double) i[17]).doubleValue() > -0.6074) {
    p = ActiveInactiveClassifier_3.N4f362369(i);
    }
    return p;
  }
  static double Na2870868(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.98098) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.98098) {
      p = 0;
    }
    return p;
  }
  static double N4f362369(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.16253) {
    p = ActiveInactiveClassifier_3.N6b4c9c70(i);
    } else if (((Double) i[3]).doubleValue() > -0.16253) {
    p = ActiveInactiveClassifier_3.N10a22c172(i);
    }
    return p;
  }
  static double N6b4c9c70(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 4.2159) {
    p = ActiveInactiveClassifier_3.N72a66471(i);
    } else if (((Double) i[8]).doubleValue() > 4.2159) {
      p = 1;
    }
    return p;
  }
  static double N72a66471(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -2.2046) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -2.2046) {
      p = 1;
    }
    return p;
  }
  static double N10a22c172(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 17301.0) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() > 17301.0) {
    p = ActiveInactiveClassifier_3.N6fbedf73(i);
    }
    return p;
  }
  static double N6fbedf73(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 8.2035) {
    p = ActiveInactiveClassifier_3.N5c5b1d74(i);
    } else if (((Double) i[16]).doubleValue() > 8.2035) {
      p = 1;
    }
    return p;
  }
  static double N5c5b1d74(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.020357) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.020357) {
    p = ActiveInactiveClassifier_3.N162037875(i);
    }
    return p;
  }
  static double N162037875(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 2.897) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() > 2.897) {
    p = ActiveInactiveClassifier_3.N1d1e71376(i);
    }
    return p;
  }
  static double N1d1e71376(Object[]i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() <= 0.99521) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() > 0.99521) {
      p = 1;
    }
    return p;
  }
  static double N1999b9677(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 5.9358) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > 5.9358) {
      p = 0;
    }
    return p;
  }
  static double N13f5ff878(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.0015508) {
    p = ActiveInactiveClassifier_3.N1b5c6b679(i);
    } else if (((Double) i[6]).doubleValue() > 0.0015508) {
      p = 1;
    }
    return p;
  }
  static double N1b5c6b679(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 4.7758) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 4.7758) {
    p = ActiveInactiveClassifier_3.N108e90a80(i);
    }
    return p;
  }
  static double N108e90a80(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 567.04) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > 567.04) {
      p = 1;
    }
    return p;
  }
}

class ActiveInactiveClassifier_4 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ActiveInactiveClassifier_4.N1fbca8681(i);
    return p;
  }
  static double N1fbca8681(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 0.82594) {
    p = ActiveInactiveClassifier_4.N1ad4b6982(i);
    } else if (((Double) i[16]).doubleValue() > 0.82594) {
    p = ActiveInactiveClassifier_4.N163961587(i);
    }
    return p;
  }
  static double N1ad4b6982(Object[]i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 0.89729) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() > 0.89729) {
    p = ActiveInactiveClassifier_4.N32025683(i);
    }
    return p;
  }
  static double N32025683(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() <= 5.3871) {
    p = ActiveInactiveClassifier_4.N13772c584(i);
    } else if (((Double) i[13]).doubleValue() > 5.3871) {
      p = 1;
    }
    return p;
  }
  static double N13772c584(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() <= 3.5362) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() > 3.5362) {
    p = ActiveInactiveClassifier_4.N14fe73685(i);
    }
    return p;
  }
  static double N14fe73685(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.0033786) {
    p = ActiveInactiveClassifier_4.Nd4afd486(i);
    } else if (((Double) i[4]).doubleValue() > -0.0033786) {
      p = 1;
    }
    return p;
  }
  static double Nd4afd486(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.85966) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.85966) {
      p = 0;
    }
    return p;
  }
  static double N163961587(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.70486) {
    p = ActiveInactiveClassifier_4.N112656b88(i);
    } else if (((Double) i[1]).doubleValue() > -0.70486) {
    p = ActiveInactiveClassifier_4.N13feff290(i);
    }
    return p;
  }
  static double N112656b88(Object[]i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 28.454) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() > 28.454) {
    p = ActiveInactiveClassifier_4.Nc05d9589(i);
    }
    return p;
  }
  static double Nc05d9589(Object[]i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 3.8688) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 3.8688) {
      p = 0;
    }
    return p;
  }
  static double N13feff290(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.0944) {
    p = ActiveInactiveClassifier_4.Na205d191(i);
    } else if (((Double) i[3]).doubleValue() > 3.0944) {
    p = ActiveInactiveClassifier_4.N17db7ae98(i);
    }
    return p;
  }
  static double Na205d191(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 4.064) {
    p = ActiveInactiveClassifier_4.N12bf75592(i);
    } else if (((Double) i[13]).doubleValue() > 4.064) {
      p = 1;
    }
    return p;
  }
  static double N12bf75592(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.71969) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 0.71969) {
    p = ActiveInactiveClassifier_4.N17b2b9993(i);
    }
    return p;
  }
  static double N17b2b9993(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 15862.0) {
    p = ActiveInactiveClassifier_4.N16b653d94(i);
    } else if (((Double) i[10]).doubleValue() > 15862.0) {
      p = 0;
    }
    return p;
  }
  static double N16b653d94(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 3.1024) {
    p = ActiveInactiveClassifier_4.N1c39d0995(i);
    } else if (((Double) i[4]).doubleValue() > 3.1024) {
      p = 0;
    }
    return p;
  }
  static double N1c39d0995(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.26899) {
    p = ActiveInactiveClassifier_4.N17adfb496(i);
    } else if (((Double) i[3]).doubleValue() > -0.26899) {
      p = 1;
    }
    return p;
  }
  static double N17adfb496(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.019827) {
    p = ActiveInactiveClassifier_4.N1f4c81c97(i);
    } else if (((Double) i[22]).doubleValue() > 0.019827) {
      p = 1;
    }
    return p;
  }
  static double N1f4c81c97(Object[]i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() <= 0.98896) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() > 0.98896) {
      p = 1;
    }
    return p;
  }
  static double N17db7ae98(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 1180.3) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 1180.3) {
    p = ActiveInactiveClassifier_4.Na6284099(i);
    }
    return p;
  }
  static double Na6284099(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.066178) {
    p = ActiveInactiveClassifier_4.N9cbfa1100(i);
    } else if (((Double) i[1]).doubleValue() > 0.066178) {
    p = ActiveInactiveClassifier_4.N1ad5275104(i);
    }
    return p;
  }
  static double N9cbfa1100(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.33977) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -0.33977) {
    p = ActiveInactiveClassifier_4.Ne916a1101(i);
    }
    return p;
  }
  static double Ne916a1101(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 0.031962) {
    p = ActiveInactiveClassifier_4.Nccdcea102(i);
    } else if (((Double) i[22]).doubleValue() > 0.031962) {
      p = 0;
    }
    return p;
  }
  static double Nccdcea102(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 17663.0) {
    p = ActiveInactiveClassifier_4.N1bb8b29103(i);
    } else if (((Double) i[18]).doubleValue() > 17663.0) {
      p = 0;
    }
    return p;
  }
  static double N1bb8b29103(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 3.6732) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 3.6732) {
      p = 1;
    }
    return p;
  }
  static double N1ad5275104(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 0.91457) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 0.91457) {
      p = 0;
    }
    return p;
  }
}

class ActiveInactiveClassifier_5 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ActiveInactiveClassifier_5.Nc0cf105(i);
    return p;
  }
  static double Nc0cf105(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 0.82594) {
    p = ActiveInactiveClassifier_5.N1727d04106(i);
    } else if (((Double) i[16]).doubleValue() > 0.82594) {
    p = ActiveInactiveClassifier_5.N52cdcc110(i);
    }
    return p;
  }
  static double N1727d04106(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.0021019) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 0.0021019) {
    p = ActiveInactiveClassifier_5.N16db53a107(i);
    }
    return p;
  }
  static double N16db53a107(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 17832.0) {
    p = ActiveInactiveClassifier_5.N19523c8108(i);
    } else if (((Double) i[18]).doubleValue() > 17832.0) {
      p = 0;
    }
    return p;
  }
  static double N19523c8108(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() <= 4.6433) {
    p = ActiveInactiveClassifier_5.N602d9d109(i);
    } else if (((Double) i[13]).doubleValue() > 4.6433) {
      p = 1;
    }
    return p;
  }
  static double N602d9d109(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5194.1) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5194.1) {
      p = 0;
    }
    return p;
  }
  static double N52cdcc110(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 0.040269) {
    p = ActiveInactiveClassifier_5.N4523d6111(i);
    } else if (((Double) i[22]).doubleValue() > 0.040269) {
    p = ActiveInactiveClassifier_5.Nc552d5131(i);
    }
    return p;
  }
  static double N4523d6111(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.43839) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 0.43839) {
    p = ActiveInactiveClassifier_5.N133d68a112(i);
    }
    return p;
  }
  static double N133d68a112(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 25963.0) {
    p = ActiveInactiveClassifier_5.N4a1535113(i);
    } else if (((Double) i[18]).doubleValue() > 25963.0) {
      p = 1;
    }
    return p;
  }
  static double N4a1535113(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 9.8291) {
    p = ActiveInactiveClassifier_5.N1b65e36114(i);
    } else if (((Double) i[8]).doubleValue() > 9.8291) {
      p = 0;
    }
    return p;
  }
  static double N1b65e36114(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 2120.3) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() > 2120.3) {
    p = ActiveInactiveClassifier_5.N1e35108115(i);
    }
    return p;
  }
  static double N1e35108115(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.74684) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.74684) {
    p = ActiveInactiveClassifier_5.Ndd1773116(i);
    }
    return p;
  }
  static double Ndd1773116(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.0010616) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() > 0.0010616) {
    p = ActiveInactiveClassifier_5.N12eb0b3117(i);
    }
    return p;
  }
  static double N12eb0b3117(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.45077) {
    p = ActiveInactiveClassifier_5.N52e26f118(i);
    } else if (((Double) i[9]).doubleValue() > -0.45077) {
    p = ActiveInactiveClassifier_5.N18ff4f6119(i);
    }
    return p;
  }
  static double N52e26f118(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 4558.2) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 4558.2) {
      p = 0;
    }
    return p;
  }
  static double N18ff4f6119(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.002345) {
    p = ActiveInactiveClassifier_5.N1b6d56120(i);
    } else if (((Double) i[6]).doubleValue() > 0.002345) {
    p = ActiveInactiveClassifier_5.Na7315c121(i);
    }
    return p;
  }
  static double N1b6d56120(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 0.47951) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() > 0.47951) {
      p = 0;
    }
    return p;
  }
  static double Na7315c121(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.09312) {
    p = ActiveInactiveClassifier_5.N99cce6122(i);
    } else if (((Double) i[6]).doubleValue() > 0.09312) {
    p = ActiveInactiveClassifier_5.N1b5e32130(i);
    }
    return p;
  }
  static double N99cce6122(Object[]i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() <= 0.98768) {
    p = ActiveInactiveClassifier_5.N15b24dd123(i);
    } else if (((Double) i[15]).doubleValue() > 0.98768) {
    p = ActiveInactiveClassifier_5.Nebc11d128(i);
    }
    return p;
  }
  static double N15b24dd123(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 11175.0) {
    p = ActiveInactiveClassifier_5.Nd12df7124(i);
    } else if (((Double) i[10]).doubleValue() > 11175.0) {
      p = 0;
    }
    return p;
  }
  static double Nd12df7124(Object[]i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() <= 0.89062) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() > 0.89062) {
    p = ActiveInactiveClassifier_5.N120d359125(i);
    }
    return p;
  }
  static double N120d359125(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.79582) {
    p = ActiveInactiveClassifier_5.N1383eb126(i);
    } else if (((Double) i[4]).doubleValue() > 0.79582) {
      p = 0;
    }
    return p;
  }
  static double N1383eb126(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.086068) {
    p = ActiveInactiveClassifier_5.N139f0bb127(i);
    } else if (((Double) i[3]).doubleValue() > 0.086068) {
      p = 1;
    }
    return p;
  }
  static double N139f0bb127(Object[]i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() <= 0.97459) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() > 0.97459) {
      p = 0;
    }
    return p;
  }
  static double Nebc11d128(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.38065) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 0.38065) {
    p = ActiveInactiveClassifier_5.N1d36efb129(i);
    }
    return p;
  }
  static double N1d36efb129(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 0.47099) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 0.47099) {
      p = 1;
    }
    return p;
  }
  static double N1b5e32130(Object[]i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 0.65514) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 0.65514) {
      p = 0;
    }
    return p;
  }
  static double Nc552d5131(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 1;
    } else if (((Double) i[14]).doubleValue() <= 0.0092988) {
    p = ActiveInactiveClassifier_5.Nc13c17132(i);
    } else if (((Double) i[14]).doubleValue() > 0.0092988) {
      p = 1;
    }
    return p;
  }
  static double Nc13c17132(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.99386) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.99386) {
      p = 0;
    }
    return p;
  }
}

class ActiveInactiveClassifier_6 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ActiveInactiveClassifier_6.N5043d6133(i);
    return p;
  }
  static double N5043d6133(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.53418) {
    p = ActiveInactiveClassifier_6.N195a626134(i);
    } else if (((Double) i[8]).doubleValue() > 0.53418) {
    p = ActiveInactiveClassifier_6.N7efaf6136(i);
    }
    return p;
  }
  static double N195a626134(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.0021019) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 0.0021019) {
    p = ActiveInactiveClassifier_6.N1cf1d17135(i);
    }
    return p;
  }
  static double N1cf1d17135(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 0.9947) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() > 0.9947) {
      p = 1;
    }
    return p;
  }
  static double N7efaf6136(Object[]i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 6.6927) {
    p = ActiveInactiveClassifier_6.N8e683a137(i);
    } else if (((Double) i[5]).doubleValue() > 6.6927) {
    p = ActiveInactiveClassifier_6.N1426780149(i);
    }
    return p;
  }
  static double N8e683a137(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.98958) {
    p = ActiveInactiveClassifier_6.N15cd6e5138(i);
    } else if (((Double) i[23]).doubleValue() > 0.98958) {
    p = ActiveInactiveClassifier_6.N1f36af6144(i);
    }
    return p;
  }
  static double N15cd6e5138(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6954.8) {
    p = ActiveInactiveClassifier_6.N20699a139(i);
    } else if (((Double) i[2]).doubleValue() > 6954.8) {
    p = ActiveInactiveClassifier_6.N2f9028142(i);
    }
    return p;
  }
  static double N20699a139(Object[]i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 1;
    } else if (((Double) i[24]).doubleValue() <= 37.569) {
    p = ActiveInactiveClassifier_6.N1f504b4140(i);
    } else if (((Double) i[24]).doubleValue() > 37.569) {
      p = 0;
    }
    return p;
  }
  static double N1f504b4140(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() <= 1.8778) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() > 1.8778) {
    p = ActiveInactiveClassifier_6.N107ffdf141(i);
    }
    return p;
  }
  static double N107ffdf141(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 5.3928) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 5.3928) {
      p = 0;
    }
    return p;
  }
  static double N2f9028142(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 3.0986) {
    p = ActiveInactiveClassifier_6.Na1364a143(i);
    } else if (((Double) i[13]).doubleValue() > 3.0986) {
      p = 1;
    }
    return p;
  }
  static double Na1364a143(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.72816) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.72816) {
      p = 1;
    }
    return p;
  }
  static double N1f36af6144(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.23592) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.23592) {
    p = ActiveInactiveClassifier_6.N1f37d13145(i);
    }
    return p;
  }
  static double N1f37d13145(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.99458) {
    p = ActiveInactiveClassifier_6.N98a7eb146(i);
    } else if (((Double) i[23]).doubleValue() > 0.99458) {
      p = 0;
    }
    return p;
  }
  static double N98a7eb146(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 0;
    } else if (((Double) i[23]).doubleValue() <= 0.99007) {
      p = 0;
    } else if (((Double) i[23]).doubleValue() > 0.99007) {
    p = ActiveInactiveClassifier_6.N383ed6147(i);
    }
    return p;
  }
  static double N383ed6147(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.020626) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.020626) {
    p = ActiveInactiveClassifier_6.Na58701148(i);
    }
    return p;
  }
  static double Na58701148(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 3.2405) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() > 3.2405) {
      p = 0;
    }
    return p;
  }
  static double N1426780149(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.029248) {
    p = ActiveInactiveClassifier_6.N990a46150(i);
    } else if (((Double) i[14]).doubleValue() > 0.029248) {
    p = ActiveInactiveClassifier_6.N1d5b144152(i);
    }
    return p;
  }
  static double N990a46150(Object[]i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= -0.60669) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() > -0.60669) {
    p = ActiveInactiveClassifier_6.N17194a4151(i);
    }
    return p;
  }
  static double N17194a4151(Object[]i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 7.3452) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 7.3452) {
      p = 0;
    }
    return p;
  }
  static double N1d5b144152(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.94629) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 0.94629) {
      p = 1;
    }
    return p;
  }
}

class ActiveInactiveClassifier_7 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ActiveInactiveClassifier_7.N68fede153(i);
    return p;
  }
  static double N68fede153(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.78716) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.78716) {
    p = ActiveInactiveClassifier_7.N134b58c154(i);
    }
    return p;
  }
  static double N134b58c154(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -8.1406) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -8.1406) {
    p = ActiveInactiveClassifier_7.N17afcff155(i);
    }
    return p;
  }
  static double N17afcff155(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 14631.0) {
    p = ActiveInactiveClassifier_7.N177ee02156(i);
    } else if (((Double) i[2]).doubleValue() > 14631.0) {
    p = ActiveInactiveClassifier_7.N72dcb6172(i);
    }
    return p;
  }
  static double N177ee02156(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.96618) {
    p = ActiveInactiveClassifier_7.Naaf438157(i);
    } else if (((Double) i[23]).doubleValue() > 0.96618) {
    p = ActiveInactiveClassifier_7.N11d4b2e159(i);
    }
    return p;
  }
  static double Naaf438157(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.027279) {
    p = ActiveInactiveClassifier_7.N1879842158(i);
    } else if (((Double) i[22]).doubleValue() > 0.027279) {
      p = 1;
    }
    return p;
  }
  static double N1879842158(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= -0.049231) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > -0.049231) {
      p = 0;
    }
    return p;
  }
  static double N11d4b2e159(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() <= 0.55708) {
    p = ActiveInactiveClassifier_7.N32dc75160(i);
    } else if (((Double) i[16]).doubleValue() > 0.55708) {
    p = ActiveInactiveClassifier_7.N1278880161(i);
    }
    return p;
  }
  static double N32dc75160(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.99234) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.99234) {
      p = 0;
    }
    return p;
  }
  static double N1278880161(Object[]i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 0;
    } else if (((Double) i[12]).doubleValue() <= 6.5047) {
    p = ActiveInactiveClassifier_7.N72c796162(i);
    } else if (((Double) i[12]).doubleValue() > 6.5047) {
      p = 1;
    }
    return p;
  }
  static double N72c796162(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 1.8899) {
    p = ActiveInactiveClassifier_7.N18d859a163(i);
    } else if (((Double) i[13]).doubleValue() > 1.8899) {
    p = ActiveInactiveClassifier_7.N3e7799164(i);
    }
    return p;
  }
  static double N18d859a163(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.016274) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.016274) {
      p = 1;
    }
    return p;
  }
  static double N3e7799164(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 7.8559) {
    p = ActiveInactiveClassifier_7.N11e03e3165(i);
    } else if (((Double) i[11]).doubleValue() > 7.8559) {
    p = ActiveInactiveClassifier_7.N86edfe171(i);
    }
    return p;
  }
  static double N11e03e3165(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.0029711) {
    p = ActiveInactiveClassifier_7.N191529c166(i);
    } else if (((Double) i[14]).doubleValue() > 0.0029711) {
    p = ActiveInactiveClassifier_7.N10e2096169(i);
    }
    return p;
  }
  static double N191529c166(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 0.2762) {
    p = ActiveInactiveClassifier_7.N1c68ff4167(i);
    } else if (((Double) i[9]).doubleValue() > 0.2762) {
      p = 1;
    }
    return p;
  }
  static double N1c68ff4167(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 14827.0) {
    p = ActiveInactiveClassifier_7.N1151cae168(i);
    } else if (((Double) i[10]).doubleValue() > 14827.0) {
      p = 0;
    }
    return p;
  }
  static double N1151cae168(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.002275) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() > 0.002275) {
      p = 1;
    }
    return p;
  }
  static double N10e2096169(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 18218.0) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() > 18218.0) {
    p = ActiveInactiveClassifier_7.N7d5d85170(i);
    }
    return p;
  }
  static double N7d5d85170(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= -0.041065) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > -0.041065) {
      p = 0;
    }
    return p;
  }
  static double N86edfe171(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.0031299) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 0.0031299) {
      p = 1;
    }
    return p;
  }
  static double N72dcb6172(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 0.29607) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() > 0.29607) {
    p = ActiveInactiveClassifier_7.Nf86a67173(i);
    }
    return p;
  }
  static double Nf86a67173(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 2.1871) {
    p = ActiveInactiveClassifier_7.N11192bd174(i);
    } else if (((Double) i[13]).doubleValue() > 2.1871) {
      p = 1;
    }
    return p;
  }
  static double N11192bd174(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.53418) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 0.53418) {
      p = 1;
    }
    return p;
  }
}

class ActiveInactiveClassifier_8 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ActiveInactiveClassifier_8.Nb8dfdf175(i);
    return p;
  }
  static double Nb8dfdf175(Object[]i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 0.89729) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() > 0.89729) {
    p = ActiveInactiveClassifier_8.N171d6fa176(i);
    }
    return p;
  }
  static double N171d6fa176(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 329.32) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 329.32) {
    p = ActiveInactiveClassifier_8.Nd8e0dc177(i);
    }
    return p;
  }
  static double Nd8e0dc177(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 0.77372) {
    p = ActiveInactiveClassifier_8.N92900d178(i);
    } else if (((Double) i[9]).doubleValue() > 0.77372) {
      p = 0;
    }
    return p;
  }
  static double N92900d178(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -8.1924) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -8.1924) {
    p = ActiveInactiveClassifier_8.N2f71e2179(i);
    }
    return p;
  }
  static double N2f71e2179(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.65966) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.65966) {
    p = ActiveInactiveClassifier_8.Nddc524180(i);
    }
    return p;
  }
  static double Nddc524180(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.63148) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.63148) {
    p = ActiveInactiveClassifier_8.N1b9fd80181(i);
    }
    return p;
  }
  static double N1b9fd80181(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 1.3188) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() > 1.3188) {
    p = ActiveInactiveClassifier_8.N1b21ae2182(i);
    }
    return p;
  }
  static double N1b21ae2182(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 24772.0) {
    p = ActiveInactiveClassifier_8.N2ee59183(i);
    } else if (((Double) i[18]).doubleValue() > 24772.0) {
      p = 1;
    }
    return p;
  }
  static double N2ee59183(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 7.2061) {
    p = ActiveInactiveClassifier_8.N6e4e82184(i);
    } else if (((Double) i[11]).doubleValue() > 7.2061) {
    p = ActiveInactiveClassifier_8.N1187f5b192(i);
    }
    return p;
  }
  static double N6e4e82184(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() <= 6.5559) {
    p = ActiveInactiveClassifier_8.N1e4620e185(i);
    } else if (((Double) i[21]).doubleValue() > 6.5559) {
      p = 1;
    }
    return p;
  }
  static double N1e4620e185(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= -0.52135) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > -0.52135) {
    p = ActiveInactiveClassifier_8.Ne1c3a7186(i);
    }
    return p;
  }
  static double Ne1c3a7186(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 0.0020107) {
    p = ActiveInactiveClassifier_8.N1f40964187(i);
    } else if (((Double) i[22]).doubleValue() > 0.0020107) {
    p = ActiveInactiveClassifier_8.N94b886188(i);
    }
    return p;
  }
  static double N1f40964187(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 0.020876) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 0.020876) {
      p = 1;
    }
    return p;
  }
  static double N94b886188(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.065898) {
    p = ActiveInactiveClassifier_8.N1dea342189(i);
    } else if (((Double) i[22]).doubleValue() > 0.065898) {
      p = 1;
    }
    return p;
  }
  static double N1dea342189(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.019733) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.019733) {
    p = ActiveInactiveClassifier_8.N1b07961190(i);
    }
    return p;
  }
  static double N1b07961190(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.97289) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.97289) {
    p = ActiveInactiveClassifier_8.Nf1036f191(i);
    }
    return p;
  }
  static double Nf1036f191(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.99278) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.99278) {
      p = 1;
    }
    return p;
  }
  static double N1187f5b192(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.0031299) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 0.0031299) {
      p = 1;
    }
    return p;
  }
}

class ActiveInactiveClassifier_9 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = ActiveInactiveClassifier_9.N15155e1193(i);
    return p;
  }
  static double N15155e1193(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.78716) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.78716) {
    p = ActiveInactiveClassifier_9.Ndd421f194(i);
    }
    return p;
  }
  static double Ndd421f194(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 0.48729) {
    p = ActiveInactiveClassifier_9.N203a16195(i);
    } else if (((Double) i[16]).doubleValue() > 0.48729) {
    p = ActiveInactiveClassifier_9.N1e7e7e8197(i);
    }
    return p;
  }
  static double N203a16195(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() <= 4.9237) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() > 4.9237) {
    p = ActiveInactiveClassifier_9.N1c57a6a196(i);
    }
    return p;
  }
  static double N1c57a6a196(Object[]i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() <= 0.99606) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() > 0.99606) {
      p = 0;
    }
    return p;
  }
  static double N1e7e7e8197(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.77372) {
    p = ActiveInactiveClassifier_9.N2a5e75198(i);
    } else if (((Double) i[9]).doubleValue() > 0.77372) {
      p = 0;
    }
    return p;
  }
  static double N2a5e75198(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 0;
    } else if (((Double) i[19]).doubleValue() <= -0.1766) {
    p = ActiveInactiveClassifier_9.N19f5783199(i);
    } else if (((Double) i[19]).doubleValue() > -0.1766) {
    p = ActiveInactiveClassifier_9.N2a648c200(i);
    }
    return p;
  }
  static double N19f5783199(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.024395) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() > 0.024395) {
      p = 1;
    }
    return p;
  }
  static double N2a648c200(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() <= 1.021) {
    p = ActiveInactiveClassifier_9.N12f2b9e201(i);
    } else if (((Double) i[13]).doubleValue() > 1.021) {
    p = ActiveInactiveClassifier_9.N1d8baaf202(i);
    }
    return p;
  }
  static double N12f2b9e201(Object[]i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 3.1547) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() > 3.1547) {
      p = 1;
    }
    return p;
  }
  static double N1d8baaf202(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 3.1024) {
    p = ActiveInactiveClassifier_9.N1c84885203(i);
    } else if (((Double) i[4]).doubleValue() > 3.1024) {
    p = ActiveInactiveClassifier_9.N11e8e72210(i);
    }
    return p;
  }
  static double N1c84885203(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 16122.0) {
    p = ActiveInactiveClassifier_9.N112202204(i);
    } else if (((Double) i[10]).doubleValue() > 16122.0) {
    p = ActiveInactiveClassifier_9.N16d36a5209(i);
    }
    return p;
  }
  static double N112202204(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 3140.9) {
    p = ActiveInactiveClassifier_9.Ncfefe9205(i);
    } else if (((Double) i[18]).doubleValue() > 3140.9) {
    p = ActiveInactiveClassifier_9.N18fe8fc206(i);
    }
    return p;
  }
  static double Ncfefe9205(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.0024514) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.0024514) {
      p = 1;
    }
    return p;
  }
  static double N18fe8fc206(Object[]i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() <= 0.9879) {
    p = ActiveInactiveClassifier_9.N1092e88207(i);
    } else if (((Double) i[15]).doubleValue() > 0.9879) {
      p = 1;
    }
    return p;
  }
  static double N1092e88207(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.018029) {
    p = ActiveInactiveClassifier_9.N1ce1791208(i);
    } else if (((Double) i[22]).doubleValue() > 0.018029) {
      p = 1;
    }
    return p;
  }
  static double N1ce1791208(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 1.261) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() > 1.261) {
      p = 0;
    }
    return p;
  }
  static double N16d36a5209(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.0801) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 3.0801) {
      p = 0;
    }
    return p;
  }
  static double N11e8e72210(Object[]i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() <= 0.98496) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() > 0.98496) {
      p = 0;
    }
    return p;
  }
}
