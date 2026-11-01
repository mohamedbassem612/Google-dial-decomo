package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class NavigationBarButton extends android.widget.Button {
    public NavigationBarButton(android.content.Context context) {
        super(context);
        a();
    }

    private final void a() {
        if (isInEditMode()) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        for (int i = 0; i < compoundDrawablesRelative.length; i++) {
            android.graphics.drawable.Drawable drawable = compoundDrawablesRelative[i];
            if (drawable != null) {
                compoundDrawablesRelative[i] = defpackage.agio.a(drawable);
            }
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    private final void b() {
        android.content.res.ColorStateList textColors = getTextColors();
        if (textColors != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = getCompoundDrawables();
            android.graphics.drawable.Drawable drawable = compoundDrawables[0];
            android.graphics.drawable.Drawable drawable2 = compoundDrawables[1];
            android.graphics.drawable.Drawable drawable3 = compoundDrawables[2];
            android.graphics.drawable.Drawable drawable4 = compoundDrawables[3];
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            android.graphics.drawable.Drawable[] drawableArr = {drawable, drawable2, drawable3, drawable4, compoundDrawablesRelative[0], compoundDrawablesRelative[2]};
            for (int i = 0; i < 6; i++) {
                android.graphics.drawable.Drawable drawable5 = drawableArr[i];
                if (drawable5 instanceof defpackage.agio) {
                    defpackage.agio agioVar = (defpackage.agio) drawable5;
                    agioVar.a = textColors;
                    if (agioVar.b()) {
                        agioVar.invalidateSelf();
                    }
                }
            }
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            drawable = defpackage.agio.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = defpackage.agio.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = defpackage.agio.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = defpackage.agio.a(drawable4);
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            drawable = defpackage.agio.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = defpackage.agio.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = defpackage.agio.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = defpackage.agio.a(drawable4);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public final void setTextColor(android.content.res.ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        b();
    }

    public NavigationBarButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
