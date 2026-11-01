package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aczj implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ aczj(aczk aczkVar, boolean z, boolean z2, defpackage.acvu acvuVar, int i) {
        this.$cid = i;
        this.c = aczkVar;
        this.a = z;
        this.b = z2;
        this.d = acvuVar;
    }

    public final ajcq a(java.lang.Object obj) {
        if (this.$cid == 0) {
            if (this.a && !this.b) {
                return aiql.z(aikj.b);
            }
            return ((aczk) this.c).d.k((defpackage.acvu) this.d);
        }
        java.lang.Exception exc = (java.lang.Exception) obj;
        java.lang.Object obj2 = this.c;
        vnu vnuVar = (vnu) obj2;
        vnuVar.b.o(rmx.lj);
        boolean z = this.a;
        java.lang.Object obj3 = this.d;
        if (!z) {
            a.bt(vnu.a.d(), "Enqueue failed twice and will not be tried again %s", obj3, "com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorkStarter", "enqueueSodaTranscription", (char) 220, "VvmSodaTranscriptionWorkStarter.java", zct.b);
            return aiql.z((java.lang.Object) null);
        }
        boolean z2 = this.b;
        a.by(vnu.a.b(), "WorkManager's schedule table may be full. Enqueue will be attempted in 2 minutes", "com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorkStarter", "enqueueSodaTranscription", (char) 211, "VvmSodaTranscriptionWorkStarter.java", exc);
        return vnuVar.a((android.net.Uri) obj3, new agux(2L, java.util.concurrent.TimeUnit.MINUTES), false, z2);
    }

    public /* synthetic */ aczj(vnu vnuVar, boolean z, android.net.Uri uri, boolean z2, int i) {
        this.$cid = i;
        this.c = vnuVar;
        this.a = z;
        this.d = uri;
        this.b = z2;
    }
}
