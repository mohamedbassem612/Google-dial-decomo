package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aekj extends android.widget.FrameLayout implements aelw {
    public static final java.lang.String a = "aekj";
    public final aehj A;
    private boolean D;
    private int E;
    private final boolean F;
    private final float G;
    private final float H;
    private final int I;
    private final int J;
    private final int K;
    private final int L;
    private final int M;
    private final android.view.View N;
    private final android.view.ViewGroup O;
    private final android.view.ViewGroup P;
    private final com.google.android.libraries.onegoogle.common.LockableNestedScrollView Q;
    private final android.view.View R;
    private final com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView S;
    private final android.view.View T;
    private final android.view.View U;
    private final android.view.View V;
    private final android.view.View W;
    private final android.view.View aa;
    private final agaf ab;
    private final agaf ac;
    private final agaf ad;
    private final ahyn ae;
    private final na af;
    private final android.widget.FrameLayout ag;
    private final afsr ah;
    private final android.widget.TextView ai;
    private final android.graphics.Rect aj;
    private final boolean ak;
    private final gkz al;
    private ahyn am;
    private int an;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public defpackage.aekm h;
    public final defpackage.aejr i;
    public final android.view.View j;
    public final android.support.v7.widget.RecyclerView k;
    public final android.support.v7.widget.RecyclerView l;
    public final com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView m;
    public final android.widget.Button n;
    public final android.view.ViewGroup o;
    public final com.google.android.material.card.MaterialCardView p;
    public final android.view.ViewGroup q;
    public final android.widget.TextView r;
    public android.widget.Button s;
    public android.widget.Button t;
    public defpackage.aejm u;
    public defpackage.aejm v;
    public defpackage.aekq w;
    public nh x;
    public android.animation.AnimatorSet y;
    public aesg z;
    private static final android.util.Property B = android.util.Property.of(android.view.View.class, java.lang.Float.class, "alpha");
    private static final android.util.Property C = android.util.Property.of(agaf.class, java.lang.Integer.class, "alpha");
    static final android.view.animation.Interpolator b = new android.view.animation.PathInterpolator(0.54f, 0.01f, 0.61f, 0.99f);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aekj(android.content.Context context, defpackage.aeku aekuVar) {
        super(new android.view.ContextThemeWrapper(context, aekuVar.b()), null, 0);
        int dimensionPixelSize = 0;
        this.af = new defpackage.aekb(this);
        this.aj = new android.graphics.Rect();
        this.am = ahwt.a;
        this.an = 0;
        this.A = new defpackage.aekg(this);
        setId(2131428215);
        if (!aehj.j(getContext())) {
            throw new java.lang.IllegalStateException("ExpressSignInLayout has to be used with a Google Material theme");
        }
        android.view.LayoutInflater.from(getContext()).inflate(2131624212, this);
        boolean zA = defpackage.aejk.a(getContext());
        this.ak = zA;
        ahyn ahynVarD = aekuVar.d(getContext());
        this.ae = ahynVarD;
        this.ah = new afsr(getContext());
        android.content.Context context2 = getContext();
        defpackage.aejr aejrVar = new defpackage.aejr(aehj.p(context2, 2130970133), aehj.p(context2, 2130970131), aehj.p(context2, 2130970132), aehj.q(context2, 2130970137).getDimension(context2.getResources().getDisplayMetrics()), aehj.o(context2, 2130970144), aehj.p(context2, 2130970145), aehj.p(context2, 2130970146), aehj.p(context2, 2130970139), aehj.p(context2, 2130970148), aehj.p(context2, 2130970149), aehj.p(context2, 2130970159));
        this.i = aejrVar;
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.L = getResources().getColor(true != zA ? 2131102118 : 2131102119);
        this.G = aehj.h(displayMetrics, true != zA ? 5 : 8);
        float fH = aehj.h(displayMetrics, true != zA ? 3 : 8);
        this.H = fH;
        this.I = aehj.i(displayMetrics, 20);
        this.J = aehj.i(displayMetrics, 8);
        this.K = aehj.i(displayMetrics, 6);
        boolean zE = aekuVar.e();
        this.F = zE;
        glh glhVar = new glh();
        glhVar.U(0);
        glhVar.T(150L);
        android.view.animation.Interpolator interpolator = b;
        glhVar.W(interpolator);
        glhVar.S(new gkm());
        gko gkoVar = new gko();
        gkoVar.E(2131427388);
        gkoVar.E(2131428324);
        glhVar.S(gkoVar);
        glhVar.R(new defpackage.aekc(this));
        this.al = glhVar;
        this.j = findViewById(2131428870);
        android.view.View viewFindViewById = findViewById(2131428239);
        this.N = viewFindViewById;
        com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView selectedAccountView = (com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView) findViewById(2131428914);
        this.m = selectedAccountView;
        this.p = (com.google.android.material.card.MaterialCardView) findViewById(2131428368);
        selectedAccountView.n.setDuration(150L);
        selectedAccountView.n.setInterpolator(interpolator);
        this.k = findViewById(2131427392);
        this.l = findViewById(2131427387);
        android.view.View viewFindViewById2 = findViewById(2131428615);
        this.aa = viewFindViewById2;
        if (!zE) {
            android.content.res.Resources resources = getContext().getResources();
            dimensionPixelSize = resources.getDimensionPixelSize(2131165274) + (resources.getDimensionPixelSize(2131165271) << 1) + resources.getDimensionPixelSize(2131165272) + resources.getDimensionPixelSize(2131165275) + aejrVar.c;
        }
        this.M = dimensionPixelSize;
        C(dimensionPixelSize);
        this.n = (android.widget.Button) findViewById(2131428949);
        this.s = (android.widget.Button) findViewById(2131427860);
        this.t = (android.widget.Button) findViewById(2131428903);
        this.O = (android.view.ViewGroup) findViewById(2131428491);
        this.P = (android.view.ViewGroup) findViewById(2131427856);
        com.google.android.libraries.onegoogle.common.LockableNestedScrollView lockableNestedScrollView = (com.google.android.libraries.onegoogle.common.LockableNestedScrollView) findViewById(2131428880);
        this.Q = lockableNestedScrollView;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(2131428295);
        this.o = viewGroup;
        this.R = findViewById(2131428324);
        android.view.View viewFindViewById3 = findViewById(2131428915);
        this.T = viewFindViewById3;
        this.U = findViewById(2131428916);
        this.V = findViewById(2131427391);
        this.q = (android.view.ViewGroup) findViewById(2131428736);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131427763);
        this.ai = textView;
        this.r = (android.widget.TextView) findViewById(2131428020);
        com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = (com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView) findViewById(2131428598);
        this.S = overScrollControlledNestedScrollView;
        this.W = findViewById(2131427388);
        agaf agafVarW = w();
        agafVarW.Q(fH);
        agafVarW.q(x(aejrVar.a(), true));
        if (!aejrVar.a()) {
            agafVarW.ac();
        }
        this.ac = agafVarW;
        lockableNestedScrollView.setBackgroundDrawable(agafVarW);
        android.animation.LayoutTransition layoutTransition = new android.animation.LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.enableTransitionType(4);
        layoutTransition.setStartDelay(1, 0L);
        ((android.view.ViewGroup) viewFindViewById3).setLayoutTransition(layoutTransition);
        agaf agafVarW2 = w();
        this.ab = agafVarW2;
        agafVarW2.q(x(false, true));
        viewFindViewById3.setBackgroundDrawable(agafVarW2);
        if (ahynVarD.f()) {
            agafVarW2.setAlpha(0);
            viewFindViewById2.setBackgroundColor(((java.lang.Integer) ahynVarD.b()).intValue());
        }
        agaf agafVarW3 = w();
        this.ad = agafVarW3;
        agafVarW3.ac();
        viewGroup.setBackgroundDrawable(agafVarW3);
        agafVarW2.T(fH);
        agafVarW3.T(fH);
        ((androidx.core.widget.NestedScrollView) overScrollControlledNestedScrollView).g = new defpackage.aprf(this);
        overScrollControlledNestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new gj(this, 5));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.ag = frameLayout;
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, 0));
        viewFindViewById.setVisibility(8);
        findViewById(2131428146).setVisibility(true != zE ? 0 : 8);
        dzs.i(textView, new defpackage.aehq());
        dzs.k(textView, getResources().getString(2132019579));
        if (I()) {
            setSystemUiVisibility(getSystemUiVisibility() | 1280);
            setSystemUiVisibility(getSystemUiVisibility() | 512);
        }
        H(getResources().getConfiguration());
    }

    private final void A(boolean z) {
        int i;
        if (this.D != z) {
            this.D = z;
            agaf agafVar = this.ac;
            boolean z2 = true;
            if (agafVar.B() > 0.0f) {
                aift aiftVar = new aift(4);
                agaf agafVar2 = this.ab;
                android.animation.Animator[] animatorArr = new android.animation.Animator[2];
                int i2 = true != z ? 0 : 255;
                animatorArr[0] = android.animation.ObjectAnimator.ofInt(agafVar2, (android.util.Property<agaf, java.lang.Integer>) C, 255 - i2, i2).setDuration(150L);
                com.google.android.material.card.MaterialCardView materialCardView = this.p;
                defpackage.aejr aejrVar = this.i;
                float f = aejrVar.f;
                float f2 = true != z ? f : 0.0f;
                android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(f - f2, f2);
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.addUpdateListener(new mh(materialCardView, 13, (byte[]) null));
                animatorArr[1] = valueAnimatorOfFloat;
                aiftVar.j(animatorArr);
                if (!aejrVar.a()) {
                    android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(true != z ? 1.0f : 0.0f);
                    valueAnimatorOfFloat2.setDuration(100L);
                    valueAnimatorOfFloat2.setStartDelay(true != z ? 0L : 50L);
                    valueAnimatorOfFloat2.addUpdateListener(new defpackage.wer((java.lang.Object) agafVar, agafVar2, 3));
                    aiftVar.i(valueAnimatorOfFloat2);
                }
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.playTogether((java.util.Collection<android.animation.Animator>) aiftVar.h());
                animatorSet.addListener(new defpackage.aejy(this, z));
                animatorSet.start();
            }
            if (((android.view.ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin == 0) {
                this.U.setVisibility(true != z ? 8 : 0);
                boolean z3 = this.ak;
                if (z) {
                    setSystemUiVisibility(getSystemUiVisibility() & (-8193));
                    if (z3) {
                        setSystemUiVisibility(getSystemUiVisibility() | 8192);
                    }
                } else {
                    setSystemUiVisibility(getSystemUiVisibility() & (-8193));
                }
            }
            android.view.ViewGroup viewGroup = this.P;
            int i3 = true != z ? -2 : -1;
            viewGroup.getLayoutParams().height = i3;
            com.google.android.libraries.onegoogle.common.LockableNestedScrollView lockableNestedScrollView = this.Q;
            lockableNestedScrollView.getLayoutParams().height = i3;
            lockableNestedScrollView.h = !z;
            android.view.View view = this.R;
            int i4 = true != z ? 0 : 8;
            view.setVisibility(i4);
            if (this.ae.f()) {
                this.aa.setVisibility(i4);
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            if (z) {
                i = 0;
            } else {
                i = this.i.g;
                z2 = false;
            }
            marginLayoutParams.topMargin = i;
            C(z2 ? 0 : this.M);
            k(viewGroup, z2 ? 0 : this.i.a);
        }
    }

    private static void B(android.view.View view, int i) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i);
        view.setLayoutParams(marginLayoutParams);
    }

    private final void C(int i) {
        if (this.F) {
            return;
        }
        android.view.View view = this.aa;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        view.setLayoutParams(marginLayoutParams);
    }

    private final void D() {
        if (this.p.getVisibility() == 0) {
            y();
        } else {
            z();
        }
    }

    private final void E(boolean z, boolean z2) {
        this.ai.setVisibility(true != (aehj.g(getContext()) && !z && z2) ? 8 : 0);
    }

    private final void F(float f, agaf agafVar, android.view.View view) {
        if (!this.c || this.W.getVisibility() == 8) {
            f = 0.0f;
        }
        float f2 = this.G;
        int i = dzs.a;
        float f3 = f2 * f;
        view.setElevation(f3);
        ahyn ahynVar = this.ae;
        if (ahynVar.f()) {
            agafVar.R(android.content.res.ColorStateList.valueOf(this.ah.a(((java.lang.Integer) ahynVar.b()).intValue(), f)));
        } else {
            agafVar.Q(f3);
        }
    }

    private final void G(boolean z) {
        this.ad.q(x(this.i.a(), z));
    }

    private final void H(android.content.res.Configuration configuration) {
        android.view.ViewGroup viewGroup = this.O;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (configuration == null || layoutParams == null) {
            return;
        }
        if (configuration.smallestScreenWidthDp >= 600) {
            layoutParams.width = aehj.i(getResources().getDisplayMetrics(), 540);
        } else {
            layoutParams.width = -1;
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    private final boolean I() {
        return !this.i.a();
    }

    private final void J() {
        this.r.setVisibility(8);
        findViewById(2131428019).setVisibility(8);
        findViewById(2131428293).setVisibility(0);
    }

    static defpackage.alfm a() {
        akzx akzxVarM = defpackage.alfm.a.m();
        akzxVarM.u();
        defpackage.alfm alfmVar = (defpackage.alfm) akzxVarM.b;
        alfmVar.d = 9;
        alfmVar.b |= 2;
        akzxVarM.u();
        defpackage.alfm alfmVar2 = (defpackage.alfm) akzxVarM.b;
        alfmVar2.f = 2;
        alfmVar2.b |= 32;
        akzxVarM.u();
        defpackage.alfm alfmVar3 = (defpackage.alfm) akzxVarM.b;
        alfmVar3.e = 3;
        alfmVar3.b |= 8;
        return (defpackage.alfm) akzxVarM.p();
    }

    public static void j(android.view.View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void k(android.view.View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void l(android.support.v7.widget.RecyclerView recyclerView, kh khVar) {
        recyclerView.getContext();
        recyclerView.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
        eca ecaVar = new eca(recyclerView, khVar, 2);
        int i = dzs.a;
        if (recyclerView.isAttachedToWindow()) {
            ecaVar.onViewAttachedToWindow(recyclerView);
        }
        recyclerView.addOnAttachStateChangeListener(ecaVar);
    }

    private final int r() {
        android.view.ViewGroup viewGroup = this.o;
        viewGroup.measure(android.view.View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), 1073741824), 0);
        j(this.V, viewGroup.getMeasuredHeight());
        android.view.ViewGroup viewGroup2 = this.P;
        viewGroup2.measure(android.view.View.MeasureSpec.makeMeasureSpec(viewGroup2.getMeasuredWidth(), 1073741824), 0);
        return viewGroup2.getMeasuredHeight() + this.i.h;
    }

    private static android.animation.AnimatorSet s(android.animation.Animator.AnimatorListener animatorListener) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }

    private static android.animation.ObjectAnimator t(android.view.View view) {
        return android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) B, 0.0f, 1.0f);
    }

    private static android.animation.ObjectAnimator u(android.view.View view) {
        return android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) B, 1.0f, 0.0f);
    }

    private static android.animation.ObjectAnimator v(boolean z, android.view.View view, int i) {
        if (z) {
            android.animation.ObjectAnimator duration = t(view).setDuration(150L);
            duration.addListener(new defpackage.aejz(view));
            return duration;
        }
        android.animation.ObjectAnimator duration2 = u(view).setDuration(150L);
        duration2.addListener(new defpackage.aeka(view));
        return duration2;
    }

    private final agaf w() {
        agaf agafVarJ = agaf.J(getContext(), 0.0f, (android.content.res.ColorStateList) null);
        agafVarJ.ad();
        agafVarJ.U(this.L);
        ahyn ahynVar = this.ae;
        if (ahynVar.f()) {
            agafVarJ.R(android.content.res.ColorStateList.valueOf(((java.lang.Integer) ahynVar.b()).intValue()));
        }
        return agafVarJ;
    }

    private final agal x(boolean z, boolean z2) {
        aguv aguvVar = new aguv((byte[]) null);
        if (z2) {
            float f = this.i.d;
            aguvVar.o(f);
            aguvVar.p(f);
        }
        if (z) {
            float f2 = this.i.d;
            aguvVar.m(f2);
            aguvVar.n(f2);
        }
        return new agal(aguvVar);
    }

    private final void y() {
        this.p.setVisibility(8);
        this.n.setVisibility(0);
        this.s.setVisibility(8);
        E(false, false);
        i(false);
        J();
        G(true);
    }

    private final void z() {
        this.p.setVisibility(0);
        this.n.setVisibility(8);
        this.s.setVisibility(0);
        E(this.c, true);
        J();
        G(false);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount == 0) {
            ahvr.bZ(view.getId() == 2131428213, "express_sign_in_internal_view must be added first");
            super.addView(view, -1, layoutParams);
        } else {
            ahvr.bZ(childCount == 1, "ExpressSignInLayoutInternal must contain a single content view.");
            android.widget.FrameLayout frameLayout = this.ag;
            frameLayout.addView(view, 0, layoutParams);
            super.addView(frameLayout, 0, frameLayout.getLayoutParams());
        }
    }

    public final void b(defpackage.aelt aeltVar) {
        aeltVar.a(this.m, 90572);
        aeltVar.a(this.j, 90573);
        aeltVar.a(this.k, 90574);
        aeltVar.a(this.s, 90570);
        aeltVar.a(this.n, 90771);
        aeltVar.a(this.t, 90571);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v6 */
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
    public final void c(defpackage.aejd aejdVar, defpackage.aejp aejpVar) {
        ?? r7 = (aejdVar.a() + aejpVar.a() <= 0 || !this.e) ? 0 : 1;
        com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView selectedAccountView = this.m;
        int i = 3 >>> r7;
        selectedAccountView.l.setVisibility(8);
        selectedAccountView.k.setVisibility(i == 1 ? 0 : 8);
        selectedAccountView.m.setVisibility(i != 3 ? 0 : 8);
        selectedAccountView.i();
        selectedAccountView.setOnClickListener(r7 != 0 ? new defpackage.wtm(this, 14) : null);
        selectedAccountView.setClickable(r7);
        if (r7 == 0) {
            i(false);
        }
    }

    public final void d(defpackage.aelt aeltVar) {
        aeltVar.c(this.m);
        aeltVar.c(this.j);
        aeltVar.c(this.k);
        aeltVar.c(this.s);
        aeltVar.c(this.n);
        aeltVar.c(this.t);
    }

    public final void e(defpackage.aekp aekpVar, java.lang.Object obj) {
        afec.c();
        q(obj == null ? 31 : 52);
        q(38);
        ajcq ajcqVarA = aekpVar.a.a(ahyn.g(obj));
        afec.c();
        android.animation.AnimatorSet animatorSetS = s(new defpackage.aeke(this));
        animatorSetS.playTogether(t(this.q), u(this.p), u(this.o));
        this.y = animatorSetS;
        animatorSetS.start();
        aiql.I(ajcqVarA, new defpackage.aeki(this, 0), ajbm.a);
    }

    public final void f(boolean z) {
        afec.c();
        defpackage.aekh aekhVar = new defpackage.aekh(this);
        if (!z) {
            aekhVar.onAnimationStart(null);
            aekhVar.onAnimationEnd(null);
        } else {
            android.animation.AnimatorSet animatorSetS = s(aekhVar);
            animatorSetS.playTogether(u(this.q), t(this.p), t(this.o));
            animatorSetS.start();
        }
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(android.graphics.Rect rect) {
        super.fitSystemWindows(rect);
        return I();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void g(android.view.View view) {
        q(11);
        defpackage.aekm aekmVar = this.h;
        defpackage.aejo aejoVar = aekmVar.d;
        aejoVar.b.apply(new defpackage.aeje(aekmVar.a, aejoVar.a)).onClick(view);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final void h(boolean z) {
        boolean z2;
        if (this.c != z) {
            this.c = z;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.P.getParent();
            if (viewGroup != null) {
                int i = dzs.a;
                if (viewGroup.isLaidOut()) {
                    this.f = true;
                    gld.b(viewGroup, this.al);
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.W.setVisibility(true != z ? 8 : 0);
        com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView selectedAccountView = this.m;
        if (z != selectedAccountView.o) {
            selectedAccountView.o = z;
            selectedAccountView.j(z);
            if (z) {
                selectedAccountView.n.start();
            } else {
                selectedAccountView.n.reverse();
            }
        }
        ((android.view.ViewGroup.MarginLayoutParams) selectedAccountView.getLayoutParams()).bottomMargin = z ? this.i.k : 0;
        selectedAccountView.requestLayout();
        if (!this.F) {
            k(this.o, z ? this.J : 0);
        }
        android.view.View viewFindViewById = findViewById(2131428019);
        ((android.view.ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).topMargin = this.K;
        viewFindViewById.requestLayout();
        if (z2 && this.g) {
            for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (!parent.isLayoutRequested()) {
                    parent.requestLayout();
                }
            }
        }
        v(z, this.j, 150).start();
        defpackage.aekm aekmVar = this.h;
        E(z, (aekmVar == null || aekmVar.a.d().isEmpty()) ? false : true);
        if (aehj.g(getContext())) {
            A(z);
            this.ag.setVisibility(true != z ? 0 : 4);
        }
        if (z) {
            this.x.fc().d(this.x, this.af);
            return;
        }
        this.af.e();
        A(false);
        this.k.W(0);
    }

    public final void i(boolean z) {
        if (this.c != z) {
            h(z);
        }
    }

    public final void m(aify aifyVar, java.lang.Object obj) {
        if (aifyVar.isEmpty()) {
            y();
            return;
        }
        if (obj != null) {
            com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView selectedAccountView = this.m;
            ahvr.bZ(selectedAccountView.t != null, "Initialize must be called before setting an account.");
            selectedAccountView.t.i(obj, selectedAccountView.s);
            z();
            java.lang.String strF = this.h.d.a.f(obj);
            defpackage.aejm aejmVar = this.v;
            ahwt ahwtVarH = ahvr.co(strF).trim().isEmpty() ? ahwt.a : ahyn.h(strF);
            android.content.Context context = getContext();
            aift aiftVar = new aift(4);
            if (ahwtVarH.f()) {
                aiftVar.i(context.getResources().getString(2132019586, ahwtVarH.b()));
            }
            aiftVar.i(context.getResources().getString(2132019585));
            aify aifyVarH = aiftVar.h();
            evz evzVar = new evz(11);
            ahvr.ci(aifyVarH);
            aejmVar.c = new defpackage.aihs(aifyVarH, evzVar);
            aejmVar.b = ((ahyn) aejmVar.a).f() ? aejmVar.a(((java.lang.Float) ((ahyn) aejmVar.a).b()).floatValue()) : null;
        }
    }

    public final void n() {
        com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.S;
        float scrollY = overScrollControlledNestedScrollView.getScrollY();
        float f = this.I;
        F(java.lang.Math.min(1.0f, scrollY / f), this.ab, this.T);
        float scrollY2 = overScrollControlledNestedScrollView.getScrollY();
        float measuredHeight = overScrollControlledNestedScrollView.getChildAt(0).getMeasuredHeight() - overScrollControlledNestedScrollView.getMeasuredHeight();
        F(scrollY2 >= measuredHeight ? 0.0f : java.lang.Math.min((measuredHeight - scrollY2) / f, 1.0f), this.ad, this.o);
    }

    public final void o(boolean z) {
        this.p.c(z ? 0 : this.i.e);
        this.W.setBackgroundColor(z ? this.i.e : 0);
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        android.graphics.Rect rect = new android.graphics.Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        if (I()) {
            this.aj.set(rect);
            android.view.ViewGroup viewGroup = this.O;
            viewGroup.setPadding(rect.left, viewGroup.getPaddingTop(), rect.right, viewGroup.getPaddingBottom());
            android.widget.FrameLayout frameLayout = this.ag;
            frameLayout.setPadding(rect.left, rect.top, rect.right, frameLayout.getPaddingBottom());
            this.U.getLayoutParams().height = rect.top;
            j(this.o, rect.bottom);
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ag.getLayoutParams().height = 0;
        this.E = 0;
        H(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        defpackage.aejm aejmVar = this.u;
        if (aejmVar != null) {
            aejmVar.b(this.o.getMeasuredWidth());
        }
        defpackage.aejm aejmVar2 = this.v;
        if (aejmVar2 != null) {
            aejmVar2.b(this.o.getMeasuredWidth());
        }
        android.view.ViewGroup viewGroup = this.o;
        int measuredHeight = viewGroup.getVisibility() == 8 ? 0 : viewGroup.getMeasuredHeight();
        android.view.View view = this.V;
        if (view.getPaddingBottom() != measuredHeight) {
            j(view, measuredHeight);
            super.onMeasure(i, i2);
        }
        if (this.c) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.O.getLayoutParams();
            int measuredHeight2 = this.P.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            android.graphics.Rect rect = this.aj;
            if (measuredHeight2 + rect.top + rect.bottom >= getHeight() && getHeight() > 0 && this.R.getVisibility() == 0) {
                A(true);
                super.onMeasure(i, i2);
            }
        }
        android.widget.FrameLayout frameLayout = this.ag;
        int i3 = dzs.a;
        if (!frameLayout.isAttachedToWindow() || this.f) {
            return;
        }
        if (this.an == 0) {
            D();
            int iR = r();
            D();
            this.an = java.lang.Math.max(iR, r());
        }
        int measuredHeight3 = this.P.getMeasuredHeight();
        if (!this.c && measuredHeight3 > this.an) {
            this.an = measuredHeight3;
        }
        int measuredHeight4 = getMeasuredHeight();
        int i4 = measuredHeight4 - this.an;
        if (!this.am.f() || (!this.c && (((java.lang.Integer) this.am.b()).intValue() > i4 || measuredHeight4 != this.E))) {
            this.am = ahyn.h(java.lang.Integer.valueOf(i4));
            frameLayout.getLayoutParams().height = i4;
            frameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        this.E = measuredHeight4;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p(boolean z) {
        B(this.p, z ? 0 : this.i.b);
        B(this.W, z ? this.i.b : 0);
        aeir aeirVar = this.m;
        defpackage.aejr aejrVar = this.i;
        int i = aejrVar.c + (z ? aejrVar.b : 0);
        aeirVar.setPadding(i, aeirVar.getPaddingTop(), i, aeirVar.getPaddingBottom());
    }

    public final void q(int i) {
        akzx akzxVarP = a().p();
        akzxVarP.u();
        defpackage.alfm alfmVar = (defpackage.alfm) akzxVarP.b;
        alfmVar.c = i - 1;
        alfmVar.b |= 1;
        defpackage.alfm alfmVar2 = (defpackage.alfm) akzxVarP.p();
        defpackage.aekm aekmVar = this.h;
        aekmVar.b.a(aekmVar.a.a(), alfmVar2);
    }
}
