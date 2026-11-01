package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hwn {
    public final defpackage.hwl a;
    public defpackage.huv b;
    public defpackage.huv c;
    public final defpackage.agze d;
    public final gpd e;
    private final zpm f;
    private final defpackage.her g;

    public hwn(defpackage.hwl hwlVar, defpackage.her herVar, zpm zpmVar, defpackage.agze agzeVar, gpd gpdVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(agzeVar, "assistedEmergencyDialingRetainedState");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.a = hwlVar;
        this.g = herVar;
        this.f = zpmVar;
        this.d = agzeVar;
        this.e = gpdVar;
    }

    public final int a() {
        return urg.c(this.a.z(), 2130969107);
    }

    public final android.view.View b() {
        android.view.View viewFindViewById = this.a.N().findViewById(2131428102);
        aooh.e(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aonj, java.lang.Object] */
    public final defpackage.hvc c() {
        defpackage.huv huvVar = this.b;
        if (huvVar == null) {
            return null;
        }
        defpackage.her herVar = this.g;
        j$.util.Optional optionalE = ((zpm) herVar.a).e(huvVar.c);
        defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.guv(10), 0);
        if (true == optionalE.isPresent()) {
            optionalE = j$.util.Optional.ofNullable(hvdVar.a.a(optionalE.get()));
        }
        return (defpackage.hvc) optionalE.orElse((java.lang.Object) null);
    }

    public final defpackage.hws d() {
        aw awVarE = this.a.I().e("emergency_voice_assist");
        if (awVarE instanceof defpackage.hws) {
            return (defpackage.hws) awVarE;
        }
        return null;
    }

    public final qbe e() {
        java.lang.String str;
        apqr apqrVar;
        defpackage.hwm hwmVar;
        defpackage.huv huvVar = this.b;
        if (huvVar == null || (str = huvVar.c) == null || (apqrVar = (apqr) this.f.e(str).orElse((java.lang.Object) null)) == null || (hwmVar = (defpackage.hwm) apqrVar.a(defpackage.hwm.class)) == null) {
            return null;
        }
        return hwmVar.cp();
    }
}
