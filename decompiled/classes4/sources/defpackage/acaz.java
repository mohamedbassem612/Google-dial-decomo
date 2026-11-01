package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class acaz {
    private final int a;
    private final akkc b;

    public acaz(int i, akkc akkcVar) {
        aooh.f(akkcVar, "theme");
        this.a = i;
        this.b = akkcVar;
    }

    public final defpackage.akvg a() {
        defpackage.akve akveVar;
        defpackage.akvf akvfVar;
        akzx akzxVarM = defpackage.akvg.a.m();
        aooh.f(akzxVarM, "builder");
        int i = this.a;
        if (i != 1) {
            akveVar = i != 2 ? defpackage.akve.ORIENTATION_UNKNOWN : defpackage.akve.ORIENTATION_LANDSCAPE;
        } else {
            akveVar = defpackage.akve.ORIENTATION_PORTRAIT;
        }
        akzxVarM.u();
        defpackage.akvg akvgVar = (defpackage.akvg) akzxVarM.b;
        akvgVar.c = akveVar.d;
        akvgVar.b |= 1;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 1) {
            akvfVar = iOrdinal != 2 ? defpackage.akvf.THEME_UNKNOWN : defpackage.akvf.THEME_DARK;
        } else {
            akvfVar = defpackage.akvf.THEME_LIGHT;
        }
        akzxVarM.u();
        defpackage.akvg akvgVar2 = (defpackage.akvg) akzxVarM.b;
        akvgVar2.d = akvfVar.d;
        akvgVar2.b |= 2;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akvg) aladVarP;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acaz) {
            defpackage.acaz acazVar = (defpackage.acaz) obj;
            if (this.a == acazVar.a && this.b == acazVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PromoDisplayContext(screenOrientation=" + this.a + ", theme=" + this.b + ')';
    }
}
