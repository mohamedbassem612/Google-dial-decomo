package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class riw implements aaui {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ riw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aonj, java.lang.Object] */
    public final void d(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            this.a.a(obj);
            return;
        }
        if (i == 1) {
            this.a.a(obj);
            return;
        }
        if (i == 2) {
            aiof aiofVar = acak.a;
            this.a.a(obj);
            return;
        }
        com.google.android.gms.cloudmessaging.CloudMessage cloudMessage = (com.google.android.gms.cloudmessaging.CloudMessage) obj;
        if (cloudMessage != null) {
            java.lang.Object obj2 = this.a;
            ajsz.B(cloudMessage.a);
            ((com.google.firebase.messaging.FirebaseMessaging) obj2).c();
        }
    }
}
