package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class huy {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints");
    private static final java.util.Locale f = java.util.Locale.forLanguageTag("en-US");
    private static final defpackage.aihd g = defpackage.aihd.v("sailfish", "marlin", "walleye", "taimen", "blueline", "crosshatch", "sargo", "bonito", "coral", "flame", "sunfish", "bramble", "redfin", "needlefish");
    public final android.content.Context b;
    public final huz c;
    public final defpackage.aoin d;
    public final defpackage.zzx e;
    private final defpackage.aoin h;
    private final defpackage.aoin i;

    public huy(android.content.Context context, defpackage.zzx zzxVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, huz huzVar) {
        this.b = context;
        this.e = zzxVar;
        this.h = aoinVar;
        this.d = aoinVar2;
        this.i = aoinVar3;
        this.c = huzVar;
    }

    public final java.util.Locale a() {
        j$.util.Optional optionalA = this.c.a();
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "getTtsLocale", 135, "AssistedEmergencyDialingConstraints.java")).y("Supported locale: %s", optionalA);
        if (!optionalA.isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).i(defpackage.zct.b)).l("com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "getTtsLocale", (char) 138, "AssistedEmergencyDialingConstraints.java")).v("No locale present");
            return f;
        }
        java.util.Locale locale = (java.util.Locale) optionalA.orElseThrow();
        try {
            return android.text.TextUtils.isEmpty(locale.getISO3Language()) ? f : locale;
        } catch (java.util.MissingResourceException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "getTtsLocale", (char) 149, "AssistedEmergencyDialingConstraints.java")).v("Bad locale.");
            return f;
        }
    }

    public final boolean b() {
        return android.os.Build.BRAND.contains("google") && g.contains(android.os.Build.DEVICE) && "US".equals(defpackage.rlt.b(this.b));
    }

    public final boolean c() {
        if (((java.lang.Boolean) this.i.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "shouldEnableFeature", 90, "AssistedEmergencyDialingConstraints.java")).v("AssistedEmergencyDialing enabled by flag 'force_enable_assisted_emergency_dialing_for_testing'");
            return true;
        }
        if (!b() && !((java.lang.Boolean) this.h.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "shouldEnableFeature", 98, "AssistedEmergencyDialingConstraints.java")).v("AssistedEmergencyDialing disabled by flag");
            return false;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "shouldEnableFeature", 'f', "AssistedEmergencyDialingConstraints.java")).v("AssistedEmergencyDialing enabled");
        return true;
    }
}
