package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hpp extends defpackage.ub {
    public final zpm f;
    public final gpd g;
    private final defpackage.hhs h;
    private final defpackage.hhl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpp(defpackage.tt ttVar, aonj aonjVar, aomy aomyVar, zpm zpmVar, gpd gpdVar) {
        super(ttVar);
        aooh.f(ttVar, "carContext");
        aooh.f(aonjVar, "dtmfTonesKeyDown");
        aooh.f(aomyVar, "dtmfToneKeysUp");
        aooh.f(zpmVar, "callScopes");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.f = zpmVar;
        this.g = gpdVar;
        this.h = new defpackage.hpl();
        this.b.c(new defpackage.hpm(this));
        this.i = new defpackage.hpn(aonjVar, aomyVar, 0);
    }

    @Override // defpackage.ub
    public final defpackage.ze a() {
        defpackage.vw vwVar = new defpackage.vw();
        vwVar.c(new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(this.a, 2131231338))));
        vwVar.b(androidx.car.app.model.CarColor.RED);
        vwVar.d(new defpackage.hpi(this, 2));
        defpackage.hhr hhrVar = new defpackage.hhr(vwVar.a(), this.h);
        defpackage.xc xcVar = new defpackage.xc();
        xcVar.c(androidx.car.app.model.Action.BACK);
        hhrVar.a = xcVar.a();
        hhrVar.b(this.i);
        return hhrVar.a();
    }

    public final defpackage.hpo d() {
        j$.util.Optional optionalH = this.f.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        apqr apqrVar = (apqr) aooh.q(optionalH);
        if (apqrVar != null) {
            return (defpackage.hpo) apqrVar.a(defpackage.hpo.class);
        }
        return null;
    }
}
