package com.deakin.robustgsensing.groupsense.atomicclassifier;

class InactiveClassifier {

  public static double classify(Object[] i) throws Exception {
    double [] sums = new double [2];
    sums[(int) InactiveClassifier_0.classify(i)] += 5.29162837839724;
    sums[(int) InactiveClassifier_1.classify(i)] += 4.122880869487043;
    sums[(int) InactiveClassifier_2.classify(i)] += 4.807896184135867;
    sums[(int) InactiveClassifier_3.classify(i)] += 4.444827535912906;
    sums[(int) InactiveClassifier_4.classify(i)] += 6.234628566912994;
    sums[(int) InactiveClassifier_5.classify(i)] += 6.681400054021867;
    sums[(int) InactiveClassifier_6.classify(i)] += 4.755771492064837;
    sums[(int) InactiveClassifier_7.classify(i)] += 4.692499943712663;
    sums[(int) InactiveClassifier_8.classify(i)] += 4.341492673400783;
    sums[(int) InactiveClassifier_9.classify(i)] += 4.5549563935013175;
    double maxV = sums[0];
    int maxI = 0;
    for (int j = 1; j < 2; j++) {
      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
    }
    return (double) maxI;
  }
}

class InactiveClassifier_0 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_0.N1518f00716(i);
    return p;
  }
  static double N1518f00716(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 7.3236) {
    p = InactiveClassifier_0.N18377d6717(i);
    } else if (((Double) i[21]).doubleValue() > 7.3236) {
      p = 0;
    } 
    return p;
  }
  static double N18377d6717(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.25567) {
    p = InactiveClassifier_0.N30a748718(i);
    } else if (((Double) i[6]).doubleValue() > 0.25567) {
      p = 0;
    } 
    return p;
  }
  static double N30a748718(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 2070.5) {
    p = InactiveClassifier_0.N366c2b719(i);
    } else if (((Double) i[18]).doubleValue() > 2070.5) {
    p = InactiveClassifier_0.N4a6a1c721(i);
    } 
    return p;
  }
  static double N366c2b719(Object[]i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 4.7124) {
    p = InactiveClassifier_0.Nf794ce720(i);
    } else if (((Double) i[5]).doubleValue() > 4.7124) {
      p = 1;
    } 
    return p;
  }
  static double Nf794ce720(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 7.5498) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 7.5498) {
      p = 1;
    } 
    return p;
  }
  static double N4a6a1c721(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() <= 14.955) {
    p = InactiveClassifier_0.N17c7330722(i);
    } else if (((Double) i[16]).doubleValue() > 14.955) {
    p = InactiveClassifier_0.N5a3fa0727(i);
    } 
    return p;
  }
  static double N17c7330722(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.054784) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 0.054784) {
    p = InactiveClassifier_0.N16e71cc723(i);
    } 
    return p;
  }
  static double N16e71cc723(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.996) {
    p = InactiveClassifier_0.N1f1151f724(i);
    } else if (((Double) i[23]).doubleValue() > 0.996) {
      p = 0;
    } 
    return p;
  }
  static double N1f1151f724(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.85229) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -0.85229) {
    p = InactiveClassifier_0.Na1b7a1725(i);
    } 
    return p;
  }
  static double Na1b7a1725(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 3.8628) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() > 3.8628) {
    p = InactiveClassifier_0.N11ed983726(i);
    } 
    return p;
  }
  static double N11ed983726(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 9368.3) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 9368.3) {
      p = 0;
    } 
    return p;
  }
  static double N5a3fa0727(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.0098722) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 0.0098722) {
      p = 1;
    } 
    return p;
  }
}

