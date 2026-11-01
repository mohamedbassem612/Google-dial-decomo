package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cdh {
    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void c(defpackage.cfp cfpVar, java.util.List list, defpackage.cdl cdlVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = cfpVar.a((defpackage.cfh) list.get(i));
            int iN = cfpVar.n(cfpVar.b, cfpVar.h(iA));
            java.lang.Object obj = iN < cfpVar.d(cfpVar.b, cfpVar.h(iA + 1)) ? cfpVar.c[cfpVar.e(iN)] : defpackage.cau.a;
            defpackage.cdk cdkVar = obj instanceof defpackage.cdk ? (defpackage.cdk) obj : null;
            if (cdkVar != null) {
                cdkVar.a = cdlVar;
            }
        }
    }

    public static final defpackage.cci d(defpackage.aolr aolrVar) {
        defpackage.cci cciVar = (defpackage.cci) aolrVar.get(defpackage.cci.a);
        if (cciVar != null) {
            return cciVar;
        }
        throw new java.lang.IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final java.lang.Object e(defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return d(aolnVar.u()).a(new aib(aonjVar, 3), aolnVar);
    }

    public static final java.lang.Object f(defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return d(aolnVar.u()).a(aonjVar, aolnVar);
    }

    public static final defpackage.cer g(java.lang.Object obj, defpackage.cav cavVar) {
        java.lang.Object objG = cavVar.g();
        if (objG == defpackage.cau.a) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, defpackage.cdu.c);
            cavVar.w(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.ccp ccpVar = (defpackage.ccp) objG;
        ccpVar.b(obj);
        return ccpVar;
    }

    public static final defpackage.cer h(defpackage.aozh aozhVar, defpackage.aolr aolrVar, defpackage.cen cenVar, defpackage.cav cavVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            aolrVar = defpackage.aols.a;
        }
        if ((i2 & 2) != 0) {
            cenVar = defpackage.cdu.c;
        }
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (objR == defpackage.cau.a) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(aozhVar.c(), cenVar);
            cbtVar.ab(parcelableSnapshotMutableState);
            objR = parcelableSnapshotMutableState;
        }
        defpackage.ccp ccpVar = (defpackage.ccp) objR;
        i(aozhVar, ccpVar, aolrVar, cavVar, (i & 14) | 48);
        return ccpVar;
    }

    public static final void i(defpackage.aoxh aoxhVar, defpackage.ccp ccpVar, defpackage.aolr aolrVar, defpackage.cav cavVar, int i) {
        defpackage.aoxh aoxhVar2;
        defpackage.aolr aolrVar2;
        int i2 = (i & 14) ^ 6;
        boolean zD = cavVar.D(aolrVar);
        boolean z = true;
        if ((i2 <= 4 || !cavVar.D(aoxhVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zD | z;
        java.lang.Object objG = cavVar.g();
        if (z2 || objG == defpackage.cau.a) {
            aoxhVar2 = aoxhVar;
            aolrVar2 = aolrVar;
            amh amhVar = new amh(aolrVar2, aoxhVar2, ccpVar, (defpackage.aoln) null, 15);
            cavVar.w(amhVar);
            objG = amhVar;
        } else {
            aoxhVar2 = aoxhVar;
            aolrVar2 = aolrVar;
        }
        defpackage.cbp.f(aoxhVar2, aolrVar2, (defpackage.aonn) objG, cavVar);
    }

    public static final defpackage.aoxh k(defpackage.aomy aomyVar) {
        return new defpackage.aowy(new defpackage.ceq(aomyVar, null));
    }

    public static final void l(defpackage.cdh cdhVar) {
        defpackage.aozj aozjVar;
        defpackage.cir cirVar;
        defpackage.cir cirVar2;
        do {
            aozjVar = defpackage.cds.j;
            cirVar = (defpackage.cir) aozjVar.c();
            defpackage.cic cicVarC = cirVar.d;
            defpackage.nf nfVar = (defpackage.nf) cicVarC.get(cdhVar);
            if (nfVar == null) {
                cirVar2 = cirVar;
            } else {
                defpackage.cil cilVar = cicVarC.b;
                defpackage.cil cilVarJ = cilVar.j(cdhVar != null ? cdhVar.hashCode() : 0, cdhVar, 0);
                if (cilVar != cilVarJ) {
                    cicVarC = cilVarJ == null ? defpackage.cic.a : new defpackage.cic(cilVarJ, cicVarC.b() - 1);
                }
                if (nfVar.K()) {
                    java.lang.Object obj = nfVar.a;
                    java.lang.Object obj2 = cicVarC.get(obj);
                    defpackage.aooh.c(obj2);
                    cicVarC = cicVarC.c(obj, ((defpackage.nf) obj2).R(nfVar.b));
                }
                if (nfVar.J()) {
                    java.lang.Object obj3 = nfVar.b;
                    java.lang.Object obj4 = cicVarC.get(obj3);
                    defpackage.aooh.c(obj4);
                    cicVarC = cicVarC.c(obj3, new defpackage.nf(nfVar.a, ((defpackage.nf) obj4).b));
                }
                cirVar2 = new defpackage.cir(!nfVar.K() ? nfVar.b : cirVar.b, !nfVar.J() ? nfVar.a : cirVar.c, cicVarC);
            }
            if (cirVar == cirVar2) {
                return;
            }
        } while (!aozjVar.f(cirVar, cirVar2));
    }

    public static final int m(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (java.lang.Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return java.lang.Float.isNaN(f2) ? 0 : 1;
    }

    public static final android.graphics.Paint n(defpackage.cpv cpvVar) {
        if (!(cpvVar instanceof defpackage.cpv)) {
            java.lang.Class<?> cls = cpvVar.getClass();
            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
            defpackage.cqp.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received ".concat(java.lang.String.valueOf(new defpackage.aooa(cls).b())));
        }
        return cpvVar.a;
    }

    public static final void o(android.graphics.Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final long p(long j) {
        int i;
        float[] fArr = defpackage.crp.a;
        defpackage.csb csbVar = defpackage.crp.u;
        int i2 = csbVar.c;
        long j2 = 63 & j;
        int i3 = (int) j2;
        if (i3 == i2 || i3 == (i = defpackage.crp.x.c) || i3 == defpackage.crp.s.c || i3 == defpackage.crp.t.c) {
            return defpackage.cqg.e(j, defpackage.crp.e);
        }
        if (j == defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, csbVar)) {
            return 0L;
        }
        if (i3 > 15) {
            return (i3 == i2 || ((i3 == defpackage.crp.v.c || i3 == defpackage.crp.w.c) && android.os.Build.VERSION.SDK_INT < 34) || (i3 == i && android.os.Build.VERSION.SDK_INT < 36)) ? defpackage.cqg.e(j, defpackage.crp.e) : (j & (-64)) | (j2 - 1);
        }
        return j;
    }

    public static final long q(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final defpackage.cpo r(float f, float f2, float f3, float f4, float f5, float f6) {
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(f5)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f6)) & 4294967295L);
        return new defpackage.cpo(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final defpackage.cpo s(defpackage.cpn cpnVar, long j, long j2, long j3, long j4) {
        return new defpackage.cpo(cpnVar.b, cpnVar.c, cpnVar.d, cpnVar.e, j, j2, j3, j4);
    }

    public static final defpackage.cpo t(float f, float f2, float f3, float f4, long j) {
        return r(f, f2, f3, f4, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)));
    }

    public static final boolean u(defpackage.cpo cpoVar) {
        long j = cpoVar.e;
        return (j >>> 32) == (4294967295L & j) && j == cpoVar.f && j == cpoVar.g && j == cpoVar.h;
    }

    public static final defpackage.cpn v(long j, long j2) {
        return new defpackage.cpn(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final defpackage.cpn w(long j, float f) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new defpackage.cpn(java.lang.Float.intBitsToFloat(i) - f, java.lang.Float.intBitsToFloat(i2) - f, java.lang.Float.intBitsToFloat(i) + f, java.lang.Float.intBitsToFloat(i2) + f);
    }

    public static final defpackage.cpn x(long j, long j2) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        return new defpackage.cpn(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final defpackage.cpn y(defpackage.cpl cplVar) {
        return new defpackage.cpn(cplVar.a, cplVar.b, cplVar.c, cplVar.d);
    }
}
