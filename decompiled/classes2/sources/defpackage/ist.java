package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ist implements defpackage.lnq {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/callscreeningservice/BeeslyCallInfoCallResponseVoter");
    public final aolr b;
    public final jbm c;
    public final defpackage.isv d;
    public final aoin e;
    public final kaw f;
    private final aoss g;
    private final ita h;

    public ist(aolr aolrVar, aoss aossVar, jbm jbmVar, defpackage.isv isvVar, ita itaVar, kaw kawVar, aoin aoinVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(jbmVar, "beeslySettings");
        aooh.f(itaVar, "beeslyLatestVoteStorage");
        aooh.f(kawVar, "hasAnotherActiveCallCache");
        aooh.f(aoinVar, "enableHasAnotherActiveCallCache");
        this.b = aolrVar;
        this.g = aossVar;
        this.c = jbmVar;
        this.d = isvVar;
        this.h = itaVar;
        this.f = kawVar;
        this.e = aoinVar;
    }

    @Override // defpackage.lnq
    public final ajcq a(defpackage.lmq lmqVar) {
        aooh.f(lmqVar, "callScreeningDetails");
        return aosv.F(this.g, 0, new defpackage.iiw(this, lmqVar, (aoln) null, 14), 3);
    }

    public final java.lang.Object b(defpackage.itb itbVar, defpackage.isw iswVar, aoln aolnVar) {
        a.b().l("com/android/dialer/beesly/impl/callscreeningservice/BeeslyCallInfoCallResponseVoter", "setLatestVoteWithReason", 74, "BeeslyCallInfoCallResponseVoter.kt").I("BeeslyCallInfoVote:%s, Reason:%s", itbVar.name(), iswVar.name());
        java.lang.Object objB = this.h.b(itbVar, iswVar, aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }
}
