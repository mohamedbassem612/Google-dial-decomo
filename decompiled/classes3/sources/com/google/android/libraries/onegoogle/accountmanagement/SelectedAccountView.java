package com.google.android.libraries.onegoogle.accountmanagement;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SelectedAccountView extends androidx.constraintlayout.widget.ConstraintLayout implements aeir {
    private static final android.util.Property u = android.util.Property.of(android.widget.ImageView.class, java.lang.Float.class, "rotation");
    public final com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc j;
    public final android.widget.ImageView k;
    public final android.widget.ImageView l;
    public final android.widget.FrameLayout m;
    public final android.animation.ObjectAnimator n;
    public boolean o;
    public aeis p;
    public java.lang.String q;
    public java.lang.String r;
    public aeiq s;
    public defpackage.alln t;
    private final android.widget.TextView v;
    private final android.widget.TextView w;
    private final android.widget.TextView x;
    private final java.lang.String y;
    private final java.lang.String z;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectedAccountView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = aeis.a().s();
        android.view.LayoutInflater.from(context).inflate(2131624428, (android.view.ViewGroup) this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165282);
        if (dimensionPixelSize != ((androidx.constraintlayout.widget.ConstraintLayout) this).d) {
            ((androidx.constraintlayout.widget.ConstraintLayout) this).d = dimensionPixelSize;
            requestLayout();
        }
        this.v = (android.widget.TextView) findViewById(2131428613);
        this.w = (android.widget.TextView) findViewById(2131428614);
        this.x = (android.widget.TextView) findViewById(2131427905);
        this.j = (com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc) findViewById(2131427381);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(2131428605);
        this.k = imageView;
        this.n = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) u, 360.0f, 180.0f);
        this.l = (android.widget.ImageView) findViewById(2131428610);
        this.m = (android.widget.FrameLayout) findViewById(2131428616);
        this.y = getResources().getString(2132019577);
        this.z = getResources().getString(2132019578);
        if (getBackground() != null) {
            super.setBackground(k(getBackground()));
        }
    }

    private final android.graphics.drawable.Drawable k(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        com.google.android.material.focus.FocusRingDrawable focusRingDrawableB = com.google.android.material.focus.FocusRingDrawable.b(drawable);
        if (focusRingDrawableB != null) {
            l(focusRingDrawableB);
            return drawable;
        }
        android.graphics.drawable.Drawable drawableA = com.google.android.material.focus.FocusRingDrawable.a(getContext(), drawable);
        com.google.android.material.focus.FocusRingDrawable focusRingDrawableB2 = com.google.android.material.focus.FocusRingDrawable.b(drawableA);
        if (focusRingDrawableB2 == null) {
            return drawableA;
        }
        l(focusRingDrawableB2);
        return drawableA;
    }

    private final void l(com.google.android.material.focus.FocusRingDrawable focusRingDrawable) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        float dimension = getContext().getTheme().resolveAttribute(2130970145, typedValue, true) ? typedValue.getDimension(getResources().getDisplayMetrics()) : 0.0f;
        if (dimension > 0.0f) {
            aguv aguvVar = new aguv((byte[]) null);
            aguvVar.i(dimension);
            aguvVar.j(dimension);
            aguvVar.g(0.0f);
            aguvVar.h(0.0f);
            focusRingDrawable.e(new agal(aguvVar));
        }
    }

    public final android.widget.TextView e() {
        return this.x;
    }

    public final android.widget.TextView f() {
        return this.v;
    }

    public final android.widget.TextView g() {
        return this.w;
    }

    public final com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc h() {
        return this.j;
    }

    public final void i() {
        ahyn ahynVar = this.p.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(boolean z) {
        int i = dzs.a;
        android.widget.ImageView imageView = this.k;
        imageView.setImportantForAccessibility(1);
        imageView.setContentDescription(z ? this.q : this.r);
        dzs.k(this, z ? this.z : this.y);
    }

    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackground(k(drawable));
    }

    public SelectedAccountView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountView(android.content.Context context) {
        this(context, null);
    }
}
