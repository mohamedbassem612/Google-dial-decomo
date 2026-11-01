package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oyx {
    public final java.lang.Object a;

    public oyx(android.content.Context context, ajct ajctVar) {
        this.a = ahvr.bI(new fff(context, ajctVar, 4, (byte[]) null));
    }

    public final j$.util.Optional a(java.lang.String str) {
        j$.util.Optional optionalE = ((zpm) this.a).e(str);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((defpackage.ozz) ((defpackage.apqr) optionalE.get()).a(defpackage.ozz.class)).cN()) : optionalE;
    }

    public final /* synthetic */ defpackage.pdv b() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.pdv) aladVarP;
    }

    public final void c(defpackage.pdu pduVar) {
        aooh.f(pduVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pdv pdvVar = (defpackage.pdv) akzxVar.b;
        defpackage.pdv pdvVar2 = defpackage.pdv.a;
        j$.util.Objects.requireNonNull(pduVar);
        pdvVar.c = pduVar;
        pdvVar.b = 2;
    }

    public final /* synthetic */ defpackage.pdu d() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.pdu) aladVarP;
    }

    public final void e(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pdu pduVar = (defpackage.pdu) akzxVar.b;
        defpackage.pdu pduVar2 = defpackage.pdu.a;
        j$.util.Objects.requireNonNull(str);
        pduVar.b |= 8;
        pduVar.f = str;
    }

    public final void f(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pdu pduVar = (defpackage.pdu) akzxVar.b;
        defpackage.pdu pduVar2 = defpackage.pdu.a;
        pduVar.b |= 1;
        pduVar.c = f;
    }

    public final void g(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pdu pduVar = (defpackage.pdu) akzxVar.b;
        defpackage.pdu pduVar2 = defpackage.pdu.a;
        pduVar.b |= 2;
        pduVar.d = f;
    }

    public final void h(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pdu pduVar = (defpackage.pdu) akzxVar.b;
        defpackage.pdu pduVar2 = defpackage.pdu.a;
        pduVar.b |= 4;
        pduVar.e = f;
    }

    public final void i(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pdu pduVar = (defpackage.pdu) akzxVar.b;
        defpackage.pdu pduVar2 = defpackage.pdu.a;
        pduVar.g = a.aU(i);
        pduVar.b |= 16;
    }

    public final /* synthetic */ defpackage.pcu j() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.pcu) aladVarP;
    }

    public final void k(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pcu pcuVar = (defpackage.pcu) akzxVar.b;
        defpackage.pcu pcuVar2 = defpackage.pcu.a;
        pcuVar.b |= 1;
        pcuVar.c = z;
    }

    public final j$.util.Optional l() {
        return j$.util.Optional.ofNullable(((android.telecom.Call) this.a).getVideoCall());
    }

    public final /* synthetic */ defpackage.pmp m() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.pmp) aladVarP;
    }

    public final /* synthetic */ defpackage.pgg n() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.pgg) aladVarP;
    }

    public final void o(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pgg pggVar = (defpackage.pgg) akzxVar.b;
        defpackage.pgg pggVar2 = defpackage.pgg.a;
        j$.util.Objects.requireNonNull(str);
        pggVar.b |= 1;
        pggVar.c = str;
    }

    public final void p(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pgg pggVar = (defpackage.pgg) akzxVar.b;
        defpackage.pgg pggVar2 = defpackage.pgg.a;
        pggVar.b |= 2;
        pggVar.d = i;
    }

    public final void q(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pgg pggVar = (defpackage.pgg) akzxVar.b;
        defpackage.pgg pggVar2 = defpackage.pgg.a;
        pggVar.b |= 32;
        pggVar.h = z;
    }

    public final void r(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pgg pggVar = (defpackage.pgg) akzxVar.b;
        defpackage.pgg pggVar2 = defpackage.pgg.a;
        pggVar.b |= 16;
        pggVar.g = z;
    }

    public final void s(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.pgg pggVar = (defpackage.pgg) akzxVar.b;
        defpackage.pgg pggVar2 = defpackage.pgg.a;
        j$.util.Objects.requireNonNull(str);
        pggVar.b |= 4;
        pggVar.e = str;
    }

    public final defpackage.peh t(defpackage.pdu pduVar, java.lang.String str, boolean z) {
        aooh.f(pduVar, "backgroundImage");
        java.lang.String str2 = pduVar.f;
        aooh.e(str2, "getImageUri(...)");
        android.net.Uri uri = android.net.Uri.parse(str2);
        aooh.e(uri, "parse(...)");
        return new defpackage.peh(uri, pduVar.d, pduVar.e, pduVar.c, z, new obp(this, str, pduVar, 4), new obp(this, str, pduVar, 5));
    }

    public oyx(java.lang.Object obj) {
        this.a = obj;
    }

    public oyx(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public oyx(zpm zpmVar, byte[] bArr) {
        aooh.f(zpmVar, "callScopes");
        this.a = zpmVar;
    }

    public oyx() {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    public oyx(android.content.Context context) {
        aooh.f(context, "appContext");
        this.a = context;
    }
}
