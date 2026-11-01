package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mir extends android.widget.FrameLayout {
    private static final aimz a = aimz.i("com/android/dialer/dialpadview/DialpadKeyButton");

    public static void a(android.view.View view, miq miqVar) {
        if (view instanceof defpackage.mir) {
            throw null;
        }
        if (view instanceof com.google.android.libraries.communications.ux.views.dialpad.DialpadKey) {
            j$.util.Objects.requireNonNull(miqVar);
            ((com.google.android.libraries.communications.ux.views.dialpad.DialpadKey) view).b = new rai(miqVar);
        } else {
            a.bt(a.c().m(aioa.b), "Unknown dialpad key button class %s", view.getClass().getName(), "com/android/dialer/dialpadview/DialpadKeyButton", "setOnPressedListener", 's', "DialpadKeyButton.java", zct.b);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, android.os.Bundle bundle) {
        throw null;
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        throw null;
    }
}
