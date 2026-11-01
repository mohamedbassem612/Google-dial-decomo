package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byn implements android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final ccp a;
    public final ccp b;

    public byn() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        cdu cduVar = cdu.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
    }

    public final void a(boolean z) {
        this.a.b(java.lang.Boolean.valueOf(z));
    }

    public final void b(boolean z) {
        this.b.b(java.lang.Boolean.valueOf(z));
    }

    public final void onAccessibilityServicesStateChanged(android.view.accessibility.AccessibilityManager accessibilityManager) {
        a(defpackage.byp.c(accessibilityManager));
        b(defpackage.byp.d(accessibilityManager));
    }
}
