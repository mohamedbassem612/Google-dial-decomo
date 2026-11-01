package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ysf {
    private static final aimz a = aimz.i("com/google/android/callcoreshared/aicore/feature/AiCoreFeatureIdResolver");
    private final zzx b;
    private final zzx c;

    public ysf(zzx zzxVar, zzx zzxVar2) {
        this.b = zzxVar;
        this.c = zzxVar2;
    }

    private final int b(defpackage.yse yseVar) {
        ysg ysgVar;
        aoin aoinVar = (aoin) this.c.k().get(yseVar);
        if (aoinVar != null && (ysgVar = (ysg) aoinVar.a()) != null) {
            return ysgVar.a();
        }
        java.util.Objects.toString(yseVar);
        throw new java.lang.IllegalStateException("AiCoreIntegration not found for AiCoreFeature: ".concat(java.lang.String.valueOf(yseVar)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final int a(defpackage.yse yseVar) throws aois {
        aooh.f(yseVar, "aiCoreFeature");
        aoin aoinVar = (aoin) this.b.k().get(yseVar);
        defpackage.ysj ysjVar = aoinVar != null ? (defpackage.ysj) aoinVar.a() : null;
        j$.util.Objects.checkIndex(0, 3);
        if (ysjVar == null) {
            a.b().l("com/google/android/callcoreshared/aicore/feature/AiCoreFeatureIdResolver", "getFeatureId", 38, "AiCoreFeatureIdResolver.kt").y("No sideloading override provided for feature: %s", yseVar);
            return b(yseVar);
        }
        if (ysjVar instanceof defpackage.ysi) {
            a.b().l("com/google/android/callcoreshared/aicore/feature/AiCoreFeatureIdResolver", "getFeatureId", 30, "AiCoreFeatureIdResolver.kt");
            throw null;
        }
        if (!(ysjVar instanceof defpackage.ysh)) {
            throw new aois();
        }
        a.b().l("com/google/android/callcoreshared/aicore/feature/AiCoreFeatureIdResolver", "getFeatureId", 34, "AiCoreFeatureIdResolver.kt").v("sideloading is disabled.");
        return b(yseVar);
    }
}
