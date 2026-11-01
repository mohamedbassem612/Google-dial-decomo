package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byo implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public final ccp a = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);

    public final void a(boolean z) {
        this.a.b(java.lang.Boolean.valueOf(z));
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        a(z);
    }
}
