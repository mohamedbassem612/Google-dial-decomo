package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yvt implements yvp {
    private static final aimz a = aimz.i("com/google/android/callcoreshared/sharpie/impl/modelparameters/oppo/SharpieOppoModelParametersProvider");
    private final aoin b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final aoin f;

    public yvt(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5) {
        aooh.f(aoinVar, "oppoAiCoreMinApkVersion");
        aooh.f(aoinVar2, "oppoAiCoreModelVersion");
        aooh.f(aoinVar3, "oppoHadesIntentPolicyId");
        aooh.f(aoinVar4, "oppoMaxWordCount");
        aooh.f(aoinVar5, "oppoMinWordCount");
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
        this.f = aoinVar5;
    }

    public final defpackage.yvq a() {
        a.b().l("com/google/android/callcoreshared/sharpie/impl/modelparameters/oppo/SharpieOppoModelParametersProvider", "getModelParameters", 30, "SharpieOppoModelParametersProvider.kt").v("Getting config for Oppo.");
        java.lang.Object objA = this.b.a();
        aooh.e(objA, "get(...)");
        long jLongValue = ((java.lang.Number) objA).longValue();
        java.lang.Object objA2 = this.c.a();
        aooh.e(objA2, "get(...)");
        long jLongValue2 = ((java.lang.Number) objA2).longValue();
        java.lang.Object objA3 = this.d.a();
        aooh.e(objA3, "get(...)");
        long jLongValue3 = ((java.lang.Number) objA3).longValue();
        java.lang.Object objA4 = this.e.a();
        aooh.e(objA4, "get(...)");
        long jLongValue4 = ((java.lang.Number) objA4).longValue();
        java.lang.Object objA5 = this.f.a();
        aooh.e(objA5, "get(...)");
        return new defpackage.yvq(jLongValue, jLongValue2, jLongValue3, jLongValue4, ((java.lang.Number) objA5).longValue());
    }
}
