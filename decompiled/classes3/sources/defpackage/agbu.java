package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class agbu extends android.widget.FrameLayout {
    private static final android.view.View.OnTouchListener h = new defpackage.agbt();
    public defpackage.agbv a;
    agal b;
    public int c;
    public final float d;
    public final int e;
    public android.graphics.Rect f;
    public boolean g;
    private final float i;
    private final int j;
    private android.content.res.ColorStateList k;
    private android.graphics.PorterDuff.Mode l;

    protected agbu(android.content.Context context, android.util.AttributeSet attributeSet) {
        agaf agafVar;
        super(agdv.a(context, attributeSet, 0, 0), attributeSet);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, defpackage.agbw.a);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.b = new agal(agal.m(context2, attributeSet, 0, 0));
        }
        float f = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        this.i = f;
        setBackgroundTintList(agab.o(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(a.q(typedArrayObtainStyledAttributes.getInt(5, -1), android.graphics.PorterDuff.Mode.SRC_IN));
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(h);
        setFocusable(true);
        if (getBackground() == null) {
            int iAb = agab.ab(agab.X(this, 2130969105), agab.X(this, 2130969053), f);
            agal agalVar = this.b;
            if (agalVar != null) {
                java.lang.String str = defpackage.agbv.b;
                agafVar = new agaf(agalVar);
                agafVar.R(android.content.res.ColorStateList.valueOf(iAb));
            } else {
                android.content.res.Resources resources = getResources();
                java.lang.String str2 = defpackage.agbv.b;
                float dimension = resources.getDimension(2131167187);
                agaf gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iAb);
                agafVar = gradientDrawable;
            }
            android.content.res.ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                agafVar.setTintList(colorStateList);
            }
            setBackgroundDrawable(agafVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        android.view.WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        defpackage.agbv agbvVar = this.a;
        if (agbvVar != null && (rootWindowInsets = agbvVar.j.getRootWindowInsets()) != null) {
            agbvVar.q = da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(rootWindowInsets));
            agbvVar.j();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        defpackage.agbv agbvVar = this.a;
        if (agbvVar == null || !agbvVar.k()) {
            return;
        }
        defpackage.agbv.a.post(new defpackage.aflt(agbvVar, 17, (byte[]) null));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        defpackage.agbv agbvVar = this.a;
        if (agbvVar == null || !agbvVar.s) {
            return;
        }
        agbvVar.i();
        agbvVar.s = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.j;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    @Override // android.view.View
    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.k != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.k);
            drawable.setTintMode(this.l);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        this.k = colorStateList;
        if (getBackground() != null) {
            android.graphics.drawable.Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.l);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        this.l = mode;
        if (getBackground() != null) {
            android.graphics.drawable.Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.g || !(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        this.f = new android.graphics.Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        defpackage.agbv agbvVar = this.a;
        if (agbvVar != null) {
            agbvVar.j();
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : h);
        super.setOnClickListener(onClickListener);
    }

    protected agbu(android.content.Context context) {
        this(context, null);
    }
}
