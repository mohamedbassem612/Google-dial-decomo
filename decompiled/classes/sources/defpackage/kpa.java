package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kpa {
    public static final java.util.Set a = defpackage.ajsz.aF("en-US");
    public final defpackage.aoin b;
    public final java.lang.String c;
    public final long d;
    public final long e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;

    public kpa(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        defpackage.aooh.f(aoinVar, "fermatSodaLanguageCode");
        defpackage.aooh.f(aoinVar2, "requestedSummaryModelVersion");
        defpackage.aooh.f(aoinVar3, "fermatAiCoreMinPackageVersion");
        defpackage.aooh.f(aoinVar4, "fermatAstreaMinPackageVersion");
        this.f = aoinVar;
        this.b = aoinVar2;
        this.g = aoinVar3;
        this.h = aoinVar4;
        java.lang.Object objA = aoinVar.a();
        defpackage.aooh.e(objA, "get(...)");
        this.c = (java.lang.String) objA;
        java.lang.Object objA2 = aoinVar3.a();
        defpackage.aooh.e(objA2, "get(...)");
        this.d = ((java.lang.Number) objA2).longValue();
        java.lang.Object objA3 = aoinVar4.a();
        defpackage.aooh.e(objA3, "get(...)");
        this.e = ((java.lang.Number) objA3).longValue();
    }
}
