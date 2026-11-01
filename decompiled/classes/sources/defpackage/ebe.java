package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class ebe extends android.view.accessibility.AccessibilityNodeProvider {
    final defpackage.ebg a;

    public ebe(defpackage.ebg ebgVar) {
        this.a = ebgVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        ebd ebdVarA = this.a.a(i);
        if (ebdVarA == null) {
            return null;
        }
        return ebdVarA.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final java.util.List findAccessibilityNodeInfosByText(java.lang.String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int i) {
        ebd ebdVarB = this.a.b(i);
        if (ebdVarB == null) {
            return null;
        }
        return ebdVarB.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, android.os.Bundle bundle) {
        return this.a.d(i, i2, bundle);
    }
}
