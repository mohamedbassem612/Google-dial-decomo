package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class agfh extends com.google.android.setupcompat.internal.TemplateLayout {
    public static final xtq c = new xtq("PartnerCustomizationLayout", (byte[]) null);
    public android.app.Activity a;
    final android.view.ViewTreeObserver.OnWindowFocusChangeListener b;
    apnt d;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private int k;
    private int l;

    public agfh(android.content.Context context, int i, int i2) {
        super(context, i, i2);
        this.j = false;
        this.k = 0;
        this.l = 0;
        this.b = new defpackage.agfg(this, 0);
        n(null, 2130970534);
    }

    private void n(android.util.AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.agfi.d, i, 0);
        boolean z = true;
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, defpackage.agfi.a, i, 0);
        this.i = typedArrayObtainStyledAttributes2.getDimensionPixelSize(15, typedArrayObtainStyledAttributes2.getDimensionPixelSize(19, 0));
        typedArrayObtainStyledAttributes2.recycle();
        if (z2) {
            setSystemUiVisibility(1024);
        }
        m(defpackage.aggm.class, new defpackage.aggm(this, this.a.getWindow(), attributeSet, i));
        m(defpackage.aggn.class, new defpackage.aggn(this, this.a.getWindow()));
        m(defpackage.aggf.class, new defpackage.aggf(this, attributeSet, i));
        defpackage.aggn aggnVar = (defpackage.aggn) j(defpackage.aggn.class);
        com.google.android.setupcompat.internal.TemplateLayout templateLayout = aggnVar.a;
        android.content.res.TypedArray typedArrayObtainStyledAttributes3 = templateLayout.getContext().obtainStyledAttributes(attributeSet, defpackage.agfi.f, i, 0);
        int color = typedArrayObtainStyledAttributes3.getColor(1, 0);
        aggnVar.e = color;
        aggnVar.a(color);
        android.view.Window window = aggnVar.b;
        if (window != null && (window.getDecorView().getSystemUiVisibility() & 16) != 16) {
            z = false;
        }
        boolean zM = typedArrayObtainStyledAttributes3.getBoolean(0, z);
        if (window != null) {
            if (aggnVar.c) {
                android.content.Context context = templateLayout.getContext();
                zM = defpackage.agfz.i(context).m(context, defpackage.agfx.CONFIG_LIGHT_NAVIGATION_BAR, false);
            }
            if (zM) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 16);
            } else {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-17));
            }
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes4 = templateLayout.getContext().obtainStyledAttributes(new int[]{android.R.attr.navigationBarDividerColor});
        int color2 = typedArrayObtainStyledAttributes3.getColor(2, typedArrayObtainStyledAttributes4.getColor(0, 0));
        if (window != null) {
            if (aggnVar.c) {
                android.content.Context context2 = templateLayout.getContext();
                defpackage.agfz agfzVarI = defpackage.agfz.i(context2);
                defpackage.agfx agfxVar = defpackage.agfx.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR;
                if (agfzVarI.v(agfxVar)) {
                    color2 = defpackage.agfz.i(context2).b(context2, agfxVar);
                }
            }
            ft$.ExternalSyntheticApiModelOutline0.m(window, color2);
        }
        typedArrayObtainStyledAttributes4.recycle();
        typedArrayObtainStyledAttributes3.recycle();
        this.a.getWindow().addFlags(Integer.MIN_VALUE);
        this.a.getWindow().clearFlags(67108864);
        this.a.getWindow().clearFlags(134217728);
    }

    private static void o(android.view.View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected android.view.View a(android.view.LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = 2131624359;
        }
        return i(layoutInflater, 0, i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected android.view.ViewGroup b(int i) {
        if (i == 0) {
            i = 2131429048;
        }
        return super.b(i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected final void c(android.util.AttributeSet attributeSet, int i) {
        boolean z = true;
        this.g = true;
        this.a = defpackage.agfz.d(getContext());
        xtq xtqVar = c;
        xtqVar.w("Flag of isEnhancedSetupDesignMetricsEnabled=" + defpackage.agfz.q(getContext()));
        if (defpackage.agfz.q(getContext())) {
            az azVar = this.a;
            if (azVar instanceof az) {
                this.d = new apnt(this);
                bo boVarA = azVar.a();
                apnt apntVar = this.d;
                nf nfVar = boVarA.A;
                if (apntVar == null) {
                    aooh.i("cb");
                }
                ((java.util.concurrent.CopyOnWriteArrayList) nfVar.b).add(new kaw(apntVar));
                xtqVar.w("Register the onFragmentAttached lifecycle callbacks to ".concat(java.lang.String.valueOf(azVar.getClass().getSimpleName())));
            }
        }
        boolean zX = defpackage.aftt.x(this.a.getIntent());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.agfi.d, i, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            xtqVar.z("Attribute sucUsePartnerResource not found in ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a.getComponentName()))));
        }
        if (!zX && !typedArrayObtainStyledAttributes.getBoolean(2, true)) {
            z = false;
        }
        this.g = z;
        this.h = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        xtqVar.w("activity=" + this.a.getClass().getSimpleName() + " isSetupFlow=" + zX + " enablePartnerResourceLoading=true usePartnerResourceAttr=" + this.g + " useFullDynamicColorAttr=" + this.h);
    }

    public final boolean d() {
        if (!a.n() || !defpackage.agfz.i(getContext()).o()) {
            return false;
        }
        if (this.h) {
            return true;
        }
        return defpackage.agfz.x(getContext());
    }

    public final boolean e() {
        return this.g && defpackage.agfz.i(getContext()).o();
    }

    public final boolean f() {
        if (d()) {
            return this.h || defpackage.agfz.y(getContext());
        }
        return false;
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        android.widget.LinearLayout linearLayout;
        if (defpackage.agfz.t(getContext())) {
            xtq xtqVar = c;
            xtqVar.x("onApplyWindowInsets SystemWindowInsetBottom=" + windowInsets.getSystemWindowInsetBottom());
            if (windowInsets.getSystemWindowInsetBottom() >= 0) {
                xtqVar.w("NavigationBarHeight: " + windowInsets.getSystemWindowInsetBottom());
                if (defpackage.agfz.E(getContext())) {
                    return super.onApplyWindowInsets(windowInsets);
                }
                defpackage.aggf aggfVar = (defpackage.aggf) j(defpackage.aggf.class);
                android.widget.LinearLayout linearLayout2 = aggfVar.f;
                android.view.View viewFindViewById = findViewById(2131429050);
                android.view.View viewFindViewById2 = findViewById(2131429047);
                defpackage.agfz agfzVarI = defpackage.agfz.i(getContext());
                defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM;
                if (agfzVarI.v(agfxVar)) {
                    this.i = (int) defpackage.agfz.i(getContext()).a(getContext(), agfxVar, 0.0f);
                }
                if (aggfVar == null || (linearLayout = aggfVar.f) == null || linearLayout.getVisibility() == 8) {
                    android.view.View view = viewFindViewById2 != null ? viewFindViewById2 : viewFindViewById;
                    int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                    boolean z = this.j;
                    if (systemWindowInsetBottom > 0) {
                        if (!z) {
                            this.k = view.getPaddingBottom();
                            this.l = viewFindViewById.getPaddingBottom();
                            this.j = true;
                        }
                        o(view, this.i + windowInsets.getSystemWindowInsetBottom());
                        if (viewFindViewById2 != null) {
                            o(viewFindViewById, 0);
                        }
                    } else if (z) {
                        o(view, this.k);
                        if (viewFindViewById2 != null) {
                            o(viewFindViewById, this.l);
                        }
                        this.j = false;
                    }
                } else {
                    o(linearLayout2, this.i + windowInsets.getSystemWindowInsetBottom());
                    if (viewFindViewById2 != null) {
                        o(viewFindViewById2, 0);
                    }
                    o(viewFindViewById, 0);
                }
            }
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        android.app.FragmentManager fragmentManager;
        super.onAttachedToWindow();
        android.app.Activity activity = this.a;
        defpackage.aprf aprfVar = new defpackage.aprf(this);
        java.lang.String str = defpackage.agfm.a;
        defpackage.agfm agfmVar = null;
        if (!defpackage.aftt.x(activity.getIntent()) || (fragmentManager = activity.getFragmentManager()) == null || fragmentManager.isDestroyed()) {
            defpackage.agfm.b.w("Skip attach " + activity.getClass().getSimpleName() + " because it's not in SUW flow.");
        } else {
            android.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
            if (fragmentFindFragmentByTag == null) {
                defpackage.agfm agfmVar2 = new defpackage.agfm();
                agfmVar2.c = aprfVar;
                try {
                    aa$.ExternalSyntheticApiModelOutline1.m(fragmentManager.beginTransaction().add(agfmVar2, "lifecycle_monitor"));
                    fragmentFindFragmentByTag = agfmVar2;
                } catch (java.lang.IllegalStateException e) {
                    defpackage.agfm.b.A("Error occurred when attach to Activity:".concat(java.lang.String.valueOf(java.lang.String.valueOf(activity.getComponentName()))), e);
                }
            } else if (fragmentFindFragmentByTag instanceof defpackage.agfm) {
                defpackage.agfm.b.w("Find an existing fragment that belongs to ".concat(java.lang.String.valueOf(activity.getClass().getSimpleName())));
            } else {
                android.util.Log.wtf(defpackage.agfm.a, java.lang.String.valueOf(activity.getClass().getSimpleName()).concat(" Incorrect instance on lifecycle fragment."));
            }
            agfmVar = (defpackage.agfm) fragmentFindFragmentByTag;
        }
        if (agfmVar == null) {
            xtq xtqVar = c;
            android.app.Activity activity2 = this.a;
            xtqVar.w("Unable to attach lifecycle fragment to the host activity. Activity=".concat(java.lang.String.valueOf(activity2 != null ? activity2.getClass().getSimpleName() : "null")));
        }
        if (defpackage.aftt.x(this.a.getIntent())) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.b);
        }
        defpackage.aggf aggfVar = (defpackage.aggf) j(defpackage.aggf.class);
        defpackage.agfw agfwVar = aggfVar.x;
        agfwVar.c(aggfVar.v(), false);
        agfwVar.d(aggfVar.w(), false);
        agfwVar.c = agfwVar.c.equals("Unknown") ? defpackage.agfw.e(aggfVar.x(), false) : agfwVar.c;
        android.widget.LinearLayout linearLayout = aggfVar.f;
        if (linearLayout != null) {
            linearLayout.getViewTreeObserver().addOnWindowFocusChangeListener(aggfVar.B);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (defpackage.aftt.x(this.a.getIntent())) {
            defpackage.aggf aggfVar = (defpackage.aggf) j(defpackage.aggf.class);
            if (aggfVar != null) {
                aggfVar.i();
                defpackage.aggh agghVar = aggfVar.g;
                defpackage.aggh agghVar2 = aggfVar.h;
                android.os.PersistableBundle persistableBundleA = agghVar != null ? agghVar.a("PrimaryFooterButton") : android.os.PersistableBundle.EMPTY;
                android.os.PersistableBundle persistableBundleA2 = agghVar2 != null ? agghVar2.a("SecondaryFooterButton") : android.os.PersistableBundle.EMPTY;
                android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                persistableBundle.putLong("onDetachedFromWindow", java.lang.System.nanoTime());
                android.os.PersistableBundle persistableBundleB = aggfVar.b();
                android.os.PersistableBundle persistableBundle2 = android.os.PersistableBundle.EMPTY;
                defpackage.agfv.a(getContext(), com.google.android.setupcompat.logging.CustomEvent.b(com.google.android.setupcompat.logging.MetricKey.b("SetupCompatMetrics", this.a), defpackage.agfn.b(persistableBundleB, persistableBundleA, persistableBundleA2, persistableBundle2, persistableBundle2, persistableBundle)));
            } else {
                c.B("FooterBarMixin is null");
                android.os.PersistableBundle persistableBundle3 = new android.os.PersistableBundle();
                persistableBundle3.putLong("onDetachedFromWindow", java.lang.System.nanoTime());
                defpackage.agfv.a(getContext(), com.google.android.setupcompat.logging.CustomEvent.b(com.google.android.setupcompat.logging.MetricKey.b("SetupCompatMetrics", this.a), persistableBundle3));
            }
        }
        getViewTreeObserver().removeOnWindowFocusChangeListener(this.b);
        if (defpackage.agfz.q(getContext())) {
            az azVar = this.a;
            if (azVar instanceof az) {
                bo boVarA = azVar.a();
                apnt apntVar = this.d;
                nf nfVar = boVarA.A;
                aooh.f(apntVar, "cb");
                java.lang.Object obj = nfVar.b;
                synchronized (obj) {
                    int size = ((java.util.concurrent.CopyOnWriteArrayList) obj).size();
                    for (int i = 0; i < size; i++) {
                        if (((kaw) ((java.util.concurrent.CopyOnWriteArrayList) obj).get(i)).a == apntVar) {
                            ((java.util.concurrent.CopyOnWriteArrayList) obj).remove(i);
                            break;
                        }
                    }
                }
            }
        }
    }

    public agfh(android.content.Context context, int i) {
        this(context, i, 0);
    }

    public agfh(android.content.Context context) {
        this(context, 0, 0);
    }

    public agfh(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.k = 0;
        this.l = 0;
        this.b = new defpackage.agfg(this, 0);
        n(attributeSet, 2130970534);
    }

    public agfh(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = false;
        this.k = 0;
        this.l = 0;
        this.b = new defpackage.agfg(this, 0);
        n(attributeSet, i);
    }
}
