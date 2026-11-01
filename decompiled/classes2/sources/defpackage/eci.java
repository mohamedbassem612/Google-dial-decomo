package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eci extends ebg {
    final /* synthetic */ defpackage.ecj a;

    public eci(defpackage.ecj ecjVar) {
        this.a = ecjVar;
    }

    public final defpackage.ebd a(int i) {
        return new defpackage.ebd(android.view.accessibility.AccessibilityNodeInfo.obtain(this.a.k(i).a));
    }

    public final defpackage.ebd b(int i) {
        defpackage.ecj ecjVar = this.a;
        int i2 = i == 2 ? ecjVar.c : ecjVar.d;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    public final boolean d(int i, int i2, android.os.Bundle bundle) {
        int i3;
        defpackage.ecj ecjVar = this.a;
        if (i == -1) {
            return ecjVar.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return ecjVar.u(i);
        }
        if (i2 == 2) {
            return ecjVar.s(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? ecjVar.t(i, i2, bundle) : ecjVar.r(i);
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = ecjVar.a;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = ecjVar.c) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            ecjVar.r(i3);
        }
        ecjVar.c = i;
        ecjVar.b.invalidate();
        ecjVar.v(i, 32768);
        return true;
    }
}
