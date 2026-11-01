package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class low implements defpackage.ajcb {
    private final java.lang.String a;

    public low(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.lox.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/common/concurrent/FailureLoggedFuture$LoggingCallback", "onFailure", 50, "FailureLoggedFuture.java")).M("%s failed with %s : %s", this.a, th.getClass().getName(), th.getMessage());
    }

    @Override // defpackage.ajcb
    public final void b(java.lang.Object obj) {
    }
}
