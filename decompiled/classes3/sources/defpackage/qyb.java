package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qyb {
    public static final aimz a = aimz.i("com/android/dialer/incall/voice/culdesac/callassist/ui/CallAssistFragmentPeer");
    public final defpackage.qxx b;
    public final defpackage.agzc c;
    public final odo d;
    public final defpackage.rfv e;
    public final ahpz f;
    public final defpackage.rcw g;
    public final android.content.Context h;
    public final ccp i;
    public boolean j;
    public final zpm k;
    public final defpackage.quy l;
    public final gpd m;
    public final ahbv n;
    public final defpackage.afpl o;
    public final aogc p;

    public qyb(defpackage.qxx qxxVar, zpm zpmVar, defpackage.afpl afplVar, defpackage.agzc agzcVar, odo odoVar, gpd gpdVar, aogc aogcVar, defpackage.rfv rfvVar, ahpz ahpzVar, defpackage.rcw rcwVar, android.content.Context context, ahbv ahbvVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(rfvVar, "errorDialogPresenter");
        aooh.f(ahpzVar, "traceCreation");
        this.b = qxxVar;
        this.k = zpmVar;
        this.o = afplVar;
        this.c = agzcVar;
        this.d = odoVar;
        this.m = gpdVar;
        this.p = aogcVar;
        this.e = rfvVar;
        this.f = ahpzVar;
        this.g = rcwVar;
        this.h = context;
        this.n = ahbvVar;
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.qxo.a, cdu.c);
        this.l = new defpackage.quy(this, 2);
    }

    public final defpackage.qxo a() {
        return (defpackage.qxo) this.i.a();
    }

    public final defpackage.qxz b(java.lang.String str) {
        j$.util.Optional optionalE = this.k.e(str);
        aooh.e(optionalE, "get(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalE);
        if (apqrVar != null) {
            return (defpackage.qxz) apqrVar.a(defpackage.qxz.class);
        }
        return null;
    }

    public final defpackage.rfa c(java.lang.String str) {
        defpackage.qxz qxzVarB = b(str);
        if (qxzVarB != null) {
            return qxzVarB.at();
        }
        return null;
    }
}
