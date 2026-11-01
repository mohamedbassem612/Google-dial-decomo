package com.google.android.setupcompat.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class TemplateLayout extends android.widget.FrameLayout {
    private android.view.ViewGroup a;
    private final java.util.Map b;
    public float e;
    public android.view.ViewTreeObserver.OnPreDrawListener f;

    public TemplateLayout(android.content.Context context, int i, int i2) {
        super(context);
        this.b = new java.util.HashMap();
        d(i, i2, null, 2130970534);
    }

    private final void d(int i, int i2, android.util.AttributeSet attributeSet, int i3) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.agfi.g, i3, 0);
        if (i == 0) {
            i = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        }
        if (i2 == 0) {
            i2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        }
        c(attributeSet, i3);
        super.addView(a(android.view.LayoutInflater.from(getContext()), i), -1, generateDefaultLayoutParams());
        android.view.ViewGroup viewGroupB = b(i2);
        this.a = viewGroupB;
        if (viewGroupB == null) {
            throw new java.lang.IllegalArgumentException("Container cannot be null in TemplateLayout");
        }
        l();
        typedArrayObtainStyledAttributes.recycle();
        dzs.i(this, new defpackage.agfr(this));
    }

    protected android.view.View a(android.view.LayoutInflater layoutInflater, int i) {
        return i(layoutInflater, 0, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        this.a.addView(view, i, layoutParams);
    }

    protected android.view.ViewGroup b(int i) {
        return (android.view.ViewGroup) findViewById(i);
    }

    public android.view.View g(int i) {
        return findViewById(i);
    }

    public float getXFraction() {
        return this.e;
    }

    protected android.view.View h() {
        return null;
    }

    protected final android.view.View i(android.view.LayoutInflater layoutInflater, int i, int i2) {
        if (i2 == 0) {
            throw new java.lang.IllegalArgumentException("android:layout not specified for TemplateLayout");
        }
        if (i != 0) {
            layoutInflater = android.view.LayoutInflater.from(new defpackage.agfk(layoutInflater.getContext(), i));
        }
        return layoutInflater.inflate(i2, (android.view.ViewGroup) this, false);
    }

    public final defpackage.aggl j(java.lang.Class cls) {
        return (defpackage.aggl) this.b.get(cls);
    }

    public java.util.List k() {
        android.view.View viewH = h();
        return viewH != null ? java.util.Collections.singletonList(viewH) : java.util.Collections.EMPTY_LIST;
    }

    protected final void m(java.lang.Class cls, defpackage.aggl agglVar) {
        this.b.put(cls, agglVar);
    }

    public void setXFraction(float f) {
        this.e = f;
        int width = getWidth();
        if (width != 0) {
            setTranslationX(width * f);
        } else if (this.f == null) {
            this.f = new defpackage.agfs(this);
            getViewTreeObserver().addOnPreDrawListener(this.f);
        }
    }

    public TemplateLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new java.util.HashMap();
        d(0, 0, attributeSet, 2130970534);
    }

    protected void l() {
    }

    public TemplateLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new java.util.HashMap();
        d(0, 0, attributeSet, i);
    }

    protected void c(android.util.AttributeSet attributeSet, int i) {
    }
}
