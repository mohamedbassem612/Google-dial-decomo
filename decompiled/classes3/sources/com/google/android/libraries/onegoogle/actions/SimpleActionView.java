package com.google.android.libraries.onegoogle.actions;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SimpleActionView extends android.widget.LinearLayout implements aelw {
    public ahyn a;

    public SimpleActionView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = ahwt.a;
        if (getBackground() != null) {
            super.setBackground(a(getBackground()));
        }
    }

    private final android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return com.google.android.material.focus.FocusRingDrawable.b(drawable) == null ? com.google.android.material.focus.FocusRingDrawable.a(getContext(), drawable) : drawable;
    }

    public final void b(defpackage.aelt aeltVar) {
        if (this.a.f()) {
            aeltVar.b(this, ((java.lang.Integer) this.a.b()).intValue());
        }
    }

    public final void d(defpackage.aelt aeltVar) {
        if (this.a.f()) {
            aeltVar.c(this);
        }
    }

    @Override // android.view.View
    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackground(a(drawable));
    }

    public SimpleActionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleActionView(android.content.Context context) {
        this(context, null);
    }
}
