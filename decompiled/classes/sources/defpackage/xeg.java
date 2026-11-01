package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class xeg implements defpackage.ajcb {
    private final java.util.concurrent.atomic.AtomicBoolean a;
    private final java.lang.String b;

    public xeg(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.lang.String str) {
        this.a = atomicBoolean;
        this.b = str;
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.xeh.a.d()).k(th)).l("com/android/incallui/callscreen/impl/actions/ActionTextDownloader$FileDownloadFutureCallback", "onFailure", 301, "ActionTextDownloader.java")).y("%s preparation failed", this.b);
    }

    @Override // defpackage.ajcb
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.xeh.a.b()).l("com/android/incallui/callscreen/impl/actions/ActionTextDownloader$FileDownloadFutureCallback", "onSuccess", 295, "ActionTextDownloader.java")).y("%s preparation complete", this.b);
        this.a.compareAndSet(false, true);
    }
}
