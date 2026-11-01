package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class yvy implements defpackage.yvp {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/callcoreshared/sharpie/impl/modelparameters/sony/SharpieSonyModelParametersProvider");
    private final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final defpackage.aoin e;
    private final defpackage.aoin f;

    public yvy(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5) {
        defpackage.aooh.f(aoinVar, "sonyAiCoreMinApkVersion");
        defpackage.aooh.f(aoinVar2, "sonyAiCoreModelVersion");
        defpackage.aooh.f(aoinVar3, "sonyHadesIntentPolicyId");
        defpackage.aooh.f(aoinVar4, "sonyMaxWordCount");
        defpackage.aooh.f(aoinVar5, "sonyMinWordCount");
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
        this.f = aoinVar5;
    }

    @Override // defpackage.yvp
    public final yvq a() {
        ((defpackage.aimw) a.b().l("com/google/android/callcoreshared/sharpie/impl/modelparameters/sony/SharpieSonyModelParametersProvider", "getModelParameters", 30, "SharpieSonyModelParametersProvider.kt")).v("Getting config for Sony.");
        java.lang.Object objA = this.b.a();
        defpackage.aooh.e(objA, "get(...)");
        long jLongValue = ((java.lang.Number) objA).longValue();
        java.lang.Object objA2 = this.c.a();
        defpackage.aooh.e(objA2, "get(...)");
        long jLongValue2 = ((java.lang.Number) objA2).longValue();
        java.lang.Object objA3 = this.d.a();
        defpackage.aooh.e(objA3, "get(...)");
        long jLongValue3 = ((java.lang.Number) objA3).longValue();
        java.lang.Object objA4 = this.e.a();
        defpackage.aooh.e(objA4, "get(...)");
        long jLongValue4 = ((java.lang.Number) objA4).longValue();
        java.lang.Object objA5 = this.f.a();
        defpackage.aooh.e(objA5, "get(...)");
        return new yvq(jLongValue, jLongValue2, jLongValue3, jLongValue4, ((java.lang.Number) objA5).longValue());
    }
}
