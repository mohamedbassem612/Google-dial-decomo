package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghr implements defpackage.aggl {
    public final com.google.android.setupcompat.internal.TemplateLayout a;

    public aghr(com.google.android.setupcompat.internal.TemplateLayout templateLayout, android.util.AttributeSet attributeSet, int i) {
        android.widget.TextView textViewA;
        this.a = templateLayout;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, defpackage.aggy.e, i, 0);
        java.lang.CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        if (text != null) {
            b(text);
        }
        android.content.res.ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null && (textViewA = a()) != null) {
            textViewA.setTextColor(colorStateList);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final android.widget.TextView a() {
        return (android.widget.TextView) this.a.g(2131429118);
    }

    public final void b(java.lang.CharSequence charSequence) {
        android.widget.TextView textViewA = a();
        if (textViewA != null) {
            textViewA.setText(charSequence);
            android.widget.TextView textViewA2 = a();
            if (textViewA2 != null) {
                textViewA2.setVisibility(0);
            }
        }
    }
}
