package androidx.cardview.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class CardView extends android.widget.FrameLayout {
    private static final int[] f = {android.R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public final defpackage.abr e;

    public CardView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.c = rect;
        this.d = new android.graphics.Rect();
        defpackage.abr abrVar = new defpackage.abr(this);
        this.e = abrVar;
        int[] iArr = defpackage.abq.a;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 2132083201);
        int i2 = dzs.a;
        dzp.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 2132083201);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            android.graphics.Color.colorToHSV(color, fArr);
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(2131099775) : getResources().getColor(2131099774));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        defpackage.abs absVar = new defpackage.abs(colorStateListValueOf, dimension);
        abrVar.a = absVar;
        androidx.cardview.widget.CardView cardView = abrVar.b;
        cardView.setBackgroundDrawable(absVar);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        android.graphics.drawable.Drawable drawable = abrVar.a;
        boolean zC = abrVar.c();
        boolean zB = abrVar.b();
        defpackage.abs absVar2 = (defpackage.abs) drawable;
        if (dimension3 != absVar2.b || absVar2.c != zC || absVar2.d != zB) {
            absVar2.b = dimension3;
            absVar2.c = zC;
            absVar2.d = zB;
            absVar2.b(null);
            absVar2.invalidateSelf();
        }
        sa.e(abrVar);
    }

    public final float a() {
        return sa.c(this.e);
    }

    public void c(int i) {
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(i);
        defpackage.abs absVar = (defpackage.abs) this.e.a;
        absVar.a(colorStateListValueOf);
        absVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968815);
    }

    public CardView(android.content.Context context) {
        this(context, null);
    }
}
