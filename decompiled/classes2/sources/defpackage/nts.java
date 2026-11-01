package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nts {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/ui/DobbyInCallFragmentPeer");
    public final defpackage.ntk b;
    public final agtj c;
    public final aoss d;
    public final urs e;
    public final aoin f;
    public final agtk g;
    public final agtk h;
    public final agtk i;
    public final agtk j;
    public final agtk k;
    private final gpd l;
    private final zoe m;
    private final rsr n;

    public nts(defpackage.ntk ntkVar, apjb apjbVar, afpl afplVar, agtj agtjVar, rsr rsrVar, gpd gpdVar, aoss aossVar, urs ursVar, aoin aoinVar) {
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "enableSyncingStatusBarAppearanceToTheme");
        this.b = ntkVar;
        this.c = agtjVar;
        this.n = rsrVar;
        this.l = gpdVar;
        this.d = aossVar;
        this.e = ursVar;
        this.f = aoinVar;
        this.m = apjbVar.G(2131428046, afplVar.aa(defpackage.ntl.class, new defpackage.lme(4)));
        this.g = new defpackage.ntn();
        this.h = new defpackage.ntm();
        this.i = new defpackage.ntr();
        this.j = new defpackage.ntp();
        this.k = new defpackage.ntq();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aonj, java.lang.Object] */
    public final defpackage.mqt a() {
        defpackage.mto mtoVarB = b();
        java.lang.String str = mtoVarB != null ? mtoVarB.a : null;
        if (str == null) {
            return null;
        }
        j$.util.Optional optionalE = ((zpm) this.n.b).e(str);
        defpackage.kdb kdbVar = new defpackage.kdb(new defpackage.mws(3), 19);
        if (true == optionalE.isPresent()) {
            optionalE = j$.util.Optional.ofNullable(kdbVar.a.a(optionalE.get()));
        }
        aooh.e(optionalE, "map(...)");
        return (defpackage.mqt) aooh.q(optionalE);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [cer, java.lang.Object] */
    public final defpackage.mto b() {
        ahad ahadVar = (ahae) this.m.a.a();
        if (ahadVar == null) {
            return null;
        }
        j$.util.Objects.checkIndex(0, 3);
        if (ahadVar instanceof ahad) {
            return (defpackage.mto) aooh.q((j$.util.Optional) ahadVar.a);
        }
        if (!(ahadVar instanceof ahab)) {
            return null;
        }
        a.d().k(((ahab) ahadVar).a).l("com/android/dialer/dobby/impl/ui/DobbyInCallFragmentPeer", "dobbyModel$<anonymous>", 94, "DobbyInCallFragmentPeer.kt").v("Error loading dobby model.");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aonj, java.lang.Object] */
    public final defpackage.nbv c() {
        defpackage.mto mtoVarB = b();
        java.lang.String str = mtoVarB != null ? mtoVarB.a : null;
        if (str == null) {
            return null;
        }
        j$.util.Optional optionalE = ((zpm) this.n.b).e(str);
        defpackage.kdb kdbVar = new defpackage.kdb(new defpackage.mws(2), 18);
        if (true == optionalE.isPresent()) {
            optionalE = j$.util.Optional.ofNullable(kdbVar.a.a(optionalE.get()));
        }
        aooh.e(optionalE, "map(...)");
        return (defpackage.nbv) aooh.q(optionalE);
    }

    public final void d(mce mceVar) {
        defpackage.mto mtoVarB = b();
        this.l.i(mtoVarB != null ? mtoVarB.a : null).b(mceVar);
    }

    public final void e() {
        if (c() == null) {
            d(mce.cr);
            return;
        }
        agtj agtjVar = this.c;
        defpackage.nbv nbvVarC = c();
        agtjVar.i(zoe.N(nbvVarC != null ? nbvVarC.a(ruc.bt, new defpackage.kqu(nbvVarC, (aoln) null, 11, (byte[]) null)) : null), this.k);
    }
}
