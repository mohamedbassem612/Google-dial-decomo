package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class xeo implements defpackage.ajcb {
    public xeo(defpackage.xep xepVar) {
        j$.util.Objects.requireNonNull(xepVar);
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.xep.a.c()).k(th)).l("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorkEnqueueingListener$1", "onFailure", '.', "CallScreenRecordingsDeletionWorkEnqueueingListener.java")).v("Could not enqueue deletion worker.");
    }

    @Override // defpackage.ajcb
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.xep.a.b()).l("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorkEnqueueingListener$1", "onSuccess", 41, "CallScreenRecordingsDeletionWorkEnqueueingListener.java")).y("Successfully enqueued deletion worker, uuid=%s.", (java.util.UUID) obj);
    }
}
