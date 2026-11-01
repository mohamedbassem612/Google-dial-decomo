package com.google.android.libraries.onegoogle.account.disc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AccountParticleDisc extends android.widget.FrameLayout {
    public final defpackage.aehs a;
    public final com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout b;
    public final com.google.android.libraries.onegoogle.account.disc.RingFrameLayout c;
    public final java.util.concurrent.CopyOnWriteArrayList d;
    public defpackage.aehz e;
    public defpackage.aeim f;
    public defpackage.aelt g;
    public boolean h;
    public boolean i;
    public java.lang.Object j;
    public defpackage.aehm k;
    public ahyn l;
    public boolean m;
    public final defpackage.aejm n;
    public defpackage.wsk o;
    public defpackage.vqf p;
    private final boolean q;
    private final boolean r;
    private final int s;
    private ahyn t;
    private final aehj u;

    public AccountParticleDisc(android.content.Context context, android.util.AttributeSet attributeSet, int i, boolean z, boolean z2) {
        super(context, attributeSet, i);
        this.d = new java.util.concurrent.CopyOnWriteArrayList();
        this.n = new defpackage.aejm(new aehj());
        ahwt ahwtVar = ahwt.a;
        this.t = ahwtVar;
        this.l = ahwtVar;
        this.u = new aehj(this);
        this.m = z2;
        if (z) {
            android.view.LayoutInflater.from(context).inflate(2131624452, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(context).inflate(2131623969, (android.view.ViewGroup) this, true);
        }
        defpackage.aehs aehsVar = (defpackage.aehs) findViewById(2131428602);
        this.a = aehsVar;
        if (z) {
            aehsVar.l(defpackage.akvo.b, 2);
        }
        this.b = (com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout) findViewById(2131427535);
        this.c = (com.google.android.libraries.onegoogle.account.disc.RingFrameLayout) findViewById(2131428805);
        aehj.u(context, z2);
        aehsVar.a = aehj.u(aehsVar.getContext(), z2);
        aehsVar.b();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aeig.a, i, 2132083465);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
            dimensionPixelSize = dimensionPixelSize == Integer.MIN_VALUE ? typedArrayObtainStyledAttributes.getDimensionPixelSize(4, Integer.MIN_VALUE) : dimensionPixelSize;
            int dimension = 0;
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.q = z3;
            this.i = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(3, false);
            this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(2131167238));
            aehsVar.h(typedArrayObtainStyledAttributes.getBoolean(6, true));
            typedArrayObtainStyledAttributes.recycle();
            a();
            if (dimensionPixelSize != Integer.MIN_VALUE) {
                ahvr.bZ(!c(), "setMaxDiscContentSize is only allowed before calling initialize.");
                this.t = ahyn.h(java.lang.Integer.valueOf(dimensionPixelSize));
                if (this.h || this.i || z3) {
                    dimension = (int) getResources().getDimension(((float) dimensionPixelSize) > getResources().getDimension(2131167251) ? 2131167253 : 2131167252);
                }
                android.view.ViewGroup.LayoutParams layoutParams = aehsVar.getLayoutParams();
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                aehsVar.e(dimensionPixelSize - (dimension << 1));
            }
            if (getBackground() != null) {
                super.setBackground(e(getBackground()));
            }
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        com.google.android.material.focus.FocusRingDrawable focusRingDrawableB = com.google.android.material.focus.FocusRingDrawable.b(drawable);
        if (focusRingDrawableB != null) {
            f(focusRingDrawableB);
            return drawable;
        }
        android.graphics.drawable.Drawable drawableA = com.google.android.material.focus.FocusRingDrawable.a(getContext(), drawable);
        com.google.android.material.focus.FocusRingDrawable focusRingDrawableB2 = com.google.android.material.focus.FocusRingDrawable.b(drawableA);
        if (focusRingDrawableB2 == null) {
            return drawableA;
        }
        f(focusRingDrawableB2);
        return drawableA;
    }

    private static void f(com.google.android.material.focus.FocusRingDrawable focusRingDrawable) {
        aguv aguvVar = new aguv((byte[]) null);
        aguvVar.l(new agai(0.5f));
        focusRingDrawable.e(new agal(aguvVar));
    }

    public final void a() {
        defpackage.aehs aehsVar = this.a;
        aehsVar.j();
        aehsVar.g(true);
    }

    public final void b() {
        defpackage.aelt aeltVar = this.g;
        if (aeltVar != null) {
            defpackage.aehz aehzVar = this.e;
            if (aehzVar != null) {
                aehzVar.c = aeltVar;
            }
            defpackage.aeim aeimVar = this.f;
            if (aeimVar != null) {
                aeimVar.c = this.g;
            }
        }
    }

    public final boolean c() {
        return this.o != null;
    }

    public final void d(defpackage.wsk wskVar, defpackage.aehm aehmVar) {
        ahvr.ci(wskVar);
        this.o = wskVar;
        this.k = aehmVar;
        if (this.r && this.t.f()) {
            int iIntValue = this.s - ((java.lang.Integer) this.t.b()).intValue();
            int paddingLeft = (iIntValue - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (iIntValue - getPaddingTop()) - getPaddingBottom();
            int iMax = java.lang.Math.max(0, (int) java.lang.Math.ceil(paddingLeft / 2.0f));
            int iMax2 = java.lang.Math.max(0, (int) java.lang.Math.ceil(paddingTop / 2.0f));
            setPadding(getPaddingLeft() + iMax, getPaddingTop() + iMax2, getPaddingRight() + iMax, getPaddingBottom() + iMax2);
        }
        if (this.h || this.i) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        aesg.i(new defpackage.aawj(this, aehmVar, 17, null));
        if (this.i) {
            defpackage.aeim aeimVar = new defpackage.aeim(this.a, this.c);
            this.f = aeimVar;
            aeimVar.h = this.u;
        }
        if (this.h) {
            this.e = new defpackage.aehz(this.b, this.a);
        }
        b();
    }

    @Override // android.view.View
    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackground(e(drawable));
    }

    public AccountParticleDisc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970122);
    }

    public AccountParticleDisc(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
    }

    public AccountParticleDisc(android.content.Context context, android.util.AttributeSet attributeSet, int i, boolean z) {
        this(context, attributeSet, i, z, defpackage.anhg.a.eZ().a(context));
    }

    public AccountParticleDisc(android.content.Context context) {
        this(context, (android.util.AttributeSet) null);
    }

    public AccountParticleDisc(android.content.Context context, boolean z) {
        this(context, null, 2130970122, z);
    }
}
