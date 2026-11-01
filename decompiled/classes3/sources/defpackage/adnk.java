package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adnk implements adnj, defpackage.ador {
    public final java.util.concurrent.Executor a;
    public lha b;
    private final defpackage.ados c;

    /* JADX WARN: Type inference failed for: r0v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aoin, java.lang.Object] */
    public adnk(adoa adoaVar, adog adogVar, defpackage.alln allnVar, j$.util.Optional optional, java.util.concurrent.Executor executor, j$.util.Optional optional2) {
        if (adoaVar.ordinal() != 0) {
            throw new java.lang.IllegalArgumentException("Unsupported channel: ".concat(adoaVar.toString()));
        }
        ?? r11 = allnVar.f;
        ajct ajctVar = ((aiyy) r11.a()).b().a;
        defpackage.adoq adoqVar = new defpackage.adoq(this);
        ajwz ajwzVar = (ajwz) allnVar.b.a();
        int i = ((aiyy) r11.a()).b().i;
        defpackage.adsp adspVar = (defpackage.adsp) allnVar.d.a();
        defpackage.vqf vqfVar = (defpackage.vqf) allnVar.c.a();
        ((aiyy) r11.a()).b();
        this.c = new defpackage.adow(adoqVar, ajwzVar, i, adspVar, vqfVar.I(adogVar, ajctVar, optional2), ajctVar, this, ((aiyy) r11.a()).b().h, optional);
        this.a = executor;
    }

    public final ajcq a() {
        ajcq ajcqVarB;
        defpackage.ados adosVar = this.c;
        synchronized (((defpackage.adow) adosVar).c) {
            if (((defpackage.adow) adosVar).a() != defpackage.adov.g) {
                ajcqVarB = aiql.y(new adof("Attempt to cleanup flow while not fully stopped. State=" + ((defpackage.adow) adosVar).a().name(), defpackage.adoe.e));
            } else {
                ajcq ajcqVarB2 = ((defpackage.adow) adosVar).b();
                defpackage.adfe adfeVar = new defpackage.adfe(8);
                ajcu ajcuVar = ((defpackage.adow) adosVar).f;
                ajcqVarB = abrz.B(aizu.f(ajcqVarB2, java.lang.Exception.class, adfeVar, ajcuVar), new defpackage.zpk(adosVar, 9), ajcuVar);
            }
        }
        return ajcqVarB;
    }

    public final ajcq b(j$.util.Optional optional) {
        defpackage.ados adosVar = this.c;
        synchronized (((defpackage.adow) adosVar).d) {
            defpackage.amdx amdxVar = new defpackage.amdx();
            if (!((defpackage.adow) adosVar).p(defpackage.adov.d, amdxVar, false)) {
                defpackage.adow.a.d().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "pause", 444, "IncomingCallFlowManager.java").B("%d:pause():Flow state is not started or starting: %s", ((defpackage.adow) adosVar).j, ((defpackage.adow) adosVar).a().name());
                return aiql.z((java.lang.Object) null);
            }
            defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "pause", 450, "IncomingCallFlowManager.java").B("%d:pause():Pausing IncomingCallFlowManager from state %s", ((defpackage.adow) adosVar).j, ((defpackage.adov) amdxVar.a).name());
            ((defpackage.adow) adosVar).k.set(false);
            ajcq ajcqVar = ((defpackage.adow) adosVar).n;
            ajcq ajcqVarG = ((defpackage.adow) adosVar).g();
            ajck ajckVarW = ajck.w(aiql.z((java.lang.Object) null));
            adfd adfdVar = new adfd(adosVar, 3);
            ajcu ajcuVar = ((defpackage.adow) adosVar).f;
            ((defpackage.adow) adosVar).n = ajckVarW.y(adfdVar, ajcuVar).y(new adfd(ajcqVar, 8), ajcuVar).y(new defpackage.adot(adosVar, optional, 1), ajcuVar).y(new defpackage.adot(adosVar, ajcqVarG, 0), ajcuVar).x(new defpackage.adek(adosVar, 7), ajcuVar);
            return ((defpackage.adow) adosVar).h(((defpackage.adow) adosVar).n);
        }
    }

    public final ajcq c(adoo adooVar) {
        defpackage.adow adowVar = (defpackage.adow) this.c;
        return !adowVar.r() ? aiql.y(new adof("Can't send user intents when module is not active", defpackage.adoe.e)) : new adqr(adowVar.e(adooVar.a));
    }

    public final ajcq d(boolean z) {
        defpackage.ados adosVar = this.c;
        defpackage.adow adowVar = (defpackage.adow) adosVar;
        adpe adpeVar = adowVar.i;
        if (!adpeVar.h()) {
            return aiql.y(new java.lang.IllegalStateException("setDownlinkMuteState called when callAudioManager is not initialized"));
        }
        if (!z || adpeVar.b().f()) {
            return adowVar.f(z);
        }
        return aiql.B(new defpackage.adbi(adosVar, 3), 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, adowVar.f);
    }

    public final ajcq e(j$.util.Optional optional) {
        defpackage.ados adosVar = this.c;
        synchronized (((defpackage.adow) adosVar).d) {
            defpackage.amdx amdxVar = new defpackage.amdx();
            if (!((defpackage.adow) adosVar).p(defpackage.adov.f, amdxVar, false)) {
                defpackage.adow.a.d().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "stop", 365, "IncomingCallFlowManager.java").B("%d:stop():Call flow already stopped. Previous state=%s", ((defpackage.adow) adosVar).j, ((defpackage.adow) adosVar).a().name());
                return aiql.z((java.lang.Object) null);
            }
            defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "stop", 370, "IncomingCallFlowManager.java").B("%d:stop():Stopping IncomingCallFlowManager from state %s", ((defpackage.adow) adosVar).j, ((defpackage.adov) amdxVar.a).name());
            ((defpackage.adow) adosVar).k.set(false);
            ((defpackage.adow) adosVar).m = false;
            ajcq ajcqVar = ((defpackage.adow) adosVar).n;
            ajck ajckVarW = ajck.w(aiql.z((java.lang.Object) null));
            adfd adfdVar = new adfd(adosVar, 4);
            ajcu ajcuVar = ((defpackage.adow) adosVar).f;
            ((defpackage.adow) adosVar).n = ajckVarW.y(adfdVar, ajcuVar).y(new adfd(ajcqVar, 5), ajcuVar).y(new defpackage.aczq((java.lang.Object) adosVar, (java.lang.Object) amdxVar, (java.lang.Object) optional, 11, (byte[]) null), ajcuVar).y(new adfd(adosVar, 6), ajcuVar).x(new defpackage.adek(adosVar, 4), ajcuVar);
            return ((defpackage.adow) adosVar).h(((defpackage.adow) adosVar).n);
        }
    }

    @Override // defpackage.ador
    public final void f(java.util.List list) {
        this.a.execute(new defpackage.aawj(this, list, 8));
    }

    public final boolean g() {
        return this.c.r();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public final ajcq h(lha lhaVar, adnw adnwVar, adnw adnwVar2) {
        boolean z;
        boolean z2;
        ajcq ajcqVarH;
        ahvr.cj(lhaVar, "invalid null listener");
        this.b = lhaVar;
        if (adnwVar != null) {
            j$.util.Optional optional = adnwVar.b;
            optional.isPresent();
            if (ahvr.cp((java.lang.String) optional.get())) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        ahvr.bN(z, "invalid empty welcome text");
        if (adnwVar2 != null) {
            j$.util.Optional optional2 = adnwVar2.b;
            optional2.isPresent();
            z2 = ahvr.cp((java.lang.String) optional2.get()) ? false : true;
        }
        defpackage.ados adosVar = this.c;
        ahvr.bN(z2, "invalid empty resume from hold text");
        synchronized (((defpackage.adow) adosVar).d) {
            defpackage.amdx amdxVar = new defpackage.amdx();
            if (((defpackage.adow) adosVar).p(defpackage.adov.b, amdxVar, false)) {
                defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "startInternal", 247, "IncomingCallFlowManager.java").B("%d:start():Starting IncomingCallFlowManager from state %s", ((defpackage.adow) adosVar).j, ((defpackage.adov) amdxVar.a).name());
                ajck ajckVarW = ajck.w(((defpackage.adow) adosVar).b());
                adfd adfdVar = new adfd(adosVar, 7);
                ajcu ajcuVar = ((defpackage.adow) adosVar).f;
                ((defpackage.adow) adosVar).n = ajckVarW.y(adfdVar, ajcuVar).y(new defpackage.aczq(adosVar, amdxVar, adnwVar2, 12, (int[]) null), ajcuVar).y(new defpackage.acze(adosVar, adnwVar, 18, null), ajcuVar).x(new defpackage.adek(adosVar, 6), ajcuVar);
                ajcqVarH = ((defpackage.adow) adosVar).h(((defpackage.adow) adosVar).n);
            } else {
                defpackage.adow.a.d().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "startInternal", 242, "IncomingCallFlowManager.java").B("%d:start():Can't start call flow at state: %s", ((defpackage.adow) adosVar).j, ((defpackage.adow) adosVar).a().name());
                ajcqVarH = aiql.z((java.lang.Object) null);
            }
        }
        return ajcqVarH;
    }
}
