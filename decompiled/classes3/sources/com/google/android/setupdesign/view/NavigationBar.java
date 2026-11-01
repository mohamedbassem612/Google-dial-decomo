package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class NavigationBar extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    public NavigationBar(android.content.Context context) {
        super(a(context));
        b();
    }

    private static android.content.Context a(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970677, android.R.attr.colorForeground, android.R.attr.colorBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            android.graphics.Color.colorToHSV(typedArrayObtainStyledAttributes.getColor(1, 0), fArr);
            android.graphics.Color.colorToHSV(typedArrayObtainStyledAttributes.getColor(2, 0), fArr2);
            resourceId = fArr[2] > fArr2[2] ? 2132084073 : 2132084074;
        }
        typedArrayObtainStyledAttributes.recycle();
        return new android.view.ContextThemeWrapper(context, resourceId);
    }

    private final void b() {
        if (isInEditMode()) {
            return;
        }
        android.view.View.inflate(getContext(), 2131624597, this);
    }

    public NavigationBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(a(context), attributeSet);
        b();
    }

    public NavigationBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(a(context), attributeSet, i);
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
    }
}
