package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acax {
    private static final aiof a = aiof.i("GnpSdk");

    public static final java.lang.String a(android.content.Context context) {
        aooh.f(context, "context");
        java.util.Locale localeF = dpe.q(context.getResources().getConfiguration()).f(0);
        if (localeF != null) {
            return localeF.toLanguageTag();
        }
        return null;
    }

    public static final boolean b(android.content.Context context) {
        if (context == null) {
            a.d().v("Null context passed to isTalkBackEnabled");
            return false;
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService(android.view.accessibility.AccessibilityManager.class);
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        aooh.e(enabledAccessibilityServiceList, "getEnabledAccessibilityServiceList(...)");
        return !enabledAccessibilityServiceList.isEmpty();
    }
}
