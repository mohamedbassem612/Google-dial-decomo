package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rsu implements defpackage.rst {
    public final defpackage.rsy a;
    private final defpackage.aoss b;
    private final defpackage.rlv c;
    private final defpackage.gpd d;
    private final defpackage.aogc e;

    public rsu(defpackage.aazc aazcVar, defpackage.aoss aossVar, defpackage.rsy rsyVar, defpackage.aogc aogcVar, defpackage.rlv rlvVar, defpackage.gpd gpdVar) {
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("resultPropagator");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        this.b = aossVar;
        this.a = rsyVar;
        this.e = aogcVar;
        this.c = rlvVar;
        this.d = gpdVar;
    }

    @Override // defpackage.rst
    public final void a(defpackage.rsd rsdVar) {
        defpackage.aooh.f(rsdVar, "key");
        this.c.o(defpackage.rmx.MARQUEE_DISMISSED);
        this.d.i(null).b(defpackage.mce.USER_CLICKED_DISMISS_BUTTON_ON_BANNER);
        j$.time.Instant instantNow = j$.time.Instant.now();
        defpackage.aooh.e(instantNow, "instant(...)");
        this.e.s(defpackage.aosv.F(this.b, 0, new rjk(this, rsdVar, defpackage.aooc.au(instantNow), (defpackage.aoln) null, 3), 3), rsz.a);
    }

    @Override // defpackage.rst
    public final void b(defpackage.rsd rsdVar) {
        defpackage.aoov.an(this.b, null, 0, new hxq(this, rsdVar, (defpackage.aoln) null, 6), 3);
    }
}
