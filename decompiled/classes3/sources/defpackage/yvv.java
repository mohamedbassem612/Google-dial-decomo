package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yvv implements yvp {
    private static final aimz a = aimz.i("com/google/android/callcoreshared/sharpie/impl/modelparameters/pixel/SharpiePixelModelParametersProvider");
    private final aoin b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final aoin f;
    private final aoin g;
    private final aoin h;
    private final aoin i;
    private final aoin j;

    public yvv(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, aoin aoinVar7, aoin aoinVar8, aoin aoinVar9) {
        aooh.f(aoinVar, "pixelAiCoreMinApkVersion");
        aooh.f(aoinVar2, "pixelExperimentId");
        aooh.f(aoinVar3, "pixelAiCoreModelVersion");
        aooh.f(aoinVar4, "pixelMaxWordCount");
        aooh.f(aoinVar5, "pixelMinWordCount");
        aooh.f(aoinVar6, "supportedPixel9Models");
        aooh.f(aoinVar7, "supportedPixel10Models");
        aooh.f(aoinVar8, "supportedPixel11Models");
        aooh.f(aoinVar9, "supportedPixelUnderdevelopmentModels");
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
        this.f = aoinVar5;
        this.g = aoinVar6;
        this.h = aoinVar7;
        this.i = aoinVar8;
        this.j = aoinVar9;
    }

    private final defpackage.yvq b() {
        java.lang.Object objA = this.b.a();
        aooh.e(objA, "get(...)");
        long jLongValue = ((java.lang.Number) objA).longValue();
        java.lang.Object objA2 = this.d.a();
        aooh.e(objA2, "get(...)");
        long jLongValue2 = ((java.lang.Number) objA2).longValue();
        java.lang.Object objA3 = this.c.a();
        aooh.e(objA3, "get(...)");
        long jLongValue3 = ((java.lang.Number) objA3).longValue();
        java.lang.Object objA4 = this.e.a();
        aooh.e(objA4, "get(...)");
        long jLongValue4 = ((java.lang.Number) objA4).longValue();
        java.lang.Object objA5 = this.f.a();
        aooh.e(objA5, "get(...)");
        return new defpackage.yvq(jLongValue, jLongValue2, jLongValue3, jLongValue4, ((java.lang.Number) objA5).longValue());
    }

    private static final boolean c(alfc alfcVar, java.lang.String str) {
        alat alatVar = alfcVar.b;
        aooh.e(alatVar, "getElementList(...)");
        if ((alatVar instanceof java.util.Collection) && alatVar.isEmpty()) {
            return false;
        }
        java.util.Iterator it = alatVar.iterator();
        while (it.hasNext()) {
            if (aoov.s((java.lang.String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final defpackage.yvq a() throws aois {
        defpackage.yvu yvuVar;
        java.lang.Object objA = this.j.a();
        aooh.e(objA, "get(...)");
        java.lang.String str = android.os.Build.DEVICE;
        aooh.e(str, "DEVICE");
        if (c((alfc) objA, str)) {
            yvuVar = defpackage.yvu.a;
        } else {
            java.lang.Object objA2 = this.i.a();
            aooh.e(objA2, "get(...)");
            java.lang.String str2 = android.os.Build.DEVICE;
            aooh.e(str2, "DEVICE");
            if (c((alfc) objA2, str2)) {
                yvuVar = defpackage.yvu.b;
            } else {
                java.lang.Object objA3 = this.h.a();
                aooh.e(objA3, "get(...)");
                java.lang.String str3 = android.os.Build.DEVICE;
                aooh.e(str3, "DEVICE");
                if (c((alfc) objA3, str3)) {
                    yvuVar = defpackage.yvu.c;
                } else {
                    java.lang.Object objA4 = this.g.a();
                    aooh.e(objA4, "get(...)");
                    java.lang.String str4 = android.os.Build.DEVICE;
                    aooh.e(str4, "DEVICE");
                    yvuVar = c((alfc) objA4, str4) ? defpackage.yvu.d : defpackage.yvu.e;
                }
            }
        }
        aimz aimzVar = a;
        aimzVar.b().l("com/google/android/callcoreshared/sharpie/impl/modelparameters/pixel/SharpiePixelModelParametersProvider", "getModelParameters", 51, "SharpiePixelModelParametersProvider.kt").y("Getting config for: [%s]", yvuVar);
        int iOrdinal = yvuVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return b();
        }
        if (iOrdinal != 4) {
            throw new aois();
        }
        aimzVar.d().l("com/google/android/callcoreshared/sharpie/impl/modelparameters/pixel/SharpiePixelModelParametersProvider", "getModelParameters", 62, "SharpiePixelModelParametersProvider.kt").y("Unknown device for model [(%s)], falling back to default pixel parameters. ", android.os.Build.DEVICE);
        return b();
    }
}
