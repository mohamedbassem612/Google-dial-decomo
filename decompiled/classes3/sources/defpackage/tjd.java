package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tjd implements defpackage.tjh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.app.Activity a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ tjd(android.app.Activity activity, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = activity;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [albh, java.lang.Object] */
    @Override // defpackage.tjh
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.uxp) wsc.aW(this.a, (defpackage.uxq) this.b).orElseThrow()).a();
        } else if (i == 1) {
            defpackage.uxw.b(this.a, wsc.aT((java.lang.CharSequence) this.b), 2132017288);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(new android.content.ComponentName("com.google.android.dialer", "com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsWrapperActivity"));
            defpackage.akmr.t(intent, "coalesced_row", this.b);
            ahqx.l(this.a, intent);
        }
    }

    public /* synthetic */ tjd(kiu kiuVar, android.app.Activity activity, int i) {
        this.$cid = i;
        this.b = kiuVar;
        this.a = activity;
    }
}
