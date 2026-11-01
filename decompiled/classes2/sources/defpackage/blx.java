package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blx {
    public static final cpn a = new cpn(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final long a(defpackage.blw blwVar, long j, defpackage.bkn bknVar) {
        cxi cxiVar;
        cxi cxiVarG;
        int i;
        dkw dkwVar;
        int iD;
        long jE;
        float lineRight;
        float fS;
        dkw dkwVar2;
        int iE;
        float fA;
        dkw dkwVar3;
        int iE2;
        defpackage.bke bkeVarE = blwVar.E(bknVar);
        if (bkeVarE != null && (cxiVar = blwVar.f) != null && (cxiVarG = bkeVarE.g()) != null && (i = bknVar.a) <= bkeVarE.c()) {
            cpm cpmVarD = blwVar.d();
            aooh.c(cpmVarD);
            long jI = cxiVarG.i(cxiVar, cpmVarD.a) >> 32;
            aomy aomyVar = bkeVarE.b;
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) jI);
            java.lang.Object objA = aomyVar.a();
            if (objA != null && (iD = bkeVarE.d((dkwVar = (dkw) objA))) > 0) {
                int iE3 = dkwVar.e(aooc.w(i, 0, iD - 1));
                jE = dfd.e(dkwVar.g(iE3), dkwVar.d(iE3, true));
                long j2 = dky.a;
            } else {
                jE = dky.a;
            }
            if (dky.f(jE)) {
                fS = bkeVarE.b(i);
            } else {
                float fB = bkeVarE.b(dky.d(jE));
                int iA = dky.a(jE) - 1;
                java.lang.Object objA2 = aomyVar.a();
                if (objA2 == null || (iE = (dkwVar2 = (dkw) objA2).e(iA)) >= dkwVar2.c()) {
                    lineRight = -1.0f;
                } else {
                    djy djyVar = dkwVar2.b;
                    djyVar.e(iE);
                    java.util.List list = djyVar.h;
                    dka dkaVar = (dka) list.get(defpackage.xa.g(list, iE));
                    djb djbVar = dkaVar.g;
                    int iF = dkaVar.f(iE);
                    dll dllVar = djbVar.b;
                    lineRight = dllVar.f.getLineRight(iF) + (iF == dllVar.g + (-1) ? dllVar.j : 0.0f);
                }
                fS = aooc.s(fIntBitsToFloat, java.lang.Math.min(fB, lineRight), java.lang.Math.max(fB, lineRight));
            }
            if (fS != -1.0f && (anty.ah(j, 0L) || java.lang.Math.abs(fIntBitsToFloat - fS) <= ((int) (j >> 32)) / 2)) {
                java.lang.Object objA3 = aomyVar.a();
                if (objA3 == null || (iE2 = (dkwVar3 = (dkw) objA3).e(i)) >= dkwVar3.c()) {
                    fA = -1.0f;
                } else {
                    float fB2 = dkwVar3.b(iE2);
                    fA = ((dkwVar3.a(iE2) - fB2) / 2.0f) + fB2;
                }
                if (fA != -1.0f) {
                    return cxiVar.i(cxiVarG, (((long) java.lang.Float.floatToRawIntBits(fS)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA)) & 4294967295L));
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final cpn b(cxi cxiVar) {
        cpn cpnVarF = den.F(cxiVar, true);
        return cdh.v(cxiVar.o(cpnVarF.d()), cxiVar.o((((long) java.lang.Float.floatToRawIntBits(cpnVarF.d)) << 32) | (((long) java.lang.Float.floatToRawIntBits(cpnVarF.e)) & 4294967295L)));
    }

    public static final boolean c(cpn cpnVar, long j) {
        float f = cpnVar.b;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        if (f <= fIntBitsToFloat && fIntBitsToFloat <= cpnVar.d) {
            float f2 = cpnVar.c;
            float f3 = cpnVar.e;
            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
            if (f2 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f3) {
                return true;
            }
        }
        return false;
    }
}
