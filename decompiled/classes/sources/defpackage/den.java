package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class den {
    public static boolean g;

    public den(defpackage.caz cazVar) {
        cazVar.v();
    }

    public static void A(defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(441837433);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new defpackage.cyc(null);
                cbtVar.ab(objR);
            }
            defpackage.cyc cycVar = (defpackage.cyc) objR;
            java.lang.Object objR2 = cbtVar.R();
            int i4 = 8;
            if (objR2 == obj) {
                objR2 = new defpackage.cbz(i4);
                cbtVar.ab(objR2);
            }
            defpackage.aomy aomyVar = (defpackage.aomy) objR2;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.ckc ckcVar = new defpackage.ckc(7);
            if (cbtVar.w) {
                cavVarB.i(defpackage.aojh.a, new defpackage.bae(ckcVar, 6));
            }
            defpackage.cev.c(cavVarB, cycVar, new defpackage.bbd(i4));
            aonoVar.a(cycVar, cavVarB, java.lang.Integer.valueOf((i2 << 3) & 112));
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ajs(aonoVar, i, 10);
        }
    }

    public static long B(defpackage.cyb cybVar, defpackage.cxi cxiVar, defpackage.cxi cxiVar2, boolean z) {
        defpackage.cxi cxiVarDe = cybVar.de(cxiVar);
        boolean z2 = cxiVarDe instanceof defpackage.cya;
        defpackage.cxi cxiVarDe2 = cybVar.de(cxiVar2);
        if (z2) {
            return ((defpackage.cya) cxiVarDe).j(cxiVarDe2, 0L, z);
        }
        return cxiVarDe2 instanceof defpackage.cya ? ((defpackage.cya) cxiVarDe2).j(cxiVarDe, 0L, z) ^ (-9223372034707292160L) : cxiVarDe.j(cxiVarDe, 0L, z);
    }

    public static defpackage.cmw C(defpackage.cmw cmwVar, defpackage.aono aonoVar) {
        return cmwVar.a(new defpackage.cxj(aonoVar));
    }

    public static long D(defpackage.cxi cxiVar) {
        defpackage.cxi cxiVarDn = cxiVar.dn();
        if (cxiVarDn != null) {
            return cxiVarDn.i(cxiVar, 0L);
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.cpn E(defpackage.cxi cxiVar) {
        defpackage.cxi cxiVarDn = cxiVar.dn();
        if (cxiVarDn != null) {
            return cxiVarDn.q(cxiVar, true);
        }
        long j = ((defpackage.czc) cxiVar).c;
        return new defpackage.cpn(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L));
    }

    public static defpackage.cpn F(defpackage.cxi cxiVar, boolean z) {
        float f;
        float f2;
        defpackage.cxi cxiVarG = G(cxiVar);
        long jH = cxiVarG.h() >> 32;
        long jH2 = cxiVarG.h() & 4294967295L;
        defpackage.cpn cpnVarQ = cxiVarG.q(cxiVar, z);
        float f3 = (int) jH;
        if (z) {
            f = cpnVarQ.b;
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > f3) {
                f = f3;
            }
        } else {
            f = cpnVarQ.b;
        }
        float f4 = (int) jH2;
        if (z) {
            f2 = cpnVarQ.c;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > f4) {
                f2 = f4;
            }
        } else {
            f2 = cpnVarQ.c;
        }
        if (z) {
            float f5 = cpnVarQ.d;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 <= f3) {
                f3 = f5;
            }
        } else {
            f3 = cpnVarQ.d;
        }
        if (z) {
            float f6 = cpnVarQ.e;
            float f7 = f6 >= 0.0f ? f6 : 0.0f;
            if (f7 <= f4) {
                f4 = f7;
            }
        } else {
            f4 = cpnVarQ.e;
        }
        if (f == f3 || f2 == f4) {
            return defpackage.cpn.a;
        }
        long jM = cxiVarG.m((((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L));
        float f8 = f4;
        long jM2 = cxiVarG.m((((long) java.lang.Float.floatToRawIntBits(f3)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L));
        long jM3 = cxiVarG.m((((long) java.lang.Float.floatToRawIntBits(f3)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f8)) & 4294967295L));
        long jM4 = cxiVarG.m((((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f8)) & 4294967295L));
        int i = (int) (jM2 >> 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jM >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (jM4 >> 32));
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (jM3 >> 32));
        float fMin = java.lang.Math.min(fIntBitsToFloat, java.lang.Math.min(fIntBitsToFloat2, java.lang.Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = java.lang.Math.max(fIntBitsToFloat, java.lang.Math.max(fIntBitsToFloat2, java.lang.Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (jM & 4294967295L));
        float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (jM2 & 4294967295L));
        float fIntBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (jM4 & 4294967295L));
        float fIntBitsToFloat8 = java.lang.Float.intBitsToFloat((int) (jM3 & 4294967295L));
        return new defpackage.cpn(fMin, java.lang.Math.min(fIntBitsToFloat5, java.lang.Math.min(fIntBitsToFloat6, java.lang.Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, java.lang.Math.max(fIntBitsToFloat5, java.lang.Math.max(fIntBitsToFloat6, java.lang.Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static defpackage.cxi G(defpackage.cxi cxiVar) {
        defpackage.cxi cxiVar2;
        defpackage.cxi cxiVarDn = cxiVar.dn();
        while (true) {
            defpackage.cxi cxiVar3 = cxiVarDn;
            cxiVar2 = cxiVar;
            cxiVar = cxiVar3;
            if (cxiVar == null) {
                break;
            }
            cxiVarDn = cxiVar.dn();
        }
        defpackage.dck dckVar = cxiVar2 instanceof defpackage.dck ? (defpackage.dck) cxiVar2 : null;
        if (dckVar == null) {
            return cxiVar2;
        }
        defpackage.dck dckVar2 = dckVar.A;
        while (dckVar2 != null) {
            defpackage.dck dckVar3 = dckVar2;
            dckVar2 = dckVar2.A;
            dckVar = dckVar3;
        }
        return dckVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
    public static void H(defpackage.csj csjVar, defpackage.cso csoVar) {
        defpackage.cqf cqfVar;
        defpackage.cqf cqfVar2;
        float f;
        float f2;
        android.graphics.Matrix matrix;
        defpackage.cqf cqfVarB = csjVar.q().b();
        defpackage.cso csoVar2 = csjVar.q().a;
        if (csoVar.i) {
            return;
        }
        long j = csoVar.d;
        android.graphics.Canvas canvas = defpackage.cpr.a;
        if (cqfVarB == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        }
        defpackage.cpq cpqVar = (defpackage.cpq) cqfVarB;
        android.graphics.Canvas canvas2 = cpqVar.a;
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = csoVar.j;
            long j3 = j2 >> 32;
            float f3 = csoVar.l;
            float f4 = csoVar.m;
            long j4 = csoVar.k;
            long j5 = j4 >> 32;
            float f5 = csoVar.n;
            long j6 = j4 & 4294967295L;
            float f6 = csoVar.o;
            float fA = csoVar.a();
            defpackage.csp cspVar = csoVar.s;
            int i = cspVar.g;
            float f7 = (int) (j2 & 4294967295L);
            float f8 = (int) j3;
            float f9 = f8 - f3;
            float f10 = f7 - f4;
            if (fA >= 1.0f && i == 3) {
                if (cspVar.w != 1) {
                    canvas2.save();
                    f = f9;
                    f2 = f10;
                    canvas2 = canvas2;
                }
                canvas2.translate(f, f2);
                matrix = cspVar.e;
                if (matrix == null) {
                    matrix = new android.graphics.Matrix();
                    cspVar.e = matrix;
                }
                da$.ExternalSyntheticApiModelOutline0.m(cspVar.b, matrix);
                matrix.preTranslate(csoVar.l, csoVar.m);
                canvas2.concat(matrix);
                csoVar.d = defpackage.mni.aM(csoVar.d, (((long) java.lang.Float.floatToRawIntBits(csoVar.l)) << 32) | (((long) java.lang.Float.floatToRawIntBits(csoVar.m)) & 4294967295L));
            }
            defpackage.cpv cpvVar = csoVar.r;
            if (cpvVar == null) {
                cpvVar = new defpackage.cpv();
                csoVar.r = cpvVar;
            }
            float f11 = f7 + ((int) j6) + f6;
            float f12 = f8 + ((int) j5) + f5;
            cpvVar.h(fA);
            cpvVar.i(i);
            cpvVar.k(null);
            android.graphics.Paint paintN = defpackage.cdh.n(cpvVar);
            f = f9;
            f2 = f10;
            canvas2 = canvas2;
            canvas2.saveLayer(f, f2, f12, f11, paintN);
            canvas2.translate(f, f2);
            matrix = cspVar.e;
            if (matrix == null) {
                matrix = new android.graphics.Matrix();
                cspVar.e = matrix;
            }
            da$.ExternalSyntheticApiModelOutline0.m(cspVar.b, matrix);
            matrix.preTranslate(csoVar.l, csoVar.m);
            canvas2.concat(matrix);
            csoVar.d = defpackage.mni.aM(csoVar.d, (((long) java.lang.Float.floatToRawIntBits(csoVar.l)) << 32) | (((long) java.lang.Float.floatToRawIntBits(csoVar.m)) & 4294967295L));
        }
        csoVar.d();
        if (!fn$.ExternalSyntheticApiModelOutline0.m(csoVar.s.b)) {
            try {
                csoVar.h();
            } catch (java.lang.Throwable unused) {
            }
        }
        boolean z = false;
        boolean z2 = csoVar.b() > 0.0f;
        if (z2) {
            cqfVarB.d();
        }
        if (zIsHardwareAccelerated == 0 && csoVar.q) {
            z = true;
        }
        if (z) {
            cqfVarB.g();
            defpackage.cqx cqxVarC = csoVar.c();
            if (cqxVarC instanceof defpackage.cqv) {
                cqfVarB.o(((defpackage.cqv) cqxVarC).a);
            } else if (cqxVarC instanceof defpackage.cqw) {
                defpackage.cpx cpxVar = csoVar.u;
                if (cpxVar != null) {
                    cpxVar.l();
                } else {
                    cpxVar = new defpackage.cpx((byte[]) null);
                    csoVar.u = cpxVar;
                }
                cpxVar.q(((defpackage.cqw) cqxVarC).a, 1);
                cqfVarB.q(cpxVar);
            } else {
                if (!(cqxVarC instanceof defpackage.cqu)) {
                    throw new defpackage.aois();
                }
                cqfVarB.q(((defpackage.cqu) cqxVarC).a);
            }
        }
        if (csoVar2 != null) {
            defpackage.csn csnVar = csoVar2.h;
            if (!csnVar.c) {
                defpackage.cqp.a("Only add dependencies during a tracking");
            }
            defpackage.ady adyVar = csnVar.d;
            if (adyVar != null) {
                adyVar.j(csoVar);
            } else if (csnVar.a != null) {
                defpackage.ady adyVar2 = defpackage.adz.a;
                defpackage.ady adyVar3 = new defpackage.ady(6);
                defpackage.cso csoVar3 = csnVar.a;
                if (csoVar3 == null) {
                    defpackage.aooh.g();
                }
                adyVar3.j(csoVar3);
                adyVar3.j(csoVar);
                csnVar.d = adyVar3;
                csnVar.a = null;
            } else {
                csnVar.a = csoVar;
            }
            defpackage.ady adyVar4 = csnVar.e;
            if (adyVar4 != null) {
                if (adyVar4.l(csoVar)) {
                    cqfVar = null;
                }
            } else if (csnVar.b == csoVar) {
                cqfVar = null;
                csnVar.b = null;
            }
            cqfVar = null;
            csoVar.g++;
        } else {
            cqfVar = null;
        }
        if (cqfVarB == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        }
        if (cpqVar.a.isHardwareAccelerated()) {
            defpackage.csp cspVar2 = csoVar.s;
            if (cqfVarB == null) {
                defpackage.aooh.h(r5);
                cqfVar2 = cqfVar;
            } else {
                cqfVar2 = cqfVarB;
            }
            da$.ExternalSyntheticApiModelOutline0.m(((defpackage.cpq) cqfVar2).a, cspVar2.b);
        } else {
            defpackage.csh cshVar = csoVar.f;
            if (cshVar == null) {
                cshVar = new defpackage.csh();
                csoVar.f = cshVar;
            }
            defpackage.dpf dpfVar = csoVar.a;
            defpackage.dpq dpqVar = csoVar.b;
            long jL = defpackage.dpy.l(csoVar.k);
            defpackage.csg csgVar = cshVar.b;
            defpackage.dpf dpfVarC = csgVar.c();
            defpackage.dpq dpqVarD = csgVar.d();
            defpackage.cqf cqfVarB2 = csgVar.b();
            long jA = csgVar.a();
            defpackage.cso csoVar4 = csgVar.a;
            csgVar.f(dpfVar);
            csgVar.g(dpqVar);
            csgVar.e(cqfVarB);
            csgVar.h(jL);
            csgVar.a = csoVar;
            cqfVarB.g();
            try {
                csoVar.f(cshVar);
                cqfVarB.e();
                defpackage.csg csgVar2 = cshVar.b;
                csgVar2.f(dpfVarC);
                csgVar2.g(dpqVarD);
                csgVar2.e(cqfVarB2);
                csgVar2.h(jA);
                csgVar2.a = csoVar4;
            } catch (java.lang.Throwable th) {
                cqfVarB.e();
                defpackage.csg csgVar3 = cshVar.b;
                csgVar3.f(dpfVarC);
                csgVar3.g(dpqVarD);
                csgVar3.e(cqfVarB2);
                csgVar3.h(jA);
                csgVar3.a = csoVar4;
                throw th;
            }
        }
        if (z) {
            cqfVarB.e();
        }
        if (z2) {
            cqfVarB.c();
        }
        if (!zIsHardwareAccelerated) {
            canvas2.restore();
        }
        csoVar.d = j;
    }

    public static long I(defpackage.csj csjVar) {
        return ((defpackage.csh) csjVar).b.a();
    }

    public static /* synthetic */ void J(defpackage.csj csjVar, long j, long j2, float f, defpackage.cqh cqhVar, int i) {
        if ((i & 4) != 0) {
            j2 = defpackage.mni.aM(csjVar.o(), 0L);
        }
        csjVar.s(j, 0L, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? defpackage.csl.a : null, (i & 32) != 0 ? null : cqhVar, (i & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void K(defpackage.csj csjVar, defpackage.cpu cpuVar, defpackage.cqh cqhVar, int i) {
        defpackage.csl cslVar = (i & 8) != 0 ? defpackage.csl.a : null;
        float f = (i & 4) != 0 ? 1.0f : 0.0f;
        if ((i & 16) != 0) {
            cqhVar = null;
        }
        csjVar.A(cpuVar, f, cslVar, cqhVar);
    }

    public static /* synthetic */ void L(defpackage.csj csjVar, defpackage.cpu cpuVar, long j, long j2, float f, defpackage.cqh cqhVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            j = (((long) cpuVar.b()) & 4294967295L) | (((long) cpuVar.c()) << 32);
        }
        long j3 = j;
        csjVar.z(cpuVar, j3, (i2 & 16) != 0 ? j3 : j2, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? defpackage.csl.a : null, (i2 & 128) != 0 ? null : cqhVar, (i2 & 256) != 0 ? 3 : 0, (((i2 & 512) == 0 ? 1 : 0) ^ 1) | i);
    }

    public static float M(float[] fArr) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static boolean N(double d, defpackage.cru cruVar, defpackage.cru cruVar2) {
        return java.lang.Math.abs(cruVar.a(d) - cruVar2.a(d)) <= 0.001d;
    }

    public static /* synthetic */ void O(defpackage.csj csjVar, long j, float f, float f2, long j2, long j3, defpackage.den denVar, int i) {
        if ((i & 16) != 0) {
            j2 = 0;
        }
        if ((i & 32) != 0) {
            j3 = defpackage.mni.aM(csjVar.o(), j2);
        }
        csjVar.u(j, f, f2, j2, j3, denVar);
    }

    public static /* synthetic */ void P(defpackage.csj csjVar, defpackage.cqd cqdVar, long j, long j2, float f, defpackage.den denVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            j2 = defpackage.mni.aM(csjVar.o(), j);
        }
        if ((i2 & 8) != 0) {
            f = 1.0f;
        }
        if ((i2 & 16) != 0) {
            denVar = defpackage.csl.a;
        }
        if ((i2 & 64) != 0) {
            i = 3;
        }
        csjVar.t(cqdVar, j, j2, f, denVar, i);
    }

    public static /* synthetic */ void Q(defpackage.csj csjVar, defpackage.cqd cqdVar, long j, long j2, long j3, defpackage.den denVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = defpackage.mni.aM(csjVar.o(), j);
        }
        if ((i & 8) != 0) {
            j3 = 0;
        }
        float f = (i & 16) != 0 ? 1.0f : 0.0f;
        if ((i & 32) != 0) {
            denVar = defpackage.csl.a;
        }
        csjVar.w(cqdVar, j, j2, j3, f, denVar);
    }

    public static /* synthetic */ void R(defpackage.csj csjVar, long j, float f, long j2, defpackage.den denVar, int i) {
        if ((i & 2) != 0) {
            f = defpackage.cpp.a(csjVar.o()) / 2.0f;
        }
        if ((i & 4) != 0) {
            j2 = csjVar.n();
        }
        float f2 = (i & 8) != 0 ? 1.0f : 0.0f;
        if ((i & 16) != 0) {
            denVar = defpackage.csl.a;
        }
        csjVar.C(j, f, j2, f2, denVar);
    }

    public static /* synthetic */ void S(defpackage.csj csjVar, defpackage.cpx cpxVar, long j, defpackage.den denVar, int i) {
        if ((i & 8) != 0) {
            denVar = defpackage.csl.a;
        }
        csjVar.B(cpxVar, j, (i & 4) != 0 ? 1.0f : 0.0f, denVar);
    }

    public static /* synthetic */ void T(defpackage.csj csjVar, defpackage.cpx cpxVar, defpackage.cqd cqdVar, float f, defpackage.den denVar, int i) {
        if ((i & 8) != 0) {
            denVar = defpackage.csl.a;
        }
        int i2 = (i & 32) != 0 ? 3 : 0;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        csjVar.y(cpxVar, cqdVar, f, denVar, i2);
    }

    public static int U(defpackage.cnc cncVar) {
        return cncVar.a;
    }

    public static boolean V(defpackage.die dieVar) {
        if (defpackage.aooh.n(dieVar.g(defpackage.din.s), defpackage.cnh.a)) {
            return false;
        }
        defpackage.adw adwVar = dieVar.c;
        return defpackage.adw.f(adwVar, defpackage.did.g) || defpackage.adw.f(adwVar, defpackage.did.h);
    }

    public static boolean W(defpackage.cmu cmuVar, defpackage.aonj aonjVar) {
        return ((java.lang.Boolean) aonjVar.a(cmuVar)).booleanValue();
    }

    public static java.lang.Object[] X(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static java.util.List Y(defpackage.cfp cfpVar, int i, defpackage.cfp cfpVar2, boolean z, boolean z2, boolean z3) {
        j$.util.List arrayList;
        boolean zT;
        int iJ = cfpVar.j(i);
        int i2 = i + iJ;
        int iC = cfpVar.c(i);
        int iC2 = cfpVar.c(i2);
        int i3 = iC2 - iC;
        boolean z4 = i >= 0 && (cfpVar.b[(cfpVar.h(i) * 5) + 1] & 201326592) != 0;
        cfpVar2.B(iJ);
        cfpVar2.C(i3, cfpVar2.o);
        if (cfpVar.f < i2) {
            cfpVar.E(i2);
        }
        if (cfpVar.j < iC2) {
            cfpVar.F(iC2, i2);
        }
        int[] iArr = cfpVar2.b;
        int i4 = cfpVar2.o;
        int i5 = i4 * 5;
        defpackage.ajsz.db(cfpVar.b, iArr, i5, i * 5, i2 * 5);
        java.lang.Object[] objArr = cfpVar2.c;
        int i6 = cfpVar2.h;
        java.lang.System.arraycopy(cfpVar.c, iC, objArr, i6, i3);
        int i7 = cfpVar2.q;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iJ;
        int iD = i6 - cfpVar2.d(iArr, i4);
        int i10 = cfpVar2.l;
        int i11 = cfpVar2.k;
        int length = objArr.length;
        int i12 = i10;
        boolean z5 = z4;
        int i13 = i4;
        while (i13 < i9) {
            int i14 = i13 * 5;
            if (i13 != i4) {
                int i15 = i14 + 2;
                iArr[i15] = iArr[i15] + i8;
            }
            int[] iArr2 = iArr;
            int iD2 = cfpVar2.d(iArr, i13) + iD;
            int i16 = i4;
            if (iD2 > (i12 < i13 ? 0 : cfpVar2.j)) {
                iD2 = -(((length - i11) - iD2) + 1);
            }
            iArr2[i14 + 4] = iD2;
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i16;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        cfpVar2.l = i12;
        int iA = defpackage.cfo.a(cfpVar.d, i, cfpVar.g());
        int iA2 = defpackage.cfo.a(cfpVar.d, i2, cfpVar.g());
        if (iA < iA2) {
            java.util.ArrayList arrayList2 = cfpVar.d;
            arrayList = new java.util.ArrayList(iA2 - iA);
            for (int i17 = iA; i17 < iA2; i17++) {
                defpackage.cfh cfhVar = (defpackage.cfh) arrayList2.get(i17);
                cfhVar.a += i8;
                arrayList.add(cfhVar);
            }
            cfpVar2.d.addAll(defpackage.cfo.a(cfpVar2.d, cfpVar2.o, cfpVar2.g()), arrayList);
            arrayList2.subList(iA, iA2).clear();
        } else {
            arrayList = defpackage.aokc.a;
        }
        if (!arrayList.isEmpty()) {
            java.util.HashMap map = cfpVar.e;
            java.util.HashMap map2 = cfpVar2.e;
            if (map != null && map2 != null) {
                int size = arrayList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    defpackage.cfh cfhVar2 = (defpackage.cfh) arrayList.get(i18);
                    rr rrVar = (rr) map.get(cfhVar2);
                    if (rrVar != null) {
                        map.remove(cfhVar2);
                        map2.put(cfhVar2, rrVar);
                    }
                }
            }
        }
        int i19 = cfpVar2.q;
        if (cfpVar2.Y(i7) != null) {
            int i20 = i19 + 1;
            int i21 = cfpVar2.o;
            while (i20 < i21) {
                i20 += cfpVar2.b[(i20 * 5) + 3];
            }
            throw null;
        }
        int iL = cfpVar.l(i);
        if (z3) {
            if (z) {
                int i22 = iL ^ (-1);
                if (i22 < 0) {
                    cfpVar.J();
                    cfpVar.v(iL - cfpVar.o);
                    cfpVar.J();
                }
                cfpVar.v(i - cfpVar.o);
                zT = cfpVar.T();
                if (i22 < 0) {
                    cfpVar.I();
                    cfpVar.V();
                    cfpVar.I();
                    cfpVar.V();
                }
            } else {
                boolean zU = cfpVar.U(i, iJ);
                cfpVar.H(iC, i3, i - 1);
                zT = zU;
            }
            if (zT) {
                defpackage.cax.b("Unexpectedly removed anchors");
            }
        }
        int i23 = cfpVar2.n;
        int i24 = iArr3[i5 + 1];
        cfpVar2.n = i23 + ((1073741824 & i24) != 0 ? 1 : i24 & 67108863);
        if (z2) {
            cfpVar2.o = i9;
            cfpVar2.h = i6 + i3;
        }
        if (z5) {
            cfpVar2.O(i7);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [cew, java.lang.Object] */
    public static defpackage.cje Z(defpackage.cdj[] cdjVarArr, defpackage.cje cjeVar, defpackage.cje cjeVar2) {
        defpackage.cjd cjdVar = new defpackage.cjd(defpackage.cje.d);
        for (defpackage.cdj cdjVar : cdjVarArr) {
            defpackage.cbd cbdVar = cdjVar.a;
            if (cdjVar.g || !cjeVar.containsKey(cbdVar)) {
                ?? r4 = cjeVar2.get(cbdVar);
                if (cdjVar == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                }
                cjdVar.put(cbdVar, defpackage.cbd.c(cdjVar, r4));
            }
        }
        return cjdVar.a();
    }

    public static int aA(defpackage.bef befVar, boolean z) {
        long j = befVar.j(0);
        return (int) (z ? j & 4294967295L : j >> 32);
    }

    public static float aB(int i, int i2, boolean z) {
        float f = i2 + (i * 500);
        return z ? f + 100.0f : f;
    }

    public static void aC(java.lang.Object obj, int i, defpackage.bel belVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(872548579);
        boolean z = true;
        if (i4 == 0) {
            i3 = (true != cavVarB.D(obj) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.z(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? cavVarB.B(belVar) : cavVarB.D(belVar)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            boolean zB = cavVarB.B(obj);
            if ((i3 & 896) != 256 && ((i3 & 512) == 0 || !cavVarB.B(belVar))) {
                z = false;
            }
            boolean z2 = zB | z;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (z2 || objR == defpackage.cau.a) {
                objR = new defpackage.bek(obj, belVar);
                cbtVar.ab(objR);
            }
            defpackage.bek bekVar = (defpackage.bek) objR;
            bekVar.b = i;
            defpackage.bek bekVar2 = (defpackage.bek) cavVarB.e(defpackage.cza.a);
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            try {
                if (bekVar2 != bekVar.c()) {
                    bekVar.e.b(bekVar2);
                    if (bekVar.c > 0) {
                        defpackage.bek bekVar3 = bekVar.f;
                        if (bekVar3 != null) {
                            bekVar3.a();
                        }
                        if (bekVar2 != null) {
                            bekVar2.d();
                        } else {
                            bekVar2 = null;
                        }
                        bekVar.f = bekVar2;
                    }
                }
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                boolean zB2 = cavVarB.B(bekVar);
                java.lang.Object objR2 = cbtVar.R();
                if (zB2 || objR2 == defpackage.cau.a) {
                    objR2 = new defpackage.afz(bekVar, 14);
                    cbtVar.ab(objR2);
                }
                defpackage.cbp.c(bekVar, (defpackage.aonj) objR2, cavVarB);
                ab(defpackage.cza.a.b(bekVar), aonnVar, cavVarB, ((i3 >> 6) & 112) | 8);
            } catch (java.lang.Throwable th) {
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                throw th;
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.buo(obj, i, belVar, aonnVar, i2, 1);
        }
    }

    public static void aD(defpackage.aomy aomyVar, final defpackage.cmw cmwVar, final defpackage.beo beoVar, final defpackage.bed bedVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1055276397);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(beoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? cavVarB.B(bedVar) : cavVarB.D(bedVar)) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            final defpackage.cer cerVarG = defpackage.cdh.g(aomyVar, cavVarB);
            ay(defpackage.cfo.j(-933153643, new defpackage.aono() { // from class: bea
                @Override // defpackage.aono
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.cmw cmwVarA;
                    final bfc bfcVar;
                    defpackage.cjt cjtVar = (defpackage.cjt) obj;
                    defpackage.cav cavVar2 = (defpackage.cav) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != ((iIntValue & 8) == 0 ? cavVar2.B(cjtVar) : cavVar2.D(cjtVar)) ? 2 : 4;
                    }
                    int i4 = 0;
                    if (cavVar2.H((iIntValue & 19) != 18, iIntValue & 1)) {
                        java.lang.Object objG = cavVar2.g();
                        java.lang.Object obj4 = defpackage.cau.a;
                        if (objG == obj4) {
                            defpackage.aogc aogcVar = new defpackage.aogc(cjtVar, new defpackage.ml(cerVarG, 15));
                            cavVar2.w(aogcVar);
                            objG = aogcVar;
                        }
                        final defpackage.aogc aogcVar2 = (defpackage.aogc) objG;
                        java.lang.Object objG2 = cavVar2.g();
                        if (objG2 == obj4) {
                            objG2 = new defpackage.adnp(new defpackage.bdz(aogcVar2));
                            cavVar2.w(objG2);
                        }
                        final defpackage.beo beoVar2 = beoVar;
                        final defpackage.adnp adnpVar = (defpackage.adnp) objG2;
                        byte[] bArr = null;
                        if (beoVar2 != null) {
                            cavVar2.u(1743490539);
                            cavVar2.u(887527095);
                            if (android.os.Build.FINGERPRINT == null || !defpackage.aooh.n(android.os.Build.FINGERPRINT, "robolectric")) {
                                cavVar2.u(1345729441);
                                android.view.View view = (android.view.View) cavVar2.e(defpackage.dep.f);
                                boolean zB = cavVar2.B(view);
                                java.lang.Object objG3 = cavVar2.g();
                                if (zB || objG3 == obj4) {
                                    java.lang.Object tag = view.getTag(2131427789);
                                    objG3 = tag instanceof defpackage.bfb ? (defpackage.bfb) tag : null;
                                    if (objG3 == null) {
                                        objG3 = new defpackage.bcr(view);
                                        view.setTag(2131427789, objG3);
                                    }
                                    cavVar2.w(objG3);
                                }
                                bfcVar = (defpackage.bfb) objG3;
                                cavVar2.o();
                            } else {
                                cavVar2.u(1345548711);
                                java.lang.Object objG4 = cavVar2.g();
                                if (objG4 == obj4) {
                                    objG4 = new bfc();
                                    cavVar2.w(objG4);
                                }
                                bfcVar = (bfc) objG4;
                                cavVar2.o();
                            }
                            cavVar2.o();
                            boolean zB2 = cavVar2.B(beoVar2) | cavVar2.D(aogcVar2) | cavVar2.D(adnpVar) | cavVar2.D(bfcVar);
                            java.lang.Object objG5 = cavVar2.g();
                            if (zB2 || objG5 == obj4) {
                                objG5 = new defpackage.aonj() { // from class: beb
                                    @Override // defpackage.aonj
                                    public final java.lang.Object a(java.lang.Object obj5) {
                                        defpackage.apkl apklVar = new defpackage.apkl(aogcVar2, adnpVar, bfcVar);
                                        defpackage.beo beoVar3 = beoVar2;
                                        beoVar3.f = apklVar;
                                        return new defpackage.alj(beoVar3, 3);
                                    }
                                };
                                cavVar2.w(objG5);
                            }
                            defpackage.aonj aonjVar = (defpackage.aonj) objG5;
                            boolean zB3 = cavVar2.B(beoVar2) | cavVar2.B(aogcVar2) | cavVar2.B(adnpVar) | cavVar2.B(bfcVar);
                            java.lang.Object objG6 = cavVar2.g();
                            if (zB3 || objG6 == obj4) {
                                objG6 = new defpackage.cbl(aonjVar);
                                cavVar2.w(objG6);
                            }
                            cavVar2.o();
                        } else {
                            cavVar2.u(1744076749);
                            cavVar2.o();
                        }
                        defpackage.cmw cmwVar2 = cmwVar;
                        if (beoVar2 != null && (cmwVarA = cmwVar2.a(new defpackage.bfh(beoVar2))) != null) {
                            cmwVar2 = cmwVarA;
                        }
                        defpackage.bed bedVar2 = bedVar;
                        boolean zB4 = cavVar2.B(aogcVar2) | cavVar2.B(bedVar2);
                        java.lang.Object objG7 = cavVar2.g();
                        if (zB4 || objG7 == obj4) {
                            objG7 = new defpackage.bec(aogcVar2, bedVar2, i4, bArr);
                            cavVar2.w(objG7);
                        }
                        defpackage.czl.b(adnpVar, cmwVar2, (defpackage.aonn) objG7, cavVar2, 8);
                    } else {
                        cavVar2.s();
                    }
                    return defpackage.aojh.a;
                }
            }, cavVarB), cavVarB, 6);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new biu(aomyVar, cmwVar, beoVar, bedVar, i, 1);
        }
    }

    public static int aE(defpackage.bdy bdyVar, java.lang.Object obj, int i) {
        int iA;
        if (obj == null || bdyVar.b() == 0) {
            return i;
        }
        return ((i >= bdyVar.b() || !defpackage.aooh.n(obj, bdyVar.d(i))) && (iA = bdyVar.a(obj)) != -1) ? iA : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void aF(defpackage.bdy bdyVar, java.lang.Object obj, int i, java.lang.Object obj2, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(1439843069);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(bdyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.B(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.z(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cavVarB.B(obj2) ? 1024 : 2048;
        }
        int i5 = 0;
        if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            obj.c(obj2, defpackage.cfo.j(980966366, new defpackage.bdx(bdyVar, i, obj2, i5), cavVarB), cavVarB, 48);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new dqg(bdyVar, obj, i, obj2, i2, 1);
        }
    }

    public static defpackage.aqb aG(boolean z, boolean z2, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        defpackage.aqb aqbVar = (defpackage.aqb) cavVar.e(defpackage.aqd.b);
        defpackage.dpq dpqVar = (defpackage.dpq) cavVar.e(defpackage.dfo.j);
        boolean zB = cavVar.B(aomyVar) | ((((i & 14) ^ 6) > 4 && cavVar.C(z)) || (i & 6) == 4) | cavVar.z(dpqVar.ordinal()) | cavVar.B(aqbVar) | ((((i & 112) ^ 48) > 32 && cavVar.C(z2)) || (i & 48) == 32);
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (zB || objR == defpackage.cau.a) {
            defpackage.bff bffVar = new defpackage.bff(aomyVar, z, dpqVar, z2, aqbVar);
            cbtVar.ab(bffVar);
            objR = bffVar;
        }
        return (defpackage.bff) objR;
    }

    public static int aH(defpackage.cfc cfcVar, int i) {
        int i2 = cfcVar.b - 1;
        int i3 = 0;
        while (i3 < i2) {
            java.lang.Object[] objArr = cfcVar.a;
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = ((defpackage.apnb) objArr[i4]).b;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((defpackage.apnb) objArr[i3]).b) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static int aI(int[] iArr) {
        int length = iArr.length;
        int i = Integer.MIN_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i4 > i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    public static int aJ(defpackage.bay bayVar) {
        java.util.List list = bayVar.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((defpackage.baz) list.get(i2)).h;
        }
        return (i / list.size()) + bayVar.q;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v23 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v24 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v33 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v34 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v35 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r28v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r32v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r32v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r51v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r51v0 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r52v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r52v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r51v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r51v0 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r52v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r52v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static void aK(defpackage.cmw r37, defpackage.bbh r38, defpackage.ayy r39, boolean r40, boolean r41, defpackage.ars r42, boolean r43, defpackage.amn r44, defpackage.cmi r45, defpackage.awh r46, defpackage.cmn r47, defpackage.awa r48, defpackage.bdn r49, defpackage.aonj r50, defpackage.cav r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.den.aK(cmw, bbh, ayy, boolean, boolean, ars, boolean, amn, cmi, awh, cmn, awa, bdn, aonj, cav, int, int, int):void");
    }

    public static defpackage.bdn aL(final defpackage.bbh bbhVar, defpackage.cav cavVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !cavVar.B(bbhVar)) && (i & 6) != 4) {
            z = false;
        }
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (z || objR == defpackage.cau.a) {
            objR = new defpackage.bcy(new defpackage.bde() { // from class: bao
                @Override // defpackage.bde
                public final int a() {
                    return defpackage.den.aJ(bbhVar.j());
                }
            });
            cbtVar.ab(objR);
        }
        return (defpackage.bcy) objR;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0116  */
    /* JADX WARN: Code duplicated, block: B:105:0x011e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x0128  */
    /* JADX WARN: Code duplicated, block: B:110:0x012c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0141  */
    /* JADX WARN: Code duplicated, block: B:119:0x014b  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01db  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x0264  */
    /* JADX WARN: Code duplicated, block: B:160:0x027e  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    public static void aM(defpackage.cmw cmwVar, defpackage.bbh bbhVar, defpackage.ayy ayyVar, boolean z, defpackage.awh awhVar, defpackage.cmi cmiVar, defpackage.ars arsVar, boolean z2, defpackage.amn amnVar, defpackage.bdn bdnVar, defpackage.aonj aonjVar, defpackage.cav cavVar, int i, int i2, int i3) {
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.bbh bbhVarA;
        defpackage.ayy azcVar;
        int i5;
        boolean z3;
        int i6;
        defpackage.awh awhVar2;
        int i7;
        int i8;
        defpackage.ars arsVar2;
        int i9;
        boolean z4;
        int i10;
        int i11;
        boolean z5;
        defpackage.cav cavVar2;
        boolean z6;
        defpackage.cmi cmiVar2;
        boolean z7;
        defpackage.bdn bdnVar2;
        defpackage.cmw cmwVar3;
        defpackage.bbh bbhVar2;
        defpackage.ayy ayyVar2;
        defpackage.awh awhVar3;
        defpackage.ars arsVar3;
        defpackage.amn amnVar2;
        defpackage.cdk cdkVarI;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z8;
        defpackage.cmi cmiVar3;
        defpackage.ars arsVarBf;
        defpackage.amn amnVarA;
        int i16;
        defpackage.amn amnVar3;
        defpackage.bdn bdnVar3;
        boolean z9;
        boolean z10;
        defpackage.ars arsVar4;
        defpackage.cmi cmiVar4;
        defpackage.cmw cmwVar4;
        defpackage.ayy ayyVar3;
        defpackage.awh awhVar4;
        defpackage.bbh bbhVar3;
        defpackage.awh awhVar5;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = i3 & 1;
        defpackage.cav cavVarB = cavVar.b(2015069739);
        if (i21 != 0) {
            i4 = i | 6;
            cmwVar2 = cmwVar;
        } else if ((i & 6) == 0) {
            cmwVar2 = cmwVar;
            i4 = (true != cavVarB.B(cmwVar2) ? 2 : 4) | i;
        } else {
            cmwVar2 = cmwVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            int i22 = 16;
            if ((i3 & 2) == 0) {
                bbhVarA = bbhVar;
                if (cavVarB.B(bbhVarA)) {
                    i22 = 32;
                }
            } else {
                bbhVarA = bbhVar;
            }
            i4 |= i22;
        } else {
            bbhVarA = bbhVar;
        }
        int i23 = i3 & 4;
        if (i23 == 0) {
            if ((i & 384) == 0) {
                azcVar = ayyVar;
                i4 |= true != cavVarB.B(azcVar) ? 128 : 256;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i5 != 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                if (true != cavVarB.C(z)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i4 |= i6;
            }
            if ((i & 24576) == 0) {
                i20 = 8192;
                if ((i3 & 16) == 0) {
                    awhVar2 = awhVar;
                    if (cavVarB.B(awhVar2)) {
                        i20 = 16384;
                    }
                } else {
                    awhVar2 = awhVar;
                }
                i4 |= i20;
            } else {
                awhVar2 = awhVar;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != cavVarB.B(cmiVar)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i4 |= i8;
            }
            if ((1572864 & i) == 0) {
                i19 = 524288;
                if ((i3 & 64) == 0) {
                    arsVar2 = arsVar;
                    if (cavVarB.B(arsVar2)) {
                        i19 = 1048576;
                    }
                } else {
                    arsVar2 = arsVar;
                }
                i4 |= i19;
            } else {
                arsVar2 = arsVar;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (true != cavVarB.C(z2)) {
                    i10 = 4194304;
                } else {
                    i10 = 8388608;
                }
                i4 |= i10;
            }
            if ((100663296 & i) == 0) {
                if ((i3 & 256) == 0 || !cavVarB.B(amnVar)) {
                    i18 = 33554432;
                } else {
                    i18 = 67108864;
                }
                i4 |= i18;
            }
            if ((i & 805306368) == 0) {
                i4 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                if (true != cavVarB.D(aonjVar)) {
                    i17 = 2;
                } else {
                    i17 = 4;
                }
                i11 = i2 | i17;
            } else {
                i11 = i2;
            }
            if ((i4 & 306783379) == 306783378 || (i11 & 3) != 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (cavVarB.H(z5, i4 & 1)) {
                i12 = i3 & 256;
                i13 = i3 & 64;
                i14 = i3 & 16;
                i15 = i3 & 2;
                int i24 = i11;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0 || cavVarB.E()) {
                    if (i21 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i15 != 0) {
                        i4 &= -113;
                        bbhVarA = defpackage.bbj.a(cavVarB);
                    }
                    if (i23 != 0) {
                        azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    z8 = z3 & z;
                    if (i14 != 0) {
                        if (z8) {
                            awhVar5 = defpackage.awi.d;
                        } else {
                            awhVar5 = defpackage.awi.c;
                        }
                        i4 &= -57345;
                        awhVar2 = awhVar5;
                    }
                    if (i7 != 0) {
                        cmiVar3 = defpackage.cmh.j;
                    } else {
                        cmiVar3 = cmiVar;
                    }
                    if (i13 != 0) {
                        arsVarBf = bf(cavVarB);
                        i4 &= -3670017;
                    } else {
                        arsVarBf = arsVar2;
                    }
                    boolean z11 = (!z4) | z2;
                    if (i12 != 0) {
                        amnVarA = defpackage.aoj.a(cavVarB);
                        i4 &= -234881025;
                    } else {
                        amnVarA = amnVar;
                    }
                    defpackage.bdn bdnVarAL = aL(bbhVarA, cavVarB, ((i4 >> 3) & 14) | 48);
                    i16 = i4 & (-1879048193);
                    amnVar3 = amnVarA;
                    bdnVar3 = bdnVarAL;
                    z9 = z8;
                    z10 = z11;
                    arsVar4 = arsVarBf;
                    cmiVar4 = cmiVar3;
                    cmwVar4 = cmwVar2;
                    ayyVar3 = azcVar;
                    awhVar4 = awhVar2;
                    bbhVar3 = bbhVarA;
                } else {
                    cavVarB.s();
                    if (i15 != 0) {
                        i4 &= -113;
                    }
                    if (i14 != 0) {
                        i4 &= -57345;
                    }
                    if (i13 != 0) {
                        i4 &= -3670017;
                    }
                    if (i12 != 0) {
                        i4 &= -234881025;
                    }
                    i16 = i4 & (-1879048193);
                    z9 = z;
                    z10 = z2;
                    amnVar3 = amnVar;
                    bdnVar3 = bdnVar;
                    arsVar4 = arsVar2;
                    cmiVar4 = cmiVar;
                    bbhVar3 = bbhVarA;
                    ayyVar3 = azcVar;
                    awhVar4 = awhVar2;
                    cmwVar4 = cmwVar2;
                }
                cavVarB.l();
                int i25 = i16 >> 3;
                cavVar2 = cavVarB;
                aK(cmwVar4, bbhVar3, ayyVar3, z9, true, arsVar4, z10, amnVar3, cmiVar4, awhVar4, null, null, bdnVar3, aonjVar, cavVar2, (i16 & 14) | 24576 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128) | ((i16 << 12) & 1879048192), ((i16 >> 12) & 14) | ((i24 << 12) & 57344), 6400);
                cmwVar3 = cmwVar4;
                bbhVar2 = bbhVar3;
                ayyVar2 = ayyVar3;
                z6 = z9;
                arsVar3 = arsVar4;
                z7 = z10;
                amnVar2 = amnVar3;
                cmiVar2 = cmiVar4;
                awhVar3 = awhVar4;
                bdnVar2 = bdnVar3;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                z6 = z;
                cmiVar2 = cmiVar;
                z7 = z2;
                bdnVar2 = bdnVar;
                cmwVar3 = cmwVar2;
                bbhVar2 = bbhVarA;
                ayyVar2 = azcVar;
                awhVar3 = awhVar2;
                arsVar3 = arsVar2;
                amnVar2 = amnVar;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new baj(cmwVar3, bbhVar2, ayyVar2, z6, awhVar3, cmiVar2, arsVar3, z7, amnVar2, bdnVar2, aonjVar, i, i2, i3);
            }
        }
        i4 |= 384;
        azcVar = ayyVar;
        i5 = i3 & 8;
        if (i5 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            if (true != cavVarB.C(z)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i4 |= i6;
        }
        if ((i & 24576) == 0) {
            i20 = 8192;
            if ((i3 & 16) == 0) {
                awhVar2 = awhVar;
                if (cavVarB.B(awhVar2)) {
                    i20 = 16384;
                }
            } else {
                awhVar2 = awhVar;
            }
            i4 |= i20;
        } else {
            awhVar2 = awhVar;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != cavVarB.B(cmiVar)) {
                i8 = 65536;
            } else {
                i8 = 131072;
            }
            i4 |= i8;
        }
        if ((1572864 & i) == 0) {
            i19 = 524288;
            if ((i3 & 64) == 0) {
                arsVar2 = arsVar;
                if (cavVarB.B(arsVar2)) {
                    i19 = 1048576;
                }
            } else {
                arsVar2 = arsVar;
            }
            i4 |= i19;
        } else {
            arsVar2 = arsVar;
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (true != cavVarB.C(z2)) {
                i10 = 4194304;
            } else {
                i10 = 8388608;
            }
            i4 |= i10;
        }
        if ((100663296 & i) == 0) {
            if ((i3 & 256) == 0) {
                i18 = 33554432;
            } else {
                i18 = 33554432;
            }
            i4 |= i18;
        }
        if ((i & 805306368) == 0) {
            i4 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            if (true != cavVarB.D(aonjVar)) {
                i17 = 2;
            } else {
                i17 = 4;
            }
            i11 = i2 | i17;
        } else {
            i11 = i2;
        }
        if ((i4 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (cavVarB.H(z5, i4 & 1)) {
            i12 = i3 & 256;
            i13 = i3 & 64;
            i14 = i3 & 16;
            i15 = i3 & 2;
            int i26 = i11;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i21 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i15 != 0) {
                    i4 &= -113;
                    bbhVarA = defpackage.bbj.a(cavVarB);
                }
                if (i23 != 0) {
                    azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                }
                z8 = z3 & z;
                if (i14 != 0) {
                    if (z8) {
                        awhVar5 = defpackage.awi.c;
                    } else {
                        awhVar5 = defpackage.awi.d;
                    }
                    i4 &= -57345;
                    awhVar2 = awhVar5;
                }
                if (i7 != 0) {
                    cmiVar3 = defpackage.cmh.j;
                } else {
                    cmiVar3 = cmiVar;
                }
                if (i13 != 0) {
                    arsVarBf = bf(cavVarB);
                    i4 &= -3670017;
                } else {
                    arsVarBf = arsVar2;
                }
                boolean z12 = (!z4) | z2;
                if (i12 != 0) {
                    amnVarA = defpackage.aoj.a(cavVarB);
                    i4 &= -234881025;
                } else {
                    amnVarA = amnVar;
                }
                defpackage.bdn bdnVarAL2 = aL(bbhVarA, cavVarB, ((i4 >> 3) & 14) | 48);
                i16 = i4 & (-1879048193);
                amnVar3 = amnVarA;
                bdnVar3 = bdnVarAL2;
                z9 = z8;
                z10 = z12;
                arsVar4 = arsVarBf;
                cmiVar4 = cmiVar3;
                cmwVar4 = cmwVar2;
                ayyVar3 = azcVar;
                awhVar4 = awhVar2;
                bbhVar3 = bbhVarA;
            } else {
                if (i21 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i15 != 0) {
                    i4 &= -113;
                    bbhVarA = defpackage.bbj.a(cavVarB);
                }
                if (i23 != 0) {
                    azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                }
                z8 = z3 & z;
                if (i14 != 0) {
                    if (z8) {
                        awhVar5 = defpackage.awi.c;
                    } else {
                        awhVar5 = defpackage.awi.d;
                    }
                    i4 &= -57345;
                    awhVar2 = awhVar5;
                }
                if (i7 != 0) {
                    cmiVar3 = defpackage.cmh.j;
                } else {
                    cmiVar3 = cmiVar;
                }
                if (i13 != 0) {
                    arsVarBf = bf(cavVarB);
                    i4 &= -3670017;
                } else {
                    arsVarBf = arsVar2;
                }
                boolean z13 = (!z4) | z2;
                if (i12 != 0) {
                    amnVarA = defpackage.aoj.a(cavVarB);
                    i4 &= -234881025;
                } else {
                    amnVarA = amnVar;
                }
                defpackage.bdn bdnVarAL3 = aL(bbhVarA, cavVarB, ((i4 >> 3) & 14) | 48);
                i16 = i4 & (-1879048193);
                amnVar3 = amnVarA;
                bdnVar3 = bdnVarAL3;
                z9 = z8;
                z10 = z13;
                arsVar4 = arsVarBf;
                cmiVar4 = cmiVar3;
                cmwVar4 = cmwVar2;
                ayyVar3 = azcVar;
                awhVar4 = awhVar2;
                bbhVar3 = bbhVarA;
            }
            cavVarB.l();
            int i27 = i16 >> 3;
            cavVar2 = cavVarB;
            aK(cmwVar4, bbhVar3, ayyVar3, z9, true, arsVar4, z10, amnVar3, cmiVar4, awhVar4, null, null, bdnVar3, aonjVar, cavVar2, (i16 & 14) | 24576 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128) | ((i16 << 12) & 1879048192), ((i16 >> 12) & 14) | ((i26 << 12) & 57344), 6400);
            cmwVar3 = cmwVar4;
            bbhVar2 = bbhVar3;
            ayyVar2 = ayyVar3;
            z6 = z9;
            arsVar3 = arsVar4;
            z7 = z10;
            amnVar2 = amnVar3;
            cmiVar2 = cmiVar4;
            awhVar3 = awhVar4;
            bdnVar2 = bdnVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            z6 = z;
            cmiVar2 = cmiVar;
            z7 = z2;
            bdnVar2 = bdnVar;
            cmwVar3 = cmwVar2;
            bbhVar2 = bbhVarA;
            ayyVar2 = azcVar;
            awhVar3 = awhVar2;
            arsVar3 = arsVar2;
            amnVar2 = amnVar;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new baj(cmwVar3, bbhVar2, ayyVar2, z6, awhVar3, cmiVar2, arsVar3, z7, amnVar2, bdnVar2, aonjVar, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0136  */
    /* JADX WARN: Code duplicated, block: B:102:0x013b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:106:0x014d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134 A[DONT_INVERT] */
    public static void aN(defpackage.cmw cmwVar, defpackage.bbh bbhVar, defpackage.ayy ayyVar, defpackage.awa awaVar, defpackage.cmn cmnVar, defpackage.ars arsVar, boolean z, defpackage.amn amnVar, defpackage.bdn bdnVar, defpackage.aonj aonjVar, defpackage.cav cavVar, int i, int i2, int i3) {
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.bbh bbhVarA;
        defpackage.ayy azcVar;
        int i5;
        defpackage.awa awaVar2;
        int i6;
        defpackage.cmn cmnVar2;
        int i7;
        int i8;
        defpackage.aonj aonjVar2;
        int i9;
        boolean z2;
        defpackage.cav cavVar2;
        defpackage.ars arsVar2;
        defpackage.amn amnVar2;
        defpackage.cmw cmwVar3;
        defpackage.bbh bbhVar2;
        defpackage.ayy ayyVar2;
        defpackage.awa awaVar3;
        defpackage.cmn cmnVar3;
        boolean z3;
        defpackage.bdn bdnVar2;
        defpackage.cdk cdkVarI;
        int i10;
        int i11;
        int i12;
        defpackage.ars arsVar3;
        defpackage.amn amnVar3;
        defpackage.bdn bdnVar3;
        boolean z4;
        int i13;
        int i14 = i3 & 1;
        defpackage.cav cavVarB = cavVar.b(-903144185);
        if (i14 != 0) {
            i4 = i | 6;
            cmwVar2 = cmwVar;
        } else if ((i & 6) == 0) {
            cmwVar2 = cmwVar;
            i4 = (true != cavVarB.B(cmwVar2) ? 2 : 4) | i;
        } else {
            cmwVar2 = cmwVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            int i15 = 16;
            if ((i3 & 2) == 0) {
                bbhVarA = bbhVar;
                if (cavVarB.B(bbhVarA)) {
                    i15 = 32;
                }
            } else {
                bbhVarA = bbhVar;
            }
            i4 |= i15;
        } else {
            bbhVarA = bbhVar;
        }
        int i16 = i3 & 4;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                azcVar = ayyVar;
                i4 |= true != cavVarB.B(azcVar) ? 128 : 256;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                if (true != cavVarB.C(false)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i4 |= i5;
            }
            if ((i & 24576) == 0) {
                i13 = 8192;
                if ((i3 & 16) == 0) {
                    awaVar2 = awaVar;
                    if (cavVarB.B(awaVar2)) {
                        i13 = 16384;
                    }
                } else {
                    awaVar2 = awaVar;
                }
                i4 |= i13;
            } else {
                awaVar2 = awaVar;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    cmnVar2 = cmnVar;
                    if (true != cavVarB.B(cmnVar2)) {
                        i7 = 65536;
                    } else {
                        i7 = 131072;
                    }
                    i4 |= i7;
                }
                if ((1572864 & i) == 0) {
                    i4 |= 524288;
                }
                i8 = i4 | 12582912;
                if ((100663296 & i) == 0) {
                    i8 = i4 | 46137344;
                }
                if ((805306368 & i) == 0) {
                    i8 |= 268435456;
                }
                if ((i2 & 6) == 0) {
                    aonjVar2 = aonjVar;
                    i9 = i2 | (true != cavVarB.D(aonjVar2) ? 2 : 4);
                } else {
                    aonjVar2 = aonjVar;
                    i9 = i2;
                }
                if ((i8 & 306783379) == 306783378 || (i9 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (cavVarB.H(z2, i8 & 1)) {
                    i10 = i3 & 16;
                    i11 = i3 & 2;
                    int i17 = i9;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0 || cavVarB.E()) {
                        if (i14 != 0) {
                            cmwVar2 = defpackage.cmw.c;
                        }
                        if (i11 != 0) {
                            i8 &= -113;
                            bbhVarA = defpackage.bbj.a(cavVarB);
                        }
                        if (i16 != 0) {
                            azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if (i10 != 0) {
                            i8 &= -57345;
                            awaVar2 = defpackage.awi.a;
                        }
                        if (i6 != 0) {
                            cmnVar2 = defpackage.cmh.m;
                        }
                        defpackage.ars arsVarBf = bf(cavVarB);
                        defpackage.amn amnVarA = defpackage.aoj.a(cavVarB);
                        defpackage.bdn bdnVarAL = aL(bbhVarA, cavVarB, (((i8 & (-238551041)) >> 3) & 14) | 48);
                        i12 = i8 & (-2117599233);
                        arsVar3 = arsVarBf;
                        amnVar3 = amnVarA;
                        bdnVar3 = bdnVarAL;
                        z4 = true;
                    } else {
                        cavVarB.s();
                        if (i11 != 0) {
                            i8 &= -113;
                        }
                        if (i10 != 0) {
                            i8 &= -57345;
                        }
                        i12 = i8 & (-2117599233);
                        arsVar3 = arsVar;
                        amnVar3 = amnVar;
                        bdnVar3 = bdnVar;
                        z4 = z;
                    }
                    defpackage.cmw cmwVar4 = cmwVar2;
                    defpackage.bbh bbhVar3 = bbhVarA;
                    defpackage.awa awaVar4 = awaVar2;
                    defpackage.cmn cmnVar4 = cmnVar2;
                    int i18 = i12;
                    defpackage.ayy ayyVar3 = azcVar;
                    cavVarB.l();
                    cavVar2 = cavVarB;
                    aK(cmwVar4, bbhVar3, ayyVar3, false, false, arsVar3, z4, amnVar3, null, null, cmnVar4, awaVar4, bdnVar3, aonjVar2, cavVar2, (i18 & 14) | 24576 | (i18 & 112) | (i18 & 896) | (i18 & 7168) | ((i18 >> 3) & 3670016), ((i18 >> 12) & 112) | ((i18 >> 6) & 896) | ((i17 << 12) & 57344), 1792);
                    cmwVar3 = cmwVar4;
                    bbhVar2 = bbhVar3;
                    ayyVar2 = ayyVar3;
                    arsVar2 = arsVar3;
                    z3 = z4;
                    amnVar2 = amnVar3;
                    cmnVar3 = cmnVar4;
                    awaVar3 = awaVar4;
                    bdnVar2 = bdnVar3;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    arsVar2 = arsVar;
                    amnVar2 = amnVar;
                    cmwVar3 = cmwVar2;
                    bbhVar2 = bbhVarA;
                    ayyVar2 = azcVar;
                    awaVar3 = awaVar2;
                    cmnVar3 = cmnVar2;
                    z3 = z;
                    bdnVar2 = bdnVar;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new abme(cmwVar3, bbhVar2, ayyVar2, awaVar3, cmnVar3, arsVar2, z3, amnVar2, bdnVar2, aonjVar, i, i2, i3, 1);
                }
            }
            i4 |= 196608;
            cmnVar2 = cmnVar;
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i8 = i4 | 12582912;
            if ((100663296 & i) == 0) {
                i8 = i4 | 46137344;
            }
            if ((805306368 & i) == 0) {
                i8 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                aonjVar2 = aonjVar;
                i9 = i2 | (true != cavVarB.D(aonjVar2) ? 2 : 4);
            } else {
                aonjVar2 = aonjVar;
                i9 = i2;
            }
            if ((i8 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (cavVarB.H(z2, i8 & 1)) {
                i10 = i3 & 16;
                i11 = i3 & 2;
                int i19 = i9;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i11 != 0) {
                        i8 &= -113;
                        bbhVarA = defpackage.bbj.a(cavVarB);
                    }
                    if (i16 != 0) {
                        azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i10 != 0) {
                        i8 &= -57345;
                        awaVar2 = defpackage.awi.a;
                    }
                    if (i6 != 0) {
                        cmnVar2 = defpackage.cmh.m;
                    }
                    defpackage.ars arsVarBf2 = bf(cavVarB);
                    defpackage.amn amnVarA2 = defpackage.aoj.a(cavVarB);
                    defpackage.bdn bdnVarAL2 = aL(bbhVarA, cavVarB, (((i8 & (-238551041)) >> 3) & 14) | 48);
                    i12 = i8 & (-2117599233);
                    arsVar3 = arsVarBf2;
                    amnVar3 = amnVarA2;
                    bdnVar3 = bdnVarAL2;
                    z4 = true;
                } else {
                    if (i14 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i11 != 0) {
                        i8 &= -113;
                        bbhVarA = defpackage.bbj.a(cavVarB);
                    }
                    if (i16 != 0) {
                        azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i10 != 0) {
                        i8 &= -57345;
                        awaVar2 = defpackage.awi.a;
                    }
                    if (i6 != 0) {
                        cmnVar2 = defpackage.cmh.m;
                    }
                    defpackage.ars arsVarBf3 = bf(cavVarB);
                    defpackage.amn amnVarA3 = defpackage.aoj.a(cavVarB);
                    defpackage.bdn bdnVarAL3 = aL(bbhVarA, cavVarB, (((i8 & (-238551041)) >> 3) & 14) | 48);
                    i12 = i8 & (-2117599233);
                    arsVar3 = arsVarBf3;
                    amnVar3 = amnVarA3;
                    bdnVar3 = bdnVarAL3;
                    z4 = true;
                }
                defpackage.cmw cmwVar5 = cmwVar2;
                defpackage.bbh bbhVar4 = bbhVarA;
                defpackage.awa awaVar5 = awaVar2;
                defpackage.cmn cmnVar5 = cmnVar2;
                int i110 = i12;
                defpackage.ayy ayyVar4 = azcVar;
                cavVarB.l();
                cavVar2 = cavVarB;
                aK(cmwVar5, bbhVar4, ayyVar4, false, false, arsVar3, z4, amnVar3, null, null, cmnVar5, awaVar5, bdnVar3, aonjVar2, cavVar2, (i110 & 14) | 24576 | (i110 & 112) | (i110 & 896) | (i110 & 7168) | ((i110 >> 3) & 3670016), ((i110 >> 12) & 112) | ((i110 >> 6) & 896) | ((i19 << 12) & 57344), 1792);
                cmwVar3 = cmwVar5;
                bbhVar2 = bbhVar4;
                ayyVar2 = ayyVar4;
                arsVar2 = arsVar3;
                z3 = z4;
                amnVar2 = amnVar3;
                cmnVar3 = cmnVar5;
                awaVar3 = awaVar5;
                bdnVar2 = bdnVar3;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                arsVar2 = arsVar;
                amnVar2 = amnVar;
                cmwVar3 = cmwVar2;
                bbhVar2 = bbhVarA;
                ayyVar2 = azcVar;
                awaVar3 = awaVar2;
                cmnVar3 = cmnVar2;
                z3 = z;
                bdnVar2 = bdnVar;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new abme(cmwVar3, bbhVar2, ayyVar2, awaVar3, cmnVar3, arsVar2, z3, amnVar2, bdnVar2, aonjVar, i, i2, i3, 1);
            }
        }
        i4 |= 384;
        azcVar = ayyVar;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            if (true != cavVarB.C(false)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i4 |= i5;
        }
        if ((i & 24576) == 0) {
            i13 = 8192;
            if ((i3 & 16) == 0) {
                awaVar2 = awaVar;
                if (cavVarB.B(awaVar2)) {
                    i13 = 16384;
                }
            } else {
                awaVar2 = awaVar;
            }
            i4 |= i13;
        } else {
            awaVar2 = awaVar;
        }
        i6 = i3 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                cmnVar2 = cmnVar;
                if (true != cavVarB.B(cmnVar2)) {
                    i7 = 65536;
                } else {
                    i7 = 131072;
                }
                i4 |= i7;
            }
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i8 = i4 | 12582912;
            if ((100663296 & i) == 0) {
                i8 = i4 | 46137344;
            }
            if ((805306368 & i) == 0) {
                i8 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                aonjVar2 = aonjVar;
                i9 = i2 | (true != cavVarB.D(aonjVar2) ? 2 : 4);
            } else {
                aonjVar2 = aonjVar;
                i9 = i2;
            }
            if ((i8 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (cavVarB.H(z2, i8 & 1)) {
                i10 = i3 & 16;
                i11 = i3 & 2;
                int i111 = i9;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i11 != 0) {
                        i8 &= -113;
                        bbhVarA = defpackage.bbj.a(cavVarB);
                    }
                    if (i16 != 0) {
                        azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i10 != 0) {
                        i8 &= -57345;
                        awaVar2 = defpackage.awi.a;
                    }
                    if (i6 != 0) {
                        cmnVar2 = defpackage.cmh.m;
                    }
                    defpackage.ars arsVarBf4 = bf(cavVarB);
                    defpackage.amn amnVarA4 = defpackage.aoj.a(cavVarB);
                    defpackage.bdn bdnVarAL4 = aL(bbhVarA, cavVarB, (((i8 & (-238551041)) >> 3) & 14) | 48);
                    i12 = i8 & (-2117599233);
                    arsVar3 = arsVarBf4;
                    amnVar3 = amnVarA4;
                    bdnVar3 = bdnVarAL4;
                    z4 = true;
                } else {
                    if (i14 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i11 != 0) {
                        i8 &= -113;
                        bbhVarA = defpackage.bbj.a(cavVarB);
                    }
                    if (i16 != 0) {
                        azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i10 != 0) {
                        i8 &= -57345;
                        awaVar2 = defpackage.awi.a;
                    }
                    if (i6 != 0) {
                        cmnVar2 = defpackage.cmh.m;
                    }
                    defpackage.ars arsVarBf5 = bf(cavVarB);
                    defpackage.amn amnVarA5 = defpackage.aoj.a(cavVarB);
                    defpackage.bdn bdnVarAL5 = aL(bbhVarA, cavVarB, (((i8 & (-238551041)) >> 3) & 14) | 48);
                    i12 = i8 & (-2117599233);
                    arsVar3 = arsVarBf5;
                    amnVar3 = amnVarA5;
                    bdnVar3 = bdnVarAL5;
                    z4 = true;
                }
                defpackage.cmw cmwVar6 = cmwVar2;
                defpackage.bbh bbhVar5 = bbhVarA;
                defpackage.awa awaVar6 = awaVar2;
                defpackage.cmn cmnVar6 = cmnVar2;
                int i112 = i12;
                defpackage.ayy ayyVar5 = azcVar;
                cavVarB.l();
                cavVar2 = cavVarB;
                aK(cmwVar6, bbhVar5, ayyVar5, false, false, arsVar3, z4, amnVar3, null, null, cmnVar6, awaVar6, bdnVar3, aonjVar2, cavVar2, (i112 & 14) | 24576 | (i112 & 112) | (i112 & 896) | (i112 & 7168) | ((i112 >> 3) & 3670016), ((i112 >> 12) & 112) | ((i112 >> 6) & 896) | ((i111 << 12) & 57344), 1792);
                cmwVar3 = cmwVar6;
                bbhVar2 = bbhVar5;
                ayyVar2 = ayyVar5;
                arsVar2 = arsVar3;
                z3 = z4;
                amnVar2 = amnVar3;
                cmnVar3 = cmnVar6;
                awaVar3 = awaVar6;
                bdnVar2 = bdnVar3;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                arsVar2 = arsVar;
                amnVar2 = amnVar;
                cmwVar3 = cmwVar2;
                bbhVar2 = bbhVarA;
                ayyVar2 = azcVar;
                awaVar3 = awaVar2;
                cmnVar3 = cmnVar2;
                z3 = z;
                bdnVar2 = bdnVar;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new abme(cmwVar3, bbhVar2, ayyVar2, awaVar3, cmnVar3, arsVar2, z3, amnVar2, bdnVar2, aonjVar, i, i2, i3, 1);
            }
        }
        i4 |= 196608;
        cmnVar2 = cmnVar;
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        i8 = i4 | 12582912;
        if ((100663296 & i) == 0) {
            i8 = i4 | 46137344;
        }
        if ((805306368 & i) == 0) {
            i8 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            aonjVar2 = aonjVar;
            i9 = i2 | (true != cavVarB.D(aonjVar2) ? 2 : 4);
        } else {
            aonjVar2 = aonjVar;
            i9 = i2;
        }
        if ((i8 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (cavVarB.H(z2, i8 & 1)) {
            i10 = i3 & 16;
            i11 = i3 & 2;
            int i113 = i9;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i11 != 0) {
                    i8 &= -113;
                    bbhVarA = defpackage.bbj.a(cavVarB);
                }
                if (i16 != 0) {
                    azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (i10 != 0) {
                    i8 &= -57345;
                    awaVar2 = defpackage.awi.a;
                }
                if (i6 != 0) {
                    cmnVar2 = defpackage.cmh.m;
                }
                defpackage.ars arsVarBf6 = bf(cavVarB);
                defpackage.amn amnVarA6 = defpackage.aoj.a(cavVarB);
                defpackage.bdn bdnVarAL6 = aL(bbhVarA, cavVarB, (((i8 & (-238551041)) >> 3) & 14) | 48);
                i12 = i8 & (-2117599233);
                arsVar3 = arsVarBf6;
                amnVar3 = amnVarA6;
                bdnVar3 = bdnVarAL6;
                z4 = true;
            } else {
                if (i14 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i11 != 0) {
                    i8 &= -113;
                    bbhVarA = defpackage.bbj.a(cavVarB);
                }
                if (i16 != 0) {
                    azcVar = new defpackage.azc(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (i10 != 0) {
                    i8 &= -57345;
                    awaVar2 = defpackage.awi.a;
                }
                if (i6 != 0) {
                    cmnVar2 = defpackage.cmh.m;
                }
                defpackage.ars arsVarBf7 = bf(cavVarB);
                defpackage.amn amnVarA7 = defpackage.aoj.a(cavVarB);
                defpackage.bdn bdnVarAL7 = aL(bbhVarA, cavVarB, (((i8 & (-238551041)) >> 3) & 14) | 48);
                i12 = i8 & (-2117599233);
                arsVar3 = arsVarBf7;
                amnVar3 = amnVarA7;
                bdnVar3 = bdnVarAL7;
                z4 = true;
            }
            defpackage.cmw cmwVar7 = cmwVar2;
            defpackage.bbh bbhVar6 = bbhVarA;
            defpackage.awa awaVar7 = awaVar2;
            defpackage.cmn cmnVar7 = cmnVar2;
            int i114 = i12;
            defpackage.ayy ayyVar6 = azcVar;
            cavVarB.l();
            cavVar2 = cavVarB;
            aK(cmwVar7, bbhVar6, ayyVar6, false, false, arsVar3, z4, amnVar3, null, null, cmnVar7, awaVar7, bdnVar3, aonjVar2, cavVar2, (i114 & 14) | 24576 | (i114 & 112) | (i114 & 896) | (i114 & 7168) | ((i114 >> 3) & 3670016), ((i114 >> 12) & 112) | ((i114 >> 6) & 896) | ((i113 << 12) & 57344), 1792);
            cmwVar3 = cmwVar7;
            bbhVar2 = bbhVar6;
            ayyVar2 = ayyVar6;
            arsVar2 = arsVar3;
            z3 = z4;
            amnVar2 = amnVar3;
            cmnVar3 = cmnVar7;
            awaVar3 = awaVar7;
            bdnVar2 = bdnVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            arsVar2 = arsVar;
            amnVar2 = amnVar;
            cmwVar3 = cmwVar2;
            bbhVar2 = bbhVarA;
            ayyVar2 = azcVar;
            awaVar3 = awaVar2;
            cmnVar3 = cmnVar2;
            z3 = z;
            bdnVar2 = bdnVar;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abme(cmwVar3, bbhVar2, ayyVar2, awaVar3, cmnVar3, arsVar2, z3, amnVar2, bdnVar2, aonjVar, i, i2, i3, 1);
        }
    }

    public static defpackage.baf aO(defpackage.cmn cmnVar) {
        return new defpackage.baf(1, new defpackage.bae(cmnVar, 2), cmnVar);
    }

    public static defpackage.baf aP(defpackage.cmj cmjVar) {
        return new defpackage.baf(3, new defpackage.bae(cmjVar, 3), cmjVar);
    }

    public static defpackage.baf aQ(defpackage.cmi cmiVar) {
        return new defpackage.baf(2, new defpackage.bae(cmiVar, 0), cmiVar);
    }

    public static void aR(defpackage.cmw cmwVar, defpackage.cav cavVar) {
        defpackage.azo azoVar = defpackage.azo.a;
        long jA = cavVar.a();
        long j = jA ^ (jA >>> 32);
        defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar, cmwVar);
        defpackage.cje cjeVarM = cavVar.M();
        defpackage.aomy aomyVar = defpackage.dam.a;
        cavVar.L();
        cavVar.v();
        if (cavVar.F()) {
            cavVar.j(aomyVar);
        } else {
            cavVar.x();
        }
        defpackage.cev.c(cavVar, azoVar, defpackage.dam.e);
        defpackage.cev.c(cavVar, cjeVarM, defpackage.dam.d);
        cavVar.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
        defpackage.cev.c(cavVar, cmwVarM, defpackage.dam.c);
        defpackage.cev.c(cavVar, java.lang.Integer.valueOf((int) j), defpackage.dam.f);
        cavVar.n();
    }

    public static defpackage.cyf aS(defpackage.azf azfVar, int i, int i2, int i3, int i4, int i5, defpackage.cyi cyiVar, java.util.List list, defpackage.czc[] czcVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        defpackage.azg azgVar;
        int i11;
        int i12;
        int i13 = i3;
        int i14 = i4;
        java.util.List list2 = list;
        int i15 = i7 - i6;
        int[] iArr2 = new int[i15];
        int i16 = i6;
        int i17 = 0;
        int i18 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        int iMax = 0;
        while (i16 < i7) {
            defpackage.cyd cydVar = (defpackage.cyd) list2.get(i16);
            defpackage.azg azgVarAT = aT(cydVar);
            float f3 = azgVarAT != null ? azgVarAT.a : 0.0f;
            if (f3 > 0.0f) {
                f2 += f3;
                i17++;
                i16 = i16;
            } else {
                int i19 = i13 - i18;
                int i20 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i14;
                defpackage.czc czcVarV = czcVarArr[i16];
                if (czcVarV == null) {
                    if (i13 == Integer.MAX_VALUE) {
                        i11 = i19;
                        i12 = Integer.MAX_VALUE;
                    } else if (i19 < 0) {
                        i11 = i19;
                        i12 = 0;
                    } else {
                        i12 = i19;
                        i11 = i12;
                    }
                    czcVarV = cydVar.v(azfVar.i(0, i12, i20, false));
                } else {
                    i11 = i19;
                    i17 = i17;
                    i18 = i18;
                }
                defpackage.czc czcVar = czcVarV;
                int iG = azfVar.g(czcVar);
                int iF = azfVar.f(czcVar);
                iArr2[i16 - i6] = iG;
                int i21 = i11 - iG;
                if (i21 < 0) {
                    i21 = 0;
                }
                iMin = java.lang.Math.min(i5, i21);
                i18 += iG + iMin;
                iMax = java.lang.Math.max(iMax, iF);
                czcVarArr[i16] = czcVar;
                i17 = i17;
            }
            i16++;
        }
        int i22 = i17;
        int i23 = i18;
        if (i22 == 0) {
            i10 = i23 - iMin;
            i9 = 0;
        } else {
            i9 = i13 - i23;
            long j = i5;
            if (i13 == Integer.MAX_VALUE) {
                i13 = i;
            }
            long j2 = j * ((long) (i22 - 1));
            long jRound = ((long) (i13 - i23)) - j2;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f2;
            for (int i24 = i6; i24 < i7; i24++) {
                defpackage.azg azgVarAT2 = aT((defpackage.cyd) list2.get(i24));
                jRound -= (long) java.lang.Math.round((azgVarAT2 != null ? azgVarAT2.a : 0.0f) * f4);
            }
            int i25 = i6;
            int i26 = 0;
            while (i25 < i7) {
                if (czcVarArr[i25] == null) {
                    defpackage.cyd cydVar2 = (defpackage.cyd) list2.get(i25);
                    f = f4;
                    defpackage.azg azgVarAT3 = aT(cydVar2);
                    float f5 = azgVarAT3 != null ? azgVarAT3.a : 0.0f;
                    if (i14 == Integer.MAX_VALUE) {
                        azgVar = azgVarAT3;
                        i14 = Integer.MAX_VALUE;
                    } else {
                        azgVar = azgVarAT3 != null ? azgVarAT3 : null;
                    }
                    if (f5 <= 0.0f) {
                        bai.b("All weights <= 0 should have placeables");
                    }
                    float f6 = f5;
                    int iSignum = java.lang.Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = java.lang.Math.max(0, java.lang.Math.round(f * f6) + iSignum);
                    defpackage.czc czcVarV2 = cydVar2.v(azfVar.i(((azgVar == null || azgVar.b) && iMax2 != Integer.MAX_VALUE) ? iMax2 : 0, iMax2, i14, true));
                    int iG2 = azfVar.g(czcVarV2);
                    int iF2 = azfVar.f(czcVarV2);
                    iArr2[i25 - i6] = iG2;
                    i26 += iG2;
                    iMax = java.lang.Math.max(iMax, iF2);
                    czcVarArr[i25] = czcVarV2;
                } else {
                    f = f4;
                }
                i25++;
                f4 = f;
                i14 = i4;
                list2 = list;
                j2 = j2;
            }
            int i27 = (int) (((long) i26) + j2);
            if (i27 < 0) {
                i27 = 0;
            }
            if (i27 <= i9) {
                i9 = i27;
            }
            i10 = i23;
        }
        int i28 = i9 + i10;
        if (i28 < 0) {
            i28 = 0;
        }
        int iMax3 = java.lang.Math.max(i28, i);
        int iMax4 = java.lang.Math.max(iMax, java.lang.Math.max(i2, 0));
        int[] iArr3 = new int[i15];
        azfVar.h(iMax3, iArr2, iArr3, cyiVar);
        return azfVar.j(czcVarArr, cyiVar, iArr3, iMax3, iMax4, iArr, i8, i6, i7);
    }

    public static defpackage.azg aT(defpackage.cxe cxeVar) {
        java.lang.Object objG = cxeVar.g();
        if (objG instanceof defpackage.azg) {
            return (defpackage.azg) objG;
        }
        return null;
    }

    public static defpackage.azg aU(defpackage.czc czcVar) {
        java.lang.Object objG = czcVar.g();
        if (objG instanceof defpackage.azg) {
            return (defpackage.azg) objG;
        }
        return null;
    }

    public static float aV(defpackage.ayy ayyVar, defpackage.dpq dpqVar) {
        return dpqVar == defpackage.dpq.a ? ayyVar.c(dpqVar) : ayyVar.b(dpqVar);
    }

    public static float aW(defpackage.ayy ayyVar, defpackage.dpq dpqVar) {
        return dpqVar == defpackage.dpq.a ? ayyVar.b(dpqVar) : ayyVar.c(dpqVar);
    }

    public static defpackage.cmw aX(defpackage.cmw cmwVar, defpackage.ayy ayyVar) {
        return cmwVar.a(new defpackage.azb(ayyVar));
    }

    public static defpackage.cmw aY(defpackage.cmw cmwVar, float f) {
        return cmwVar.a(new defpackage.ayt(f, f, f, f, true));
    }

    public static defpackage.cmw aZ(defpackage.cmw cmwVar, float f, float f2) {
        return cmwVar.a(new defpackage.ayt(f, f2, f, f2, true));
    }

    public static java.lang.Object aa(defpackage.cje cjeVar, defpackage.cbd cbdVar) {
        if (cbdVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        }
        java.lang.Object objA = cjeVar.get(cbdVar);
        if (objA == null) {
            objA = cbdVar.a();
        }
        return ((defpackage.cew) objA).a(cjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void ab(defpackage.cdj cdjVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        defpackage.cew cewVar;
        boolean z;
        defpackage.cdk cdkVarI;
        defpackage.cav cavVarB = cavVar.b(-149765515);
        defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
        defpackage.cje cjeVarAi = cbtVar.ai();
        cbtVar.Z(201, defpackage.cax.b, 0, null);
        java.lang.Object objR = cbtVar.R();
        if (defpackage.aooh.n(objR, defpackage.cau.a)) {
            cewVar = null;
        } else {
            if (objR == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            }
            cewVar = (defpackage.cew) objR;
        }
        defpackage.cbd cbdVar = cdjVar.a;
        defpackage.cew cewVarC = defpackage.cbd.c(cdjVar, cewVar);
        boolean zN = defpackage.aooh.n(cewVarC, cewVar);
        if (!zN) {
            cbtVar.ab(cewVarC);
        }
        if (!cbtVar.w) {
            defpackage.cfl cflVar = cbtVar.p;
            java.lang.Object objJ = cflVar.j(cflVar.f);
            if (objJ == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            }
            defpackage.cje cjeVar = (defpackage.cje) objJ;
            if (!(cbtVar.G() && zN) && (cdjVar.g || !cjeVarAi.containsKey(cbdVar))) {
                cjeVarAi = cjeVarAi.i(cbdVar, cewVarC);
            } else if ((zN && !cbtVar.k) || !cbtVar.k) {
                cjeVarAi = cjeVar;
            }
            if (cbtVar.l || cjeVar != cjeVarAi) {
                z = true;
            }
            if (z && !cbtVar.w) {
                cbtVar.ak(cjeVarAi);
            }
            defpackage.appu appuVar = cbtVar.B;
            appuVar.g(cbtVar.k ? 1 : 0);
            cbtVar.k = z;
            cbtVar.z = cjeVarAi;
            cbtVar.Z(202, defpackage.cax.c, 0, cjeVarAi);
            aonnVar.a(cavVarB, java.lang.Integer.valueOf((i >> 3) & 14));
            cbtVar.W(false);
            cbtVar.W(false);
            cbtVar.k = appuVar.e() != 0;
            cbtVar.z = null;
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new amv(cdjVar, aonnVar, i, 20);
            }
        }
        if (cdjVar.g || !cjeVarAi.containsKey(cbdVar)) {
            cjeVarAi = cjeVarAi.i(cbdVar, cewVarC);
        }
        cbtVar.s = true;
        z = false;
        if (z) {
            cbtVar.ak(cjeVarAi);
        }
        defpackage.appu appuVar2 = cbtVar.B;
        appuVar2.g(cbtVar.k ? 1 : 0);
        cbtVar.k = z;
        cbtVar.z = cjeVarAi;
        cbtVar.Z(202, defpackage.cax.c, 0, cjeVarAi);
        aonnVar.a(cavVarB, java.lang.Integer.valueOf((i >> 3) & 14));
        cbtVar.W(false);
        cbtVar.W(false);
        cbtVar.k = appuVar2.e() != 0;
        cbtVar.z = null;
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new amv(cdjVar, aonnVar, i, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void ac(defpackage.cdj[] cdjVarArr, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        defpackage.cje cjeVarAj;
        boolean z;
        defpackage.cdk cdkVarI;
        defpackage.cav cavVarB = cavVar.b(415205898);
        defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
        defpackage.cje cjeVarAi = cbtVar.ai();
        cbtVar.Z(201, defpackage.cax.b, 0, null);
        if (cbtVar.w) {
            cjeVarAj = cbtVar.aj(cjeVarAi, Z(cdjVarArr, cjeVarAi, defpackage.cje.d));
            cbtVar.s = true;
        } else {
            java.lang.Object objK = cbtVar.p.k(0);
            if (objK == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            }
            defpackage.cje cjeVar = (defpackage.cje) objK;
            java.lang.Object objK2 = cbtVar.p.k(1);
            if (objK2 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            }
            defpackage.cje cjeVar2 = (defpackage.cje) objK2;
            defpackage.cje cjeVarZ = Z(cdjVarArr, cjeVarAi, cjeVar2);
            if (!cbtVar.G() || cbtVar.l || !defpackage.aooh.n(cjeVar2, cjeVarZ)) {
                cjeVarAj = cbtVar.aj(cjeVarAi, cjeVarZ);
                if (cbtVar.l || !defpackage.aooh.n(cjeVarAj, cjeVar)) {
                    z = true;
                }
                if (z && !cbtVar.w) {
                    cbtVar.ak(cjeVarAj);
                }
                defpackage.appu appuVar = cbtVar.B;
                appuVar.g(cbtVar.k ? 1 : 0);
                cbtVar.k = z;
                cbtVar.z = cjeVarAj;
                cbtVar.Z(202, defpackage.cax.c, 0, cjeVarAj);
                aonnVar.a(cavVarB, java.lang.Integer.valueOf((i >> 3) & 14));
                cbtVar.W(false);
                cbtVar.W(false);
                cbtVar.k = appuVar.e() != 0;
                cbtVar.z = null;
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new dqt(cdjVarArr, aonnVar, i, 1, (byte[]) null);
                }
            }
            cbtVar.Y();
            cjeVarAj = cjeVar;
        }
        z = false;
        if (z) {
            cbtVar.ak(cjeVarAj);
        }
        defpackage.appu appuVar2 = cbtVar.B;
        appuVar2.g(cbtVar.k ? 1 : 0);
        cbtVar.k = z;
        cbtVar.z = cjeVarAj;
        cbtVar.Z(202, defpackage.cax.c, 0, cjeVarAj);
        aonnVar.a(cavVarB, java.lang.Integer.valueOf((i >> 3) & 14));
        cbtVar.W(false);
        cbtVar.W(false);
        cbtVar.k = appuVar2.e() != 0;
        cbtVar.z = null;
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new dqt(cdjVarArr, aonnVar, i, 1, (byte[]) null);
        }
    }

    public static defpackage.cbd ad(defpackage.cby cbyVar) {
        return new defpackage.cbf(new defpackage.bjp(cbyVar, 6));
    }

    public static java.lang.String ae(int i, defpackage.cav cavVar) {
        cavVar.e(defpackage.dep.a);
        return ((android.content.res.Resources) cavVar.e(defpackage.dep.c)).getString(i);
    }

    public static void af(final long j, final defpackage.dkz dkzVar, final defpackage.aonn aonnVar, defpackage.cav cavVar, final int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-684938728);
        if (i3 == 0) {
            i2 = (true != cavVarB.A(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(dkzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cbd cbdVar = defpackage.bvt.a;
            ac(new defpackage.cdj[]{defpackage.boy.a.b(new defpackage.cqg(j)), cbdVar.b(((defpackage.dkz) cavVarB.e(cbdVar)).l(dkzVar))}, aonnVar, cavVarB, (i2 >> 3) & 112);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: byx
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.cav cavVar2 = (defpackage.cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    defpackage.den.af(j, dkzVar, aonnVar, cavVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 << 1) & i6));
                    return defpackage.aojh.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static void ag(but butVar, defpackage.cmw cmwVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        char c;
        boolean z;
        int i2 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-977568115);
        int i3 = i2 == 0 ? (true != cavVarB.B(butVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            java.lang.String strAe = ae(2132019252, cavVarB);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.agxr();
                cbtVar.ab(objR);
            }
            defpackage.agxr agxrVar = (defpackage.agxr) objR;
            if (defpackage.aooh.n(butVar, agxrVar.b)) {
                c = ' ';
                z = false;
                cavVarB.u(1443889109);
                cbtVar.W(false);
            } else {
                cavVarB.u(1441886385);
                agxrVar.b = butVar;
                ?? r12 = agxrVar.a;
                java.util.ArrayList arrayList = new java.util.ArrayList(r12.size());
                int size = r12.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((bpl) r12.get(i4)).a);
                }
                c = ' ';
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
                if (!arrayList2.contains(butVar)) {
                    arrayList2.add(butVar);
                }
                r12.clear();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    java.lang.Object obj = arrayList2.get(i5);
                    if (obj != null) {
                        arrayList3.add(obj);
                    }
                }
                int size3 = arrayList3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    but butVar2 = (but) arrayList3.get(i6);
                    r12.add(new bpl(butVar2, defpackage.cfo.j(-1952400805, new buq(butVar2, butVar, agxrVar, strAe), cavVarB)));
                }
                z = false;
                cbtVar.W(false);
            }
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, z);
            long j = cbtVar.x;
            long j2 = j ^ (j >>> c);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.cdk cdkVarO = cbtVar.O();
            if (cdkVarO == null) {
                throw new java.lang.IllegalStateException("no recompose scope found");
            }
            cdkVarO.r();
            agxrVar.c = cdkVarO;
            cavVarB.u(-1888182177);
            ?? r0 = agxrVar.a;
            int size4 = r0.size();
            for (int i7 = 0; i7 < size4; i7++) {
                bpl bplVar = (bpl) r0.get(i7);
                java.lang.Object obj2 = bplVar.a;
                defpackage.aono aonoVar2 = bplVar.b;
                cbtVar.Z(1325010085, obj2, 0, null);
                aonoVar2.a(defpackage.cfo.j(-1893791890, new awu(aonoVar, obj2, 16, (byte[]) null), cavVarB), cavVarB, 6);
                cbtVar.W(false);
            }
            cbtVar.W(false);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ciz(butVar, cmwVar, aonoVar, i, 1);
        }
    }

    public static defpackage.ajl ah(defpackage.bry bryVar, int i) {
        if (i == 1) {
            return bryVar.d();
        }
        if (i == 2) {
            return bryVar.f();
        }
        if (i == 3) {
            return bryVar.a();
        }
        return i == 4 ? bryVar.c() : bryVar.e();
    }

    public static defpackage.ajl ai(int i, defpackage.cav cavVar) {
        return ah(((defpackage.bqv) cavVar.e(defpackage.bqx.a)).d, i);
    }

    public static void aj(defpackage.nf nfVar, defpackage.cmw cmwVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1077081618);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(nfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i6 = i3 | 384;
        if (cavVarB.H((i6 & 147) != 146, i6 & 1)) {
            if (i5 != 0) {
                cmwVar = defpackage.cmw.c;
            }
            aonoVar = defpackage.box.a;
            but butVarL = nfVar.L();
            defpackage.kaw kawVar = (defpackage.kaw) cavVarB.e(defpackage.dfo.b);
            boolean zB = cavVarB.B(butVarL) | cavVarB.D(kawVar);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == defpackage.cau.a) {
                objR = new defpackage.bur(butVarL, kawVar, (defpackage.aoln) null, 0);
                cbtVar.ab(objR);
            }
            defpackage.cbp.g(butVarL, (defpackage.aonn) objR, cavVarB);
            ag(nfVar.L(), cmwVar, aonoVar, cavVarB, i6 & 1008);
        } else {
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.aono aonoVar2 = aonoVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.buo(nfVar, cmwVar2, aonoVar2, i, i2, 0);
        }
    }

    public static defpackage.bor ak(defpackage.cav cavVar) {
        return ((defpackage.bqv) cavVar.e(defpackage.bqx.a)).a;
    }

    public static defpackage.bry al(defpackage.cav cavVar) {
        return ((defpackage.bqv) cavVar.e(defpackage.bqx.a)).d;
    }

    public static defpackage.bti am(defpackage.cav cavVar) {
        return ((defpackage.bqv) cavVar.e(defpackage.bqx.a)).c;
    }

    public static defpackage.bwo an(defpackage.cav cavVar) {
        return ((defpackage.bqv) cavVar.e(defpackage.bqx.a)).b;
    }

    public static /* synthetic */ defpackage.aojh ao(defpackage.ayy ayyVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        if (cavVar.H((i & 3) != 2, i & 1)) {
            defpackage.ayy ayyVar2 = defpackage.bnj.a;
            defpackage.cmw cmwVarA = new defpackage.azu(defpackage.bnj.c, defpackage.bnj.c()).a(new defpackage.azb(ayyVar));
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.e, defpackage.cmh.n, cavVar, 54);
            long jA = cavVar.a();
            long j = jA ^ (jA >>> 32);
            defpackage.cje cjeVarM = cavVar.M();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar, cmwVarA);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            defpackage.cev.c(cavVar, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVar, cjeVarM, defpackage.dam.d);
            defpackage.cev.c(cavVar, java.lang.Integer.valueOf((int) j), defpackage.dam.f);
            cavVar.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVar, cmwVarM, defpackage.dam.c);
            aonoVar.a(defpackage.azk.a, cavVar, 6);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static void ap(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, defpackage.bni bniVar, bnm bnmVar, defpackage.amu amuVar, final defpackage.ayy ayyVar, final defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.kaw kawVar;
        defpackage.cer cerVarA;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1310015664);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(bniVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(bnmVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(amuVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.B(ayyVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cavVarB.B(null) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        if (cavVarB.H((306783379 & i2) != 306783378, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVarB.u(1691726283);
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            defpackage.kaw kawVar2 = (defpackage.kaw) objR;
            cbtVar.W(false);
            long jA = bniVar.a(z);
            final long jB = bniVar.b(z);
            if (bnmVar == null) {
                cavVarB.u(1691909926);
                cbtVar.W(false);
                kawVar = kawVar2;
                cerVarA = null;
            } else {
                cavVarB.u(-499611589);
                int i4 = (((i2 >> 6) & 14) | ((i2 >> 9) & 896)) & 910;
                kawVar = kawVar2;
                cerVarA = bnmVar.a(z, kawVar, cavVarB, i4);
                cbtVar.W(false);
            }
            float f = cerVarA != null ? ((defpackage.dpi) cerVarA.a()).a : 0.0f;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.aln(15);
                cbtVar.ab(objR2);
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dig.a;
            cavVar2 = cavVarB;
            defpackage.bvo.d(aomyVar, cmwVar.a(new defpackage.dhs(false, (defpackage.aonj) objR2)), z, crdVar, jA, jB, 0.0f, f, amuVar, kawVar, defpackage.cfo.j(-535639973, new defpackage.aonn() { // from class: bnt
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.cav cavVar3 = (defpackage.cav) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    int i5 = iIntValue & 3;
                    if (cavVar3.H(i5 != 2, iIntValue & 1)) {
                        defpackage.den.af(jB, ((defpackage.bqv) cavVar3.e(defpackage.bqx.a)).b.m, defpackage.cfo.j(417635459, new defpackage.bec(ayyVar, aonoVar, 3, null), cavVar3), cavVar3, 384);
                    } else {
                        cavVar3.s();
                    }
                    return defpackage.aojh.a;
                }
            }, cavVarB), cavVar2, 64);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bnu(aomyVar, cmwVar, z, crdVar, bniVar, bnmVar, amuVar, ayyVar, aonoVar, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0150  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static void aq(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, defpackage.bni bniVar, defpackage.ayy ayyVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        boolean z2;
        int i5;
        defpackage.crd crdVarA;
        defpackage.bni bniVarB;
        int i6;
        boolean z3;
        defpackage.cav cavVar2;
        boolean z4;
        defpackage.cmw cmwVar3;
        defpackage.crd crdVar2;
        defpackage.bni bniVar2;
        defpackage.ayy ayyVar2;
        defpackage.cdk cdkVarI;
        int i7;
        int i8;
        defpackage.cmw cmwVar4;
        defpackage.ayy ayyVar3;
        defpackage.crd crdVar3;
        defpackage.bni bniVar3;
        boolean z5;
        defpackage.cmw cmwVar5;
        int i9;
        int i10;
        int i11;
        int i12 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1061374109);
        if (i12 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != cavVarB.C(z)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i11 = 1024;
                if ((i2 & 8) == 0) {
                    crdVarA = crdVar;
                    if (cavVarB.B(crdVarA)) {
                        i11 = 2048;
                    }
                } else {
                    crdVarA = crdVar;
                }
                i3 |= i11;
            } else {
                crdVarA = crdVar;
            }
            if ((i & 24576) == 0) {
                i10 = 8192;
                if ((i2 & 16) == 0) {
                    bniVarB = bniVar;
                    if (cavVarB.B(bniVarB)) {
                        i10 = 16384;
                    }
                } else {
                    bniVarB = bniVar;
                }
                i3 |= i10;
            } else {
                bniVarB = bniVar;
            }
            i6 = i3 | 115015680;
            if ((805306368 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i9 = 268435456;
                } else {
                    i9 = 536870912;
                }
                i6 |= i9;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i6 & 1)) {
                i7 = i2 & 16;
                i8 = i2 & 8;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0 || cavVarB.E()) {
                    if (i13 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    boolean z6 = (!z2) | z;
                    if (i8 != 0) {
                        i6 &= -7169;
                        defpackage.ayy ayyVar4 = defpackage.bnj.a;
                        int i14 = defpackage.btj.a;
                        crdVarA = defpackage.btj.a(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).c, 6);
                    }
                    if (i7 != 0) {
                        defpackage.ayy ayyVar5 = defpackage.bnj.a;
                        i6 &= -57345;
                        bniVarB = defpackage.bnj.b(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).a);
                    }
                    defpackage.ayy ayyVar6 = defpackage.bnj.a;
                    ayyVar3 = defpackage.bnj.b;
                    crdVar3 = crdVarA;
                    bniVar3 = bniVarB;
                    z5 = z6;
                    cmwVar5 = cmwVar4;
                } else {
                    cavVarB.s();
                    if (i8 != 0) {
                        i6 &= -7169;
                    }
                    if (i7 != 0) {
                        i6 &= -57345;
                    }
                    ayyVar3 = ayyVar;
                    cmwVar5 = cmwVar2;
                    crdVar3 = crdVarA;
                    bniVar3 = bniVarB;
                    z5 = z;
                }
                cavVarB.l();
                cavVar2 = cavVarB;
                ap(aomyVar, cmwVar5, z5, crdVar3, bniVar3, null, null, ayyVar3, aonoVar, cavVar2, i6 & 2147483646);
                cmwVar3 = cmwVar5;
                z4 = z5;
                crdVar2 = crdVar3;
                bniVar2 = bniVar3;
                ayyVar2 = ayyVar3;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                z4 = z;
                cmwVar3 = cmwVar2;
                crdVar2 = crdVarA;
                bniVar2 = bniVarB;
                ayyVar2 = ayyVar;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpo(aomyVar, cmwVar3, z4, crdVar2, bniVar2, ayyVar2, aonoVar, i, i2, 1);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != cavVarB.C(z)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i11 = 1024;
            if ((i2 & 8) == 0) {
                crdVarA = crdVar;
                if (cavVarB.B(crdVarA)) {
                    i11 = 2048;
                }
            } else {
                crdVarA = crdVar;
            }
            i3 |= i11;
        } else {
            crdVarA = crdVar;
        }
        if ((i & 24576) == 0) {
            i10 = 8192;
            if ((i2 & 16) == 0) {
                bniVarB = bniVar;
                if (cavVarB.B(bniVarB)) {
                    i10 = 16384;
                }
            } else {
                bniVarB = bniVar;
            }
            i3 |= i10;
        } else {
            bniVarB = bniVar;
        }
        i6 = i3 | 115015680;
        if ((805306368 & i) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i9 = 268435456;
            } else {
                i9 = 536870912;
            }
            i6 |= i9;
        }
        if ((306783379 & i6) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cavVarB.H(z3, i6 & 1)) {
            i7 = i2 & 16;
            i8 = i2 & 8;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                boolean z7 = (!z2) | z;
                if (i8 != 0) {
                    i6 &= -7169;
                    defpackage.ayy ayyVar7 = defpackage.bnj.a;
                    int i15 = defpackage.btj.a;
                    crdVarA = defpackage.btj.a(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).c, 6);
                }
                if (i7 != 0) {
                    defpackage.ayy ayyVar8 = defpackage.bnj.a;
                    i6 &= -57345;
                    bniVarB = defpackage.bnj.b(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).a);
                }
                defpackage.ayy ayyVar9 = defpackage.bnj.a;
                ayyVar3 = defpackage.bnj.b;
                crdVar3 = crdVarA;
                bniVar3 = bniVarB;
                z5 = z7;
                cmwVar5 = cmwVar4;
            } else {
                if (i13 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                boolean z8 = (!z2) | z;
                if (i8 != 0) {
                    i6 &= -7169;
                    defpackage.ayy ayyVar10 = defpackage.bnj.a;
                    int i16 = defpackage.btj.a;
                    crdVarA = defpackage.btj.a(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).c, 6);
                }
                if (i7 != 0) {
                    defpackage.ayy ayyVar11 = defpackage.bnj.a;
                    i6 &= -57345;
                    bniVarB = defpackage.bnj.b(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).a);
                }
                defpackage.ayy ayyVar12 = defpackage.bnj.a;
                ayyVar3 = defpackage.bnj.b;
                crdVar3 = crdVarA;
                bniVar3 = bniVarB;
                z5 = z8;
                cmwVar5 = cmwVar4;
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            ap(aomyVar, cmwVar5, z5, crdVar3, bniVar3, null, null, ayyVar3, aonoVar, cavVar2, i6 & 2147483646);
            cmwVar3 = cmwVar5;
            z4 = z5;
            crdVar2 = crdVar3;
            bniVar2 = bniVar3;
            ayyVar2 = ayyVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            z4 = z;
            cmwVar3 = cmwVar2;
            crdVar2 = crdVarA;
            bniVar2 = bniVarB;
            ayyVar2 = ayyVar;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpo(aomyVar, cmwVar3, z4, crdVar2, bniVar2, ayyVar2, aonoVar, i, i2, 1);
        }
    }

    public static int ar(boolean z, int i, int i2) {
        if ((z || i != 2) && i2 > 0) {
            return i2;
        }
        return 1;
    }

    public static int as(long j, boolean z, int i, float f) {
        int iB = Integer.MAX_VALUE;
        if ((z || i == 2) && defpackage.dpd.h(j)) {
            iB = defpackage.dpd.b(j);
        }
        if (defpackage.dpd.d(j) == iB) {
            return iB;
        }
        return defpackage.aooc.w(java.lang.Math.round((float) java.lang.Math.ceil(f)), defpackage.dpd.d(j), iB);
    }

    public static void at(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            avo.c(defpackage.a.bA(i2, i, "both minLines ", " and maxLines ", " must be greater than zero"));
        }
        if (i > i2) {
            avo.c(defpackage.a.bf(i2, i, "minLines ", " must be less than or equal to maxLines "));
        }
    }

    public static java.util.List au(java.util.List list, defpackage.aomy aomyVar) {
        int iB;
        int iA;
        defpackage.nu bhlVar;
        if (!((java.lang.Boolean) aomyVar.a()).booleanValue()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.cyd cydVar = (defpackage.cyd) list.get(i);
            java.lang.Object objG = cydVar.g();
            if (objG == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            }
            ebw ebwVar = ((bha) objG).a;
            java.lang.Object obj = ebwVar.b;
            java.lang.Object obj2 = ebwVar.a;
            defpackage.dkw dkwVarA = ((bgy) obj).a();
            if (dkwVarA == null) {
                bhlVar = new defpackage.nu(14);
            } else {
                defpackage.djg djgVarD = bgy.d((defpackage.djg) obj2, dkwVarA);
                if (djgVarD == null) {
                    bhlVar = new defpackage.nu(15);
                } else {
                    defpackage.dpo dpoVarJ = defpackage.dfd.j(dkwVarA.p(djgVarD.b, djgVarD.c).b());
                    iB = dpoVarJ.b();
                    iA = dpoVarJ.a();
                    bhlVar = new bhl(dpoVarJ, 1);
                }
                arrayList.add(new defpackage.aoiu(cydVar.v(defpackage.dpe.k(iB, iB, iA, iA)), bhlVar));
            }
            iB = 0;
            iA = 0;
            arrayList.add(new defpackage.aoiu(cydVar.v(defpackage.dpe.k(iB, iB, iA, iA)), bhlVar));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0113  */
    /* JADX WARN: Code duplicated, block: B:103:0x0116  */
    /* JADX WARN: Code duplicated, block: B:107:0x011f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0121  */
    /* JADX WARN: Code duplicated, block: B:110:0x0125  */
    /* JADX WARN: Code duplicated, block: B:112:0x012a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0130  */
    /* JADX WARN: Code duplicated, block: B:116:0x0138  */
    /* JADX WARN: Code duplicated, block: B:117:0x013b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0147  */
    /* JADX WARN: Code duplicated, block: B:122:0x0149  */
    /* JADX WARN: Code duplicated, block: B:125:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0157  */
    /* JADX WARN: Code duplicated, block: B:127:0x015c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0160  */
    /* JADX WARN: Code duplicated, block: B:130:0x0165  */
    /* JADX WARN: Code duplicated, block: B:132:0x0169  */
    /* JADX WARN: Code duplicated, block: B:133:0x016c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0170  */
    /* JADX WARN: Code duplicated, block: B:136:0x0172  */
    /* JADX WARN: Code duplicated, block: B:139:0x017b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0180  */
    /* JADX WARN: Code duplicated, block: B:142:0x0183  */
    /* JADX WARN: Code duplicated, block: B:143:0x0185  */
    /* JADX WARN: Code duplicated, block: B:146:0x0194  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:157:0x0217  */
    /* JADX WARN: Code duplicated, block: B:160:0x024e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x0264  */
    /* JADX WARN: Code duplicated, block: B:165:0x029e  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0102  */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x010c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void av(java.lang.String str, defpackage.cmw cmwVar, defpackage.dkz dkzVar, defpackage.aonj aonjVar, int i, boolean z, int i2, int i3, defpackage.cav cavVar, int i4, int i5) {
        int i6;
        defpackage.cmw cmwVar2;
        int i7;
        defpackage.dkz dkzVar2;
        int i8;
        int i9;
        defpackage.aonj aonjVar2;
        int i10;
        int i11;
        char c;
        int i12;
        int i13;
        int i14;
        boolean z2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean zD;
        int i22;
        boolean zD2;
        int i23;
        boolean z3;
        java.lang.String str2;
        defpackage.cmw cmwVar3;
        defpackage.dkz dkzVar3;
        int i24;
        int i25;
        defpackage.aonj aonjVar3;
        boolean z4;
        int i26;
        defpackage.cav cavVar2;
        defpackage.cdk cdkVarI;
        defpackage.cmw cmwVar4;
        defpackage.dkz dkzVar4;
        defpackage.aonj aonjVar4;
        blz blzVar;
        bjf bjfVar;
        defpackage.gat gatVar;
        defpackage.dnx dnxVar;
        defpackage.cav cavVar3;
        defpackage.cmw cmwVarH;
        defpackage.cbt cbtVar;
        defpackage.aomy aomyVar;
        long j;
        boolean zD3;
        defpackage.cbt cbtVar2;
        java.lang.Object objR;
        long jLongValue;
        boolean zA;
        java.lang.Object objR2;
        int i27 = i4 & 6;
        defpackage.cav cavVarB = cavVar.b(-1040751001);
        if (i27 == 0) {
            i6 = (true != cavVarB.B(str) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        int i28 = i5 & 2;
        if (i28 == 0) {
            if ((i4 & 48) == 0) {
                cmwVar2 = cmwVar;
                i6 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i7 = i5 & 4;
            if (i7 != 0) {
                if ((i4 & 384) == 0) {
                    dkzVar2 = dkzVar;
                    if (true != cavVarB.B(dkzVar2)) {
                        i8 = 128;
                    } else {
                        i8 = 256;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    if ((i4 & 3072) == 0) {
                        aonjVar2 = aonjVar;
                        if (true != cavVarB.D(aonjVar2)) {
                            i10 = 1024;
                        } else {
                            i10 = 2048;
                        }
                        i6 |= i10;
                    }
                    i11 = i5 & 16;
                    if (i11 != 0) {
                        i6 |= 24576;
                        i12 = i;
                        c = ' ';
                    } else {
                        c = ' ';
                        if ((i4 & 24576) == 0) {
                            i12 = i;
                            if (true != cavVarB.z(i12)) {
                                i13 = 8192;
                            } else {
                                i13 = 16384;
                            }
                            i6 |= i13;
                        } else {
                            i12 = i;
                        }
                    }
                    i14 = i5 & 32;
                    if (i14 != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (i14 != 0) {
                        if ((i4 & 196608) == 0) {
                            i15 = 0;
                            if (true != cavVarB.C(z)) {
                                i16 = 65536;
                            } else {
                                i16 = 131072;
                            }
                            i6 |= i16;
                        }
                        i17 = i5 & 64;
                        if (i17 != 0) {
                            if ((1572864 & i4) == 0) {
                                i18 = i2;
                                if (true != cavVarB.z(i18)) {
                                    i19 = 524288;
                                } else {
                                    i19 = 1048576;
                                }
                                i6 |= i19;
                            }
                            i20 = i5 & 128;
                            if (i20 != 0) {
                                if ((12582912 & i4) == 0) {
                                    if (true != cavVarB.z(i3)) {
                                        i21 = 4194304;
                                    } else {
                                        i21 = 8388608;
                                    }
                                    i6 |= i21;
                                }
                                if ((i5 & 256) != 0) {
                                    i6 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    if ((134217728 & i4) == 0) {
                                        zD = cavVarB.B(null);
                                    } else {
                                        zD = cavVarB.D(null);
                                    }
                                    if (true != zD) {
                                        i22 = 33554432;
                                    } else {
                                        i22 = 67108864;
                                    }
                                    i6 |= i22;
                                }
                                if ((i5 & 512) != 0) {
                                    i6 |= 805306368;
                                } else if ((i4 & 805306368) == 0) {
                                    if ((1073741824 & i4) == 0) {
                                        zD2 = cavVarB.B(null);
                                    } else {
                                        zD2 = cavVarB.D(null);
                                    }
                                    if (true != zD2) {
                                        i23 = 268435456;
                                    } else {
                                        i23 = 536870912;
                                    }
                                    i6 |= i23;
                                }
                                if ((306783379 & i6) != 306783378) {
                                    z3 = 1;
                                } else {
                                    z3 = i15;
                                }
                                if (cavVarB.H(z3, i6 & 1)) {
                                    if (i28 != 0) {
                                        cmwVar4 = defpackage.cmw.c;
                                    } else {
                                        cmwVar4 = cmwVar2;
                                    }
                                    if (i7 != 0) {
                                        dkzVar4 = defpackage.dkz.a;
                                    } else {
                                        dkzVar4 = dkzVar2;
                                    }
                                    if (i9 != 0) {
                                        aonjVar4 = null;
                                    } else {
                                        aonjVar4 = aonjVar2;
                                    }
                                    if (i11 != 0) {
                                        i25 = 1;
                                    } else {
                                        i25 = i12;
                                    }
                                    z4 = (!z2) | z;
                                    if (i17 != 0) {
                                        i24 = Integer.MAX_VALUE;
                                    } else {
                                        i24 = i18;
                                    }
                                    if (i20 != 0) {
                                        i26 = 1;
                                    } else {
                                        i26 = i3;
                                    }
                                    at(i26, i24);
                                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                                    if (blzVar != null) {
                                        cavVarB.u(356427477);
                                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                        java.lang.Object[] objArr = new java.lang.Object[1];
                                        objArr[i15] = blzVar;
                                        defpackage.dko dkoVar = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                        zD3 = cavVarB.D(blzVar);
                                        cbtVar2 = (defpackage.cbt) cavVarB;
                                        objR = cbtVar2.R();
                                        if (zD3 || objR == defpackage.cau.a) {
                                            objR = new apv(blzVar, 12);
                                            cbtVar2.ab(objR);
                                        }
                                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr, dkoVar, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                        objR2 = cbtVar2.R();
                                        if (zA || objR2 == defpackage.cau.a) {
                                            objR2 = new bjf(jLongValue, blzVar, j);
                                            cbtVar2.ab(objR2);
                                        }
                                        cbtVar2.W(false);
                                        bjfVar = (bjf) objR2;
                                    } else {
                                        cavVarB.u(357055103);
                                        ((defpackage.cbt) cavVarB).W(i15);
                                        bjfVar = null;
                                    }
                                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                                    cavVar3 = cavVarB;
                                    if (bjfVar == null || aonjVar4 != null) {
                                        str2 = str;
                                        cmwVar4 = cmwVar4;
                                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                    } else {
                                        str2 = str;
                                        cmwVarH = cmwVar4.a(new defpackage.bjo(str2, dkzVar4, gatVar, dnxVar, i25, z4, i24, i26));
                                    }
                                    defpackage.bgo bgoVar = defpackage.bgo.a;
                                    cbtVar = (defpackage.cbt) cavVar3;
                                    long j2 = cbtVar.x;
                                    long j3 = j2 ^ (j2 >>> c);
                                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar3, cmwVarH);
                                    defpackage.cje cjeVarAi = cbtVar.ai();
                                    aomyVar = defpackage.dam.a;
                                    cavVar3.v();
                                    if (cbtVar.w) {
                                        cavVar3.j(aomyVar);
                                    } else {
                                        cavVar3.x();
                                    }
                                    defpackage.cev.c(cavVar3, bgoVar, defpackage.dam.e);
                                    defpackage.cev.c(cavVar3, cjeVarAi, defpackage.dam.d);
                                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                                    defpackage.cev.c(cavVar3, cmwVarM, defpackage.dam.c);
                                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j3), defpackage.dam.f);
                                    cbtVar.W(true);
                                    cmwVar3 = cmwVar4;
                                    dkzVar3 = dkzVar4;
                                    aonjVar3 = aonjVar4;
                                    cavVar2 = cavVar3;
                                } else {
                                    str2 = str;
                                    defpackage.cav cavVar4 = cavVarB;
                                    cavVar4.s();
                                    cmwVar3 = cmwVar2;
                                    dkzVar3 = dkzVar2;
                                    i24 = i18;
                                    i25 = i12;
                                    aonjVar3 = aonjVar2;
                                    z4 = z;
                                    i26 = i3;
                                    cavVar2 = cavVar4;
                                }
                                cdkVarI = cavVar2.I();
                                if (cdkVarI != null) {
                                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                                }
                            }
                            i6 |= 12582912;
                            if ((i5 & 256) != 0) {
                                i6 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                if ((134217728 & i4) == 0) {
                                    zD = cavVarB.B(null);
                                } else {
                                    zD = cavVarB.D(null);
                                }
                                if (true != zD) {
                                    i22 = 33554432;
                                } else {
                                    i22 = 67108864;
                                }
                                i6 |= i22;
                            }
                            if ((i5 & 512) != 0) {
                                i6 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                if ((1073741824 & i4) == 0) {
                                    zD2 = cavVarB.B(null);
                                } else {
                                    zD2 = cavVarB.D(null);
                                }
                                if (true != zD2) {
                                    i23 = 268435456;
                                } else {
                                    i23 = 536870912;
                                }
                                i6 |= i23;
                            }
                            if ((306783379 & i6) != 306783378) {
                                z3 = 1;
                            } else {
                                z3 = i15;
                            }
                            if (cavVarB.H(z3, i6 & 1)) {
                                if (i28 != 0) {
                                    cmwVar4 = defpackage.cmw.c;
                                } else {
                                    cmwVar4 = cmwVar2;
                                }
                                if (i7 != 0) {
                                    dkzVar4 = defpackage.dkz.a;
                                } else {
                                    dkzVar4 = dkzVar2;
                                }
                                if (i9 != 0) {
                                    aonjVar4 = null;
                                } else {
                                    aonjVar4 = aonjVar2;
                                }
                                if (i11 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i12;
                                }
                                z4 = (!z2) | z;
                                if (i17 != 0) {
                                    i24 = Integer.MAX_VALUE;
                                } else {
                                    i24 = i18;
                                }
                                if (i20 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i3;
                                }
                                at(i26, i24);
                                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                                if (blzVar != null) {
                                    cavVarB.u(356427477);
                                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    objArr2[i15] = blzVar;
                                    defpackage.dko dkoVar2 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                    zD3 = cavVarB.D(blzVar);
                                    cbtVar2 = (defpackage.cbt) cavVarB;
                                    objR = cbtVar2.R();
                                    if (zD3) {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    } else {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    }
                                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr2, dkoVar2, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                    objR2 = cbtVar2.R();
                                    if (zA) {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    } else {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    }
                                    cbtVar2.W(false);
                                    bjfVar = (bjf) objR2;
                                } else {
                                    cavVarB.u(357055103);
                                    ((defpackage.cbt) cavVarB).W(i15);
                                    bjfVar = null;
                                }
                                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                                cavVar3 = cavVarB;
                                if (bjfVar == null) {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                } else {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                }
                                defpackage.bgo bgoVar2 = defpackage.bgo.a;
                                cbtVar = (defpackage.cbt) cavVar3;
                                long j4 = cbtVar.x;
                                long j5 = j4 ^ (j4 >>> c);
                                defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVar3, cmwVarH);
                                defpackage.cje cjeVarAi2 = cbtVar.ai();
                                aomyVar = defpackage.dam.a;
                                cavVar3.v();
                                if (cbtVar.w) {
                                    cavVar3.j(aomyVar);
                                } else {
                                    cavVar3.x();
                                }
                                defpackage.cev.c(cavVar3, bgoVar2, defpackage.dam.e);
                                defpackage.cev.c(cavVar3, cjeVarAi2, defpackage.dam.d);
                                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                                defpackage.cev.c(cavVar3, cmwVarM2, defpackage.dam.c);
                                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j5), defpackage.dam.f);
                                cbtVar.W(true);
                                cmwVar3 = cmwVar4;
                                dkzVar3 = dkzVar4;
                                aonjVar3 = aonjVar4;
                                cavVar2 = cavVar3;
                            } else {
                                str2 = str;
                                defpackage.cav cavVar5 = cavVarB;
                                cavVar5.s();
                                cmwVar3 = cmwVar2;
                                dkzVar3 = dkzVar2;
                                i24 = i18;
                                i25 = i12;
                                aonjVar3 = aonjVar2;
                                z4 = z;
                                i26 = i3;
                                cavVar2 = cavVar5;
                            }
                            cdkVarI = cavVar2.I();
                            if (cdkVarI != null) {
                                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                            }
                        }
                        i6 |= 1572864;
                        i18 = i2;
                        i20 = i5 & 128;
                        if (i20 != 0) {
                            if ((12582912 & i4) == 0) {
                                if (true != cavVarB.z(i3)) {
                                    i21 = 4194304;
                                } else {
                                    i21 = 8388608;
                                }
                                i6 |= i21;
                            }
                            if ((i5 & 256) != 0) {
                                i6 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                if ((134217728 & i4) == 0) {
                                    zD = cavVarB.B(null);
                                } else {
                                    zD = cavVarB.D(null);
                                }
                                if (true != zD) {
                                    i22 = 33554432;
                                } else {
                                    i22 = 67108864;
                                }
                                i6 |= i22;
                            }
                            if ((i5 & 512) != 0) {
                                i6 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                if ((1073741824 & i4) == 0) {
                                    zD2 = cavVarB.B(null);
                                } else {
                                    zD2 = cavVarB.D(null);
                                }
                                if (true != zD2) {
                                    i23 = 268435456;
                                } else {
                                    i23 = 536870912;
                                }
                                i6 |= i23;
                            }
                            if ((306783379 & i6) != 306783378) {
                                z3 = 1;
                            } else {
                                z3 = i15;
                            }
                            if (cavVarB.H(z3, i6 & 1)) {
                                if (i28 != 0) {
                                    cmwVar4 = defpackage.cmw.c;
                                } else {
                                    cmwVar4 = cmwVar2;
                                }
                                if (i7 != 0) {
                                    dkzVar4 = defpackage.dkz.a;
                                } else {
                                    dkzVar4 = dkzVar2;
                                }
                                if (i9 != 0) {
                                    aonjVar4 = null;
                                } else {
                                    aonjVar4 = aonjVar2;
                                }
                                if (i11 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i12;
                                }
                                z4 = (!z2) | z;
                                if (i17 != 0) {
                                    i24 = Integer.MAX_VALUE;
                                } else {
                                    i24 = i18;
                                }
                                if (i20 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i3;
                                }
                                at(i26, i24);
                                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                                if (blzVar != null) {
                                    cavVarB.u(356427477);
                                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    objArr3[i15] = blzVar;
                                    defpackage.dko dkoVar3 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                    zD3 = cavVarB.D(blzVar);
                                    cbtVar2 = (defpackage.cbt) cavVarB;
                                    objR = cbtVar2.R();
                                    if (zD3) {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    } else {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    }
                                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr3, dkoVar3, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                    objR2 = cbtVar2.R();
                                    if (zA) {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    } else {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    }
                                    cbtVar2.W(false);
                                    bjfVar = (bjf) objR2;
                                } else {
                                    cavVarB.u(357055103);
                                    ((defpackage.cbt) cavVarB).W(i15);
                                    bjfVar = null;
                                }
                                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                                cavVar3 = cavVarB;
                                if (bjfVar == null) {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                } else {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                }
                                defpackage.bgo bgoVar3 = defpackage.bgo.a;
                                cbtVar = (defpackage.cbt) cavVar3;
                                long j6 = cbtVar.x;
                                long j7 = j6 ^ (j6 >>> c);
                                defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVar3, cmwVarH);
                                defpackage.cje cjeVarAi3 = cbtVar.ai();
                                aomyVar = defpackage.dam.a;
                                cavVar3.v();
                                if (cbtVar.w) {
                                    cavVar3.j(aomyVar);
                                } else {
                                    cavVar3.x();
                                }
                                defpackage.cev.c(cavVar3, bgoVar3, defpackage.dam.e);
                                defpackage.cev.c(cavVar3, cjeVarAi3, defpackage.dam.d);
                                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                                defpackage.cev.c(cavVar3, cmwVarM3, defpackage.dam.c);
                                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j7), defpackage.dam.f);
                                cbtVar.W(true);
                                cmwVar3 = cmwVar4;
                                dkzVar3 = dkzVar4;
                                aonjVar3 = aonjVar4;
                                cavVar2 = cavVar3;
                            } else {
                                str2 = str;
                                defpackage.cav cavVar6 = cavVarB;
                                cavVar6.s();
                                cmwVar3 = cmwVar2;
                                dkzVar3 = dkzVar2;
                                i24 = i18;
                                i25 = i12;
                                aonjVar3 = aonjVar2;
                                z4 = z;
                                i26 = i3;
                                cavVar2 = cavVar6;
                            }
                            cdkVarI = cavVar2.I();
                            if (cdkVarI != null) {
                                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                            }
                        }
                        i6 |= 12582912;
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                objArr4[i15] = blzVar;
                                defpackage.dko dkoVar4 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr4, dkoVar4, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar4 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j8 = cbtVar.x;
                            long j9 = j8 ^ (j8 >>> c);
                            defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi4 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar4, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi4, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM4, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j9), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar7 = cavVarB;
                            cavVar7.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar7;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 196608;
                    i15 = 0;
                    i17 = i5 & 64;
                    if (i17 != 0) {
                        if ((1572864 & i4) == 0) {
                            i18 = i2;
                            if (true != cavVarB.z(i18)) {
                                i19 = 524288;
                            } else {
                                i19 = 1048576;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 128;
                        if (i20 != 0) {
                            if ((12582912 & i4) == 0) {
                                if (true != cavVarB.z(i3)) {
                                    i21 = 4194304;
                                } else {
                                    i21 = 8388608;
                                }
                                i6 |= i21;
                            }
                            if ((i5 & 256) != 0) {
                                i6 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                if ((134217728 & i4) == 0) {
                                    zD = cavVarB.B(null);
                                } else {
                                    zD = cavVarB.D(null);
                                }
                                if (true != zD) {
                                    i22 = 33554432;
                                } else {
                                    i22 = 67108864;
                                }
                                i6 |= i22;
                            }
                            if ((i5 & 512) != 0) {
                                i6 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                if ((1073741824 & i4) == 0) {
                                    zD2 = cavVarB.B(null);
                                } else {
                                    zD2 = cavVarB.D(null);
                                }
                                if (true != zD2) {
                                    i23 = 268435456;
                                } else {
                                    i23 = 536870912;
                                }
                                i6 |= i23;
                            }
                            if ((306783379 & i6) != 306783378) {
                                z3 = 1;
                            } else {
                                z3 = i15;
                            }
                            if (cavVarB.H(z3, i6 & 1)) {
                                if (i28 != 0) {
                                    cmwVar4 = defpackage.cmw.c;
                                } else {
                                    cmwVar4 = cmwVar2;
                                }
                                if (i7 != 0) {
                                    dkzVar4 = defpackage.dkz.a;
                                } else {
                                    dkzVar4 = dkzVar2;
                                }
                                if (i9 != 0) {
                                    aonjVar4 = null;
                                } else {
                                    aonjVar4 = aonjVar2;
                                }
                                if (i11 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i12;
                                }
                                z4 = (!z2) | z;
                                if (i17 != 0) {
                                    i24 = Integer.MAX_VALUE;
                                } else {
                                    i24 = i18;
                                }
                                if (i20 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i3;
                                }
                                at(i26, i24);
                                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                                if (blzVar != null) {
                                    cavVarB.u(356427477);
                                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    objArr5[i15] = blzVar;
                                    defpackage.dko dkoVar5 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                    zD3 = cavVarB.D(blzVar);
                                    cbtVar2 = (defpackage.cbt) cavVarB;
                                    objR = cbtVar2.R();
                                    if (zD3) {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    } else {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    }
                                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr5, dkoVar5, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                    objR2 = cbtVar2.R();
                                    if (zA) {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    } else {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    }
                                    cbtVar2.W(false);
                                    bjfVar = (bjf) objR2;
                                } else {
                                    cavVarB.u(357055103);
                                    ((defpackage.cbt) cavVarB).W(i15);
                                    bjfVar = null;
                                }
                                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                                cavVar3 = cavVarB;
                                if (bjfVar == null) {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                } else {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                }
                                defpackage.bgo bgoVar5 = defpackage.bgo.a;
                                cbtVar = (defpackage.cbt) cavVar3;
                                long j10 = cbtVar.x;
                                long j11 = j10 ^ (j10 >>> c);
                                defpackage.cmw cmwVarM5 = defpackage.cfo.m(cavVar3, cmwVarH);
                                defpackage.cje cjeVarAi5 = cbtVar.ai();
                                aomyVar = defpackage.dam.a;
                                cavVar3.v();
                                if (cbtVar.w) {
                                    cavVar3.j(aomyVar);
                                } else {
                                    cavVar3.x();
                                }
                                defpackage.cev.c(cavVar3, bgoVar5, defpackage.dam.e);
                                defpackage.cev.c(cavVar3, cjeVarAi5, defpackage.dam.d);
                                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                                defpackage.cev.c(cavVar3, cmwVarM5, defpackage.dam.c);
                                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11), defpackage.dam.f);
                                cbtVar.W(true);
                                cmwVar3 = cmwVar4;
                                dkzVar3 = dkzVar4;
                                aonjVar3 = aonjVar4;
                                cavVar2 = cavVar3;
                            } else {
                                str2 = str;
                                defpackage.cav cavVar8 = cavVarB;
                                cavVar8.s();
                                cmwVar3 = cmwVar2;
                                dkzVar3 = dkzVar2;
                                i24 = i18;
                                i25 = i12;
                                aonjVar3 = aonjVar2;
                                z4 = z;
                                i26 = i3;
                                cavVar2 = cavVar8;
                            }
                            cdkVarI = cavVar2.I();
                            if (cdkVarI != null) {
                                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                            }
                        }
                        i6 |= 12582912;
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                objArr6[i15] = blzVar;
                                defpackage.dko dkoVar6 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr6, dkoVar6, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar6 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j12 = cbtVar.x;
                            long j13 = j12 ^ (j12 >>> c);
                            defpackage.cmw cmwVarM6 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi6 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar6, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi6, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM6, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j13), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar9 = cavVarB;
                            cavVar9.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar9;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 1572864;
                    i18 = i2;
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                objArr7[i15] = blzVar;
                                defpackage.dko dkoVar7 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr7, dkoVar7, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar7 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j14 = cbtVar.x;
                            long j15 = j14 ^ (j14 >>> c);
                            defpackage.cmw cmwVarM7 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi7 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar7, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi7, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM7, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j15), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar10 = cavVarB;
                            cavVar10.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar10;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            objArr8[i15] = blzVar;
                            defpackage.dko dkoVar8 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr8, dkoVar8, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar8 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j16 = cbtVar.x;
                        long j17 = j16 ^ (j16 >>> c);
                        defpackage.cmw cmwVarM8 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi8 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar8, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi8, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM8, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j17), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar11 = cavVarB;
                        cavVar11.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar11;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 3072;
                aonjVar2 = aonjVar;
                i11 = i5 & 16;
                if (i11 != 0) {
                    i6 |= 24576;
                    i12 = i;
                    c = ' ';
                } else {
                    c = ' ';
                    if ((i4 & 24576) == 0) {
                        i12 = i;
                        if (true != cavVarB.z(i12)) {
                            i13 = 8192;
                        } else {
                            i13 = 16384;
                        }
                        i6 |= i13;
                    } else {
                        i12 = i;
                    }
                }
                i14 = i5 & 32;
                if (i14 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i14 != 0) {
                    if ((i4 & 196608) == 0) {
                        i15 = 0;
                        if (true != cavVarB.C(z)) {
                            i16 = 65536;
                        } else {
                            i16 = 131072;
                        }
                        i6 |= i16;
                    }
                    i17 = i5 & 64;
                    if (i17 != 0) {
                        if ((1572864 & i4) == 0) {
                            i18 = i2;
                            if (true != cavVarB.z(i18)) {
                                i19 = 524288;
                            } else {
                                i19 = 1048576;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 128;
                        if (i20 != 0) {
                            if ((12582912 & i4) == 0) {
                                if (true != cavVarB.z(i3)) {
                                    i21 = 4194304;
                                } else {
                                    i21 = 8388608;
                                }
                                i6 |= i21;
                            }
                            if ((i5 & 256) != 0) {
                                i6 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                if ((134217728 & i4) == 0) {
                                    zD = cavVarB.B(null);
                                } else {
                                    zD = cavVarB.D(null);
                                }
                                if (true != zD) {
                                    i22 = 33554432;
                                } else {
                                    i22 = 67108864;
                                }
                                i6 |= i22;
                            }
                            if ((i5 & 512) != 0) {
                                i6 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                if ((1073741824 & i4) == 0) {
                                    zD2 = cavVarB.B(null);
                                } else {
                                    zD2 = cavVarB.D(null);
                                }
                                if (true != zD2) {
                                    i23 = 268435456;
                                } else {
                                    i23 = 536870912;
                                }
                                i6 |= i23;
                            }
                            if ((306783379 & i6) != 306783378) {
                                z3 = 1;
                            } else {
                                z3 = i15;
                            }
                            if (cavVarB.H(z3, i6 & 1)) {
                                if (i28 != 0) {
                                    cmwVar4 = defpackage.cmw.c;
                                } else {
                                    cmwVar4 = cmwVar2;
                                }
                                if (i7 != 0) {
                                    dkzVar4 = defpackage.dkz.a;
                                } else {
                                    dkzVar4 = dkzVar2;
                                }
                                if (i9 != 0) {
                                    aonjVar4 = null;
                                } else {
                                    aonjVar4 = aonjVar2;
                                }
                                if (i11 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i12;
                                }
                                z4 = (!z2) | z;
                                if (i17 != 0) {
                                    i24 = Integer.MAX_VALUE;
                                } else {
                                    i24 = i18;
                                }
                                if (i20 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i3;
                                }
                                at(i26, i24);
                                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                                if (blzVar != null) {
                                    cavVarB.u(356427477);
                                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    objArr9[i15] = blzVar;
                                    defpackage.dko dkoVar9 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                    zD3 = cavVarB.D(blzVar);
                                    cbtVar2 = (defpackage.cbt) cavVarB;
                                    objR = cbtVar2.R();
                                    if (zD3) {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    } else {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    }
                                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr9, dkoVar9, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                    objR2 = cbtVar2.R();
                                    if (zA) {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    } else {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    }
                                    cbtVar2.W(false);
                                    bjfVar = (bjf) objR2;
                                } else {
                                    cavVarB.u(357055103);
                                    ((defpackage.cbt) cavVarB).W(i15);
                                    bjfVar = null;
                                }
                                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                                cavVar3 = cavVarB;
                                if (bjfVar == null) {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                } else {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                }
                                defpackage.bgo bgoVar9 = defpackage.bgo.a;
                                cbtVar = (defpackage.cbt) cavVar3;
                                long j18 = cbtVar.x;
                                long j19 = j18 ^ (j18 >>> c);
                                defpackage.cmw cmwVarM9 = defpackage.cfo.m(cavVar3, cmwVarH);
                                defpackage.cje cjeVarAi9 = cbtVar.ai();
                                aomyVar = defpackage.dam.a;
                                cavVar3.v();
                                if (cbtVar.w) {
                                    cavVar3.j(aomyVar);
                                } else {
                                    cavVar3.x();
                                }
                                defpackage.cev.c(cavVar3, bgoVar9, defpackage.dam.e);
                                defpackage.cev.c(cavVar3, cjeVarAi9, defpackage.dam.d);
                                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                                defpackage.cev.c(cavVar3, cmwVarM9, defpackage.dam.c);
                                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j19), defpackage.dam.f);
                                cbtVar.W(true);
                                cmwVar3 = cmwVar4;
                                dkzVar3 = dkzVar4;
                                aonjVar3 = aonjVar4;
                                cavVar2 = cavVar3;
                            } else {
                                str2 = str;
                                defpackage.cav cavVar12 = cavVarB;
                                cavVar12.s();
                                cmwVar3 = cmwVar2;
                                dkzVar3 = dkzVar2;
                                i24 = i18;
                                i25 = i12;
                                aonjVar3 = aonjVar2;
                                z4 = z;
                                i26 = i3;
                                cavVar2 = cavVar12;
                            }
                            cdkVarI = cavVar2.I();
                            if (cdkVarI != null) {
                                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                            }
                        }
                        i6 |= 12582912;
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                objArr10[i15] = blzVar;
                                defpackage.dko dkoVar10 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr10, dkoVar10, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar10 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j110 = cbtVar.x;
                            long j111 = j110 ^ (j110 >>> c);
                            defpackage.cmw cmwVarM10 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi10 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar10, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi10, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM10, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar13 = cavVarB;
                            cavVar13.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar13;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 1572864;
                    i18 = i2;
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                objArr11[i15] = blzVar;
                                defpackage.dko dkoVar11 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11, dkoVar11, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar11 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j112 = cbtVar.x;
                            long j113 = j112 ^ (j112 >>> c);
                            defpackage.cmw cmwVarM11 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi11 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar11, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi11, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM11, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j113), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar14 = cavVarB;
                            cavVar14.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar14;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            objArr12[i15] = blzVar;
                            defpackage.dko dkoVar12 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr12, dkoVar12, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar12 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j114 = cbtVar.x;
                        long j115 = j114 ^ (j114 >>> c);
                        defpackage.cmw cmwVarM12 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi12 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar12, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi12, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM12, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j115), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar15 = cavVarB;
                        cavVar15.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar15;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 196608;
                i15 = 0;
                i17 = i5 & 64;
                if (i17 != 0) {
                    if ((1572864 & i4) == 0) {
                        i18 = i2;
                        if (true != cavVarB.z(i18)) {
                            i19 = 524288;
                        } else {
                            i19 = 1048576;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                objArr13[i15] = blzVar;
                                defpackage.dko dkoVar13 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr13, dkoVar13, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar13 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j116 = cbtVar.x;
                            long j117 = j116 ^ (j116 >>> c);
                            defpackage.cmw cmwVarM13 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi13 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar13, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi13, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM13, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j117), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar16 = cavVarB;
                            cavVar16.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar16;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            objArr14[i15] = blzVar;
                            defpackage.dko dkoVar14 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr14, dkoVar14, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar14 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j118 = cbtVar.x;
                        long j119 = j118 ^ (j118 >>> c);
                        defpackage.cmw cmwVarM14 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi14 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar14, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi14, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM14, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j119), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar17 = cavVarB;
                        cavVar17.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar17;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 1572864;
                i18 = i2;
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            objArr15[i15] = blzVar;
                            defpackage.dko dkoVar15 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr15, dkoVar15, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar15 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j1110 = cbtVar.x;
                        long j1111 = j1110 ^ (j1110 >>> c);
                        defpackage.cmw cmwVarM15 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi15 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar15, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi15, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM15, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar18 = cavVarB;
                        cavVar18.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar18;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        objArr16[i15] = blzVar;
                        defpackage.dko dkoVar16 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr16, dkoVar16, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar16 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j1112 = cbtVar.x;
                    long j1113 = j1112 ^ (j1112 >>> c);
                    defpackage.cmw cmwVarM16 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi16 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar16, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi16, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM16, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1113), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar19 = cavVarB;
                    cavVar19.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar19;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 384;
            dkzVar2 = dkzVar;
            i9 = i5 & 8;
            if (i9 != 0) {
                if ((i4 & 3072) == 0) {
                    aonjVar2 = aonjVar;
                    if (true != cavVarB.D(aonjVar2)) {
                        i10 = 1024;
                    } else {
                        i10 = 2048;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 16;
                if (i11 != 0) {
                    i6 |= 24576;
                    i12 = i;
                    c = ' ';
                } else {
                    c = ' ';
                    if ((i4 & 24576) == 0) {
                        i12 = i;
                        if (true != cavVarB.z(i12)) {
                            i13 = 8192;
                        } else {
                            i13 = 16384;
                        }
                        i6 |= i13;
                    } else {
                        i12 = i;
                    }
                }
                i14 = i5 & 32;
                if (i14 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i14 != 0) {
                    if ((i4 & 196608) == 0) {
                        i15 = 0;
                        if (true != cavVarB.C(z)) {
                            i16 = 65536;
                        } else {
                            i16 = 131072;
                        }
                        i6 |= i16;
                    }
                    i17 = i5 & 64;
                    if (i17 != 0) {
                        if ((1572864 & i4) == 0) {
                            i18 = i2;
                            if (true != cavVarB.z(i18)) {
                                i19 = 524288;
                            } else {
                                i19 = 1048576;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 128;
                        if (i20 != 0) {
                            if ((12582912 & i4) == 0) {
                                if (true != cavVarB.z(i3)) {
                                    i21 = 4194304;
                                } else {
                                    i21 = 8388608;
                                }
                                i6 |= i21;
                            }
                            if ((i5 & 256) != 0) {
                                i6 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                if ((134217728 & i4) == 0) {
                                    zD = cavVarB.B(null);
                                } else {
                                    zD = cavVarB.D(null);
                                }
                                if (true != zD) {
                                    i22 = 33554432;
                                } else {
                                    i22 = 67108864;
                                }
                                i6 |= i22;
                            }
                            if ((i5 & 512) != 0) {
                                i6 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                if ((1073741824 & i4) == 0) {
                                    zD2 = cavVarB.B(null);
                                } else {
                                    zD2 = cavVarB.D(null);
                                }
                                if (true != zD2) {
                                    i23 = 268435456;
                                } else {
                                    i23 = 536870912;
                                }
                                i6 |= i23;
                            }
                            if ((306783379 & i6) != 306783378) {
                                z3 = 1;
                            } else {
                                z3 = i15;
                            }
                            if (cavVarB.H(z3, i6 & 1)) {
                                if (i28 != 0) {
                                    cmwVar4 = defpackage.cmw.c;
                                } else {
                                    cmwVar4 = cmwVar2;
                                }
                                if (i7 != 0) {
                                    dkzVar4 = defpackage.dkz.a;
                                } else {
                                    dkzVar4 = dkzVar2;
                                }
                                if (i9 != 0) {
                                    aonjVar4 = null;
                                } else {
                                    aonjVar4 = aonjVar2;
                                }
                                if (i11 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i12;
                                }
                                z4 = (!z2) | z;
                                if (i17 != 0) {
                                    i24 = Integer.MAX_VALUE;
                                } else {
                                    i24 = i18;
                                }
                                if (i20 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i3;
                                }
                                at(i26, i24);
                                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                                if (blzVar != null) {
                                    cavVarB.u(356427477);
                                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    objArr17[i15] = blzVar;
                                    defpackage.dko dkoVar17 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                    zD3 = cavVarB.D(blzVar);
                                    cbtVar2 = (defpackage.cbt) cavVarB;
                                    objR = cbtVar2.R();
                                    if (zD3) {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    } else {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    }
                                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr17, dkoVar17, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                    objR2 = cbtVar2.R();
                                    if (zA) {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    } else {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    }
                                    cbtVar2.W(false);
                                    bjfVar = (bjf) objR2;
                                } else {
                                    cavVarB.u(357055103);
                                    ((defpackage.cbt) cavVarB).W(i15);
                                    bjfVar = null;
                                }
                                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                                cavVar3 = cavVarB;
                                if (bjfVar == null) {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                } else {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                }
                                defpackage.bgo bgoVar17 = defpackage.bgo.a;
                                cbtVar = (defpackage.cbt) cavVar3;
                                long j1114 = cbtVar.x;
                                long j1115 = j1114 ^ (j1114 >>> c);
                                defpackage.cmw cmwVarM17 = defpackage.cfo.m(cavVar3, cmwVarH);
                                defpackage.cje cjeVarAi17 = cbtVar.ai();
                                aomyVar = defpackage.dam.a;
                                cavVar3.v();
                                if (cbtVar.w) {
                                    cavVar3.j(aomyVar);
                                } else {
                                    cavVar3.x();
                                }
                                defpackage.cev.c(cavVar3, bgoVar17, defpackage.dam.e);
                                defpackage.cev.c(cavVar3, cjeVarAi17, defpackage.dam.d);
                                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                                defpackage.cev.c(cavVar3, cmwVarM17, defpackage.dam.c);
                                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1115), defpackage.dam.f);
                                cbtVar.W(true);
                                cmwVar3 = cmwVar4;
                                dkzVar3 = dkzVar4;
                                aonjVar3 = aonjVar4;
                                cavVar2 = cavVar3;
                            } else {
                                str2 = str;
                                defpackage.cav cavVar110 = cavVarB;
                                cavVar110.s();
                                cmwVar3 = cmwVar2;
                                dkzVar3 = dkzVar2;
                                i24 = i18;
                                i25 = i12;
                                aonjVar3 = aonjVar2;
                                z4 = z;
                                i26 = i3;
                                cavVar2 = cavVar110;
                            }
                            cdkVarI = cavVar2.I();
                            if (cdkVarI != null) {
                                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                            }
                        }
                        i6 |= 12582912;
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                objArr18[i15] = blzVar;
                                defpackage.dko dkoVar18 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr18, dkoVar18, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar18 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j1116 = cbtVar.x;
                            long j1117 = j1116 ^ (j1116 >>> c);
                            defpackage.cmw cmwVarM18 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi18 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar18, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi18, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM18, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1117), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar111 = cavVarB;
                            cavVar111.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar111;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 1572864;
                    i18 = i2;
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                objArr19[i15] = blzVar;
                                defpackage.dko dkoVar19 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr19, dkoVar19, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar19 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j1118 = cbtVar.x;
                            long j1119 = j1118 ^ (j1118 >>> c);
                            defpackage.cmw cmwVarM19 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi19 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar19, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi19, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM19, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1119), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar112 = cavVarB;
                            cavVar112.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar112;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                            objArr110[i15] = blzVar;
                            defpackage.dko dkoVar110 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr110, dkoVar110, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar110 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j11110 = cbtVar.x;
                        long j11111 = j11110 ^ (j11110 >>> c);
                        defpackage.cmw cmwVarM110 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi110 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar110, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi110, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM110, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar113 = cavVarB;
                        cavVar113.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar113;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 196608;
                i15 = 0;
                i17 = i5 & 64;
                if (i17 != 0) {
                    if ((1572864 & i4) == 0) {
                        i18 = i2;
                        if (true != cavVarB.z(i18)) {
                            i19 = 524288;
                        } else {
                            i19 = 1048576;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                objArr111[i15] = blzVar;
                                defpackage.dko dkoVar111 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111, dkoVar111, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar111 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j11112 = cbtVar.x;
                            long j11113 = j11112 ^ (j11112 >>> c);
                            defpackage.cmw cmwVarM111 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi111 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar111, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi111, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM111, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11113), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar114 = cavVarB;
                            cavVar114.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar114;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                            objArr112[i15] = blzVar;
                            defpackage.dko dkoVar112 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr112, dkoVar112, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar112 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j11114 = cbtVar.x;
                        long j11115 = j11114 ^ (j11114 >>> c);
                        defpackage.cmw cmwVarM112 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi112 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar112, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi112, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM112, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11115), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar115 = cavVarB;
                        cavVar115.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar115;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 1572864;
                i18 = i2;
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                            objArr113[i15] = blzVar;
                            defpackage.dko dkoVar113 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr113, dkoVar113, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar113 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j11116 = cbtVar.x;
                        long j11117 = j11116 ^ (j11116 >>> c);
                        defpackage.cmw cmwVarM113 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi113 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar113, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi113, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM113, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11117), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar116 = cavVarB;
                        cavVar116.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar116;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                        objArr114[i15] = blzVar;
                        defpackage.dko dkoVar114 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr114, dkoVar114, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar114 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j11118 = cbtVar.x;
                    long j11119 = j11118 ^ (j11118 >>> c);
                    defpackage.cmw cmwVarM114 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi114 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar114, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi114, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM114, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11119), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar117 = cavVarB;
                    cavVar117.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar117;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 3072;
            aonjVar2 = aonjVar;
            i11 = i5 & 16;
            if (i11 != 0) {
                i6 |= 24576;
                i12 = i;
                c = ' ';
            } else {
                c = ' ';
                if ((i4 & 24576) == 0) {
                    i12 = i;
                    if (true != cavVarB.z(i12)) {
                        i13 = 8192;
                    } else {
                        i13 = 16384;
                    }
                    i6 |= i13;
                } else {
                    i12 = i;
                }
            }
            i14 = i5 & 32;
            if (i14 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i14 != 0) {
                if ((i4 & 196608) == 0) {
                    i15 = 0;
                    if (true != cavVarB.C(z)) {
                        i16 = 65536;
                    } else {
                        i16 = 131072;
                    }
                    i6 |= i16;
                }
                i17 = i5 & 64;
                if (i17 != 0) {
                    if ((1572864 & i4) == 0) {
                        i18 = i2;
                        if (true != cavVarB.z(i18)) {
                            i19 = 524288;
                        } else {
                            i19 = 1048576;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                objArr115[i15] = blzVar;
                                defpackage.dko dkoVar115 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr115, dkoVar115, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar115 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j111110 = cbtVar.x;
                            long j111111 = j111110 ^ (j111110 >>> c);
                            defpackage.cmw cmwVarM115 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi115 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar115, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi115, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM115, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar118 = cavVarB;
                            cavVar118.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar118;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                            objArr116[i15] = blzVar;
                            defpackage.dko dkoVar116 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr116, dkoVar116, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar116 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j111112 = cbtVar.x;
                        long j111113 = j111112 ^ (j111112 >>> c);
                        defpackage.cmw cmwVarM116 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi116 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar116, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi116, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM116, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111113), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar119 = cavVarB;
                        cavVar119.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar119;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 1572864;
                i18 = i2;
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                            objArr117[i15] = blzVar;
                            defpackage.dko dkoVar117 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr117, dkoVar117, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar117 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j111114 = cbtVar.x;
                        long j111115 = j111114 ^ (j111114 >>> c);
                        defpackage.cmw cmwVarM117 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi117 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar117, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi117, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM117, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111115), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar1110 = cavVarB;
                        cavVar1110.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar1110;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                        objArr118[i15] = blzVar;
                        defpackage.dko dkoVar118 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr118, dkoVar118, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar118 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j111116 = cbtVar.x;
                    long j111117 = j111116 ^ (j111116 >>> c);
                    defpackage.cmw cmwVarM118 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi118 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar118, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi118, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM118, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111117), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar1111 = cavVarB;
                    cavVar1111.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar1111;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 196608;
            i15 = 0;
            i17 = i5 & 64;
            if (i17 != 0) {
                if ((1572864 & i4) == 0) {
                    i18 = i2;
                    if (true != cavVarB.z(i18)) {
                        i19 = 524288;
                    } else {
                        i19 = 1048576;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                            objArr119[i15] = blzVar;
                            defpackage.dko dkoVar119 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr119, dkoVar119, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar119 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j111118 = cbtVar.x;
                        long j111119 = j111118 ^ (j111118 >>> c);
                        defpackage.cmw cmwVarM119 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi119 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar119, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi119, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM119, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111119), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar1112 = cavVarB;
                        cavVar1112.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar1112;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr1110 = new java.lang.Object[1];
                        objArr1110[i15] = blzVar;
                        defpackage.dko dkoVar1110 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1110, dkoVar1110, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar1110 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j1111110 = cbtVar.x;
                    long j1111111 = j1111110 ^ (j1111110 >>> c);
                    defpackage.cmw cmwVarM1110 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi1110 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar1110, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi1110, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM1110, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar1113 = cavVarB;
                    cavVar1113.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar1113;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 1572864;
            i18 = i2;
            i20 = i5 & 128;
            if (i20 != 0) {
                if ((12582912 & i4) == 0) {
                    if (true != cavVarB.z(i3)) {
                        i21 = 4194304;
                    } else {
                        i21 = 8388608;
                    }
                    i6 |= i21;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr1111 = new java.lang.Object[1];
                        objArr1111[i15] = blzVar;
                        defpackage.dko dkoVar1111 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1111, dkoVar1111, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar1111 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j1111112 = cbtVar.x;
                    long j1111113 = j1111112 ^ (j1111112 >>> c);
                    defpackage.cmw cmwVarM1111 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi1111 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar1111, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi1111, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM1111, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111113), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar1114 = cavVarB;
                    cavVar1114.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar1114;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 12582912;
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if ((134217728 & i4) == 0) {
                    zD = cavVarB.B(null);
                } else {
                    zD = cavVarB.D(null);
                }
                if (true != zD) {
                    i22 = 33554432;
                } else {
                    i22 = 67108864;
                }
                i6 |= i22;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zD2 = cavVarB.B(null);
                } else {
                    zD2 = cavVarB.D(null);
                }
                if (true != zD2) {
                    i23 = 268435456;
                } else {
                    i23 = 536870912;
                }
                i6 |= i23;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i15;
            }
            if (cavVarB.H(z3, i6 & 1)) {
                if (i28 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i7 != 0) {
                    dkzVar4 = defpackage.dkz.a;
                } else {
                    dkzVar4 = dkzVar2;
                }
                if (i9 != 0) {
                    aonjVar4 = null;
                } else {
                    aonjVar4 = aonjVar2;
                }
                if (i11 != 0) {
                    i25 = 1;
                } else {
                    i25 = i12;
                }
                z4 = (!z2) | z;
                if (i17 != 0) {
                    i24 = Integer.MAX_VALUE;
                } else {
                    i24 = i18;
                }
                if (i20 != 0) {
                    i26 = 1;
                } else {
                    i26 = i3;
                }
                at(i26, i24);
                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                if (blzVar != null) {
                    cavVarB.u(356427477);
                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                    java.lang.Object[] objArr1112 = new java.lang.Object[1];
                    objArr1112[i15] = blzVar;
                    defpackage.dko dkoVar1112 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                    zD3 = cavVarB.D(blzVar);
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR = cbtVar2.R();
                    if (zD3) {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    } else {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    }
                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1112, dkoVar1112, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                    objR2 = cbtVar2.R();
                    if (zA) {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    }
                    cbtVar2.W(false);
                    bjfVar = (bjf) objR2;
                } else {
                    cavVarB.u(357055103);
                    ((defpackage.cbt) cavVarB).W(i15);
                    bjfVar = null;
                }
                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                cavVar3 = cavVarB;
                if (bjfVar == null) {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                } else {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                }
                defpackage.bgo bgoVar1112 = defpackage.bgo.a;
                cbtVar = (defpackage.cbt) cavVar3;
                long j1111114 = cbtVar.x;
                long j1111115 = j1111114 ^ (j1111114 >>> c);
                defpackage.cmw cmwVarM1112 = defpackage.cfo.m(cavVar3, cmwVarH);
                defpackage.cje cjeVarAi1112 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVar3.v();
                if (cbtVar.w) {
                    cavVar3.j(aomyVar);
                } else {
                    cavVar3.x();
                }
                defpackage.cev.c(cavVar3, bgoVar1112, defpackage.dam.e);
                defpackage.cev.c(cavVar3, cjeVarAi1112, defpackage.dam.d);
                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVar3, cmwVarM1112, defpackage.dam.c);
                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111115), defpackage.dam.f);
                cbtVar.W(true);
                cmwVar3 = cmwVar4;
                dkzVar3 = dkzVar4;
                aonjVar3 = aonjVar4;
                cavVar2 = cavVar3;
            } else {
                str2 = str;
                defpackage.cav cavVar1115 = cavVarB;
                cavVar1115.s();
                cmwVar3 = cmwVar2;
                dkzVar3 = dkzVar2;
                i24 = i18;
                i25 = i12;
                aonjVar3 = aonjVar2;
                z4 = z;
                i26 = i3;
                cavVar2 = cavVar1115;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
            }
        }
        i6 |= 48;
        cmwVar2 = cmwVar;
        i7 = i5 & 4;
        if (i7 != 0) {
            if ((i4 & 384) == 0) {
                dkzVar2 = dkzVar;
                if (true != cavVarB.B(dkzVar2)) {
                    i8 = 128;
                } else {
                    i8 = 256;
                }
                i6 |= i8;
            }
            i9 = i5 & 8;
            if (i9 != 0) {
                if ((i4 & 3072) == 0) {
                    aonjVar2 = aonjVar;
                    if (true != cavVarB.D(aonjVar2)) {
                        i10 = 1024;
                    } else {
                        i10 = 2048;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 16;
                if (i11 != 0) {
                    i6 |= 24576;
                    i12 = i;
                    c = ' ';
                } else {
                    c = ' ';
                    if ((i4 & 24576) == 0) {
                        i12 = i;
                        if (true != cavVarB.z(i12)) {
                            i13 = 8192;
                        } else {
                            i13 = 16384;
                        }
                        i6 |= i13;
                    } else {
                        i12 = i;
                    }
                }
                i14 = i5 & 32;
                if (i14 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i14 != 0) {
                    if ((i4 & 196608) == 0) {
                        i15 = 0;
                        if (true != cavVarB.C(z)) {
                            i16 = 65536;
                        } else {
                            i16 = 131072;
                        }
                        i6 |= i16;
                    }
                    i17 = i5 & 64;
                    if (i17 != 0) {
                        if ((1572864 & i4) == 0) {
                            i18 = i2;
                            if (true != cavVarB.z(i18)) {
                                i19 = 524288;
                            } else {
                                i19 = 1048576;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 128;
                        if (i20 != 0) {
                            if ((12582912 & i4) == 0) {
                                if (true != cavVarB.z(i3)) {
                                    i21 = 4194304;
                                } else {
                                    i21 = 8388608;
                                }
                                i6 |= i21;
                            }
                            if ((i5 & 256) != 0) {
                                i6 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                if ((134217728 & i4) == 0) {
                                    zD = cavVarB.B(null);
                                } else {
                                    zD = cavVarB.D(null);
                                }
                                if (true != zD) {
                                    i22 = 33554432;
                                } else {
                                    i22 = 67108864;
                                }
                                i6 |= i22;
                            }
                            if ((i5 & 512) != 0) {
                                i6 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                if ((1073741824 & i4) == 0) {
                                    zD2 = cavVarB.B(null);
                                } else {
                                    zD2 = cavVarB.D(null);
                                }
                                if (true != zD2) {
                                    i23 = 268435456;
                                } else {
                                    i23 = 536870912;
                                }
                                i6 |= i23;
                            }
                            if ((306783379 & i6) != 306783378) {
                                z3 = 1;
                            } else {
                                z3 = i15;
                            }
                            if (cavVarB.H(z3, i6 & 1)) {
                                if (i28 != 0) {
                                    cmwVar4 = defpackage.cmw.c;
                                } else {
                                    cmwVar4 = cmwVar2;
                                }
                                if (i7 != 0) {
                                    dkzVar4 = defpackage.dkz.a;
                                } else {
                                    dkzVar4 = dkzVar2;
                                }
                                if (i9 != 0) {
                                    aonjVar4 = null;
                                } else {
                                    aonjVar4 = aonjVar2;
                                }
                                if (i11 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i12;
                                }
                                z4 = (!z2) | z;
                                if (i17 != 0) {
                                    i24 = Integer.MAX_VALUE;
                                } else {
                                    i24 = i18;
                                }
                                if (i20 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i3;
                                }
                                at(i26, i24);
                                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                                if (blzVar != null) {
                                    cavVarB.u(356427477);
                                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                    java.lang.Object[] objArr1113 = new java.lang.Object[1];
                                    objArr1113[i15] = blzVar;
                                    defpackage.dko dkoVar1113 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                    zD3 = cavVarB.D(blzVar);
                                    cbtVar2 = (defpackage.cbt) cavVarB;
                                    objR = cbtVar2.R();
                                    if (zD3) {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    } else {
                                        objR = new apv(blzVar, 12);
                                        cbtVar2.ab(objR);
                                    }
                                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1113, dkoVar1113, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                    objR2 = cbtVar2.R();
                                    if (zA) {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    } else {
                                        objR2 = new bjf(jLongValue, blzVar, j);
                                        cbtVar2.ab(objR2);
                                    }
                                    cbtVar2.W(false);
                                    bjfVar = (bjf) objR2;
                                } else {
                                    cavVarB.u(357055103);
                                    ((defpackage.cbt) cavVarB).W(i15);
                                    bjfVar = null;
                                }
                                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                                cavVar3 = cavVarB;
                                if (bjfVar == null) {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                } else {
                                    str2 = str;
                                    cmwVar4 = cmwVar4;
                                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                                }
                                defpackage.bgo bgoVar1113 = defpackage.bgo.a;
                                cbtVar = (defpackage.cbt) cavVar3;
                                long j1111116 = cbtVar.x;
                                long j1111117 = j1111116 ^ (j1111116 >>> c);
                                defpackage.cmw cmwVarM1113 = defpackage.cfo.m(cavVar3, cmwVarH);
                                defpackage.cje cjeVarAi1113 = cbtVar.ai();
                                aomyVar = defpackage.dam.a;
                                cavVar3.v();
                                if (cbtVar.w) {
                                    cavVar3.j(aomyVar);
                                } else {
                                    cavVar3.x();
                                }
                                defpackage.cev.c(cavVar3, bgoVar1113, defpackage.dam.e);
                                defpackage.cev.c(cavVar3, cjeVarAi1113, defpackage.dam.d);
                                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                                defpackage.cev.c(cavVar3, cmwVarM1113, defpackage.dam.c);
                                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111117), defpackage.dam.f);
                                cbtVar.W(true);
                                cmwVar3 = cmwVar4;
                                dkzVar3 = dkzVar4;
                                aonjVar3 = aonjVar4;
                                cavVar2 = cavVar3;
                            } else {
                                str2 = str;
                                defpackage.cav cavVar1116 = cavVarB;
                                cavVar1116.s();
                                cmwVar3 = cmwVar2;
                                dkzVar3 = dkzVar2;
                                i24 = i18;
                                i25 = i12;
                                aonjVar3 = aonjVar2;
                                z4 = z;
                                i26 = i3;
                                cavVar2 = cavVar1116;
                            }
                            cdkVarI = cavVar2.I();
                            if (cdkVarI != null) {
                                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                            }
                        }
                        i6 |= 12582912;
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr1114 = new java.lang.Object[1];
                                objArr1114[i15] = blzVar;
                                defpackage.dko dkoVar1114 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1114, dkoVar1114, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar1114 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j1111118 = cbtVar.x;
                            long j1111119 = j1111118 ^ (j1111118 >>> c);
                            defpackage.cmw cmwVarM1114 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi1114 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar1114, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi1114, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM1114, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111119), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar1117 = cavVarB;
                            cavVar1117.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar1117;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 1572864;
                    i18 = i2;
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr1115 = new java.lang.Object[1];
                                objArr1115[i15] = blzVar;
                                defpackage.dko dkoVar1115 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1115, dkoVar1115, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar1115 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j11111110 = cbtVar.x;
                            long j11111111 = j11111110 ^ (j11111110 >>> c);
                            defpackage.cmw cmwVarM1115 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi1115 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar1115, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi1115, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM1115, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111111), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar1118 = cavVarB;
                            cavVar1118.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar1118;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr1116 = new java.lang.Object[1];
                            objArr1116[i15] = blzVar;
                            defpackage.dko dkoVar1116 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1116, dkoVar1116, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar1116 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j11111112 = cbtVar.x;
                        long j11111113 = j11111112 ^ (j11111112 >>> c);
                        defpackage.cmw cmwVarM1116 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi1116 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar1116, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi1116, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM1116, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111113), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar1119 = cavVarB;
                        cavVar1119.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar1119;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 196608;
                i15 = 0;
                i17 = i5 & 64;
                if (i17 != 0) {
                    if ((1572864 & i4) == 0) {
                        i18 = i2;
                        if (true != cavVarB.z(i18)) {
                            i19 = 524288;
                        } else {
                            i19 = 1048576;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr1117 = new java.lang.Object[1];
                                objArr1117[i15] = blzVar;
                                defpackage.dko dkoVar1117 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1117, dkoVar1117, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar1117 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j11111114 = cbtVar.x;
                            long j11111115 = j11111114 ^ (j11111114 >>> c);
                            defpackage.cmw cmwVarM1117 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi1117 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar1117, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi1117, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM1117, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111115), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar11110 = cavVarB;
                            cavVar11110.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar11110;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr1118 = new java.lang.Object[1];
                            objArr1118[i15] = blzVar;
                            defpackage.dko dkoVar1118 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1118, dkoVar1118, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar1118 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j11111116 = cbtVar.x;
                        long j11111117 = j11111116 ^ (j11111116 >>> c);
                        defpackage.cmw cmwVarM1118 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi1118 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar1118, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi1118, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM1118, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111117), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar11111 = cavVarB;
                        cavVar11111.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar11111;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 1572864;
                i18 = i2;
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr1119 = new java.lang.Object[1];
                            objArr1119[i15] = blzVar;
                            defpackage.dko dkoVar1119 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1119, dkoVar1119, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar1119 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j11111118 = cbtVar.x;
                        long j11111119 = j11111118 ^ (j11111118 >>> c);
                        defpackage.cmw cmwVarM1119 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi1119 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar1119, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi1119, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM1119, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111119), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar11112 = cavVarB;
                        cavVar11112.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar11112;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr11110 = new java.lang.Object[1];
                        objArr11110[i15] = blzVar;
                        defpackage.dko dkoVar11110 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11110, dkoVar11110, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar11110 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j111111110 = cbtVar.x;
                    long j111111111 = j111111110 ^ (j111111110 >>> c);
                    defpackage.cmw cmwVarM11110 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi11110 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar11110, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi11110, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM11110, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111111), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar11113 = cavVarB;
                    cavVar11113.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar11113;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 3072;
            aonjVar2 = aonjVar;
            i11 = i5 & 16;
            if (i11 != 0) {
                i6 |= 24576;
                i12 = i;
                c = ' ';
            } else {
                c = ' ';
                if ((i4 & 24576) == 0) {
                    i12 = i;
                    if (true != cavVarB.z(i12)) {
                        i13 = 8192;
                    } else {
                        i13 = 16384;
                    }
                    i6 |= i13;
                } else {
                    i12 = i;
                }
            }
            i14 = i5 & 32;
            if (i14 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i14 != 0) {
                if ((i4 & 196608) == 0) {
                    i15 = 0;
                    if (true != cavVarB.C(z)) {
                        i16 = 65536;
                    } else {
                        i16 = 131072;
                    }
                    i6 |= i16;
                }
                i17 = i5 & 64;
                if (i17 != 0) {
                    if ((1572864 & i4) == 0) {
                        i18 = i2;
                        if (true != cavVarB.z(i18)) {
                            i19 = 524288;
                        } else {
                            i19 = 1048576;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr11111 = new java.lang.Object[1];
                                objArr11111[i15] = blzVar;
                                defpackage.dko dkoVar11111 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11111, dkoVar11111, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar11111 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j111111112 = cbtVar.x;
                            long j111111113 = j111111112 ^ (j111111112 >>> c);
                            defpackage.cmw cmwVarM11111 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi11111 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar11111, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi11111, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM11111, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111113), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar11114 = cavVarB;
                            cavVar11114.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar11114;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr11112 = new java.lang.Object[1];
                            objArr11112[i15] = blzVar;
                            defpackage.dko dkoVar11112 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11112, dkoVar11112, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar11112 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j111111114 = cbtVar.x;
                        long j111111115 = j111111114 ^ (j111111114 >>> c);
                        defpackage.cmw cmwVarM11112 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi11112 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar11112, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi11112, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM11112, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111115), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar11115 = cavVarB;
                        cavVar11115.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar11115;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 1572864;
                i18 = i2;
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr11113 = new java.lang.Object[1];
                            objArr11113[i15] = blzVar;
                            defpackage.dko dkoVar11113 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11113, dkoVar11113, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar11113 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j111111116 = cbtVar.x;
                        long j111111117 = j111111116 ^ (j111111116 >>> c);
                        defpackage.cmw cmwVarM11113 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi11113 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar11113, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi11113, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM11113, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111117), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar11116 = cavVarB;
                        cavVar11116.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar11116;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr11114 = new java.lang.Object[1];
                        objArr11114[i15] = blzVar;
                        defpackage.dko dkoVar11114 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11114, dkoVar11114, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar11114 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j111111118 = cbtVar.x;
                    long j111111119 = j111111118 ^ (j111111118 >>> c);
                    defpackage.cmw cmwVarM11114 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi11114 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar11114, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi11114, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM11114, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111119), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar11117 = cavVarB;
                    cavVar11117.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar11117;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 196608;
            i15 = 0;
            i17 = i5 & 64;
            if (i17 != 0) {
                if ((1572864 & i4) == 0) {
                    i18 = i2;
                    if (true != cavVarB.z(i18)) {
                        i19 = 524288;
                    } else {
                        i19 = 1048576;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr11115 = new java.lang.Object[1];
                            objArr11115[i15] = blzVar;
                            defpackage.dko dkoVar11115 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11115, dkoVar11115, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar11115 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j1111111110 = cbtVar.x;
                        long j1111111111 = j1111111110 ^ (j1111111110 >>> c);
                        defpackage.cmw cmwVarM11115 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi11115 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar11115, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi11115, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM11115, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111111), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar11118 = cavVarB;
                        cavVar11118.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar11118;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr11116 = new java.lang.Object[1];
                        objArr11116[i15] = blzVar;
                        defpackage.dko dkoVar11116 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11116, dkoVar11116, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar11116 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j1111111112 = cbtVar.x;
                    long j1111111113 = j1111111112 ^ (j1111111112 >>> c);
                    defpackage.cmw cmwVarM11116 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi11116 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar11116, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi11116, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM11116, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111113), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar11119 = cavVarB;
                    cavVar11119.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar11119;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 1572864;
            i18 = i2;
            i20 = i5 & 128;
            if (i20 != 0) {
                if ((12582912 & i4) == 0) {
                    if (true != cavVarB.z(i3)) {
                        i21 = 4194304;
                    } else {
                        i21 = 8388608;
                    }
                    i6 |= i21;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr11117 = new java.lang.Object[1];
                        objArr11117[i15] = blzVar;
                        defpackage.dko dkoVar11117 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11117, dkoVar11117, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar11117 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j1111111114 = cbtVar.x;
                    long j1111111115 = j1111111114 ^ (j1111111114 >>> c);
                    defpackage.cmw cmwVarM11117 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi11117 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar11117, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi11117, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM11117, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111115), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar111110 = cavVarB;
                    cavVar111110.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar111110;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 12582912;
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if ((134217728 & i4) == 0) {
                    zD = cavVarB.B(null);
                } else {
                    zD = cavVarB.D(null);
                }
                if (true != zD) {
                    i22 = 33554432;
                } else {
                    i22 = 67108864;
                }
                i6 |= i22;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zD2 = cavVarB.B(null);
                } else {
                    zD2 = cavVarB.D(null);
                }
                if (true != zD2) {
                    i23 = 268435456;
                } else {
                    i23 = 536870912;
                }
                i6 |= i23;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i15;
            }
            if (cavVarB.H(z3, i6 & 1)) {
                if (i28 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i7 != 0) {
                    dkzVar4 = defpackage.dkz.a;
                } else {
                    dkzVar4 = dkzVar2;
                }
                if (i9 != 0) {
                    aonjVar4 = null;
                } else {
                    aonjVar4 = aonjVar2;
                }
                if (i11 != 0) {
                    i25 = 1;
                } else {
                    i25 = i12;
                }
                z4 = (!z2) | z;
                if (i17 != 0) {
                    i24 = Integer.MAX_VALUE;
                } else {
                    i24 = i18;
                }
                if (i20 != 0) {
                    i26 = 1;
                } else {
                    i26 = i3;
                }
                at(i26, i24);
                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                if (blzVar != null) {
                    cavVarB.u(356427477);
                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                    java.lang.Object[] objArr11118 = new java.lang.Object[1];
                    objArr11118[i15] = blzVar;
                    defpackage.dko dkoVar11118 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                    zD3 = cavVarB.D(blzVar);
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR = cbtVar2.R();
                    if (zD3) {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    } else {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    }
                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11118, dkoVar11118, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                    objR2 = cbtVar2.R();
                    if (zA) {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    }
                    cbtVar2.W(false);
                    bjfVar = (bjf) objR2;
                } else {
                    cavVarB.u(357055103);
                    ((defpackage.cbt) cavVarB).W(i15);
                    bjfVar = null;
                }
                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                cavVar3 = cavVarB;
                if (bjfVar == null) {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                } else {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                }
                defpackage.bgo bgoVar11118 = defpackage.bgo.a;
                cbtVar = (defpackage.cbt) cavVar3;
                long j1111111116 = cbtVar.x;
                long j1111111117 = j1111111116 ^ (j1111111116 >>> c);
                defpackage.cmw cmwVarM11118 = defpackage.cfo.m(cavVar3, cmwVarH);
                defpackage.cje cjeVarAi11118 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVar3.v();
                if (cbtVar.w) {
                    cavVar3.j(aomyVar);
                } else {
                    cavVar3.x();
                }
                defpackage.cev.c(cavVar3, bgoVar11118, defpackage.dam.e);
                defpackage.cev.c(cavVar3, cjeVarAi11118, defpackage.dam.d);
                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVar3, cmwVarM11118, defpackage.dam.c);
                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111117), defpackage.dam.f);
                cbtVar.W(true);
                cmwVar3 = cmwVar4;
                dkzVar3 = dkzVar4;
                aonjVar3 = aonjVar4;
                cavVar2 = cavVar3;
            } else {
                str2 = str;
                defpackage.cav cavVar111111 = cavVarB;
                cavVar111111.s();
                cmwVar3 = cmwVar2;
                dkzVar3 = dkzVar2;
                i24 = i18;
                i25 = i12;
                aonjVar3 = aonjVar2;
                z4 = z;
                i26 = i3;
                cavVar2 = cavVar111111;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
            }
        }
        i6 |= 384;
        dkzVar2 = dkzVar;
        i9 = i5 & 8;
        if (i9 != 0) {
            if ((i4 & 3072) == 0) {
                aonjVar2 = aonjVar;
                if (true != cavVarB.D(aonjVar2)) {
                    i10 = 1024;
                } else {
                    i10 = 2048;
                }
                i6 |= i10;
            }
            i11 = i5 & 16;
            if (i11 != 0) {
                i6 |= 24576;
                i12 = i;
                c = ' ';
            } else {
                c = ' ';
                if ((i4 & 24576) == 0) {
                    i12 = i;
                    if (true != cavVarB.z(i12)) {
                        i13 = 8192;
                    } else {
                        i13 = 16384;
                    }
                    i6 |= i13;
                } else {
                    i12 = i;
                }
            }
            i14 = i5 & 32;
            if (i14 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i14 != 0) {
                if ((i4 & 196608) == 0) {
                    i15 = 0;
                    if (true != cavVarB.C(z)) {
                        i16 = 65536;
                    } else {
                        i16 = 131072;
                    }
                    i6 |= i16;
                }
                i17 = i5 & 64;
                if (i17 != 0) {
                    if ((1572864 & i4) == 0) {
                        i18 = i2;
                        if (true != cavVarB.z(i18)) {
                            i19 = 524288;
                        } else {
                            i19 = 1048576;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 128;
                    if (i20 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (true != cavVarB.z(i3)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if ((134217728 & i4) == 0) {
                                zD = cavVarB.B(null);
                            } else {
                                zD = cavVarB.D(null);
                            }
                            if (true != zD) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i6 |= i22;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zD2 = cavVarB.B(null);
                            } else {
                                zD2 = cavVarB.D(null);
                            }
                            if (true != zD2) {
                                i23 = 268435456;
                            } else {
                                i23 = 536870912;
                            }
                            i6 |= i23;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i15;
                        }
                        if (cavVarB.H(z3, i6 & 1)) {
                            if (i28 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i7 != 0) {
                                dkzVar4 = defpackage.dkz.a;
                            } else {
                                dkzVar4 = dkzVar2;
                            }
                            if (i9 != 0) {
                                aonjVar4 = null;
                            } else {
                                aonjVar4 = aonjVar2;
                            }
                            if (i11 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i12;
                            }
                            z4 = (!z2) | z;
                            if (i17 != 0) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = i18;
                            }
                            if (i20 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i3;
                            }
                            at(i26, i24);
                            blzVar = (blz) cavVarB.e(defpackage.bma.a);
                            if (blzVar != null) {
                                cavVarB.u(356427477);
                                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                                java.lang.Object[] objArr11119 = new java.lang.Object[1];
                                objArr11119[i15] = blzVar;
                                defpackage.dko dkoVar11119 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                                zD3 = cavVarB.D(blzVar);
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR = cbtVar2.R();
                                if (zD3) {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                } else {
                                    objR = new apv(blzVar, 12);
                                    cbtVar2.ab(objR);
                                }
                                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr11119, dkoVar11119, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                                objR2 = cbtVar2.R();
                                if (zA) {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                } else {
                                    objR2 = new bjf(jLongValue, blzVar, j);
                                    cbtVar2.ab(objR2);
                                }
                                cbtVar2.W(false);
                                bjfVar = (bjf) objR2;
                            } else {
                                cavVarB.u(357055103);
                                ((defpackage.cbt) cavVarB).W(i15);
                                bjfVar = null;
                            }
                            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                            cavVar3 = cavVarB;
                            if (bjfVar == null) {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            } else {
                                str2 = str;
                                cmwVar4 = cmwVar4;
                                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                            }
                            defpackage.bgo bgoVar11119 = defpackage.bgo.a;
                            cbtVar = (defpackage.cbt) cavVar3;
                            long j1111111118 = cbtVar.x;
                            long j1111111119 = j1111111118 ^ (j1111111118 >>> c);
                            defpackage.cmw cmwVarM11119 = defpackage.cfo.m(cavVar3, cmwVarH);
                            defpackage.cje cjeVarAi11119 = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVar3.v();
                            if (cbtVar.w) {
                                cavVar3.j(aomyVar);
                            } else {
                                cavVar3.x();
                            }
                            defpackage.cev.c(cavVar3, bgoVar11119, defpackage.dam.e);
                            defpackage.cev.c(cavVar3, cjeVarAi11119, defpackage.dam.d);
                            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVar3, cmwVarM11119, defpackage.dam.c);
                            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111119), defpackage.dam.f);
                            cbtVar.W(true);
                            cmwVar3 = cmwVar4;
                            dkzVar3 = dkzVar4;
                            aonjVar3 = aonjVar4;
                            cavVar2 = cavVar3;
                        } else {
                            str2 = str;
                            defpackage.cav cavVar111112 = cavVarB;
                            cavVar111112.s();
                            cmwVar3 = cmwVar2;
                            dkzVar3 = dkzVar2;
                            i24 = i18;
                            i25 = i12;
                            aonjVar3 = aonjVar2;
                            z4 = z;
                            i26 = i3;
                            cavVar2 = cavVar111112;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr111110 = new java.lang.Object[1];
                            objArr111110[i15] = blzVar;
                            defpackage.dko dkoVar111110 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111110, dkoVar111110, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar111110 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j11111111110 = cbtVar.x;
                        long j11111111111 = j11111111110 ^ (j11111111110 >>> c);
                        defpackage.cmw cmwVarM111110 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi111110 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar111110, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi111110, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM111110, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111111111), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar111113 = cavVarB;
                        cavVar111113.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar111113;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 1572864;
                i18 = i2;
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr111111 = new java.lang.Object[1];
                            objArr111111[i15] = blzVar;
                            defpackage.dko dkoVar111111 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111111, dkoVar111111, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar111111 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j11111111112 = cbtVar.x;
                        long j11111111113 = j11111111112 ^ (j11111111112 >>> c);
                        defpackage.cmw cmwVarM111111 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi111111 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar111111, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi111111, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM111111, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111111113), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar111114 = cavVarB;
                        cavVar111114.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar111114;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr111112 = new java.lang.Object[1];
                        objArr111112[i15] = blzVar;
                        defpackage.dko dkoVar111112 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111112, dkoVar111112, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar111112 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j11111111114 = cbtVar.x;
                    long j11111111115 = j11111111114 ^ (j11111111114 >>> c);
                    defpackage.cmw cmwVarM111112 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi111112 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar111112, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi111112, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM111112, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111111115), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar111115 = cavVarB;
                    cavVar111115.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar111115;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 196608;
            i15 = 0;
            i17 = i5 & 64;
            if (i17 != 0) {
                if ((1572864 & i4) == 0) {
                    i18 = i2;
                    if (true != cavVarB.z(i18)) {
                        i19 = 524288;
                    } else {
                        i19 = 1048576;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr111113 = new java.lang.Object[1];
                            objArr111113[i15] = blzVar;
                            defpackage.dko dkoVar111113 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111113, dkoVar111113, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar111113 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j11111111116 = cbtVar.x;
                        long j11111111117 = j11111111116 ^ (j11111111116 >>> c);
                        defpackage.cmw cmwVarM111113 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi111113 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar111113, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi111113, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM111113, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111111117), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar111116 = cavVarB;
                        cavVar111116.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar111116;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr111114 = new java.lang.Object[1];
                        objArr111114[i15] = blzVar;
                        defpackage.dko dkoVar111114 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111114, dkoVar111114, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar111114 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j11111111118 = cbtVar.x;
                    long j11111111119 = j11111111118 ^ (j11111111118 >>> c);
                    defpackage.cmw cmwVarM111114 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi111114 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar111114, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi111114, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM111114, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j11111111119), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar111117 = cavVarB;
                    cavVar111117.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar111117;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 1572864;
            i18 = i2;
            i20 = i5 & 128;
            if (i20 != 0) {
                if ((12582912 & i4) == 0) {
                    if (true != cavVarB.z(i3)) {
                        i21 = 4194304;
                    } else {
                        i21 = 8388608;
                    }
                    i6 |= i21;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr111115 = new java.lang.Object[1];
                        objArr111115[i15] = blzVar;
                        defpackage.dko dkoVar111115 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111115, dkoVar111115, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar111115 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j111111111110 = cbtVar.x;
                    long j111111111111 = j111111111110 ^ (j111111111110 >>> c);
                    defpackage.cmw cmwVarM111115 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi111115 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar111115, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi111115, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM111115, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111111111), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar111118 = cavVarB;
                    cavVar111118.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar111118;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 12582912;
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if ((134217728 & i4) == 0) {
                    zD = cavVarB.B(null);
                } else {
                    zD = cavVarB.D(null);
                }
                if (true != zD) {
                    i22 = 33554432;
                } else {
                    i22 = 67108864;
                }
                i6 |= i22;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zD2 = cavVarB.B(null);
                } else {
                    zD2 = cavVarB.D(null);
                }
                if (true != zD2) {
                    i23 = 268435456;
                } else {
                    i23 = 536870912;
                }
                i6 |= i23;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i15;
            }
            if (cavVarB.H(z3, i6 & 1)) {
                if (i28 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i7 != 0) {
                    dkzVar4 = defpackage.dkz.a;
                } else {
                    dkzVar4 = dkzVar2;
                }
                if (i9 != 0) {
                    aonjVar4 = null;
                } else {
                    aonjVar4 = aonjVar2;
                }
                if (i11 != 0) {
                    i25 = 1;
                } else {
                    i25 = i12;
                }
                z4 = (!z2) | z;
                if (i17 != 0) {
                    i24 = Integer.MAX_VALUE;
                } else {
                    i24 = i18;
                }
                if (i20 != 0) {
                    i26 = 1;
                } else {
                    i26 = i3;
                }
                at(i26, i24);
                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                if (blzVar != null) {
                    cavVarB.u(356427477);
                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                    java.lang.Object[] objArr111116 = new java.lang.Object[1];
                    objArr111116[i15] = blzVar;
                    defpackage.dko dkoVar111116 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                    zD3 = cavVarB.D(blzVar);
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR = cbtVar2.R();
                    if (zD3) {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    } else {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    }
                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111116, dkoVar111116, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                    objR2 = cbtVar2.R();
                    if (zA) {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    }
                    cbtVar2.W(false);
                    bjfVar = (bjf) objR2;
                } else {
                    cavVarB.u(357055103);
                    ((defpackage.cbt) cavVarB).W(i15);
                    bjfVar = null;
                }
                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                cavVar3 = cavVarB;
                if (bjfVar == null) {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                } else {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                }
                defpackage.bgo bgoVar111116 = defpackage.bgo.a;
                cbtVar = (defpackage.cbt) cavVar3;
                long j111111111112 = cbtVar.x;
                long j111111111113 = j111111111112 ^ (j111111111112 >>> c);
                defpackage.cmw cmwVarM111116 = defpackage.cfo.m(cavVar3, cmwVarH);
                defpackage.cje cjeVarAi111116 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVar3.v();
                if (cbtVar.w) {
                    cavVar3.j(aomyVar);
                } else {
                    cavVar3.x();
                }
                defpackage.cev.c(cavVar3, bgoVar111116, defpackage.dam.e);
                defpackage.cev.c(cavVar3, cjeVarAi111116, defpackage.dam.d);
                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVar3, cmwVarM111116, defpackage.dam.c);
                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111111113), defpackage.dam.f);
                cbtVar.W(true);
                cmwVar3 = cmwVar4;
                dkzVar3 = dkzVar4;
                aonjVar3 = aonjVar4;
                cavVar2 = cavVar3;
            } else {
                str2 = str;
                defpackage.cav cavVar111119 = cavVarB;
                cavVar111119.s();
                cmwVar3 = cmwVar2;
                dkzVar3 = dkzVar2;
                i24 = i18;
                i25 = i12;
                aonjVar3 = aonjVar2;
                z4 = z;
                i26 = i3;
                cavVar2 = cavVar111119;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
            }
        }
        i6 |= 3072;
        aonjVar2 = aonjVar;
        i11 = i5 & 16;
        if (i11 != 0) {
            i6 |= 24576;
            i12 = i;
            c = ' ';
        } else {
            c = ' ';
            if ((i4 & 24576) == 0) {
                i12 = i;
                if (true != cavVarB.z(i12)) {
                    i13 = 8192;
                } else {
                    i13 = 16384;
                }
                i6 |= i13;
            } else {
                i12 = i;
            }
        }
        i14 = i5 & 32;
        if (i14 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i14 != 0) {
            if ((i4 & 196608) == 0) {
                i15 = 0;
                if (true != cavVarB.C(z)) {
                    i16 = 65536;
                } else {
                    i16 = 131072;
                }
                i6 |= i16;
            }
            i17 = i5 & 64;
            if (i17 != 0) {
                if ((1572864 & i4) == 0) {
                    i18 = i2;
                    if (true != cavVarB.z(i18)) {
                        i19 = 524288;
                    } else {
                        i19 = 1048576;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 128;
                if (i20 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (true != cavVarB.z(i3)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if ((134217728 & i4) == 0) {
                            zD = cavVarB.B(null);
                        } else {
                            zD = cavVarB.D(null);
                        }
                        if (true != zD) {
                            i22 = 33554432;
                        } else {
                            i22 = 67108864;
                        }
                        i6 |= i22;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zD2 = cavVarB.B(null);
                        } else {
                            zD2 = cavVarB.D(null);
                        }
                        if (true != zD2) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i6 |= i23;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i15;
                    }
                    if (cavVarB.H(z3, i6 & 1)) {
                        if (i28 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i7 != 0) {
                            dkzVar4 = defpackage.dkz.a;
                        } else {
                            dkzVar4 = dkzVar2;
                        }
                        if (i9 != 0) {
                            aonjVar4 = null;
                        } else {
                            aonjVar4 = aonjVar2;
                        }
                        if (i11 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i12;
                        }
                        z4 = (!z2) | z;
                        if (i17 != 0) {
                            i24 = Integer.MAX_VALUE;
                        } else {
                            i24 = i18;
                        }
                        if (i20 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i3;
                        }
                        at(i26, i24);
                        blzVar = (blz) cavVarB.e(defpackage.bma.a);
                        if (blzVar != null) {
                            cavVarB.u(356427477);
                            j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                            java.lang.Object[] objArr111117 = new java.lang.Object[1];
                            objArr111117[i15] = blzVar;
                            defpackage.dko dkoVar111117 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                            zD3 = cavVarB.D(blzVar);
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR = cbtVar2.R();
                            if (zD3) {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new apv(blzVar, 12);
                                cbtVar2.ab(objR);
                            }
                            jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111117, dkoVar111117, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                            zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                            objR2 = cbtVar2.R();
                            if (zA) {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new bjf(jLongValue, blzVar, j);
                                cbtVar2.ab(objR2);
                            }
                            cbtVar2.W(false);
                            bjfVar = (bjf) objR2;
                        } else {
                            cavVarB.u(357055103);
                            ((defpackage.cbt) cavVarB).W(i15);
                            bjfVar = null;
                        }
                        gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                        dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                        defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                        cavVar3 = cavVarB;
                        if (bjfVar == null) {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        } else {
                            str2 = str;
                            cmwVar4 = cmwVar4;
                            cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                        }
                        defpackage.bgo bgoVar111117 = defpackage.bgo.a;
                        cbtVar = (defpackage.cbt) cavVar3;
                        long j111111111114 = cbtVar.x;
                        long j111111111115 = j111111111114 ^ (j111111111114 >>> c);
                        defpackage.cmw cmwVarM111117 = defpackage.cfo.m(cavVar3, cmwVarH);
                        defpackage.cje cjeVarAi111117 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVar3.v();
                        if (cbtVar.w) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.cev.c(cavVar3, bgoVar111117, defpackage.dam.e);
                        defpackage.cev.c(cavVar3, cjeVarAi111117, defpackage.dam.d);
                        cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVar3, cmwVarM111117, defpackage.dam.c);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111111115), defpackage.dam.f);
                        cbtVar.W(true);
                        cmwVar3 = cmwVar4;
                        dkzVar3 = dkzVar4;
                        aonjVar3 = aonjVar4;
                        cavVar2 = cavVar3;
                    } else {
                        str2 = str;
                        defpackage.cav cavVar1111110 = cavVarB;
                        cavVar1111110.s();
                        cmwVar3 = cmwVar2;
                        dkzVar3 = dkzVar2;
                        i24 = i18;
                        i25 = i12;
                        aonjVar3 = aonjVar2;
                        z4 = z;
                        i26 = i3;
                        cavVar2 = cavVar1111110;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                    }
                }
                i6 |= 12582912;
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr111118 = new java.lang.Object[1];
                        objArr111118[i15] = blzVar;
                        defpackage.dko dkoVar111118 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111118, dkoVar111118, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar111118 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j111111111116 = cbtVar.x;
                    long j111111111117 = j111111111116 ^ (j111111111116 >>> c);
                    defpackage.cmw cmwVarM111118 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi111118 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar111118, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi111118, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM111118, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111111117), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar1111111 = cavVarB;
                    cavVar1111111.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar1111111;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 1572864;
            i18 = i2;
            i20 = i5 & 128;
            if (i20 != 0) {
                if ((12582912 & i4) == 0) {
                    if (true != cavVarB.z(i3)) {
                        i21 = 4194304;
                    } else {
                        i21 = 8388608;
                    }
                    i6 |= i21;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr111119 = new java.lang.Object[1];
                        objArr111119[i15] = blzVar;
                        defpackage.dko dkoVar111119 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr111119, dkoVar111119, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar111119 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j111111111118 = cbtVar.x;
                    long j111111111119 = j111111111118 ^ (j111111111118 >>> c);
                    defpackage.cmw cmwVarM111119 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi111119 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar111119, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi111119, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM111119, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j111111111119), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar1111112 = cavVarB;
                    cavVar1111112.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar1111112;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 12582912;
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if ((134217728 & i4) == 0) {
                    zD = cavVarB.B(null);
                } else {
                    zD = cavVarB.D(null);
                }
                if (true != zD) {
                    i22 = 33554432;
                } else {
                    i22 = 67108864;
                }
                i6 |= i22;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zD2 = cavVarB.B(null);
                } else {
                    zD2 = cavVarB.D(null);
                }
                if (true != zD2) {
                    i23 = 268435456;
                } else {
                    i23 = 536870912;
                }
                i6 |= i23;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i15;
            }
            if (cavVarB.H(z3, i6 & 1)) {
                if (i28 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i7 != 0) {
                    dkzVar4 = defpackage.dkz.a;
                } else {
                    dkzVar4 = dkzVar2;
                }
                if (i9 != 0) {
                    aonjVar4 = null;
                } else {
                    aonjVar4 = aonjVar2;
                }
                if (i11 != 0) {
                    i25 = 1;
                } else {
                    i25 = i12;
                }
                z4 = (!z2) | z;
                if (i17 != 0) {
                    i24 = Integer.MAX_VALUE;
                } else {
                    i24 = i18;
                }
                if (i20 != 0) {
                    i26 = 1;
                } else {
                    i26 = i3;
                }
                at(i26, i24);
                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                if (blzVar != null) {
                    cavVarB.u(356427477);
                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                    java.lang.Object[] objArr1111110 = new java.lang.Object[1];
                    objArr1111110[i15] = blzVar;
                    defpackage.dko dkoVar1111110 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                    zD3 = cavVarB.D(blzVar);
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR = cbtVar2.R();
                    if (zD3) {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    } else {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    }
                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1111110, dkoVar1111110, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                    objR2 = cbtVar2.R();
                    if (zA) {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    }
                    cbtVar2.W(false);
                    bjfVar = (bjf) objR2;
                } else {
                    cavVarB.u(357055103);
                    ((defpackage.cbt) cavVarB).W(i15);
                    bjfVar = null;
                }
                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                cavVar3 = cavVarB;
                if (bjfVar == null) {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                } else {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                }
                defpackage.bgo bgoVar1111110 = defpackage.bgo.a;
                cbtVar = (defpackage.cbt) cavVar3;
                long j1111111111110 = cbtVar.x;
                long j1111111111111 = j1111111111110 ^ (j1111111111110 >>> c);
                defpackage.cmw cmwVarM1111110 = defpackage.cfo.m(cavVar3, cmwVarH);
                defpackage.cje cjeVarAi1111110 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVar3.v();
                if (cbtVar.w) {
                    cavVar3.j(aomyVar);
                } else {
                    cavVar3.x();
                }
                defpackage.cev.c(cavVar3, bgoVar1111110, defpackage.dam.e);
                defpackage.cev.c(cavVar3, cjeVarAi1111110, defpackage.dam.d);
                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVar3, cmwVarM1111110, defpackage.dam.c);
                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111111111), defpackage.dam.f);
                cbtVar.W(true);
                cmwVar3 = cmwVar4;
                dkzVar3 = dkzVar4;
                aonjVar3 = aonjVar4;
                cavVar2 = cavVar3;
            } else {
                str2 = str;
                defpackage.cav cavVar1111113 = cavVarB;
                cavVar1111113.s();
                cmwVar3 = cmwVar2;
                dkzVar3 = dkzVar2;
                i24 = i18;
                i25 = i12;
                aonjVar3 = aonjVar2;
                z4 = z;
                i26 = i3;
                cavVar2 = cavVar1111113;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
            }
        }
        i6 |= 196608;
        i15 = 0;
        i17 = i5 & 64;
        if (i17 != 0) {
            if ((1572864 & i4) == 0) {
                i18 = i2;
                if (true != cavVarB.z(i18)) {
                    i19 = 524288;
                } else {
                    i19 = 1048576;
                }
                i6 |= i19;
            }
            i20 = i5 & 128;
            if (i20 != 0) {
                if ((12582912 & i4) == 0) {
                    if (true != cavVarB.z(i3)) {
                        i21 = 4194304;
                    } else {
                        i21 = 8388608;
                    }
                    i6 |= i21;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if ((134217728 & i4) == 0) {
                        zD = cavVarB.B(null);
                    } else {
                        zD = cavVarB.D(null);
                    }
                    if (true != zD) {
                        i22 = 33554432;
                    } else {
                        i22 = 67108864;
                    }
                    i6 |= i22;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zD2 = cavVarB.B(null);
                    } else {
                        zD2 = cavVarB.D(null);
                    }
                    if (true != zD2) {
                        i23 = 268435456;
                    } else {
                        i23 = 536870912;
                    }
                    i6 |= i23;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i15;
                }
                if (cavVarB.H(z3, i6 & 1)) {
                    if (i28 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i7 != 0) {
                        dkzVar4 = defpackage.dkz.a;
                    } else {
                        dkzVar4 = dkzVar2;
                    }
                    if (i9 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i11 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i12;
                    }
                    z4 = (!z2) | z;
                    if (i17 != 0) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        i24 = i18;
                    }
                    if (i20 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i3;
                    }
                    at(i26, i24);
                    blzVar = (blz) cavVarB.e(defpackage.bma.a);
                    if (blzVar != null) {
                        cavVarB.u(356427477);
                        j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                        java.lang.Object[] objArr1111111 = new java.lang.Object[1];
                        objArr1111111[i15] = blzVar;
                        defpackage.dko dkoVar1111111 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                        zD3 = cavVarB.D(blzVar);
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR = cbtVar2.R();
                        if (zD3) {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        } else {
                            objR = new apv(blzVar, 12);
                            cbtVar2.ab(objR);
                        }
                        jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1111111, dkoVar1111111, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                        zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                        objR2 = cbtVar2.R();
                        if (zA) {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new bjf(jLongValue, blzVar, j);
                            cbtVar2.ab(objR2);
                        }
                        cbtVar2.W(false);
                        bjfVar = (bjf) objR2;
                    } else {
                        cavVarB.u(357055103);
                        ((defpackage.cbt) cavVarB).W(i15);
                        bjfVar = null;
                    }
                    gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                    dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                    defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                    cavVar3 = cavVarB;
                    if (bjfVar == null) {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    } else {
                        str2 = str;
                        cmwVar4 = cmwVar4;
                        cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                    }
                    defpackage.bgo bgoVar1111111 = defpackage.bgo.a;
                    cbtVar = (defpackage.cbt) cavVar3;
                    long j1111111111112 = cbtVar.x;
                    long j1111111111113 = j1111111111112 ^ (j1111111111112 >>> c);
                    defpackage.cmw cmwVarM1111111 = defpackage.cfo.m(cavVar3, cmwVarH);
                    defpackage.cje cjeVarAi1111111 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVar3.v();
                    if (cbtVar.w) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    defpackage.cev.c(cavVar3, bgoVar1111111, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarAi1111111, defpackage.dam.d);
                    cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar3, cmwVarM1111111, defpackage.dam.c);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111111113), defpackage.dam.f);
                    cbtVar.W(true);
                    cmwVar3 = cmwVar4;
                    dkzVar3 = dkzVar4;
                    aonjVar3 = aonjVar4;
                    cavVar2 = cavVar3;
                } else {
                    str2 = str;
                    defpackage.cav cavVar1111114 = cavVarB;
                    cavVar1111114.s();
                    cmwVar3 = cmwVar2;
                    dkzVar3 = dkzVar2;
                    i24 = i18;
                    i25 = i12;
                    aonjVar3 = aonjVar2;
                    z4 = z;
                    i26 = i3;
                    cavVar2 = cavVar1111114;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
                }
            }
            i6 |= 12582912;
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if ((134217728 & i4) == 0) {
                    zD = cavVarB.B(null);
                } else {
                    zD = cavVarB.D(null);
                }
                if (true != zD) {
                    i22 = 33554432;
                } else {
                    i22 = 67108864;
                }
                i6 |= i22;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zD2 = cavVarB.B(null);
                } else {
                    zD2 = cavVarB.D(null);
                }
                if (true != zD2) {
                    i23 = 268435456;
                } else {
                    i23 = 536870912;
                }
                i6 |= i23;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i15;
            }
            if (cavVarB.H(z3, i6 & 1)) {
                if (i28 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i7 != 0) {
                    dkzVar4 = defpackage.dkz.a;
                } else {
                    dkzVar4 = dkzVar2;
                }
                if (i9 != 0) {
                    aonjVar4 = null;
                } else {
                    aonjVar4 = aonjVar2;
                }
                if (i11 != 0) {
                    i25 = 1;
                } else {
                    i25 = i12;
                }
                z4 = (!z2) | z;
                if (i17 != 0) {
                    i24 = Integer.MAX_VALUE;
                } else {
                    i24 = i18;
                }
                if (i20 != 0) {
                    i26 = 1;
                } else {
                    i26 = i3;
                }
                at(i26, i24);
                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                if (blzVar != null) {
                    cavVarB.u(356427477);
                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                    java.lang.Object[] objArr1111112 = new java.lang.Object[1];
                    objArr1111112[i15] = blzVar;
                    defpackage.dko dkoVar1111112 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                    zD3 = cavVarB.D(blzVar);
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR = cbtVar2.R();
                    if (zD3) {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    } else {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    }
                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1111112, dkoVar1111112, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                    objR2 = cbtVar2.R();
                    if (zA) {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    }
                    cbtVar2.W(false);
                    bjfVar = (bjf) objR2;
                } else {
                    cavVarB.u(357055103);
                    ((defpackage.cbt) cavVarB).W(i15);
                    bjfVar = null;
                }
                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                cavVar3 = cavVarB;
                if (bjfVar == null) {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                } else {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                }
                defpackage.bgo bgoVar1111112 = defpackage.bgo.a;
                cbtVar = (defpackage.cbt) cavVar3;
                long j1111111111114 = cbtVar.x;
                long j1111111111115 = j1111111111114 ^ (j1111111111114 >>> c);
                defpackage.cmw cmwVarM1111112 = defpackage.cfo.m(cavVar3, cmwVarH);
                defpackage.cje cjeVarAi1111112 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVar3.v();
                if (cbtVar.w) {
                    cavVar3.j(aomyVar);
                } else {
                    cavVar3.x();
                }
                defpackage.cev.c(cavVar3, bgoVar1111112, defpackage.dam.e);
                defpackage.cev.c(cavVar3, cjeVarAi1111112, defpackage.dam.d);
                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVar3, cmwVarM1111112, defpackage.dam.c);
                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111111115), defpackage.dam.f);
                cbtVar.W(true);
                cmwVar3 = cmwVar4;
                dkzVar3 = dkzVar4;
                aonjVar3 = aonjVar4;
                cavVar2 = cavVar3;
            } else {
                str2 = str;
                defpackage.cav cavVar1111115 = cavVarB;
                cavVar1111115.s();
                cmwVar3 = cmwVar2;
                dkzVar3 = dkzVar2;
                i24 = i18;
                i25 = i12;
                aonjVar3 = aonjVar2;
                z4 = z;
                i26 = i3;
                cavVar2 = cavVar1111115;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
            }
        }
        i6 |= 1572864;
        i18 = i2;
        i20 = i5 & 128;
        if (i20 != 0) {
            if ((12582912 & i4) == 0) {
                if (true != cavVarB.z(i3)) {
                    i21 = 4194304;
                } else {
                    i21 = 8388608;
                }
                i6 |= i21;
            }
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if ((134217728 & i4) == 0) {
                    zD = cavVarB.B(null);
                } else {
                    zD = cavVarB.D(null);
                }
                if (true != zD) {
                    i22 = 33554432;
                } else {
                    i22 = 67108864;
                }
                i6 |= i22;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zD2 = cavVarB.B(null);
                } else {
                    zD2 = cavVarB.D(null);
                }
                if (true != zD2) {
                    i23 = 268435456;
                } else {
                    i23 = 536870912;
                }
                i6 |= i23;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i15;
            }
            if (cavVarB.H(z3, i6 & 1)) {
                if (i28 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i7 != 0) {
                    dkzVar4 = defpackage.dkz.a;
                } else {
                    dkzVar4 = dkzVar2;
                }
                if (i9 != 0) {
                    aonjVar4 = null;
                } else {
                    aonjVar4 = aonjVar2;
                }
                if (i11 != 0) {
                    i25 = 1;
                } else {
                    i25 = i12;
                }
                z4 = (!z2) | z;
                if (i17 != 0) {
                    i24 = Integer.MAX_VALUE;
                } else {
                    i24 = i18;
                }
                if (i20 != 0) {
                    i26 = 1;
                } else {
                    i26 = i3;
                }
                at(i26, i24);
                blzVar = (blz) cavVarB.e(defpackage.bma.a);
                if (blzVar != null) {
                    cavVarB.u(356427477);
                    j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                    java.lang.Object[] objArr1111113 = new java.lang.Object[1];
                    objArr1111113[i15] = blzVar;
                    defpackage.dko dkoVar1111113 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                    zD3 = cavVarB.D(blzVar);
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR = cbtVar2.R();
                    if (zD3) {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    } else {
                        objR = new apv(blzVar, 12);
                        cbtVar2.ab(objR);
                    }
                    jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1111113, dkoVar1111113, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                    zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                    objR2 = cbtVar2.R();
                    if (zA) {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new bjf(jLongValue, blzVar, j);
                        cbtVar2.ab(objR2);
                    }
                    cbtVar2.W(false);
                    bjfVar = (bjf) objR2;
                } else {
                    cavVarB.u(357055103);
                    ((defpackage.cbt) cavVarB).W(i15);
                    bjfVar = null;
                }
                gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
                dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
                defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
                cavVar3 = cavVarB;
                if (bjfVar == null) {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                } else {
                    str2 = str;
                    cmwVar4 = cmwVar4;
                    cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
                }
                defpackage.bgo bgoVar1111113 = defpackage.bgo.a;
                cbtVar = (defpackage.cbt) cavVar3;
                long j1111111111116 = cbtVar.x;
                long j1111111111117 = j1111111111116 ^ (j1111111111116 >>> c);
                defpackage.cmw cmwVarM1111113 = defpackage.cfo.m(cavVar3, cmwVarH);
                defpackage.cje cjeVarAi1111113 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVar3.v();
                if (cbtVar.w) {
                    cavVar3.j(aomyVar);
                } else {
                    cavVar3.x();
                }
                defpackage.cev.c(cavVar3, bgoVar1111113, defpackage.dam.e);
                defpackage.cev.c(cavVar3, cjeVarAi1111113, defpackage.dam.d);
                cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVar3, cmwVarM1111113, defpackage.dam.c);
                defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111111117), defpackage.dam.f);
                cbtVar.W(true);
                cmwVar3 = cmwVar4;
                dkzVar3 = dkzVar4;
                aonjVar3 = aonjVar4;
                cavVar2 = cavVar3;
            } else {
                str2 = str;
                defpackage.cav cavVar1111116 = cavVarB;
                cavVar1111116.s();
                cmwVar3 = cmwVar2;
                dkzVar3 = dkzVar2;
                i24 = i18;
                i25 = i12;
                aonjVar3 = aonjVar2;
                z4 = z;
                i26 = i3;
                cavVar2 = cavVar1111116;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
            }
        }
        i6 |= 12582912;
        if ((i5 & 256) != 0) {
            i6 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            if ((134217728 & i4) == 0) {
                zD = cavVarB.B(null);
            } else {
                zD = cavVarB.D(null);
            }
            if (true != zD) {
                i22 = 33554432;
            } else {
                i22 = 67108864;
            }
            i6 |= i22;
        }
        if ((i5 & 512) != 0) {
            i6 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            if ((1073741824 & i4) == 0) {
                zD2 = cavVarB.B(null);
            } else {
                zD2 = cavVarB.D(null);
            }
            if (true != zD2) {
                i23 = 268435456;
            } else {
                i23 = 536870912;
            }
            i6 |= i23;
        }
        if ((306783379 & i6) != 306783378) {
            z3 = 1;
        } else {
            z3 = i15;
        }
        if (cavVarB.H(z3, i6 & 1)) {
            if (i28 != 0) {
                cmwVar4 = defpackage.cmw.c;
            } else {
                cmwVar4 = cmwVar2;
            }
            if (i7 != 0) {
                dkzVar4 = defpackage.dkz.a;
            } else {
                dkzVar4 = dkzVar2;
            }
            if (i9 != 0) {
                aonjVar4 = null;
            } else {
                aonjVar4 = aonjVar2;
            }
            if (i11 != 0) {
                i25 = 1;
            } else {
                i25 = i12;
            }
            z4 = (!z2) | z;
            if (i17 != 0) {
                i24 = Integer.MAX_VALUE;
            } else {
                i24 = i18;
            }
            if (i20 != 0) {
                i26 = 1;
            } else {
                i26 = i3;
            }
            at(i26, i24);
            blzVar = (blz) cavVarB.e(defpackage.bma.a);
            if (blzVar != null) {
                cavVarB.u(356427477);
                j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                java.lang.Object[] objArr1111114 = new java.lang.Object[1];
                objArr1111114[i15] = blzVar;
                defpackage.dko dkoVar1111114 = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                zD3 = cavVarB.D(blzVar);
                cbtVar2 = (defpackage.cbt) cavVarB;
                objR = cbtVar2.R();
                if (zD3) {
                    objR = new apv(blzVar, 12);
                    cbtVar2.ab(objR);
                } else {
                    objR = new apv(blzVar, 12);
                    cbtVar2.ab(objR);
                }
                jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr1111114, dkoVar1111114, (defpackage.aomy) objR, cavVarB, i15)).longValue();
                zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                objR2 = cbtVar2.R();
                if (zA) {
                    objR2 = new bjf(jLongValue, blzVar, j);
                    cbtVar2.ab(objR2);
                } else {
                    objR2 = new bjf(jLongValue, blzVar, j);
                    cbtVar2.ab(objR2);
                }
                cbtVar2.W(false);
                bjfVar = (bjf) objR2;
            } else {
                cavVarB.u(357055103);
                ((defpackage.cbt) cavVarB).W(i15);
                bjfVar = null;
            }
            gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
            dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
            defpackage.bgn.d(str, dkzVar4, gatVar, dnxVar, z4, cavVarB);
            cavVar3 = cavVarB;
            if (bjfVar == null) {
                str2 = str;
                cmwVar4 = cmwVar4;
                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
            } else {
                str2 = str;
                cmwVar4 = cmwVar4;
                cmwVarH = h(cmwVar4, new defpackage.dji(str2), dkzVar4, aonjVar4, i25, z4, i24, i26, gatVar, dnxVar, null, null, bjfVar, null);
            }
            defpackage.bgo bgoVar1111114 = defpackage.bgo.a;
            cbtVar = (defpackage.cbt) cavVar3;
            long j1111111111118 = cbtVar.x;
            long j1111111111119 = j1111111111118 ^ (j1111111111118 >>> c);
            defpackage.cmw cmwVarM1111114 = defpackage.cfo.m(cavVar3, cmwVarH);
            defpackage.cje cjeVarAi1111114 = cbtVar.ai();
            aomyVar = defpackage.dam.a;
            cavVar3.v();
            if (cbtVar.w) {
                cavVar3.j(aomyVar);
            } else {
                cavVar3.x();
            }
            defpackage.cev.c(cavVar3, bgoVar1111114, defpackage.dam.e);
            defpackage.cev.c(cavVar3, cjeVarAi1111114, defpackage.dam.d);
            cavVar3.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVar3, cmwVarM1111114, defpackage.dam.c);
            defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j1111111111119), defpackage.dam.f);
            cbtVar.W(true);
            cmwVar3 = cmwVar4;
            dkzVar3 = dkzVar4;
            aonjVar3 = aonjVar4;
            cavVar2 = cavVar3;
        } else {
            str2 = str;
            defpackage.cav cavVar1111117 = cavVarB;
            cavVar1111117.s();
            cmwVar3 = cmwVar2;
            dkzVar3 = dkzVar2;
            i24 = i18;
            i25 = i12;
            aonjVar3 = aonjVar2;
            z4 = z;
            i26 = i3;
            cavVar2 = cavVar1111117;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bgj(str2, cmwVar3, dkzVar3, aonjVar3, i25, z4, i24, i26, i4, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void aw(defpackage.dji djiVar, defpackage.cmw cmwVar, defpackage.dkz dkzVar, defpackage.aonj aonjVar, int i, boolean z, int i2, int i3, java.util.Map map, defpackage.cav cavVar, int i4, int i5) {
        int i6;
        int i7;
        defpackage.cav cavVar2;
        int i8;
        bjf bjfVar;
        int i9;
        int i10 = i4 & 6;
        defpackage.cav cavVarB = cavVar.b(-1343466571);
        if (i10 == 0) {
            i6 = (true != cavVarB.B(djiVar) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != cavVarB.B(dkzVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != cavVarB.D(aonjVar) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i6 |= true != cavVarB.z(i) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i6 |= true != cavVarB.C(z) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            i6 |= true != cavVarB.z(i2) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            i6 |= true != cavVarB.z(i3) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i6 |= true != ((134217728 & i4) == 0 ? cavVarB.B(map) : cavVarB.D(map)) ? 33554432 : 67108864;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (true != ((i5 & 8) == 0 ? cavVarB.B(null) : cavVarB.D(null)) ? 2 : 4);
        } else {
            i7 = i5;
        }
        int i11 = i6 | 805306368;
        if (cavVarB.H(((i11 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true, i11 & 1)) {
            int i12 = i11 >> 3;
            int i13 = i11 & 14;
            at(i3, i2);
            blz blzVar = (blz) cavVarB.e(defpackage.bma.a);
            if (blzVar != null) {
                cavVarB.u(1588272647);
                long j = ((defpackage.bme) cavVarB.e(defpackage.bmf.a)).b;
                java.lang.Object[] objArr = {blzVar};
                defpackage.dko dkoVar = new defpackage.dko(new defpackage.axo(blzVar, 4), new bcm(3), 1);
                boolean zD = cavVarB.D(blzVar);
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (zD || objR == defpackage.cau.a) {
                    objR = new apv(blzVar, 13);
                    cbtVar.ab(objR);
                }
                long jLongValue = ((java.lang.Number) defpackage.cfd.n(objArr, dkoVar, (defpackage.aomy) objR, cavVarB, 0)).longValue();
                boolean zA = cavVarB.A(jLongValue) | cavVarB.B(blzVar) | cavVarB.A(j);
                java.lang.Object objR2 = cbtVar.R();
                if (zA || objR2 == defpackage.cau.a) {
                    objR2 = new bjf(jLongValue, blzVar, j);
                    cbtVar.ab(objR2);
                }
                i8 = 0;
                cbtVar.W(false);
                bjfVar = (bjf) objR2;
            } else {
                i8 = 0;
                cavVarB.u(1588900273);
                ((defpackage.cbt) cavVarB).W(false);
                bjfVar = null;
            }
            int length = djiVar.c.length();
            java.util.List list = djiVar.b;
            if (list == null) {
                i9 = i8;
                break;
            }
            int size = list.size();
            int i14 = i8;
            while (true) {
                if (i14 >= size) {
                    i9 = i8;
                    break;
                }
                defpackage.djg djgVar = (defpackage.djg) list.get(i14);
                if ((djgVar.a instanceof dku) && defpackage.aooh.n("androidx.compose.foundation.text.inlineContent", djgVar.d)) {
                    int i15 = djgVar.b;
                    int i16 = djgVar.c;
                    int i17 = defpackage.djj.a;
                    int i18 = i15 < length ? 1 : i8;
                    int i19 = i16 > 0 ? 1 : i8;
                    if (((((length == 0 ? 1 : i8) | (i15 == i16 ? 1 : i8)) & (i15 == 0 ? 1 : i8)) | (i19 & i18)) != 0) {
                        i9 = 1;
                        break;
                    }
                }
                i14++;
            }
            boolean zF = djiVar.f(djiVar.a());
            defpackage.gat gatVar = (defpackage.gat) cavVarB.e(defpackage.dfo.g);
            defpackage.dnx dnxVar = (defpackage.dnx) cavVarB.e(defpackage.dfo.k);
            if (i9 != 0 || zF) {
                cavVar2 = cavVarB;
                bjf bjfVar2 = bjfVar;
                cavVar2.u(1590336906);
                defpackage.cbt cbtVar2 = (defpackage.cbt) cavVar2;
                java.lang.Object objR3 = cbtVar2.R();
                if (i13 == 4 || objR3 == defpackage.cau.a) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(djiVar, defpackage.cdu.c);
                    cbtVar2.ab(parcelableSnapshotMutableState);
                    objR3 = parcelableSnapshotMutableState;
                }
                defpackage.ccp ccpVar = (defpackage.ccp) objR3;
                defpackage.dji djiVar2 = (defpackage.dji) ccpVar.a();
                boolean zB = cavVar2.B(ccpVar);
                java.lang.Object objR4 = cbtVar2.R();
                if (zB || objR4 == defpackage.cau.a) {
                    objR4 = new bgf(ccpVar, 2);
                    cbtVar2.ab(objR4);
                }
                int i20 = i11 << 6;
                az(cmwVar, djiVar2, aonjVar, i9, map, dkzVar, i, z, i2, i3, gatVar, dnxVar, bjfVar2, (defpackage.aonj) objR4, cavVar2, (i12 & 910) | ((i11 >> 12) & 57344) | ((i11 << 9) & 458752) | (3670016 & i20) | (29360128 & i20) | (234881024 & i20) | (i20 & 1879048192), ((i11 >> 18) & 7168) | 512 | ((i7 << 15) & 458752));
                cbtVar2.W(false);
            } else {
                cavVarB.u(1589195765);
                defpackage.bgn.c(djiVar, dkzVar, gatVar, dnxVar, null, z, cavVarB);
                cavVar2 = cavVarB;
                defpackage.cmw cmwVarH = h(cmwVar, djiVar, dkzVar, aonjVar, i, z, i2, i3, gatVar, dnxVar, null, null, bjfVar, null);
                defpackage.bgo bgoVar = defpackage.bgo.a;
                defpackage.cbt cbtVar3 = (defpackage.cbt) cavVar2;
                long j2 = cbtVar3.x;
                long j3 = j2 ^ (j2 >>> 32);
                defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar2, cmwVarH);
                defpackage.cje cjeVarAi = cbtVar3.ai();
                defpackage.aomy aomyVar = defpackage.dam.a;
                cavVar2.v();
                if (cbtVar3.w) {
                    cavVar2.j(aomyVar);
                } else {
                    cavVar2.x();
                }
                defpackage.cev.c(cavVar2, bgoVar, defpackage.dam.e);
                defpackage.cev.c(cavVar2, cjeVarAi, defpackage.dam.d);
                cavVar2.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVar2, cmwVarM, defpackage.dam.c);
                defpackage.cev.c(cavVar2, java.lang.Integer.valueOf((int) j3), defpackage.dam.f);
                cbtVar3.W(true);
                cbtVar3.W(false);
            }
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bgk(djiVar, cmwVar, dkzVar, aonjVar, i, z, i2, i3, map, i4, i5);
        }
    }

    public static defpackage.bfy ax(int i) {
        return new defpackage.bga(i);
    }

    public static void ay(defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-709502251);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = 0;
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.cbd cbdVar = defpackage.cjz.a;
            defpackage.cjx cjxVar = (defpackage.cjx) cavVarB.e(cbdVar);
            defpackage.cjt cjtVarL = defpackage.cfd.l(cavVarB);
            java.lang.Object[] objArr = {cjxVar};
            defpackage.dko dkoVar = new defpackage.dko(new defpackage.bbd(i4), new defpackage.bet(cjxVar, cjtVarL, i4, null), 1);
            boolean zD = cavVarB.D(cjxVar) | cavVarB.D(cjtVarL);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zD || objR == defpackage.cau.a) {
                objR = new defpackage.bev(cjxVar, cjtVarL, i5);
                cbtVar.ab(objR);
            }
            defpackage.beu beuVar = (defpackage.beu) defpackage.cfd.n(objArr, dkoVar, (defpackage.aomy) objR, cavVarB, 0);
            ab(cbdVar.b(beuVar), defpackage.cfo.j(-412824043, new defpackage.bec(aonoVar, beuVar, i4), cavVarB), cavVarB, 48);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ajs(aonoVar, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:204:0x02db  */
    public static void az(defpackage.cmw cmwVar, defpackage.dji djiVar, defpackage.aonj aonjVar, boolean z, java.util.Map map, defpackage.dkz dkzVar, int i, boolean z2, int i2, int i3, defpackage.gat gatVar, defpackage.dnx dnxVar, bjf bjfVar, defpackage.aonj aonjVar2, defpackage.cav cavVar, int i4, int i5) {
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        bgy bgyVar;
        defpackage.aomy aomyVar;
        defpackage.aoiu aoiuVar;
        defpackage.aonj aonjVar3;
        defpackage.ccp ccpVar;
        defpackage.aonj aonjVar4;
        bgq bgzVar;
        boolean z6;
        java.util.List arrayList;
        int i7 = i4 & 6;
        defpackage.cav cavVarB = cavVar.b(-467347399);
        int i8 = i7 == 0 ? (true != cavVarB.B(cmwVar) ? 2 : 4) | i4 : i4;
        if ((i4 & 48) == 0) {
            i8 |= true != cavVarB.B(djiVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i8 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i8 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i8 |= true != ((32768 & i4) == 0 ? cavVarB.B(map) : cavVarB.D(map)) ? 8192 : 16384;
        }
        if ((i4 & 196608) == 0) {
            z3 = true;
            i8 |= true != cavVarB.B(dkzVar) ? 65536 : 131072;
        } else {
            z3 = true;
        }
        if ((1572864 & i4) == 0) {
            i8 |= z3 != cavVarB.z(i) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            i8 |= true != cavVarB.C(z2) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i8 |= true != cavVarB.z(i2) ? 33554432 : 67108864;
        }
        if ((805306368 & i4) == 0) {
            i8 |= true != cavVarB.z(i3) ? 268435456 : 536870912;
        }
        if ((i5 & 6) == 0) {
            z4 = true;
            i6 = (true != ((i5 & 8) == 0 ? cavVarB.B(gatVar) : cavVarB.D(gatVar)) ? 2 : 4) | i5;
        } else {
            z4 = true;
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= z4 != cavVarB.B(dnxVar) ? 16 : 32;
        }
        if ((i5 & 384) == 0) {
            i6 |= true != ((i5 & 512) == 0 ? cavVarB.B(bjfVar) : cavVarB.D(bjfVar)) ? 128 : 256;
        }
        if ((i5 & 3072) == 0) {
            z5 = true;
            i6 |= true != ((i5 & 4096) == 0 ? cavVarB.B(null) : cavVarB.D(null)) ? 1024 : 2048;
        } else {
            z5 = true;
        }
        if ((i5 & 24576) == 0) {
            i6 |= z5 != cavVarB.D(aonjVar2) ? 8192 : 16384;
        }
        if ((i5 & 196608) == 0) {
            i6 |= true == ((262144 & i5) == 0 ? cavVarB.B(null) : cavVarB.D(null)) ? 131072 : 65536;
        }
        if (cavVarB.H(((i8 & 306783379) == 306783378 && (i6 & 74899) == 74898) ? false : true, i8 & 1)) {
            int i9 = i8 & 112;
            if (djiVar.f(djiVar.a())) {
                cavVarB.u(1538266667);
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (i9 == 32 || objR == defpackage.cau.a) {
                    objR = new bgy(djiVar);
                    cbtVar.ab(objR);
                }
                cbtVar.W(false);
                bgyVar = (bgy) objR;
            } else {
                cavVarB.u(1538332324);
                ((defpackage.cbt) cavVarB).W(false);
                bgyVar = null;
            }
            if (djiVar.f(djiVar.a())) {
                cavVarB.u(1538530539);
                boolean zB = (i9 == 32) | cavVarB.B(bgyVar);
                defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
                java.lang.Object objR2 = cbtVar2.R();
                if (zB || objR2 == defpackage.cau.a) {
                    objR2 = new ny(bgyVar, djiVar, 6);
                    cbtVar2.ab(objR2);
                }
                cbtVar2.W(false);
                aomyVar = (defpackage.aomy) objR2;
            } else {
                cavVarB.u(1538627817);
                defpackage.cbt cbtVar3 = (defpackage.cbt) cavVarB;
                java.lang.Object objR3 = cbtVar3.R();
                if (i9 == 32 || objR3 == defpackage.cau.a) {
                    objR3 = new apv(djiVar, 14);
                    cbtVar3.ab(objR3);
                }
                cbtVar3.W(false);
                aomyVar = (defpackage.aomy) objR3;
            }
            if (!z) {
                aoiuVar = new defpackage.aoiu(null, null);
            } else if (map == null || map.isEmpty()) {
                aoiuVar = bgh.a;
            } else {
                int length = djiVar.c.length();
                java.util.List list = djiVar.b;
                if (list != null) {
                    arrayList = new java.util.ArrayList(list.size());
                    int size = list.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10;
                        defpackage.djg djgVar = (defpackage.djg) list.get(i10);
                        java.util.List list2 = list;
                        java.lang.Object obj = djgVar.a;
                        if (obj instanceof dku) {
                            java.lang.String str = djgVar.d;
                            if (defpackage.aooh.n("androidx.compose.foundation.text.inlineContent", str)) {
                                int i12 = djgVar.b;
                                int i13 = djgVar.c;
                                int i14 = defpackage.djj.a;
                                if ((((length == 0) | (i12 == i13)) & (i12 == 0)) | ((i13 > 0) & (i12 < length))) {
                                    if (obj == null) {
                                        defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    }
                                    arrayList.add(new defpackage.djg(((dku) obj).a, i12, i13, str));
                                }
                            }
                        }
                        i10 = i11 + 1;
                        list = list2;
                        length = length;
                    }
                } else {
                    arrayList = defpackage.aokc.a;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    defpackage.djg djgVar2 = (defpackage.djg) arrayList.get(i15);
                    if (((wt) map.get(djgVar2.a)) != null) {
                        int i16 = djgVar2.b;
                        int i17 = djgVar2.c;
                        throw null;
                    }
                }
                aoiuVar = new defpackage.aoiu(arrayList2, arrayList3);
            }
            java.lang.Object obj2 = aoiuVar.b;
            java.util.List list3 = (java.util.List) aoiuVar.a;
            java.util.List list4 = (java.util.List) obj2;
            if (z) {
                cavVarB.u(1538943924);
                defpackage.cbt cbtVar4 = (defpackage.cbt) cavVarB;
                java.lang.Object objR4 = cbtVar4.R();
                if (objR4 == defpackage.cau.a) {
                    aonjVar3 = null;
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
                    cbtVar4.ab(parcelableSnapshotMutableState);
                    objR4 = parcelableSnapshotMutableState;
                } else {
                    aonjVar3 = null;
                }
                cbtVar4.W(false);
                ccpVar = (defpackage.ccp) objR4;
            } else {
                aonjVar3 = null;
                cavVarB.u(1539031684);
                ((defpackage.cbt) cavVarB).W(false);
                ccpVar = null;
            }
            if (z) {
                cavVarB.u(1539124933);
                boolean zB2 = cavVarB.B(ccpVar);
                defpackage.cbt cbtVar5 = (defpackage.cbt) cavVarB;
                java.lang.Object objR5 = cbtVar5.R();
                if (zB2 || objR5 == defpackage.cau.a) {
                    objR5 = new bgf(ccpVar, 3);
                    cbtVar5.ab(objR5);
                }
                cbtVar5.W(false);
                aonjVar4 = (defpackage.aonj) objR5;
            } else {
                cavVarB.u(1539196356);
                ((defpackage.cbt) cavVarB).W(false);
                aonjVar4 = aonjVar3;
            }
            int i18 = (i8 >> 3) & 14;
            defpackage.ccp ccpVar2 = ccpVar;
            int i19 = i8;
            defpackage.bgn.c(djiVar, dkzVar, gatVar, dnxVar, list3, z2, cavVarB);
            defpackage.dji djiVar2 = (defpackage.dji) aomyVar.a();
            boolean zD = cavVarB.D(bgyVar) | ((i19 & 896) == 256);
            defpackage.cbt cbtVar6 = (defpackage.cbt) cavVarB;
            java.lang.Object objR6 = cbtVar6.R();
            if (zD || objR6 == defpackage.cau.a) {
                objR6 = new aum(bgyVar, aonjVar, 12);
                cbtVar6.ab(objR6);
            }
            defpackage.cmw cmwVarH = h(cmwVar, djiVar2, dkzVar, (defpackage.aonj) objR6, i, z2, i2, i3, gatVar, dnxVar, list3, aonjVar4, bjfVar, aonjVar2);
            if (z) {
                cavVarB.u(1540682745);
                boolean zD2 = cavVarB.D(bgyVar);
                java.lang.Object objR7 = cbtVar6.R();
                if (zD2 || objR7 == defpackage.cau.a) {
                    objR7 = new apv(bgyVar, 16);
                    cbtVar6.ab(objR7);
                }
                defpackage.aomy aomyVar2 = (defpackage.aomy) objR7;
                boolean zB3 = cavVarB.B(ccpVar2);
                java.lang.Object objR8 = cbtVar6.R();
                if (zB3 || objR8 == defpackage.cau.a) {
                    objR8 = new apv(ccpVar2, 17);
                    cbtVar6.ab(objR8);
                }
                bgzVar = new bgz(aomyVar2, (defpackage.aomy) objR8);
                cbtVar6.W(false);
            } else {
                cavVarB.u(1540505983);
                boolean zD3 = cavVarB.D(bgyVar);
                java.lang.Object objR9 = cbtVar6.R();
                if (zD3 || objR9 == defpackage.cau.a) {
                    objR9 = new apv(bgyVar, 15);
                    cbtVar6.ab(objR9);
                }
                bgzVar = new bgq((defpackage.aomy) objR9);
                cbtVar6.W(false);
            }
            long j = cbtVar6.x;
            long j2 = j ^ (j >>> 32);
            defpackage.cje cjeVarAi = cbtVar6.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarH);
            defpackage.aomy aomyVar3 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar6.w) {
                cavVarB.j(aomyVar3);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, bgzVar, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            if (bgyVar == null) {
                cavVarB.u(-267395923);
                z6 = false;
            } else {
                z6 = false;
                cavVarB.u(-1117004332);
                bgyVar.b(cavVarB, 8);
            }
            cbtVar6.W(z6);
            if (list4 == null) {
                cavVarB.u(-267345145);
            } else {
                cavVarB.u(-267345144);
                bgh.a(djiVar, list4, cavVarB, i18);
            }
            cbtVar6.W(z6);
            cbtVar6.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bgi(cmwVar, djiVar, aonjVar, z, map, dkzVar, i, z2, i2, i3, gatVar, dnxVar, bjfVar, aonjVar2, i4, i5);
        }
    }

    public static boolean bA(defpackage.alg algVar) {
        java.lang.Object objF = algVar.f();
        defpackage.afr afrVar = defpackage.afr.c;
        return objF == afrVar && algVar.h() == afrVar;
    }

    public static void bB(defpackage.alg algVar, defpackage.aonj aonjVar, defpackage.cmw cmwVar, defpackage.agf agfVar, defpackage.agg aggVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.agf agfVar2;
        defpackage.aono aonoVar2;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-497872534);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != cavVarB.B(algVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            agfVar2 = agfVar;
            i3 |= true != cavVarB.B(agfVar2) ? 1024 : 2048;
        } else {
            agfVar2 = agfVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.B(aggVar) ? 8192 : 16384;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= true != ((262144 & i) == 0 ? cavVarB.B(null) : cavVarB.D(null)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            aonoVar2 = aonoVar;
            i3 |= true != cavVarB.D(aonoVar2) ? 524288 : 1048576;
        } else {
            aonoVar2 = aonoVar;
        }
        if (cavVarB.H((599187 & i3) != 599186, i3 & 1)) {
            int i6 = i3 & 112;
            boolean z = i6 == 32;
            int i7 = i3 & 14;
            boolean z2 = i7 == 4;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z | z2) || objR == defpackage.cau.a) {
                objR = new defpackage.dof(aonjVar, algVar, i5);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarA = cmwVar.a(new defpackage.cxj((defpackage.aono) objR));
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == defpackage.cau.a) {
                objR2 = new defpackage.bbd(i5);
                cbtVar.ab(objR2);
            }
            cd(algVar, aonjVar, cmwVarA, agfVar2, aggVar, (defpackage.aonn) objR2, null, false, aonoVar2, cavVarB, i7 | 196608 | i6 | (i3 & 7168) | (57344 & i3) | 16777216 | ((i3 << 6) & 29360128) | ((i3 << 9) & 1879048192), 320);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new afa(algVar, aonjVar, cmwVar, agfVar, aggVar, aonoVar, i, i2, 1);
        }
    }

    public static defpackage.afr bC(defpackage.alg algVar, defpackage.aonj aonjVar, java.lang.Object obj, defpackage.cav cavVar) {
        defpackage.afr afrVar;
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        cbtVar.Z(-422486566, algVar, 0, null);
        if (algVar.C()) {
            cavVar.u(-212166497);
            cbtVar.W(false);
            if (((java.lang.Boolean) aonjVar.a(obj)).booleanValue()) {
                afrVar = defpackage.afr.b;
            } else {
                afrVar = ((java.lang.Boolean) aonjVar.a(algVar.f())).booleanValue() ? defpackage.afr.c : defpackage.afr.a;
            }
        } else {
            cavVar.u(-211886815);
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR;
            java.lang.Object objG = algVar.g();
            if (((java.lang.Boolean) aonjVar.a(algVar.f())).booleanValue() || (objG != null && ((java.lang.Boolean) aonjVar.a(objG)).booleanValue())) {
                ccpVar.b(java.lang.Boolean.TRUE);
            }
            if (((java.lang.Boolean) aonjVar.a(obj)).booleanValue()) {
                afrVar = defpackage.afr.b;
            } else {
                afrVar = ((objG == null || !((java.lang.Boolean) aonjVar.a(objG)).booleanValue()) && ((java.lang.Boolean) ccpVar.a()).booleanValue()) ? defpackage.afr.c : defpackage.afr.a;
            }
            cbtVar.W(false);
        }
        cbtVar.W(false);
        return afrVar;
    }

    public static void bD(final defpackage.azj azjVar, final boolean z, defpackage.cmw cmwVar, final defpackage.agf agfVar, final defpackage.agg aggVar, java.lang.String str, final defpackage.aono aonoVar, defpackage.cav cavVar, final int i) {
        int i2;
        final defpackage.cmw cmwVar2;
        final java.lang.String str2;
        int i3 = i & 48;
        defpackage.cav cavVarB = cavVar.b(234057107);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 384;
        if ((i & 3072) == 0) {
            i5 |= true != cavVarB.B(agfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i5 |= true != cavVarB.B(aggVar) ? 8192 : 16384;
        }
        int i6 = i5 | 196608;
        if ((1572864 & i) == 0) {
            i6 |= true != cavVarB.D(aonoVar) ? 524288 : 1048576;
        }
        if (cavVarB.H((599185 & i6) != 599184, i6 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.alg algVarD = defpackage.alk.d(java.lang.Boolean.valueOf(z), cavVarB, ((i6 >> 3) & 14) | ((i6 >> 12) & 112));
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.afv(i4);
                cbtVar.ab(objR);
            }
            defpackage.aonj aonjVar = (defpackage.aonj) objR;
            bB(algVarD, aonjVar, cmtVar, agfVar, aggVar, aonoVar, cavVarB, (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6) | (i6 & 3670016), 32);
            str2 = "AnimatedVisibility";
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            str2 = str;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: afc
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.cav cavVar2 = (defpackage.cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.azj azjVar2 = azjVar;
                    boolean z2 = z;
                    defpackage.cmw cmwVar3 = cmwVar2;
                    int i7 = i | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    defpackage.den.bD(azjVar2, z2, cmwVar3, agfVar, aggVar, str2, aonoVar, cavVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
                    return defpackage.aojh.a;
                }
            };
        }
    }

    public static void bE(defpackage.awy awyVar, boolean z, defpackage.cmw cmwVar, defpackage.agf agfVar, defpackage.agg aggVar, java.lang.String str, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        java.lang.String str2;
        int i3 = i & 48;
        defpackage.cav cavVarB = cavVar.b(1799879339);
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != cavVarB.B(agfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != cavVarB.B(aggVar) ? 8192 : 16384;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i) == 0) {
            i5 |= true != cavVarB.D(aonoVar) ? 524288 : 1048576;
        }
        if (cavVarB.H((599185 & i5) != 599184, i5 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.alg algVarD = defpackage.alk.d(java.lang.Boolean.valueOf(z), cavVarB, ((i5 >> 3) & 14) | ((i5 >> 12) & 112));
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.nq(7);
                cbtVar.ab(objR);
            }
            defpackage.aonj aonjVar = (defpackage.aonj) objR;
            bB(algVarD, aonjVar, cmtVar, agfVar, aggVar, aonoVar, cavVarB, (i5 & 896) | 48 | (i5 & 7168) | (57344 & i5) | (i5 & 3670016), 32);
            str2 = "AnimatedVisibility";
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            str2 = str;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bmp(awyVar, z, cmwVar2, agfVar, aggVar, str2, aonoVar, i, 1);
        }
    }

    public static int bF(defpackage.acc accVar, int i) {
        try {
            return defpackage.aei.a(accVar.a, accVar.c, i);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public static int bG(defpackage.acc accVar, java.lang.Object obj, int i) {
        int i2 = accVar.c;
        if (i2 == 0) {
            return -1;
        }
        int iBF = bF(accVar, i);
        if (iBF < 0 || defpackage.aooh.n(obj, accVar.b[iBF])) {
            return iBF;
        }
        int i3 = iBF + 1;
        while (i3 < i2 && accVar.a[i3] == i) {
            if (defpackage.aooh.n(obj, accVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBF - 1; i4 >= 0 && accVar.a[i4] == i; i4--) {
            if (defpackage.aooh.n(obj, accVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static android.content.Intent bH(java.lang.String[] strArr) {
        defpackage.aooh.f(strArr, "input");
        android.content.Intent intentPutExtra = new android.content.Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        defpackage.aooh.e(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public static defpackage.nw bI(defpackage.or orVar, defpackage.aonj aonjVar, defpackage.cav cavVar) {
        java.lang.Object obj;
        final defpackage.or orVar2;
        defpackage.cdh.g(orVar, cavVar);
        final defpackage.cer cerVarG = defpackage.cdh.g(aonjVar, cavVar);
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.Object objG = cavVar.g();
        java.lang.Object obj2 = defpackage.cau.a;
        if (objG == obj2) {
            objG = new defpackage.ns(1);
            cavVar.w(objG);
        }
        final java.lang.String str = (java.lang.String) defpackage.cfd.m(objArr, (defpackage.aomy) objG, cavVar, 48);
        defpackage.cbd cbdVar = defpackage.nt.a;
        defpackage.oo ooVar = (defpackage.oo) cavVar.e(defpackage.nt.a);
        if (ooVar == null) {
            cavVar.u(1213380307);
            java.lang.Object baseContext = (android.content.Context) cavVar.e(defpackage.dep.b);
            while (true) {
                if (!(baseContext instanceof android.content.ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof defpackage.oo) {
                    break;
                }
                baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
            }
            ooVar = (defpackage.oo) baseContext;
        } else {
            cavVar.u(1213379439);
        }
        cavVar.o();
        if (ooVar == null) {
            throw new java.lang.IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        final defpackage.on onVarD = ooVar.d();
        java.lang.Object objG2 = cavVar.g();
        if (objG2 == obj2) {
            objG2 = new defpackage.aiyy();
            cavVar.w(objG2);
        }
        final defpackage.aiyy aiyyVar = (defpackage.aiyy) objG2;
        java.lang.Object objG3 = cavVar.g();
        if (objG3 == obj2) {
            objG3 = new defpackage.nw(aiyyVar);
            cavVar.w(objG3);
        }
        defpackage.nw nwVar = (defpackage.nw) objG3;
        boolean zD = cavVar.D(aiyyVar) | cavVar.D(onVarD) | cavVar.B(str) | cavVar.D(orVar) | cavVar.B(cerVarG);
        java.lang.Object objG4 = cavVar.g();
        if (zD || objG4 == obj2) {
            orVar2 = orVar;
            obj = new defpackage.aonj() { // from class: nj
                @Override // defpackage.aonj
                public final java.lang.Object a(java.lang.Object obj3) {
                    final defpackage.cer cerVar = cerVarG;
                    defpackage.ok okVarA = onVarD.a(str, orVar2, new defpackage.oi() { // from class: nk
                        @Override // defpackage.oi
                        public final void a(java.lang.Object obj4) {
                            ((defpackage.aonj) cerVar.a()).a(obj4);
                        }
                    });
                    defpackage.aiyy aiyyVar2 = aiyyVar;
                    aiyyVar2.a = okVarA;
                    return new defpackage.alj(aiyyVar2, 1);
                }
            };
            cavVar.w(obj);
        } else {
            obj = objG4;
            orVar2 = orVar;
        }
        defpackage.aonj aonjVar2 = (defpackage.aonj) obj;
        boolean zB = cavVar.B(onVarD) | cavVar.B(str) | cavVar.B(orVar2);
        java.lang.Object objG5 = cavVar.g();
        if (zB || objG5 == obj2) {
            objG5 = new defpackage.cbl(aonjVar2);
            cavVar.w(objG5);
        }
        return nwVar;
    }

    public static void bJ(android.view.View view, defpackage.nh nhVar) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        view.setTag(2131429436, nhVar);
    }

    public static boolean bK(android.view.View view) {
        return view.getLayoutDirection() == 1;
    }

    public static int bM(android.content.Context context) {
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500 || (i > 480 && i2 > 640)) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    public static void bN(android.content.Context context) {
        context.getResources().getBoolean(2131034112);
    }

    public static android.graphics.drawable.Drawable bO(android.content.Context context, int i) {
        return defpackage.lg.e().c(context, i);
    }

    public static void bP(android.content.res.Configuration configuration, defpackage.dxe dxeVar) {
        aa$.ExternalSyntheticApiModelOutline1.m(configuration, aa$.ExternalSyntheticApiModelOutline1.m(dxeVar.e()));
    }

    public static /* synthetic */ java.lang.String bQ(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static void bR(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            defpackage.aooh.i("view");
        }
        if (viewGroup == null) {
            defpackage.aooh.i("container");
        }
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i2 = i - 1;
        if (i2 == 0) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bi(viewGroup2, view, "SpecialEffectsController: Removing view ", " from container "));
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bg(view, "SpecialEffectsController: Setting view ", " to INVISIBLE"));
                }
                view.setVisibility(4);
                return;
            } else {
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bg(view, "SpecialEffectsController: Setting view ", " to GONE"));
                }
                view.setVisibility(8);
                return;
            }
        }
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", defpackage.a.bg(view, "SpecialEffectsController: Setting view ", " to VISIBLE"));
        }
        android.view.ViewParent parent2 = view.getParent();
        if ((parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null) == null) {
            if (defpackage.bo.Z(2)) {
                android.util.Log.v("FragmentManager", defpackage.a.bi(viewGroup, view, "SpecialEffectsController: Adding view ", " to Container "));
            }
            viewGroup.addView(view);
        }
        view.setVisibility(0);
    }

    public static int bS(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Unknown visibility "));
    }

    public static int bT(android.view.View view) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return bS(view.getVisibility());
    }

    public static /* synthetic */ java.lang.String bU(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static defpackage.ck bV(android.view.ViewGroup viewGroup, defpackage.bo boVar) {
        if (viewGroup == null) {
            defpackage.aooh.i("container");
        }
        defpackage.den denVarAm = boVar.am();
        defpackage.aooh.e(denVarAm, "getSpecialEffectsControllerFactory(...)");
        return ce(viewGroup, denVarAm);
    }

    public static void bW(java.lang.Runnable runnable) {
        defpackage.gkc gkcVar = defpackage.gkc.d;
        gkcVar.a("androidx.fragment");
        defpackage.gjy gjyVar = defpackage.gjy.b;
        try {
            runnable.run();
            defpackage.mni.aP(gjyVar);
        } catch (java.lang.Throwable th) {
            try {
                fsu.I(gkcVar, th);
                throw new defpackage.aoiq();
            } catch (java.lang.Throwable th2) {
                defpackage.mni.aP(gjyVar);
                throw th2;
            }
        }
    }

    public static void bX(defpackage.aomy aomyVar, bnv bnvVar, defpackage.cmw cmwVar, boolean z, defpackage.bni bniVar, bnm bnmVar, defpackage.ayy ayyVar, defpackage.kaw kawVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        defpackage.aomy aomyVar2;
        int i2;
        java.lang.Object obj;
        defpackage.cav cavVar2;
        defpackage.kaw kawVar2;
        boolean z2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-311513973);
        if (i3 == 0) {
            aomyVar2 = aomyVar;
            i2 = (true != cavVarB.D(aomyVar2) ? 2 : 4) | i;
        } else {
            aomyVar2 = aomyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(bnvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(bniVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(bnmVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            obj = ayyVar;
            i2 |= true != cavVarB.B(obj) ? 4194304 : 8388608;
        } else {
            obj = ayyVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cavVarB.B(kawVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        int i4 = 0;
        if (cavVarB.H((306783379 & i2) != 306783378, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            if (kawVar == null) {
                cavVarB.u(1112124656);
                java.lang.Object objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                    cbtVar.ab(objR);
                }
                kawVar2 = (defpackage.kaw) objR;
                i4 = 0;
                cbtVar.W(false);
            } else {
                cavVarB.u(1282800327);
                cbtVar.W(false);
                kawVar2 = kawVar;
            }
            defpackage.ajl ajlVarAi = ai(3, cavVarB);
            defpackage.cer cerVarM = rv.m(kawVar2, cavVarB, i4);
            long jA = bniVar.a(z);
            long jB = bniVar.b(z);
            cavVarB.u(1282817462);
            defpackage.cer cerVarA = bnmVar.a(z, kawVar2, cavVarB, (i2 >> 9) & 910);
            cbtVar.W(false);
            float f = ((defpackage.dpi) cerVarA.a()).a;
            boolean zY = defpackage.a.y(cerVarM);
            cavVarB.u(802092292);
            defpackage.crd crdVarQ = zY ? bnvVar.b : bnvVar.a;
            defpackage.crd crdVar = bnvVar.a;
            if ((crdVar instanceof defpackage.bgc) && (bnvVar.b instanceof defpackage.bgc)) {
                cavVarB.u(-2066263642);
                z2 = false;
                cbtVar.Z(2011556533, bnvVar, 0, null);
                defpackage.aooh.d(crdVarQ, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
                crdVarQ = ro.q((defpackage.bgc) crdVarQ, ajlVarAi, cavVarB);
                cbtVar.W(false);
                cbtVar.W(false);
            } else {
                if ((crdVar instanceof defpackage.bfx) && (bnvVar.b instanceof defpackage.bfx)) {
                    cavVarB.u(-2066125816);
                    z2 = false;
                    cbtVar.Z(2011560979, bnvVar, 0, null);
                    defpackage.aooh.d(crdVarQ, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
                    crdVarQ = ro.q((defpackage.bfx) crdVarQ, ajlVarAi, cavVarB);
                    cbtVar.W(false);
                } else {
                    z2 = false;
                    cavVarB.u(-2066043170);
                }
                cbtVar.W(z2);
            }
            cbtVar.W(z2);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == defpackage.cau.a) {
                objR2 = new bcm(20);
                cbtVar.ab(objR2);
            }
            cavVar2 = cavVarB;
            defpackage.bvo.d(aomyVar2, defpackage.dig.b(cmwVar, false, (defpackage.aonj) objR2), z, crdVarQ, jA, jB, 0.0f, f, null, kawVar2, defpackage.cfo.j(1669820704, new bps(jB, obj, aonoVar, 1), cavVarB), cavVar2, 64);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bnu(aomyVar, bnvVar, cmwVar, z, bniVar, bnmVar, ayyVar, kawVar, aonoVar, i, 0);
        }
    }

    public static defpackage.acm bY(defpackage.bdy bdyVar, defpackage.bel belVar, defpackage.kaw kawVar) {
        int i;
        int iMin;
        java.util.List listC = ((androidx.compose.runtime.snapshots.SnapshotStateList) belVar.a).c();
        if (!kawVar.au() && listC.isEmpty()) {
            return defpackage.acn.a;
        }
        defpackage.acm acmVar = new defpackage.acm(16);
        if (kawVar.au()) {
            defpackage.cfc cfcVar = (defpackage.cfc) kawVar.a;
            i = ((defpackage.bdh) cfcVar.b()).a;
            java.lang.Object[] objArr = cfcVar.a;
            int i2 = cfcVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = ((defpackage.bdh) objArr[i3]).a;
                if (i4 < i) {
                    i = i4;
                }
            }
            if (i < 0) {
                avo.c("negative minIndex");
            }
            int i5 = ((defpackage.bdh) cfcVar.b()).b;
            java.lang.Object[] objArr2 = cfcVar.a;
            int i6 = cfcVar.b;
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = ((defpackage.bdh) objArr2[i7]).b;
                if (i8 > i5) {
                    i5 = i8;
                }
            }
            iMin = java.lang.Math.min(i5, bdyVar.b() - 1);
        } else {
            i = 1;
            iMin = 0;
        }
        int size = listC.size();
        for (int i9 = 0; i9 < size; i9++) {
            defpackage.bek bekVar = (defpackage.bek) listC.get(i9);
            int iAE = aE(bdyVar, bekVar.a, bekVar.b);
            if ((i > iAE || iAE > iMin) && iAE >= 0 && iAE < bdyVar.b()) {
                acmVar.f(iAE);
            }
        }
        if (i <= iMin) {
            while (true) {
                acmVar.f(i);
                if (i == iMin) {
                    break;
                }
                i++;
            }
        }
        acmVar.e();
        return acmVar;
    }

    public static defpackage.cmw bZ(defpackage.cmw cmwVar, defpackage.ati atiVar, defpackage.aso asoVar, defpackage.amn amnVar, boolean z, boolean z2, defpackage.ars arsVar, defpackage.kaw kawVar, defpackage.aqb aqbVar) {
        return bh(cmwVar, asoVar).a(new defpackage.aoo(atiVar, asoVar, z, z2, arsVar, kawVar, aqbVar, false, amnVar));
    }

    public static defpackage.cmw ba(defpackage.cmw cmwVar, float f, float f2, float f3, float f4) {
        return cmwVar.a(new defpackage.ayt(f, f2, f3, f4, true));
    }

    public static /* synthetic */ defpackage.ayy bb(float f, int i) {
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new defpackage.azc(f, 0.0f, f, 0.0f);
    }

    public static /* synthetic */ defpackage.ayy bc(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new defpackage.azc(f, f2, f3, f4);
    }

    public static /* synthetic */ defpackage.cmw bd(float f, float f2, int i) {
        return new defpackage.ayt(1 != (i & 1) ? f : 0.0f, 0.0f, (i & 4) != 0 ? 0.0f : f2, 0.0f, false);
    }

    public static int be(defpackage.bay bayVar) {
        return (int) (bayVar.o == defpackage.aso.a ? bayVar.d() & 4294967295L : bayVar.d() >> 32);
    }

    public static defpackage.ars bf(defpackage.cav cavVar) {
        float f = defpackage.ahx.a;
        defpackage.dpf dpfVar = (defpackage.dpf) cavVar.e(defpackage.dfo.e);
        boolean zY = cavVar.y(dpfVar.a());
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (zY || objR == defpackage.cau.a) {
            objR = new defpackage.kaw(new defpackage.ahw(dpfVar), (byte[]) null);
            cbtVar.ab(objR);
        }
        defpackage.kaw kawVar = (defpackage.kaw) objR;
        boolean zB = cavVar.B(kawVar);
        java.lang.Object objR2 = cbtVar.R();
        if (zB || objR2 == defpackage.cau.a) {
            objR2 = new defpackage.aqm(kawVar);
            cbtVar.ab(objR2);
        }
        return (defpackage.aqm) objR2;
    }

    public static boolean bg(defpackage.cav cavVar) {
        return (((android.content.res.Configuration) cavVar.e(defpackage.dep.a)).uiMode & 48) == 32;
    }

    public static defpackage.cmw bh(defpackage.cmw cmwVar, defpackage.aso asoVar) {
        return cmwVar.a(asoVar == defpackage.aso.a ? defpackage.cfd.K(defpackage.cmw.c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.aos.a, true, 0, 1042431) : defpackage.cfd.K(defpackage.cmw.c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.aos.b, true, 0, 1042431));
    }

    public static boolean bi(cuf cufVar) {
        return (cufVar.g || !cufVar.f || cufVar.d) ? false : true;
    }

    public static defpackage.cmw bj(defpackage.cmw cmwVar, boolean z, java.lang.String str, defpackage.dib dibVar, defpackage.aomy aomyVar) {
        return cmwVar.a(new defpackage.amw(null, null, true, z, str, dibVar, aomyVar));
    }

    public static void bk(long j, defpackage.aso asoVar) {
        if (asoVar == defpackage.aso.a) {
            if (defpackage.dpd.a(j) == Integer.MAX_VALUE) {
                avo.d("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (defpackage.dpd.b(j) == Integer.MAX_VALUE) {
            avo.d("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static defpackage.amu bl(float f, long j) {
        return new defpackage.amu(f, new defpackage.crf(j));
    }

    public static defpackage.cmw bm(defpackage.cmw cmwVar, float f, long j, defpackage.crd crdVar) {
        return cmwVar.a(new defpackage.amt(f, new defpackage.crf(j), crdVar));
    }

    public static defpackage.cmw bn(defpackage.cmw cmwVar, long j, defpackage.crd crdVar) {
        return cmwVar.a(new defpackage.amq(j, null, crdVar, 2));
    }

    public static defpackage.aiw bq(defpackage.aiw aiwVar) {
        defpackage.aiw aiwVarC = aiwVar.c();
        int iB = aiwVarC.b();
        for (int i = 0; i < iB; i++) {
            aiwVarC.e(i, aiwVar.a(i));
        }
        return aiwVarC;
    }

    public static defpackage.air br(float f, float f2) {
        return new defpackage.air(defpackage.alo.a, java.lang.Float.valueOf(f), new defpackage.ais(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ defpackage.air bs(defpackage.air airVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((java.lang.Number) airVar.a()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((defpackage.ais) airVar.a).a;
        }
        return new defpackage.air(airVar.e, java.lang.Float.valueOf(f), new defpackage.ais(f2), airVar.b, airVar.c, airVar.d);
    }

    public static /* synthetic */ defpackage.air bt(defpackage.air airVar, java.lang.Object obj, long j, int i) {
        if ((i & 1) != 0) {
            obj = airVar.a();
        }
        java.lang.Object obj2 = obj;
        defpackage.aiw aiwVarBq = (i & 2) != 0 ? bq(airVar.a) : null;
        long j2 = (i & 4) != 0 ? airVar.b : 0L;
        if ((i & 8) != 0) {
            j = airVar.c;
        }
        return new defpackage.air(airVar.e, obj2, aiwVarBq, j2, j, airVar.d);
    }

    public static aka bu(defpackage.aonj aonjVar) {
        aogy aogyVar = new aogy((char[]) null);
        aonjVar.a(aogyVar);
        return new aka(aogyVar);
    }

    public static /* synthetic */ defpackage.alm bv(int i, int i2, defpackage.ajh ajhVar, int i3) {
        if ((i3 & 4) != 0) {
            ajhVar = defpackage.ajk.a;
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            i2 = 0;
        }
        if (1 == i5) {
            i = 300;
        }
        return new defpackage.alm(i, i2, ajhVar);
    }

    public static /* synthetic */ defpackage.ajr bw(defpackage.ajg ajgVar, int i, long j, int i2) {
        if ((i2 & 4) != 0) {
            j = 0;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return new defpackage.ajr(ajgVar, i, j);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x0105  */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x013b  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static void bx(defpackage.akc akcVar, defpackage.cmw cmwVar, defpackage.agf agfVar, defpackage.agg aggVar, java.lang.String str, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.agf agfVar2;
        int i5;
        int i6;
        defpackage.agg aggVar2;
        int i7;
        int i8;
        int i9;
        java.lang.String str2;
        defpackage.cmw cmwVar3;
        defpackage.agf agfVar3;
        defpackage.agg aggVar3;
        defpackage.cdk cdkVarI;
        int i10;
        defpackage.cmw cmwVar4;
        defpackage.agf agfVarA;
        defpackage.agg aggVarA;
        java.lang.String str3;
        defpackage.cbt cbtVar;
        java.lang.Object objR;
        int i11;
        int i12 = i & 6;
        defpackage.cav cavVarB = cavVar.b(657024243);
        if (i12 == 0) {
            i3 = (true != ((i & 8) == 0 ? cavVarB.B(akcVar) : cavVarB.D(akcVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    agfVar2 = agfVar;
                    if (true != cavVarB.B(agfVar2)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        aggVar2 = aggVar;
                        if (true != cavVarB.B(aggVar2)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        if (true != cavVarB.B(str)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if (true != cavVarB.D(aonoVar)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
                        if (i13 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                        } else {
                            agfVarA = agfVar2;
                        }
                        if (i6 != 0) {
                            aggVarA = defpackage.aga.o(null, 3).a(defpackage.aga.l(null, null, 15));
                        } else {
                            aggVarA = aggVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        defpackage.alg algVarC = defpackage.alk.c(akcVar, cavVarB, (i3 & 14) | ((i3 >> 9) & 112));
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.nq(6);
                            cbtVar.ab(objR);
                        }
                        int i14 = i3 << 3;
                        bB(algVarC, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i14 & 896) | 48 | (i14 & 7168) | (57344 & i14) | (i14 & 3670016), 32);
                        str2 = str3;
                        cmwVar3 = cmwVar4;
                        agfVar3 = agfVarA;
                        aggVar3 = aggVarA;
                    } else {
                        cavVarB.s();
                        str2 = str;
                        cmwVar3 = cmwVar2;
                        agfVar3 = agfVar2;
                        aggVar3 = aggVar2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new afa(akcVar, cmwVar3, agfVar3, aggVar3, str2, aonoVar, i, i2, 2);
                    }
                }
                i3 |= 3072;
                aggVar2 = aggVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (true != cavVarB.B(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
                    if (i13 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                    } else {
                        agfVarA = agfVar2;
                    }
                    if (i6 != 0) {
                        aggVarA = defpackage.aga.o(null, 3).a(defpackage.aga.l(null, null, 15));
                    } else {
                        aggVarA = aggVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    defpackage.alg algVarC2 = defpackage.alk.c(akcVar, cavVarB, (i3 & 14) | ((i3 >> 9) & 112));
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.nq(6);
                        cbtVar.ab(objR);
                    }
                    int i15 = i3 << 3;
                    bB(algVarC2, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i15 & 896) | 48 | (i15 & 7168) | (57344 & i15) | (i15 & 3670016), 32);
                    str2 = str3;
                    cmwVar3 = cmwVar4;
                    agfVar3 = agfVarA;
                    aggVar3 = aggVarA;
                } else {
                    cavVarB.s();
                    str2 = str;
                    cmwVar3 = cmwVar2;
                    agfVar3 = agfVar2;
                    aggVar3 = aggVar2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new afa(akcVar, cmwVar3, agfVar3, aggVar3, str2, aonoVar, i, i2, 2);
                }
            }
            i3 |= 384;
            agfVar2 = agfVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aggVar2 = aggVar;
                    if (true != cavVarB.B(aggVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (true != cavVarB.B(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
                    if (i13 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                    } else {
                        agfVarA = agfVar2;
                    }
                    if (i6 != 0) {
                        aggVarA = defpackage.aga.o(null, 3).a(defpackage.aga.l(null, null, 15));
                    } else {
                        aggVarA = aggVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    defpackage.alg algVarC3 = defpackage.alk.c(akcVar, cavVarB, (i3 & 14) | ((i3 >> 9) & 112));
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.nq(6);
                        cbtVar.ab(objR);
                    }
                    int i16 = i3 << 3;
                    bB(algVarC3, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i16 & 896) | 48 | (i16 & 7168) | (57344 & i16) | (i16 & 3670016), 32);
                    str2 = str3;
                    cmwVar3 = cmwVar4;
                    agfVar3 = agfVarA;
                    aggVar3 = aggVarA;
                } else {
                    cavVarB.s();
                    str2 = str;
                    cmwVar3 = cmwVar2;
                    agfVar3 = agfVar2;
                    aggVar3 = aggVar2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new afa(akcVar, cmwVar3, agfVar3, aggVar3, str2, aonoVar, i, i2, 2);
                }
            }
            i3 |= 3072;
            aggVar2 = aggVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.B(str)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
                if (i13 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                    i10 = i8;
                } else {
                    i10 = i8;
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                } else {
                    agfVarA = agfVar2;
                }
                if (i6 != 0) {
                    aggVarA = defpackage.aga.o(null, 3).a(defpackage.aga.l(null, null, 15));
                } else {
                    aggVarA = aggVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                defpackage.alg algVarC4 = defpackage.alk.c(akcVar, cavVarB, (i3 & 14) | ((i3 >> 9) & 112));
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.nq(6);
                    cbtVar.ab(objR);
                }
                int i17 = i3 << 3;
                bB(algVarC4, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 3670016), 32);
                str2 = str3;
                cmwVar3 = cmwVar4;
                agfVar3 = agfVarA;
                aggVar3 = aggVarA;
            } else {
                cavVarB.s();
                str2 = str;
                cmwVar3 = cmwVar2;
                agfVar3 = agfVar2;
                aggVar3 = aggVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new afa(akcVar, cmwVar3, agfVar3, aggVar3, str2, aonoVar, i, i2, 2);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                agfVar2 = agfVar;
                if (true != cavVarB.B(agfVar2)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aggVar2 = aggVar;
                    if (true != cavVarB.B(aggVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (true != cavVarB.B(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
                    if (i13 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                    } else {
                        agfVarA = agfVar2;
                    }
                    if (i6 != 0) {
                        aggVarA = defpackage.aga.o(null, 3).a(defpackage.aga.l(null, null, 15));
                    } else {
                        aggVarA = aggVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    defpackage.alg algVarC5 = defpackage.alk.c(akcVar, cavVarB, (i3 & 14) | ((i3 >> 9) & 112));
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.nq(6);
                        cbtVar.ab(objR);
                    }
                    int i18 = i3 << 3;
                    bB(algVarC5, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i18 & 896) | 48 | (i18 & 7168) | (57344 & i18) | (i18 & 3670016), 32);
                    str2 = str3;
                    cmwVar3 = cmwVar4;
                    agfVar3 = agfVarA;
                    aggVar3 = aggVarA;
                } else {
                    cavVarB.s();
                    str2 = str;
                    cmwVar3 = cmwVar2;
                    agfVar3 = agfVar2;
                    aggVar3 = aggVar2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new afa(akcVar, cmwVar3, agfVar3, aggVar3, str2, aonoVar, i, i2, 2);
                }
            }
            i3 |= 3072;
            aggVar2 = aggVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.B(str)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
                if (i13 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                    i10 = i8;
                } else {
                    i10 = i8;
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                } else {
                    agfVarA = agfVar2;
                }
                if (i6 != 0) {
                    aggVarA = defpackage.aga.o(null, 3).a(defpackage.aga.l(null, null, 15));
                } else {
                    aggVarA = aggVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                defpackage.alg algVarC6 = defpackage.alk.c(akcVar, cavVarB, (i3 & 14) | ((i3 >> 9) & 112));
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.nq(6);
                    cbtVar.ab(objR);
                }
                int i19 = i3 << 3;
                bB(algVarC6, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i19 & 896) | 48 | (i19 & 7168) | (57344 & i19) | (i19 & 3670016), 32);
                str2 = str3;
                cmwVar3 = cmwVar4;
                agfVar3 = agfVarA;
                aggVar3 = aggVarA;
            } else {
                cavVarB.s();
                str2 = str;
                cmwVar3 = cmwVar2;
                agfVar3 = agfVar2;
                aggVar3 = aggVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new afa(akcVar, cmwVar3, agfVar3, aggVar3, str2, aonoVar, i, i2, 2);
            }
        }
        i3 |= 384;
        agfVar2 = agfVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                aggVar2 = aggVar;
                if (true != cavVarB.B(aggVar2)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.B(str)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
                if (i13 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                    i10 = i8;
                } else {
                    i10 = i8;
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                } else {
                    agfVarA = agfVar2;
                }
                if (i6 != 0) {
                    aggVarA = defpackage.aga.o(null, 3).a(defpackage.aga.l(null, null, 15));
                } else {
                    aggVarA = aggVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                defpackage.alg algVarC7 = defpackage.alk.c(akcVar, cavVarB, (i3 & 14) | ((i3 >> 9) & 112));
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.nq(6);
                    cbtVar.ab(objR);
                }
                int i110 = i3 << 3;
                bB(algVarC7, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i110 & 896) | 48 | (i110 & 7168) | (57344 & i110) | (i110 & 3670016), 32);
                str2 = str3;
                cmwVar3 = cmwVar4;
                agfVar3 = agfVarA;
                aggVar3 = aggVarA;
            } else {
                cavVarB.s();
                str2 = str;
                cmwVar3 = cmwVar2;
                agfVar3 = agfVar2;
                aggVar3 = aggVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new afa(akcVar, cmwVar3, agfVar3, aggVar3, str2, aonoVar, i, i2, 2);
            }
        }
        i3 |= 3072;
        aggVar2 = aggVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != cavVarB.B(str)) {
                i9 = 8192;
            } else {
                i9 = 16384;
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i11 = 65536;
            } else {
                i11 = 131072;
            }
            i3 |= i11;
        }
        if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
            if (i13 != 0) {
                cmwVar4 = defpackage.cmw.c;
                i10 = i8;
            } else {
                i10 = i8;
                cmwVar4 = cmwVar2;
            }
            if (i4 != 0) {
                agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
            } else {
                agfVarA = agfVar2;
            }
            if (i6 != 0) {
                aggVarA = defpackage.aga.o(null, 3).a(defpackage.aga.l(null, null, 15));
            } else {
                aggVarA = aggVar2;
            }
            if (i10 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            defpackage.alg algVarC8 = defpackage.alk.c(akcVar, cavVarB, (i3 & 14) | ((i3 >> 9) & 112));
            cbtVar = (defpackage.cbt) cavVarB;
            objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.nq(6);
                cbtVar.ab(objR);
            }
            int i111 = i3 << 3;
            bB(algVarC8, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i111 & 896) | 48 | (i111 & 7168) | (57344 & i111) | (i111 & 3670016), 32);
            str2 = str3;
            cmwVar3 = cmwVar4;
            agfVar3 = agfVarA;
            aggVar3 = aggVarA;
        } else {
            cavVarB.s();
            str2 = str;
            cmwVar3 = cmwVar2;
            agfVar3 = agfVar2;
            aggVar3 = aggVar2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new afa(akcVar, cmwVar3, agfVar3, aggVar3, str2, aonoVar, i, i2, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static void by(defpackage.alg algVar, defpackage.aonj aonjVar, defpackage.cmw cmwVar, defpackage.agf agfVar, defpackage.agg aggVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        defpackage.cdk cdkVarI;
        defpackage.cmw cmwVar3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1699747442);
        if (i7 == 0) {
            i3 = (true != cavVarB.B(algVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                if (true != cavVarB.B(agfVar)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i3 |= i6;
            }
            if ((i & 24576) == 0) {
                if (true != cavVarB.B(aggVar)) {
                    i5 = 8192;
                } else {
                    i5 = 16384;
                }
                i3 |= i5;
            }
            if ((i & 196608) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i4 = 65536;
                } else {
                    i4 = 131072;
                }
                i3 |= i4;
            }
            if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
                if (i8 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                int i9 = i3 & 7168;
                int i10 = 57344 & i3;
                bB(algVar, aonjVar, cmwVar3, agfVar, aggVar, aonoVar, cavVarB, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | i9 | i10 | ((i3 << 3) & 3670016), 0);
                cmwVar2 = cmwVar3;
            } else {
                cavVarB.s();
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new afa(algVar, aonjVar, cmwVar2, agfVar, aggVar, aonoVar, i, i2, 0);
            }
        }
        i3 |= 384;
        cmwVar2 = cmwVar;
        if ((i & 3072) == 0) {
            if (true != cavVarB.B(agfVar)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if (true != cavVarB.B(aggVar)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i3 |= i5;
        }
        if ((i & 196608) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i4 = 65536;
            } else {
                i4 = 131072;
            }
            i3 |= i4;
        }
        if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
            if (i8 != 0) {
                cmwVar3 = defpackage.cmw.c;
            } else {
                cmwVar3 = cmwVar2;
            }
            int i11 = i3 & 7168;
            int i12 = 57344 & i3;
            bB(algVar, aonjVar, cmwVar3, agfVar, aggVar, aonoVar, cavVarB, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | i11 | i12 | ((i3 << 3) & 3670016), 0);
            cmwVar2 = cmwVar3;
        } else {
            cavVarB.s();
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new afa(algVar, aonjVar, cmwVar2, agfVar, aggVar, aonoVar, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static void bz(final boolean z, defpackage.cmw cmwVar, defpackage.agf agfVar, defpackage.agg aggVar, java.lang.String str, final defpackage.aono aonoVar, defpackage.cav cavVar, final int i, final int i2) {
        boolean z2;
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.agf agfVar2;
        int i5;
        int i6;
        defpackage.agg aggVar2;
        int i7;
        int i8;
        final java.lang.String str2;
        final defpackage.cmw cmwVar3;
        final defpackage.agf agfVar3;
        final defpackage.agg aggVar3;
        defpackage.cdk cdkVarI;
        defpackage.cmw cmwVar4;
        defpackage.agf agfVarA;
        defpackage.agg aggVarA;
        defpackage.cbt cbtVar;
        java.lang.Object objR;
        int i9;
        int i10 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1448730565);
        if (i10 == 0) {
            z2 = z;
            i3 = (true != cavVarB.C(z2) ? 2 : 4) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    agfVar2 = agfVar;
                    if (true != cavVarB.B(agfVar2)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        aggVar2 = aggVar;
                        if (true != cavVarB.B(aggVar2)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 24576;
                    if ((196608 & i) == 0) {
                        if (true != cavVarB.D(aonoVar)) {
                            i9 = 65536;
                        } else {
                            i9 = 131072;
                        }
                        i8 |= i9;
                    }
                    if (cavVarB.H((74899 & i8) != 74898, i8 & 1)) {
                        if (i11 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                        } else {
                            agfVarA = agfVar2;
                        }
                        if (i6 != 0) {
                            aggVarA = defpackage.aga.l(null, null, 15).a(defpackage.aga.o(null, 3));
                        } else {
                            aggVarA = aggVar2;
                        }
                        defpackage.alg algVarD = defpackage.alk.d(java.lang.Boolean.valueOf(z2), cavVarB, (i8 & 14) | ((i8 >> 9) & 112));
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.nq(5);
                            cbtVar.ab(objR);
                        }
                        int i12 = i8 << 3;
                        bB(algVarD, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i12 & 896) | 48 | (i12 & 7168) | (57344 & i12) | (i12 & 3670016), 32);
                        str2 = "AnimatedVisibility";
                        cmwVar3 = cmwVar4;
                        agfVar3 = agfVarA;
                        aggVar3 = aggVarA;
                    } else {
                        cavVarB.s();
                        str2 = str;
                        cmwVar3 = cmwVar2;
                        agfVar3 = agfVar2;
                        aggVar3 = aggVar2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new defpackage.aonn() { // from class: aez
                            @Override // defpackage.aonn
                            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.cav cavVar2 = (defpackage.cav) obj;
                                ((java.lang.Integer) obj2).intValue();
                                boolean z3 = z;
                                defpackage.cmw cmwVar5 = cmwVar3;
                                int i13 = i | 1;
                                int i14 = 306783378 & i13;
                                int i15 = 613566756 & i13;
                                defpackage.den.bz(z3, cmwVar5, agfVar3, aggVar3, str2, aonoVar, cavVar2, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 << 1) & i15), i2);
                                return defpackage.aojh.a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                aggVar2 = aggVar;
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i8 |= i9;
                }
                if (cavVarB.H((74899 & i8) != 74898, i8 & 1)) {
                    if (i11 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                    } else {
                        agfVarA = agfVar2;
                    }
                    if (i6 != 0) {
                        aggVarA = defpackage.aga.l(null, null, 15).a(defpackage.aga.o(null, 3));
                    } else {
                        aggVarA = aggVar2;
                    }
                    defpackage.alg algVarD2 = defpackage.alk.d(java.lang.Boolean.valueOf(z2), cavVarB, (i8 & 14) | ((i8 >> 9) & 112));
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.nq(5);
                        cbtVar.ab(objR);
                    }
                    int i13 = i8 << 3;
                    bB(algVarD2, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i13 & 896) | 48 | (i13 & 7168) | (57344 & i13) | (i13 & 3670016), 32);
                    str2 = "AnimatedVisibility";
                    cmwVar3 = cmwVar4;
                    agfVar3 = agfVarA;
                    aggVar3 = aggVarA;
                } else {
                    cavVarB.s();
                    str2 = str;
                    cmwVar3 = cmwVar2;
                    agfVar3 = agfVar2;
                    aggVar3 = aggVar2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.aonn() { // from class: aez
                        @Override // defpackage.aonn
                        public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.cav cavVar2 = (defpackage.cav) obj;
                            ((java.lang.Integer) obj2).intValue();
                            boolean z3 = z;
                            defpackage.cmw cmwVar5 = cmwVar3;
                            int i14 = i | 1;
                            int i15 = 306783378 & i14;
                            int i16 = 613566756 & i14;
                            defpackage.den.bz(z3, cmwVar5, agfVar3, aggVar3, str2, aonoVar, cavVar2, (i14 & (-920350135)) | i15 | (i16 >> 1) | ((i15 << 1) & i16), i2);
                            return defpackage.aojh.a;
                        }
                    };
                }
            }
            i3 |= 384;
            agfVar2 = agfVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aggVar2 = aggVar;
                    if (true != cavVarB.B(aggVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i8 |= i9;
                }
                if (cavVarB.H((74899 & i8) != 74898, i8 & 1)) {
                    if (i11 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                    } else {
                        agfVarA = agfVar2;
                    }
                    if (i6 != 0) {
                        aggVarA = defpackage.aga.l(null, null, 15).a(defpackage.aga.o(null, 3));
                    } else {
                        aggVarA = aggVar2;
                    }
                    defpackage.alg algVarD3 = defpackage.alk.d(java.lang.Boolean.valueOf(z2), cavVarB, (i8 & 14) | ((i8 >> 9) & 112));
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.nq(5);
                        cbtVar.ab(objR);
                    }
                    int i14 = i8 << 3;
                    bB(algVarD3, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i14 & 896) | 48 | (i14 & 7168) | (57344 & i14) | (i14 & 3670016), 32);
                    str2 = "AnimatedVisibility";
                    cmwVar3 = cmwVar4;
                    agfVar3 = agfVarA;
                    aggVar3 = aggVarA;
                } else {
                    cavVarB.s();
                    str2 = str;
                    cmwVar3 = cmwVar2;
                    agfVar3 = agfVar2;
                    aggVar3 = aggVar2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.aonn() { // from class: aez
                        @Override // defpackage.aonn
                        public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.cav cavVar2 = (defpackage.cav) obj;
                            ((java.lang.Integer) obj2).intValue();
                            boolean z3 = z;
                            defpackage.cmw cmwVar5 = cmwVar3;
                            int i15 = i | 1;
                            int i16 = 306783378 & i15;
                            int i17 = 613566756 & i15;
                            defpackage.den.bz(z3, cmwVar5, agfVar3, aggVar3, str2, aonoVar, cavVar2, (i15 & (-920350135)) | i16 | (i17 >> 1) | ((i16 << 1) & i17), i2);
                            return defpackage.aojh.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            aggVar2 = aggVar;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i9 = 65536;
                } else {
                    i9 = 131072;
                }
                i8 |= i9;
            }
            if (cavVarB.H((74899 & i8) != 74898, i8 & 1)) {
                if (i11 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                } else {
                    agfVarA = agfVar2;
                }
                if (i6 != 0) {
                    aggVarA = defpackage.aga.l(null, null, 15).a(defpackage.aga.o(null, 3));
                } else {
                    aggVarA = aggVar2;
                }
                defpackage.alg algVarD4 = defpackage.alk.d(java.lang.Boolean.valueOf(z2), cavVarB, (i8 & 14) | ((i8 >> 9) & 112));
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.nq(5);
                    cbtVar.ab(objR);
                }
                int i15 = i8 << 3;
                bB(algVarD4, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i15 & 896) | 48 | (i15 & 7168) | (57344 & i15) | (i15 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cmwVar3 = cmwVar4;
                agfVar3 = agfVarA;
                aggVar3 = aggVarA;
            } else {
                cavVarB.s();
                str2 = str;
                cmwVar3 = cmwVar2;
                agfVar3 = agfVar2;
                aggVar3 = aggVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.aonn() { // from class: aez
                    @Override // defpackage.aonn
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.cav cavVar2 = (defpackage.cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        boolean z3 = z;
                        defpackage.cmw cmwVar5 = cmwVar3;
                        int i16 = i | 1;
                        int i17 = 306783378 & i16;
                        int i18 = 613566756 & i16;
                        defpackage.den.bz(z3, cmwVar5, agfVar3, aggVar3, str2, aonoVar, cavVar2, (i16 & (-920350135)) | i17 | (i18 >> 1) | ((i17 << 1) & i18), i2);
                        return defpackage.aojh.a;
                    }
                };
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                agfVar2 = agfVar;
                if (true != cavVarB.B(agfVar2)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aggVar2 = aggVar;
                    if (true != cavVarB.B(aggVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i8 |= i9;
                }
                if (cavVarB.H((74899 & i8) != 74898, i8 & 1)) {
                    if (i11 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                    } else {
                        agfVarA = agfVar2;
                    }
                    if (i6 != 0) {
                        aggVarA = defpackage.aga.l(null, null, 15).a(defpackage.aga.o(null, 3));
                    } else {
                        aggVarA = aggVar2;
                    }
                    defpackage.alg algVarD5 = defpackage.alk.d(java.lang.Boolean.valueOf(z2), cavVarB, (i8 & 14) | ((i8 >> 9) & 112));
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.nq(5);
                        cbtVar.ab(objR);
                    }
                    int i16 = i8 << 3;
                    bB(algVarD5, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i16 & 896) | 48 | (i16 & 7168) | (57344 & i16) | (i16 & 3670016), 32);
                    str2 = "AnimatedVisibility";
                    cmwVar3 = cmwVar4;
                    agfVar3 = agfVarA;
                    aggVar3 = aggVarA;
                } else {
                    cavVarB.s();
                    str2 = str;
                    cmwVar3 = cmwVar2;
                    agfVar3 = agfVar2;
                    aggVar3 = aggVar2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.aonn() { // from class: aez
                        @Override // defpackage.aonn
                        public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.cav cavVar2 = (defpackage.cav) obj;
                            ((java.lang.Integer) obj2).intValue();
                            boolean z3 = z;
                            defpackage.cmw cmwVar5 = cmwVar3;
                            int i17 = i | 1;
                            int i18 = 306783378 & i17;
                            int i19 = 613566756 & i17;
                            defpackage.den.bz(z3, cmwVar5, agfVar3, aggVar3, str2, aonoVar, cavVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 << 1) & i19), i2);
                            return defpackage.aojh.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            aggVar2 = aggVar;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i9 = 65536;
                } else {
                    i9 = 131072;
                }
                i8 |= i9;
            }
            if (cavVarB.H((74899 & i8) != 74898, i8 & 1)) {
                if (i11 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                } else {
                    agfVarA = agfVar2;
                }
                if (i6 != 0) {
                    aggVarA = defpackage.aga.l(null, null, 15).a(defpackage.aga.o(null, 3));
                } else {
                    aggVarA = aggVar2;
                }
                defpackage.alg algVarD6 = defpackage.alk.d(java.lang.Boolean.valueOf(z2), cavVarB, (i8 & 14) | ((i8 >> 9) & 112));
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.nq(5);
                    cbtVar.ab(objR);
                }
                int i17 = i8 << 3;
                bB(algVarD6, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cmwVar3 = cmwVar4;
                agfVar3 = agfVarA;
                aggVar3 = aggVarA;
            } else {
                cavVarB.s();
                str2 = str;
                cmwVar3 = cmwVar2;
                agfVar3 = agfVar2;
                aggVar3 = aggVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.aonn() { // from class: aez
                    @Override // defpackage.aonn
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.cav cavVar2 = (defpackage.cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        boolean z3 = z;
                        defpackage.cmw cmwVar5 = cmwVar3;
                        int i18 = i | 1;
                        int i19 = 306783378 & i18;
                        int i110 = 613566756 & i18;
                        defpackage.den.bz(z3, cmwVar5, agfVar3, aggVar3, str2, aonoVar, cavVar2, (i18 & (-920350135)) | i19 | (i110 >> 1) | ((i19 << 1) & i110), i2);
                        return defpackage.aojh.a;
                    }
                };
            }
        }
        i3 |= 384;
        agfVar2 = agfVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                aggVar2 = aggVar;
                if (true != cavVarB.B(aggVar2)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i9 = 65536;
                } else {
                    i9 = 131072;
                }
                i8 |= i9;
            }
            if (cavVarB.H((74899 & i8) != 74898, i8 & 1)) {
                if (i11 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
                } else {
                    agfVarA = agfVar2;
                }
                if (i6 != 0) {
                    aggVarA = defpackage.aga.l(null, null, 15).a(defpackage.aga.o(null, 3));
                } else {
                    aggVarA = aggVar2;
                }
                defpackage.alg algVarD7 = defpackage.alk.d(java.lang.Boolean.valueOf(z2), cavVarB, (i8 & 14) | ((i8 >> 9) & 112));
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.nq(5);
                    cbtVar.ab(objR);
                }
                int i18 = i8 << 3;
                bB(algVarD7, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i18 & 896) | 48 | (i18 & 7168) | (57344 & i18) | (i18 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cmwVar3 = cmwVar4;
                agfVar3 = agfVarA;
                aggVar3 = aggVarA;
            } else {
                cavVarB.s();
                str2 = str;
                cmwVar3 = cmwVar2;
                agfVar3 = agfVar2;
                aggVar3 = aggVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.aonn() { // from class: aez
                    @Override // defpackage.aonn
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.cav cavVar2 = (defpackage.cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        boolean z3 = z;
                        defpackage.cmw cmwVar5 = cmwVar3;
                        int i19 = i | 1;
                        int i110 = 306783378 & i19;
                        int i111 = 613566756 & i19;
                        defpackage.den.bz(z3, cmwVar5, agfVar3, aggVar3, str2, aonoVar, cavVar2, (i19 & (-920350135)) | i110 | (i111 >> 1) | ((i110 << 1) & i111), i2);
                        return defpackage.aojh.a;
                    }
                };
            }
        }
        i3 |= 3072;
        aggVar2 = aggVar;
        i8 = i3 | 24576;
        if ((196608 & i) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i9 = 65536;
            } else {
                i9 = 131072;
            }
            i8 |= i9;
        }
        if (cavVarB.H((74899 & i8) != 74898, i8 & 1)) {
            if (i11 != 0) {
                cmwVar4 = defpackage.cmw.c;
            } else {
                cmwVar4 = cmwVar2;
            }
            if (i4 != 0) {
                agfVarA = defpackage.aga.n(null, 3).a(defpackage.aga.h(null, null, null, 15));
            } else {
                agfVarA = agfVar2;
            }
            if (i6 != 0) {
                aggVarA = defpackage.aga.l(null, null, 15).a(defpackage.aga.o(null, 3));
            } else {
                aggVarA = aggVar2;
            }
            defpackage.alg algVarD8 = defpackage.alk.d(java.lang.Boolean.valueOf(z2), cavVarB, (i8 & 14) | ((i8 >> 9) & 112));
            cbtVar = (defpackage.cbt) cavVarB;
            objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.nq(5);
                cbtVar.ab(objR);
            }
            int i19 = i8 << 3;
            bB(algVarD8, (defpackage.aonj) objR, cmwVar4, agfVarA, aggVarA, aonoVar, cavVarB, (i19 & 896) | 48 | (i19 & 7168) | (57344 & i19) | (i19 & 3670016), 32);
            str2 = "AnimatedVisibility";
            cmwVar3 = cmwVar4;
            agfVar3 = agfVarA;
            aggVar3 = aggVarA;
        } else {
            cavVarB.s();
            str2 = str;
            cmwVar3 = cmwVar2;
            agfVar3 = agfVar2;
            aggVar3 = aggVar2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: aez
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.cav cavVar2 = (defpackage.cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    boolean z3 = z;
                    defpackage.cmw cmwVar5 = cmwVar3;
                    int i110 = i | 1;
                    int i111 = 306783378 & i110;
                    int i112 = 613566756 & i110;
                    defpackage.den.bz(z3, cmwVar5, agfVar3, aggVar3, str2, aonoVar, cavVar2, (i110 & (-920350135)) | i111 | (i112 >> 1) | ((i111 << 1) & i112), i2);
                    return defpackage.aojh.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.cmw ca(defpackage.cmw cmwVar, defpackage.kaw kawVar, defpackage.ans ansVar, boolean z, defpackage.dib dibVar, defpackage.aomy aomyVar) {
        defpackage.cmw cmwVarA;
        if (ansVar instanceof defpackage.any) {
            cmwVarA = new defpackage.amw(kawVar, ansVar, false, z, null, dibVar, aomyVar);
        } else if (ansVar == 0) {
            cmwVarA = new defpackage.amw(kawVar, null, false, z, null, dibVar, aomyVar);
        } else {
            cmwVarA = kawVar != null ? defpackage.anu.a(defpackage.cmw.c, kawVar, ansVar).a(new defpackage.amw(kawVar, null, false, z, null, dibVar, aomyVar)) : new defpackage.cmr(new amx(ansVar, z, dibVar, aomyVar));
        }
        return cmwVar.a(cmwVarA);
    }

    public static float cb(defpackage.kaw kawVar, float f) {
        return ((defpackage.ais) kawVar.ay().a(new defpackage.ais(0.0f), new defpackage.ais(f))).a;
    }

    public static java.util.List cc(defpackage.den denVar, int i, int i2, java.util.List list, defpackage.acm acmVar, int i3, int i4, int i5, boolean z, defpackage.aonj aonjVar) {
        int i6;
        defpackage.acm acmVarA;
        int i7;
        java.lang.Object obj;
        if (denVar == null || list.isEmpty() || (i6 = acmVar.b) == 0) {
            return defpackage.aokc.a;
        }
        int i8 = -1;
        int i9 = 0;
        if (i2 - i < 0 || i6 == 0) {
            acmVarA = defpackage.acn.a;
        } else {
            defpackage.aopq aopqVarC = defpackage.aooc.C(0, i6);
            int i10 = aopqVarC.a;
            int i11 = aopqVarC.b;
            int iA = -1;
            if (i10 <= i11) {
                while (acmVar.a(i10) <= i) {
                    iA = acmVar.a(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
            }
            acmVarA = iA == -1 ? defpackage.acn.a : defpackage.acn.a(iA);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            java.lang.Object obj2 = list.get(i12);
            int iC = ((defpackage.bef) obj2).c();
            int[] iArr = acmVar.a;
            int i13 = acmVar.b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (iArr[i14] == iC) {
                    arrayList2.add(obj2);
                    break;
                }
            }
        }
        int[] iArr2 = acmVarA.a;
        int i15 = acmVarA.b;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            java.util.Iterator it = list.iterator();
            int i18 = i9;
            while (true) {
                if (!it.hasNext()) {
                    i18 = i8;
                    break;
                }
                if (((defpackage.bef) it.next()).c() == i17) {
                    break;
                }
                i18++;
            }
            defpackage.bef befVar = i18 == i8 ? (defpackage.bef) aonjVar.a(java.lang.Integer.valueOf(i17)) : (defpackage.bef) list.remove(i18);
            int iA2 = defpackage.beh.a(befVar, z);
            int iAA = i18 == i8 ? Integer.MIN_VALUE : aA(befVar, z);
            int iMin = -i3;
            int size2 = arrayList2.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size2) {
                    i7 = i15;
                    obj = null;
                    break;
                }
                obj = arrayList2.get(i19);
                i7 = i15;
                if (((defpackage.bef) obj).c() != i17) {
                    break;
                }
                i19++;
                i15 = i7;
            }
            defpackage.bef befVar2 = (defpackage.bef) obj;
            int iAA2 = befVar2 != null ? aA(befVar2, z) : Integer.MIN_VALUE;
            if (iAA != Integer.MIN_VALUE) {
                iMin = java.lang.Math.max(iMin, iAA);
            }
            if (iAA2 != Integer.MIN_VALUE) {
                iMin = java.lang.Math.min(iMin, iAA2 - iA2);
            }
            befVar.m();
            befVar.p(iMin, 0, i4, i5);
            arrayList.add(befVar);
            i16++;
            i15 = i7;
            i9 = 0;
            i8 = -1;
        }
        return arrayList;
    }

    public static void cd(final defpackage.alg algVar, final defpackage.aonj aonjVar, final defpackage.cmw cmwVar, final defpackage.agf agfVar, final defpackage.agg aggVar, final defpackage.aonn aonnVar, defpackage.den denVar, boolean z, final defpackage.aono aonoVar, defpackage.cav cavVar, final int i, final int i2) {
        int i3;
        defpackage.agf agfVar2;
        defpackage.cav cavVar2;
        final defpackage.den denVar2;
        final boolean z2;
        boolean z3;
        boolean z4;
        defpackage.afr afrVarBC;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(978633943);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(algVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            agfVar2 = agfVar;
            i3 |= true != cavVarB.B(agfVar2) ? 1024 : 2048;
        } else {
            agfVar2 = agfVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.B(aggVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 65536 : 131072;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= true != ((2097152 & i) == 0 ? cavVarB.B(null) : cavVarB.D(null)) ? 524288 : 1048576;
        }
        int i5 = i2 & 128;
        int i6 = 12582912;
        if (i5 != 0) {
            i3 |= i6;
        } else if ((12582912 & i) == 0) {
            i6 = true != ((16777216 & i) == 0 ? cavVarB.B(denVar) : cavVarB.D(denVar)) ? 4194304 : 8388608;
            i3 |= i6;
        }
        int i7 = i2 & 256;
        boolean z5 = i7 == 0;
        if (i7 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= true != cavVarB.C(z) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        if (cavVarB.H((306783379 & i3) != 306783378, i3 & 1)) {
            defpackage.den denVar3 = i5 != 0 ? null : denVar;
            boolean z6 = z5 & z;
            java.lang.Object objG = algVar.g();
            if (z6 || ((java.lang.Boolean) aonjVar.a(algVar.h())).booleanValue() || ((java.lang.Boolean) aonjVar.a(algVar.f())).booleanValue() || ((objG != null && ((java.lang.Boolean) aonjVar.a(objG)).booleanValue()) || algVar.C() || algVar.A())) {
                cavVarB.u(246688241);
                int i8 = (i3 & 14) | 48;
                int i9 = i8 & 14;
                boolean z7 = ((i9 ^ 6) > 4 && cavVarB.B(algVar)) || (i8 & 6) == 4;
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (z7 || objR == defpackage.cau.a) {
                    objR = algVar.f();
                    cbtVar.ab(objR);
                }
                if (algVar.C()) {
                    objR = algVar.f();
                }
                cavVarB.u(-1260162954);
                defpackage.afr afrVarBC2 = bC(algVar, aonjVar, objR, cavVarB);
                cbtVar.W(false);
                java.lang.Object objH = algVar.h();
                cavVarB.u(-1260162954);
                defpackage.afr afrVarBC3 = bC(algVar, aonjVar, objH, cavVarB);
                cbtVar.W(false);
                defpackage.alg algVarB = defpackage.alk.b(algVar, afrVarBC2, afrVarBC3, cavVarB, i9 | 3072);
                if (algVar.C()) {
                    cavVarB.u(782538635);
                    cbtVar.W(false);
                } else {
                    cavVarB.u(782386797);
                    java.lang.Object objG2 = algVar.g();
                    if (objG2 == null) {
                        cavVarB.u(782437481);
                        z4 = false;
                        cbtVar.W(false);
                        afrVarBC = null;
                    } else {
                        z4 = false;
                        cavVarB.u(782437482);
                        cavVarB.u(-1260162954);
                        afrVarBC = bC(algVar, aonjVar, objG2, cavVarB);
                        cbtVar.W(false);
                        cbtVar.W(false);
                    }
                    algVarB.y(afrVarBC);
                    cbtVar.W(z4);
                }
                defpackage.izg izgVarS = defpackage.aga.s(algVarB, agfVar2, aggVar, denVar3, cavVarB, ((i3 >> 6) & 1008) | 4096 | ((i3 >> 12) & 7168), 0);
                cavVar2 = cavVarB;
                boolean zB = cavVar2.B(algVarB) | ((i3 & 458752) == 131072);
                java.lang.Object objR2 = cbtVar.R();
                if (zB || objR2 == defpackage.cau.a) {
                    ny nyVar = new ny(algVarB, aonnVar, 2);
                    defpackage.ajxw ajxwVar = defpackage.ceo.a;
                    defpackage.cbk cbkVar = new defpackage.cbk(nyVar, null);
                    cbtVar.ab(cbkVar);
                    objR2 = cbkVar;
                }
                defpackage.cer cerVar = (defpackage.cer) objR2;
                if (bA(algVarB) && ((java.lang.Boolean) cerVar.a()).booleanValue()) {
                    cavVar2.u(249444203);
                    z3 = false;
                    cbtVar.W(false);
                } else {
                    cavVar2.u(248120906);
                    boolean zB2 = cavVar2.B(algVarB);
                    java.lang.Object objR3 = cbtVar.R();
                    if (zB2 || objR3 == defpackage.cau.a) {
                        objR3 = new defpackage.aff(algVarB);
                        cbtVar.ab(objR3);
                    }
                    defpackage.aff affVar = (defpackage.aff) objR3;
                    defpackage.cmw cmwVarR = defpackage.aga.r(algVarB, izgVarS, "Built-in", cavVar2, 3136);
                    cavVar2.u(-130506145);
                    cbtVar.W(false);
                    defpackage.cmw cmwVarA = cmwVar.a(cmwVarR.a(defpackage.cmw.c));
                    java.lang.Object objR4 = cbtVar.R();
                    if (objR4 == defpackage.cau.a) {
                        objR4 = new defpackage.aey(affVar);
                        cbtVar.ab(objR4);
                    }
                    defpackage.aey aeyVar = (defpackage.aey) objR4;
                    long j = cbtVar.x;
                    long j2 = j ^ (j >>> 32);
                    defpackage.cje cjeVarAi = cbtVar.ai();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar2, cmwVarA);
                    defpackage.aomy aomyVar = defpackage.dam.a;
                    cavVar2.v();
                    if (cbtVar.w) {
                        cavVar2.j(aomyVar);
                    } else {
                        cavVar2.x();
                    }
                    defpackage.cev.c(cavVar2, aeyVar, defpackage.dam.e);
                    defpackage.cev.c(cavVar2, cjeVarAi, defpackage.dam.d);
                    defpackage.cev.c(cavVar2, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
                    cavVar2.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar2, cmwVarM, defpackage.dam.c);
                    aonoVar.a(affVar, cavVar2, java.lang.Integer.valueOf((i3 >> 24) & 112));
                    cbtVar.W(true);
                    z3 = false;
                    cbtVar.W(false);
                }
                cbtVar.W(z3);
            } else {
                cavVarB.u(249450155);
                ((defpackage.cbt) cavVarB).W(false);
                cavVar2 = cavVarB;
            }
            z2 = z6;
            denVar2 = denVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            denVar2 = denVar;
            z2 = z;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: afb
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.alg algVar2 = algVar;
                    defpackage.aonj aonjVar2 = aonjVar;
                    defpackage.cmw cmwVar2 = cmwVar;
                    defpackage.agf agfVar3 = agfVar;
                    defpackage.agg aggVar2 = aggVar;
                    int i10 = i;
                    int i11 = i10 | 1;
                    int i12 = 306783378 & i11;
                    boolean z8 = z2;
                    int i13 = 613566756 & i11;
                    defpackage.aono aonoVar2 = aonoVar;
                    defpackage.den.cd(algVar2, aonjVar2, cmwVar2, agfVar3, aggVar2, aonnVar, denVar2, z8, aonoVar2, (defpackage.cav) obj, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 << 1) & i13), i2);
                    return defpackage.aojh.a;
                }
            };
        }
    }

    public static defpackage.ck ce(android.view.ViewGroup viewGroup, defpackage.den denVar) {
        if (viewGroup == null) {
            defpackage.aooh.i("container");
        }
        if (denVar == null) {
            defpackage.aooh.i("factory");
        }
        java.lang.Object tag = viewGroup.getTag(2131429001);
        if (tag instanceof defpackage.ck) {
            return (defpackage.ck) tag;
        }
        if (viewGroup == null) {
            defpackage.aooh.i("container");
        }
        defpackage.ck ckVar = new defpackage.ck(viewGroup);
        viewGroup.setTag(2131429001, ckVar);
        return ckVar;
    }

    private static defpackage.cmw h(defpackage.cmw cmwVar, defpackage.dji djiVar, defpackage.dkz dkzVar, defpackage.aonj aonjVar, int i, boolean z, int i2, int i3, defpackage.gat gatVar, defpackage.dnx dnxVar, java.util.List list, defpackage.aonj aonjVar2, bjf bjfVar, defpackage.aonj aonjVar3) {
        if (bjfVar == null) {
            return cmwVar.a(defpackage.cmw.c).a(new defpackage.bjl(djiVar, dkzVar, gatVar, dnxVar, aonjVar, i, z, i2, i3, list, aonjVar2, aonjVar3));
        }
        return cmwVar.a(bjfVar.d).a(new bjd(djiVar, dkzVar, gatVar, dnxVar, aonjVar, i, z, i2, i3, list, aonjVar2, bjfVar));
    }

    public static boolean m(android.view.View view, android.view.View view2) {
        if (defpackage.aooh.n(view2, view)) {
            return false;
        }
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [aonj] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [cmv] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [cmv] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static void n(defpackage.ddh ddhVar, defpackage.aonj aonjVar) {
        defpackage.dce dceVar;
        if (!ddhVar.L().D) {
            defpackage.cwh.d("visitAncestors called on an unattached node");
        }
        defpackage.cmv cmvVar = ddhVar.L().w;
        defpackage.dbk dbkVarA = defpackage.cfo.A(ddhVar);
        while (dbkVarA != null) {
            if ((dbkVarA.v.f.v & 262144) != 0) {
                while (cmvVar != null) {
                    if ((cmvVar.u & 262144) != 0) {
                        ?? X = cmvVar;
                        ?? cfcVar = 0;
                        while (X != 0) {
                            if (X instanceof defpackage.ddh) {
                                defpackage.ddh ddhVar2 = (defpackage.ddh) X;
                                if (defpackage.aooh.n(ddhVar.db(), ddhVar2.db()) && defpackage.cfo.o(ddhVar, ddhVar2) && !((java.lang.Boolean) aonjVar.a(ddhVar2)).booleanValue()) {
                                    return;
                                }
                            } else if ((X.u & 262144) != 0 && (X instanceof defpackage.dap)) {
                                defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                                int i = 0;
                                X = X;
                                cfcVar = cfcVar;
                                while (cmvVar2 != null) {
                                    if ((cmvVar2.u & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cfcVar = cfcVar;
                                            X = cmvVar2;
                                        } else {
                                            if (cfcVar == 0) {
                                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (X != 0) {
                                                cfcVar.n(X);
                                            }
                                            cfcVar.n(cmvVar2);
                                            X = 0;
                                        }
                                    }
                                    cmvVar2 = cmvVar2.x;
                                    X = X;
                                    cfcVar = cfcVar;
                                }
                                if (i != 1) {
                                }
                            }
                            X = defpackage.cfo.x(cfcVar);
                        }
                    }
                    cmvVar = cmvVar.w;
                }
            }
            dbkVarA = dbkVarA.k();
            cmvVar = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [aonj] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static void o(defpackage.dao daoVar, java.lang.Object obj, defpackage.aonj aonjVar) {
        defpackage.dce dceVar;
        if (!daoVar.L().D) {
            defpackage.cwh.d("visitAncestors called on an unattached node");
        }
        defpackage.cmv cmvVar = daoVar.L().w;
        defpackage.dbk dbkVarA = defpackage.cfo.A(daoVar);
        while (dbkVarA != null) {
            if ((dbkVarA.v.f.v & 262144) != 0) {
                while (cmvVar != null) {
                    if ((cmvVar.u & 262144) != 0) {
                        ?? X = cmvVar;
                        ?? cfcVar = 0;
                        while (X != 0) {
                            if (X instanceof defpackage.ddh) {
                                defpackage.ddh ddhVar = (defpackage.ddh) X;
                                if (defpackage.aooh.n(obj, ddhVar.db()) && !((java.lang.Boolean) aonjVar.a(ddhVar)).booleanValue()) {
                                    return;
                                }
                            } else if ((X.u & 262144) != 0 && (X instanceof defpackage.dap)) {
                                defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                                int i = 0;
                                X = X;
                                cfcVar = cfcVar;
                                while (cmvVar2 != null) {
                                    if ((cmvVar2.u & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cfcVar = cfcVar;
                                            X = cmvVar2;
                                        } else {
                                            if (cfcVar == 0) {
                                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (X != 0) {
                                                cfcVar.n(X);
                                            }
                                            cfcVar.n(cmvVar2);
                                            X = 0;
                                        }
                                    }
                                    cmvVar2 = cmvVar2.x;
                                    X = X;
                                    cfcVar = cfcVar;
                                }
                                if (i != 1) {
                                }
                            }
                            X = defpackage.cfo.x(cfcVar);
                        }
                    }
                    cmvVar = cmvVar.w;
                }
            }
            dbkVarA = dbkVarA.k();
            cmvVar = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [aonj] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [cmv] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static void p(defpackage.ddh ddhVar, defpackage.aonj aonjVar) {
        if (!ddhVar.L().D) {
            defpackage.cwh.d("visitSubtreeIf called on an unattached node");
        }
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
        defpackage.cmv cmvVar = ddhVar.L().x;
        if (cmvVar == null) {
            defpackage.cfo.F(cfcVar, ddhVar.L());
        } else {
            cfcVar.n(cmvVar);
        }
        while (true) {
            int i = cfcVar.b;
            if (i == 0) {
                return;
            }
            defpackage.cmv cmvVar2 = (defpackage.cmv) cfcVar.c(i - 1);
            if ((cmvVar2.v & 262144) != 0) {
                defpackage.cmv cmvVar3 = cmvVar2;
                while (true) {
                    if (cmvVar3 != null && cmvVar3.D) {
                        if ((cmvVar3.u & 262144) != 0) {
                            ?? X = cmvVar3;
                            ?? cfcVar2 = 0;
                            while (X != 0) {
                                if (X instanceof defpackage.ddh) {
                                    defpackage.ddh ddhVar2 = (defpackage.ddh) X;
                                    ddg ddgVar = (defpackage.aooh.n(ddhVar.db(), ddhVar2.db()) && defpackage.cfo.o(ddhVar, ddhVar2)) ? (ddg) aonjVar.a(ddhVar2) : ddg.a;
                                    if (ddgVar == ddg.c) {
                                        return;
                                    }
                                    if (ddgVar == ddg.b) {
                                        break;
                                    }
                                } else if ((X.u & 262144) != 0 && (X instanceof defpackage.dap)) {
                                    defpackage.cmv cmvVar4 = ((defpackage.dap) X).F;
                                    int i2 = 0;
                                    X = X;
                                    cfcVar2 = cfcVar2;
                                    while (cmvVar4 != null) {
                                        if ((cmvVar4.u & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cfcVar2 = cfcVar2;
                                                X = cmvVar4;
                                            } else {
                                                if (cfcVar2 == 0) {
                                                    cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                                                }
                                                if (X != 0) {
                                                    cfcVar2.n(X);
                                                }
                                                cfcVar2.n(cmvVar4);
                                                X = 0;
                                            }
                                        }
                                        cmvVar4 = cmvVar4.x;
                                        X = X;
                                        cfcVar2 = cfcVar2;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                X = defpackage.cfo.x(cfcVar2);
                            }
                        }
                        cmvVar3 = cmvVar3.x;
                    }
                }
            }
            defpackage.cfo.F(cfcVar, cmvVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [aonj] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [cmv] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static void q(defpackage.dao daoVar, java.lang.Object obj, defpackage.aonj aonjVar) {
        if (!daoVar.L().D) {
            defpackage.cwh.d("visitSubtreeIf called on an unattached node");
        }
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
        defpackage.cmv cmvVar = daoVar.L().x;
        if (cmvVar == null) {
            defpackage.cfo.F(cfcVar, daoVar.L());
        } else {
            cfcVar.n(cmvVar);
        }
        while (true) {
            int i = cfcVar.b;
            if (i == 0) {
                return;
            }
            defpackage.cmv cmvVar2 = (defpackage.cmv) cfcVar.c(i - 1);
            if ((cmvVar2.v & 262144) != 0) {
                defpackage.cmv cmvVar3 = cmvVar2;
                while (true) {
                    if (cmvVar3 != null && cmvVar3.D) {
                        if ((cmvVar3.u & 262144) != 0) {
                            ?? X = cmvVar3;
                            ?? cfcVar2 = 0;
                            while (X != 0) {
                                if (X instanceof defpackage.ddh) {
                                    defpackage.ddh ddhVar = (defpackage.ddh) X;
                                    ddg ddgVar = defpackage.aooh.n(obj, ddhVar.db()) ? (ddg) aonjVar.a(ddhVar) : ddg.a;
                                    if (ddgVar == ddg.c) {
                                        return;
                                    }
                                    if (ddgVar == ddg.b) {
                                        break;
                                    }
                                } else if ((X.u & 262144) != 0 && (X instanceof defpackage.dap)) {
                                    defpackage.cmv cmvVar4 = ((defpackage.dap) X).F;
                                    int i2 = 0;
                                    X = X;
                                    cfcVar2 = cfcVar2;
                                    while (cmvVar4 != null) {
                                        if ((cmvVar4.u & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cfcVar2 = cfcVar2;
                                                X = cmvVar4;
                                            } else {
                                                if (cfcVar2 == 0) {
                                                    cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                                                }
                                                if (X != 0) {
                                                    cfcVar2.n(X);
                                                }
                                                cfcVar2.n(cmvVar4);
                                                X = 0;
                                            }
                                        }
                                        cmvVar4 = cmvVar4.x;
                                        X = X;
                                        cfcVar2 = cfcVar2;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                X = defpackage.cfo.x(cfcVar2);
                            }
                        }
                        cmvVar3 = cmvVar3.x;
                    }
                }
            }
            defpackage.cfo.F(cfcVar, cmvVar2);
        }
    }

    public static defpackage.cpn r(defpackage.cmv cmvVar, boolean z, boolean z2, boolean z3) {
        if (!cmvVar.t.D) {
            return defpackage.cpn.a;
        }
        if (z) {
            return defpackage.cfo.B(cmvVar, 8).af(z3);
        }
        defpackage.dck dckVarB = defpackage.cfo.B(cmvVar, 8);
        return G(dckVarB).q(dckVarB, z2);
    }

    public static void s(defpackage.ddc ddcVar) {
        defpackage.cfo.A(ddcVar).I();
    }

    public static boolean t(defpackage.die dieVar) {
        return dieVar.g(defpackage.did.b) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(defpackage.cmv cmvVar, defpackage.aomy aomyVar) {
        defpackage.dcq dcqVar = cmvVar.y;
        if (dcqVar == null) {
            dcqVar = new defpackage.dcq((defpackage.dcp) cmvVar);
            cmvVar.y = dcqVar;
        }
        defpackage.dcy dcyVar = ((defpackage.deg) defpackage.cfo.C(cmvVar)).u;
        dcyVar.a.c(dcqVar, defpackage.dcq.a, aomyVar);
    }

    public static android.text.StaticLayout v(defpackage.dli dliVar) {
        android.text.StaticLayout.Builder builderObtain = android.text.StaticLayout.Builder.obtain(dliVar.a, 0, dliVar.b, dliVar.c, dliVar.d);
        builderObtain.setTextDirection(dliVar.e);
        builderObtain.setAlignment(dliVar.f);
        builderObtain.setMaxLines(dliVar.g);
        builderObtain.setEllipsize(dliVar.h);
        builderObtain.setEllipsizedWidth(dliVar.i);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(dliVar.k);
        builderObtain.setBreakStrategy(dliVar.l);
        builderObtain.setHyphenationFrequency(dliVar.o);
        builderObtain.setIndents(null, null);
        da$.ExternalSyntheticApiModelOutline1.m(builderObtain, dliVar.j);
        ft$.ExternalSyntheticApiModelOutline0.m(builderObtain, true);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            int i = dliVar.m;
            ae$.ExternalSyntheticApiModelOutline0.m(builderObtain, ae$.ExternalSyntheticApiModelOutline0.m(ae$.ExternalSyntheticApiModelOutline0.m$1(ae$.ExternalSyntheticApiModelOutline0.m(new android.graphics.text.LineBreakConfig.Builder(), i), dliVar.n)));
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            mp$.ExternalSyntheticApiModelOutline1.m(builderObtain, false);
        }
        return builderObtain.build();
    }

    public static boolean w(android.text.Spanned spanned, java.lang.Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static defpackage.cmw x(defpackage.cmw cmwVar, java.lang.String str) {
        return cmwVar.a(new defpackage.dgg(str));
    }

    public static defpackage.cyf y(defpackage.cyi cyiVar, int i, int i2, defpackage.aonj aonjVar, defpackage.aonn aonnVar, java.util.Map map, defpackage.aonj aonjVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.cwh.d(defpackage.a.bA(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new cyh(i, i2, map, aonjVar, aonnVar, cyiVar, aonjVar2);
    }

    public static /* synthetic */ defpackage.cyf z(defpackage.cyi cyiVar, int i, int i2, defpackage.aonj aonjVar) {
        return cyiVar.du(i, i2, defpackage.aokd.a, aonjVar);
    }

    public android.widget.EdgeEffect cg(android.support.v7.widget.RecyclerView recyclerView) {
        throw null;
    }

    public void ci(int i, int i2, java.lang.Object obj) {
        bL(i, i2);
    }

    public den(short[] sArr) {
    }

    public den() {
    }

    public void ch() {
    }

    public void e() {
    }

    public void bL(int i, int i2) {
    }

    public void cj(int i, int i2) {
    }

    public void d(int i, int i2) {
    }

    public void g(int i, int i2) {
    }
}
