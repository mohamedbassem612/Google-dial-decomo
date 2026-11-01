package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bqx {
    private static final defpackage.cbd b = new defpackage.cet(new defpackage.ns(13));
    public static final defpackage.cbd a = new defpackage.cet(new defpackage.ns(14));

    public static final void a(defpackage.bor borVar, defpackage.bry bryVar, defpackage.bti btiVar, defpackage.bwo bwoVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        final defpackage.bor borVar2;
        final defpackage.bry bryVar2;
        final defpackage.bti btiVar2;
        final defpackage.bwo bwoVar2;
        final defpackage.aonn aonnVar2;
        defpackage.bor borVar3;
        defpackage.bry bryVar3;
        defpackage.bwo bwoVar3;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1317329884);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(borVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(bryVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(btiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(bwoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            defpackage.cbd cbdVar = b;
            if (((java.lang.Boolean) cavVarB.e(cbdVar)).booleanValue()) {
                cavVarB.u(1458663246);
                if (borVar == null) {
                    cavVarB.u(-1061323065);
                    defpackage.bor borVar4 = ((defpackage.bqv) cavVarB.e(a)).a;
                    ((defpackage.cbt) cavVarB).W(false);
                    borVar3 = borVar4;
                } else {
                    cavVarB.u(-1061323964);
                    ((defpackage.cbt) cavVarB).W(false);
                    borVar3 = borVar;
                }
                if (bryVar == null) {
                    cavVarB.u(-1061320824);
                    defpackage.bry bryVar4 = ((defpackage.bqv) cavVarB.e(a)).d;
                    ((defpackage.cbt) cavVarB).W(false);
                    bryVar3 = bryVar4;
                } else {
                    cavVarB.u(-1061321754);
                    ((defpackage.cbt) cavVarB).W(false);
                    bryVar3 = bryVar;
                }
                if (bwoVar == null) {
                    cavVarB.u(-1061318682);
                    defpackage.bwo bwoVar4 = ((defpackage.bqv) cavVarB.e(a)).b;
                    ((defpackage.cbt) cavVarB).W(false);
                    bwoVar3 = bwoVar4;
                } else {
                    cavVarB.u(-1061319550);
                    ((defpackage.cbt) cavVarB).W(false);
                    bwoVar3 = bwoVar;
                }
                cavVarB.u(-1061317606);
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                cbtVar.W(false);
                btiVar2 = btiVar;
                aonnVar2 = aonnVar;
                b(borVar3, bryVar3, btiVar2, bwoVar3, aonnVar2, cavVarB, i2 & 57344);
                cbtVar.W(false);
                borVar2 = borVar;
                bryVar2 = bryVar;
                bwoVar2 = bwoVar;
            } else {
                btiVar2 = btiVar;
                aonnVar2 = aonnVar;
                cavVarB.u(1458990389);
                borVar2 = borVar;
                bryVar2 = bryVar;
                bwoVar2 = bwoVar;
                defpackage.den.ab(cbdVar.b(java.lang.Boolean.TRUE), defpackage.cfo.j(1535649272, new defpackage.aonn() { // from class: bqw
                    @Override // defpackage.aonn
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.cav cavVar2 = (defpackage.cav) obj;
                        int iIntValue = ((java.lang.Integer) obj2).intValue();
                        int i4 = iIntValue & 3;
                        int i5 = iIntValue & 1;
                        defpackage.cbd cbdVar2 = defpackage.bqx.a;
                        if (cavVar2.H(i4 != 2, i5)) {
                            defpackage.bor borVarF = borVar2;
                            if (borVarF == null) {
                                borVarF = defpackage.bos.f(0L, 0L, 0L, -49760000737804288L, 0L, 0L, 0L, 0L, -51153301013528576L, 0L, 0L, 0L, -44126390919888896L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -32619108382015488L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, 65535);
                            }
                            brw brwVar = bryVar2;
                            if (brwVar == null) {
                                brwVar = brw.a;
                            }
                            defpackage.bti btiVar3 = btiVar2;
                            defpackage.bwo bwoVar5 = bwoVar2;
                            if (bwoVar5 == null) {
                                bwoVar5 = new defpackage.bwo(null);
                            }
                            defpackage.bqx.b(borVarF, brwVar, btiVar3, bwoVar5, aonnVar2, cavVar2, 0);
                        } else {
                            cavVar2.s();
                        }
                        return defpackage.aojh.a;
                    }
                }, cavVarB), cavVarB, 56);
                ((defpackage.cbt) cavVarB).W(false);
            }
        } else {
            borVar2 = borVar;
            bryVar2 = bryVar;
            btiVar2 = btiVar;
            bwoVar2 = bwoVar;
            aonnVar2 = aonnVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(borVar2, bryVar2, btiVar2, bwoVar2, aonnVar2, i, 5);
        }
    }

    public static final void b(defpackage.bor borVar, defpackage.bry bryVar, defpackage.bti btiVar, defpackage.bwo bwoVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        char c;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(904511636);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(borVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(bryVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(btiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(bwoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.bqv bqvVar = new defpackage.bqv(borVar, bwoVar, btiVar, bryVar);
            defpackage.any anyVarA = defpackage.bsw.a(false, 0.0f, null, false, 255);
            long j = borVar.a;
            boolean zA = cavVarB.A(j);
            java.lang.Object objR = cbtVar.R();
            if (zA) {
                c = 0;
            } else {
                c = 0;
                if (objR == defpackage.cau.a) {
                }
                defpackage.cdj[] cdjVarArr = new defpackage.cdj[3];
                cdjVarArr[c] = a.b(bqvVar);
                cdjVarArr[1] = defpackage.anu.a.b(anyVarA);
                cdjVarArr[2] = defpackage.bmf.a.b((defpackage.bme) objR);
                defpackage.den.ac(cdjVarArr, defpackage.cfo.j(-1750539308, new defpackage.bec(bwoVar, aonnVar, 4, null), cavVarB), cavVarB, 48);
            }
            float fD = defpackage.cqg.d(j);
            float fC = defpackage.cqg.c(j);
            float fB = defpackage.cqg.b(j);
            float[] fArr = defpackage.crp.a;
            objR = new defpackage.bme(j, defpackage.cfd.N(fD, fC, fB, 0.4f, defpackage.crp.y[(int) (j & 63)]));
            cbtVar.ab(objR);
            defpackage.cdj[] cdjVarArr2 = new defpackage.cdj[3];
            cdjVarArr2[c] = a.b(bqvVar);
            cdjVarArr2[1] = defpackage.anu.a.b(anyVarA);
            cdjVarArr2[2] = defpackage.bmf.a.b((defpackage.bme) objR);
            defpackage.den.ac(cdjVarArr2, defpackage.cfo.j(-1750539308, new defpackage.bec(bwoVar, aonnVar, 4, null), cavVarB), cavVarB, 48);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(borVar, bryVar, btiVar, bwoVar, aonnVar, i, 4);
        }
    }
}
