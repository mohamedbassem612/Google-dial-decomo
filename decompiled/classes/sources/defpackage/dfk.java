package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfk implements java.lang.Runnable, android.content.ComponentCallbacks2, android.view.ViewTreeObserver.OnWindowFocusChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    final /* synthetic */ defpackage.dfl a;

    public dfk(defpackage.dfl dflVar) {
        this.a = dflVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        defpackage.dfl dflVar = this.a;
        dflVar.b = z;
        if (z) {
            dflVar.i();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.a.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        defpackage.dfl dflVar = this.a;
        if (dflVar.k) {
            dflVar.k = false;
            defpackage.dfz dfzVar = dflVar.i;
            defpackage.aomy aomyVar = dflVar.l;
            defpackage.ccp ccpVar = dfzVar.a;
            if (ccpVar != null) {
                ccpVar.b(aomyVar.a());
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        defpackage.dfl dflVar = this.a;
        dflVar.r.am();
        dflVar.q.ag();
        defpackage.vx vxVar = dflVar.p;
        if (vxVar != null) {
            vxVar.C();
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        defpackage.dfl dflVar = this.a;
        dflVar.c = z;
        if (z && dflVar.b) {
            dflVar.i();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        defpackage.dfl dflVar = this.a;
        dflVar.r.am();
        dflVar.q.ag();
        defpackage.vx vxVar = dflVar.p;
        if (vxVar != null) {
            vxVar.C();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.a.i.d(z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.dfl dflVar = this.a;
        java.lang.Object obj = dflVar.t.a;
        boolean z = false;
        if (dflVar.j <= 0) {
            dflVar.m = false;
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) obj;
            accessibilityManager.removeAccessibilityStateChangeListener(this);
            accessibilityManager.removeTouchExplorationStateChangeListener(this);
            return;
        }
        dflVar.m = true;
        android.view.accessibility.AccessibilityManager accessibilityManager2 = (android.view.accessibility.AccessibilityManager) obj;
        boolean zIsEnabled = accessibilityManager2.isEnabled();
        dflVar.b = zIsEnabled;
        if (zIsEnabled && accessibilityManager2.isTouchExplorationEnabled()) {
            z = true;
        }
        dflVar.c = z;
        if (dflVar.b) {
            dflVar.i();
        }
        accessibilityManager2.addAccessibilityStateChangeListener(this);
        accessibilityManager2.addTouchExplorationStateChangeListener(this);
    }
}
