package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxh implements lmw {
    public final aolr a;
    public final rlv b;
    public final android.media.AudioManager c;
    public final swv d;
    private final aoss e;

    public sxh(aoss aossVar, aolr aolrVar, rlv rlvVar, android.media.AudioManager audioManager, swv swvVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(rlvVar, "loggingBindings");
        this.e = aossVar;
        this.a = aolrVar;
        this.b = rlvVar;
        this.c = audioManager;
        this.d = swvVar;
    }

    public final ajcq b(lmq lmqVar) {
        return aosv.F(this.e, 0, new defpackage.rka(this, lmqVar, (aoln) null, 20), 3);
    }
}
