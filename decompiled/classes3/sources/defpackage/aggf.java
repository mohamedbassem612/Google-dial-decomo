package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggf implements defpackage.aggl {
    public static final xtq C = new xtq("FooterBarMixin", (byte[]) null);
    public android.view.ViewTreeObserver.OnPreDrawListener A;
    public final android.view.ViewTreeObserver.OnWindowFocusChangeListener B;
    private final android.view.ViewStub D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private int I;
    private boolean J;
    public final android.content.Context a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    public android.widget.LinearLayout f;
    public defpackage.aggh g;
    public defpackage.aggh h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m = 0;
    public int n = 0;
    public int o;
    public int p;
    final int q;
    public final int r;
    public java.lang.String s;
    public java.lang.String t;
    public boolean u;
    int v;
    int w;
    public final defpackage.agfw x;
    public boolean y;
    public int z;

    public aggf(com.google.android.setupcompat.internal.TemplateLayout templateLayout, android.util.AttributeSet attributeSet, int i) {
        defpackage.agfw agfwVar = new defpackage.agfw();
        this.x = agfwVar;
        this.J = false;
        this.y = false;
        this.z = 0;
        this.B = new defpackage.agfg(this, 2);
        android.content.Context context = templateLayout.getContext();
        this.a = context;
        this.D = (android.view.ViewStub) templateLayout.g(2131429049);
        defpackage.aggi.a.clear();
        defpackage.agfh agfhVar = (defpackage.agfh) templateLayout;
        this.b = agfhVar.e();
        this.c = agfhVar.d();
        this.d = agfhVar.f();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.agfi.a, i, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0);
        this.q = dimensionPixelSize;
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, dimensionPixelSize);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, 0);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.E = typedArrayObtainStyledAttributes.getColor(20, 0);
        this.F = typedArrayObtainStyledAttributes.getColor(24, 0);
        this.e = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.G = typedArrayObtainStyledAttributes.getColor(23, 0);
        this.H = typedArrayObtainStyledAttributes.getColor(27, 0);
        typedArrayObtainStyledAttributes.getColor(22, 0);
        typedArrayObtainStyledAttributes.getColor(26, 0);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(21, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(25, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            z(afsq.q(resourceId2, context));
            agfwVar.d(true, true);
        }
        if (resourceId != 0) {
            n(afsq.q(resourceId, context));
            agfwVar.c(true, true);
        }
    }

    public static final boolean A(android.widget.Button button, android.widget.Button button2) {
        boolean z = button != null && button.getVisibility() == 0;
        boolean z2 = button2 != null && button2.getVisibility() == 0;
        C.w("isPrimaryVisible=" + z + ", isSecondaryVisible=" + z2);
        return z && z2;
    }

    public static final void B(android.widget.Button button, int i) {
        if (button == null || button.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        if (layoutParams != null && layoutParams.height != -2) {
            layoutParams.height = -2;
            button.setLayoutParams(layoutParams);
        }
        if (i > 0) {
            button.setMinimumHeight(i);
            button.setMinHeight(i);
        }
    }

    public static final void C(android.widget.Button button, int i, int i2, j$.util.Optional optional) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.width = i;
        layoutParams.bottomMargin = i2;
        j$.util.Objects.requireNonNull(layoutParams);
        akxd akxdVar = new akxd(layoutParams, 1);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            ((android.view.ViewGroup.MarginLayoutParams) akxdVar.a).setMarginStart(((java.lang.Integer) obj).intValue());
        }
        button.setLayoutParams(layoutParams);
    }

    public static final void D(android.widget.Button button, int i, int i2, j$.util.Optional optional) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.width = i;
        layoutParams.topMargin = i2;
        j$.util.Objects.requireNonNull(layoutParams);
        defpackage.xch xchVar = new defpackage.xch(layoutParams, 20);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            ((android.view.ViewGroup.MarginLayoutParams) xchVar.a).setMarginEnd(((java.lang.Integer) obj).intValue());
        }
        button.setLayoutParams(layoutParams);
    }

    private final int E(defpackage.aggh agghVar, int i, boolean z, boolean z2, defpackage.agfx agfxVar) {
        int i2 = agghVar.d;
        if (i2 != 0 && !this.b && !defpackage.agfz.t(this.a)) {
            i = i2;
        }
        if (!this.b) {
            return i;
        }
        android.content.Context context = this.a;
        if (!defpackage.agfz.t(context)) {
            if (defpackage.agfz.i(context).b(context, agfxVar) != 0) {
                return (z || !z2) ? 2132083916 : 2132083917;
            }
            return 2132083917;
        }
        if (z || z2 || defpackage.agfz.i(context).b(context, agfxVar) == 0) {
            return i;
        }
        return 2132083913;
    }

    private final android.widget.LinearLayout F() {
        defpackage.aggf aggfVar;
        int iA;
        if (this.f == null) {
            android.view.ViewStub viewStub = this.D;
            if (viewStub == null) {
                throw new java.lang.IllegalStateException("Footer stub is not found in this template");
            }
            android.content.Context context = this.a;
            viewStub.setLayoutInflater(android.view.LayoutInflater.from(new android.view.ContextThemeWrapper(context, 2132083919)));
            viewStub.setLayoutResource(2131624467);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewStub.inflate();
            this.f = linearLayout;
            if (linearLayout == null) {
                aggfVar = this;
            } else {
                if (linearLayout.getId() == -1) {
                    linearLayout.setId(android.view.View.generateViewId());
                }
                aggfVar = this;
                aggfVar.p(linearLayout, this.o + this.m, this.k, this.p + this.n, this.l);
                if (aggfVar.u()) {
                    linearLayout.setGravity(8388629);
                }
            }
            android.widget.LinearLayout linearLayout2 = aggfVar.f;
            if (linearLayout2 != null && aggfVar.b) {
                if (!aggfVar.d) {
                    linearLayout2.setBackgroundColor(defpackage.agfz.i(context).b(context, defpackage.agfx.CONFIG_FOOTER_BAR_BG_COLOR));
                }
                defpackage.agfz agfzVarI = defpackage.agfz.i(context);
                defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_BUTTON_PADDING_TOP;
                if (agfzVarI.v(agfxVar)) {
                    aggfVar.k = (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f);
                }
                defpackage.agfz agfzVarI2 = defpackage.agfz.i(context);
                defpackage.agfx agfxVar2 = defpackage.agfx.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM;
                if (agfzVarI2.v(agfxVar2)) {
                    aggfVar.l = (int) defpackage.agfz.i(context).a(context, agfxVar2, 0.0f);
                }
                defpackage.agfz agfzVarI3 = defpackage.agfz.i(context);
                defpackage.agfx agfxVar3 = defpackage.agfx.CONFIG_FOOTER_BAR_PADDING_START;
                if (agfzVarI3.v(agfxVar3)) {
                    aggfVar.o = (int) defpackage.agfz.i(context).a(context, agfxVar3, 0.0f);
                }
                defpackage.agfz agfzVarI4 = defpackage.agfz.i(context);
                defpackage.agfx agfxVar4 = defpackage.agfx.CONFIG_FOOTER_BAR_PADDING_END;
                if (agfzVarI4.v(agfxVar4)) {
                    aggfVar.p = (int) defpackage.agfz.i(context).a(context, agfxVar4, 0.0f);
                }
                aggfVar.p(linearLayout2, aggfVar.o + aggfVar.m, aggfVar.k, aggfVar.p + aggfVar.n, aggfVar.l);
                defpackage.agfz agfzVarI5 = defpackage.agfz.i(context);
                defpackage.agfx agfxVar5 = defpackage.agfx.CONFIG_FOOTER_BAR_MIN_HEIGHT;
                if (agfzVarI5.v(agfxVar5) && (iA = (int) defpackage.agfz.i(context).a(context, agfxVar5, 0.0f)) > 0) {
                    linearLayout2.setMinimumHeight(iA);
                }
            }
        } else {
            aggfVar = this;
        }
        return aggfVar.f;
    }

    private static defpackage.agfx G(int i) {
        switch (i) {
            case 1:
                return defpackage.agfx.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return defpackage.agfx.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return defpackage.agfx.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return defpackage.agfx.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return defpackage.agfx.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.agfx.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return defpackage.agfx.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return defpackage.agfx.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    private final defpackage.aggj H(defpackage.aggh agghVar, defpackage.agfl agflVar) {
        defpackage.aggj aggkVar;
        android.content.Context context = this.a;
        int i = agflVar.o;
        if (defpackage.agfz.t(context)) {
            try {
                aggkVar = i == 2132083913 ? new defpackage.aggk(new android.view.ContextThemeWrapper(context, 2132083913), 2130970537) : new defpackage.aggk(new android.view.ContextThemeWrapper(context, i), 2130970538);
            } catch (java.lang.IllegalArgumentException e) {
                C.z("Applyed invalid material theme: ".concat(e.toString()));
                i = i == 2132083913 ? 2132083916 : 2132083917;
                aggkVar = (defpackage.aggj) android.view.LayoutInflater.from(new android.view.ContextThemeWrapper(context, i)).inflate(2131624466, (android.view.ViewGroup) null, false);
            }
        } else {
            aggkVar = (defpackage.aggj) android.view.LayoutInflater.from(new android.view.ContextThemeWrapper(context, i)).inflate(2131624466, (android.view.ViewGroup) null, false);
        }
        android.widget.Button button = (android.widget.Button) aggkVar;
        button.setId(android.view.View.generateViewId());
        button.setText(agghVar.b);
        button.setOnClickListener(new defpackage.aght((java.lang.Object) this, (java.lang.Object) agghVar, 1));
        button.setVisibility(0);
        boolean z = agghVar.c;
        button.setEnabled(true);
        if (aggkVar instanceof defpackage.aggk) {
            ((defpackage.aggk) aggkVar).p = agghVar;
        } else if (button instanceof com.google.android.setupcompat.template.FooterActionButton) {
            ((com.google.android.setupcompat.template.FooterActionButton) aggkVar).a = agghVar;
        } else {
            C.z("Set the footer button error!");
        }
        button.getId();
        j$.util.Objects.requireNonNull(this);
        return aggkVar;
    }

    private final void I(android.view.View view, int i) {
        android.content.Context context = this.a;
        if (defpackage.agfz.B(context)) {
            defpackage.aggp aggpVar = new defpackage.aggp(context);
            aggpVar.c = i;
            aggpVar.b(999);
            view.setForeground(aggpVar.a());
        }
    }

    private final void J() {
        android.widget.Button buttonC = c();
        android.widget.Button buttonD = d();
        int i = 0;
        boolean z = buttonC != null && buttonC.getVisibility() == 0;
        boolean z2 = buttonD != null && buttonD.getVisibility() == 0;
        boolean z3 = this.J && defpackage.agfz.A(this.a);
        android.widget.LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            if (!z && !z2 && !z3) {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void K(android.widget.Button button, defpackage.agfl agflVar) {
        boolean z;
        android.graphics.drawable.RippleDrawable rippleDrawable;
        android.graphics.drawable.Drawable drawable;
        if (this.b) {
            android.content.Context context = this.a;
            boolean z2 = this.c;
            int id = button.getId();
            int i = this.i;
            defpackage.aggi.a.put(java.lang.Integer.valueOf(button.getId()), button.getTextColors());
            if (z2) {
                z = true;
            } else {
                if (button.isEnabled()) {
                    defpackage.aggi.e(context, button, agflVar.f);
                } else {
                    defpackage.aggi.c(context, button, agflVar.d);
                }
                defpackage.agfx agfxVar = agflVar.a;
                defpackage.agfx agfxVar2 = agflVar.b;
                defpackage.agfx agfxVar3 = agflVar.c;
                int iB = defpackage.agfz.i(context).b(context, agfxVar);
                float fK = defpackage.agfz.i(context).K(context, agfxVar2);
                int iB2 = defpackage.agfz.i(context).b(context, agfxVar3);
                int[] iArr = new int[0];
                if (iB != 0) {
                    if (fK <= 0.0f) {
                        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
                        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.26f);
                        typedArrayObtainStyledAttributes.recycle();
                        fK = f;
                    }
                    if (iB2 == 0) {
                        iB2 = iB;
                    }
                    android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, iArr}, new int[]{defpackage.aggi.a(iB2, fK), iB});
                    button.getBackground().mutate().setState(new int[0]);
                    button.refreshDrawableState();
                    button.setBackgroundTintList(colorStateList);
                }
                z = false;
            }
            defpackage.agfx agfxVar4 = agflVar.f;
            defpackage.agfx agfxVar5 = agflVar.n;
            int defaultColor = z ? button.getTextColors().getDefaultColor() : defpackage.agfz.i(context).b(context, agfxVar4);
            float fK2 = defpackage.agfz.i(context).K(context, agfxVar5);
            android.graphics.drawable.Drawable background = button.getBackground();
            if (background instanceof android.graphics.drawable.InsetDrawable) {
                rippleDrawable = (android.graphics.drawable.RippleDrawable) ((android.graphics.drawable.InsetDrawable) background).getDrawable();
            } else {
                rippleDrawable = background instanceof android.graphics.drawable.RippleDrawable ? (android.graphics.drawable.RippleDrawable) background : null;
            }
            if (rippleDrawable != null) {
                int iA = defpackage.aggi.a(defaultColor, fK2);
                android.content.res.ColorStateList colorStateList2 = new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, android.util.StateSet.NOTHING}, new int[]{iA, iA, 0});
                if (defpackage.agfz.t(context) && (button instanceof defpackage.aggk)) {
                    defpackage.aggk aggkVar = (defpackage.aggk) button;
                    if (aggkVar.w()) {
                        defpackage.afrl afrlVar = aggkVar.b;
                        if (afrlVar.m != colorStateList2) {
                            afrlVar.m = colorStateList2;
                            com.google.android.material.button.MaterialButton materialButton = afrlVar.a;
                            if (materialButton.getBackground() instanceof android.graphics.drawable.RippleDrawable) {
                                ((android.graphics.drawable.RippleDrawable) materialButton.getBackground()).setColor(afzc.b(colorStateList2));
                            }
                        }
                    }
                } else {
                    rippleDrawable.setColor(colorStateList2);
                }
            }
            defpackage.agfx agfxVar6 = agflVar.g;
            android.view.ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            if (defpackage.agfz.i(context).v(agfxVar6) && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins((int) defpackage.agfz.i(context).a(context, agfxVar6, 0.0f), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            float fA = defpackage.agfz.i(context).a(context, agflVar.h, 0.0f);
            if (fA > 0.0f) {
                button.setTextSize(0, fA);
            }
            defpackage.agfx agfxVar7 = agflVar.i;
            if (defpackage.agfz.i(context).v(agfxVar7)) {
                float fA2 = defpackage.agfz.i(context).a(context, agfxVar7, 0.0f);
                if (fA2 > 0.0f) {
                    button.setMinHeight(java.lang.Math.round(fA2));
                    if (button instanceof com.google.android.material.button.MaterialButton) {
                        button.setMinimumHeight(java.lang.Math.round(fA2));
                    }
                }
            }
            defpackage.agfx agfxVar8 = agflVar.j;
            defpackage.agfx agfxVar9 = agflVar.k;
            defpackage.agfx agfxVar10 = agflVar.l;
            java.lang.String strK = defpackage.agfz.i(context).k(context, agfxVar8);
            int iC = defpackage.agfz.i(context).v(agfxVar10) ? defpackage.agfz.i(context).c(context, agfxVar10, 0) : 0;
            android.graphics.Typeface typefaceM = (defpackage.agfz.r(context) && defpackage.agfz.i(context).v(agfxVar9)) ? ft$.ExternalSyntheticApiModelOutline0.m(android.graphics.Typeface.create(strK, iC), defpackage.agfz.i(context).c(context, agfxVar9, 400), false) : android.graphics.Typeface.create(strK, iC);
            if (typefaceM != null) {
                button.setTypeface(typefaceM);
            }
            float fA3 = defpackage.agfz.i(context).a(context, agflVar.m, 0.0f);
            if (defpackage.agfz.t(context) && (button instanceof defpackage.aggk)) {
                ((defpackage.aggk) button).k((int) fA3);
            } else {
                android.graphics.drawable.GradientDrawable gradientDrawableB = defpackage.aggi.b(button);
                if (gradientDrawableB != null) {
                    gradientDrawableB.setCornerRadius(fA3);
                }
            }
            defpackage.agfx agfxVar11 = agflVar.e;
            if (button != 0) {
                android.graphics.drawable.Drawable drawableE = agfxVar11 != null ? defpackage.agfz.i(context).e(context, agfxVar11) : null;
                if (drawableE != null) {
                    drawableE.setBounds(0, 0, drawableE.getIntrinsicWidth(), drawableE.getIntrinsicHeight());
                }
                if (id != i) {
                    drawable = null;
                } else {
                    drawable = drawableE;
                    drawableE = null;
                }
                button.setCompoundDrawablesRelative(drawableE, null, drawable, null);
            }
            if (z2) {
                return;
            }
            defpackage.agfx agfxVar12 = agflVar.d;
            if (button.isEnabled()) {
                defpackage.aggi.e(context, button, agfxVar4);
            } else {
                defpackage.aggi.c(context, button, agfxVar12);
            }
        }
    }

    public static void f(android.view.View view, android.view.View view2) {
        if (view2 != null) {
            if (view.getElevation() != view2.getElevation() + 1.0f) {
                view.setElevation(view2.getElevation() + 1.0f);
            }
            if (view.getTranslationZ() != view2.getTranslationZ() + 1.0f) {
                view.setTranslationZ(view2.getTranslationZ() + 1.0f);
            }
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                if (viewGroup.indexOfChild(view) != viewGroup.getChildCount() - 1) {
                    view.bringToFront();
                }
            }
        }
    }

    public final int a() {
        android.content.Context context = this.a;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{2130970503});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (dimensionPixelSize <= 0) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167440);
        }
        if (!this.b) {
            return dimensionPixelSize;
        }
        defpackage.agfz agfzVarI = defpackage.agfz.i(context);
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_BUTTON_MIN_HEIGHT;
        if (!agfzVarI.v(agfxVar)) {
            return dimensionPixelSize;
        }
        float fA = defpackage.agfz.i(context).a(context, agfxVar, 0.0f);
        return ((!afsq.p() || fA <= 0.0f) && fA <= ((float) dimensionPixelSize)) ? dimensionPixelSize : java.lang.Math.round(fA);
    }

    public final android.os.PersistableBundle b() {
        C.w("FooterBarMixin fragment name=" + this.s + ", Tag=" + this.t);
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        defpackage.agfw agfwVar = this.x;
        persistableBundle.putString("PrimaryButtonVisibility", agfwVar.a);
        persistableBundle.putString("SecondaryButtonVisibility", agfwVar.b);
        persistableBundle.putString("TertiaryButtonVisibility", agfwVar.c);
        persistableBundle.putString("ButtonClickOrder", android.text.TextUtils.join(",", agfwVar.d));
        if (defpackage.agfz.q(this.a)) {
            java.lang.String str = this.s;
            if (str != null) {
                persistableBundle.putString("HostFragmentName", com.google.android.setupcompat.logging.CustomEvent.c(str));
            }
            java.lang.String str2 = this.t;
            if (str2 != null) {
                persistableBundle.putString("HostFragmentTag", com.google.android.setupcompat.logging.CustomEvent.c(str2));
            }
        }
        return persistableBundle;
    }

    public final android.widget.Button c() {
        android.widget.LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            return null;
        }
        return (android.widget.Button) linearLayout.findViewById(this.i);
    }

    public final android.widget.Button d() {
        android.widget.LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            return null;
        }
        return (android.widget.Button) linearLayout.findViewById(this.j);
    }

    public final android.widget.Button e() {
        if (!defpackage.agfz.t(this.a)) {
            C.w("Cannot get tertiary button when glif expressive is not enabled.");
            return null;
        }
        android.widget.LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            return (android.widget.Button) linearLayout.findViewById(0);
        }
        return null;
    }

    public final void g() {
        if (this.f == null || this.A != null) {
            return;
        }
        this.A = new jvi(this, 3);
        this.f.getViewTreeObserver().addOnPreDrawListener(this.A);
    }

    public final void h() {
        android.widget.LinearLayout linearLayout;
        android.content.Context context = this.a;
        if (defpackage.agfz.A(context)) {
            F();
            this.J = true;
            android.view.View viewFindViewWithTag = this.f.findViewWithTag("footer_dummy_view");
            android.widget.Button buttonC = c();
            android.widget.Button buttonD = d();
            if ((buttonC == null || buttonC.getVisibility() != 0) && (buttonD == null || buttonD.getVisibility() != 0)) {
                if (viewFindViewWithTag == null && defpackage.agfz.A(context) && (linearLayout = this.f) != null && linearLayout.findViewWithTag("footer_dummy_view") == null) {
                    android.widget.Space space = new android.widget.Space(context);
                    space.setTag("footer_dummy_view");
                    defpackage.agfz agfzVarI = defpackage.agfz.i(context);
                    defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_BUTTON_MIN_HEIGHT;
                    float fA = agfzVarI.v(agfxVar) ? defpackage.agfz.i(context).a(context, agfxVar, 0.0f) : 0.0f;
                    if (fA == 0.0f) {
                        fA = android.util.TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics());
                    }
                    space.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, (int) (fA + android.util.TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()))));
                    this.f.addView(space);
                }
            } else if (viewFindViewWithTag != null) {
                this.f.removeView(viewFindViewWithTag);
            }
            J();
        }
    }

    public final void i() {
        boolean zV = v();
        boolean zW = w();
        boolean zX = x();
        defpackage.agfw agfwVar = this.x;
        agfwVar.a = defpackage.agfw.a(agfwVar.a, zV);
        agfwVar.b = defpackage.agfw.a(agfwVar.b, zW);
        agfwVar.c = defpackage.agfw.a(agfwVar.c, zX);
        android.widget.LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.getViewTreeObserver().removeOnWindowFocusChangeListener(this.B);
            if (this.A != null) {
                if (this.f.getViewTreeObserver().isAlive()) {
                    this.f.getViewTreeObserver().removeOnPreDrawListener(this.A);
                }
                this.A = null;
            }
        }
    }

    protected final void j(android.widget.Button button, int i) {
        if (!this.c && i != 0) {
            java.util.HashMap map = defpackage.aggi.a;
            button.getBackground().mutate().setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        this.f.addView(button);
        J();
    }

    protected final void k() {
        android.widget.LinearLayout.LayoutParams layoutParams;
        android.widget.LinearLayout linearLayoutF = F();
        android.widget.Button buttonC = c();
        android.widget.Button buttonD = d();
        android.view.View viewE = e();
        linearLayoutF.removeAllViews();
        android.content.Context context = this.a;
        int i = context.getResources().getConfiguration().orientation;
        if (defpackage.agfz.t(context)) {
            int visibility = this.y ? this.z : linearLayoutF.getVisibility();
            this.I = visibility;
            if (visibility == 0) {
                linearLayoutF.setVisibility(4);
            }
        }
        if (buttonD != null) {
            I(buttonD, this.H);
            linearLayoutF.addView(buttonD);
        }
        if (!u() && !defpackage.agfz.t(context)) {
            android.widget.LinearLayout linearLayoutF2 = F();
            android.view.View view = new android.view.View(context);
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, 0, 1.0f));
            view.setVisibility(4);
            linearLayoutF2.addView(view);
        }
        if (defpackage.agfz.t(context) && viewE != null) {
            if (A(buttonC, buttonD)) {
                I(viewE, this.G);
                linearLayoutF.addView(viewE);
            } else {
                C.w("Cannot add tertiary button when primary or secondary button is null.");
            }
        }
        if (buttonC != null) {
            I(buttonC, this.G);
            linearLayoutF.addView(buttonC);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) buttonC.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -2;
                layoutParams2.weight = 0.0f;
                buttonC.setLayoutParams(layoutParams2);
            }
        }
        if (buttonD != null && (layoutParams = (android.widget.LinearLayout.LayoutParams) buttonD.getLayoutParams()) != null) {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            buttonD.setLayoutParams(layoutParams);
        }
        if (defpackage.agfz.t(context)) {
            l();
        }
        linearLayoutF.requestApplyInsets();
        if (this.J && defpackage.agfz.A(context)) {
            h();
        }
    }

    public final void l() {
        android.content.Context context = this.a;
        if (defpackage.agfz.A(context)) {
            this.f.post(new java.lang.Runnable() { // from class: agge
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    int i2;
                    java.util.ArrayList arrayList;
                    int i3;
                    int i4;
                    android.view.View viewFindViewById;
                    defpackage.aggf aggfVar = this.a;
                    int i5 = 0;
                    if (aggfVar.t()) {
                        aggfVar.f.setVisibility(0);
                        aggfVar.m();
                        return;
                    }
                    android.widget.Button buttonC = aggfVar.c();
                    android.widget.Button buttonD = aggfVar.d();
                    android.widget.Button buttonE = aggfVar.e();
                    boolean z = buttonC != null && buttonC.getVisibility() == 0;
                    boolean z2 = buttonD != null && buttonD.getVisibility() == 0;
                    boolean z3 = buttonE != null && buttonE.getVisibility() == 0;
                    aggfVar.q();
                    aggfVar.f.setGravity(8388613);
                    android.content.Context context2 = aggfVar.a;
                    int identifier = context2.getResources().getIdentifier("sud_layout_floating_back_button_container", "id", context2.getPackageName());
                    if (identifier == 0 || aggfVar.f.getRootView() == null || (viewFindViewById = aggfVar.f.getRootView().findViewById(identifier)) == null || viewFindViewById.getVisibility() != 0) {
                        i = 0;
                    } else {
                        int measuredWidth = viewFindViewById.getMeasuredWidth();
                        android.view.ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                            measuredWidth += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                        }
                        defpackage.aggf.f(viewFindViewById, aggfVar.f);
                        i = measuredWidth;
                    }
                    int measuredWidth2 = aggfVar.f.getMeasuredWidth();
                    int i6 = aggfVar.m;
                    int i7 = aggfVar.n;
                    aggfVar.p(aggfVar.f, aggfVar.o + i6 + i, aggfVar.k, aggfVar.p + i7, aggfVar.l);
                    int i8 = (((measuredWidth2 - i6) - i7) - aggfVar.o) - aggfVar.p;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    if (z) {
                        arrayList2.add(buttonC);
                    }
                    if (z2) {
                        arrayList2.add(buttonD);
                    }
                    if (z3) {
                        arrayList2.add(buttonE);
                    }
                    int size = arrayList2.size();
                    int i9 = 0;
                    int measuredWidth3 = 0;
                    while (true) {
                        i2 = i8 - i;
                        if (i9 >= size) {
                            break;
                        }
                        android.widget.Button button = (android.widget.Button) arrayList2.get(i9);
                        if (button == 0 || button.getVisibility() != 0) {
                            arrayList = arrayList2;
                            i3 = size;
                            i4 = i5;
                        } else {
                            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
                            arrayList = arrayList2;
                            android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 == null ? new android.widget.LinearLayout.LayoutParams(-2, -2) : layoutParams2;
                            layoutParams3.width = -2;
                            layoutParams3.height = -2;
                            layoutParams3.weight = 0.0f;
                            button.setLayoutParams(layoutParams3);
                            button.setMinimumWidth(context2.getResources().getDimensionPixelSize(2131167439));
                            i3 = size;
                            float fA = defpackage.agfz.i(context2).a(context2, defpackage.agfx.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, 0.0f);
                            if (fA > 0.0f) {
                                button.setMinimumHeight(java.lang.Math.round(fA));
                            }
                            if (button instanceof com.google.android.material.button.MaterialButton) {
                                defpackage.afrl afrlVar = ((com.google.android.material.button.MaterialButton) button).b;
                                i4 = 0;
                                afrlVar.d(afrlVar.d, 0, afrlVar.e, afrlVar.g);
                                afrlVar.d(afrlVar.d, afrlVar.f, afrlVar.e, 0);
                            } else {
                                i4 = 0;
                            }
                        }
                        button.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i4);
                        measuredWidth3 += button.getMeasuredWidth();
                        i9++;
                        arrayList2 = arrayList;
                        size = i3;
                        i5 = 0;
                    }
                    java.util.ArrayList arrayList3 = arrayList2;
                    int i10 = measuredWidth3;
                    int size2 = arrayList3.size() > 1 ? i10 + ((arrayList3.size() - 1) * aggfVar.v) : i10;
                    aggfVar.f.setOrientation(size2 > i2 ? 1 : 0);
                    android.widget.LinearLayout linearLayout = aggfVar.f;
                    if (linearLayout instanceof com.google.android.setupcompat.view.ButtonBarLayout) {
                        ((com.google.android.setupcompat.view.ButtonBarLayout) linearLayout).a(false);
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    if (size2 > i2) {
                        if (z) {
                            arrayList4.add(buttonC);
                        }
                        if (z3) {
                            arrayList4.add(buttonE);
                        }
                        if (z2) {
                            arrayList4.add(buttonD);
                        }
                    } else {
                        if (z2) {
                            arrayList4.add(buttonD);
                        }
                        if (z3) {
                            arrayList4.add(buttonE);
                        }
                        if (z) {
                            arrayList4.add(buttonC);
                        }
                    }
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        android.widget.Button button2 = (android.widget.Button) arrayList4.get(i11);
                        aggfVar.f.bringChildToFront(button2);
                        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) button2.getLayoutParams();
                        layoutParams4.setMarginStart(0);
                        layoutParams4.setMarginEnd(0);
                        layoutParams4.topMargin = 0;
                        layoutParams4.bottomMargin = 0;
                        layoutParams4.leftMargin = 0;
                        layoutParams4.rightMargin = 0;
                        if (size2 > i2) {
                            if (i11 < arrayList4.size() - 1) {
                                layoutParams4.bottomMargin = aggfVar.v;
                            }
                        } else if (i11 > 0) {
                            layoutParams4.setMarginStart(aggfVar.v);
                        }
                        button2.setLayoutParams(layoutParams4);
                    }
                    aggfVar.o();
                }
            });
        } else if (defpackage.agfz.t(context)) {
            this.f.post(new java.lang.Runnable() { // from class: aggd
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    defpackage.aggf aggfVar = this.a;
                    int measuredWidth = (aggfVar.f.getMeasuredWidth() - aggfVar.m) - aggfVar.n;
                    android.widget.Button buttonC = aggfVar.c();
                    android.widget.Button buttonD = aggfVar.d();
                    android.widget.Button buttonE = aggfVar.e();
                    if (aggfVar.y()) {
                        measuredWidth /= 2;
                        if (!aggfVar.u) {
                            aggfVar.f.setGravity(8388613);
                        }
                    }
                    int i2 = measuredWidth;
                    aggfVar.q();
                    if (!aggfVar.u) {
                        aggfVar.p(aggfVar.f, aggfVar.o + aggfVar.m, aggfVar.k, aggfVar.p + aggfVar.n, aggfVar.l);
                    }
                    int i3 = ((i2 - aggfVar.o) - aggfVar.p) - aggfVar.v;
                    if (aggfVar.y()) {
                        android.content.Context context2 = aggfVar.a;
                        defpackage.agfz agfzVarI = defpackage.agfz.i(context2);
                        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_LAND_MIDDLE_HORIZONTAL_SPACING;
                        boolean zV = agfzVarI.v(agfxVar);
                        boolean z = zV && !(agfzVarI.v(defpackage.agfx.CONFIG_FOOTER_BAR_PADDING_START) || agfzVarI.v(defpackage.agfx.CONFIG_FOOTER_BAR_PADDING_END));
                        int iA = zV ? (int) agfzVarI.a(context2, agfxVar, 0.0f) : 0;
                        xtq xtqVar = defpackage.aggf.C;
                        java.util.Locale locale = java.util.Locale.US;
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iA);
                        int i4 = aggfVar.r;
                        xtqVar.x(java.lang.String.format(locale, "validLandMiddleHorizontalSpacing: %s, configuredLandHorizontalSpacing: %d, landMiddleHorizontalSpacing: %d", boolValueOf, numValueOf, java.lang.Integer.valueOf(i4)));
                        i = z ? (iA - i4) / 2 : 0;
                    } else {
                        i = 0;
                    }
                    int iMax = java.lang.Math.max(0, i3 - i);
                    int i5 = iMax / 2;
                    boolean z2 = buttonE != null && buttonE.getVisibility() == 0;
                    xtq xtqVar2 = defpackage.aggf.C;
                    xtqVar2.w("isTertiaryButtonVisible=" + z2);
                    if (z2 && defpackage.aggf.A(buttonC, buttonD)) {
                        android.widget.LinearLayout linearLayout = aggfVar.f;
                        if (linearLayout instanceof com.google.android.setupcompat.view.ButtonBarLayout) {
                            aggfVar.r();
                            ((com.google.android.setupcompat.view.ButtonBarLayout) linearLayout).a(true);
                            int i6 = aggfVar.w / 2;
                            defpackage.aggf.C(buttonC, iMax, i6, j$.util.Optional.empty());
                            defpackage.aggf.D(buttonD, iMax, i6, j$.util.Optional.empty());
                            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) buttonE.getLayoutParams();
                            layoutParams.width = iMax;
                            layoutParams.topMargin = i6;
                            layoutParams.bottomMargin = i6;
                            buttonE.setLayoutParams(layoutParams);
                        }
                    } else if (defpackage.aggf.A(buttonC, buttonD)) {
                        float f = i5;
                        java.lang.String string = buttonC.getText().toString();
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setTypeface(buttonC.getTypeface());
                        paint.setTextSize(buttonC.getTextSize());
                        float fMeasureText = paint.measureText(string) + buttonC.getPaddingLeft();
                        float paddingRight = buttonC.getPaddingRight();
                        float paddingStart = buttonC.getPaddingStart();
                        float paddingEnd = buttonC.getPaddingEnd();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("isPrimaryButtonTextOverFlowing= ");
                        float f2 = fMeasureText + paddingRight + paddingStart + paddingEnd;
                        boolean z3 = f2 > f;
                        sb.append(z3);
                        sb.append(", primaryButtonWidth= ");
                        sb.append(f2);
                        sb.append(", maxButtonWidth= ");
                        sb.append(f);
                        xtqVar2.w(sb.toString());
                        java.lang.String string2 = buttonD.getText().toString();
                        android.graphics.Paint paint2 = new android.graphics.Paint();
                        paint2.setTypeface(buttonD.getTypeface());
                        paint2.setTextSize(buttonD.getTextSize());
                        float fMeasureText2 = paint2.measureText(string2) + buttonD.getPaddingLeft();
                        float paddingRight2 = buttonD.getPaddingRight();
                        float paddingStart2 = buttonD.getPaddingStart();
                        float paddingEnd2 = buttonD.getPaddingEnd();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("isSecondaryButtonTextOverFlowing= ");
                        float f3 = fMeasureText2 + paddingRight2 + paddingStart2 + paddingEnd2;
                        boolean z4 = f3 > f;
                        sb2.append(z4);
                        sb2.append(", secondaryButtonWidth= ");
                        sb2.append(f3);
                        sb2.append(", maxButtonWidth= ");
                        sb2.append(f);
                        xtqVar2.w(sb2.toString());
                        if (z3 || z4) {
                            android.widget.LinearLayout linearLayout2 = aggfVar.f;
                            if (linearLayout2 instanceof com.google.android.setupcompat.view.ButtonBarLayout) {
                                aggfVar.r();
                                ((com.google.android.setupcompat.view.ButtonBarLayout) linearLayout2).a(true);
                                int i7 = aggfVar.w / 2;
                                defpackage.aggf.C(buttonC, iMax, i7, j$.util.Optional.empty());
                                defpackage.aggf.D(buttonD, iMax, i7, j$.util.Optional.empty());
                            }
                        } else {
                            android.widget.LinearLayout linearLayout3 = aggfVar.f;
                            if (linearLayout3 instanceof com.google.android.setupcompat.view.ButtonBarLayout) {
                                ((com.google.android.setupcompat.view.ButtonBarLayout) linearLayout3).a(false);
                                defpackage.aggf.C(buttonC, iMax, 0, j$.util.Optional.of(java.lang.Integer.valueOf(aggfVar.v / 2)));
                                defpackage.aggf.D(buttonD, iMax, 0, j$.util.Optional.of(java.lang.Integer.valueOf(aggfVar.v / 2)));
                            }
                        }
                        int iMax2 = java.lang.Math.max(0, ((iMax - ((android.widget.LinearLayout.LayoutParams) buttonC.getLayoutParams()).getMarginStart()) - ((android.widget.LinearLayout.LayoutParams) buttonD.getLayoutParams()).getMarginEnd()) / 2);
                        defpackage.aggf.C(buttonC, iMax2, 0, j$.util.Optional.of(java.lang.Integer.valueOf(aggfVar.v / 2)));
                        defpackage.aggf.D(buttonD, iMax2, 0, j$.util.Optional.of(java.lang.Integer.valueOf(aggfVar.v / 2)));
                    } else {
                        boolean z5 = buttonC != null && buttonD == null;
                        boolean z6 = (buttonC == null || buttonD == null || buttonD.getVisibility() == 0) ? false : true;
                        xtqVar2.w("isPrimaryOnly=" + z5 + ", isPrimaryOnlyButSecondaryInvisible=" + z6);
                        if (z5 || z6) {
                            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) buttonC.getLayoutParams();
                            if (layoutParams2 != null) {
                                if (aggfVar.u) {
                                    aggfVar.m();
                                } else {
                                    layoutParams2.width = iMax;
                                }
                                buttonC.setLayoutParams(layoutParams2);
                            }
                        } else {
                            boolean z7 = buttonD != null && buttonC == null;
                            boolean z8 = (buttonD == null || buttonC == null || buttonC.getVisibility() == 0) ? false : true;
                            xtqVar2.w("isSecondaryOnly=" + z7 + ", isSecondaryOnlyButPrimaryInvisible=" + z8);
                            if (z7 || z8) {
                                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) buttonD.getLayoutParams();
                                if (layoutParams3 != null) {
                                    layoutParams3.width = iMax;
                                    buttonD.setLayoutParams(layoutParams3);
                                }
                            } else {
                                xtqVar2.x("There are no button visible in the footer bar.");
                            }
                        }
                    }
                    if (!aggfVar.u) {
                        int iA2 = aggfVar.a();
                        defpackage.aggf.B(buttonC, iA2);
                        defpackage.aggf.B(buttonD, iA2);
                        defpackage.aggf.B(buttonE, iA2);
                    }
                    aggfVar.o();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m() {
        android.widget.Button buttonC = c();
        if (buttonC == 0) {
            C.w("Primary button is null when setting down button for expressive style, skip.");
            return;
        }
        this.u = true;
        android.content.Context context = this.a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167442);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131167440);
        int iA = a();
        if (iA > 0) {
            dimensionPixelSize2 = iA;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) buttonC.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = java.lang.Math.max(dimensionPixelSize, dimensionPixelSize2);
        layoutParams.height = dimensionPixelSize2;
        buttonC.setLayoutParams(layoutParams);
        float dimension = context.getResources().getDimension(2131167441);
        if (buttonC.getLayoutParams() != null && buttonC.getLayoutParams().height > 0) {
            dimension = buttonC.getLayoutParams().height / 2.0f;
        }
        if (buttonC instanceof com.google.android.material.button.MaterialButton) {
            ((com.google.android.material.button.MaterialButton) buttonC).k(java.lang.Math.round(dimension));
        } else {
            android.graphics.drawable.GradientDrawable gradientDrawableB = defpackage.aggi.b(buttonC);
            if (gradientDrawableB != null) {
                gradientDrawableB.setCornerRadius(dimension);
            }
        }
        boolean zY = y();
        android.widget.LinearLayout linearLayout = this.f;
        if (!zY) {
            linearLayout.setGravity(17);
            return;
        }
        linearLayout.setGravity(16);
        if (this.f.getMeasuredWidth() > 0) {
            s(buttonC);
        } else {
            this.f.post(new defpackage.aekf(this, buttonC, 20, null));
        }
    }

    public final void n(defpackage.aggh agghVar) {
        afsq.t("setPrimaryButton");
        F();
        android.content.Context context = this.a;
        int i = true != defpackage.agfz.t(context) ? 2132083916 : 2132083913;
        boolean z = this.c;
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR;
        defpackage.agfl agflVar = new defpackage.agfl(E(agghVar, i, true, z, agfxVar), agfxVar, defpackage.agfx.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, defpackage.agfx.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, defpackage.agfx.CONFIG_FOOTER_PRIMARY_BUTTON_DISABLED_TEXT_COLOR, G(agghVar.a), defpackage.agfx.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR, defpackage.agfx.CONFIG_FOOTER_PRIMARY_BUTTON_MARGIN_START, defpackage.agfx.CONFIG_FOOTER_BUTTON_TEXT_SIZE, defpackage.agfx.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, defpackage.agfx.CONFIG_FOOTER_BUTTON_FONT_FAMILY, defpackage.agfx.CONFIG_FOOTER_BUTTON_FONT_WEIGHT, defpackage.agfx.CONFIG_FOOTER_BUTTON_TEXT_STYLE, defpackage.agfx.CONFIG_FOOTER_BUTTON_RADIUS, defpackage.agfx.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA);
        java.lang.Object objH = H(agghVar, agflVar);
        android.widget.Button button = (android.widget.Button) objH;
        this.i = button.getId();
        if (objH instanceof defpackage.aggk) {
        } else if (button instanceof com.google.android.setupcompat.template.FooterActionButton) {
            ((com.google.android.setupcompat.template.FooterActionButton) objH).b = true;
        } else {
            C.z("Set the primary button style error when setting primary button.");
        }
        this.g = agghVar;
        j(button, this.E);
        if (defpackage.agfz.t(context)) {
            boolean z2 = this.g.c;
            defpackage.aggi.d(button, this.G);
        }
        K(button, agflVar);
        k();
        button.post(new defpackage.aekf(this, button, 18, null));
    }

    public final void o() {
        android.widget.LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            if (this.y) {
                linearLayout.setVisibility(8);
                return;
            }
            int i = this.I;
            if (i != -1) {
                linearLayout.setVisibility(i);
            } else {
                linearLayout.setVisibility(0);
            }
        }
    }

    public final void p(android.widget.LinearLayout linearLayout, int i, int i2, int i3, int i4) {
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(i, i2, i3, i4);
            if (defpackage.agfz.t(this.a)) {
                linearLayout.requestApplyInsets();
            }
        }
    }

    public final void q() {
        android.content.Context context = this.a;
        defpackage.agfz agfzVarI = defpackage.agfz.i(context);
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_BUTTON_MIDDLE_SPACE;
        if (agfzVarI.v(agfxVar)) {
            this.v = (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f);
        }
    }

    public final void r() {
        android.content.Context context = this.a;
        defpackage.agfz agfzVarI = defpackage.agfz.i(context);
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_BUTTON_STACK_MIDDLE_SPACE;
        if (agfzVarI.v(agfxVar)) {
            this.w = (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f);
        }
    }

    public final void s(android.widget.Button button) {
        int measuredWidth = (this.f.getMeasuredWidth() - this.m) - this.n;
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(2131167442);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) button.getLayoutParams();
        if (marginLayoutParams != null && marginLayoutParams.width > 0) {
            dimensionPixelSize = marginLayoutParams.width;
        }
        this.f.setPaddingRelative((int) (java.lang.Math.round(((((double) measuredWidth) * 0.75d) - (((double) dimensionPixelSize) / 2.0d)) - ((double) (marginLayoutParams != null ? marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd() : 0))) + ((long) this.m)), this.f.getPaddingTop(), this.f.getPaddingEnd(), this.f.getPaddingBottom());
    }

    public final boolean t() {
        if (defpackage.agfz.t(this.a)) {
            return this.u;
        }
        return false;
    }

    protected final boolean u() {
        android.content.Context context = this.a;
        defpackage.agfz agfzVarI = defpackage.agfz.i(context);
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_BUTTON_ALIGNED_END;
        return agfzVarI.v(agfxVar) ? defpackage.agfz.i(context).m(context, agfxVar, false) : this.e;
    }

    public final boolean v() {
        return c() != null && c().getVisibility() == 0;
    }

    public final boolean w() {
        return d() != null && d().getVisibility() == 0;
    }

    public final boolean x() {
        return e() != null && e().getVisibility() == 0;
    }

    final boolean y() {
        android.content.Context context = this.a;
        if (defpackage.agfz.i(context).n(context)) {
            return false;
        }
        return context.getResources().getBoolean(2131034160);
    }

    public final void z(defpackage.aggh agghVar) {
        afsq.t("setSecondaryButton");
        F();
        android.content.Context context = this.a;
        int i = true != defpackage.agfz.t(context) ? 2132083917 : 2132083914;
        boolean z = this.c;
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR;
        defpackage.agfl agflVar = new defpackage.agfl(E(agghVar, i, false, z, agfxVar), agfxVar, defpackage.agfx.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, defpackage.agfx.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, defpackage.agfx.CONFIG_FOOTER_SECONDARY_BUTTON_DISABLED_TEXT_COLOR, G(agghVar.a), defpackage.agfx.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR, defpackage.agfx.CONFIG_FOOTER_SECONDARY_BUTTON_MARGIN_START, defpackage.agfx.CONFIG_FOOTER_BUTTON_TEXT_SIZE, defpackage.agfx.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, defpackage.agfx.CONFIG_FOOTER_BUTTON_FONT_FAMILY, defpackage.agfx.CONFIG_FOOTER_BUTTON_FONT_WEIGHT, defpackage.agfx.CONFIG_FOOTER_BUTTON_TEXT_STYLE, defpackage.agfx.CONFIG_FOOTER_BUTTON_RADIUS, defpackage.agfx.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA);
        java.lang.Object objH = H(agghVar, agflVar);
        android.widget.Button button = (android.widget.Button) objH;
        this.j = button.getId();
        if (objH instanceof defpackage.aggk) {
        } else if (button instanceof com.google.android.setupcompat.template.FooterActionButton) {
            ((com.google.android.setupcompat.template.FooterActionButton) objH).b = false;
        } else {
            C.z("Set the primary button style error when setting secondary button.");
        }
        this.h = agghVar;
        j(button, this.F);
        if (defpackage.agfz.t(context)) {
            boolean z2 = this.h.c;
            defpackage.aggi.d(button, this.H);
        }
        K(button, agflVar);
        k();
        button.post(new defpackage.aekf(this, button, 19, null));
    }
}
