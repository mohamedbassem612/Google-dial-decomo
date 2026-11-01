package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nfa implements defpackage.ouh {
    private static final aimz h = aimz.i("com/android/dialer/dobby/impl/service/DobbyPostScreeningSecondChipClickedListener");
    public final aoss a;
    public final defpackage.mqt b;
    public final defpackage.nbr c;
    public final defpackage.nqh d;
    public final defpackage.mba e;
    public final defpackage.ogj f;
    public final pgi g;
    private final aoin i;

    public nfa(aoss aossVar, defpackage.mqt mqtVar, defpackage.nbr nbrVar, pgi pgiVar, defpackage.nqh nqhVar, defpackage.mba mbaVar, defpackage.ogj ogjVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(nqhVar, "dobbySpam");
        aooh.f(ogjVar, "state");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.a = aossVar;
        this.b = mqtVar;
        this.c = nbrVar;
        this.g = pgiVar;
        this.d = nqhVar;
        this.e = mbaVar;
        this.f = ogjVar;
        this.i = aoinVar;
    }

    @Override // defpackage.ouh
    public final void a() {
        h.b().l("com/android/dialer/dobby/impl/service/DobbyPostScreeningSecondChipClickedListener", "onChipClicked", 41, "DobbyPostScreeningSecondChipClickedListener.kt").v("dobby second reply chip clicked");
        b(this.a, new defpackage.hnj(this, (aoln) null, 11));
    }

    public final void b(aoss aossVar, aonn aonnVar) {
        if (((java.lang.Boolean) this.i.a()).booleanValue()) {
            aoov.an(aossVar, (aolr) null, 0, new defpackage.itj(aonnVar, (aoln) null, 17, (char[][]) null), 3);
            return;
        }
        aimz aimzVar = zih.a;
        aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, aonnVar, 16, (byte[][]) null));
    }
}
