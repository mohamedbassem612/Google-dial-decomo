package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahbb {
    public static final defpackage.ahbb a = new defpackage.ahbb(new defpackage.abnb(12), 2, null, false);
    public static final defpackage.ahbb b = new defpackage.ahbb(new defpackage.abnb(13), 2, null, false);
    public static final defpackage.ahbb c = new defpackage.ahbb(new defpackage.abnb(14), 2, null, true);
    public final defpackage.aomy d;
    public final defpackage.albh e;
    public final boolean f;
    public final int g;

    public ahbb(defpackage.aomy aomyVar, int i, defpackage.albh albhVar, boolean z) {
        this.d = aomyVar;
        this.g = i;
        this.e = albhVar;
        this.f = z;
    }

    public final double a() {
        java.lang.Object objA = this.d.a();
        defpackage.aooh.d(objA, "null cannot be cast to non-null type kotlin.Double");
        return ((java.lang.Double) objA).doubleValue();
    }

    public final long b() {
        java.lang.Object objA = this.d.a();
        if (objA == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Long");
        }
        return ((java.lang.Long) objA).longValue();
    }

    public final defpackage.albh c() {
        java.lang.Object objA = this.d.a();
        if (objA == null) {
            defpackage.aooh.h("null cannot be cast to non-null type T of com.google.apps.tiktok.experiments.FlagValueHolder.getProtoValue");
        }
        return (defpackage.albh) objA;
    }

    public final java.lang.String d() {
        java.lang.Object objA = this.d.a();
        if (objA == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
        }
        return (java.lang.String) objA;
    }

    public final boolean e() {
        java.lang.Object objA = this.d.a();
        if (objA == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Boolean");
        }
        return ((java.lang.Boolean) objA).booleanValue();
    }
}
