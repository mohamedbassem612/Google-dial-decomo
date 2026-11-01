package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xcq {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/session/AtlasSessionController");
    public final zmq b;
    public final ajct c;
    public final rwi d;
    public final oju e;
    public final defpackage.xcy f;
    public final defpackage.xca g;
    public final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.FALSE);
    public final defpackage.pqm j;
    public final defpackage.ptx k;
    public final defpackage.zip l;
    public final heq m;
    private final defpackage.wxm n;
    private final long o;
    private final defpackage.afpl p;

    public xcq(ajct ajctVar, defpackage.wxm wxmVar, defpackage.zip zipVar, zmq zmqVar, defpackage.pqm pqmVar, defpackage.ptx ptxVar, heq heqVar, defpackage.afpl afplVar, rwi rwiVar, oju ojuVar, long j, defpackage.xcy xcyVar, defpackage.xca xcaVar) {
        this.n = wxmVar;
        this.c = ajctVar;
        this.l = zipVar;
        this.b = zmqVar;
        this.j = pqmVar;
        this.k = ptxVar;
        this.m = heqVar;
        this.p = afplVar;
        this.d = rwiVar;
        this.e = ojuVar;
        this.o = j;
        this.f = xcyVar;
        this.g = xcaVar;
    }

    public final ajcq a() {
        return ahvr.F(new defpackage.wwy(this, 16), this.c);
    }

    public final ajcq b() {
        defpackage.xcp xcpVar = (defpackage.xcp) aooc.ar(this.p.Y(), defpackage.xcp.class);
        ajcq ajcqVarG = xcpVar.g();
        ajcq ajcqVarBl = xcpVar.bl();
        ajcq ajcqVarC = c();
        return ahvr.ak(new ajcq[]{ajcqVarC, ajcqVarG, ajcqVarBl}).p(new kff(this, ajcqVarC, ajcqVarG, ajcqVarBl, 17), this.c);
    }

    public final ajcq c() {
        defpackage.xcp xcpVar = (defpackage.xcp) aooc.ar(this.p.Y(), defpackage.xcp.class);
        defpackage.wwy wwyVar = new defpackage.wwy(this, 17);
        ajct ajctVar = this.c;
        ajcq ajcqVarF = ahvr.F(wwyVar, ajctVar);
        ajcq ajcqVarH = ahrv.g(xcpVar.J()).h(new defpackage.xbh(this, 14), ajctVar);
        return ahvr.ak(new ajcq[]{ajcqVarF, ajcqVarH}).o(new defpackage.wwx((java.lang.Object) this, (java.lang.Object) ajcqVarF, (java.lang.Object) ajcqVarH, 3, (byte[]) null), ajctVar);
    }

    public final ajcq d() {
        a.b().l("com/android/incallui/atlas/ui/impl/tidepods/session/AtlasSessionController", "deactivate", 264, "AtlasSessionController.java").v("using tidepods internal to stop hold for me");
        return ahrv.g(this.f.a(true)).h(new defpackage.xbh(this, 11), this.c);
    }

    public final ajcq e() {
        xbw xbwVar = new xbw(this, 4);
        ajct ajctVar = this.c;
        return ahrv.g(ahvr.G(xbwVar, ajctVar)).h(new defpackage.xbh(this, 13), ajctVar);
    }

    public final j$.util.Optional f() {
        return (j$.util.Optional) this.h.get();
    }

    public final void g(defpackage.alex alexVar) {
        this.n.b(this.o, alexVar);
    }
}
