package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cwh {
    public static final java.lang.Void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final java.lang.Void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void c(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void d(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void e(java.lang.String str) {
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static int f(defpackage.cwq cwqVar, cwo cwoVar, defpackage.cxe cxeVar, int i) {
        defpackage.dck dckVar = cwqVar.L().z;
        if (dckVar == null) {
            defpackage.aooh.g();
        }
        defpackage.dbu dbuVarD = dckVar.D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        if (!dbuVarD.V()) {
            return cxeVar.c(i);
        }
        return cwqVar.k(new cwp(cwoVar, cwoVar.p()), new dcm(cxeVar, 2, 2, 0), defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE)).b();
    }

    public static int g(defpackage.cwq cwqVar, cwo cwoVar, defpackage.cxe cxeVar, int i) {
        defpackage.dck dckVar = cwqVar.L().z;
        if (dckVar == null) {
            defpackage.aooh.g();
        }
        defpackage.dbu dbuVarD = dckVar.D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        if (!dbuVarD.V()) {
            return cxeVar.d(i);
        }
        return cwqVar.k(new cwp(cwoVar, cwoVar.p()), new dcm(cxeVar, 2, 1, 0), defpackage.dpe.c(0, Integer.MAX_VALUE, 0, i)).c();
    }

    public static int h(defpackage.cwq cwqVar, cwo cwoVar, defpackage.cxe cxeVar, int i) {
        defpackage.dck dckVar = cwqVar.L().z;
        if (dckVar == null) {
            defpackage.aooh.g();
        }
        defpackage.dbu dbuVarD = dckVar.D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        if (!dbuVarD.V()) {
            return cxeVar.e(i);
        }
        return cwqVar.k(new cwp(cwoVar, cwoVar.p()), new dcm(cxeVar, 1, 2, 0), defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE)).b();
    }

    public static int i(defpackage.cwq cwqVar, cwo cwoVar, defpackage.cxe cxeVar, int i) {
        defpackage.dck dckVar = cwqVar.L().z;
        if (dckVar == null) {
            defpackage.aooh.g();
        }
        defpackage.dbu dbuVarD = dckVar.D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        if (!dbuVarD.V()) {
            return cxeVar.f(i);
        }
        return cwqVar.k(new cwp(cwoVar, cwoVar.p()), new dcm(cxeVar, 1, 1, 0), defpackage.dpe.c(0, Integer.MAX_VALUE, 0, i)).c();
    }

    public static final java.lang.Object j(defpackage.cyd cydVar) {
        java.lang.Object objG = cydVar.g();
        cxl cxlVar = objG instanceof cxl ? (cxl) objG : null;
        if (cxlVar != null) {
            return cxlVar.a;
        }
        return null;
    }

    public static final float k(long j, long j2) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (j2 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
