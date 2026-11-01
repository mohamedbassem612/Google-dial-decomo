package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aftn {
    static final android.animation.TimeInterpolator a = afpc.c;
    public static final int b = 2130970055;
    public static final int c = 2130970071;
    public static final int d = 2130970058;
    public static final int e = 2130970069;
    static final int[] f = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] g = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] h = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] i = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] j = {android.R.attr.state_enabled};
    static final int[] k = new int[0];
    public final com.google.android.material.floatingactionbutton.FloatingActionButton B;
    final com.google.android.material.floatingactionbutton.FloatingActionButton.ShadowDelegateImpl C;
    private android.animation.StateListAnimator D;
    public agal l;
    public agaf m;
    public android.graphics.drawable.Drawable n;
    public defpackage.afsv o;
    public android.graphics.drawable.Drawable p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public int u;
    public android.animation.Animator v;
    public defpackage.afpg w;
    public defpackage.afpg x;
    public int z;
    public float y = 1.0f;
    public int A = 0;
    private final android.graphics.Rect E = new android.graphics.Rect();
    private final android.graphics.RectF F = new android.graphics.RectF();
    private final android.graphics.RectF G = new android.graphics.RectF();
    private final android.graphics.Matrix H = new android.graphics.Matrix();

    public aftn(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, com.google.android.material.floatingactionbutton.FloatingActionButton.ShadowDelegateImpl shadowDelegateImpl) {
        this.B = floatingActionButton;
        this.C = shadowDelegateImpl;
    }

    private final android.animation.Animator m(float f2, float f3) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        animatorSet.play(android.animation.ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L)).with(android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    public final int a() {
        if (this.q) {
            return java.lang.Math.max((this.u - this.B.b()) / 2, 0);
        }
        return 0;
    }

    public final android.animation.AnimatorSet b(defpackage.afpg afpgVar, float f2, float f3, float f4) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Property property = android.view.View.ALPHA;
        float[] fArr = {f2};
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) property, fArr);
        afpgVar.d("opacity").b(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.SCALE_X, f3);
        afpgVar.d("scale").b(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.SCALE_Y, f3);
        afpgVar.d("scale").b(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        android.graphics.Matrix matrix = this.H;
        d(f4, matrix);
        android.animation.ObjectAnimator objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(floatingActionButton, new defpackage.afpe(), new defpackage.aftl(this), new android.graphics.Matrix(matrix));
        afpgVar.d("iconScale").b(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        afsq.h(animatorSet, arrayList);
        return animatorSet;
    }

    public final android.animation.AnimatorSet c(final float f2, final float f3, final float f4, int i2, int i3) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f5 = this.y;
        final android.graphics.Matrix matrix = new android.graphics.Matrix(this.H);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: afti
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                float fA = afpc.a(alpha, f2, 0.0f, 0.2f, fFloatValue);
                defpackage.aftn aftnVar = this.a;
                com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton2 = aftnVar.B;
                floatingActionButton2.setAlpha(fA);
                float f6 = f3;
                float f7 = scaleX;
                floatingActionButton2.setScaleX(f7 + ((f6 - f7) * fFloatValue));
                float f8 = scaleY;
                floatingActionButton2.setScaleY(f8 + ((f6 - f8) * fFloatValue));
                float f9 = f4;
                float f10 = f5;
                float f11 = f10 + (fFloatValue * (f9 - f10));
                aftnVar.y = f11;
                android.graphics.Matrix matrix2 = matrix;
                aftnVar.d(f11, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        afsq.h(animatorSet, arrayList);
        animatorSet.setDuration(agab.u(floatingActionButton.getContext(), i2, floatingActionButton.getContext().getResources().getInteger(2131492995)));
        animatorSet.setInterpolator(agab.C(floatingActionButton.getContext(), i3, afpc.b));
        return animatorSet;
    }

    public final void d(float f2, android.graphics.Matrix matrix) {
        matrix.reset();
        android.graphics.drawable.Drawable drawable = this.B.getDrawable();
        if (drawable == null || this.z == 0) {
            return;
        }
        android.graphics.RectF rectF = this.F;
        android.graphics.RectF rectF2 = this.G;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f3 = this.z;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.CENTER);
        float f4 = this.z / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(float f2, float f3, float f4) {
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        if (floatingActionButton.getStateListAnimator() == this.D) {
            android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
            stateListAnimator.addState(f, m(f2, f4));
            stateListAnimator.addState(g, m(f2, f3));
            stateListAnimator.addState(h, m(f2, f3));
            stateListAnimator.addState(i, m(f2, f3));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(android.animation.ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L));
            arrayList.add(android.animation.ObjectAnimator.ofFloat(floatingActionButton, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((android.animation.Animator[]) arrayList.toArray(new android.animation.Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            stateListAnimator.addState(k, m(0.0f, 0.0f));
            this.D = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (k()) {
            i();
        }
    }

    public final void f(float f2) {
        this.y = f2;
        android.graphics.Matrix matrix = this.H;
        d(f2, matrix);
        this.B.setImageMatrix(matrix);
    }

    public final void g(agal agalVar) {
        this.l = agalVar;
        agaf agafVar = this.m;
        if (agafVar != null) {
            agafVar.q(agalVar);
        }
        defpackage.afsv afsvVar = this.o;
        if (afsvVar != null) {
            afsvVar.h = agalVar;
            afsvVar.invalidateSelf();
        }
    }

    public final void h() {
        f(this.y);
    }

    public final void i() {
        android.graphics.Rect rect = this.E;
        com.google.android.material.floatingactionbutton.FloatingActionButton.ShadowDelegateImpl shadowDelegateImpl = this.C;
        if (shadowDelegateImpl.isCompatPaddingEnabled()) {
            int iA = a();
            float elevation = this.B.getElevation() + this.t;
            int iMax = java.lang.Math.max(iA, (int) java.lang.Math.ceil(elevation));
            int iMax2 = java.lang.Math.max(iA, (int) java.lang.Math.ceil(elevation * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
        } else if (j()) {
            int iB = (this.u - this.B.b()) / 2;
            rect.set(iB, iB, iB, iB);
        } else {
            rect.set(0, 0, 0, 0);
        }
        dzk.y(this.p, "Didn't initialize content background");
        if (k()) {
            shadowDelegateImpl.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable(this.p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            shadowDelegateImpl.setBackgroundDrawable(this.p);
        }
        shadowDelegateImpl.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    final boolean j() {
        return this.q && this.B.b() < this.u;
    }

    final boolean k() {
        return this.C.isCompatPaddingEnabled() || j();
    }

    public final boolean l() {
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.B;
        return floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
    }
}
