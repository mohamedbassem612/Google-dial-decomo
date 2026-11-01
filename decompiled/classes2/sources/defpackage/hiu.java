package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hiu implements adze {
    private final /* synthetic */ int $cid;
    private final defpackage.him a;

    public hiu(defpackage.him himVar, int i) {
        this.$cid = i;
        this.a = himVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        int i = this.$cid;
        defpackage.him himVar = this.a;
        if (i == 0) {
            ((com.google.android.libraries.notifications.platform.entrypoints.job.GnpWorker) obj).d = (advl) himVar.a.gf.a();
            return;
        }
        com.google.android.libraries.notifications.platform.entrypoints.firebase.FirebaseMessagingServiceImpl firebaseMessagingServiceImpl = (com.google.android.libraries.notifications.platform.entrypoints.firebase.FirebaseMessagingServiceImpl) obj;
        firebaseMessagingServiceImpl.a = (aduu) himVar.qJ.a();
        firebaseMessagingServiceImpl.b = himVar.a.ge;
        firebaseMessagingServiceImpl.c = himVar.ra;
        firebaseMessagingServiceImpl.d = himVar.eI();
        firebaseMessagingServiceImpl.e = new aefw();
    }
}
