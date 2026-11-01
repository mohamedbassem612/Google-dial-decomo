package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class msp implements defpackage.lnp {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallResponseVoter");
    public final aolr b;
    public final aoin c;
    public final ojo d;
    public final rlv e;
    public final zrw f;
    public final defpackage.mss g;
    public final defpackage.msu h;
    public final noe i;
    public final aoin j;
    public final zpm k;
    public final zjm l;
    public final zjm m;
    public final tvn n;
    public final kaw o;
    private final aoss p;
    private final mtd q;
    private final mgw r;

    public msp(aoss aossVar, aolr aolrVar, aoin aoinVar, ojo ojoVar, zpm zpmVar, tvn tvnVar, mtd mtdVar, rlv rlvVar, zrw zrwVar, defpackage.mss mssVar, aazc aazcVar, defpackage.msu msuVar, mgw mgwVar, noe noeVar, zjm zjmVar, zjm zjmVar2, kaw kawVar, aoin aoinVar2) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aoinVar, "numberOfHoursQueryOutgoingCallsForSkipAutoScreeningProvider");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(zpmVar, "callScopes");
        aooh.f(mtdVar, "latestVoteStorage");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aazcVar, "clock");
        aooh.f(mgwVar, "eventRecoder");
        aooh.f(kawVar, "hasAnotherActiveCallCache");
        aooh.f(aoinVar2, "enableHasAnotherActiveCallCache");
        this.p = aossVar;
        this.b = aolrVar;
        this.c = aoinVar;
        this.d = ojoVar;
        this.k = zpmVar;
        this.n = tvnVar;
        this.q = mtdVar;
        this.e = rlvVar;
        this.f = zrwVar;
        this.g = mssVar;
        this.h = msuVar;
        this.r = mgwVar;
        this.i = noeVar;
        this.l = zjmVar;
        this.m = zjmVar2;
        this.o = kawVar;
        this.j = aoinVar2;
    }

    public static final boolean e(uip uipVar) {
        return uipVar != null && uipVar.j() == udj.c;
    }

    @Override // defpackage.lnp
    public final ajcq a() {
        return aosv.F(this.p, 0, new defpackage.bbf((aoln) null, 6, (float[]) null), 3);
    }

    @Override // defpackage.lnp
    public final ajcq b(defpackage.lmq lmqVar) {
        aooh.f(lmqVar, "callScreeningDetails");
        return aosv.F(this.p, 0, new defpackage.msi(this, lmqVar, (aoln) null, 3), 3);
    }

    public final java.lang.Object c(defpackage.lnm lnmVar, aoln aolnVar) {
        return d(lnmVar, defpackage.msz.g, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.lnm lnmVar, defpackage.msz mszVar, aoln aolnVar) {
        defpackage.mso msoVar;
        defpackage.mte mteVar;
        if (aolnVar instanceof defpackage.mso) {
            msoVar = (defpackage.mso) aolnVar;
            int i = msoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                msoVar.c = i - Integer.MIN_VALUE;
            } else {
                msoVar = new defpackage.mso(this, aolnVar);
            }
        } else {
            msoVar = new defpackage.mso(this, aolnVar);
        }
        java.lang.Object obj = msoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = msoVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallResponseVoter", "storeLastVoteAndReturn", 342, "DobbyCallResponseVoter.kt").I("DobbyAudioBasedVote:%s, Reason:%s", new aepg(lnmVar), new aepg(mszVar));
            mtd mtdVar = this.q;
            int iOrdinal = lnmVar.ordinal();
            if (iOrdinal == 1) {
                mteVar = defpackage.mte.VOTE_PASS_TO_USER;
            } else if (iOrdinal == 2) {
                mteVar = defpackage.mte.VOTE_SILENCE_FOR_TELECOM_AUDIO_PROCESSING;
            } else {
                if (iOrdinal != 3) {
                    throw new java.lang.IllegalArgumentException("unsupported vote type in Dobby");
                }
                mteVar = defpackage.mte.VOTE_REJECT;
            }
            msoVar.d = lnmVar;
            msoVar.e = mszVar;
            msoVar.c = 1;
            if (mtdVar.b(mteVar, mszVar, msoVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mszVar = msoVar.e;
            lnmVar = msoVar.d;
            aooc.af(obj);
        }
        mgw mgwVar = this.r;
        gus.az(new mhc[]{gus.aw("DobbyAudioBasedVoter"), gus.aw(lnmVar.name()), gus.aw(mszVar.name())});
        mgwVar.c();
        return lnmVar;
    }
}
