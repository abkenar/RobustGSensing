package Classifier;


public class TableTennisPaceClassifier {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = TableTennisPaceClassifier.N788b4a6a0(i);
    return p;
  }
  static double N788b4a6a0(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 37.85319880794971) {
    p = TableTennisPaceClassifier.N367269161(i);
    } else if (((Double) i[8]).doubleValue() > 37.85319880794971) {
    p = TableTennisPaceClassifier.N5225e176196(i);
    } 
    return p;
  }
  static double N367269161(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 16.32528260952114) {
    p = TableTennisPaceClassifier.N4223c5402(i);
    } else if (((Double) i[19]).doubleValue() > 16.32528260952114) {
    p = TableTennisPaceClassifier.N4e2ef328165(i);
    } 
    return p;
  }
  static double N4223c5402(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 11.9176517685) {
    p = TableTennisPaceClassifier.N23d03c553(i);
    } else if (((Double) i[13]).doubleValue() > 11.9176517685) {
    p = TableTennisPaceClassifier.N11143214157(i);
    } 
    return p;
  }
  static double N23d03c553(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 6855.238760525514) {
    p = TableTennisPaceClassifier.N1aaea5f4(i);
    } else if (((Double) i[10]).doubleValue() > 6855.238760525514) {
    p = TableTennisPaceClassifier.N442f2a7f59(i);
    } 
    return p;
  }
  static double N1aaea5f4(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 0.8441720388000004) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 0.8441720388000004) {
    p = TableTennisPaceClassifier.N243509a55(i);
    } 
    return p;
  }
  static double N243509a55(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 3.619881830882632E-4) {
    p = TableTennisPaceClassifier.N7860d1a66(i);
    } else if (((Double) i[14]).doubleValue() > 3.619881830882632E-4) {
    p = TableTennisPaceClassifier.N5a70686b7(i);
    } 
    return p;
  }
  static double N7860d1a66(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() <= 3.769645869137204E-4) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() > 3.769645869137204E-4) {
      p = 1;
    } 
    return p;
  }
  static double N5a70686b7(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.05809378348541738) {
    p = TableTennisPaceClassifier.Ncde99688(i);
    } else if (((Double) i[22]).doubleValue() > 0.05809378348541738) {
    p = TableTennisPaceClassifier.N75ba52d057(i);
    } 
    return p;
  }
  static double Ncde99688(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 0.13561781133987186) {
    p = TableTennisPaceClassifier.Naad1779(i);
    } else if (((Double) i[0]).doubleValue() > 0.13561781133987186) {
    p = TableTennisPaceClassifier.N39296ee214(i);
    } 
    return p;
  }
  static double Naad1779(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 5106.468875898262) {
    p = TableTennisPaceClassifier.N7eb9cd2510(i);
    } else if (((Double) i[18]).doubleValue() > 5106.468875898262) {
    p = TableTennisPaceClassifier.N9494a0b13(i);
    } 
    return p;
  }
  static double N7eb9cd2510(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 8.203076174582169E-5) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 8.203076174582169E-5) {
    p = TableTennisPaceClassifier.N27d3c1a911(i);
    } 
    return p;
  }
  static double N27d3c1a911(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 1271.7721829890882) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() > 1271.7721829890882) {
    p = TableTennisPaceClassifier.N5fbe09e212(i);
    } 
    return p;
  }
  static double N5fbe09e212(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= -0.13008094503921014) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() > -0.13008094503921014) {
      p = 0;
    } 
    return p;
  }
  static double N9494a0b13(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 8.058613821913058E-4) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() > 8.058613821913058E-4) {
      p = 0;
    } 
    return p;
  }
  static double N39296ee214(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 0;
    } else if (((Double) i[19]).doubleValue() <= 3.212785286986908) {
    p = TableTennisPaceClassifier.N4e3ee715(i);
    } else if (((Double) i[19]).doubleValue() > 3.212785286986908) {
    p = TableTennisPaceClassifier.N7eb3967855(i);
    } 
    return p;
  }
  static double N4e3ee715(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 1382.3607490124045) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() > 1382.3607490124045) {
    p = TableTennisPaceClassifier.N2f10c61516(i);
    } 
    return p;
  }
  static double N2f10c61516(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 5260.969594193509) {
    p = TableTennisPaceClassifier.N6ccac8ee17(i);
    } else if (((Double) i[10]).doubleValue() > 5260.969594193509) {
    p = TableTennisPaceClassifier.N6fe0c30f48(i);
    } 
    return p;
  }
  static double N6ccac8ee17(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.9751297314405243) {
    p = TableTennisPaceClassifier.N1ee6f5eb18(i);
    } else if (((Double) i[7]).doubleValue() > 0.9751297314405243) {
    p = TableTennisPaceClassifier.N6fae59d619(i);
    } 
    return p;
  }
  static double N1ee6f5eb18(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 14.993884980211615) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 14.993884980211615) {
      p = 0;
    } 
    return p;
  }
  static double N6fae59d619(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() <= 0.7812869562735766) {
    p = TableTennisPaceClassifier.N46271a5820(i);
    } else if (((Double) i[9]).doubleValue() > 0.7812869562735766) {
    p = TableTennisPaceClassifier.N1709bb746(i);
    } 
    return p;
  }
  static double N46271a5820(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 2;
    } else if (((Double) i[6]).doubleValue() <= 0.009687366706759641) {
    p = TableTennisPaceClassifier.N7c1037ca21(i);
    } else if (((Double) i[6]).doubleValue() > 0.009687366706759641) {
      p = 0;
    } 
    return p;
  }
  static double N7c1037ca21(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 1864.783701886923) {
    p = TableTennisPaceClassifier.N55f0dc0e22(i);
    } else if (((Double) i[10]).doubleValue() > 1864.783701886923) {
    p = TableTennisPaceClassifier.N3f8e16ce28(i);
    } 
    return p;
  }
  static double N55f0dc0e22(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.2855612125817336) {
    p = TableTennisPaceClassifier.N488d4f8f23(i);
    } else if (((Double) i[9]).doubleValue() > -0.2855612125817336) {
    p = TableTennisPaceClassifier.N3686791c24(i);
    } 
    return p;
  }
  static double N488d4f8f23(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 0.8755266581199086) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 0.8755266581199086) {
      p = 0;
    } 
    return p;
  }
  static double N3686791c24(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 0.9750984250000001) {
    p = TableTennisPaceClassifier.N4bd5b66125(i);
    } else if (((Double) i[21]).doubleValue() > 0.9750984250000001) {
    p = TableTennisPaceClassifier.N189613b926(i);
    } 
    return p;
  }
  static double N4bd5b66125(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 0.7601546918970097) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 0.7601546918970097) {
      p = 0;
    } 
    return p;
  }
  static double N189613b926(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.08048576435847792) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.08048576435847792) {
    p = TableTennisPaceClassifier.N3ac5c61327(i);
    } 
    return p;
  }
  static double N3ac5c61327(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 2;
    } else if (((Double) i[17]).doubleValue() <= 0.041901000266044514) {
      p = 2;
    } else if (((Double) i[17]).doubleValue() > 0.041901000266044514) {
      p = 0;
    } 
    return p;
  }
  static double N3f8e16ce28(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() <= 0.47228659914415194) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() > 0.47228659914415194) {
    p = TableTennisPaceClassifier.N598ec9e029(i);
    } 
    return p;
  }
  static double N598ec9e029(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 2;
    } else if (((Double) i[11]).doubleValue() <= 6.287026964368375) {
      p = 2;
    } else if (((Double) i[11]).doubleValue() > 6.287026964368375) {
    p = TableTennisPaceClassifier.N71ad12b330(i);
    } 
    return p;
  }
  static double N71ad12b330(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 0;
    } else if (((Double) i[12]).doubleValue() <= -1.5569123763944162) {
    p = TableTennisPaceClassifier.N654cb7cb31(i);
    } else if (((Double) i[12]).doubleValue() > -1.5569123763944162) {
    p = TableTennisPaceClassifier.N2a3be5ca32(i);
    } 
    return p;
  }
  static double N654cb7cb31(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 0.8366752121166515) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 0.8366752121166515) {
      p = 1;
    } 
    return p;
  }
  static double N2a3be5ca32(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 0.004586213235954184) {
    p = TableTennisPaceClassifier.N5d5e8a433(i);
    } else if (((Double) i[14]).doubleValue() > 0.004586213235954184) {
    p = TableTennisPaceClassifier.N1cf45a2734(i);
    } 
    return p;
  }
  static double N5d5e8a433(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= -0.6607456033087915) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() > -0.6607456033087915) {
      p = 2;
    } 
    return p;
  }
  static double N1cf45a2734(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() <= 0.7354878927883354) {
    p = TableTennisPaceClassifier.N1c06449d35(i);
    } else if (((Double) i[16]).doubleValue() > 0.7354878927883354) {
    p = TableTennisPaceClassifier.N43dca23237(i);
    } 
    return p;
  }
  static double N1c06449d35(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 0.4684551474124777) {
    p = TableTennisPaceClassifier.N69e6e76236(i);
    } else if (((Double) i[0]).doubleValue() > 0.4684551474124777) {
      p = 1;
    } 
    return p;
  }
  static double N69e6e76236(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.04110373959439775) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.04110373959439775) {
      p = 0;
    } 
    return p;
  }
  static double N43dca23237(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 2;
    } else if (((Double) i[13]).doubleValue() <= 7.6895094775) {
    p = TableTennisPaceClassifier.N7d47ed0c38(i);
    } else if (((Double) i[13]).doubleValue() > 7.6895094775) {
    p = TableTennisPaceClassifier.N188e52ae45(i);
    } 
    return p;
  }
  static double N7d47ed0c38(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 2;
    } else if (((Double) i[16]).doubleValue() <= 2.4341936568340423) {
      p = 2;
    } else if (((Double) i[16]).doubleValue() > 2.4341936568340423) {
    p = TableTennisPaceClassifier.N534b7c9539(i);
    } 
    return p;
  }
  static double N534b7c9539(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 2;
    } else if (((Double) i[20]).doubleValue() <= -8.552953514040928) {
      p = 2;
    } else if (((Double) i[20]).doubleValue() > -8.552953514040928) {
    p = TableTennisPaceClassifier.Nd484c6940(i);
    } 
    return p;
  }
  static double Nd484c6940(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 6.381414685086252) {
    p = TableTennisPaceClassifier.N2b23b2c041(i);
    } else if (((Double) i[0]).doubleValue() > 6.381414685086252) {
    p = TableTennisPaceClassifier.N2e8d400d44(i);
    } 
    return p;
  }
  static double N2b23b2c041(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 8.975527474990651E-4) {
    p = TableTennisPaceClassifier.N69ce052542(i);
    } else if (((Double) i[6]).doubleValue() > 8.975527474990651E-4) {
    p = TableTennisPaceClassifier.N61e9735d43(i);
    } 
    return p;
  }
  static double N69ce052542(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 0.5878112082338769) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 0.5878112082338769) {
      p = 1;
    } 
    return p;
  }
  static double N61e9735d43(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.4953632755460742) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.4953632755460742) {
      p = 2;
    } 
    return p;
  }
  static double N2e8d400d44(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 7.359665431964567) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 7.359665431964567) {
      p = 1;
    } 
    return p;
  }
  static double N188e52ae45(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 8.218909572890658E-4) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 8.218909572890658E-4) {
      p = 0;
    } 
    return p;
  }
  static double N1709bb746(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() <= 7.487929844006251E-4) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() > 7.487929844006251E-4) {
    p = TableTennisPaceClassifier.N2ba9735f47(i);
    } 
    return p;
  }
  static double N2ba9735f47(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 3.900697821910001) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 3.900697821910001) {
      p = 0;
    } 
    return p;
  }
  static double N6fe0c30f48(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() <= 7.433584853847347E-4) {
    p = TableTennisPaceClassifier.N591f77f49(i);
    } else if (((Double) i[22]).doubleValue() > 7.433584853847347E-4) {
    p = TableTennisPaceClassifier.Nb9795950(i);
    } 
    return p;
  }
  static double N591f77f49(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 0.609235809061109) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 0.609235809061109) {
      p = 2;
    } 
    return p;
  }
  static double Nb9795950(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 0.34535050069889117) {
    p = TableTennisPaceClassifier.N606ad19a51(i);
    } else if (((Double) i[19]).doubleValue() > 0.34535050069889117) {
    p = TableTennisPaceClassifier.N486368ef54(i);
    } 
    return p;
  }
  static double N606ad19a51(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 2;
    } else if (((Double) i[7]).doubleValue() <= 0.9745374212918523) {
      p = 2;
    } else if (((Double) i[7]).doubleValue() > 0.9745374212918523) {
    p = TableTennisPaceClassifier.N9fb9e2352(i);
    } 
    return p;
  }
  static double N9fb9e2352(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.6543777433404716) {
    p = TableTennisPaceClassifier.N35bba6c53(i);
    } else if (((Double) i[3]).doubleValue() > 2.6543777433404716) {
      p = 2;
    } 
    return p;
  }
  static double N35bba6c53(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 0.12979008811562037) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() > 0.12979008811562037) {
      p = 0;
    } 
    return p;
  }
  static double N486368ef54(Object []i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() <= 0.9951726455015507) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() > 0.9951726455015507) {
      p = 0;
    } 
    return p;
  }
  static double N7eb3967855(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 2;
    } else if (((Double) i[18]).doubleValue() <= 1284.0519765794786) {
    p = TableTennisPaceClassifier.N2b6c050b56(i);
    } else if (((Double) i[18]).doubleValue() > 1284.0519765794786) {
      p = 0;
    } 
    return p;
  }
  static double N2b6c050b56(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 15347.703719150242) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 15347.703719150242) {
      p = 2;
    } 
    return p;
  }
  static double N75ba52d057(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 4.116502933899997) {
    p = TableTennisPaceClassifier.N264d689858(i);
    } else if (((Double) i[5]).doubleValue() > 4.116502933899997) {
      p = 2;
    } 
    return p;
  }
  static double N264d689858(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 10.188423252049176) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 10.188423252049176) {
      p = 1;
    } 
    return p;
  }
  static double N442f2a7f59(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 26.62105587951016) {
    p = TableTennisPaceClassifier.Nf202bac60(i);
    } else if (((Double) i[24]).doubleValue() > 26.62105587951016) {
    p = TableTennisPaceClassifier.N79c42a74132(i);
    } 
    return p;
  }
  static double Nf202bac60(Object []i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.9812596083935184) {
    p = TableTennisPaceClassifier.N28abc44a61(i);
    } else if (((Double) i[23]).doubleValue() > 0.9812596083935184) {
    p = TableTennisPaceClassifier.N68424adb80(i);
    } 
    return p;
  }
  static double N28abc44a61(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= 0.6057672355326033) {
    p = TableTennisPaceClassifier.N656f606f62(i);
    } else if (((Double) i[17]).doubleValue() > 0.6057672355326033) {
    p = TableTennisPaceClassifier.N31744d0378(i);
    } 
    return p;
  }
  static double N656f606f62(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 2.6971971752218007) {
    p = TableTennisPaceClassifier.N58aed26f63(i);
    } else if (((Double) i[21]).doubleValue() > 2.6971971752218007) {
      p = 1;
    } 
    return p;
  }
  static double N58aed26f63(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 2.729711402050001) {
    p = TableTennisPaceClassifier.N565def9d64(i);
    } else if (((Double) i[5]).doubleValue() > 2.729711402050001) {
    p = TableTennisPaceClassifier.N50c720cf77(i);
    } 
    return p;
  }
  static double N565def9d64(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 1;
    } else if (((Double) i[12]).doubleValue() <= 0.8281867417023411) {
    p = TableTennisPaceClassifier.N20a2e88865(i);
    } else if (((Double) i[12]).doubleValue() > 0.8281867417023411) {
      p = 1;
    } 
    return p;
  }
  static double N20a2e88865(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 1;
    } else if (((Double) i[12]).doubleValue() <= 0.15115519495974106) {
    p = TableTennisPaceClassifier.N3e5088eb66(i);
    } else if (((Double) i[12]).doubleValue() > 0.15115519495974106) {
    p = TableTennisPaceClassifier.N24a7a38770(i);
    } 
    return p;
  }
  static double N3e5088eb66(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= -0.5259102477581187) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() > -0.5259102477581187) {
    p = TableTennisPaceClassifier.N104318e467(i);
    } 
    return p;
  }
  static double N104318e467(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.06126397420355006) {
    p = TableTennisPaceClassifier.N295b3c7668(i);
    } else if (((Double) i[9]).doubleValue() > -0.06126397420355006) {
      p = 1;
    } 
    return p;
  }
  static double N295b3c7668(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.4488922097402626) {
    p = TableTennisPaceClassifier.N1e0a777d69(i);
    } else if (((Double) i[1]).doubleValue() > 0.4488922097402626) {
      p = 0;
    } 
    return p;
  }
  static double N1e0a777d69(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4499.762512061356) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 4499.762512061356) {
      p = 1;
    } 
    return p;
  }
  static double N24a7a38770(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 2;
    } else if (((Double) i[12]).doubleValue() <= 0.18944451576608465) {
      p = 2;
    } else if (((Double) i[12]).doubleValue() > 0.18944451576608465) {
    p = TableTennisPaceClassifier.N2c2b1bcf71(i);
    } 
    return p;
  }
  static double N2c2b1bcf71(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.0024046155893135447) {
    p = TableTennisPaceClassifier.N5c632ab072(i);
    } else if (((Double) i[6]).doubleValue() > 0.0024046155893135447) {
    p = TableTennisPaceClassifier.N7c3caa5a75(i);
    } 
    return p;
  }
  static double N5c632ab072(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 1;
    } else if (((Double) i[24]).doubleValue() <= 10.520630922592044) {
    p = TableTennisPaceClassifier.N111f1fde73(i);
    } else if (((Double) i[24]).doubleValue() > 10.520630922592044) {
      p = 1;
    } 
    return p;
  }
  static double N111f1fde73(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.9465358038463269) {
    p = TableTennisPaceClassifier.N8bd3de174(i);
    } else if (((Double) i[4]).doubleValue() > 0.9465358038463269) {
      p = 0;
    } 
    return p;
  }
  static double N8bd3de174(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 0.07254121160320508) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 0.07254121160320508) {
      p = 1;
    } 
    return p;
  }
  static double N7c3caa5a75(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 4.872760279632757) {
    p = TableTennisPaceClassifier.N39cf39c776(i);
    } else if (((Double) i[16]).doubleValue() > 4.872760279632757) {
      p = 0;
    } 
    return p;
  }
  static double N39cf39c776(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.23259527891420229) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 0.23259527891420229) {
      p = 0;
    } 
    return p;
  }
  static double N50c720cf77(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= -0.48306123701848064) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() > -0.48306123701848064) {
      p = 0;
    } 
    return p;
  }
  static double N31744d0378(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 2;
    } else if (((Double) i[18]).doubleValue() <= 2305.4727157786374) {
      p = 2;
    } else if (((Double) i[18]).doubleValue() > 2305.4727157786374) {
    p = TableTennisPaceClassifier.N28834f0d79(i);
    } 
    return p;
  }
  static double N28834f0d79(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 3.989315543655337) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 3.989315543655337) {
      p = 0;
    } 
    return p;
  }
  static double N68424adb80(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 10.9837718538916) {
    p = TableTennisPaceClassifier.N1eace4481(i);
    } else if (((Double) i[24]).doubleValue() > 10.9837718538916) {
    p = TableTennisPaceClassifier.N7852379f104(i);
    } 
    return p;
  }
  static double N1eace4481(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 4.781825469020003) {
    p = TableTennisPaceClassifier.N12e5972f82(i);
    } else if (((Double) i[21]).doubleValue() > 4.781825469020003) {
    p = TableTennisPaceClassifier.N202c595983(i);
    } 
    return p;
  }
  static double N12e5972f82(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.1790285045452977) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 2.1790285045452977) {
      p = 0;
    } 
    return p;
  }
  static double N202c595983(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 6511.186767815814) {
    p = TableTennisPaceClassifier.N5ac2cb1584(i);
    } else if (((Double) i[2]).doubleValue() > 6511.186767815814) {
    p = TableTennisPaceClassifier.N63c46eb4103(i);
    } 
    return p;
  }
  static double N5ac2cb1584(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() <= 6.628977558075003) {
    p = TableTennisPaceClassifier.Nd8db6e785(i);
    } else if (((Double) i[21]).doubleValue() > 6.628977558075003) {
    p = TableTennisPaceClassifier.N67306d0b95(i);
    } 
    return p;
  }
  static double Nd8db6e785(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 0;
    } else if (((Double) i[20]).doubleValue() <= -1.1995262584362196) {
    p = TableTennisPaceClassifier.N336f149686(i);
    } else if (((Double) i[20]).doubleValue() > -1.1995262584362196) {
    p = TableTennisPaceClassifier.N3d9d826c88(i);
    } 
    return p;
  }
  static double N336f149686(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 6167.413554796746) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 6167.413554796746) {
    p = TableTennisPaceClassifier.N714b653387(i);
    } 
    return p;
  }
  static double N714b653387(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.3414783670703481) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 0.3414783670703481) {
      p = 0;
    } 
    return p;
  }
  static double N3d9d826c88(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 2.0248062896891827) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() > 2.0248062896891827) {
    p = TableTennisPaceClassifier.N5d4721b689(i);
    } 
    return p;
  }
  static double N5d4721b689(Object []i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 0;
    } else if (((Double) i[23]).doubleValue() <= 0.9896348641249213) {
      p = 0;
    } else if (((Double) i[23]).doubleValue() > 0.9896348641249213) {
    p = TableTennisPaceClassifier.N16c7452c90(i);
    } 
    return p;
  }
  static double N16c7452c90(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.12245111556073895) {
    p = TableTennisPaceClassifier.N3c0fd83a91(i);
    } else if (((Double) i[3]).doubleValue() > 0.12245111556073895) {
      p = 1;
    } 
    return p;
  }
  static double N3c0fd83a91(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 0;
    } else if (((Double) i[20]).doubleValue() <= -0.9814925340717551) {
      p = 0;
    } else if (((Double) i[20]).doubleValue() > -0.9814925340717551) {
    p = TableTennisPaceClassifier.N6dd0a33592(i);
    } 
    return p;
  }
  static double N6dd0a33592(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.0007448810322273) {
    p = TableTennisPaceClassifier.N9fe65a893(i);
    } else if (((Double) i[4]).doubleValue() > 1.0007448810322273) {
      p = 0;
    } 
    return p;
  }
  static double N9fe65a893(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 0.6545355323266032) {
    p = TableTennisPaceClassifier.N253cbf9e94(i);
    } else if (((Double) i[0]).doubleValue() > 0.6545355323266032) {
      p = 1;
    } 
    return p;
  }
  static double N253cbf9e94(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 0.5812948633628161) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 0.5812948633628161) {
      p = 0;
    } 
    return p;
  }
  static double N67306d0b95(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= -0.12436263740997072) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() > -0.12436263740997072) {
    p = TableTennisPaceClassifier.Nf91a3d396(i);
    } 
    return p;
  }
  static double Nf91a3d396(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.14537667839445) {
    p = TableTennisPaceClassifier.N753854ac97(i);
    } else if (((Double) i[3]).doubleValue() > 0.14537667839445) {
      p = 0;
    } 
    return p;
  }
  static double N753854ac97(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 0;
    } else if (((Double) i[19]).doubleValue() <= 14.686452665083396) {
    p = TableTennisPaceClassifier.N35b8d5da98(i);
    } else if (((Double) i[19]).doubleValue() > 14.686452665083396) {
      p = 0;
    } 
    return p;
  }
  static double N35b8d5da98(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.9899649497456091) {
    p = TableTennisPaceClassifier.N5104be5399(i);
    } else if (((Double) i[7]).doubleValue() > 0.9899649497456091) {
      p = 1;
    } 
    return p;
  }
  static double N5104be5399(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 0;
    } else if (((Double) i[18]).doubleValue() <= 4987.278288373242) {
    p = TableTennisPaceClassifier.N5309109b100(i);
    } else if (((Double) i[18]).doubleValue() > 4987.278288373242) {
      p = 1;
    } 
    return p;
  }
  static double N5309109b100(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 1.0781399125) {
    p = TableTennisPaceClassifier.N6423b362101(i);
    } else if (((Double) i[5]).doubleValue() > 1.0781399125) {
      p = 0;
    } 
    return p;
  }
  static double N6423b362101(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.06181571148928417) {
    p = TableTennisPaceClassifier.N17c6bc39102(i);
    } else if (((Double) i[3]).doubleValue() > 0.06181571148928417) {
      p = 0;
    } 
    return p;
  }
  static double N17c6bc39102(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.010704402982253291) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.010704402982253291) {
      p = 1;
    } 
    return p;
  }
  static double N63c46eb4103(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.042838299245698507) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -0.042838299245698507) {
      p = 0;
    } 
    return p;
  }
  static double N7852379f104(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.0016889977056129297) {
    p = TableTennisPaceClassifier.N1133354105(i);
    } else if (((Double) i[22]).doubleValue() > 0.0016889977056129297) {
    p = TableTennisPaceClassifier.Nae0261f108(i);
    } 
    return p;
  }
  static double N1133354105(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 5.844218413173179) {
    p = TableTennisPaceClassifier.N2316603b106(i);
    } else if (((Double) i[8]).doubleValue() > 5.844218413173179) {
    p = TableTennisPaceClassifier.N63671b23107(i);
    } 
    return p;
  }
  static double N2316603b106(Object []i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() <= 0.9967048264828557) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() > 0.9967048264828557) {
      p = 1;
    } 
    return p;
  }
  static double N63671b23107(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.001900913801216009) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 0.001900913801216009) {
      p = 2;
    } 
    return p;
  }
  static double Nae0261f108(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.015394618213315637) {
    p = TableTennisPaceClassifier.N12f12d84109(i);
    } else if (((Double) i[6]).doubleValue() > 0.015394618213315637) {
    p = TableTennisPaceClassifier.N245068f8127(i);
    } 
    return p;
  }
  static double N12f12d84109(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 0.7064479766565567) {
    p = TableTennisPaceClassifier.N2768059110(i);
    } else if (((Double) i[9]).doubleValue() > 0.7064479766565567) {
    p = TableTennisPaceClassifier.N1d495cd0122(i);
    } 
    return p;
  }
  static double N2768059110(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 0;
    } else if (((Double) i[20]).doubleValue() <= 0.913997792197159) {
    p = TableTennisPaceClassifier.N59132d37111(i);
    } else if (((Double) i[20]).doubleValue() > 0.913997792197159) {
    p = TableTennisPaceClassifier.Nbe7ff84118(i);
    } 
    return p;
  }
  static double N59132d37111(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 7.63112000020615) {
    p = TableTennisPaceClassifier.N524828d4112(i);
    } else if (((Double) i[0]).doubleValue() > 7.63112000020615) {
    p = TableTennisPaceClassifier.N2c2be6c5116(i);
    } 
    return p;
  }
  static double N524828d4112(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 5.865367598050001) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 5.865367598050001) {
    p = TableTennisPaceClassifier.N494ea214113(i);
    } 
    return p;
  }
  static double N494ea214113(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= -0.1960650806448024) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() > -0.1960650806448024) {
    p = TableTennisPaceClassifier.N7f0c972c114(i);
    } 
    return p;
  }
  static double N7f0c972c114(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.24086079092285279) {
    p = TableTennisPaceClassifier.N3fb6776f115(i);
    } else if (((Double) i[9]).doubleValue() > -0.24086079092285279) {
      p = 0;
    } 
    return p;
  }
  static double N3fb6776f115(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 6.50807581431797) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() > 6.50807581431797) {
      p = 1;
    } 
    return p;
  }
  static double N2c2be6c5116(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 9351.835126152295) {
    p = TableTennisPaceClassifier.N1049bf56117(i);
    } else if (((Double) i[2]).doubleValue() > 9351.835126152295) {
      p = 2;
    } 
    return p;
  }
  static double N1049bf56117(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 18.89052292203889) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() > 18.89052292203889) {
      p = 1;
    } 
    return p;
  }
  static double Nbe7ff84118(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6274.048299444643) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 6274.048299444643) {
    p = TableTennisPaceClassifier.N7e6fc98119(i);
    } 
    return p;
  }
  static double N7e6fc98119(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 5862.413735026236) {
    p = TableTennisPaceClassifier.N74882f6f120(i);
    } else if (((Double) i[18]).doubleValue() > 5862.413735026236) {
      p = 0;
    } 
    return p;
  }
  static double N74882f6f120(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 0;
    } else if (((Double) i[19]).doubleValue() <= 0.12979008811562037) {
    p = TableTennisPaceClassifier.N29669da7121(i);
    } else if (((Double) i[19]).doubleValue() > 0.12979008811562037) {
      p = 1;
    } 
    return p;
  }
  static double N29669da7121(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 2.0927751798321244) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 2.0927751798321244) {
      p = 1;
    } 
    return p;
  }
  static double N1d495cd0122(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 7.429433191349997) {
    p = TableTennisPaceClassifier.N2d7b61dd123(i);
    } else if (((Double) i[21]).doubleValue() > 7.429433191349997) {
      p = 0;
    } 
    return p;
  }
  static double N2d7b61dd123(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 2;
    } else if (((Double) i[7]).doubleValue() <= 0.9575398183324769) {
    p = TableTennisPaceClassifier.N18bdc04a124(i);
    } else if (((Double) i[7]).doubleValue() > 0.9575398183324769) {
    p = TableTennisPaceClassifier.N52bed5f125(i);
    } 
    return p;
  }
  static double N18bdc04a124(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 1.5507428896610937) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() > 1.5507428896610937) {
      p = 0;
    } 
    return p;
  }
  static double N52bed5f125(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.001372136098640057) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 0.001372136098640057) {
    p = TableTennisPaceClassifier.N52d39ef6126(i);
    } 
    return p;
  }
  static double N52d39ef6126(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 15.637246406687915) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() > 15.637246406687915) {
      p = 1;
    } 
    return p;
  }
  static double N245068f8127(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= -0.4677382877491713) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() > -0.4677382877491713) {
    p = TableTennisPaceClassifier.N521953a8128(i);
    } 
    return p;
  }
  static double N521953a8128(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() <= 9.291388899459152) {
    p = TableTennisPaceClassifier.N8020da1129(i);
    } else if (((Double) i[16]).doubleValue() > 9.291388899459152) {
      p = 1;
    } 
    return p;
  }
  static double N8020da1129(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 6712.03223932353) {
    p = TableTennisPaceClassifier.N46e80679130(i);
    } else if (((Double) i[18]).doubleValue() > 6712.03223932353) {
    p = TableTennisPaceClassifier.N61d8a1f4131(i);
    } 
    return p;
  }
  static double N46e80679130(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 1;
    } else if (((Double) i[14]).doubleValue() <= 0.04245737643612545) {
      p = 1;
    } else if (((Double) i[14]).doubleValue() > 0.04245737643612545) {
      p = 0;
    } 
    return p;
  }
  static double N61d8a1f4131(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.3755280624214088) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 0.3755280624214088) {
      p = 1;
    } 
    return p;
  }
  static double N79c42a74132(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 12761.183946688241) {
    p = TableTennisPaceClassifier.N61b34fe8133(i);
    } else if (((Double) i[2]).doubleValue() > 12761.183946688241) {
    p = TableTennisPaceClassifier.Nfdf8d42149(i);
    } 
    return p;
  }
  static double N61b34fe8133(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 10.21830722545) {
    p = TableTennisPaceClassifier.N67ee5669134(i);
    } else if (((Double) i[13]).doubleValue() > 10.21830722545) {
      p = 1;
    } 
    return p;
  }
  static double N67ee5669134(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 11042.822284661283) {
    p = TableTennisPaceClassifier.N431d9c61135(i);
    } else if (((Double) i[18]).doubleValue() > 11042.822284661283) {
    p = TableTennisPaceClassifier.N18d94a31148(i);
    } 
    return p;
  }
  static double N431d9c61135(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.4164864768608381) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.4164864768608381) {
    p = TableTennisPaceClassifier.N1bd299fc136(i);
    } 
    return p;
  }
  static double N1bd299fc136(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.43345806187133157) {
    p = TableTennisPaceClassifier.N60e54961137(i);
    } else if (((Double) i[9]).doubleValue() > 0.43345806187133157) {
    p = TableTennisPaceClassifier.N752d060a138(i);
    } 
    return p;
  }
  static double N60e54961137(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.14932850635301145) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() > 0.14932850635301145) {
      p = 1;
    } 
    return p;
  }
  static double N752d060a138(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 11862.308660251389) {
    p = TableTennisPaceClassifier.N5afc725a139(i);
    } else if (((Double) i[10]).doubleValue() > 11862.308660251389) {
      p = 1;
    } 
    return p;
  }
  static double N5afc725a139(Object []i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.9820100149751919) {
    p = TableTennisPaceClassifier.N55ee0d80140(i);
    } else if (((Double) i[23]).doubleValue() > 0.9820100149751919) {
    p = TableTennisPaceClassifier.N1f0af81d141(i);
    } 
    return p;
  }
  static double N55ee0d80140(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 1;
    } else if (((Double) i[14]).doubleValue() <= 0.03437900803164769) {
      p = 1;
    } else if (((Double) i[14]).doubleValue() > 0.03437900803164769) {
      p = 0;
    } 
    return p;
  }
  static double N1f0af81d141(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 0.009519705924722472) {
    p = TableTennisPaceClassifier.N28aa0a0142(i);
    } else if (((Double) i[22]).doubleValue() > 0.009519705924722472) {
    p = TableTennisPaceClassifier.N56f82d2d145(i);
    } 
    return p;
  }
  static double N28aa0a0142(Object []i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() <= 0.990896356629456) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() > 0.990896356629456) {
    p = TableTennisPaceClassifier.N3bdd6c09143(i);
    } 
    return p;
  }
  static double N3bdd6c09143(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.9813972698442828) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.9813972698442828) {
    p = TableTennisPaceClassifier.N1efae4ff144(i);
    } 
    return p;
  }
  static double N1efae4ff144(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.4172318104992736) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 0.4172318104992736) {
      p = 1;
    } 
    return p;
  }
  static double N56f82d2d145(Object []i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 0;
    } else if (((Double) i[23]).doubleValue() <= 0.9876596655143437) {
    p = TableTennisPaceClassifier.N12008f2146(i);
    } else if (((Double) i[23]).doubleValue() > 0.9876596655143437) {
      p = 0;
    } 
    return p;
  }
  static double N12008f2146(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 6624.192922612353) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 6624.192922612353) {
    p = TableTennisPaceClassifier.N514d91fb147(i);
    } 
    return p;
  }
  static double N514d91fb147(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 16.580372311360474) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() > 16.580372311360474) {
      p = 1;
    } 
    return p;
  }
  static double N18d94a31148(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 14.564870502600506) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 14.564870502600506) {
      p = 2;
    } 
    return p;
  }
  static double Nfdf8d42149(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 17.27030113337113) {
    p = TableTennisPaceClassifier.Neb973d3150(i);
    } else if (((Double) i[8]).doubleValue() > 17.27030113337113) {
    p = TableTennisPaceClassifier.N611ca53d152(i);
    } 
    return p;
  }
  static double Neb973d3150(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.9892298876458735) {
    p = TableTennisPaceClassifier.N33c6f9b6151(i);
    } else if (((Double) i[7]).doubleValue() > 0.9892298876458735) {
      p = 1;
    } 
    return p;
  }
  static double N33c6f9b6151(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 4.858138245000002) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 4.858138245000002) {
      p = 1;
    } 
    return p;
  }
  static double N611ca53d152(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 2;
    } else if (((Double) i[6]).doubleValue() <= 0.012957983679456315) {
    p = TableTennisPaceClassifier.N125a91c1153(i);
    } else if (((Double) i[6]).doubleValue() > 0.012957983679456315) {
    p = TableTennisPaceClassifier.N57b85fb2154(i);
    } 
    return p;
  }
  static double N125a91c1153(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.6402040101059306) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.6402040101059306) {
      p = 2;
    } 
    return p;
  }
  static double N57b85fb2154(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() <= -0.22843817353168194) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() > -0.22843817353168194) {
    p = TableTennisPaceClassifier.N533707ba155(i);
    } 
    return p;
  }
  static double N533707ba155(Object []i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() <= 0.9848272209646625) {
      p = 1;
    } else if (((Double) i[15]).doubleValue() > 0.9848272209646625) {
    p = TableTennisPaceClassifier.N570675ac156(i);
    } 
    return p;
  }
  static double N570675ac156(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 19.289451638250917) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 19.289451638250917) {
      p = 1;
    } 
    return p;
  }
  static double N11143214157(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= -0.2605097078286212) {
    p = TableTennisPaceClassifier.N444aa4b158(i);
    } else if (((Double) i[17]).doubleValue() > -0.2605097078286212) {
    p = TableTennisPaceClassifier.N1a6920ca162(i);
    } 
    return p;
  }
  static double N444aa4b158(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 20.898919878929487) {
    p = TableTennisPaceClassifier.N6fa567ae159(i);
    } else if (((Double) i[8]).doubleValue() > 20.898919878929487) {
    p = TableTennisPaceClassifier.N3bdec308161(i);
    } 
    return p;
  }
  static double N6fa567ae159(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 2.8811876136869987) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 2.8811876136869987) {
    p = TableTennisPaceClassifier.Nb6ad4e3160(i);
    } 
    return p;
  }
  static double Nb6ad4e3160(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= -0.8491787306102088) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() > -0.8491787306102088) {
      p = 1;
    } 
    return p;
  }
  static double N3bdec308161(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 39.422753259707235) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 39.422753259707235) {
      p = 2;
    } 
    return p;
  }
  static double N1a6920ca162(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= -0.0025153887404576773) {
    p = TableTennisPaceClassifier.N5eb5bc3e163(i);
    } else if (((Double) i[1]).doubleValue() > -0.0025153887404576773) {
      p = 1;
    } 
    return p;
  }
  static double N5eb5bc3e163(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 21.529715306845826) {
    p = TableTennisPaceClassifier.N325a6c7164(i);
    } else if (((Double) i[0]).doubleValue() > 21.529715306845826) {
      p = 2;
    } 
    return p;
  }
  static double N325a6c7164(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 15942.496012033353) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > 15942.496012033353) {
      p = 1;
    } 
    return p;
  }
  static double N4e2ef328165(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 12182.230737973308) {
    p = TableTennisPaceClassifier.N1d92e557166(i);
    } else if (((Double) i[10]).doubleValue() > 12182.230737973308) {
    p = TableTennisPaceClassifier.N669686a0194(i);
    } 
    return p;
  }
  static double N1d92e557166(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 0;
    } else if (((Double) i[20]).doubleValue() <= 2.037825162620194) {
    p = TableTennisPaceClassifier.N6eb5ee97167(i);
    } else if (((Double) i[20]).doubleValue() > 2.037825162620194) {
    p = TableTennisPaceClassifier.N6da660b1188(i);
    } 
    return p;
  }
  static double N6eb5ee97167(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.004225919044085619) {
    p = TableTennisPaceClassifier.N40087e18168(i);
    } else if (((Double) i[14]).doubleValue() > 0.004225919044085619) {
      p = 0;
    } 
    return p;
  }
  static double N40087e18168(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 9.830235344139556) {
    p = TableTennisPaceClassifier.N79867282169(i);
    } else if (((Double) i[16]).doubleValue() > 9.830235344139556) {
    p = TableTennisPaceClassifier.N3a3b3a9186(i);
    } 
    return p;
  }
  static double N79867282169(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 2.2223327466286005) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 2.2223327466286005) {
    p = TableTennisPaceClassifier.N733498b8170(i);
    } 
    return p;
  }
  static double N733498b8170(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.0015138097927754651) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() > 0.0015138097927754651) {
    p = TableTennisPaceClassifier.N32b4011f171(i);
    } 
    return p;
  }
  static double N32b4011f171(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.28044989331643705) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -0.28044989331643705) {
    p = TableTennisPaceClassifier.N314f41ef172(i);
    } 
    return p;
  }
  static double N314f41ef172(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 0;
    } else if (((Double) i[12]).doubleValue() <= 2.0931275047359508) {
    p = TableTennisPaceClassifier.N7b173726173(i);
    } else if (((Double) i[12]).doubleValue() > 2.0931275047359508) {
      p = 0;
    } 
    return p;
  }
  static double N7b173726173(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 2153.373643585353) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 2153.373643585353) {
    p = TableTennisPaceClassifier.N2c3191a4174(i);
    } 
    return p;
  }
  static double N2c3191a4174(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 1.2197299564999997) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 1.2197299564999997) {
    p = TableTennisPaceClassifier.N3e1fc1c4175(i);
    } 
    return p;
  }
  static double N3e1fc1c4175(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.9531359757452877) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.9531359757452877) {
    p = TableTennisPaceClassifier.N7514bfd1176(i);
    } 
    return p;
  }
  static double N7514bfd1176(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 2.204745167988001) {
    p = TableTennisPaceClassifier.N37781852177(i);
    } else if (((Double) i[5]).doubleValue() > 2.204745167988001) {
    p = TableTennisPaceClassifier.N3f4aef50183(i);
    } 
    return p;
  }
  static double N37781852177(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() <= 8.273694681) {
    p = TableTennisPaceClassifier.N17e403a8178(i);
    } else if (((Double) i[13]).doubleValue() > 8.273694681) {
    p = TableTennisPaceClassifier.N5735e171179(i);
    } 
    return p;
  }
  static double N17e403a8178(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 2.2683863330987224) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 2.2683863330987224) {
      p = 0;
    } 
    return p;
  }
  static double N5735e171179(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 4.652748554088985) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() > 4.652748554088985) {
    p = TableTennisPaceClassifier.N70f3671180(i);
    } 
    return p;
  }
  static double N70f3671180(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= 0.10214530153542448) {
    p = TableTennisPaceClassifier.N70c2144a181(i);
    } else if (((Double) i[17]).doubleValue() > 0.10214530153542448) {
      p = 1;
    } 
    return p;
  }
  static double N70c2144a181(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 5374.9122687304125) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 5374.9122687304125) {
    p = TableTennisPaceClassifier.N478cb0b9182(i);
    } 
    return p;
  }
  static double N478cb0b9182(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 1.395697445) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 1.395697445) {
      p = 1;
    } 
    return p;
  }
  static double N3f4aef50183(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.15884091074182713) {
    p = TableTennisPaceClassifier.N4108fa76184(i);
    } else if (((Double) i[3]).doubleValue() > 0.15884091074182713) {
      p = 1;
    } 
    return p;
  }
  static double N4108fa76184(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 16.172885188247925) {
    p = TableTennisPaceClassifier.N2188d659185(i);
    } else if (((Double) i[11]).doubleValue() > 16.172885188247925) {
      p = 0;
    } 
    return p;
  }
  static double N2188d659185(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= 0.07223322870653946) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() > 0.07223322870653946) {
      p = 0;
    } 
    return p;
  }
  static double N3a3b3a9186(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 9237.659981047038) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > 9237.659981047038) {
    p = TableTennisPaceClassifier.N6b7bfce2187(i);
    } 
    return p;
  }
  static double N6b7bfce2187(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= -0.24280310484024425) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() > -0.24280310484024425) {
      p = 1;
    } 
    return p;
  }
  static double N6da660b1188(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 7052.527326106037) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > 7052.527326106037) {
    p = TableTennisPaceClassifier.Na7b4942189(i);
    } 
    return p;
  }
  static double Na7b4942189(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.005716060212455951) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.005716060212455951) {
    p = TableTennisPaceClassifier.N14db9d5f190(i);
    } 
    return p;
  }
  static double N14db9d5f190(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.7069979181823622) {
    p = TableTennisPaceClassifier.N20f3efca191(i);
    } else if (((Double) i[4]).doubleValue() > 0.7069979181823622) {
    p = TableTennisPaceClassifier.N7e0eb08d192(i);
    } 
    return p;
  }
  static double N20f3efca191(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.982415802141681) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.982415802141681) {
      p = 0;
    } 
    return p;
  }
  static double N7e0eb08d192(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 15.96633376183694) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 15.96633376183694) {
    p = TableTennisPaceClassifier.N2e6fc757193(i);
    } 
    return p;
  }
  static double N2e6fc757193(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.7320961438275023) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.7320961438275023) {
      p = 0;
    } 
    return p;
  }
  static double N669686a0194(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 32.50326776988093) {
    p = TableTennisPaceClassifier.N5924b807195(i);
    } else if (((Double) i[0]).doubleValue() > 32.50326776988093) {
      p = 2;
    } 
    return p;
  }
  static double N5924b807195(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 16.44160237129641) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() > 16.44160237129641) {
      p = 1;
    } 
    return p;
  }
  static double N5225e176196(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 2;
    } else if (((Double) i[24]).doubleValue() <= 139.05101690710887) {
    p = TableTennisPaceClassifier.N2a0d11a197(i);
    } else if (((Double) i[24]).doubleValue() > 139.05101690710887) {
      p = 2;
    } 
    return p;
  }
  static double N2a0d11a197(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.47932018296661677) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() > 0.47932018296661677) {
    p = TableTennisPaceClassifier.N50d1f468198(i);
    } 
    return p;
  }
  static double N50d1f468198(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() <= 0.2949755844720474) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() > 0.2949755844720474) {
    p = TableTennisPaceClassifier.N2c498af5199(i);
    } 
    return p;
  }
  static double N2c498af5199(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 0.523683334590899) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > 0.523683334590899) {
      p = 1;
    } 
    return p;
  }
}
