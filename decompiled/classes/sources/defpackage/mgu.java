package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mgu {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/debug/dump/event/scoped/ScopedDiffRecorder");
    public final defpackage.mfv a;
    private final defpackage.aoin c;

    public mgu(defpackage.mfv mfvVar, defpackage.aoin aoinVar) {
        new j$.util.concurrent.ConcurrentHashMap();
        this.a = mfvVar;
        this.c = aoinVar;
    }

    public final defpackage.mgf a(java.util.function.Supplier supplier) {
        return new defpackage.mgf(this, ((java.lang.Boolean) aa$.ExternalSyntheticApiModelOutline1.m(supplier)).booleanValue());
    }

    public final mgj b(java.util.function.Function function) {
        amdx amdxVar = new amdx((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        return new mgj(this, aa$.ExternalSyntheticApiModelOutline1.m(function, amdxVar), (java.lang.String) amdxVar.a);
    }

    public final defpackage.mgr c(java.util.function.Supplier supplier) {
        return new defpackage.mgr(this, (j$.util.Optional) aa$.ExternalSyntheticApiModelOutline1.m(supplier));
    }

    public final mgt d(java.util.function.Supplier supplier) {
        return new mgt(this, (java.lang.String) aa$.ExternalSyntheticApiModelOutline1.m(supplier));
    }

    public final void e() {
        this.a.a();
    }

    public final void f(java.lang.Object obj, java.lang.Object obj2, defpackage.mfx mfxVar) {
        if (((java.lang.Boolean) this.c.a()).booleanValue() && mfxVar.a(obj).isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/debug/dump/event/scoped/ScopedDiffRecorder", "record", 80, "ScopedDiffRecorder.java")).I("event: %s, parameter: %s", obj2, ((defpackage.kaw) mfxVar.a(obj).orElse(new defpackage.kaw(defpackage.mhc.a))).a);
        }
        this.a.a();
    }

    public final mgt g(java.util.function.Supplier supplier) {
        return new mgt(this, (defpackage.ajcq) aa$.ExternalSyntheticApiModelOutline1.m(supplier));
    }

    public final defpackage.mgr h(java.util.function.Supplier supplier) {
        return new defpackage.mgr(this, aa$.ExternalSyntheticApiModelOutline1.m(supplier));
    }
}
