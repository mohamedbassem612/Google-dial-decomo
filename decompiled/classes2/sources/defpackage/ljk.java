package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ljk implements defpackage.adnj, ador {
    public final java.util.concurrent.Executor a;
    public defpackage.lha b;
    private final ados c;
    private final lbw d;
    private final j$.util.Optional e;

    public ljk(adoa adoaVar, defpackage.adog adogVar, ljo ljoVar, j$.util.Optional optional, java.util.concurrent.Executor executor, j$.util.Optional optional2, lbw lbwVar, j$.util.Optional optional3) {
        if (adoaVar.ordinal() != 0) {
            throw new java.lang.IllegalArgumentException("Unsupported channel: ".concat(adoaVar.toString()));
        }
        aoin aoinVar = ljoVar.g;
        ajcu ajcuVar = ((aiyy) aoinVar.a()).b().a;
        adoq adoqVar = new adoq(this);
        ljb ljbVar = (ljb) ljoVar.h.a();
        ajwz ajwzVar = (ajwz) ljoVar.c.a();
        ((aiyy) aoinVar.a()).b();
        adsp adspVar = (adsp) ljoVar.d.a();
        vqf vqfVar = (vqf) ljoVar.f.a();
        ((aiyy) aoinVar.a()).b();
        this.c = new defpackage.ljs(adoqVar, ljbVar, ajwzVar, adspVar, vqfVar.I(adogVar, ajcuVar, optional2), ajcuVar, ljoVar.j, this, ((aiyy) aoinVar.a()).b().h, optional, ljoVar.i);
        this.a = executor;
        this.d = lbwVar;
        this.e = optional3;
    }

    @Override // defpackage.adnj
    public final ajcq a() {
        ajcq ajcqVarB;
        ados adosVar = this.c;
        synchronized (((defpackage.ljs) adosVar).c) {
            if (((defpackage.ljs) adosVar).a() != defpackage.ljr.g) {
                ajcqVarB = aiql.y(new defpackage.adof("Attempt to cleanup flow while not fully stopped. State=" + ((defpackage.ljs) adosVar).a().name(), adoe.e));
            } else {
                ajcq ajcqVarB2 = ((defpackage.ljs) adosVar).b();
                ahyc ahycVarA = ahqx.a(new lix(4));
                ajcu ajcuVar = ((defpackage.ljs) adosVar).f;
                ajcqVarB = abrz.B(ahvr.B(ajcqVarB2, java.lang.Exception.class, ahycVarA, ajcuVar), new defpackage.lgc(adosVar, 8), ajcuVar);
            }
        }
        return ajcqVarB;
    }

    @Override // defpackage.adnj
    public final ajcq b(j$.util.Optional optional) {
        ados adosVar = this.c;
        synchronized (((defpackage.ljs) adosVar).d) {
            defpackage.ve veVar = new defpackage.ve();
            if (!((defpackage.ljs) adosVar).t(defpackage.ljr.d, veVar, false)) {
                defpackage.ljs.a.d().i(zct.b).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "pause", 532, "ForkedIncomingCallFlowManager.java").B("%d:pause():Flow state is not started or starting: %s", ((defpackage.ljs) adosVar).j, ((defpackage.ljs) adosVar).a().name());
                return aiql.z((java.lang.Object) null);
            }
            defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "pause", 538, "ForkedIncomingCallFlowManager.java").B("%d:pause():Pausing IncomingCallFlowManager from state %s", ((defpackage.ljs) adosVar).j, ((defpackage.ljr) veVar.a).name());
            ((defpackage.ljs) adosVar).k.set(false);
            ajcq ajcqVar = ((defpackage.ljs) adosVar).o;
            ajcq ajcqVarI = ((defpackage.ljs) adosVar).i();
            ajck ajckVarW = ajck.w(aiql.z((java.lang.Object) null));
            defpackage.lhy lhyVar = new defpackage.lhy(adosVar, 7);
            ajcu ajcuVar = ((defpackage.ljs) adosVar).f;
            ((defpackage.ljs) adosVar).o = ajckVarW.y(lhyVar, ajcuVar).y(new defpackage.lhy(ajcqVar, 9), ajcuVar).y(new defpackage.ljp(adosVar, optional, 3), ajcuVar).y(new defpackage.ljp(adosVar, ajcqVarI, 4), ajcuVar).x(new defpackage.lgd(adosVar, 17), ajcuVar);
            return ((defpackage.ljs) adosVar).j(((defpackage.ljs) adosVar).o);
        }
    }

    @Override // defpackage.adnj
    public final ajcq c(defpackage.adoo adooVar) {
        defpackage.ljs ljsVar = (defpackage.ljs) this.c;
        return !ljsVar.r() ? aiql.y(new defpackage.adof("Can't send user intents when module is not active", adoe.e)) : new adqr(ljsVar.e(adooVar.a));
    }

    @Override // defpackage.adnj
    public final ajcq d(boolean z) {
        ados adosVar = this.c;
        defpackage.ljs ljsVar = (defpackage.ljs) adosVar;
        defpackage.adpe adpeVar = ljsVar.i;
        if (!adpeVar.h()) {
            return aiql.y(new java.lang.IllegalStateException("setDownlinkMuteState called when callAudioManager is not initialized"));
        }
        if (!z || adpeVar.b().f()) {
            return ljsVar.f(z);
        }
        return ahvr.D(new defpackage.ibg(adosVar, 12), 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, ljsVar.f);
    }

    @Override // defpackage.adnj
    public final ajcq e(j$.util.Optional optional) {
        ados adosVar = this.c;
        synchronized (((defpackage.ljs) adosVar).d) {
            defpackage.ve veVar = new defpackage.ve();
            defpackage.ljr ljrVar = defpackage.ljr.f;
            if (!((defpackage.ljs) adosVar).t(ljrVar, veVar, false)) {
                aimz aimzVar = defpackage.ljs.a;
                aimzVar.d().i(zct.b).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "stop", 434, "ForkedIncomingCallFlowManager.java").B("%d:stop():Invalid state transition from previous state(%s) to STOPPING", ((defpackage.ljs) adosVar).j, ((defpackage.ljs) adosVar).a().name());
                if (!((java.lang.Boolean) ((defpackage.ljs) adosVar).m.a()).booleanValue() || ((defpackage.ljs) adosVar).a() != defpackage.ljr.a) {
                    return ajcm.a;
                }
                aimzVar.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "stop", 442, "ForkedIncomingCallFlowManager.java").v("Triggering stop sequence from CallFlowState.INITIALIZED.");
                ((defpackage.ljs) adosVar).p(ljrVar);
                return ajck.w(((defpackage.ljs) adosVar).c()).x(new defpackage.lgd(adosVar, 15), ((defpackage.ljs) adosVar).f);
            }
            defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "stop", 455, "ForkedIncomingCallFlowManager.java").B("%d:stop():Stopping IncomingCallFlowManager from state %s", ((defpackage.ljs) adosVar).j, ((defpackage.ljr) veVar.a).name());
            ((defpackage.ljs) adosVar).k.set(false);
            ((defpackage.ljs) adosVar).n = false;
            ajcq ajcqVar = ((defpackage.ljs) adosVar).o;
            ajck ajckVarW = ajck.w(aiql.z((java.lang.Object) null));
            defpackage.lhy lhyVar = new defpackage.lhy(adosVar, 11);
            ajcu ajcuVar = ((defpackage.ljs) adosVar).f;
            ((defpackage.ljs) adosVar).o = ajckVarW.y(lhyVar, ajcuVar).y(new defpackage.lhy(ajcqVar, 12), ajcuVar).y(new defpackage.juo(adosVar, veVar, optional, 12), ajcuVar).y(new defpackage.lhy(adosVar, 13), ((defpackage.ljs) adosVar).l).x(new defpackage.lgd(adosVar, 16), ajcuVar);
            return ((defpackage.ljs) adosVar).j(((defpackage.ljs) adosVar).o);
        }
    }

    public final void f(java.util.List list) {
        if (this.d.a()) {
            this.a.execute(new defpackage.lge(this, list, 9));
        } else {
            agsm.i(301, ahvr.E(new defpackage.lge(this, list, 10), this.a), "failed handling onCallerIntents", new java.lang.Object[0]);
        }
    }

    @Override // defpackage.adnj
    public final boolean g() {
        return this.c.r();
    }

    @Override // defpackage.adnj
    public final ajcq h(defpackage.lha lhaVar, defpackage.adnw adnwVar, defpackage.adnw adnwVar2) {
        ahvr.cj(lhaVar, "invalid null listener");
        this.b = lhaVar;
        java.lang.Integer num = (java.lang.Integer) this.e.orElse((java.lang.Object) null);
        ados adosVar = this.c;
        if (num != null) {
            return ((defpackage.ljs) adosVar).g(adnwVar, adnwVar2, j$.util.Optional.of(num));
        }
        return ((defpackage.ljs) adosVar).g(adnwVar, adnwVar2, j$.util.Optional.empty());
    }
}
