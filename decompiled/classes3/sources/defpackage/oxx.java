package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class oxx extends android.view.View.AccessibilityDelegate {
    final /* synthetic */ defpackage.oyc a;

    public oxx(defpackage.oyc oycVar) {
        j$.util.Objects.requireNonNull(oycVar);
        this.a = oycVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        android.content.Context context = this.a.b;
        accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(2131427345, context.getString(2132017660)));
        accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(2131427347, context.getString(2132017673)));
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        if (i == 2131427345) {
            this.a.j();
            return true;
        }
        if (i != 2131427347) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.a.k();
        return true;
    }
}
