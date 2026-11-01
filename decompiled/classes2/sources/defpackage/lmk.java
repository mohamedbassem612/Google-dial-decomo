package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lmk {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/ui/CallScreenFragmentPeer");
    public final defpackage.lmc b;
    public final rlv c;
    public final pnb d;
    public final defpackage.lmb e;
    public final aoin f;
    public final urs g;
    public final agzc h;
    public final defpackage.odo i;
    public final ahpz j;
    public j$.util.Optional k;
    public boolean m;
    boolean n;
    public final gpd p;
    public final afpl r;
    public final aogc s;
    private final defpackage.oq t;
    public boolean l = true;
    final defpackage.odm o = new defpackage.lmh(this);
    public final rai q = new rai(this);

    public lmk(defpackage.lmc lmcVar, rlv rlvVar, afpl afplVar, pnb pnbVar, defpackage.lmb lmbVar, defpackage.oq oqVar, aoin aoinVar, urs ursVar, gpd gpdVar, aogc aogcVar, agzc agzcVar, defpackage.odo odoVar, ahpz ahpzVar) {
        this.b = lmcVar;
        this.c = rlvVar;
        this.r = afplVar;
        this.d = pnbVar;
        this.e = lmbVar;
        this.t = oqVar;
        this.f = aoinVar;
        this.g = ursVar;
        this.p = gpdVar;
        this.s = aogcVar;
        this.h = agzcVar;
        this.i = odoVar;
        this.j = ahpzVar;
    }

    public final j$.util.Optional a() {
        if (!this.k.isPresent()) {
            return j$.util.Optional.empty();
        }
        j$.util.Optional optionalE = ((zpm) this.t.a).e(((defpackage.lex) this.k.orElseThrow()).c);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((defpackage.lew) ((apqr) optionalE.get()).a(defpackage.lew.class)).u()) : optionalE;
    }

    public final void b() {
        this.n = true;
        this.e.w();
        this.c.o(rmx.bx);
    }
}