class InactiveClassifier_1 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_1.N1072ac9728(i);
    return p;
  }
  static double N1072ac9728(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.99173) {
    p = InactiveClassifier_1.N18a24e9729(i);
    } else if (((Double) i[23]).doubleValue() > 0.99173) {
    p = InactiveClassifier_1.Nb6c1e9732(i);
    } 
    return p;
  }
  static double N18a24e9729(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 0.016307) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() > 0.016307) {
    p = InactiveClassifier_1.N7d7427730(i);
    } 
    return p;
  }
  static double N7d7427730(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.99215) {
    p = InactiveClassifier_1.N54ca71731(i);
    } else if (((Double) i[7]).doubleValue() > 0.99215) {
      p = 1;
    } 
    return p;
  }
  static double N54ca71731(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.98466) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.98466) {
      p = 0;
    } 
    return p;
  }
  static double Nb6c1e9732(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 10.623) {
    p = InactiveClassifier_1.N74ae84733(i);
    } else if (((Double) i[3]).doubleValue() > 10.623) {
      p = 1;
    } 
    return p;
  }
  static double N74ae84733(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 1.8193) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() > 1.8193) {
    p = InactiveClassifier_1.N6d75fd734(i);
    } 
    return p;
  }
  static double N6d75fd734(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 6439.0) {
    p = InactiveClassifier_1.N5d3a64735(i);
    } else if (((Double) i[2]).doubleValue() > 6439.0) {
    p = InactiveClassifier_1.N1cb0e86737(i);
    } 
    return p;
  }
  static double N5d3a64735(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 3.0764E-4) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 3.0764E-4) {
    p = InactiveClassifier_1.Na487bb736(i);
    } 
    return p;
  }
  static double Na487bb736(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 4.4484) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 4.4484) {
      p = 0;
    } 
    return p;
  }
  static double N1cb0e86737(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 11.011) {
    p = InactiveClassifier_1.N2690bf738(i);
    } else if (((Double) i[19]).doubleValue() > 11.011) {
      p = 0;
    } 
    return p;
  }
  static double N2690bf738(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 9269.3) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 9269.3) {
      p = 0;
    } 
    return p;
  }
}

class InactiveClassifier_2 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_2.N1e8f902739(i);
    return p;
  }
  static double N1e8f902739(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 10.291) {
    p = InactiveClassifier_2.N34206b740(i);
    } else if (((Double) i[3]).doubleValue() > 10.291) {
      p = 1;
    } 
    return p;
  }
  static double N34206b740(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 0.0063284) {
    p = InactiveClassifier_2.N3c78e9741(i);
    } else if (((Double) i[4]).doubleValue() > 0.0063284) {
    p = InactiveClassifier_2.N1f608cc746(i);
    } 
    return p;
  }
  static double N3c78e9741(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 7749.2) {
    p = InactiveClassifier_2.N2629f1742(i);
    } else if (((Double) i[10]).doubleValue() > 7749.2) {
    p = InactiveClassifier_2.N1979163744(i);
    } 
    return p;
  }
  static double N2629f1742(Object[]i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 3.8382) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 3.8382) {
    p = InactiveClassifier_2.N18baf24743(i);
    } 
    return p;
  }
  static double N18baf24743(Object[]i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= -0.0081882) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() > -0.0081882) {
      p = 0;
    } 
    return p;
  }
  static double N1979163744(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 2085.9) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() > 2085.9) {
    p = InactiveClassifier_2.N1ca04a1745(i);
    } 
    return p;
  }
  static double N1ca04a1745(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 3.6874) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 3.6874) {
      p = 0;
    } 
    return p;
  }
  static double N1f608cc746(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 7.3236) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 7.3236) {
      p = 0;
    } 
    return p;
  }
}

