package com.google.android.setupdesign;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GlifLayout extends defpackage.agfh {
    public static final /* synthetic */ int h = 0;
    private static final xtq n = new xtq(com.google.android.setupdesign.GlifLayout.class);
    android.view.ViewTreeObserver.OnScrollChangedListener g;
    private android.content.res.ColorStateList i;
    private boolean j;
    private boolean k;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener l;
    private android.content.res.ColorStateList m;

    public GlifLayout(android.content.Context context, int i, int i2) {
        super(context, i, i2);
        this.j = true;
        this.k = false;
        this.g = new defpackage.aggt(this, 0);
        this.l = new gj(this, 7);
        A(null, 2130970664);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x018c  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e6  */
    private final void A(android.util.AttributeSet attributeSet, int i) {
        int iA;
        int iA2;
        int iA3;
        if (isInEditMode()) {
            return;
        }
        int i2 = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.aggy.j, i, 0);
        this.k = e() && typedArrayObtainStyledAttributes.getBoolean(4, false);
        m(defpackage.aghz.class, new defpackage.aghz(this, attributeSet, i));
        m(defpackage.aghr.class, new defpackage.aghr(this, attributeSet, i));
        m(defpackage.agia.class, new defpackage.agia(this, attributeSet, i));
        m(defpackage.agid.class, new defpackage.agid(this));
        m(defpackage.agie.class, new defpackage.agie(this, attributeSet, i));
        m(defpackage.agic.class, new defpackage.agic(this));
        m(defpackage.aghu.class, new defpackage.aghu(this, attributeSet, i));
        m(defpackage.aghs.class, new defpackage.aghs());
        m(defpackage.aghy.class, new defpackage.aghy(this, attributeSet, i));
        m(defpackage.agif.class, new defpackage.agif());
        android.widget.ScrollView scrollViewO = o();
        if (scrollViewO != null) {
            if (scrollViewO instanceof com.google.android.setupdesign.view.BottomScrollView) {
            } else {
                android.util.Log.w("ScrollViewDelegate", "Cannot set non-BottomScrollView. Found=".concat(scrollViewO.toString()));
            }
        }
        android.content.res.ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.i = colorStateList;
            B();
            android.widget.ProgressBar progressBarA = ((defpackage.agie) j(defpackage.agie.class)).a();
            if (progressBarA != null) {
                if (progressBarA instanceof com.google.android.material.progressindicator.LinearProgressIndicator) {
                    ((com.google.android.material.progressindicator.LinearProgressIndicator) progressBarA).f(colorStateList.getDefaultColor());
                } else {
                    progressBarA.setIndeterminateTintList(colorStateList);
                    progressBarA.setProgressBackgroundTintList(colorStateList);
                }
            }
        }
        android.view.View viewG = g(2131429100);
        if (viewG != null) {
            if (e()) {
                defpackage.aftt.q(viewG);
            }
            if (!(this instanceof defpackage.aggw)) {
                android.content.Context context = viewG.getContext();
                defpackage.agfz agfzVarI = defpackage.agfz.i(context);
                defpackage.agfx agfxVar = defpackage.agfx.CONFIG_CONTENT_PADDING_TOP;
                boolean zV = agfzVarI.v(agfxVar);
                if (e() && zV && (iA3 = (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f)) != viewG.getPaddingTop()) {
                    viewG.setPadding(viewG.getPaddingStart(), iA3, viewG.getPaddingEnd(), viewG.getPaddingBottom());
                }
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167674);
        if (e()) {
            defpackage.agfz agfzVarI2 = defpackage.agfz.i(getContext());
            defpackage.agfx agfxVar2 = defpackage.agfx.CONFIG_LAND_MIDDLE_HORIZONTAL_SPACING;
            if (agfzVarI2.v(agfxVar2)) {
                dimensionPixelSize = (int) defpackage.agfz.i(getContext()).a(getContext(), agfxVar2, 0.0f);
            }
        }
        android.view.View viewG2 = g(2131429095);
        android.view.View viewG3 = g(2131429096);
        if (viewG3 == null) {
            viewG3 = viewG2;
        }
        if (viewG3 != null) {
            if (e()) {
                defpackage.agfz agfzVarI3 = defpackage.agfz.i(getContext());
                defpackage.agfx agfxVar3 = defpackage.agfx.CONFIG_LAYOUT_MARGIN_END;
                if (agfzVarI3.v(agfxVar3)) {
                    iA2 = (int) defpackage.agfz.i(getContext()).a(getContext(), agfxVar3, 0.0f);
                } else {
                    android.content.res.TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{2130970672});
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
                    typedArrayObtainStyledAttributes2.recycle();
                    iA2 = dimensionPixelSize2;
                }
            } else {
                android.content.res.TypedArray typedArrayObtainStyledAttributes3 = getContext().obtainStyledAttributes(new int[]{2130970672});
                int dimensionPixelSize3 = typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, 0);
                typedArrayObtainStyledAttributes3.recycle();
                iA2 = dimensionPixelSize3;
            }
            viewG3.setPaddingRelative(viewG3.getPaddingStart(), viewG3.getPaddingTop(), (dimensionPixelSize / 2) - iA2, viewG3.getPaddingBottom());
        }
        android.view.View viewG4 = g(2131429094);
        if (viewG4 != null) {
            if (e()) {
                defpackage.agfz agfzVarI4 = defpackage.agfz.i(getContext());
                defpackage.agfx agfxVar4 = defpackage.agfx.CONFIG_LAYOUT_MARGIN_START;
                if (agfzVarI4.v(agfxVar4)) {
                    iA = (int) defpackage.agfz.i(getContext()).a(getContext(), agfxVar4, 0.0f);
                } else {
                    android.content.res.TypedArray typedArrayObtainStyledAttributes4 = getContext().obtainStyledAttributes(new int[]{2130970673});
                    int dimensionPixelSize4 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(0, 0);
                    typedArrayObtainStyledAttributes4.recycle();
                    iA = dimensionPixelSize4;
                }
            } else {
                android.content.res.TypedArray typedArrayObtainStyledAttributes5 = getContext().obtainStyledAttributes(new int[]{2130970673});
                int dimensionPixelSize5 = typedArrayObtainStyledAttributes5.getDimensionPixelSize(0, 0);
                typedArrayObtainStyledAttributes5.recycle();
                iA = dimensionPixelSize5;
            }
            viewG4.setPaddingRelative(viewG2 != null ? (dimensionPixelSize / 2) - iA : 0, viewG4.getPaddingTop(), viewG4.getPaddingEnd(), viewG4.getPaddingBottom());
        }
        if (defpackage.agfz.u(getContext())) {
            android.view.View viewG5 = g(2131429070);
            if (viewG5 != null) {
                viewG5.setFocusable(false);
            }
            android.view.View viewG6 = g(2131429127);
            if (viewG6 != null) {
                viewG6.setFocusable(false);
            }
        }
        s(typedArrayObtainStyledAttributes.getColorStateList(0));
        this.j = typedArrayObtainStyledAttributes.getBoolean(1, true);
        B();
        if (w() && !f()) {
            defpackage.agfz agfzVarI5 = defpackage.agfz.i(getContext());
            defpackage.agfx agfxVar5 = defpackage.agfx.CONFIG_LAYOUT_BACKGROUND_COLOR;
            if (agfzVarI5.v(agfxVar5)) {
                int iB = defpackage.agfz.i(getContext()).b(getContext(), agfxVar5);
                getRootView().setBackgroundColor(iB);
                s(android.content.res.ColorStateList.valueOf(iB));
                android.view.View viewG7 = g(2131429047);
                if (viewG7 != null) {
                    viewG7.setBackgroundColor(iB);
                }
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            android.view.ViewStub viewStub = (android.view.ViewStub) g(2131429117);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        if (defpackage.agfz.t(getContext())) {
            q();
            androidx.core.view.insets.ProtectionLayout protectionLayoutFindViewById = findViewById(2131429116);
            if (protectionLayoutFindViewById != null && (protectionLayoutFindViewById instanceof androidx.core.view.insets.ProtectionLayout)) {
                androidx.core.view.insets.ProtectionLayout protectionLayout = protectionLayoutFindViewById;
                if (this.m != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(new ebs(this.m.getDefaultColor()));
                    protectionLayout.a(arrayList);
                }
            }
        }
        int i3 = 8;
        if (defpackage.agfz.t(getContext())) {
            android.app.Activity activityD = defpackage.agfz.d(getContext());
            defpackage.aghu aghuVar = (defpackage.aghu) j(defpackage.aghu.class);
            if (aghuVar != null) {
                if (aghuVar.d) {
                    aghuVar.c(0);
                } else {
                    aghuVar.c(8);
                }
                defpackage.afrh afrhVar = new defpackage.afrh(activityD, 9);
                android.widget.Button buttonA = aghuVar.a();
                if (buttonA != null) {
                    buttonA.setOnClickListener(new defpackage.aght((java.lang.Object) aghuVar, (android.view.View.OnClickListener) afrhVar, i2));
                }
            } else {
                n.B("FloatingBackButtonMixin button is null");
            }
        } else {
            n.w("isGlifExpressiveEnabled is false");
        }
        android.widget.ImageButton imageButton = (android.widget.ImageButton) g(2131427348);
        boolean z = defpackage.agfz.z(getContext());
        boolean zE = defpackage.agfz.E(getContext());
        if (imageButton != null && z && zE) {
            imageButton.setVisibility(0);
            defpackage.agig.a(getContext(), imageButton);
            imageButton.setOnClickListener(new defpackage.afrh(this, i3));
        }
        android.app.Activity activity = this.a;
        xtq xtqVar = n;
        if (activity != null) {
            xtqVar.x("Using setup design " + getClass().getSimpleName() + " to init for " + this.a.getClass().getSimpleName());
        } else {
            xtqVar.x("Using setup design " + getClass().getSimpleName() + " to init for null activity");
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void B() {
        int defaultColor;
        if (g(2131429050) != null) {
            android.content.res.ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                defaultColor = colorStateList.getDefaultColor();
            } else {
                android.content.res.ColorStateList colorStateList2 = this.i;
                defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            ((defpackage.aggm) j(defpackage.aggm.class)).a(this.j ? new defpackage.aggv(defaultColor) : new android.graphics.drawable.ColorDrawable(defaultColor));
        }
    }

    protected static final boolean x(android.widget.ScrollView scrollView) {
        if (scrollView == null) {
            return false;
        }
        return scrollView.canScrollVertically(1);
    }

    private final int z(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    @Override // defpackage.agfh, com.google.android.setupcompat.internal.TemplateLayout
    protected android.view.View a(android.view.LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            android.content.Context context = getContext();
            boolean zP = defpackage.agfz.p(context);
            boolean zAa = gus.aT(context).aa(defpackage.agfz.d(context));
            xtq xtqVar = n;
            xtqVar.y("isEmbeddedActivityOnePaneEnabled = " + zP + "; isActivityEmbedded = " + zAa);
            if (zP && zAa) {
                if (v()) {
                    xtqVar.y("Using glif expressive embedded template");
                    i = 2131624494;
                } else {
                    xtqVar.y("Using glif embedded template");
                    i = 2131624483;
                }
            } else if (v()) {
                xtqVar.y("Using glif expressive template");
                i = 2131624517;
            } else {
                android.content.Context context2 = getContext();
                int i2 = defpackage.aggr.a;
                if (android.os.Build.VERSION.SDK_INT < 34 || !defpackage.agfz.s(context2)) {
                    i = 2131624563;
                } else {
                    xtqVar.y("Using glif template two pane");
                    i = 2131624569;
                }
            }
        }
        return i(layoutInflater, 2132084091, i);
    }

    @Override // defpackage.agfh, com.google.android.setupcompat.internal.TemplateLayout
    protected android.view.ViewGroup b(int i) {
        if (i == 0) {
            i = 2131429100;
        }
        return super.b(i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected android.view.View h() {
        return o();
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    public final java.util.List k() {
        android.widget.ScrollView scrollViewN = n();
        android.view.View viewH = h();
        if (scrollViewN != null && viewH != null && scrollViewN != viewH) {
            return java.util.Arrays.asList(scrollViewN, viewH);
        }
        if (scrollViewN != null) {
            return java.util.Collections.singletonList(scrollViewN);
        }
        return viewH != null ? java.util.Collections.singletonList(viewH) : java.util.Collections.EMPTY_LIST;
    }

    public final android.widget.ScrollView n() {
        android.view.View viewG = g(2131429070);
        if (viewG instanceof android.widget.ScrollView) {
            return (android.widget.ScrollView) viewG;
        }
        return null;
    }

    public final android.widget.ScrollView o() {
        android.view.View viewG = g(2131429127);
        if (viewG instanceof android.widget.ScrollView) {
            return (android.widget.ScrollView) viewG;
        }
        return null;
    }

    @Override // defpackage.agfh, android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (v()) {
            android.view.View viewG = g(2131429099);
            if (viewG != null) {
                viewG.setPadding(windowInsets.getSystemWindowInsetLeft(), viewG.getPaddingTop(), windowInsets.getSystemWindowInsetRight(), viewG.getPaddingBottom());
            }
            defpackage.aggf aggfVar = (defpackage.aggf) j(defpackage.aggf.class);
            if (aggfVar != null) {
                int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
                android.widget.LinearLayout linearLayout = aggfVar.f;
                if (linearLayout != null) {
                    int i = dzs.a;
                    if (linearLayout.getLayoutDirection() == 1) {
                        systemWindowInsetRight = systemWindowInsetLeft;
                        systemWindowInsetLeft = systemWindowInsetRight;
                    }
                }
                android.content.Context context = aggfVar.a;
                if (defpackage.agfz.t(context) && (aggfVar.m != systemWindowInsetLeft || aggfVar.n != systemWindowInsetRight)) {
                    aggfVar.m = systemWindowInsetLeft;
                    aggfVar.n = systemWindowInsetRight;
                    if (aggfVar.u) {
                        aggfVar.m();
                    } else {
                        aggfVar.p(aggfVar.f, systemWindowInsetLeft + aggfVar.o, aggfVar.k, systemWindowInsetRight + aggfVar.p, aggfVar.l);
                    }
                }
                j$.util.Optional optionalP = p();
                if (optionalP.isPresent()) {
                    t(!((java.lang.Boolean) optionalP.get()).booleanValue());
                }
                if (aggfVar.f != null) {
                    defpackage.agfz agfzVarI = defpackage.agfz.i(context);
                    defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_BAR_HIDE_WHEN_IME_SHOWN;
                    boolean zM = agfzVarI.v(agfxVar) ? defpackage.agfz.i(context).m(context, agfxVar, false) : false;
                    boolean zY = eax.q(windowInsets, aggfVar.f).y(8);
                    if (zM && zY) {
                        android.widget.LinearLayout linearLayout2 = aggfVar.f;
                        if (linearLayout2 != null && (linearLayout2 instanceof com.google.android.setupcompat.view.ButtonBarLayout)) {
                            ((com.google.android.setupcompat.view.ButtonBarLayout) linearLayout2).a = new defpackage.aprf(aggfVar);
                        }
                        if (!aggfVar.y) {
                            if (linearLayout2.getVisibility() != 8) {
                                aggfVar.z = aggfVar.f.getVisibility();
                            }
                            aggfVar.y = true;
                            aggfVar.f.setVisibility(8);
                        }
                        aggfVar.g();
                    } else if (aggfVar.y) {
                        aggfVar.y = false;
                        defpackage.aggf.C.x("Restoring FooterBar visibility to original state: " + aggfVar.z);
                        aggfVar.f.setVisibility(aggfVar.z);
                        if (aggfVar.z == 0) {
                            aggfVar.f.setAlpha(1.0f);
                            for (int i2 = 0; i2 < aggfVar.f.getChildCount(); i2++) {
                                aggfVar.f.getChildAt(i2).setAlpha(1.0f);
                            }
                            if (aggfVar.t()) {
                                aggfVar.m();
                            } else {
                                aggfVar.l();
                            }
                        }
                    }
                }
            }
            if (defpackage.agfz.A(getContext())) {
                defpackage.aftt.u(this);
            }
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    @Override // defpackage.agfh, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        defpackage.aghg aghgVar;
        emx emxVarK;
        aoub aoubVar;
        super.onAttachedToWindow();
        defpackage.aghy aghyVar = (defpackage.aghy) j(defpackage.aghy.class);
        if (aghyVar != null) {
            xtq xtqVar = defpackage.aghy.o;
            xtqVar.x("onAttachedToWindow");
            if (!aghyVar.j) {
                defpackage.aghy.o.x("Hiding indicator as showSetupProgressIndicator is false");
            } else if (((java.lang.Boolean) aghyVar.c.a()).booleanValue()) {
                android.content.Context context = aghyVar.b;
                xtq xtqVar2 = defpackage.aghg.d;
                if (context == null) {
                    defpackage.aghg.d.z("Context is null. Not creating ViewModel.");
                } else {
                    eoi eoiVar = null;
                    for (android.content.Context baseContext = context; baseContext instanceof android.content.ContextWrapper; baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext()) {
                        if (baseContext instanceof eoi) {
                            eoiVar = (eoi) baseContext;
                        }
                    }
                    if (eoiVar == null) {
                        defpackage.aghg.d.z("Failed to get ViewModelStoreOwner. Not creating ViewModel.");
                    } else {
                        try {
                            aghgVar = (defpackage.aghg) new eog(eoiVar, new defpackage.aghh(context)).a(defpackage.aghg.class);
                        } catch (java.lang.Exception e) {
                            defpackage.aghg.d.A("Failed to create SetupProgressViewModel", e);
                            aghgVar = null;
                        }
                        aghyVar.i = aghgVar;
                        if (aghyVar.i == null) {
                            defpackage.aghy.o.x("Cannot get ViewModel, hiding indicator");
                        } else {
                            emxVarK = dzo.k(aghyVar.a);
                            if (emxVarK == null) {
                                defpackage.aghy.o.x("Hiding indicator as viewLifecycleOwner is null");
                            } else {
                                aoubVar = aghyVar.l;
                                if (aoubVar != null) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                aghyVar.l = aoov.an(dzn.h(emxVarK), (aolr) null, 0, new defpackage.afmq(emxVarK, aghyVar, (aoln) null, 2), 3);
                            }
                        }
                    }
                }
                aghgVar = null;
                aghyVar.i = aghgVar;
                if (aghyVar.i == null) {
                    defpackage.aghy.o.x("Cannot get ViewModel, hiding indicator");
                } else {
                    emxVarK = dzo.k(aghyVar.a);
                    if (emxVarK == null) {
                        defpackage.aghy.o.x("Hiding indicator as viewLifecycleOwner is null");
                    } else {
                        aoubVar = aghyVar.l;
                        if (aoubVar != null) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                        aghyVar.l = aoov.an(dzn.h(emxVarK), (aolr) null, 0, new defpackage.afmq(emxVarK, aghyVar, (aoln) null, 2), 3);
                    }
                }
            } else {
                xtqVar.x("Hiding indicator as One Tap is disabled");
            }
        }
        if (v()) {
            defpackage.aggf aggfVar = (defpackage.aggf) j(defpackage.aggf.class);
            if (aggfVar != null) {
                aggfVar.g();
            }
            if (defpackage.agfz.A(getContext())) {
                defpackage.aftt.u(this);
            }
        }
    }

    @Override // defpackage.agfh, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        android.widget.LinearLayout linearLayout;
        android.os.PersistableBundle persistableBundle;
        super.onDetachedFromWindow();
        if (defpackage.aftt.x(this.a.getIntent()) && defpackage.agfz.t(getContext())) {
            defpackage.aghu aghuVar = (defpackage.aghu) j(defpackage.aghu.class);
            if (aghuVar != null) {
                persistableBundle = new android.os.PersistableBundle();
                persistableBundle.putInt("BackButton_onClickCount", aghuVar.c);
            } else {
                persistableBundle = android.os.PersistableBundle.EMPTY;
            }
            com.google.android.setupcompat.logging.CustomEvent customEventB = com.google.android.setupcompat.logging.CustomEvent.b(com.google.android.setupcompat.logging.MetricKey.b("SetupDesignMetrics", this.a), persistableBundle);
            defpackage.agfv.a(getContext(), customEventB);
            n.y("SetupDesignMetrics=".concat(com.google.android.setupcompat.logging.CustomEvent.a(customEventB).toString()));
        }
        android.widget.ScrollView scrollViewO = o();
        if (scrollViewO != null) {
            scrollViewO.getViewTreeObserver().removeOnScrollChangedListener(this.g);
            scrollViewO.getViewTreeObserver().removeOnGlobalLayoutListener(this.l);
        }
        android.widget.ScrollView scrollViewN = n();
        if (scrollViewN != null) {
            scrollViewN.getViewTreeObserver().removeOnScrollChangedListener(this.g);
            scrollViewN.getViewTreeObserver().removeOnGlobalLayoutListener(this.l);
        }
        defpackage.aghy aghyVar = (defpackage.aghy) j(defpackage.aghy.class);
        if (aghyVar != null) {
            aoub aoubVar = aghyVar.l;
            if (aoubVar != null) {
                aooc.X(aoubVar, "Mixin detached from window, cancelling uiStateCollectionJob", (java.lang.Throwable) null);
            }
            aghyVar.m = true;
            defpackage.agiq agiqVar = aghyVar.h;
            if (agiqVar != null) {
                agiqVar.dismiss();
            }
            aghyVar.h = null;
            defpackage.agby agbyVar = aghyVar.n;
            if (agbyVar != null) {
                agbyVar.e(3);
            }
            aghyVar.n = null;
            aghyVar.l = null;
            defpackage.aggs aggsVar = aghyVar.k;
            if (aggsVar != null) {
                aggsVar.b();
            }
            aghyVar.k = null;
        }
        defpackage.aggf aggfVar = (defpackage.aggf) j(defpackage.aggf.class);
        if (aggfVar == null || (linearLayout = aggfVar.f) == null || !(linearLayout instanceof com.google.android.setupcompat.view.ButtonBarLayout)) {
            return;
        }
        ((com.google.android.setupcompat.view.ButtonBarLayout) linearLayout).a = null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        int iA;
        android.graphics.drawable.Drawable drawableE;
        android.widget.FrameLayout frameLayoutB;
        super.onFinishInflate();
        ((defpackage.agia) j(defpackage.agia.class)).c();
        defpackage.aghz aghzVar = (defpackage.aghz) j(defpackage.aghz.class);
        com.google.android.setupcompat.internal.TemplateLayout templateLayout = aghzVar.a;
        android.widget.TextView textView = (android.widget.TextView) templateLayout.g(2131429051);
        if (defpackage.aftt.o(templateLayout)) {
            android.view.View viewG = templateLayout.g(2131429106);
            defpackage.aftt.q(viewG);
            if (textView != null) {
                defpackage.aftt.k(textView, new agii(defpackage.agfx.CONFIG_HEADER_TEXT_COLOR, (defpackage.agfx) null, defpackage.agfx.CONFIG_HEADER_TEXT_SIZE, defpackage.agfx.CONFIG_HEADER_LINE_HEIGHT, defpackage.agfx.CONFIG_HEADER_FONT_FAMILY, defpackage.agfx.CONFIG_HEADER_FONT_WEIGHT, (defpackage.agfx) null, defpackage.agfx.CONFIG_HEADER_TEXT_MARGIN_TOP, defpackage.agfx.CONFIG_HEADER_TEXT_MARGIN_BOTTOM, defpackage.agfx.CONFIG_HEADER_FONT_VARIATION_SETTINGS, defpackage.aftt.m(textView.getContext())));
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewG;
            if (viewGroup != null) {
                android.content.Context context = viewGroup.getContext();
                viewGroup.setBackgroundColor(defpackage.agfz.i(context).b(context, defpackage.agfx.CONFIG_HEADER_AREA_BACKGROUND_COLOR));
                defpackage.agfz agfzVarI = defpackage.agfz.i(context);
                defpackage.agfx agfxVar = defpackage.agfx.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM;
                if (agfzVarI.v(agfxVar)) {
                    android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f));
                        viewGroup.setLayoutParams(layoutParams);
                    }
                }
            }
        }
        aghzVar.c();
        if (aghzVar.b) {
            aghzVar.b(textView);
        }
        com.google.android.setupcompat.internal.TemplateLayout templateLayout2 = ((defpackage.aghr) j(defpackage.aghr.class)).a;
        android.widget.TextView textView2 = (android.widget.TextView) templateLayout2.g(2131429118);
        if (textView2 != null && defpackage.aftt.o(templateLayout2)) {
            defpackage.aftt.k(textView2, new agii(defpackage.agfx.CONFIG_DESCRIPTION_TEXT_COLOR, defpackage.agfx.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, defpackage.agfx.CONFIG_DESCRIPTION_TEXT_SIZE, defpackage.agfx.CONFIG_DESCRIPTION_LINE_HEIGHT, defpackage.agfx.CONFIG_DESCRIPTION_FONT_FAMILY, defpackage.agfx.CONFIG_DESCRIPTION_FONT_WEIGHT, defpackage.agfx.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, defpackage.agfx.CONFIG_DESCRIPTION_TEXT_MARGIN_TOP, defpackage.agfx.CONFIG_DESCRIPTION_TEXT_MARGIN_BOTTOM, (defpackage.agfx) null, defpackage.aftt.m(textView2.getContext())));
        }
        defpackage.agie agieVar = (defpackage.agie) j(defpackage.agie.class);
        android.widget.ProgressBar progressBarA = agieVar.a();
        if (agieVar.b && progressBarA != null) {
            if (((com.google.android.setupdesign.GlifLayout) agieVar.a).w()) {
                android.content.Context context2 = progressBarA.getContext();
                android.view.ViewGroup.LayoutParams layoutParams2 = progressBarA.getLayoutParams();
                if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                    int iA2 = marginLayoutParams2.topMargin;
                    defpackage.agfz agfzVarI2 = defpackage.agfz.i(context2);
                    defpackage.agfx agfxVar2 = defpackage.agfx.CONFIG_PROGRESS_BAR_MARGIN_TOP;
                    if (agfzVarI2.v(agfxVar2)) {
                        iA2 = (int) defpackage.agfz.i(context2).a(context2, agfxVar2, defpackage.agfz.t(context2) ? context2.getResources().getDimension(2131167607) : context2.getResources().getDimension(2131167768));
                    }
                    int iA3 = marginLayoutParams2.bottomMargin;
                    defpackage.agfz agfzVarI3 = defpackage.agfz.i(context2);
                    defpackage.agfx agfxVar3 = defpackage.agfx.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM;
                    if (agfzVarI3.v(agfxVar3)) {
                        iA3 = (int) defpackage.agfz.i(context2).a(context2, agfxVar3, defpackage.agfz.t(context2) ? context2.getResources().getDimension(2131167606) : context2.getResources().getDimension(2131167766));
                    }
                    if (iA2 != marginLayoutParams2.topMargin || iA3 != marginLayoutParams2.bottomMargin) {
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, iA2, marginLayoutParams2.rightMargin, iA3);
                    }
                }
            } else {
                android.view.ViewGroup.LayoutParams layoutParams3 = progressBarA.getLayoutParams();
                if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                    android.content.Context context3 = agieVar.c;
                    marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, (int) context3.getResources().getDimension(2131167768), marginLayoutParams3.rightMargin, (int) context3.getResources().getDimension(2131167766));
                }
            }
        }
        com.google.android.setupcompat.internal.TemplateLayout templateLayout3 = ((defpackage.agid) j(defpackage.agid.class)).a;
        if (defpackage.aftt.o(templateLayout3)) {
            android.widget.ImageView imageView = (android.widget.ImageView) templateLayout3.g(2131429052);
            android.widget.TextView textView3 = (android.widget.TextView) templateLayout3.g(2131429053);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) templateLayout3.g(2131429111);
            defpackage.aftt.q(templateLayout3.g(2131429106));
            if (imageView != null && textView3 != null) {
                android.content.Context context4 = imageView.getContext();
                android.view.ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                boolean z = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams;
                if (z) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
                    defpackage.agfz agfzVarI4 = defpackage.agfz.i(context4);
                    defpackage.agfx agfxVar4 = defpackage.agfx.CONFIG_ACCOUNT_AVATAR_MARGIN_END;
                    marginLayoutParams4.setMargins(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, agfzVarI4.v(agfxVar4) ? (int) defpackage.agfz.i(context4).a(context4, agfxVar4, 0.0f) : marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                }
                android.view.ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
                if (z) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = (android.view.ViewGroup.MarginLayoutParams) layoutParams5;
                    defpackage.agfz agfzVarI5 = defpackage.agfz.i(context4);
                    defpackage.agfx agfxVar5 = defpackage.agfx.CONFIG_ACCOUNT_CONTAINER_MARGIN_TOP;
                    int iA4 = agfzVarI5.v(agfxVar5) ? (int) defpackage.agfz.i(context4).a(context4, agfxVar5, 0.0f) : marginLayoutParams5.topMargin;
                    defpackage.agfz agfzVarI6 = defpackage.agfz.i(context4);
                    defpackage.agfx agfxVar6 = defpackage.agfx.CONFIG_ACCOUNT_CONTAINER_MARGIN_BOTTOM;
                    marginLayoutParams5.setMargins(marginLayoutParams5.leftMargin, iA4, marginLayoutParams5.rightMargin, agfzVarI6.v(agfxVar6) ? (int) defpackage.agfz.i(context4).a(context4, agfxVar6, 0.0f) : marginLayoutParams5.bottomMargin);
                }
                imageView.setMaxHeight((int) defpackage.agfz.i(context4).a(context4, defpackage.agfx.CONFIG_ACCOUNT_AVATAR_SIZE, context4.getResources().getDimension(2131167444)));
                textView3.setTextSize(0, (int) defpackage.agfz.i(context4).a(context4, defpackage.agfx.CONFIG_ACCOUNT_NAME_TEXT_SIZE, context4.getResources().getDimension(2131167445)));
                android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(defpackage.agfz.i(context4).k(context4, defpackage.agfx.CONFIG_ACCOUNT_NAME_FONT_FAMILY), 0);
                if (typefaceCreate != null) {
                    textView3.setTypeface(typefaceCreate);
                }
                linearLayout.setGravity(defpackage.aftt.m(linearLayout.getContext()));
            }
        }
        defpackage.aghu aghuVar = (defpackage.aghu) j(defpackage.aghu.class);
        com.google.android.setupcompat.internal.TemplateLayout templateLayout4 = aghuVar.a;
        if (!defpackage.agfz.A(templateLayout4.getContext()) && defpackage.aftt.o(templateLayout4)) {
            if (aghuVar.b() != null && (frameLayoutB = aghuVar.b()) != null) {
                android.content.Context context5 = frameLayoutB.getContext();
                android.view.ViewGroup.LayoutParams layoutParams6 = frameLayoutB.getLayoutParams();
                int iR = defpackage.aftt.r(context5);
                int iS = defpackage.aftt.s(context5, defpackage.agfx.CONFIG_ICON_SIZE, 0);
                int i = iS > iR ? iS - iR : 0;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = (android.view.ViewGroup.MarginLayoutParams) layoutParams6;
                int iS2 = defpackage.aftt.s(context5, defpackage.agfx.CONFIG_ICON_MARGIN_TOP, marginLayoutParams6.topMargin);
                if (i != 0) {
                    iS2 += i / 2;
                }
                int iS3 = marginLayoutParams6.leftMargin;
                defpackage.agfz agfzVarI7 = defpackage.agfz.i(context5);
                defpackage.agfx agfxVar7 = defpackage.agfx.CONFIG_LAYOUT_MARGIN_START;
                if (agfzVarI7.v(agfxVar7)) {
                    iS3 = defpackage.aftt.s(context5, agfxVar7, marginLayoutParams6.leftMargin) - ((int) context5.getResources().getDimension(2131167563));
                }
                if (iS2 != marginLayoutParams6.topMargin || iS3 != marginLayoutParams6.leftMargin) {
                    android.widget.FrameLayout.LayoutParams layoutParams7 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams7.setMargins(marginLayoutParams6.leftMargin, iS2, marginLayoutParams6.rightMargin, marginLayoutParams6.bottomMargin);
                    layoutParams7.setMarginStart(iS3);
                    frameLayoutB.setLayoutParams(layoutParams7);
                }
            }
            android.content.Context context6 = templateLayout4.getContext();
            defpackage.agfz agfzVarI8 = defpackage.agfz.i(context6);
            java.lang.Object objA = aghuVar.a();
            if (objA instanceof com.google.android.material.button.MaterialButton) {
                com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) objA;
                defpackage.agfx agfxVar8 = defpackage.agfx.CONFIG_BACK_BUTTON_ICON;
                if (agfzVarI8.v(agfxVar8) && (drawableE = agfzVarI8.e(context6, agfxVar8)) != null) {
                    materialButton.m(drawableE);
                }
                defpackage.agfx agfxVar9 = defpackage.agfx.CONFIG_BACK_BUTTON_ICON_SIZE;
                if (agfzVarI8.v(agfxVar9) && (iA = (int) agfzVarI8.a(context6, agfxVar9, 0.0f)) > 0) {
                    int dimensionPixelSize = context6.getResources().getDimensionPixelSize(2131167559);
                    materialButton.o(iA);
                    int dimensionPixelSize2 = iA + (context6.getResources().getDimensionPixelSize(2131167562) - dimensionPixelSize);
                    materialButton.setMinimumWidth(dimensionPixelSize2);
                    materialButton.setMinimumHeight(dimensionPixelSize2);
                    android.view.ViewGroup.LayoutParams layoutParams8 = materialButton.getLayoutParams();
                    if (layoutParams8 != null) {
                        layoutParams8.width = dimensionPixelSize2;
                        layoutParams8.height = dimensionPixelSize2;
                        materialButton.setLayoutParams(layoutParams8);
                    }
                }
                if (!defpackage.aftt.p(templateLayout4)) {
                    defpackage.agfx agfxVar10 = defpackage.agfx.CONFIG_BACK_BUTTON_BG_COLOR;
                    if (agfzVarI8.v(agfxVar10)) {
                        int iB = agfzVarI8.b(context6, agfxVar10);
                        if (android.graphics.Color.alpha(iB) != 0) {
                            if (android.graphics.Color.alpha(iB) != 255) {
                                iB = android.graphics.Color.rgb(android.graphics.Color.red(iB), android.graphics.Color.green(iB), android.graphics.Color.blue(iB));
                            }
                            materialButton.s(android.content.res.ColorStateList.valueOf(iB));
                        }
                    }
                }
            } else {
                android.util.Log.w("FloatingBackButtonMixin", "Back button is not a MaterialButton, skip applying partner customization.");
            }
        }
        android.widget.TextView textView4 = (android.widget.TextView) g(2131429102);
        if (textView4 != null) {
            if (this.k) {
                defpackage.aftt.k(textView4, new agii(defpackage.agfx.CONFIG_DESCRIPTION_TEXT_COLOR, defpackage.agfx.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, defpackage.agfx.CONFIG_DESCRIPTION_TEXT_SIZE, (defpackage.agfx) null, defpackage.agfx.CONFIG_DESCRIPTION_FONT_FAMILY, defpackage.agfx.CONFIG_DESCRIPTION_FONT_WEIGHT, defpackage.agfx.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, (defpackage.agfx) null, (defpackage.agfx) null, (defpackage.agfx) null, defpackage.aftt.m(textView4.getContext())));
            } else if (e()) {
                agii agiiVar = new agii((defpackage.agfx) null, (defpackage.agfx) null, (defpackage.agfx) null, (defpackage.agfx) null, (defpackage.agfx) null, (defpackage.agfx) null, (defpackage.agfx) null, (defpackage.agfx) null, (defpackage.agfx) null, (defpackage.agfx) null, defpackage.aftt.m(textView4.getContext()));
                defpackage.aftt.l(textView4, agiiVar);
                textView4.setGravity(agiiVar.a);
            }
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.setupdesign.GlifLayout.GlifSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.setupdesign.GlifLayout.GlifSavedState glifSavedState = (com.google.android.setupdesign.GlifLayout.GlifSavedState) parcelable;
        super.onRestoreInstanceState(glifSavedState.getSuperState());
        defpackage.agif agifVar = (defpackage.agif) j(defpackage.agif.class);
        if (glifSavedState.a) {
            agifVar.a = true;
        } else {
            android.util.Log.d("RequireScrollMixin", "Don't restore the state due to the value is the same as default value");
        }
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        com.google.android.setupdesign.GlifLayout.GlifSavedState glifSavedState = new com.google.android.setupdesign.GlifLayout.GlifSavedState(super.onSaveInstanceState());
        glifSavedState.a = ((defpackage.agif) j(defpackage.agif.class)).a;
        return glifSavedState;
    }

    public j$.util.Optional p() {
        android.widget.ScrollView scrollViewO = o();
        android.widget.ScrollView scrollViewN = n();
        if (scrollViewO == null && scrollViewN == null) {
            return j$.util.Optional.empty();
        }
        boolean zX = x(scrollViewN);
        boolean zX2 = x(scrollViewO);
        boolean z = true;
        if (!zX && !zX2) {
            z = false;
        }
        return j$.util.Optional.of(java.lang.Boolean.valueOf(z));
    }

    protected void q() {
        android.widget.ScrollView scrollViewO = o();
        android.widget.ScrollView scrollViewN = n();
        if (scrollViewO != null) {
            scrollViewO.getViewTreeObserver().addOnScrollChangedListener(this.g);
            scrollViewO.getViewTreeObserver().addOnGlobalLayoutListener(this.l);
        }
        if (scrollViewN != null) {
            scrollViewN.getViewTreeObserver().addOnScrollChangedListener(this.g);
            scrollViewN.getViewTreeObserver().addOnGlobalLayoutListener(this.l);
        }
        if (scrollViewO != null) {
            scrollViewO.getViewTreeObserver().addOnPreDrawListener(new defpackage.aggu(this, scrollViewO, 1, null));
        }
        if (scrollViewN != null) {
            scrollViewN.getViewTreeObserver().addOnPreDrawListener(new defpackage.aggu(this, scrollViewN, 0));
        }
    }

    public final void r() {
        postDelayed(new defpackage.agdr(this, 2), 100L);
    }

    public final void s(android.content.res.ColorStateList colorStateList) {
        this.m = colorStateList;
        B();
    }

    public final void t(boolean z) {
        android.widget.LinearLayout linearLayout;
        int iZ;
        int iB;
        defpackage.aggf aggfVar = (defpackage.aggf) j(defpackage.aggf.class);
        defpackage.aggn aggnVar = (defpackage.aggn) j(defpackage.aggn.class);
        if (aggfVar == null || (linearLayout = aggfVar.f) == null) {
            return;
        }
        if (z) {
            if (e()) {
                boolean zF = f();
                xtq xtqVar = n;
                if (zF) {
                    xtqVar.w("Set footer background color as content background color");
                    iZ = z(android.R.attr.colorBackground);
                } else {
                    xtqVar.w("Set footer background color as partner config color");
                    iZ = defpackage.agfz.i(getContext()).b(getContext(), defpackage.agfx.CONFIG_FOOTER_BAR_BG_COLOR);
                }
            } else {
                n.w("Set footer background color as transparent");
                iZ = 0;
            }
        } else if (d()) {
            n.w("In scrolling state, dynamic color is enabled, using theme footer background color");
            iZ = z(2130970604);
        } else {
            defpackage.agfz agfzVarI = defpackage.agfz.i(getContext());
            defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_BAR_MORE_TO_SCROLL_BG_COLOR;
            if (!agfzVarI.v(agfxVar) || (iB = agfzVarI.b(getContext(), agfxVar)) == 0) {
                n.w("In scrolling state, partner color is transparent or unavailable, using theme footer background color");
                iZ = z(2130970604);
            } else {
                n.w("In scrolling state, using partner-configured color for footer");
                iZ = iB;
            }
        }
        linearLayout.setBackgroundColor(iZ);
        if (aggnVar != null) {
            aggnVar.a(iZ);
        }
    }

    public final void u() {
        j$.util.Optional optionalP = p();
        if (optionalP.isPresent()) {
            t(!((java.lang.Boolean) optionalP.get()).booleanValue());
        }
    }

    protected final boolean v() {
        return defpackage.agfz.t(getContext()) && android.os.Build.VERSION.SDK_INT >= 35;
    }

    public final boolean w() {
        if (this.k) {
            return true;
        }
        return e() && defpackage.agfz.D(getContext());
    }

    public final /* synthetic */ void y() {
        android.app.Activity activityD = defpackage.agfz.d(getContext());
        defpackage.agfz agfzVarI = defpackage.agfz.i(getContext());
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_ASSISTIVE_OPTIONS_PACKAGE_NAME;
        if (agfzVarI.v(agfxVar)) {
            java.lang.String strK = defpackage.agfz.i(getContext()).k(getContext(), agfxVar);
            android.content.Intent intent = new android.content.Intent(strK + '.' + defpackage.agfz.i(getContext()).k(getContext(), defpackage.agfx.CONFIG_ASSISTIVE_OPTIONS_ACTIVITY_NAME));
            intent.setPackage(strK);
            intent.addFlags(131072);
            intent.putExtra("firstRun", true);
            intent.putExtra("isSetupFlow", true);
            if (activityD != null) {
                intent.putExtra("theme", defpackage.agij.a(activityD));
                defpackage.aftt.w(activityD.getIntent(), intent);
                try {
                    activityD.startActivityForResult(intent, 101);
                } catch (android.content.ActivityNotFoundException e) {
                    n.z("Activity not found: ".concat(java.lang.String.valueOf(e.getMessage())));
                }
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    public class GlifSavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(17);
        boolean a;

        public GlifSavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = false;
            this.a = parcel.readInt() == 1;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public GlifSavedState(android.os.Parcelable parcelable) {
            super(parcelable);
            this.a = false;
        }
    }

    public GlifLayout(android.content.Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(android.content.Context context) {
        this(context, 0, 0);
    }

    public GlifLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = true;
        this.k = false;
        this.g = new defpackage.aggt(this, 0);
        this.l = new gj(this, 7);
        A(attributeSet, 2130970664);
    }

    public GlifLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = true;
        this.k = false;
        this.g = new defpackage.aggt(this, 0);
        this.l = new gj(this, 7);
        A(attributeSet, i);
    }
}
