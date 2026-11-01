package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nex implements defpackage.ouh {
    private static final aimz g = aimz.i("com/android/dialer/dobby/impl/service/DobbyPostScreeningFirstChipClickedListener");
    public final defpackage.nbr a;
    public final defpackage.mqt b;
    public final defpackage.nqh c;
    public final defpackage.mba d;
    public final defpackage.ogj e;
    public final pgi f;
    private final aoss h;
    private final aoin i;

    public nex(aoss aossVar, defpackage.nbr nbrVar, defpackage.mqt mqtVar, defpackage.nqh nqhVar, pgi pgiVar, defpackage.mba mbaVar, defpackage.ogj ogjVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(nqhVar, "dobbySpam");
        aooh.f(ogjVar, "state");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.h = aossVar;
        this.a = nbrVar;
        this.b = mqtVar;
        this.c = nqhVar;
        this.f = pgiVar;
        this.d = mbaVar;
        this.e = ogjVar;
        this.i = aoinVar;
    }

    @Override // defpackage.ouh
    public final void a() {
        g.b().l("com/android/dialer/dobby/impl/service/DobbyPostScreeningFirstChipClickedListener", "onChipClicked", 41, "DobbyPostScreeningFirstChipClickedListener.kt").v("dobby first reply chip clicked");
        b(this.h, new defpackage.auk(this, (aoln) null, 5));
    }

    public final void b(aoss aossVar, aonn aonnVar) {
        if (((java.lang.Boolean) this.i.a()).booleanValue()) {
            aoov.an(aossVar, (aolr) null, 0, new defpackage.itj(aonnVar, (aoln) null, 15, (byte[][]) null), 3);
            return;
        }
        aimz aimzVar = zih.a;
        aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, aonnVar, 14, (float[]) null));
    }
}