class InactiveClassifier_3 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_3.N1bb8b1c747(i);
    return p;
  }
  static double N1bb8b1c747(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.013399) {
    p = InactiveClassifier_3.N1a9e24f748(i);
    } else if (((Double) i[14]).doubleValue() > 0.013399) {
      p = 1;
    } 
    return p;
  }
  static double N1a9e24f748(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -5.3646) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -5.3646) {
    p = InactiveClassifier_3.N48ba9e749(i);
    } 
    return p;
  }
  static double N48ba9e749(Object[]i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 10.623) {
    p = InactiveClassifier_3.Nd417bd750(i);
    } else if (((Double) i[3]).doubleValue() > 10.623) {
      p = 1;
    } 
    return p;
  }
  static double Nd417bd750(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 97.931) {
    p = InactiveClassifier_3.N628a21751(i);
    } else if (((Double) i[2]).doubleValue() > 97.931) {
    p = InactiveClassifier_3.N15a9f9a752(i);
    } 
    return p;
  }
  static double N628a21751(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 4.162) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 4.162) {
      p = 0;
    } 
    return p;
  }
  static double N15a9f9a752(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 7.0325E-4) {
    p = InactiveClassifier_3.Na44891753(i);
    } else if (((Double) i[22]).doubleValue() > 7.0325E-4) {
    p = InactiveClassifier_3.N1984acb754(i);
    } 
    return p;
  }
  static double Na44891753(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.99623) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() > 0.99623) {
      p = 0;
    } 
    return p;
  }
  static double N1984acb754(Object[]i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 2.544) {
    p = InactiveClassifier_3.N15695d8755(i);
    } else if (((Double) i[5]).doubleValue() > 2.544) {
    p = InactiveClassifier_3.N187a4e7756(i);
    } 
    return p;
  }
  static double N15695d8755(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.99537) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() > 0.99537) {
      p = 0;
    } 
    return p;
  }
  static double N187a4e7756(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.04384) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -0.04384) {
    p = InactiveClassifier_3.N5b3b80757(i);
    } 
    return p;
  }
  static double N5b3b80757(Object[]i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 1;
    } else if (((Double) i[12]).doubleValue() <= -0.086181) {
      p = 1;
    } else if (((Double) i[12]).doubleValue() > -0.086181) {
      p = 0;
    } 
    return p;
  }
}

class InactiveClassifier_4 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_4.N19f707b758(i);
    return p;
  }
  static double N19f707b758(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 7.3236) {
    p = InactiveClassifier_4.N91c82e759(i);
    } else if (((Double) i[21]).doubleValue() > 7.3236) {
      p = 0;
    } 
    return p;
  }
  static double N91c82e759(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.34024) {
    p = InactiveClassifier_4.Ned56c3760(i);
    } else if (((Double) i[6]).doubleValue() > 0.34024) {
      p = 0;
    } 
    return p;
  }
  static double Ned56c3760(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 2070.5) {
    p = InactiveClassifier_4.N1db4ce5761(i);
    } else if (((Double) i[18]).doubleValue() > 2070.5) {
    p = InactiveClassifier_4.Na8d6b3764(i);
    } 
    return p;
  }
  static double N1db4ce5761(Object[]i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 4.7124) {
    p = InactiveClassifier_4.N9566ee762(i);
    } else if (((Double) i[5]).doubleValue() > 4.7124) {
      p = 1;
    } 
    return p;
  }
  static double N9566ee762(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.13118) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.13118) {
    p = InactiveClassifier_4.N98c7df763(i);
    } 
    return p;
  }
  static double N98c7df763(Object[]i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= 1.0443) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() > 1.0443) {
      p = 0;
    } 
    return p;
  }
  static double Na8d6b3764(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 0.017462) {
    p = InactiveClassifier_4.Na79dce765(i);
    } else if (((Double) i[22]).doubleValue() > 0.017462) {
    p = InactiveClassifier_4.N1646e98768(i);
    } 
    return p;
  }
  static double Na79dce765(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 3.7896) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 3.7896) {
    p = InactiveClassifier_4.N6942cb766(i);
    } 
    return p;
  }
  static double N6942cb766(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 9498.7) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 9498.7) {
    p = InactiveClassifier_4.Na051f4767(i);
    } 
    return p;
  }
  static double Na051f4767(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= -0.92709) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > -0.92709) {
      p = 0;
    } 
    return p;
  }
  static double N1646e98768(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.99062) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.99062) {
      p = 1;
    } 
    return p;
  }
}

