package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qyv {
    public static final aimz a = aimz.i("com/android/dialer/incall/voice/culdesac/ui/CuldesacFragmentPeer");
    public final defpackage.qys b;
    public final defpackage.agzc c;
    public final odo d;
    public final ahpz e;
    public final android.content.Context f;
    public final ccp g;
    public final defpackage.quy h;
    public final ahbv i;
    public final defpackage.afpl j;
    public final aogc k;
    private final zpm l;

    public qyv(defpackage.qys qysVar, zpm zpmVar, defpackage.afpl afplVar, defpackage.agzc agzcVar, odo odoVar, aogc aogcVar, ahpz ahpzVar, android.content.Context context, ahbv ahbvVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(ahpzVar, "traceCreation");
        this.b = qysVar;
        this.l = zpmVar;
        this.j = afplVar;
        this.c = agzcVar;
        this.d = odoVar;
        this.k = aogcVar;
        this.e = ahpzVar;
        this.f = context;
        this.i = ahbvVar;
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.qyr.a, cdu.c);
        this.h = new defpackage.quy(this, 3);
    }

    public final defpackage.qym a(java.lang.String str) {
        defpackage.qyt qytVar;
        j$.util.Optional optionalE = this.l.e(str);
        aooh.e(optionalE, "get(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalE);
        if (apqrVar == null || (qytVar = (defpackage.qyt) apqrVar.a(defpackage.qyt.class)) == null) {
            return null;
        }
        return qytVar.ar();
    }

    public final defpackage.qyr b() {
        return (defpackage.qyr) this.g.a();
    }
}
