package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class chd {
    public final int b;
    public final int c;

    public chd(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    protected abstract void a(defpackage.chg chgVar, defpackage.cah cahVar, defpackage.cfp cfpVar, defpackage.cjh cjhVar, defpackage.che cheVar);

    protected defpackage.cfh b(defpackage.chg chgVar) {
        return null;
    }

    public final java.lang.String toString() {
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        java.lang.String strC = new defpackage.aooa(getClass()).c();
        return strC == null ? "" : strC;
    }
}