class InactiveClassifier_5 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_5.N98e8f4769(i);
    return p;
  }
  static double N98e8f4769(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.99584) {
    p = InactiveClassifier_5.Ne60626770(i);
    } else if (((Double) i[23]).doubleValue() > 0.99584) {
    p = InactiveClassifier_5.N3f0309780(i);
    } 
    return p;
  }
  static double Ne60626770(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 0.027768) {
    p = InactiveClassifier_5.N19dbab0771(i);
    } else if (((Double) i[22]).doubleValue() > 0.027768) {
    p = InactiveClassifier_5.N11b6fa6779(i);
    } 
    return p;
  }
  static double N19dbab0771(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 2070.5) {
    p = InactiveClassifier_5.N4b8f2f772(i);
    } else if (((Double) i[18]).doubleValue() > 2070.5) {
    p = InactiveClassifier_5.Na556cf773(i);
    } 
    return p;
  }
  static double N4b8f2f772(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.0060131) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() > 0.0060131) {
      p = 1;
    } 
    return p;
  }
  static double Na556cf773(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.97776) {
    p = InactiveClassifier_5.Ne6619b774(i);
    } else if (((Double) i[9]).doubleValue() > -0.97776) {
    p = InactiveClassifier_5.N1120aa6775(i);
    } 
    return p;
  }
  static double Ne6619b774(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= -0.80382) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > -0.80382) {
      p = 0;
    } 
    return p;
  }
  static double N1120aa6775(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 3.874) {
    p = InactiveClassifier_5.N1795976776(i);
    } else if (((Double) i[19]).doubleValue() > 3.874) {
    p = InactiveClassifier_5.N206e16778(i);
    } 
    return p;
  }
  static double N1795976776(Object[]i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= 1.5338) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() > 1.5338) {
    p = InactiveClassifier_5.N1e09048777(i);
    } 
    return p;
  }
  static double N1e09048777(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.047041) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 0.047041) {
      p = 0;
    } 
    return p;
  }
  static double N206e16778(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 9368.3) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 9368.3) {
      p = 0;
    } 
    return p;
  }
  static double N11b6fa6779(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.99409) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.99409) {
      p = 1;
    } 
    return p;
  }
  static double N3f0309780(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.043162) {
    p = InactiveClassifier_5.Ne06e0e781(i);
    } else if (((Double) i[14]).doubleValue() > 0.043162) {
      p = 1;
    } 
    return p;
  }
  static double Ne06e0e781(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.6216) {
    p = InactiveClassifier_5.N596d12782(i);
    } else if (((Double) i[11]).doubleValue() > 0.6216) {
    p = InactiveClassifier_5.N107e60e783(i);
    } 
    return p;
  }
  static double N596d12782(Object[]i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= 0.67075) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() > 0.67075) {
      p = 0;
    } 
    return p;
  }
  static double N107e60e783(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.0038138) {
    p = InactiveClassifier_5.N190cdc5784(i);
    } else if (((Double) i[6]).doubleValue() > 0.0038138) {
      p = 0;
    } 
    return p;
  }
  static double N190cdc5784(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 2.7441E-4) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() > 2.7441E-4) {
      p = 0;
    } 
    return p;
  }
}

