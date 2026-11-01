package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ocq {
    public static final aimz a = aimz.i("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener");
    public final aoss b;
    public final defpackage.mba c;
    public final defpackage.odl d;
    public final defpackage.ocu e;
    public final aoin f;
    public boolean g;
    public final defpackage.znb h;
    public final zpz i;
    public final apdp j;
    public final tkl k;
    public final tkl l;
    private final aolr m;

    public ocq(zpz zpzVar, aolr aolrVar, aoss aossVar, defpackage.mba mbaVar, defpackage.odl odlVar, defpackage.ocu ocuVar, tkl tklVar, tkl tklVar2, aoin aoinVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(odlVar, "satelliteSOSTelephonyInfoCache");
        aooh.f(ocuVar, "satelliteFeaturePromoController");
        aooh.f(tklVar, "inCallUiVisibilityProvider");
        aooh.f(aoinVar, "cancelSatelliteCuiWhenUiNotVisible");
        this.i = zpzVar;
        this.m = aolrVar;
        this.b = aossVar;
        this.c = mbaVar;
        this.d = odlVar;
        this.e = ocuVar;
        this.k = tklVar;
        this.l = tklVar2;
        this.f = aoinVar;
        this.j = new apdp();
        this.h = new defpackage.ocn(this, 0);
    }

    public final java.lang.Object a(aoln aolnVar) {
        return aoov.aj(this.m, new defpackage.hnj(this, (aoln) null, 18), aolnVar);
    }
}
