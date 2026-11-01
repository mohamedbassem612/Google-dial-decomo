package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class som implements defpackage.ajcb {
    final /* synthetic */ defpackage.son a;

    public som(defpackage.son sonVar) {
        j$.util.Objects.requireNonNull(sonVar);
        this.a = sonVar;
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.son.a.c()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/phenotype/Flags$1", "onFailure", (char) 133, "Flags.java")).v("commit failed");
    }

    @Override // defpackage.ajcb
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        ((defpackage.aimw) ((defpackage.aimw) defpackage.son.a.b()).l("com/android/dialer/phenotype/Flags$1", "onSuccess", 123, "Flags.java")).y("finished with result: %b", bool);
        if (j$.util.Objects.equals(bool, java.lang.Boolean.TRUE)) {
            j$.lang.Iterable.-EL.forEach(this.a.c.e(), new defpackage.agyk(1));
        }
    }
}
