package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ubw {
    public static final aimz a = aimz.i("com/android/dialer/sonic/impl/ui/SonicGridFragmentPeer");
    public final defpackage.ubq b;
    public final defpackage.agzc c;
    public final odo d;
    public final agsm e;
    public final ahpz f;
    public final android.content.Context g;
    public final aoin h;
    public final ccp i;
    public final odm j;
    public final gpd k;
    public final ahbv l;
    public final heq m;
    public final defpackage.afpl n;
    private final zpm o;

    public ubw(defpackage.ubq ubqVar, zpm zpmVar, gpd gpdVar, defpackage.afpl afplVar, defpackage.agzc agzcVar, odo odoVar, heq heqVar, agsm agsmVar, ahpz ahpzVar, android.content.Context context, ahbv ahbvVar, aoin aoinVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(agsmVar, "androidFutures");
        aooh.f(ahpzVar, "traceCreation");
        this.b = ubqVar;
        this.o = zpmVar;
        this.k = gpdVar;
        this.n = afplVar;
        this.c = agzcVar;
        this.d = odoVar;
        this.m = heqVar;
        this.e = agsmVar;
        this.f = ahpzVar;
        this.g = context;
        this.l = ahbvVar;
        this.h = aoinVar;
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.uaa.a, cdu.c);
        this.j = new defpackage.quy(this, 13);
    }

    public final defpackage.tzx a() {
        defpackage.ubt ubtVar;
        j$.util.Optional optionalH = this.o.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
        if (apqrVar == null || (ubtVar = (defpackage.ubt) apqrVar.a(defpackage.ubt.class)) == null) {
            return null;
        }
        return ubtVar.aG();
    }

    public final java.lang.String b() {
        j$.util.Optional optionalH = this.o.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
        if (apqrVar != null) {
            return (java.lang.String) apqrVar.b;
        }
        return null;
    }

    public final defpackage.qbe c() {
        defpackage.ubt ubtVar;
        j$.util.Optional optionalH = this.o.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
        if (apqrVar == null || (ubtVar = (defpackage.ubt) apqrVar.a(defpackage.ubt.class)) == null) {
            return null;
        }
        return ubtVar.cp();
    }
}
