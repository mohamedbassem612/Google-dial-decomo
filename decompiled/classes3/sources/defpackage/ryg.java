package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryg {
    public final java.lang.Object a;

    public ryg(android.content.Context context) {
        aooh.f(context, "appContext");
        this.a = context;
    }

    public final /* synthetic */ sfd a() {
        sfd sfdVarP = ((akzx) this.a).p();
        aooh.e(sfdVarP, "build(...)");
        return sfdVarP;
    }

    public final /* synthetic */ defpackage.sko b() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.sko) aladVarP;
    }

    public final void c(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.sko skoVar = (defpackage.sko) akzxVar.b;
        defpackage.sko skoVar2 = defpackage.sko.a;
        skoVar.b |= 16;
        skoVar.g = f;
    }

    public final void d(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.sko skoVar = (defpackage.sko) akzxVar.b;
        defpackage.sko skoVar2 = defpackage.sko.a;
        skoVar.b |= 1;
        skoVar.c = f;
    }

    public final void e(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.sko skoVar = (defpackage.sko) akzxVar.b;
        defpackage.sko skoVar2 = defpackage.sko.a;
        skoVar.b |= 4;
        skoVar.e = i;
    }

    public final void f(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.sko skoVar = (defpackage.sko) akzxVar.b;
        defpackage.sko skoVar2 = defpackage.sko.a;
        skoVar.b |= 2;
        skoVar.d = f;
    }

    public final void g() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.sko skoVar = (defpackage.sko) akzxVar.b;
        defpackage.sko skoVar2 = defpackage.sko.a;
        skoVar.b |= 8;
        skoVar.f = 0;
    }

    public final void h(int i) {
        ((az) this.a).findViewById(2131427477).setVisibility(i);
    }

    public final /* synthetic */ defpackage.rvo i() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.rvo) aladVarP;
    }

    public final void j(defpackage.rve rveVar) {
        aooh.f(rveVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.rvo rvoVar = (defpackage.rvo) akzxVar.b;
        defpackage.rvo rvoVar2 = defpackage.rvo.a;
        j$.util.Objects.requireNonNull(rveVar);
        rvoVar.c = rveVar;
        rvoVar.b = 10;
    }

    public final void k(defpackage.rvc rvcVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.rvo rvoVar = (defpackage.rvo) akzxVar.b;
        defpackage.rvo rvoVar2 = defpackage.rvo.a;
        rvoVar.d = rvcVar.a();
    }

    public final /* synthetic */ defpackage.rve l() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.rve) aladVarP;
    }

    public final void m() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.rve rveVar = (defpackage.rve) akzxVar.b;
        defpackage.rve rveVar2 = defpackage.rve.a;
        rveVar.b = true;
    }

    public final /* synthetic */ defpackage.rvq n() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.rvq) aladVarP;
    }

    public final void o(defpackage.rvo rvoVar) {
        aooh.f(rvoVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.rvq rvqVar = (defpackage.rvq) akzxVar.b;
        defpackage.rvq rvqVar2 = defpackage.rvq.a;
        j$.util.Objects.requireNonNull(rvoVar);
        rvqVar.d = rvoVar;
        rvqVar.c = 2;
    }

    public ryg(akzx akzxVar) {
        this.a = akzxVar;
    }

    public ryg(az azVar) {
        aooh.f(azVar, "activity");
        this.a = azVar;
    }

    public ryg(com.android.dialer.patrick.account.sharing.ui.CallingCardSharingActivity callingCardSharingActivity) {
        this.a = callingCardSharingActivity;
    }
}
