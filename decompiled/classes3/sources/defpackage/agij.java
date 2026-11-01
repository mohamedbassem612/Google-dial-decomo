package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agij {
    public static final xtq a = new xtq("ThemeHelper", (byte[]) null);

    /* JADX WARN: Code duplicated, block: B:101:0x0153  */
    /* JADX WARN: Code duplicated, block: B:89:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x0134  */
    /* JADX WARN: Code duplicated, block: B:95:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0148  */
    public static int a(android.content.Context context) {
        android.content.Context context2;
        int i;
        java.lang.String str;
        int i2;
        boolean zW = defpackage.agfz.w(context);
        android.os.Bundle bundle = defpackage.agfz.h;
        if (bundle == null || bundle.isEmpty()) {
            context2 = context;
            defpackage.agfz.h = defpackage.agfz.h(context2, "suwDefaultThemeString", "SetupWizard default theme status unknown; return as null.");
        } else {
            context2 = context;
        }
        android.os.Bundle bundle2 = defpackage.agfz.h;
        java.lang.String string = null;
        if (bundle2 != null && !bundle2.isEmpty()) {
            string = defpackage.agfz.h.getString("suwDefaultThemeString");
        }
        if (defpackage.agfz.E(context2)) {
            boolean zC = defpackage.agfz.C(context2);
            xtq xtqVar = a;
            if (zC) {
                xtqVar.x("Applying the modal dialog focus rings style");
                return zW ? 2132084114 : 2132084115;
            }
            xtqVar.x("Applying the modal dialog style");
            return zW ? 2132084111 : 2132084112;
        }
        if (defpackage.agfz.t(context2)) {
            if (defpackage.agfz.C(context2)) {
                a.x("Return ".concat(true != zW ? "SudThemeGlifExpressiveFocusRings_Light" : "SudThemeGlifExpressiveFocusRings_DayNight"));
                return zW ? 2132084096 : 2132084097;
            }
            a.x("Return ".concat(true != zW ? "SudThemeGlifExpressive_Light" : "SudThemeGlifExpressive_DayNight"));
            return zW ? 2132084093 : 2132084094;
        }
        if (android.os.Build.VERSION.SDK_INT < 33) {
            i = zW ? 2132084102 : 2132084103;
            str = true != zW ? "SudThemeGlifV3_Light" : "SudThemeGlifV3_DayNight";
        } else {
            i = zW ? 2132084105 : 2132084106;
            str = true != zW ? "SudThemeGlifV4_Light" : "SudThemeGlifV4_DayNight";
        }
        a.x(hgb.n(string, str, "Default theme: ", ", return theme: "));
        boolean zW2 = defpackage.agfz.w(context2);
        boolean zW3 = defpackage.agfz.w(context2);
        if (zW2 && zW3) {
            if (string != null) {
                switch (string) {
                    case "glif_v2_light":
                        i2 = 2132084099;
                        break;
                    case "material_light":
                        i2 = 2132084108;
                        break;
                    case "glif_v3_light":
                        i2 = 2132084102;
                        break;
                    case "glif_v4_light":
                        i2 = 2132084105;
                        break;
                    case "glif":
                        i2 = 2132084090;
                        break;
                    case "glif_v2":
                        i2 = 2132084099;
                        break;
                    case "glif_v3":
                        i2 = 2132084102;
                        break;
                    case "glif_v4":
                        i2 = 2132084105;
                        break;
                    case "material":
                        i2 = 2132084108;
                        break;
                    case "glif_light":
                        i2 = 2132084090;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
            } else {
                i2 = 0;
            }
        } else if (string != null) {
            switch (string) {
                case "glif_v2_light":
                    i2 = 2132084100;
                    break;
                case "material_light":
                    i2 = 2132084109;
                    break;
                case "glif_v3_light":
                    i2 = 2132084103;
                    break;
                case "glif_v4_light":
                    i2 = 2132084106;
                    break;
                case "glif":
                    i2 = 2132084089;
                    break;
                case "glif_v2":
                    i2 = 2132084098;
                    break;
                case "glif_v3":
                    i2 = 2132084101;
                    break;
                case "glif_v4":
                    i2 = 2132084104;
                    break;
                case "material":
                    i2 = 2132084107;
                    break;
                case "glif_light":
                    i2 = 2132084091;
                    break;
                default:
                    i2 = 0;
                    break;
            }
        } else {
            i2 = 0;
        }
        return i2 == 0 ? i : i2;
    }

    public static boolean b(android.content.Context context) {
        int i;
        if (!a.n()) {
            a.B("Dynamic color require platform version at least S.");
            return false;
        }
        if (defpackage.agfz.t(context)) {
            a.B("Dynamic color theme isn't needed to set in glif expressive theme.");
            return false;
        }
        if (!defpackage.agfz.x(context)) {
            a.B("SetupWizard does not support the dynamic color or supporting status unknown.");
            return false;
        }
        try {
            xtq xtqVar = defpackage.agfh.c;
            android.app.Activity activityD = defpackage.agfz.d(context);
            if (defpackage.agfz.t(context)) {
                i = 0;
            } else {
                try {
                    boolean zX = defpackage.aftt.x(defpackage.agfz.d(context).getIntent());
                    boolean zW = defpackage.agfz.w(context);
                    boolean zY = defpackage.agfz.y(context);
                    if (!zX || (a.o() && zY)) {
                        i = zW ? 2132083992 : 2132083993;
                        a.x("Return ".concat(true != zW ? "SudFullDynamicColorTheme_Light" : "SudFullDynamicColorTheme_DayNight"));
                    } else {
                        i = true != zW ? 2132083972 : 2132083971;
                    }
                    a.w("Gets the dynamic accentColor: [Light] " + c(context, 2131102700) + ", " + (a.n() ? c(context, android.R.color.system_accent1_600) : "n/a") + ", [Dark] " + c(context, 2131102699) + ", " + (a.n() ? c(context, android.R.color.system_accent1_100) : "n/a"));
                } catch (java.lang.IllegalArgumentException e) {
                    a.z((java.lang.String) j$.util.Objects.requireNonNull(e.getMessage()));
                    i = 0;
                }
            }
            if (i != 0) {
                activityD.setTheme(i);
                return true;
            }
            a.B("Error occurred on getting dynamic color theme.");
            return false;
        } catch (java.lang.IllegalArgumentException e2) {
            a.z((java.lang.String) j$.util.Objects.requireNonNull(e2.getMessage()));
            return false;
        }
    }

    private static java.lang.String c(android.content.Context context, int i) {
        return java.lang.String.format("#%06X", java.lang.Integer.valueOf(context.getResources().getColor(i) & 16777215));
    }
}
