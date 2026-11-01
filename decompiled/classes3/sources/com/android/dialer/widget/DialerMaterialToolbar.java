package com.android.dialer.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DialerMaterialToolbar extends com.google.android.material.appbar.MaterialToolbar {
    public DialerMaterialToolbar(android.content.Context context) {
        super(context);
        G();
    }

    public static android.app.Activity E(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context;
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }

    private final void G() {
        ((android.support.v7.widget.Toolbar) this).n = getContext().getResources().getDimensionPixelOffset(2131167883);
        requestLayout();
        ((android.support.v7.widget.Toolbar) this).o = getContext().getResources().getDimensionPixelOffset(2131167881);
        requestLayout();
        s(2131231946);
        q(2132020591);
        u(new defpackage.vxa(this, 8));
    }

    public final void F() {
        s(2131231925);
        q(2132020590);
        u(new defpackage.vxa(this, 7));
    }

    public final void w(java.lang.CharSequence charSequence) {
        super.w(pez.aq(getContext(), charSequence));
    }

    public DialerMaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        G();
    }

    public DialerMaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        G();
    }
}
