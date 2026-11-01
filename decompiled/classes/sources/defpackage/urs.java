package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class urs {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/theme/systembars/SystemBars");
    private final defpackage.urg b;

    public urs(defpackage.urg urgVar) {
        if (urgVar == null) {
            defpackage.aooh.i("theme");
        }
        this.b = urgVar;
    }

    public static final android.view.Window m(android.app.Activity activity) {
        android.view.Window window = activity.getWindow();
        if (window != null) {
            return window;
        }
        throw new java.lang.IllegalArgumentException("Activity must be attached to a Window");
    }

    public static final void n(android.view.Window window) {
        ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "setLayoutEdgeToEdge", 180, "SystemBars.kt")).v("enter");
        defpackage.dzn.c(window, false);
    }

    public static final void o(android.app.Activity activity) {
        n(m(activity));
    }

    public static final void p(android.app.Activity activity) {
        android.view.Window windowM = m(activity);
        windowM.setNavigationBarColor(0);
        ft$.ExternalSyntheticApiModelOutline0.m(windowM, 0);
    }

    private final boolean r() {
        return this.b.g() == 2;
    }

    public final android.view.Window a(defpackage.aw awVar) {
        defpackage.az azVarG = awVar.G();
        if (azVarG != null) {
            return m(azVarG);
        }
        throw new java.lang.IllegalArgumentException("Fragment must be attached to an Activity");
    }

    public final void b(defpackage.aw awVar) {
        android.view.Window windowA = a(awVar);
        ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "doNotSuppressFullScreenAlert", 163, "SystemBars.kt")).v("enter");
        if (urt.a(windowA)) {
            windowA.getDecorView().setSystemUiVisibility(windowA.getDecorView().getSystemUiVisibility() & (-23068673));
        }
    }

    public final void c(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "fragment");
        android.view.Window windowA = a(awVar);
        ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "hideNavigationBar", 72, "SystemBars.kt")).v("enter");
        q(windowA).e(2);
    }

    public final void d(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "fragment");
        n(a(awVar));
    }

    public final void e(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "fragment");
        android.view.Window windowA = a(awVar);
        ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "setShowSystemBarsByTouch", 132, "SystemBars.kt")).v("enter");
        q(windowA).h(1);
    }

    public final void f(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "fragment");
        g(a(awVar));
    }

    public final void g(android.view.Window window) {
        ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "setStatusBarAppearanceDark", 60, "SystemBars.kt")).v("enter");
        q(window).g(false);
    }

    public final void h(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "fragment");
        android.view.Window windowA = a(awVar);
        ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "setTransientSystemBarsBySwipe", 119, "SystemBars.kt")).v("enter");
        q(windowA).h(2);
    }

    public final void i(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "fragment");
        android.view.Window windowA = a(awVar);
        ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "showNavigationBar", 66, "SystemBars.kt")).v("enter");
        q(windowA).i(2);
    }

    public final void j(defpackage.aw awVar) {
        android.view.Window windowA = a(awVar);
        ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "suppressFullScreenAlert", 147, "SystemBars.kt")).v("enter");
        if (urt.a(windowA)) {
            windowA.getDecorView().setSystemUiVisibility(windowA.getDecorView().getSystemUiVisibility() | 23068672);
        }
    }

    public final void k(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "fragment");
        defpackage.az azVarH = awVar.H();
        if (r()) {
            android.view.Window windowM = m(azVarH);
            ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "setNavigationBarAppearanceDark", 107, "SystemBars.kt")).v("enter");
            q(windowM).f(false);
        } else {
            android.view.Window windowM2 = m(azVarH);
            ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "setNavigationBarAppearanceLight", 101, "SystemBars.kt")).v("enter");
            q(windowM2).f(true);
        }
    }

    public final void l(defpackage.aw awVar) {
        defpackage.az azVarH = awVar.H();
        if (r()) {
            g(m(azVarH));
            return;
        }
        android.view.Window windowM = m(azVarH);
        ((defpackage.aimw) a.b().l("com/android/dialer/theme/systembars/SystemBars", "setStatusBarAppearanceLight", 54, "SystemBars.kt")).v("enter");
        q(windowM).g(true);
    }

    public final ni q(android.view.Window window) {
        window.getDecorView();
        return new ni(window);
    }
}
