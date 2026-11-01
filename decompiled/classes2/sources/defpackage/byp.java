package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byp implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, cer {
    public final defpackage.byn b;
    private final boolean c;
    private final ccp d = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
    public final defpackage.byo a = new defpackage.byo();

    public byp(boolean z) {
        this.c = z;
        defpackage.byn bynVar = null;
        if (z && android.os.Build.VERSION.SDK_INT >= 33) {
            bynVar = new defpackage.byn();
        }
        this.b = bynVar;
    }

    public static final boolean c(android.view.accessibility.AccessibilityManager accessibilityManager) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && aoov.G(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(android.view.accessibility.AccessibilityManager accessibilityManager) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && aoov.G(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        defpackage.byn bynVar;
        boolean z = false;
        if (((java.lang.Boolean) this.d.a()).booleanValue() && (((java.lang.Boolean) this.a.a.a()).booleanValue() || (this.c && (bynVar = this.b) != null && ((java.lang.Boolean) bynVar.a.a()).booleanValue()))) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public final void b(boolean z) {
        this.d.b(java.lang.Boolean.valueOf(z));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        b(z);
    }
}
