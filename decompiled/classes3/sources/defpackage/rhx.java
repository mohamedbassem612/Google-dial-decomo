package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rhx {
    public final java.lang.Object a;

    public rhx() {
        this.a = aoyx.c(0, 1, 0, 4);
    }

    public static final boolean b(android.content.Context context) {
        aooh.f(context, "context");
        return context.getResources().getBoolean(2131034125);
    }

    public static final boolean c(android.content.Context context) {
        aooh.f(context, "context");
        return context.getResources().getBoolean(2131034148);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gqg, java.lang.Object] */
    public final boolean a(android.app.Activity activity) {
        aooh.f(activity, "activity");
        ?? r1 = this.a;
        return (r1.a(activity).a().width() < r1.c(activity).a().width() && !fh$.ExternalSyntheticApiModelOutline0.m(activity)) || c(activity);
    }

    public final j$.util.Optional d(java.lang.String str) {
        j$.util.Optional optionalE = ((zpm) this.a).e(str);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((defpackage.rfb) ((defpackage.apqr) optionalE.get()).a(defpackage.rfb.class)).at()) : optionalE;
    }

    public final /* synthetic */ defpackage.rct e() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.rct) aladVarP;
    }

    public final void f(defpackage.qug qugVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.rct rctVar = (defpackage.rct) akzxVar.b;
        defpackage.rct rctVar2 = defpackage.rct.a;
        rctVar.c = qugVar.H;
        rctVar.b |= 1;
    }

    public final void g(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.rct rctVar = (defpackage.rct) akzxVar.b;
        defpackage.rct rctVar2 = defpackage.rct.a;
        rctVar.b |= 2;
        rctVar.d = i;
    }

    public final void h(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.rct rctVar = (defpackage.rct) akzxVar.b;
        defpackage.rct rctVar2 = defpackage.rct.a;
        rctVar.b |= 4;
        rctVar.e = z;
    }

    public final /* synthetic */ defpackage.rce i() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.rce) aladVarP;
    }

    public final void j(defpackage.rcd rcdVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.rce rceVar = (defpackage.rce) akzxVar.b;
        defpackage.rce rceVar2 = defpackage.rce.a;
        rceVar.c = rcdVar.e;
        rceVar.b |= 1;
    }

    public final void k(defpackage.qtr qtrVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.rce rceVar = (defpackage.rce) akzxVar.b;
        defpackage.rce rceVar2 = defpackage.rce.a;
        rceVar.d = qtrVar.k;
        rceVar.b |= 2;
    }

    public rhx(gqg gqgVar) {
        this.a = gqgVar;
    }

    public rhx(java.lang.Object obj) {
        this.a = obj;
    }

    public rhx(android.content.Context context) {
        aooh.f(context, "appContext");
        this.a = context;
    }
}