class InactiveClassifier_6 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_6.N1b56537785(i);
    return p;
  }
  static double N1b56537785(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 2.7289E-4) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 2.7289E-4) {
    p = InactiveClassifier_6.N8393a786(i);
    } 
    return p;
  }
  static double N8393a786(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 19659.0) {
    p = InactiveClassifier_6.N1e513fb787(i);
    } else if (((Double) i[18]).doubleValue() > 19659.0) {
    p = InactiveClassifier_6.N1b155b7797(i);
    } 
    return p;
  }
  static double N1e513fb787(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 11.011) {
    p = InactiveClassifier_6.N82d51f788(i);
    } else if (((Double) i[19]).doubleValue() > 11.011) {
      p = 0;
    } 
    return p;
  }
  static double N82d51f788(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() <= 9.7031) {
    p = InactiveClassifier_6.N1760a63789(i);
    } else if (((Double) i[16]).doubleValue() > 9.7031) {
    p = InactiveClassifier_6.N18735f1795(i);
    } 
    return p;
  }
  static double N1760a63789(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.30278) {
    p = InactiveClassifier_6.Na40607790(i);
    } else if (((Double) i[4]).doubleValue() > -0.30278) {
    p = InactiveClassifier_6.N1494723793(i);
    } 
    return p;
  }
  static double Na40607790(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 2.4396) {
    p = InactiveClassifier_6.N87c962791(i);
    } else if (((Double) i[8]).doubleValue() > 2.4396) {
      p = 1;
    } 
    return p;
  }
  static double N87c962791(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.91786) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.91786) {
    p = InactiveClassifier_6.Nb66f5d792(i);
    } 
    return p;
  }
  static double Nb66f5d792(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.082605) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 0.082605) {
      p = 0;
    } 
    return p;
  }
  static double N1494723793(Object[]i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= 0.12497) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() > 0.12497) {
    p = InactiveClassifier_6.N1dd4b7d794(i);
    } 
    return p;
  }
  static double N1dd4b7d794(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 0.030084) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() > 0.030084) {
      p = 0;
    } 
    return p;
  }
  static double N18735f1795(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.99026) {
    p = InactiveClassifier_6.N1e69e85796(i);
    } else if (((Double) i[7]).doubleValue() > 0.99026) {
      p = 1;
    } 
    return p;
  }
  static double N1e69e85796(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 0.43043) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > 0.43043) {
      p = 0;
    } 
    return p;
  }
  static double N1b155b7797(Object[]i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 4.0513) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 4.0513) {
      p = 0;
    } 
    return p;
  }
}

class InactiveClassifier_7 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_7.N1729275798(i);
    return p;
  }
  static double N1729275798(Object[]i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 6.5101) {
    p = InactiveClassifier_7.Ned7a89799(i);
    } else if (((Double) i[5]).doubleValue() > 6.5101) {
      p = 1;
    } 
    return p;
  }
  static double Ned7a89799(Object[]i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 5535.9) {
    p = InactiveClassifier_7.N107ed29800(i);
    } else if (((Double) i[10]).doubleValue() > 5535.9) {
    p = InactiveClassifier_7.N16358b8801(i);
    } 
    return p;
  }
  static double N107ed29800(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 8.8876) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 8.8876) {
      p = 0;
    } 
    return p;
  }
  static double N16358b8801(Object[]i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= -0.094671) {
    p = InactiveClassifier_7.N155b88b802(i);
    } else if (((Double) i[20]).doubleValue() > -0.094671) {
    p = InactiveClassifier_7.N3f4c24804(i);
    } 
    return p;
  }
  static double N155b88b802(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.15042) {
    p = InactiveClassifier_7.Nc6b797803(i);
    } else if (((Double) i[1]).doubleValue() > 0.15042) {
      p = 1;
    } 
    return p;
  }
  static double Nc6b797803(Object[]i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() <= 4.5049) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() > 4.5049) {
      p = 1;
    } 
    return p;
  }
  static double N3f4c24804(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 1.9809) {
    p = InactiveClassifier_7.N19fdae5805(i);
    } else if (((Double) i[11]).doubleValue() > 1.9809) {
    p = InactiveClassifier_7.N15b2028807(i);
    } 
    return p;
  }
  static double N19fdae5805(Object[]i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 0;
    } else if (((Double) i[23]).doubleValue() <= 0.99214) {
    p = InactiveClassifier_7.N1dbfb7a806(i);
    } else if (((Double) i[23]).doubleValue() > 0.99214) {
      p = 0;
    } 
    return p;
  }
  static double N1dbfb7a806(Object[]i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 0.30381) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > 0.30381) {
      p = 0;
    } 
    return p;
  }
  static double N15b2028807(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 2.844E-4) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 2.844E-4) {
    p = InactiveClassifier_7.N19c5407808(i);
    } 
    return p;
  }
  static double N19c5407808(Object[]i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.84077) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -0.84077) {
      p = 1;
    } 
    return p;
  }
}

