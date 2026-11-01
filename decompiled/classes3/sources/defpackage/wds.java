package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wds extends android.view.View.AccessibilityDelegate {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ wdx b;

    public wds(wdx wdxVar, java.lang.String str) {
        this.a = str;
        j$.util.Objects.requireNonNull(wdxVar);
        this.b = wdxVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int i = this.b.y;
        if (i == 2) {
            accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_EXPAND);
        } else if (i == 4) {
            accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_COLLAPSE);
        }
        accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, this.a));
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        if (i == 16 || i == 262144 || i == 524288) {
            this.b.i();
            return true;
        }
        a.bI(wdx.a.d(), "Unrecognized accessibility action", "com/android/dialer/widget/bubble/impl/BubbleImpl$5", "performAccessibilityAction", (char) 968, "BubbleImpl.java", zct.b);
        return false;
    }
}
