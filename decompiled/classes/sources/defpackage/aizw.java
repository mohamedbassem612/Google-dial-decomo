package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aizw implements java.lang.Runnable {
    final defpackage.ajac a;
    final defpackage.ajcq b;

    public aizw(defpackage.ajac ajacVar, defpackage.ajcq ajcqVar) {
        this.a = ajacVar;
        this.b = ajcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.valueField == this) {
            defpackage.ajcq ajcqVar = this.b;
            if (defpackage.ajaj.m.f(this.a, this, defpackage.ajac.i(ajcqVar))) {
                defpackage.ajac.k(this.a, false);
            }
        }
    }
}
