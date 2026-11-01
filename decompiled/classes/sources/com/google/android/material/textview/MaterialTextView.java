package com.google.android.material.textview;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class MaterialTextView extends android.support.v7.widget.AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(defpackage.agdv.b(context, attributeSet, i, 0, new int[0]), attributeSet, i);
        int i2 = defpackage.agdv.a;
        c(attributeSet, i, 0);
    }

    private static int a(android.content.Context context, android.content.res.TypedArray typedArray, int... iArr) {
        int iL = -1;
        for (int i = 0; i < 2 && iL < 0; i++) {
            iL = defpackage.agab.l(context, typedArray, iArr[i], -1);
        }
        return iL;
    }

    private final void b(android.content.res.Resources.Theme theme, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, defpackage.agdu.a);
        int iA = a(getContext(), typedArrayObtainStyledAttributes, 2, 4);
        typedArrayObtainStyledAttributes.recycle();
        if (iA >= 0) {
            defpackage.dzq.d(this, iA);
        }
    }

    private final void c(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.Context context = getContext();
        if (defpackage.agab.z(context.getTheme(), 2130970824, true)) {
            android.content.res.Resources.Theme theme = context.getTheme();
            int[] iArr = defpackage.agdu.b;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int iA = a(context, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iA == -1) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    b(theme, resourceId);
                }
            }
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        if (defpackage.agab.z(context.getTheme(), 2130970824, true)) {
            b(context.getTheme(), i);
        }
    }

    public MaterialTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(android.content.Context context) {
        this(context, null);
    }

    @java.lang.Deprecated
    public MaterialTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(defpackage.agdv.a(context, attributeSet, i, i2), attributeSet, i);
        c(attributeSet, i, i2);
    }
}
