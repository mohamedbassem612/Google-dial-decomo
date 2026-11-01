package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class agil extends android.view.View.AccessibilityDelegate {
    public agil(agim agimVar) {
        j$.util.Objects.requireNonNull(agimVar);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionItemInfo(null);
        accessibilityNodeInfo.setFocusable(false);
        ft$.ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo, false);
    }
}
