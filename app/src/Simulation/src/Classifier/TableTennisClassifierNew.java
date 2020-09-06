/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classifier;

/**
 *
 * @author abakhshandehabk
 */
public class TableTennisClassifierNew {
 
    

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = TableTennisClassifierNew.Ne4b10480(i);
    return p;
  }
  static double Ne4b10480(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 3;
    } else if (((Double) i[8]).doubleValue() <= 37.85319880794971) {
    p = TableTennisClassifierNew.N355f22db1(i);
    } else if (((Double) i[8]).doubleValue() > 37.85319880794971) {
    p = TableTennisClassifierNew.N667ab9c7267(i);
    } 
    return p;
  }
  static double N355f22db1(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 3;
    } else if (((Double) i[19]).doubleValue() <= 5.238832337603518) {
    p = TableTennisClassifierNew.N7aff2b742(i);
    } else if (((Double) i[19]).doubleValue() > 5.238832337603518) {
    p = TableTennisClassifierNew.N20793fd6155(i);
    } 
    return p;
  }
  static double N7aff2b742(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 11786.649893511227) {
    p = TableTennisClassifierNew.N512cee903(i);
    } else if (((Double) i[2]).doubleValue() > 11786.649893511227) {
    p = TableTennisClassifierNew.N19dede1f108(i);
    } 
    return p;
  }
  static double N512cee903(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 3;
    } else if (((Double) i[4]).doubleValue() <= 2.6407701825331755) {
    p = TableTennisClassifierNew.N7b37dad4(i);
    } else if (((Double) i[4]).doubleValue() > 2.6407701825331755) {
    p = TableTennisClassifierNew.N28d722f788(i);
    } 
    return p;
  }
  static double N7b37dad4(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 3;
    } else if (((Double) i[24]).doubleValue() <= 10.9837718538916) {
    p = TableTennisClassifierNew.N4b36ce7a5(i);
    } else if (((Double) i[24]).doubleValue() > 10.9837718538916) {
    p = TableTennisClassifierNew.N46bcf66c29(i);
    } 
    return p;
  }
  static double N4b36ce7a5(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() <= 14145.746860360754) {
    p = TableTennisClassifierNew.N4891f8e36(i);
    } else if (((Double) i[10]).doubleValue() > 14145.746860360754) {
    p = TableTennisClassifierNew.N207bc6b219(i);
    } 
    return p;
  }
  static double N4891f8e36(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 3;
    } else if (((Double) i[18]).doubleValue() <= 3084.570019853476) {
    p = TableTennisClassifierNew.N7effd70f7(i);
    } else if (((Double) i[18]).doubleValue() > 3084.570019853476) {
      p = 3;
    } 
    return p;
  }
  static double N7effd70f7(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 3;
    } else if (((Double) i[22]).doubleValue() <= 0.0581911440314392) {
    p = TableTennisClassifierNew.N623d83688(i);
    } else if (((Double) i[22]).doubleValue() > 0.0581911440314392) {
    p = TableTennisClassifierNew.N3fb08ec118(i);
    } 
    return p;
  }
  static double N623d83688(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 3;
    } else if (((Double) i[19]).doubleValue() <= 0.13470644013859967) {
    p = TableTennisClassifierNew.N1f05d44b9(i);
    } else if (((Double) i[19]).doubleValue() > 0.13470644013859967) {
    p = TableTennisClassifierNew.N559b5a0016(i);
    } 
    return p;
  }
  static double N1f05d44b9(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() <= -0.4348782222329737) {
    p = TableTennisClassifierNew.N581461a810(i);
    } else if (((Double) i[17]).doubleValue() > -0.4348782222329737) {
    p = TableTennisClassifierNew.N56fb6cab12(i);
    } 
    return p;
  }
  static double N581461a810(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 7.827567947419644E-4) {
    p = TableTennisClassifierNew.N5853820a11(i);
    } else if (((Double) i[6]).doubleValue() > 7.827567947419644E-4) {
      p = 3;
    } 
    return p;
  }
  static double N5853820a11(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 6124.4346868834045) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() > 6124.4346868834045) {
      p = 1;
    } 
    return p;
  }
  static double N56fb6cab12(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() <= 0.538500710683731) {
    p = TableTennisClassifierNew.N676d5db313(i);
    } else if (((Double) i[17]).doubleValue() > 0.538500710683731) {
      p = 1;
    } 
    return p;
  }
  static double N676d5db313(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 9916.992759909728) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 9916.992759909728) {
    p = TableTennisClassifierNew.N1c8f79d714(i);
    } 
    return p;
  }
  static double N1c8f79d714(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 3;
    } else if (((Double) i[14]).doubleValue() <= 6.757552337544864E-4) {
      p = 3;
    } else if (((Double) i[14]).doubleValue() > 6.757552337544864E-4) {
    p = TableTennisClassifierNew.N5808eb9e15(i);
    } 
    return p;
  }
  static double N5808eb9e15(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 1;
    } else if (((Double) i[14]).doubleValue() <= 0.0010159668086174374) {
      p = 1;
    } else if (((Double) i[14]).doubleValue() > 0.0010159668086174374) {
      p = 3;
    } 
    return p;
  }
  static double N559b5a0016(Object []i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 3;
    } else if (((Double) i[15]).doubleValue() <= 0.9707633860832771) {
    p = TableTennisClassifierNew.N589605c517(i);
    } else if (((Double) i[15]).doubleValue() > 0.9707633860832771) {
      p = 1;
    } 
    return p;
  }
  static double N589605c517(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 3.0240463772060173) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 3.0240463772060173) {
      p = 3;
    } 
    return p;
  }
  static double N3fb08ec118(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= 0.782199546598582) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() > 0.782199546598582) {
      p = 0;
    } 
    return p;
  }
  static double N207bc6b219(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 0.30764702807171174) {
    p = TableTennisClassifierNew.N2f3fc3e720(i);
    } else if (((Double) i[19]).doubleValue() > 0.30764702807171174) {
    p = TableTennisClassifierNew.N6e1eaefd25(i);
    } 
    return p;
  }
  static double N2f3fc3e720(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() <= -2.007670580899098) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() > -2.007670580899098) {
    p = TableTennisClassifierNew.N476f43e821(i);
    } 
    return p;
  }
  static double N476f43e821(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.7399015380185875) {
    p = TableTennisClassifierNew.N7c120b4222(i);
    } else if (((Double) i[9]).doubleValue() > 0.7399015380185875) {
      p = 3;
    } 
    return p;
  }
  static double N7c120b4222(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 16217.852484163355) {
    p = TableTennisClassifierNew.N2220c2423(i);
    } else if (((Double) i[10]).doubleValue() > 16217.852484163355) {
      p = 1;
    } 
    return p;
  }
  static double N2220c2423(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.0025929539601585207) {
    p = TableTennisClassifierNew.N5353c77c24(i);
    } else if (((Double) i[6]).doubleValue() > 0.0025929539601585207) {
      p = 3;
    } 
    return p;
  }
  static double N5353c77c24(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 2586.559137168694) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() > 2586.559137168694) {
      p = 1;
    } 
    return p;
  }
  static double N6e1eaefd25(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() <= 553.3225391468928) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() > 553.3225391468928) {
    p = TableTennisClassifierNew.N23ae06726(i);
    } 
    return p;
  }
  static double N23ae06726(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 2.2022682885) {
    p = TableTennisClassifierNew.N10eb9f2827(i);
    } else if (((Double) i[13]).doubleValue() > 2.2022682885) {
      p = 1;
    } 
    return p;
  }
  static double N10eb9f2827(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= -0.20051074231760724) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() > -0.20051074231760724) {
    p = TableTennisClassifierNew.N5dced26e28(i);
    } 
    return p;
  }
  static double N5dced26e28(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 5396.1948398554805) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() > 5396.1948398554805) {
      p = 1;
    } 
    return p;
  }
  static double N46bcf66c29(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 3;
    } else if (((Double) i[13]).doubleValue() <= 1.3898723695000001) {
    p = TableTennisClassifierNew.N13d01f0430(i);
    } else if (((Double) i[13]).doubleValue() > 1.3898723695000001) {
    p = TableTennisClassifierNew.N3a0e98fb37(i);
    } 
    return p;
  }
  static double N13d01f0430(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() <= 2.780700772247617) {
    p = TableTennisClassifierNew.N5f8ed08931(i);
    } else if (((Double) i[20]).doubleValue() > 2.780700772247617) {
    p = TableTennisClassifierNew.N5556b3d133(i);
    } 
    return p;
  }
  static double N5f8ed08931(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 3;
    } else if (((Double) i[16]).doubleValue() <= 11.749102858956714) {
      p = 3;
    } else if (((Double) i[16]).doubleValue() > 11.749102858956714) {
    p = TableTennisClassifierNew.N74f824b432(i);
    } 
    return p;
  }
  static double N74f824b432(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 3;
    } else if (((Double) i[13]).doubleValue() <= 1.0852959064999994) {
      p = 3;
    } else if (((Double) i[13]).doubleValue() > 1.0852959064999994) {
      p = 1;
    } 
    return p;
  }
  static double N5556b3d133(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 9790.427045074972) {
    p = TableTennisClassifierNew.N46edbe4034(i);
    } else if (((Double) i[2]).doubleValue() > 9790.427045074972) {
      p = 0;
    } 
    return p;
  }
  static double N46edbe4034(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 3;
    } else if (((Double) i[16]).doubleValue() <= 7.8358098087652195) {
      p = 3;
    } else if (((Double) i[16]).doubleValue() > 7.8358098087652195) {
    p = TableTennisClassifierNew.N6fce248c35(i);
    } 
    return p;
  }
  static double N6fce248c35(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() <= 7805.956308316444) {
    p = TableTennisClassifierNew.N5aa6704536(i);
    } else if (((Double) i[10]).doubleValue() > 7805.956308316444) {
      p = 1;
    } 
    return p;
  }
  static double N5aa6704536(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.4203166274555016) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.4203166274555016) {
      p = 1;
    } 
    return p;
  }
  static double N3a0e98fb37(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 11.034273201018904) {
    p = TableTennisClassifierNew.N113a2e4438(i);
    } else if (((Double) i[0]).doubleValue() > 11.034273201018904) {
    p = TableTennisClassifierNew.N381e1c7083(i);
    } 
    return p;
  }
  static double N113a2e4438(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 3;
    } else if (((Double) i[16]).doubleValue() <= 16.979285304783755) {
    p = TableTennisClassifierNew.Nfce92ab39(i);
    } else if (((Double) i[16]).doubleValue() > 16.979285304783755) {
    p = TableTennisClassifierNew.N6ce4797769(i);
    } 
    return p;
  }
  static double Nfce92ab39(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 1.0047958154109753) {
    p = TableTennisClassifierNew.N6603ff4f40(i);
    } else if (((Double) i[0]).doubleValue() > 1.0047958154109753) {
    p = TableTennisClassifierNew.N6172db0845(i);
    } 
    return p;
  }
  static double N6603ff4f40(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() <= 9345.683479426789) {
    p = TableTennisClassifierNew.N28047a3441(i);
    } else if (((Double) i[10]).doubleValue() > 9345.683479426789) {
    p = TableTennisClassifierNew.N13aca51e43(i);
    } 
    return p;
  }
  static double N28047a3441(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 3;
    } else if (((Double) i[19]).doubleValue() <= 4.08224317841223) {
    p = TableTennisClassifierNew.N680c297e42(i);
    } else if (((Double) i[19]).doubleValue() > 4.08224317841223) {
      p = 0;
    } 
    return p;
  }
  static double N680c297e42(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 0.9000964885440195) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() > 0.9000964885440195) {
      p = 1;
    } 
    return p;
  }
  static double N13aca51e43(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 1;
    } else if (((Double) i[20]).doubleValue() <= -2.2420786062607467) {
    p = TableTennisClassifierNew.N6a2cd9a344(i);
    } else if (((Double) i[20]).doubleValue() > -2.2420786062607467) {
      p = 1;
    } 
    return p;
  }
  static double N6a2cd9a344(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 5271.57114965748) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() > 5271.57114965748) {
      p = 1;
    } 
    return p;
  }
  static double N6172db0845(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 3;
    } else if (((Double) i[18]).doubleValue() <= 8269.397528404043) {
    p = TableTennisClassifierNew.N68bc598146(i);
    } else if (((Double) i[18]).doubleValue() > 8269.397528404043) {
    p = TableTennisClassifierNew.N26db728d57(i);
    } 
    return p;
  }
  static double N68bc598146(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 3;
    } else if (((Double) i[6]).doubleValue() <= 0.01502902417904473) {
    p = TableTennisClassifierNew.N1e4e85dd47(i);
    } else if (((Double) i[6]).doubleValue() > 0.01502902417904473) {
    p = TableTennisClassifierNew.N1b53e1b153(i);
    } 
    return p;
  }
  static double N1e4e85dd47(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 3;
    } else if (((Double) i[22]).doubleValue() <= 0.0018412458651603163) {
    p = TableTennisClassifierNew.N12a3a67648(i);
    } else if (((Double) i[22]).doubleValue() > 0.0018412458651603163) {
    p = TableTennisClassifierNew.N657e95b149(i);
    } 
    return p;
  }
  static double N12a3a67648(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 3;
    } else if (((Double) i[19]).doubleValue() <= 1.879463608696454) {
      p = 3;
    } else if (((Double) i[19]).doubleValue() > 1.879463608696454) {
      p = 1;
    } 
    return p;
  }
  static double N657e95b149(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 3;
    } else if (((Double) i[19]).doubleValue() <= 2.6146503793376348) {
    p = TableTennisClassifierNew.N6f84b8ce50(i);
    } else if (((Double) i[19]).doubleValue() > 2.6146503793376348) {
      p = 1;
    } 
    return p;
  }
  static double N6f84b8ce50(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 3;
    } else if (((Double) i[22]).doubleValue() <= 0.013755886309458688) {
    p = TableTennisClassifierNew.N58ea88e51(i);
    } else if (((Double) i[22]).doubleValue() > 0.013755886309458688) {
      p = 1;
    } 
    return p;
  }
  static double N58ea88e51(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 3;
    } else if (((Double) i[8]).doubleValue() <= 3.58543470534765) {
    p = TableTennisClassifierNew.Na113e5f52(i);
    } else if (((Double) i[8]).doubleValue() > 3.58543470534765) {
      p = 3;
    } 
    return p;
  }
  static double Na113e5f52(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() <= -0.21982193932165583) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() > -0.21982193932165583) {
      p = 1;
    } 
    return p;
  }
  static double N1b53e1b153(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 0.49844116501849195) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() > 0.49844116501849195) {
    p = TableTennisClassifierNew.N51db68dd54(i);
    } 
    return p;
  }
  static double N51db68dd54(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 3;
    } else if (((Double) i[14]).doubleValue() <= 0.0017446086104478946) {
      p = 3;
    } else if (((Double) i[14]).doubleValue() > 0.0017446086104478946) {
    p = TableTennisClassifierNew.N21e160b055(i);
    } 
    return p;
  }
  static double N21e160b055(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6869.139946349086) {
    p = TableTennisClassifierNew.N2201411556(i);
    } else if (((Double) i[2]).doubleValue() > 6869.139946349086) {
      p = 3;
    } 
    return p;
  }
  static double N2201411556(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() <= -0.31886787019263135) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() > -0.31886787019263135) {
      p = 1;
    } 
    return p;
  }
  static double N26db728d57(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() <= 10601.056734213736) {
    p = TableTennisClassifierNew.N2c4c7b0b58(i);
    } else if (((Double) i[10]).doubleValue() > 10601.056734213736) {
    p = TableTennisClassifierNew.N2b57948468(i);
    } 
    return p;
  }
  static double N2c4c7b0b58(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 2335.144370616862) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() > 2335.144370616862) {
    p = TableTennisClassifierNew.N6826ad259(i);
    } 
    return p;
  }
  static double N6826ad259(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 3;
    } else if (((Double) i[14]).doubleValue() <= 0.004221278184385346) {
    p = TableTennisClassifierNew.N2ea39afe60(i);
    } else if (((Double) i[14]).doubleValue() > 0.004221278184385346) {
      p = 3;
    } 
    return p;
  }
  static double N2ea39afe60(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.3710732025787674) {
    p = TableTennisClassifierNew.N5391dabd61(i);
    } else if (((Double) i[1]).doubleValue() > 0.3710732025787674) {
    p = TableTennisClassifierNew.N3b4d55f364(i);
    } 
    return p;
  }
  static double N5391dabd61(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() <= 0.28972437984155697) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() > 0.28972437984155697) {
    p = TableTennisClassifierNew.N1cca77e762(i);
    } 
    return p;
  }
  static double N1cca77e762(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 3;
    } else if (((Double) i[9]).doubleValue() <= 0.026306487005463137) {
      p = 3;
    } else if (((Double) i[9]).doubleValue() > 0.026306487005463137) {
    p = TableTennisClassifierNew.N98b5a5663(i);
    } 
    return p;
  }
  static double N98b5a5663(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5050.1132714143) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5050.1132714143) {
      p = 3;
    } 
    return p;
  }
  static double N3b4d55f364(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.39038801982962695) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 0.39038801982962695) {
    p = TableTennisClassifierNew.N6654241565(i);
    } 
    return p;
  }
  static double N6654241565(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 4974.1301033098125) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() > 4974.1301033098125) {
    p = TableTennisClassifierNew.N296e127766(i);
    } 
    return p;
  }
  static double N296e127766(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() <= -1.9124246098948225) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() > -1.9124246098948225) {
    p = TableTennisClassifierNew.N7ae4a4e667(i);
    } 
    return p;
  }
  static double N7ae4a4e667(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.3326987466300953) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.3326987466300953) {
      p = 3;
    } 
    return p;
  }
  static double N2b57948468(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() <= -0.05242706630277685) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() > -0.05242706630277685) {
      p = 1;
    } 
    return p;
  }
  static double N6ce4797769(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 1;
    } else if (((Double) i[14]).doubleValue() <= 0.0034151869728298277) {
    p = TableTennisClassifierNew.N3540233670(i);
    } else if (((Double) i[14]).doubleValue() > 0.0034151869728298277) {
    p = TableTennisClassifierNew.N5677050f80(i);
    } 
    return p;
  }
  static double N3540233670(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.6031826743298926) {
    p = TableTennisClassifierNew.N6a5c72ec71(i);
    } else if (((Double) i[9]).doubleValue() > -0.6031826743298926) {
    p = TableTennisClassifierNew.Nf77cc4075(i);
    } 
    return p;
  }
  static double N6a5c72ec71(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() <= 19.184365977421802) {
      p = 1;
    } else if (((Double) i[16]).doubleValue() > 19.184365977421802) {
    p = TableTennisClassifierNew.N7db8289772(i);
    } 
    return p;
  }
  static double N7db8289772(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 3;
    } else if (((Double) i[8]).doubleValue() <= 9.801060624618655) {
    p = TableTennisClassifierNew.N32d8d99673(i);
    } else if (((Double) i[8]).doubleValue() > 9.801060624618655) {
      p = 1;
    } 
    return p;
  }
  static double N32d8d99673(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 1;
    } else if (((Double) i[24]).doubleValue() <= 31.86945331234742) {
    p = TableTennisClassifierNew.N6b5056874(i);
    } else if (((Double) i[24]).doubleValue() > 31.86945331234742) {
      p = 3;
    } 
    return p;
  }
  static double N6b5056874(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 3;
    } else if (((Double) i[18]).doubleValue() <= 5276.136711994724) {
      p = 3;
    } else if (((Double) i[18]).doubleValue() > 5276.136711994724) {
      p = 1;
    } 
    return p;
  }
  static double Nf77cc4075(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5057.11823832791) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5057.11823832791) {
    p = TableTennisClassifierNew.N33b7b1a976(i);
    } 
    return p;
  }
  static double N33b7b1a976(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 4.3277528295000005) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() > 4.3277528295000005) {
    p = TableTennisClassifierNew.N47d7da2077(i);
    } 
    return p;
  }
  static double N47d7da2077(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.9595630889405553) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.9595630889405553) {
    p = TableTennisClassifierNew.N696719f778(i);
    } 
    return p;
  }
  static double N696719f778(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 3;
    } else if (((Double) i[5]).doubleValue() <= 1.725797980700001) {
    p = TableTennisClassifierNew.N5843dd5779(i);
    } else if (((Double) i[5]).doubleValue() > 1.725797980700001) {
      p = 1;
    } 
    return p;
  }
  static double N5843dd5779(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= -0.24501071464424884) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() > -0.24501071464424884) {
      p = 3;
    } 
    return p;
  }
  static double N5677050f80(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.010401726451600844) {
    p = TableTennisClassifierNew.N2f08c33b81(i);
    } else if (((Double) i[6]).doubleValue() > 0.010401726451600844) {
      p = 1;
    } 
    return p;
  }
  static double N2f08c33b81(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 3;
    } else if (((Double) i[7]).doubleValue() <= 0.9409379425166426) {
      p = 3;
    } else if (((Double) i[7]).doubleValue() > 0.9409379425166426) {
    p = TableTennisClassifierNew.N7e71df8c82(i);
    } 
    return p;
  }
  static double N7e71df8c82(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.044790999827863345) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.044790999827863345) {
      p = 1;
    } 
    return p;
  }
  static double N381e1c7083(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.9271520493473884) {
    p = TableTennisClassifierNew.N562f290184(i);
    } else if (((Double) i[3]).doubleValue() > 0.9271520493473884) {
    p = TableTennisClassifierNew.N71f743487(i);
    } 
    return p;
  }
  static double N562f290184(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= -0.802420916966576) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() > -0.802420916966576) {
    p = TableTennisClassifierNew.N3fd739e485(i);
    } 
    return p;
  }
  static double N3fd739e485(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.5277113574676447) {
    p = TableTennisClassifierNew.N4faa0c2d86(i);
    } else if (((Double) i[3]).doubleValue() > 0.5277113574676447) {
      p = 3;
    } 
    return p;
  }
  static double N4faa0c2d86(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() <= 2.863796747050001) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() > 2.863796747050001) {
      p = 1;
    } 
    return p;
  }
  static double N71f743487(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() <= 0.006208470051103419) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() > 0.006208470051103419) {
      p = 1;
    } 
    return p;
  }
  static double N28d722f788(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 11574.104596377336) {
    p = TableTennisClassifierNew.N2e49261089(i);
    } else if (((Double) i[10]).doubleValue() > 11574.104596377336) {
      p = 1;
    } 
    return p;
  }
  static double N2e49261089(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() <= 1.0937342984434177) {
    p = TableTennisClassifierNew.N311d9c9090(i);
    } else if (((Double) i[20]).doubleValue() > 1.0937342984434177) {
    p = TableTennisClassifierNew.N76ff0442100(i);
    } 
    return p;
  }
  static double N311d9c9090(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 3;
    } else if (((Double) i[22]).doubleValue() <= 0.016602691470564722) {
      p = 3;
    } else if (((Double) i[22]).doubleValue() > 0.016602691470564722) {
    p = TableTennisClassifierNew.N4ddff05391(i);
    } 
    return p;
  }
  static double N4ddff05391(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 2.2027832874999986) {
    p = TableTennisClassifierNew.N5c8ea38592(i);
    } else if (((Double) i[13]).doubleValue() > 2.2027832874999986) {
      p = 1;
    } 
    return p;
  }
  static double N5c8ea38592(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.031143501262900174) {
    p = TableTennisClassifierNew.N3b1067a293(i);
    } else if (((Double) i[6]).doubleValue() > 0.031143501262900174) {
      p = 3;
    } 
    return p;
  }
  static double N3b1067a293(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 3;
    } else if (((Double) i[6]).doubleValue() <= 0.008830432715697268) {
    p = TableTennisClassifierNew.N6634854c94(i);
    } else if (((Double) i[6]).doubleValue() > 0.008830432715697268) {
    p = TableTennisClassifierNew.N7de0bf2496(i);
    } 
    return p;
  }
  static double N6634854c94(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.9768296552054277) {
    p = TableTennisClassifierNew.N54dbacb195(i);
    } else if (((Double) i[7]).doubleValue() > 0.9768296552054277) {
      p = 3;
    } 
    return p;
  }
  static double N54dbacb195(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.00770669007003643) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 0.00770669007003643) {
      p = 3;
    } 
    return p;
  }
  static double N7de0bf2496(Object []i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.9721808737625792) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() > 0.9721808737625792) {
    p = TableTennisClassifierNew.N4575fa4d97(i);
    } 
    return p;
  }
  static double N4575fa4d97(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.2249650831958004) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.2249650831958004) {
    p = TableTennisClassifierNew.N729094a98(i);
    } 
    return p;
  }
  static double N729094a98(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() <= -2.2754210992635846) {
      p = 3;
    } else if (((Double) i[20]).doubleValue() > -2.2754210992635846) {
    p = TableTennisClassifierNew.Ne1e933a99(i);
    } 
    return p;
  }
  static double Ne1e933a99(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 3;
    } else if (((Double) i[13]).doubleValue() <= 1.7251408678299998) {
      p = 3;
    } else if (((Double) i[13]).doubleValue() > 1.7251408678299998) {
      p = 1;
    } 
    return p;
  }
  static double N76ff0442100(Object []i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() <= 0.9031743188848709) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() > 0.9031743188848709) {
    p = TableTennisClassifierNew.N1cb23f42101(i);
    } 
    return p;
  }
  static double N1cb23f42101(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 8369.080937566787) {
    p = TableTennisClassifierNew.N539e16c7102(i);
    } else if (((Double) i[10]).doubleValue() > 8369.080937566787) {
    p = TableTennisClassifierNew.N97e749b106(i);
    } 
    return p;
  }
  static double N539e16c7102(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= 0.18510244512790122) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() > 0.18510244512790122) {
    p = TableTennisClassifierNew.N2963c8cd103(i);
    } 
    return p;
  }
  static double N2963c8cd103(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 5880.700362883721) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() > 5880.700362883721) {
    p = TableTennisClassifierNew.N273014b7104(i);
    } 
    return p;
  }
  static double N273014b7104(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 3;
    } else if (((Double) i[18]).doubleValue() <= 11693.058370317458) {
      p = 3;
    } else if (((Double) i[18]).doubleValue() > 11693.058370317458) {
    p = TableTennisClassifierNew.N2a75773c105(i);
    } 
    return p;
  }
  static double N2a75773c105(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 3;
    } else if (((Double) i[6]).doubleValue() <= 0.009059946276597869) {
      p = 3;
    } else if (((Double) i[6]).doubleValue() > 0.009059946276597869) {
      p = 1;
    } 
    return p;
  }
  static double N97e749b106(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.1332481475077323) {
    p = TableTennisClassifierNew.N3eecf0d9107(i);
    } else if (((Double) i[11]).doubleValue() > -1.1332481475077323) {
      p = 1;
    } 
    return p;
  }
  static double N3eecf0d9107(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.6529814320229168) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.6529814320229168) {
      p = 1;
    } 
    return p;
  }
  static double N19dede1f108(Object []i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.98666713573097) {
    p = TableTennisClassifierNew.N1893868f109(i);
    } else if (((Double) i[23]).doubleValue() > 0.98666713573097) {
    p = TableTennisClassifierNew.N12a89658124(i);
    } 
    return p;
  }
  static double N1893868f109(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.472002725726665) {
    p = TableTennisClassifierNew.N62b3e3aa110(i);
    } else if (((Double) i[3]).doubleValue() > 2.472002725726665) {
    p = TableTennisClassifierNew.N208cffd121(i);
    } 
    return p;
  }
  static double N62b3e3aa110(Object []i) {
    double p = Double.NaN;
    if (i[20] == null) {
      p = 0;
    } else if (((Double) i[20]).doubleValue() <= -11.33527415435225) {
    p = TableTennisClassifierNew.N3b00bd1d111(i);
    } else if (((Double) i[20]).doubleValue() > -11.33527415435225) {
    p = TableTennisClassifierNew.N54c1a244112(i);
    } 
    return p;
  }
  static double N3b00bd1d111(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 3.3746322631000005) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() > 3.3746322631000005) {
      p = 0;
    } 
    return p;
  }
  static double N54c1a244112(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 11542.56185280182) {
    p = TableTennisClassifierNew.N5062f1ad113(i);
    } else if (((Double) i[10]).doubleValue() > 11542.56185280182) {
    p = TableTennisClassifierNew.N2f6341a3118(i);
    } 
    return p;
  }
  static double N5062f1ad113(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 17.575219222331445) {
    p = TableTennisClassifierNew.N2d31e6b8114(i);
    } else if (((Double) i[8]).doubleValue() > 17.575219222331445) {
      p = 0;
    } 
    return p;
  }
  static double N2d31e6b8114(Object []i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 1;
    } else if (((Double) i[23]).doubleValue() <= 0.9850738028007274) {
    p = TableTennisClassifierNew.N13674e56115(i);
    } else if (((Double) i[23]).doubleValue() > 0.9850738028007274) {
      p = 3;
    } 
    return p;
  }
  static double N13674e56115(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 3;
    } else if (((Double) i[7]).doubleValue() <= 0.9875577172235432) {
    p = TableTennisClassifierNew.N4aed1dfc116(i);
    } else if (((Double) i[7]).doubleValue() > 0.9875577172235432) {
      p = 1;
    } 
    return p;
  }
  static double N4aed1dfc116(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() <= 0.5219205572072432) {
      p = 3;
    } else if (((Double) i[17]).doubleValue() > 0.5219205572072432) {
    p = TableTennisClassifierNew.Nd456295117(i);
    } 
    return p;
  }
  static double Nd456295117(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.9835633716314658) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.9835633716314658) {
      p = 1;
    } 
    return p;
  }
  static double N2f6341a3118(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 9030.683753774187) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() > 9030.683753774187) {
    p = TableTennisClassifierNew.N65fafe7119(i);
    } 
    return p;
  }
  static double N65fafe7119(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.5860002253843387) {
    p = TableTennisClassifierNew.N247f502d120(i);
    } else if (((Double) i[11]).doubleValue() > -0.5860002253843387) {
      p = 3;
    } 
    return p;
  }
  static double N247f502d120(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 3;
    } else if (((Double) i[11]).doubleValue() <= -0.8089700837802013) {
      p = 3;
    } else if (((Double) i[11]).doubleValue() > -0.8089700837802013) {
      p = 1;
    } 
    return p;
  }
  static double N208cffd121(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 0.477497979746717) {
    p = TableTennisClassifierNew.N3753f846122(i);
    } else if (((Double) i[1]).doubleValue() > 0.477497979746717) {
      p = 1;
    } 
    return p;
  }
  static double N3753f846122(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.0438132827323489) {
    p = TableTennisClassifierNew.N4c8849dc123(i);
    } else if (((Double) i[22]).doubleValue() > 0.0438132827323489) {
      p = 0;
    } 
    return p;
  }
  static double N4c8849dc123(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() <= 4.2487268637) {
      p = 1;
    } else if (((Double) i[13]).doubleValue() > 4.2487268637) {
      p = 0;
    } 
    return p;
  }
  static double N12a89658124(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 18517.5274995125) {
    p = TableTennisClassifierNew.N569bc4d7125(i);
    } else if (((Double) i[2]).doubleValue() > 18517.5274995125) {
    p = TableTennisClassifierNew.N1e4ae57f154(i);
    } 
    return p;
  }
  static double N569bc4d7125(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 5.722100572333911E-4) {
    p = TableTennisClassifierNew.N7ea2978a126(i);
    } else if (((Double) i[14]).doubleValue() > 5.722100572333911E-4) {
    p = TableTennisClassifierNew.N70eae72b127(i);
    } 
    return p;
  }
  static double N7ea2978a126(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 0.014194467113907523) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 0.014194467113907523) {
      p = 2;
    } 
    return p;
  }
  static double N70eae72b127(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 0.1770048952241906) {
    p = TableTennisClassifierNew.N26a6a538128(i);
    } else if (((Double) i[0]).doubleValue() > 0.1770048952241906) {
    p = TableTennisClassifierNew.N45abe9f1133(i);
    } 
    return p;
  }
  static double N26a6a538128(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 3.2702548456393052) {
    p = TableTennisClassifierNew.N2e936047129(i);
    } else if (((Double) i[11]).doubleValue() > 3.2702548456393052) {
    p = TableTennisClassifierNew.N4467acd8130(i);
    } 
    return p;
  }
  static double N2e936047129(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 1167.1357734090402) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() > 1167.1357734090402) {
      p = 2;
    } 
    return p;
  }
  static double N4467acd8130(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 4.153212134516903) {
    p = TableTennisClassifierNew.N6393c8c0131(i);
    } else if (((Double) i[3]).doubleValue() > 4.153212134516903) {
    p = TableTennisClassifierNew.N700f2eef132(i);
    } 
    return p;
  }
  static double N6393c8c0131(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 3;
    } else if (((Double) i[7]).doubleValue() <= 0.995578908180583) {
      p = 3;
    } else if (((Double) i[7]).doubleValue() > 0.995578908180583) {
      p = 1;
    } 
    return p;
  }
  static double N700f2eef132(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() <= 0.09947113099255378) {
      p = 2;
    } else if (((Double) i[0]).doubleValue() > 0.09947113099255378) {
      p = 1;
    } 
    return p;
  }
  static double N45abe9f1133(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() <= 0.003848650816579654) {
    p = TableTennisClassifierNew.N3cd38cf0134(i);
    } else if (((Double) i[22]).doubleValue() > 0.003848650816579654) {
    p = TableTennisClassifierNew.N77216301142(i);
    } 
    return p;
  }
  static double N3cd38cf0134(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() <= 1.0445513550014336) {
    p = TableTennisClassifierNew.N41fb9662135(i);
    } else if (((Double) i[8]).doubleValue() > 1.0445513550014336) {
    p = TableTennisClassifierNew.N72609ed7138(i);
    } 
    return p;
  }
  static double N41fb9662135(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.29511807069746737) {
    p = TableTennisClassifierNew.N488aa0e4136(i);
    } else if (((Double) i[1]).doubleValue() > 0.29511807069746737) {
      p = 0;
    } 
    return p;
  }
  static double N488aa0e4136(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 2;
    } else if (((Double) i[16]).doubleValue() <= 1.9469099843604882) {
      p = 2;
    } else if (((Double) i[16]).doubleValue() > 1.9469099843604882) {
    p = TableTennisClassifierNew.N52743c65137(i);
    } 
    return p;
  }
  static double N52743c65137(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() <= -0.24928208818722963) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() > -0.24928208818722963) {
      p = 0;
    } 
    return p;
  }
  static double N72609ed7138(Object []i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 2;
    } else if (((Double) i[15]).doubleValue() <= 0.9919443786793939) {
      p = 2;
    } else if (((Double) i[15]).doubleValue() > 0.9919443786793939) {
    p = TableTennisClassifierNew.N6f355e7f139(i);
    } 
    return p;
  }
  static double N6f355e7f139(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() <= 1825.7711449034948) {
    p = TableTennisClassifierNew.N72255efd140(i);
    } else if (((Double) i[10]).doubleValue() > 1825.7711449034948) {
    p = TableTennisClassifierNew.N1c1c3c8141(i);
    } 
    return p;
  }
  static double N72255efd140(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.9945376634536132) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.9945376634536132) {
      p = 3;
    } 
    return p;
  }
  static double N1c1c3c8141(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 15065.659541343635) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 15065.659541343635) {
      p = 2;
    } 
    return p;
  }
  static double N77216301142(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() <= 0.5241236404283417) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() > 0.5241236404283417) {
    p = TableTennisClassifierNew.N32221d3c143(i);
    } 
    return p;
  }
  static double N32221d3c143(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.979935022056953) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.979935022056953) {
    p = TableTennisClassifierNew.N6a287f33144(i);
    } 
    return p;
  }
  static double N6a287f33144(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 3;
    } else if (((Double) i[18]).doubleValue() <= 4918.086044298597) {
    p = TableTennisClassifierNew.N65783e3d145(i);
    } else if (((Double) i[18]).doubleValue() > 4918.086044298597) {
      p = 1;
    } 
    return p;
  }
  static double N65783e3d145(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 1;
    } else if (((Double) i[14]).doubleValue() <= 0.003222660447011299) {
    p = TableTennisClassifierNew.N19bd60f8146(i);
    } else if (((Double) i[14]).doubleValue() > 0.003222660447011299) {
    p = TableTennisClassifierNew.N3b54450e147(i);
    } 
    return p;
  }
  static double N19bd60f8146(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() <= 0.10085642652564474) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() > 0.10085642652564474) {
      p = 1;
    } 
    return p;
  }
  static double N3b54450e147(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 3;
    } else if (((Double) i[13]).doubleValue() <= 3.1839615813499993) {
    p = TableTennisClassifierNew.N122c64b0148(i);
    } else if (((Double) i[13]).doubleValue() > 3.1839615813499993) {
    p = TableTennisClassifierNew.N13a28788153(i);
    } 
    return p;
  }
  static double N122c64b0148(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 3;
    } else if (((Double) i[3]).doubleValue() <= 2.262411150783965) {
    p = TableTennisClassifierNew.N3601391e149(i);
    } else if (((Double) i[3]).doubleValue() > 2.262411150783965) {
      p = 0;
    } 
    return p;
  }
  static double N3601391e149(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 3;
    } else if (((Double) i[9]).doubleValue() <= 0.3199277729261626) {
      p = 3;
    } else if (((Double) i[9]).doubleValue() > 0.3199277729261626) {
    p = TableTennisClassifierNew.N44c93586150(i);
    } 
    return p;
  }
  static double N44c93586150(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.9908664049660294) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.9908664049660294) {
    p = TableTennisClassifierNew.N5dac6424151(i);
    } 
    return p;
  }
  static double N5dac6424151(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.1658139211865324) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.1658139211865324) {
    p = TableTennisClassifierNew.N2cd492c5152(i);
    } 
    return p;
  }
  static double N2cd492c5152(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.7539668872408982) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 1.7539668872408982) {
      p = 3;
    } 
    return p;
  }
  static double N13a28788153(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 3;
    } else if (((Double) i[6]).doubleValue() <= 0.002163968718250397) {
      p = 3;
    } else if (((Double) i[6]).doubleValue() > 0.002163968718250397) {
      p = 1;
    } 
    return p;
  }
  static double N1e4ae57f154(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -2.271279407857588) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -2.271279407857588) {
      p = 2;
    } 
    return p;
  }
  static double N20793fd6155(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 0.0011820102916262904) {
    p = TableTennisClassifierNew.N2833c3a6156(i);
    } else if (((Double) i[14]).doubleValue() > 0.0011820102916262904) {
    p = TableTennisClassifierNew.N31c27f39177(i);
    } 
    return p;
  }
  static double N2833c3a6156(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 3;
    } else if (((Double) i[5]).doubleValue() <= 2.3659726104999996) {
    p = TableTennisClassifierNew.N2faa9fef157(i);
    } else if (((Double) i[5]).doubleValue() > 2.3659726104999996) {
    p = TableTennisClassifierNew.N4317e8dc164(i);
    } 
    return p;
  }
  static double N2faa9fef157(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 3;
    } else if (((Double) i[24]).doubleValue() <= 5.2280805071449645) {
    p = TableTennisClassifierNew.N6602e678158(i);
    } else if (((Double) i[24]).doubleValue() > 5.2280805071449645) {
    p = TableTennisClassifierNew.N5b898312163(i);
    } 
    return p;
  }
  static double N6602e678158(Object []i) {
    double p = Double.NaN;
    if (i[13] == null) {
      p = 0;
    } else if (((Double) i[13]).doubleValue() <= 2.7656217694999996) {
    p = TableTennisClassifierNew.Nf6cf2e1159(i);
    } else if (((Double) i[13]).doubleValue() > 2.7656217694999996) {
      p = 3;
    } 
    return p;
  }
  static double Nf6cf2e1159(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 3;
    } else if (((Double) i[19]).doubleValue() <= 10.165130161724408) {
    p = TableTennisClassifierNew.N39f42e59160(i);
    } else if (((Double) i[19]).doubleValue() > 10.165130161724408) {
      p = 0;
    } 
    return p;
  }
  static double N39f42e59160(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 10897.085172883895) {
    p = TableTennisClassifierNew.N42da8b6f161(i);
    } else if (((Double) i[2]).doubleValue() > 10897.085172883895) {
      p = 0;
    } 
    return p;
  }
  static double N42da8b6f161(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 2.6391332215521755E-4) {
    p = TableTennisClassifierNew.N331a846a162(i);
    } else if (((Double) i[6]).doubleValue() > 2.6391332215521755E-4) {
      p = 3;
    } 
    return p;
  }
  static double N331a846a162(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 3;
    } else if (((Double) i[3]).doubleValue() <= 0.7494849080347282) {
      p = 3;
    } else if (((Double) i[3]).doubleValue() > 0.7494849080347282) {
      p = 1;
    } 
    return p;
  }
  static double N5b898312163(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 2;
    } else if (((Double) i[10]).doubleValue() <= 6469.03493781244) {
      p = 2;
    } else if (((Double) i[10]).doubleValue() > 6469.03493781244) {
      p = 1;
    } 
    return p;
  }
  static double N4317e8dc164(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 2;
    } else if (((Double) i[10]).doubleValue() <= 10412.489236077585) {
    p = TableTennisClassifierNew.N55809222165(i);
    } else if (((Double) i[10]).doubleValue() > 10412.489236077585) {
    p = TableTennisClassifierNew.N14e47a9c175(i);
    } 
    return p;
  }
  static double N55809222165(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 2;
    } else if (((Double) i[5]).doubleValue() <= 3.12758030913) {
    p = TableTennisClassifierNew.N325e752c166(i);
    } else if (((Double) i[5]).doubleValue() > 3.12758030913) {
    p = TableTennisClassifierNew.N2b32dc3f171(i);
    } 
    return p;
  }
  static double N325e752c166(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 2568.869465389116) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() > 2568.869465389116) {
    p = TableTennisClassifierNew.N25d8e166167(i);
    } 
    return p;
  }
  static double N25d8e166167(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 0.0010585711516092119) {
    p = TableTennisClassifierNew.N5975ac09168(i);
    } else if (((Double) i[14]).doubleValue() > 0.0010585711516092119) {
      p = 3;
    } 
    return p;
  }
  static double N5975ac09168(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 2;
    } else if (((Double) i[17]).doubleValue() <= -0.4744695135859912) {
    p = TableTennisClassifierNew.N8353487169(i);
    } else if (((Double) i[17]).doubleValue() > -0.4744695135859912) {
      p = 2;
    } 
    return p;
  }
  static double N8353487169(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 0.21201093917410702) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 0.21201093917410702) {
    p = TableTennisClassifierNew.N4983d7b8170(i);
    } 
    return p;
  }
  static double N4983d7b8170(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 7.292860009265862E-4) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() > 7.292860009265862E-4) {
      p = 0;
    } 
    return p;
  }
  static double N2b32dc3f171(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 2;
    } else if (((Double) i[18]).doubleValue() <= 13917.788625617437) {
    p = TableTennisClassifierNew.N5fd328b4172(i);
    } else if (((Double) i[18]).doubleValue() > 13917.788625617437) {
    p = TableTennisClassifierNew.N298a88b6174(i);
    } 
    return p;
  }
  static double N5fd328b4172(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 2;
    } else if (((Double) i[3]).doubleValue() <= 10.111206650033763) {
      p = 2;
    } else if (((Double) i[3]).doubleValue() > 10.111206650033763) {
    p = TableTennisClassifierNew.N7ee3aec5173(i);
    } 
    return p;
  }
  static double N7ee3aec5173(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() <= 991.6937813365087) {
      p = 2;
    } else if (((Double) i[2]).doubleValue() > 991.6937813365087) {
      p = 3;
    } 
    return p;
  }
  static double N298a88b6174(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() <= 5.744679593423245E-4) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() > 5.744679593423245E-4) {
      p = 3;
    } 
    return p;
  }
  static double N14e47a9c175(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 0.39380455648863955) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() > 0.39380455648863955) {
    p = TableTennisClassifierNew.N5234763c176(i);
    } 
    return p;
  }
  static double N5234763c176(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 9.861854570065276E-4) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() > 9.861854570065276E-4) {
      p = 1;
    } 
    return p;
  }
  static double N31c27f39177(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 11134.50913971169) {
    p = TableTennisClassifierNew.N4c709e8f178(i);
    } else if (((Double) i[2]).doubleValue() > 11134.50913971169) {
    p = TableTennisClassifierNew.N73ecbd1a234(i);
    } 
    return p;
  }
  static double N4c709e8f178(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 3;
    } else if (((Double) i[5]).doubleValue() <= 3.7799537850949996) {
    p = TableTennisClassifierNew.N7bf72d07179(i);
    } else if (((Double) i[5]).doubleValue() > 3.7799537850949996) {
    p = TableTennisClassifierNew.N78edb78218(i);
    } 
    return p;
  }
  static double N7bf72d07179(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 11410.821640179809) {
    p = TableTennisClassifierNew.Na0331d3180(i);
    } else if (((Double) i[18]).doubleValue() > 11410.821640179809) {
    p = TableTennisClassifierNew.N2296e6b1213(i);
    } 
    return p;
  }
  static double Na0331d3180(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 3.327047038536691) {
    p = TableTennisClassifierNew.N289abc1d181(i);
    } else if (((Double) i[11]).doubleValue() > 3.327047038536691) {
    p = TableTennisClassifierNew.N4d2c2e84209(i);
    } 
    return p;
  }
  static double N289abc1d181(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.0013261420645012212) {
    p = TableTennisClassifierNew.N6056cb67182(i);
    } else if (((Double) i[22]).doubleValue() > 0.0013261420645012212) {
    p = TableTennisClassifierNew.N6e1cb0bb193(i);
    } 
    return p;
  }
  static double N6056cb67182(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (((Double) i[22]).doubleValue() <= 0.0011636630700961206) {
    p = TableTennisClassifierNew.N220b5d7f183(i);
    } else if (((Double) i[22]).doubleValue() > 0.0011636630700961206) {
    p = TableTennisClassifierNew.N42fac9a2192(i);
    } 
    return p;
  }
  static double N220b5d7f183(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 3;
    } else if (((Double) i[16]).doubleValue() <= 0.37573950046455645) {
    p = TableTennisClassifierNew.N31957d44184(i);
    } else if (((Double) i[16]).doubleValue() > 0.37573950046455645) {
    p = TableTennisClassifierNew.N6251e4ba187(i);
    } 
    return p;
  }
  static double N31957d44184(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() <= 3580.0622038066467) {
    p = TableTennisClassifierNew.N4c92553f185(i);
    } else if (((Double) i[10]).doubleValue() > 3580.0622038066467) {
      p = 1;
    } 
    return p;
  }
  static double N4c92553f185(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.981964340666139) {
    p = TableTennisClassifierNew.N1ac9a239186(i);
    } else if (((Double) i[7]).doubleValue() > 0.981964340666139) {
      p = 3;
    } 
    return p;
  }
  static double N1ac9a239186(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.04141552273692791) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.04141552273692791) {
      p = 3;
    } 
    return p;
  }
  static double N6251e4ba187(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= -0.46074818648177523) {
    p = TableTennisClassifierNew.N78b4cae9188(i);
    } else if (((Double) i[1]).doubleValue() > -0.46074818648177523) {
    p = TableTennisClassifierNew.N2651436d189(i);
    } 
    return p;
  }
  static double N78b4cae9188(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 1;
    } else if (((Double) i[12]).doubleValue() <= 3.8507661598696425) {
      p = 1;
    } else if (((Double) i[12]).doubleValue() > 3.8507661598696425) {
      p = 3;
    } 
    return p;
  }
  static double N2651436d189(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 0;
    } else if (((Double) i[14]).doubleValue() <= 0.010102658102640548) {
    p = TableTennisClassifierNew.N71def5f4190(i);
    } else if (((Double) i[14]).doubleValue() > 0.010102658102640548) {
      p = 1;
    } 
    return p;
  }
  static double N71def5f4190(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.28787134860207936) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 0.28787134860207936) {
    p = TableTennisClassifierNew.N1c47bb41191(i);
    } 
    return p;
  }
  static double N1c47bb41191(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() <= 2.316730919623363) {
      p = 0;
    } else if (((Double) i[16]).doubleValue() > 2.316730919623363) {
      p = 3;
    } 
    return p;
  }
  static double N42fac9a2192(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.38152139606915997) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.38152139606915997) {
      p = 2;
    } 
    return p;
  }
  static double N6e1cb0bb193(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= 0.21172150150683475) {
    p = TableTennisClassifierNew.N68eb99d9194(i);
    } else if (((Double) i[17]).doubleValue() > 0.21172150150683475) {
    p = TableTennisClassifierNew.N7a7b7d39206(i);
    } 
    return p;
  }
  static double N68eb99d9194(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.3633264946209838) {
    p = TableTennisClassifierNew.N49d7aa36195(i);
    } else if (((Double) i[3]).doubleValue() > -0.3633264946209838) {
    p = TableTennisClassifierNew.N6ac9ef41203(i);
    } 
    return p;
  }
  static double N49d7aa36195(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 3;
    } else if (((Double) i[16]).doubleValue() <= 2.143360900905244) {
    p = TableTennisClassifierNew.N5d74cd77196(i);
    } else if (((Double) i[16]).doubleValue() > 2.143360900905244) {
    p = TableTennisClassifierNew.N5666370a197(i);
    } 
    return p;
  }
  static double N5d74cd77196(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= 0.6684806694995327) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() > 0.6684806694995327) {
      p = 3;
    } 
    return p;
  }
  static double N5666370a197(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.10798398040500752) {
    p = TableTennisClassifierNew.N62f7594e198(i);
    } else if (((Double) i[1]).doubleValue() > -0.10798398040500752) {
    p = TableTennisClassifierNew.N1685c93c199(i);
    } 
    return p;
  }
  static double N62f7594e198(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= -0.2774039546349322) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > -0.2774039546349322) {
      p = 0;
    } 
    return p;
  }
  static double N1685c93c199(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.4478809292993411) {
    p = TableTennisClassifierNew.N6d61b1ee200(i);
    } else if (((Double) i[3]).doubleValue() > -0.4478809292993411) {
      p = 0;
    } 
    return p;
  }
  static double N6d61b1ee200(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 8.838093870748569) {
    p = TableTennisClassifierNew.Na58052f201(i);
    } else if (((Double) i[19]).doubleValue() > 8.838093870748569) {
    p = TableTennisClassifierNew.N52bd0003202(i);
    } 
    return p;
  }
  static double Na58052f201(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 8176.567490582751) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() > 8176.567490582751) {
      p = 0;
    } 
    return p;
  }
  static double N52bd0003202(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 1;
    } else if (((Double) i[24]).doubleValue() <= 29.763271455753355) {
      p = 1;
    } else if (((Double) i[24]).doubleValue() > 29.763271455753355) {
      p = 3;
    } 
    return p;
  }
  static double N6ac9ef41203(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 10476.74368981925) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 10476.74368981925) {
    p = TableTennisClassifierNew.Na47dd37204(i);
    } 
    return p;
  }
  static double Na47dd37204(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 11000.785025263736) {
    p = TableTennisClassifierNew.N407cc02d205(i);
    } else if (((Double) i[2]).doubleValue() > 11000.785025263736) {
      p = 0;
    } 
    return p;
  }
  static double N407cc02d205(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 3;
    } else if (((Double) i[3]).doubleValue() <= 0.9737759318777848) {
      p = 3;
    } else if (((Double) i[3]).doubleValue() > 0.9737759318777848) {
      p = 1;
    } 
    return p;
  }
  static double N7a7b7d39206(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 3;
    } else if (((Double) i[14]).doubleValue() <= 0.017452681287018643) {
    p = TableTennisClassifierNew.N5f6d26d0207(i);
    } else if (((Double) i[14]).doubleValue() > 0.017452681287018643) {
    p = TableTennisClassifierNew.N6b77f66f208(i);
    } 
    return p;
  }
  static double N5f6d26d0207(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 3;
    } else if (((Double) i[3]).doubleValue() <= 0.8583117782255114) {
      p = 3;
    } else if (((Double) i[3]).doubleValue() > 0.8583117782255114) {
      p = 1;
    } 
    return p;
  }
  static double N6b77f66f208(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 4.949002618975808) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 4.949002618975808) {
      p = 3;
    } 
    return p;
  }
  static double N4d2c2e84209(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 3;
    } else if (((Double) i[10]).doubleValue() <= 1982.955984949424) {
    p = TableTennisClassifierNew.N6c1f00ad210(i);
    } else if (((Double) i[10]).doubleValue() > 1982.955984949424) {
      p = 2;
    } 
    return p;
  }
  static double N6c1f00ad210(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 2;
    } else if (((Double) i[17]).doubleValue() <= -0.8963356663763734) {
      p = 2;
    } else if (((Double) i[17]).doubleValue() > -0.8963356663763734) {
    p = TableTennisClassifierNew.N5af2e058211(i);
    } 
    return p;
  }
  static double N5af2e058211(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 3;
    } else if (((Double) i[19]).doubleValue() <= 14.241477801500888) {
      p = 3;
    } else if (((Double) i[19]).doubleValue() > 14.241477801500888) {
    p = TableTennisClassifierNew.Nee2a1e7212(i);
    } 
    return p;
  }
  static double Nee2a1e7212(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.0010732127525193967) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.0010732127525193967) {
      p = 3;
    } 
    return p;
  }
  static double N2296e6b1213(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 2;
    } else if (((Double) i[17]).doubleValue() <= -0.827618069515991) {
    p = TableTennisClassifierNew.N36988026214(i);
    } else if (((Double) i[17]).doubleValue() > -0.827618069515991) {
    p = TableTennisClassifierNew.N7ba5468d215(i);
    } 
    return p;
  }
  static double N36988026214(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() <= 0.8692025503073791) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() > 0.8692025503073791) {
      p = 3;
    } 
    return p;
  }
  static double N7ba5468d215(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 3;
    } else if (((Double) i[4]).doubleValue() <= 3.295779395068784) {
      p = 3;
    } else if (((Double) i[4]).doubleValue() > 3.295779395068784) {
    p = TableTennisClassifierNew.N60d33d87216(i);
    } 
    return p;
  }
  static double N60d33d87216(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.008520747555749589) {
    p = TableTennisClassifierNew.N7565ec42217(i);
    } else if (((Double) i[6]).doubleValue() > 0.008520747555749589) {
      p = 3;
    } 
    return p;
  }
  static double N7565ec42217(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 0.7312904841409575) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 0.7312904841409575) {
      p = 2;
    } 
    return p;
  }
  static double N78edb78218(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 3;
    } else if (((Double) i[21]).doubleValue() <= 6.216868123125) {
      p = 3;
    } else if (((Double) i[21]).doubleValue() > 6.216868123125) {
    p = TableTennisClassifierNew.N564e742a219(i);
    } 
    return p;
  }
  static double N564e742a219(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 2;
    } else if (((Double) i[11]).doubleValue() <= 1.529660153904845) {
    p = TableTennisClassifierNew.N2f085461220(i);
    } else if (((Double) i[11]).doubleValue() > 1.529660153904845) {
    p = TableTennisClassifierNew.N55985157233(i);
    } 
    return p;
  }
  static double N2f085461220(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 2;
    } else if (((Double) i[12]).doubleValue() <= 0.9280950015545456) {
    p = TableTennisClassifierNew.N75d5ba3e221(i);
    } else if (((Double) i[12]).doubleValue() > 0.9280950015545456) {
    p = TableTennisClassifierNew.N4c7dd27d224(i);
    } 
    return p;
  }
  static double N75d5ba3e221(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 2;
    } else if (((Double) i[3]).doubleValue() <= 14.03965976198699) {
    p = TableTennisClassifierNew.N471fae7222(i);
    } else if (((Double) i[3]).doubleValue() > 14.03965976198699) {
      p = 3;
    } 
    return p;
  }
  static double N471fae7222(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() <= 1.331609002839513) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() > 1.331609002839513) {
    p = TableTennisClassifierNew.N213b2167223(i);
    } 
    return p;
  }
  static double N213b2167223(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 3;
    } else if (((Double) i[16]).doubleValue() <= 1.637094436608137) {
      p = 3;
    } else if (((Double) i[16]).doubleValue() > 1.637094436608137) {
      p = 2;
    } 
    return p;
  }
  static double N4c7dd27d224(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.6635951022226594) {
    p = TableTennisClassifierNew.N14a18586225(i);
    } else if (((Double) i[9]).doubleValue() > 0.6635951022226594) {
    p = TableTennisClassifierNew.N64b860c5231(i);
    } 
    return p;
  }
  static double N14a18586225(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() <= 0.33896174745951246) {
    p = TableTennisClassifierNew.N1f0ce337226(i);
    } else if (((Double) i[9]).doubleValue() > 0.33896174745951246) {
    p = TableTennisClassifierNew.N67c4c9a8227(i);
    } 
    return p;
  }
  static double N1f0ce337226(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 0.15163115683293207) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 0.15163115683293207) {
      p = 2;
    } 
    return p;
  }
  static double N67c4c9a8227(Object []i) {
    double p = Double.NaN;
    if (i[23] == null) {
      p = 3;
    } else if (((Double) i[23]).doubleValue() <= 0.9943622851666943) {
    p = TableTennisClassifierNew.N45080117228(i);
    } else if (((Double) i[23]).doubleValue() > 0.9943622851666943) {
      p = 1;
    } 
    return p;
  }
  static double N45080117228(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.4460373782905811) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.4460373782905811) {
    p = TableTennisClassifierNew.N5d9d2185229(i);
    } 
    return p;
  }
  static double N5d9d2185229(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 3;
    } else if (((Double) i[6]).doubleValue() <= 0.022298742908550738) {
      p = 3;
    } else if (((Double) i[6]).doubleValue() > 0.022298742908550738) {
    p = TableTennisClassifierNew.N25f0745a230(i);
    } 
    return p;
  }
  static double N25f0745a230(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 4.176907452285004) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 4.176907452285004) {
      p = 3;
    } 
    return p;
  }
  static double N64b860c5231(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 0.6858867095114002) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() > 0.6858867095114002) {
    p = TableTennisClassifierNew.N613dd5fc232(i);
    } 
    return p;
  }
  static double N613dd5fc232(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 5.814165213019823) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 5.814165213019823) {
      p = 2;
    } 
    return p;
  }
  static double N55985157233(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 2;
    } else if (((Double) i[7]).doubleValue() <= 0.9845373093531958) {
      p = 2;
    } else if (((Double) i[7]).doubleValue() > 0.9845373093531958) {
      p = 3;
    } 
    return p;
  }
  static double N73ecbd1a234(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 2;
    } else if (((Double) i[8]).doubleValue() <= 5.06908458144841) {
    p = TableTennisClassifierNew.N54f555ea235(i);
    } else if (((Double) i[8]).doubleValue() > 5.06908458144841) {
    p = TableTennisClassifierNew.N481bbebd261(i);
    } 
    return p;
  }
  static double N54f555ea235(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 0.020815963914007224) {
    p = TableTennisClassifierNew.N5b68f8bd236(i);
    } else if (((Double) i[14]).doubleValue() > 0.020815963914007224) {
    p = TableTennisClassifierNew.N5c677249256(i);
    } 
    return p;
  }
  static double N5b68f8bd236(Object []i) {
    double p = Double.NaN;
    if (i[15] == null) {
      p = 0;
    } else if (((Double) i[15]).doubleValue() <= 0.983549368986631) {
    p = TableTennisClassifierNew.N4c6d086e237(i);
    } else if (((Double) i[15]).doubleValue() > 0.983549368986631) {
    p = TableTennisClassifierNew.N5aff6894238(i);
    } 
    return p;
  }
  static double N4c6d086e237(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 4143.420940292635) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > 4143.420940292635) {
      p = 1;
    } 
    return p;
  }
  static double N5aff6894238(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 3;
    } else if (((Double) i[5]).doubleValue() <= 3.0003352175499973) {
    p = TableTennisClassifierNew.N245b2c24239(i);
    } else if (((Double) i[5]).doubleValue() > 3.0003352175499973) {
    p = TableTennisClassifierNew.N44b5bd6d248(i);
    } 
    return p;
  }
  static double N245b2c24239(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 0.1943842090747526) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() > 0.1943842090747526) {
    p = TableTennisClassifierNew.N38ea9502240(i);
    } 
    return p;
  }
  static double N38ea9502240(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= -0.18862435453376275) {
    p = TableTennisClassifierNew.N1ce0c409241(i);
    } else if (((Double) i[1]).doubleValue() > -0.18862435453376275) {
    p = TableTennisClassifierNew.N3d7ab4c9242(i);
    } 
    return p;
  }
  static double N1ce0c409241(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 11726.278697294445) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 11726.278697294445) {
      p = 2;
    } 
    return p;
  }
  static double N3d7ab4c9242(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 0.6805202183061961) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 0.6805202183061961) {
    p = TableTennisClassifierNew.N40bd854e243(i);
    } 
    return p;
  }
  static double N40bd854e243(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 5.399684042979763E-4) {
    p = TableTennisClassifierNew.N2c935ade244(i);
    } else if (((Double) i[6]).doubleValue() > 5.399684042979763E-4) {
    p = TableTennisClassifierNew.N5e7d3535246(i);
    } 
    return p;
  }
  static double N2c935ade244(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 2736.035859283944) {
    p = TableTennisClassifierNew.N364903c9245(i);
    } else if (((Double) i[10]).doubleValue() > 2736.035859283944) {
      p = 2;
    } 
    return p;
  }
  static double N364903c9245(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 3;
    } else if (((Double) i[22]).doubleValue() <= 5.098007949113552E-4) {
      p = 3;
    } else if (((Double) i[22]).doubleValue() > 5.098007949113552E-4) {
      p = 1;
    } 
    return p;
  }
  static double N5e7d3535246(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 2;
    } else if (((Double) i[17]).doubleValue() <= -0.861938108121943) {
      p = 2;
    } else if (((Double) i[17]).doubleValue() > -0.861938108121943) {
    p = TableTennisClassifierNew.N72c65c41247(i);
    } 
    return p;
  }
  static double N72c65c41247(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() <= 2.9581067670967696) {
      p = 3;
    } else if (((Double) i[0]).doubleValue() > 2.9581067670967696) {
      p = 0;
    } 
    return p;
  }
  static double N44b5bd6d248(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 2;
    } else if (((Double) i[10]).doubleValue() <= 427.95024763616453) {
    p = TableTennisClassifierNew.N3a1ca979249(i);
    } else if (((Double) i[10]).doubleValue() > 427.95024763616453) {
    p = TableTennisClassifierNew.Nd7ff792250(i);
    } 
    return p;
  }
  static double N3a1ca979249(Object []i) {
    double p = Double.NaN;
    if (i[18] == null) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() <= 3664.934542363825) {
      p = 1;
    } else if (((Double) i[18]).doubleValue() > 3664.934542363825) {
      p = 2;
    } 
    return p;
  }
  static double Nd7ff792250(Object []i) {
    double p = Double.NaN;
    if (i[14] == null) {
      p = 2;
    } else if (((Double) i[14]).doubleValue() <= 0.013072313435290342) {
    p = TableTennisClassifierNew.N4d1b8628251(i);
    } else if (((Double) i[14]).doubleValue() > 0.013072313435290342) {
    p = TableTennisClassifierNew.N9959d3f254(i);
    } 
    return p;
  }
  static double N4d1b8628251(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 2;
    } else if (((Double) i[9]).doubleValue() <= -0.8337601567966236) {
    p = TableTennisClassifierNew.N24ac0433252(i);
    } else if (((Double) i[9]).doubleValue() > -0.8337601567966236) {
      p = 2;
    } 
    return p;
  }
  static double N24ac0433252(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 6.039174429148117) {
    p = TableTennisClassifierNew.N7ba426be253(i);
    } else if (((Double) i[0]).doubleValue() > 6.039174429148117) {
      p = 2;
    } 
    return p;
  }
  static double N7ba426be253(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() <= 8.289323723673891E-4) {
      p = 1;
    } else if (((Double) i[22]).doubleValue() > 8.289323723673891E-4) {
      p = 3;
    } 
    return p;
  }
  static double N9959d3f254(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() <= -0.3922673947718767) {
      p = 2;
    } else if (((Double) i[1]).doubleValue() > -0.3922673947718767) {
    p = TableTennisClassifierNew.N182e70e3255(i);
    } 
    return p;
  }
  static double N182e70e3255(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 8.398385704439464) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() > 8.398385704439464) {
      p = 0;
    } 
    return p;
  }
  static double N5c677249256(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 3;
    } else if (((Double) i[7]).doubleValue() <= 0.9951080327347479) {
    p = TableTennisClassifierNew.N62c3ead257(i);
    } else if (((Double) i[7]).doubleValue() > 0.9951080327347479) {
      p = 0;
    } 
    return p;
  }
  static double N62c3ead257(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() <= 1.972546564185616E-4) {
      p = 2;
    } else if (((Double) i[22]).doubleValue() > 1.972546564185616E-4) {
    p = TableTennisClassifierNew.N23f53732258(i);
    } 
    return p;
  }
  static double N23f53732258(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 3;
    } else if (((Double) i[7]).doubleValue() <= 0.9910802492822262) {
      p = 3;
    } else if (((Double) i[7]).doubleValue() > 0.9910802492822262) {
    p = TableTennisClassifierNew.N48b7f2c7259(i);
    } 
    return p;
  }
  static double N48b7f2c7259(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 1;
    } else if (((Double) i[17]).doubleValue() <= 0.11372199084206337) {
    p = TableTennisClassifierNew.N2f2524a2260(i);
    } else if (((Double) i[17]).doubleValue() > 0.11372199084206337) {
      p = 3;
    } 
    return p;
  }
  static double N2f2524a2260(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() <= 0.13128357381452915) {
      p = 3;
    } else if (((Double) i[1]).doubleValue() > 0.13128357381452915) {
      p = 1;
    } 
    return p;
  }
  static double N481bbebd261(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 1;
    } else if (((Double) i[19]).doubleValue() <= 7.160391777791757) {
    p = TableTennisClassifierNew.N42dd5c2b262(i);
    } else if (((Double) i[19]).doubleValue() > 7.160391777791757) {
    p = TableTennisClassifierNew.Ne621f31266(i);
    } 
    return p;
  }
  static double N42dd5c2b262(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.7440611821485126) {
    p = TableTennisClassifierNew.N358baf7d263(i);
    } else if (((Double) i[3]).doubleValue() > 1.7440611821485126) {
    p = TableTennisClassifierNew.N267633d0265(i);
    } 
    return p;
  }
  static double N358baf7d263(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 3;
    } else if (((Double) i[8]).doubleValue() <= 10.837314148473792) {
    p = TableTennisClassifierNew.N330d8d5a264(i);
    } else if (((Double) i[8]).doubleValue() > 10.837314148473792) {
      p = 1;
    } 
    return p;
  }
  static double N330d8d5a264(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 11886.058616489065) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 11886.058616489065) {
      p = 3;
    } 
    return p;
  }
  static double N267633d0265(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 14421.522885836604) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 14421.522885836604) {
      p = 0;
    } 
    return p;
  }
  static double Ne621f31266(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() <= 12121.96822859518) {
      p = 3;
    } else if (((Double) i[2]).doubleValue() > 12121.96822859518) {
      p = 0;
    } 
    return p;
  }
  static double N667ab9c7267(Object []i) {
    double p = Double.NaN;
    if (i[24] == null) {
      p = 0;
    } else if (((Double) i[24]).doubleValue() <= 139.05101690710887) {
    p = TableTennisClassifierNew.N39428f0f268(i);
    } else if (((Double) i[24]).doubleValue() > 139.05101690710887) {
      p = 0;
    } 
    return p;
  }
  static double N39428f0f268(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 0.47932018296661677) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 0.47932018296661677) {
    p = TableTennisClassifierNew.N2ebdd344269(i);
    } 
    return p;
  }
  static double N2ebdd344269(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 0.2949755844720474) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > 0.2949755844720474) {
    p = TableTennisClassifierNew.N30b8da35270(i);
    } 
    return p;
  }
  static double N30b8da35270(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 3;
    } else if (((Double) i[9]).doubleValue() <= 0.523683334590899) {
      p = 3;
    } else if (((Double) i[9]).doubleValue() > 0.523683334590899) {
      p = 1;
    } 
    return p;
  }
}

    