class InactiveClassifier_8 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_8.N50aadb809(i);
    return p;
  }
  static double N50aadb809(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 11.011) {
    p = InactiveClassifier_8.N12dc6810(i);
    } else if (((Double) i[19]).doubleValue() > 11.011) {
      p = 0;
    } 
    return p;
  }
  static double N12dc6810(Object[]i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.5454E-4) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 2.5454E-4) {
    p = InactiveClassifier_8.N164253e811(i);
    } 
    return p;
  }
  static double N164253e811(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.018146) {
    p = InactiveClassifier_8.N1c925db812(i);
    } else if (((Double) i[8]).doubleValue() > 0.018146) {
    p = InactiveClassifier_8.Nd454f5813(i);
    } 
    return p;
  }
  static double N1c925db812(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.99648) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.99648) {
      p = 1;
    } 
    return p;
  }
  static double Nd454f5813(Object[]i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() <= 7.6618) {
    p = InactiveClassifier_8.N15d176814(i);
    } else if (((Double) i[16]).doubleValue() > 7.6618) {
    p = InactiveClassifier_8.N1daf304816(i);
    } 
    return p;
  }
  static double N15d176814(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 0.087767) {
    p = InactiveClassifier_8.N6abdec815(i);
    } else if (((Double) i[8]).doubleValue() > 0.087767) {
      p = 1;
    } 
    return p;
  }
  static double N6abdec815(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 428.33) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 428.33) {
      p = 1;
    } 
    return p;
  }
  static double N1daf304816(Object[]i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.01013) {
    p = InactiveClassifier_8.N188c3f4817(i);
    } else if (((Double) i[14]).doubleValue() > 0.01013) {
      p = 1;
    } 
    return p;
  }
  static double N188c3f4817(Object[]i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 0.016442) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() > 0.016442) {
      p = 0;
    } 
    return p;
  }
}

class InactiveClassifier_9 {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = InactiveClassifier_9.N1f8e9c8818(i);
    return p;
  }
  static double N1f8e9c8818(Object[]i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.30278) {
    p = InactiveClassifier_9.Nbc8807819(i);
    } else if (((Double) i[4]).doubleValue() > -0.30278) {
    p = InactiveClassifier_9.N250a51822(i);
    } 
    return p;
  }
  static double Nbc8807819(Object[]i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.98342) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.98342) {
    p = InactiveClassifier_9.N186a6d2820(i);
    } 
    return p;
  }
  static double N186a6d2820(Object[]i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 5.2672) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 5.2672) {
    p = InactiveClassifier_9.N1324072821(i);
    } 
    return p;
  }
  static double N1324072821(Object[]i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 6.6106) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 6.6106) {
      p = 0;
    } 
    return p;
  }
  static double N250a51822(Object[]i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 11.011) {
    p = InactiveClassifier_9.N1c84be9823(i);
    } else if (((Double) i[19]).doubleValue() > 11.011) {
      p = 0;
    } 
    return p;
  }
  static double N1c84be9823(Object[]i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= 1.7665) {
    p = InactiveClassifier_9.Nefef89824(i);
    } else if (((Double) i[20]).doubleValue() > 1.7665) {
      p = 0;
    } 
    return p;
  }
  static double Nefef89824(Object[]i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.52249) {
    p = InactiveClassifier_9.N57278c825(i);
    } else if (((Double) i[1]).doubleValue() > -0.52249) {
    p = InactiveClassifier_9.N1e57a5a826(i);
    } 
    return p;
  }
  static double N57278c825(Object[]i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 2120.3) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() > 2120.3) {
      p = 1;
    } 
    return p;
  }
  static double N1e57a5a826(Object[]i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= 0.088097) {
    p = InactiveClassifier_9.Nc3e000827(i);
    } else if (((Double) i[17]).doubleValue() > 0.088097) {
      p = 1;
    } 
    return p;
  }
  static double Nc3e000827(Object[]i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 30.32) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 30.32) {
    p = InactiveClassifier_9.N1a72585828(i);
    } 
    return p;
  }
  static double N1a72585828(Object[]i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= -0.72349) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() > -0.72349) {
      p = 1;
    } 
    return p;
  }
}
