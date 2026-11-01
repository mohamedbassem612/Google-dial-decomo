package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aehb implements defpackage.aduj {
    private static final defpackage.aiof b = defpackage.aiof.i("GnpSdk");
    public final defpackage.ahpz a;

    public aehb(defpackage.ahpz ahpzVar) {
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        this.a = ahpzVar;
    }

    @Override // defpackage.aduj
    public final defpackage.ahpm a(java.lang.String str) {
        return this.a.f(1257, str);
    }

    @Override // defpackage.aduj
    public final defpackage.ahyc b(defpackage.ahyc ahycVar) {
        long j = defpackage.ahqx.a;
        return new defpackage.ahqv(defpackage.ahns.c(false), ahycVar);
    }

    @Override // defpackage.aduj
    public final defpackage.ajat c(defpackage.ajat ajatVar) {
        long j = defpackage.ahqx.a;
        return new defpackage.ajax(defpackage.ahns.c(false), ajatVar, 1);
    }

    @Override // defpackage.aduj
    public final java.util.concurrent.Callable d(java.util.concurrent.Callable callable) {
        long j = defpackage.ahqx.a;
        return new defpackage.ajav(defpackage.ahns.c(false), callable, 1);
    }

    @Override // defpackage.aduj
    public final void e() {
        try {
            defpackage.ahvr.T();
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.aiob) ((defpackage.aiob) b.c()).k(e)).v("Missing trace");
        }
    }
}
