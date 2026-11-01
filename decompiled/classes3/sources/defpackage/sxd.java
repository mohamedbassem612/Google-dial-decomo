package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxd implements lnp {
    public static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter");
    public final aolr b;
    public final rlv c;
    public final defpackage.sqt d;
    public final swv e;
    public final swn f;
    public final tvn g;
    public final defpackage.yzr h;
    private final aoss i;

    public sxd(aoss aossVar, aolr aolrVar, rlv rlvVar, defpackage.sqt sqtVar, tvn tvnVar, defpackage.yzr yzrVar, swv swvVar, swn swnVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(yzrVar, "latestVoteStorage");
        this.i = aossVar;
        this.b = aolrVar;
        this.c = rlvVar;
        this.d = sqtVar;
        this.g = tvnVar;
        this.h = yzrVar;
        this.e = swvVar;
        this.f = swnVar;
    }

    public final ajcq a() {
        return aiql.z(java.lang.Boolean.TRUE);
    }

    public final ajcq b(lmq lmqVar) {
        aooh.f(lmqVar, "callScreeningDetails");
        return aosv.F(this.i, 0, new defpackage.sxc(this, lmqVar, null), 3);
    }
}
