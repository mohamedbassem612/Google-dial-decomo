package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nwj {
    public final java.lang.Object a;

    public nwj(zpm zpmVar) {
        aooh.f(zpmVar, "callScopes");
        this.a = zpmVar;
    }

    public final /* synthetic */ defpackage.nlw A() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nlw) aladVarP;
    }

    public final void B(alwy alwyVar) {
        aooh.f(alwyVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nlw nlwVar = (defpackage.nlw) akzxVar.b;
        defpackage.nlw nlwVar2 = defpackage.nlw.a;
        j$.util.Objects.requireNonNull(alwyVar);
        nlwVar.c = alwyVar;
        nlwVar.b |= 1;
    }

    public final /* synthetic */ defpackage.nlu C() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nlu) aladVarP;
    }

    public final void D() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nlu nluVar = (defpackage.nlu) akzxVar.b;
        defpackage.nlu nluVar2 = defpackage.nlu.a;
        nluVar.b |= 1;
        nluVar.c = false;
    }

    public final /* synthetic */ defpackage.nlt E() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nlt) aladVarP;
    }

    public final void F(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nlt nltVar = (defpackage.nlt) akzxVar.b;
        defpackage.nlt nltVar2 = defpackage.nlt.a;
        nltVar.b = z;
    }

    public final /* synthetic */ defpackage.nve a() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nve) aladVarP;
    }

    public final void b(defpackage.nmo nmoVar) {
        aooh.f(nmoVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nve nveVar = (defpackage.nve) akzxVar.b;
        defpackage.nve nveVar2 = defpackage.nve.a;
        nveVar.b = nmoVar.a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [aonj, java.lang.Object] */
    public final defpackage.obd c(defpackage.obf obfVar) {
        if (obfVar == null) {
            return null;
        }
        j$.util.Optional optionalE = ((zpm) this.a).e(obfVar.g);
        defpackage.nzu nzuVar = new defpackage.nzu(new defpackage.mws(13), 7);
        if (true == optionalE.isPresent()) {
            optionalE = j$.util.Optional.ofNullable(nzuVar.a.a(optionalE.get()));
        }
        return (defpackage.obd) optionalE.orElse((java.lang.Object) null);
    }

    public final /* synthetic */ defpackage.nvg d() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nvg) aladVarP;
    }

    public final void e(defpackage.nve nveVar) {
        aooh.f(nveVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nvg nvgVar = (defpackage.nvg) akzxVar.b;
        defpackage.nvg nvgVar2 = defpackage.nvg.a;
        j$.util.Objects.requireNonNull(nveVar);
        nvgVar.c = nveVar;
        nvgVar.b = 1;
    }

    public final /* synthetic */ defpackage.ntd f() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ntd) aladVarP;
    }

    public final void g(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ntd ntdVar = (defpackage.ntd) akzxVar.b;
        defpackage.ntd ntdVar2 = defpackage.ntd.a;
        j$.util.Objects.requireNonNull(str);
        ntdVar.c = str;
    }

    public final void h(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ntd ntdVar = (defpackage.ntd) akzxVar.b;
        defpackage.ntd ntdVar2 = defpackage.ntd.a;
        j$.util.Objects.requireNonNull(str);
        ntdVar.b |= 1;
        ntdVar.e = str;
    }

    public final void i(defpackage.ntc ntcVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ntd ntdVar = (defpackage.ntd) akzxVar.b;
        defpackage.ntd ntdVar2 = defpackage.ntd.a;
        ntdVar.d = ntcVar.a();
    }

    public final /* synthetic */ defpackage.nst j() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nst) aladVarP;
    }

    public final /* synthetic */ alct k() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.nst) ((akzx) this.a).b).b);
        aooh.e(listUnmodifiableList, "getEntriesList(...)");
        return new alct(listUnmodifiableList);
    }

    public final /* synthetic */ void l(defpackage.nsj nsjVar) {
        aooh.f(nsjVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nst nstVar = (defpackage.nst) akzxVar.b;
        defpackage.nst nstVar2 = defpackage.nst.a;
        j$.util.Objects.requireNonNull(nsjVar);
        nstVar.b();
        nstVar.b.add(nsjVar);
    }

    public final /* synthetic */ nog m() {
        nog nogVarP = ((akzx) this.a).p();
        aooh.e(nogVarP, "build(...)");
        return nogVarP;
    }

    public final void n(defpackage.igp igpVar) {
        aooh.f(igpVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        nog nogVar = akzxVar.b;
        nog nogVar2 = nog.a;
        j$.util.Objects.requireNonNull(igpVar);
        nogVar.e = igpVar;
        nogVar.b |= 4;
    }

    public final void o(defpackage.noj nojVar) {
        aooh.f(nojVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        nog nogVar = akzxVar.b;
        nog nogVar2 = nog.a;
        j$.util.Objects.requireNonNull(nojVar);
        nogVar.g = nojVar;
        nogVar.b |= 16;
    }

    public final void p(alcf alcfVar) {
        aooh.f(alcfVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        nog nogVar = akzxVar.b;
        nog nogVar2 = nog.a;
        j$.util.Objects.requireNonNull(alcfVar);
        nogVar.c = alcfVar;
        nogVar.b |= 1;
    }

    public final void q(tyz tyzVar) {
        aooh.f(tyzVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        nog nogVar = akzxVar.b;
        nog nogVar2 = nog.a;
        j$.util.Objects.requireNonNull(tyzVar);
        nogVar.d = tyzVar;
        nogVar.b |= 2;
    }

    public final void r(defpackage.ntd ntdVar) {
        aooh.f(ntdVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        nog nogVar = akzxVar.b;
        nog nogVar2 = nog.a;
        j$.util.Objects.requireNonNull(ntdVar);
        nogVar.f = ntdVar;
        nogVar.b |= 8;
    }

    public final /* synthetic */ defpackage.nmu s() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nmu) aladVarP;
    }

    public final /* synthetic */ defpackage.nmj t() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nmj) aladVarP;
    }

    public final void u() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nmj nmjVar = (defpackage.nmj) akzxVar.b;
        defpackage.nmj nmjVar2 = defpackage.nmj.a;
        nmjVar.b |= 1;
        nmjVar.c = true;
    }

    public final /* synthetic */ defpackage.nme v() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nme) aladVarP;
    }

    public final void w(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nme nmeVar = (defpackage.nme) akzxVar.b;
        defpackage.nme nmeVar2 = defpackage.nme.a;
        nmeVar.d = z;
    }

    public final void x(alwf alwfVar) {
        aooh.f(alwfVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nme nmeVar = (defpackage.nme) akzxVar.b;
        defpackage.nme nmeVar2 = defpackage.nme.a;
        j$.util.Objects.requireNonNull(alwfVar);
        nmeVar.c = alwfVar;
        nmeVar.b |= 1;
    }

    public final /* synthetic */ defpackage.nmc y() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.nmc) aladVarP;
    }

    public final void z(defpackage.nms nmsVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.nmc nmcVar = (defpackage.nmc) akzxVar.b;
        defpackage.nmc nmcVar2 = defpackage.nmc.a;
        nmcVar.b = nmsVar.a();
    }

    public nwj(defpackage.nwh nwhVar) {
        this.a = nwhVar;
    }

    public nwj(akzx akzxVar) {
        this.a = akzxVar;
    }
}
