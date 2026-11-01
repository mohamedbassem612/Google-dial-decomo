package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum urf {
    THEME_PREFERENCE_LIGHT(1),
    THEME_PREFERENCE_DARK(2),
    THEME_PREFERENCE_FOLLOW_SYSTEM(-1);

    public final int d;

    urf(int i) {
        this.d = i;
    }

    public static defpackage.urf a(int i) {
        if (i != -1) {
            if (i == 1) {
                return THEME_PREFERENCE_LIGHT;
            }
            if (i == 2) {
                return THEME_PREFERENCE_DARK;
            }
            if (i != 3) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.urg.a.d()).i(defpackage.zct.b)).l("com/android/dialer/theme/base/Theme$ThemePreference", "fromInt", 90, "Theme.java")).w("Passed invalid night mode: %s", i);
            }
        }
        return THEME_PREFERENCE_FOLLOW_SYSTEM;
    }
}
