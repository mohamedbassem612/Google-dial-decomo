package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class yvn implements defpackage.yvp {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/callcoreshared/sharpie/impl/modelparameters/SharpieCompositeModelParametersProvider");
    private final defpackage.yvo b;
    private final defpackage.zzx c;

    public yvn(defpackage.zzx zzxVar, defpackage.yvo yvoVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        defpackage.aooh.f(aoinVar, "enableSharpieLlmService");
        defpackage.aooh.f(aoinVar2, "sharpieEnableRegionalModels");
        this.c = zzxVar;
        this.b = yvoVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    @Override // defpackage.yvp
    public final yvq a() {
        yvm yvmVar;
        defpackage.yvp yvpVar;
        java.lang.String str = android.os.Build.BRAND;
        defpackage.aooh.e(str, "BRAND");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        defpackage.aooh.e(lowerCase, "toLowerCase(...)");
        switch (lowerCase) {
            case "google":
                yvmVar = yvm.b;
                break;
            case "xiaomi":
                yvmVar = yvm.d;
                break;
            case "motorola":
                yvmVar = yvm.e;
                break;
            case "oppo":
                yvmVar = yvm.f;
                break;
            case "sony":
                yvmVar = yvm.h;
                break;
            case "vivo":
                yvmVar = yvm.c;
                break;
            case "honor":
                yvmVar = yvm.g;
                break;
            case "samsung":
                yvmVar = yvm.a;
                break;
            default:
                yvmVar = yvm.i;
                break;
        }
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) aimzVar.b().l("com/google/android/callcoreshared/sharpie/impl/modelparameters/SharpieCompositeModelParametersProvider", "getModelParametersProvider", 48, "SharpieCompositeModelParametersProvider.kt")).y("Getting config for: [%s]", yvmVar);
        defpackage.aoin aoinVar = (defpackage.aoin) this.c.k().get(yvmVar);
        if (aoinVar == null) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).m(defpackage.aioa.MEDIUM).l("com/google/android/callcoreshared/sharpie/impl/modelparameters/SharpieCompositeModelParametersProvider", "getModelParametersProvider", 56, "SharpieCompositeModelParametersProvider.kt")).y("Unknown brand (%s) for model parameters, falling back to default parameter. ", android.os.Build.BRAND);
            yvpVar = this.b;
        } else {
            java.lang.Object objA = aoinVar.a();
            defpackage.aooh.c(objA);
            yvpVar = (defpackage.yvp) objA;
        }
        return yvpVar.a();
    }
}
