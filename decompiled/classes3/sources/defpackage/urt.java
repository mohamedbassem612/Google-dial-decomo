package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class urt {
    public static final /* synthetic */ int a = 0;
    private static final aoir b = aooc.ag(new uoq(4));

    public static final boolean a(android.view.Window window) {
        if (dvx.c(window.getContext().getApplicationContext(), "android.permission.STATUS_BAR") == 0) {
            return true;
        }
        java.lang.Object objA = b.a();
        aooh.e(objA, "getValue(...)");
        ((aimz) objA).d().i(zct.b).l("com/android/dialer/theme/systembars/WindowExtensionsKt", "checkStatusBarPermissionWithWarnings", 65, "WindowExtensions.kt").v("STATUS_BAR permission not granted, skipping");
        return false;
    }
}
