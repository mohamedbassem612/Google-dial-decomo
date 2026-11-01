package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class yvl {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/callcoreshared/sharpie/impl/i18n/SharpieCountryAllowlist");

    public static final boolean a(defpackage.akfg akfgVar, java.util.List list) {
        defpackage.aooh.f(list, "allowedRegionCodeList");
        if (akfgVar == defpackage.akfg.ZZ) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/sharpie/impl/i18n/SharpieCountryAllowlist", "isSimRegionAllowed", 13, "SharpieCountryAllowlist.kt")).v("No SIM region found.");
        }
        if (list.contains(akfgVar)) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/sharpie/impl/i18n/SharpieCountryAllowlist", "isSimRegionAllowed", 20, "SharpieCountryAllowlist.kt")).y("Region %s not allowed.", akfgVar);
        return false;
    }
}
