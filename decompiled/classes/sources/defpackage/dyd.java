package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dyd extends android.view.View.AccessibilityDelegate {
    final defpackage.dye a;

    public dyd(defpackage.dye dyeVar) {
        this.a = dyeVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.a.g(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        defpackage.ebg ebgVarA = this.a.a(view);
        if (ebgVarA != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) ebgVarA.b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        ebd ebdVar = new ebd(accessibilityNodeInfo);
        int i = defpackage.dzs.a;
        boolean zF = defpackage.dzo.f(view);
        java.lang.Boolean.valueOf(zF).getClass();
        ebdVar.M(zF);
        boolean zE = defpackage.dzo.e(view);
        java.lang.Boolean.valueOf(zE).getClass();
        ebdVar.C(zE);
        ebdVar.I(defpackage.dzo.a(view));
        ebdVar.Q(defpackage.dzq.b(view));
        this.a.c(view, ebdVar);
        accessibilityNodeInfo.getText();
        java.util.List listN = defpackage.dye.N(view);
        for (int i2 = 0; i2 < listN.size(); i2++) {
            ebdVar.i((ebc) listN.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.a.h(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        return this.a.i(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View view, int i) {
        this.a.e(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.a.f(view, accessibilityEvent);
    }
}
