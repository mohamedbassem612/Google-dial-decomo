package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mzl implements oul {
    public final defpackage.nej a;
    public final defpackage.mqt b;
    public final defpackage.nbr c;
    public final defpackage.mba d;
    public final defpackage.nhq e;
    public final aoin f;
    public final aoin g;
    public final aimz h;
    public final pci i;
    public final defpackage.ogj j;
    private final aoss k;

    public mzl(defpackage.nej nejVar, aoss aossVar, defpackage.mqt mqtVar, defpackage.nbr nbrVar, defpackage.mba mbaVar, defpackage.ogj ogjVar, defpackage.nhq nhqVar, pci pciVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(nejVar, "dobbyLifecycleController");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(nhqVar, "dobbySession");
        aooh.f(pciVar, "phoneDialerInCallArbiter");
        aooh.f(aoinVar, "winkyPhaseTwoEnabled");
        aooh.f(aoinVar2, "winkyFullFunctionalityEnabled");
        this.a = nejVar;
        this.k = aossVar;
        this.b = mqtVar;
        this.c = nbrVar;
        this.d = mbaVar;
        this.j = ogjVar;
        this.e = nhqVar;
        this.i = pciVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.h = aimz.i("com/android/dialer/dobby/impl/service/DobbyAnswerScreenActionsProvider");
    }

    public final ajcq a() {
        return aosv.F(this.k, 0, new defpackage.muz(this, (aoln) null, 8), 3);
    }

    public final ajcq b() {
        return aosv.F(this.k, 0, new defpackage.muz(this, (aoln) null, 9, (byte[]) null), 3);
    }
}
