package com.google.android.libraries.communications.ux.views.twolinedchip;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class TwoLinedChip extends android.widget.FrameLayout {
    private java.lang.CharSequence a;
    private java.lang.CharSequence b;
    private int c;
    private int d;
    private int e;
    private int f;
    private android.content.res.ColorStateList g;
    private final android.widget.TextView h;
    private final android.widget.TextView i;
    private final android.widget.TextView j;
    private final android.widget.ImageView k;
    private int l;
    private int m;
    private int n;
    private int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoLinedChip(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aooh.f(context, "context");
        this.c = 2132084328;
        this.d = 2132084329;
        this.e = 2132084327;
        android.widget.FrameLayout.inflate(context, 2131624672, this);
        android.view.View viewFindViewById = findViewById(2131428499);
        aooh.e(viewFindViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        this.h = textView;
        android.view.View viewFindViewById2 = findViewById(2131429289);
        aooh.e(viewFindViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById2;
        this.i = textView2;
        android.view.View viewFindViewById3 = findViewById(2131427942);
        aooh.e(viewFindViewById3, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) viewFindViewById3;
        this.j = textView3;
        android.view.View viewFindViewById4 = findViewById(2131427759);
        aooh.e(viewFindViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById4;
        this.k = imageView;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.abpv.a, i, 2132085465);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, this.c);
            this.c = resourceId;
            textView.setTextAppearance(resourceId);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(13, this.d);
            this.d = resourceId2;
            textView2.setTextAppearance(resourceId2);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(8, this.e);
            this.e = resourceId3;
            textView3.setTextAppearance(resourceId3);
            d(typedArrayObtainStyledAttributes.getString(1));
            a(typedArrayObtainStyledAttributes.getString(7));
            b(typedArrayObtainStyledAttributes.getResourceId(9, 0));
            c(typedArrayObtainStyledAttributes.getColorStateList(10));
            imageView.setImageTintList(this.g);
            int i2 = this.f;
            if (i2 != 0) {
                imageView.setImageResource(i2);
            }
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, this.l);
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, this.m);
            this.n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, this.n);
            this.o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, this.o);
            agal agalVar = new agal(agal.m(context, attributeSet, i, 2132085465));
            android.view.View childAt = getChildAt(0);
            aooh.c(typedArrayObtainStyledAttributes);
            android.content.res.ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(6);
            android.content.res.ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(11);
            float dimension = typedArrayObtainStyledAttributes.getDimension(12, 0.0f);
            agaf agafVar = new agaf(agalVar);
            agafVar.N(context);
            agafVar.setTintList(colorStateList);
            agafVar.X(dimension, colorStateList2);
            android.graphics.drawable.Drawable insetDrawable = new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) agafVar, this.l, this.n, this.m, this.o);
            android.content.res.ColorStateList colorStateList3 = typedArrayObtainStyledAttributes.getColorStateList(14);
            if (colorStateList3 != null) {
                agaf agafVar2 = new agaf(agalVar);
                agafVar2.setTint(-1);
                insetDrawable = new android.graphics.drawable.RippleDrawable(colorStateList3, insetDrawable, agafVar2);
            }
            childAt.setBackground(insetDrawable);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void e() {
        java.lang.CharSequence charSequence = this.a;
        java.lang.CharSequence charSequence2 = this.b;
        android.widget.TextView textView = this.h;
        if (charSequence2 != null) {
            textView.setText((java.lang.CharSequence) null);
            this.i.setText(charSequence);
            this.j.setText(charSequence2);
        } else {
            textView.setText(charSequence);
            this.i.setText((java.lang.CharSequence) null);
            this.j.setText((java.lang.CharSequence) null);
        }
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.b = charSequence;
        e();
    }

    public final void b(int i) {
        this.f = i;
        this.k.setImageResource(i);
    }

    public final void c(android.content.res.ColorStateList colorStateList) {
        this.g = colorStateList;
        this.k.setImageTintList(colorStateList);
    }

    public final void d(java.lang.CharSequence charSequence) {
        this.a = charSequence;
        e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        aooh.f(accessibilityNodeInfo, "info");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(true != isClickable() ? "android.view.View" : "android.widget.Button");
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        aooh.f(accessibilityEvent, "event");
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setEnabled(isEnabled());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.CharSequence charSequence = this.a;
        if (charSequence != null) {
            sb.append(charSequence);
        }
        if (this.b != null) {
            sb.append('\n');
            sb.append(this.b);
        }
        accessibilityEvent.setContentDescription(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoLinedChip(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoLinedChip(android.content.Context context) {
        this(context, null, 0, 6, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ TwoLinedChip(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, aooc aoocVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
