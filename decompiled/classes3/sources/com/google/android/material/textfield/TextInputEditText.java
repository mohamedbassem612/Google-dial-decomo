package com.google.android.material.textfield;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class TextInputEditText extends hq {
    private final android.graphics.Rect a;
    private boolean b;

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new android.graphics.Rect();
        android.content.res.TypedArray typedArrayA = afvl.a(context, attributeSet, defpackage.agdn.b, i, 2132085326, new int[0]);
        this.b = typedArrayA.getBoolean(0, false);
        typedArrayA.recycle();
    }

    private final com.google.android.material.textfield.TextInputLayout d() {
        for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.textfield.TextInputLayout) {
                return (com.google.android.material.textfield.TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean e(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        return textInputLayout != null && this.b;
    }

    public final void getFocusedRect(android.graphics.Rect rect) {
        super.getFocusedRect(rect);
        com.google.android.material.textfield.TextInputLayout textInputLayoutD = d();
        if (!e(textInputLayoutD) || rect == null) {
            return;
        }
        android.graphics.Rect rect2 = this.a;
        textInputLayoutD.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    public final boolean getGlobalVisibleRect(android.graphics.Rect rect, android.graphics.Point point) {
        com.google.android.material.textfield.TextInputLayout textInputLayoutD = d();
        if (!e(textInputLayoutD)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayoutD.getGlobalVisibleRect(rect, point);
        if (!globalVisibleRect || point == null) {
            return globalVisibleRect;
        }
        point.offset(-getScrollX(), -getScrollY());
        return true;
    }

    public final java.lang.CharSequence getHint() {
        com.google.android.material.textfield.TextInputLayout textInputLayoutD = d();
        return (textInputLayoutD == null || !textInputLayoutD.l) ? super.getHint() : textInputLayoutD.f();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.textfield.TextInputLayout textInputLayoutD = d();
        if (textInputLayoutD != null && textInputLayoutD.l && super.getHint() == null && defpackage.aftt.f()) {
            setHint("");
        }
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            com.google.android.material.textfield.TextInputLayout textInputLayoutD = d();
            editorInfo.hintText = textInputLayoutD != null ? textInputLayoutD.f() : null;
        }
        return inputConnectionOnCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d();
    }

    public final boolean requestRectangleOnScreen(android.graphics.Rect rect) {
        com.google.android.material.textfield.TextInputLayout textInputLayoutD = d();
        if (!e(textInputLayoutD) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayoutD.getHeight() - getHeight();
        android.graphics.Rect rect2 = this.a;
        rect2.set(rect.left, rect.top, rect.right, rect.bottom + height);
        return super.requestRectangleOnScreen(rect2);
    }

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969326);
    }

    public TextInputEditText(android.content.Context context) {
        this(context, null);
    }
}
