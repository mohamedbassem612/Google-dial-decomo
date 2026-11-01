package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aim {
    public static final defpackage.aku a;
    private static final defpackage.aku b = new defpackage.aku(1.0f, 1500.0f, null);
    private static final defpackage.aku c = new defpackage.aku(1.0f, 1500.0f, new defpackage.dpi(0.4f));

    static {
        defpackage.amd.a();
        a = new defpackage.aku(1.0f, 1500.0f, 1);
    }

    public static final defpackage.cer a(float f, defpackage.aiq aiqVar, defpackage.cav cavVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            aiqVar = c;
        }
        return c(new defpackage.dpi(f), defpackage.alo.c, aiqVar, null, "DpAnimation", cavVar, i & 14, 8);
    }

    public static final defpackage.cer b(float f, defpackage.aiq aiqVar, java.lang.String str, defpackage.cav cavVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            aiqVar = b;
        }
        float f2 = (i2 & 4) != 0 ? 0.01f : 0.0f;
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        java.lang.String str2 = str;
        if (aiqVar != b || f2 == 0.01f) {
            cavVar.u(1144320933);
            cavVar.o();
        } else {
            cavVar.u(1144211007);
            boolean z = true;
            if ((((i & 896) ^ 384) <= 256 || !cavVar.y(f2)) && (i & 384) != 256) {
                z = false;
            }
            java.lang.Object objG = cavVar.g();
            if (z || objG == defpackage.cau.a) {
                defpackage.aku akuVar = new defpackage.aku(1.0f, 1500.0f, java.lang.Float.valueOf(f2));
                cavVar.w(akuVar);
                objG = akuVar;
            }
            aiqVar = (defpackage.aku) objG;
            cavVar.o();
        }
        return c(java.lang.Float.valueOf(f), defpackage.alo.a, aiqVar, f2 == 0.01f ? null : java.lang.Float.valueOf(f2), str2, cavVar, (i & 14) | ((i << 3) & 57344), 0);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0098 A[PHI: r6
      0x0098: PHI (r6v7 nf) = (r6v4 nf), (r6v8 nf) binds: [B:37:0x0096, B:33:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1 A[PHI: r7
      0x00e1: PHI (r7v20 java.lang.String) = (r7v17 java.lang.String), (r7v21 java.lang.String) binds: [B:63:0x00df, B:59:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    public static final defpackage.cer c(java.lang.Object obj, defpackage.nf nfVar, defpackage.aiq aiqVar, java.lang.Object obj2, java.lang.String str, defpackage.cav cavVar, int i, int i2) {
        defpackage.aiq aiqVar2;
        boolean z;
        defpackage.nf nfVar2;
        boolean z2;
        java.lang.String str2;
        boolean zB;
        java.lang.Object objG;
        defpackage.aik aikVar;
        if ((i2 & 4) != 0) {
            java.lang.Object objG2 = cavVar.g();
            if (objG2 == defpackage.cau.a) {
                objG2 = new defpackage.aku(1.0f, 1500.0f, null);
                cavVar.w(objG2);
            }
            aiqVar2 = (defpackage.aku) objG2;
        } else {
            aiqVar2 = aiqVar;
        }
        java.lang.Object obj3 = (i2 & 8) != 0 ? null : obj2;
        java.lang.Object objG3 = cavVar.g();
        java.lang.Object obj4 = defpackage.cau.a;
        if (objG3 == obj4) {
            defpackage.cdy cdyVar = new defpackage.cdy(cavVar.h(), defpackage.aols.a);
            cavVar.w(cdyVar);
            objG3 = cdyVar;
        }
        defpackage.aoss aossVar = (defpackage.aoss) objG3;
        java.lang.Object objG4 = cavVar.g();
        if (objG4 == obj4) {
            defpackage.aiq aiqVar3 = aiqVar2;
            java.lang.Object obj5 = obj3;
            defpackage.aik aikVar2 = new defpackage.aik(obj, nfVar, aiqVar3, obj5, str, aossVar);
            obj3 = obj5;
            aiqVar2 = aiqVar3;
            cavVar.w(aikVar2);
            objG4 = aikVar2;
            z = false;
        } else {
            z = true;
        }
        defpackage.aik aikVar3 = (defpackage.aik) objG4;
        if (!z) {
            cavVar.u(-2111593986);
            cavVar.o();
            return aikVar3;
        }
        cavVar.u(-2111846729);
        boolean z3 = (((i & 14) ^ 6) > 4 && cavVar.D(obj)) || (i & 6) == 4;
        if (((i & 112) ^ 48) > 32) {
            nfVar2 = nfVar;
            if (cavVar.D(nfVar2)) {
                z2 = true;
            }
            boolean z4 = z3 | z2 | ((((i & 896) ^ 384) <= 256 && cavVar.D(aiqVar2)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) <= 2048 && cavVar.D(obj3)) || (i & 3072) == 2048);
            if (((57344 & i) ^ 24576) > 16384) {
                str2 = str;
                if (!cavVar.B(str2)) {
                }
                zB = z4 | z | cavVar.B(null);
                objG = cavVar.g();
                if (!zB || objG == obj4) {
                    aikVar = aikVar3;
                    ail ailVar = new ail(aikVar, obj, nfVar2, aiqVar2, obj3, str2);
                    cavVar.w(ailVar);
                    objG = ailVar;
                } else {
                    aikVar = aikVar3;
                }
                cavVar.r((defpackage.aomy) objG);
                cavVar.o();
                return aikVar;
            }
            str2 = str;
            boolean z5 = (i & 24576) == 16384;
            zB = z4 | z5 | cavVar.B(null);
            objG = cavVar.g();
            if (zB) {
                aikVar = aikVar3;
                ail ailVar2 = new ail(aikVar, obj, nfVar2, aiqVar2, obj3, str2);
                cavVar.w(ailVar2);
                objG = ailVar2;
            } else {
                aikVar = aikVar3;
                ail ailVar3 = new ail(aikVar, obj, nfVar2, aiqVar2, obj3, str2);
                cavVar.w(ailVar3);
                objG = ailVar3;
            }
            cavVar.r((defpackage.aomy) objG);
            cavVar.o();
            return aikVar;
        }
        nfVar2 = nfVar;
        if ((i & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z3 | z2 | ((((i & 896) ^ 384) <= 256 && cavVar.D(aiqVar2)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) <= 2048 && cavVar.D(obj3)) || (i & 3072) == 2048);
        if (((57344 & i) ^ 24576) > 16384) {
            str2 = str;
            if (!cavVar.B(str2)) {
            }
            zB = z6 | z5 | cavVar.B(null);
            objG = cavVar.g();
            if (zB) {
                aikVar = aikVar3;
                ail ailVar4 = new ail(aikVar, obj, nfVar2, aiqVar2, obj3, str2);
                cavVar.w(ailVar4);
                objG = ailVar4;
            } else {
                aikVar = aikVar3;
                ail ailVar5 = new ail(aikVar, obj, nfVar2, aiqVar2, obj3, str2);
                cavVar.w(ailVar5);
                objG = ailVar5;
            }
            cavVar.r((defpackage.aomy) objG);
            cavVar.o();
            return aikVar;
        }
        str2 = str;
        if ((i & 24576) == 16384) {
        }
        zB = z6 | z5 | cavVar.B(null);
        objG = cavVar.g();
        if (zB) {
            aikVar = aikVar3;
            ail ailVar6 = new ail(aikVar, obj, nfVar2, aiqVar2, obj3, str2);
            cavVar.w(ailVar6);
            objG = ailVar6;
        } else {
            aikVar = aikVar3;
            ail ailVar7 = new ail(aikVar, obj, nfVar2, aiqVar2, obj3, str2);
            cavVar.w(ailVar7);
            objG = ailVar7;
        }
        cavVar.r((defpackage.aomy) objG);
        cavVar.o();
        return aikVar;
    }
}
