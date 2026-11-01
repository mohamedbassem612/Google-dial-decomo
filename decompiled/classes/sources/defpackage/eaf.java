package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class eaf extends defpackage.eal {
    final android.view.WindowInsets.Builder a;

    public eaf(defpackage.eax eaxVar) {
        super(eaxVar);
        android.view.WindowInsets windowInsetsE = eaxVar.e();
        this.a = windowInsetsE != null ? new android.view.WindowInsets.Builder(windowInsetsE) : new android.view.WindowInsets.Builder();
    }

    @Override // defpackage.eal
    public defpackage.eax a() {
        defpackage.eax eaxVarQ = defpackage.eax.q(da$.ExternalSyntheticApiModelOutline0.m(this.a), null);
        eaxVarQ.b.m(null);
        eaxVarQ.s(null);
        eaxVarQ.v(this.b);
        eaxVarQ.w(this.c);
        return eaxVarQ;
    }

    @Override // defpackage.eal
    public void b(defpackage.dwn dwnVar) {
        fn$.ExternalSyntheticApiModelOutline0.m(this.a, dwnVar.a());
    }

    @Override // defpackage.eal
    public void c(defpackage.dwn dwnVar) {
        da$.ExternalSyntheticApiModelOutline0.m(this.a, dwnVar.a());
    }

    public eaf() {
        this.a = new android.view.WindowInsets.Builder();
    }
}
