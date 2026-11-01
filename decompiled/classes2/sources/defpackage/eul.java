package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class eul implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;

    public /* synthetic */ eul(int i) {
        this.$cid = i;
        this.a = "ExoPlayer:AudioTrackReleaseThread";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.String str = eum.a;
            return new java.lang.Thread(runnable, this.a);
        }
        if (i != 1) {
            agfj agfjVar = agfj.a;
            return new java.lang.Thread(runnable, this.a);
        }
        java.lang.String str2 = eum.a;
        return new java.lang.Thread(runnable, this.a);
    }

    public /* synthetic */ eul(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "SetupCompatServiceInvoker";
    }

    public /* synthetic */ eul(java.lang.String str, int i) {
        this.$cid = i;
        this.a = str;
    }
}
