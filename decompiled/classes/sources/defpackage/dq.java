package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dq extends defpackage.dc implements android.view.LayoutInflater.Factory2, defpackage.fr {
    private static final defpackage.aec M = new defpackage.aec(0);
    private static final int[] N = {android.R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(android.os.Build.FINGERPRINT);
    boolean A;
    boolean B;
    public defpackage.C0000do C;
    public boolean D;
    boolean E;
    public android.content.res.Configuration F;
    public int G;
    public boolean H;
    public int I;
    public android.graphics.Rect J;
    public android.graphics.Rect K;
    private java.lang.CharSequence O;
    private dp P;
    private android.widget.TextView Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private defpackage.C0000do[] U;
    private boolean V;
    private boolean W;
    private int X;
    private int Y;
    private boolean Z;
    private dl aa;
    private dl ab;
    private boolean ad;
    private android.support.v7.app.AppCompatViewInflater ae;
    private android.window.OnBackInvokedDispatcher af;
    private android.window.OnBackInvokedCallback ag;
    private dp ah;
    final java.lang.Object j;
    final android.content.Context k;
    public android.view.Window l;
    public defpackage.di m;
    cp n;
    android.view.MenuInflater o;
    public iq p;
    ey q;
    public android.support.v7.widget.ActionBarContextView r;
    public android.widget.PopupWindow s;
    public java.lang.Runnable t;
    public boolean v;
    android.view.ViewGroup w;
    boolean x;
    boolean y;
    boolean z;
    public ni L = null;
    public boolean u = true;
    private final java.lang.Runnable ac = new defpackage.am(this, 13, null);

    public dq(android.content.Context context, android.view.Window window, java.lang.Object obj) {
        defpackage.da daVar = null;
        this.X = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof android.app.Dialog) {
            while (context != null) {
                if (!(context instanceof defpackage.da)) {
                    if (!(context instanceof android.content.ContextWrapper)) {
                        break;
                    } else {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                    }
                } else {
                    daVar = (defpackage.da) context;
                    break;
                }
            }
            if (daVar != null) {
                this.X = ((defpackage.dq) daVar.j()).X;
            }
        }
        if (this.X == -100) {
            defpackage.aec aecVar = M;
            java.lang.Integer num = (java.lang.Integer) aecVar.get(this.j.getClass().getName());
            if (num != null) {
                this.X = num.intValue();
                aecVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            U(window);
        }
        defpackage.ho.f();
    }

    private final dl S(android.content.Context context) {
        if (this.ab == null) {
            this.ab = new dj(this, context);
        }
        return this.ab;
    }

    private final dl T(android.content.Context context) {
        if (this.aa == null) {
            if (defpackage.izg.d == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                defpackage.izg.d = new defpackage.izg(applicationContext, (android.location.LocationManager) applicationContext.getSystemService("location"));
            }
            this.aa = new dm(this, defpackage.izg.d);
        }
        return this.aa;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    private final void U(android.view.Window window) {
        if (this.l != null) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        android.view.Window.Callback callback = window.getCallback();
        if (callback instanceof defpackage.di) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        defpackage.di diVar = new defpackage.di(this, callback);
        this.m = diVar;
        window.setCallback(diVar);
        android.content.Context context = this.k;
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context, context.obtainStyledAttributes((android.util.AttributeSet) null, N));
        android.graphics.drawable.Drawable drawableU = ajxwVar.u(0);
        if (drawableU != null) {
            window.setBackgroundDrawable(drawableU);
        }
        ajxwVar.x();
        this.l = window;
        if (android.os.Build.VERSION.SDK_INT < 33 || this.af != null) {
            return;
        }
        java.lang.Object obj = this.j;
        if (obj instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) obj;
            if (activity.getWindow() != null) {
                this.af = ae$.ExternalSyntheticApiModelOutline0.m(activity);
            } else {
                this.af = null;
            }
        } else {
            this.af = null;
        }
        I();
    }

    private final void V() {
        if (this.l == null) {
            java.lang.Object obj = this.j;
            if (obj instanceof android.app.Activity) {
                U(((android.app.Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new java.lang.IllegalStateException("We have not been given a Window");
        }
    }

    private final void W(int i2) {
        this.I |= 1 << i2;
        if (this.H) {
            return;
        }
        android.view.View decorView = this.l.getDecorView();
        java.lang.Runnable runnable = this.ac;
        int i3 = defpackage.dzs.a;
        decorView.postOnAnimation(runnable);
        this.H = true;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0192  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    private final void X(defpackage.C0000do c0000do, android.view.KeyEvent keyEvent) {
        int i2;
        android.view.View view;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (c0000do.m || this.E) {
            return;
        }
        int i3 = c0000do.a;
        if (i3 == 0 && (this.k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        android.view.Window.Callback callbackX = x();
        if (callbackX != null && !callbackX.onMenuOpened(i3, c0000do.h)) {
            C(c0000do, true);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.k.getSystemService("window");
        if (windowManager == null || !M(c0000do, keyEvent)) {
            return;
        }
        android.view.ViewGroup viewGroup = c0000do.e;
        if (viewGroup != null) {
            if (!c0000do.n) {
                android.view.View view2 = c0000do.g;
                if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                    i2 = layoutParams.width != -1 ? -2 : -1;
                }
            } else if (c0000do.n && viewGroup.getChildCount() > 0) {
                c0000do.e.removeAllViews();
            }
            c0000do.l = false;
            android.view.WindowManager.LayoutParams layoutParams2 = new android.view.WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = c0000do.c;
            layoutParams2.windowAnimations = c0000do.d;
            windowManager.addView(c0000do.e, layoutParams2);
            c0000do.m = true;
            if (i3 == 0) {
                I();
                return;
            }
            return;
        }
        android.content.Context contextU = u();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        android.content.res.Resources.Theme themeNewTheme = contextU.getResources().newTheme();
        themeNewTheme.setTo(contextU.getTheme());
        themeNewTheme.resolveAttribute(2130968581, typedValue, true);
        if (typedValue.resourceId != 0) {
            themeNewTheme.applyStyle(typedValue.resourceId, true);
        }
        themeNewTheme.resolveAttribute(2130970206, typedValue, true);
        if (typedValue.resourceId != 0) {
            themeNewTheme.applyStyle(typedValue.resourceId, true);
        } else {
            themeNewTheme.applyStyle(2132084576, true);
        }
        defpackage.pc pcVar = new defpackage.pc(contextU, 0);
        pcVar.getTheme().setTo(themeNewTheme);
        c0000do.j = pcVar;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = pcVar.obtainStyledAttributes(defpackage.ef.j);
        c0000do.b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
        c0000do.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        c0000do.e = new dn(this, c0000do.j);
        c0000do.c = 81;
        if (c0000do.e == null) {
            return;
        }
        android.view.View view3 = c0000do.g;
        if (view3 == null) {
            defpackage.ft ftVar = c0000do.h;
            if (ftVar != null) {
                dp dpVar = this.P;
                if (dpVar == null) {
                    dpVar = new dp(this, 0);
                    this.P = dpVar;
                }
                if (ftVar == null) {
                    view = null;
                } else {
                    if (c0000do.i == null) {
                        c0000do.i = new fp(c0000do.j);
                        defpackage.ge geVar = c0000do.i;
                        ((fp) geVar).e = dpVar;
                        c0000do.h.g(geVar);
                    }
                    fp fpVar = c0000do.i;
                    android.view.ViewGroup viewGroup2 = c0000do.e;
                    if (fpVar.d == null) {
                        fpVar.d = fpVar.b.inflate(2131623951, viewGroup2, false);
                        if (fpVar.f == null) {
                            fpVar.f = new fo(fpVar);
                        }
                        fpVar.d.setAdapter(fpVar.f);
                        fpVar.d.setOnItemClickListener(fpVar);
                    }
                    view = fpVar.d;
                }
                c0000do.f = view;
                if (c0000do.f != null) {
                }
            }
            c0000do.n = true;
        }
        c0000do.f = view3;
        if (c0000do.f != null && (c0000do.g != null || c0000do.i.k().getCount() > 0)) {
            android.view.ViewGroup.LayoutParams layoutParams3 = c0000do.f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new android.view.ViewGroup.LayoutParams(-2, -2);
            }
            c0000do.e.setBackgroundResource(c0000do.b);
            android.view.ViewParent parent = c0000do.f.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(c0000do.f);
            }
            c0000do.e.addView(c0000do.f, layoutParams3);
            if (!c0000do.f.hasFocus()) {
                c0000do.f.requestFocus();
            }
            c0000do.l = false;
            android.view.WindowManager.LayoutParams layoutParams4 = new android.view.WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = c0000do.c;
            layoutParams4.windowAnimations = c0000do.d;
            windowManager.addView(c0000do.e, layoutParams4);
            c0000do.m = true;
            if (i3 == 0) {
                I();
                return;
            }
            return;
        }
        c0000do.n = true;
    }

    private final void Y() {
        if (this.v) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    final void A(int i2, defpackage.C0000do c0000do, android.view.Menu menu) {
        if (menu == null) {
            menu = c0000do.h;
        }
        if (!c0000do.m || this.E) {
            return;
        }
        defpackage.di diVar = this.m;
        android.view.Window.Callback callback = this.l.getCallback();
        try {
            diVar.b = true;
            callback.onPanelClosed(i2, menu);
        } finally {
            diVar.b = false;
        }
    }

    final void B(defpackage.ft ftVar) {
        if (this.T) {
            return;
        }
        this.T = true;
        this.p.a();
        android.view.Window.Callback callbackX = x();
        if (callbackX != null && !this.E) {
            callbackX.onPanelClosed(108, ftVar);
        }
        this.T = false;
    }

    final void C(defpackage.C0000do c0000do, boolean z) {
        android.view.ViewGroup viewGroup;
        iq iqVar;
        if (z && c0000do.a == 0 && (iqVar = this.p) != null && iqVar.s()) {
            B(c0000do.h);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.k.getSystemService("window");
        if (windowManager != null && c0000do.m && (viewGroup = c0000do.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                A(c0000do.a, c0000do, null);
            }
        }
        c0000do.k = false;
        c0000do.l = false;
        c0000do.m = false;
        c0000do.f = null;
        c0000do.n = true;
        if (this.C == c0000do) {
            this.C = null;
        }
        if (c0000do.a == 0) {
            I();
        }
    }

    public final void D(int i2) {
        defpackage.C0000do c0000doP = P(i2);
        if (c0000doP.h != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            c0000doP.h.q(bundle);
            if (bundle.size() > 0) {
                c0000doP.p = bundle;
            }
            c0000doP.h.u();
            c0000doP.h.clear();
        }
        c0000doP.o = true;
        c0000doP.n = true;
        if ((i2 == 108 || i2 == 0) && this.p != null) {
            defpackage.C0000do c0000doP2 = P(0);
            c0000doP2.k = false;
            M(c0000doP2, null);
        }
    }

    public final void E() {
        ni niVar = this.L;
        if (niVar != null) {
            niVar.j();
        }
    }

    public final void F() {
        android.view.ViewGroup viewGroup;
        if (this.v) {
            return;
        }
        android.content.Context pcVar = this.k;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = pcVar.obtainStyledAttributes(defpackage.ef.j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new java.lang.IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            r(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            r(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            r(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            r(10);
        }
        this.A = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        V();
        this.l.getDecorView();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(pcVar);
        if (this.B) {
            viewGroup = this.z ? (android.view.ViewGroup) layoutInflaterFrom.inflate(2131623960, (android.view.ViewGroup) null) : (android.view.ViewGroup) layoutInflaterFrom.inflate(2131623959, (android.view.ViewGroup) null);
        } else if (this.A) {
            viewGroup = (android.view.ViewGroup) layoutInflaterFrom.inflate(2131623950, (android.view.ViewGroup) null);
            this.y = false;
            this.x = false;
        } else if (this.x) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            pcVar.getTheme().resolveAttribute(2130968588, typedValue, true);
            if (typedValue.resourceId != 0) {
                pcVar = new defpackage.pc(pcVar, typedValue.resourceId);
            }
            viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(pcVar).inflate(2131623961, (android.view.ViewGroup) null);
            iq iqVarFindViewById = viewGroup.findViewById(2131427923);
            this.p = iqVarFindViewById;
            iqVarFindViewById.n(x());
            if (this.y) {
                this.p.c(109);
            }
            if (this.R) {
                this.p.c(2);
            }
            if (this.S) {
                this.p.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.x + ", windowActionBarOverlay: " + this.y + ", android:windowIsFloating: " + this.A + ", windowActionModeOverlay: " + this.z + ", windowNoTitle: " + this.B + " }");
        }
        defpackage.dd ddVar = new defpackage.dd(this);
        int i2 = defpackage.dzs.a;
        defpackage.dzk.o(viewGroup, ddVar);
        if (this.p == null) {
            this.Q = (android.widget.TextView) viewGroup.findViewById(2131429285);
        }
        try {
            java.lang.reflect.Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        android.support.v7.widget.ContentFrameLayout contentFrameLayout = (android.support.v7.widget.ContentFrameLayout) viewGroup.findViewById(2131427399);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.l.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                android.view.View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            if (viewGroup2 instanceof android.widget.FrameLayout) {
                ((android.widget.FrameLayout) viewGroup2).setForeground(null);
            }
        }
        if (contentFrameLayout != null) {
            contentFrameLayout.setId(android.R.id.content);
        }
        this.l.setContentView(viewGroup);
        if (contentFrameLayout != null) {
            contentFrameLayout.i = new defpackage.apnt(this, (byte[]) null);
        }
        this.w = viewGroup;
        java.lang.CharSequence charSequenceZ = z();
        if (!android.text.TextUtils.isEmpty(charSequenceZ)) {
            iq iqVar = this.p;
            if (iqVar != null) {
                iqVar.o(charSequenceZ);
            } else {
                cp cpVar = this.n;
                if (cpVar != null) {
                    cpVar.k(charSequenceZ);
                } else {
                    android.widget.TextView textView = this.Q;
                    if (textView != null) {
                        textView.setText(charSequenceZ);
                    }
                }
            }
        }
        android.support.v7.widget.ContentFrameLayout contentFrameLayout2 = (android.support.v7.widget.ContentFrameLayout) this.w.findViewById(android.R.id.content);
        if (contentFrameLayout2 != null) {
            android.view.View decorView = this.l.getDecorView();
            contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (contentFrameLayout2.isLaidOut()) {
                contentFrameLayout2.requestLayout();
            }
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = this.k.obtainStyledAttributes(defpackage.ef.j);
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new android.util.TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
            if (contentFrameLayout2.c == null) {
                contentFrameLayout2.c = new android.util.TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
            if (typedArrayObtainStyledAttributes2.hasValue(122)) {
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new android.util.TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(123)) {
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new android.util.TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(120)) {
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new android.util.TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(121)) {
                if (contentFrameLayout2.g == null) {
                    contentFrameLayout2.g = new android.util.TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
            }
            typedArrayObtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
        }
        this.v = true;
        defpackage.C0000do c0000doP = P(0);
        if (this.E || c0000doP.h != null) {
            return;
        }
        W(108);
    }

    public final void G() {
        F();
        if (this.x && this.n == null) {
            java.lang.Object obj = this.j;
            if (obj instanceof android.app.Activity) {
                this.n = new ee((android.app.Activity) obj, this.y);
            } else if (obj instanceof android.app.Dialog) {
                this.n = new ee((android.app.Dialog) obj);
            }
            cp cpVar = this.n;
            if (cpVar != null) {
                cpVar.g(this.ad);
            }
        }
    }

    @Override // defpackage.fr
    public final void H(defpackage.ft ftVar) {
        iq iqVar = this.p;
        if (iqVar == null || !iqVar.p() || (android.view.ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.p.r())) {
            defpackage.C0000do c0000doP = P(0);
            c0000doP.n = true;
            C(c0000doP, false);
            X(c0000doP, null);
            return;
        }
        android.view.Window.Callback callbackX = x();
        if (this.p.s()) {
            this.p.q();
            if (this.E) {
                return;
            }
            callbackX.onPanelClosed(108, P(0).h);
            return;
        }
        if (callbackX == null || this.E) {
            return;
        }
        if (this.H && (this.I & 1) != 0) {
            android.view.View decorView = this.l.getDecorView();
            java.lang.Runnable runnable = this.ac;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        defpackage.C0000do c0000doP2 = P(0);
        defpackage.ft ftVar2 = c0000doP2.h;
        if (ftVar2 == null || c0000doP2.o || !callbackX.onPreparePanel(0, c0000doP2.g, ftVar2)) {
            return;
        }
        callbackX.onMenuOpened(108, c0000doP2.h);
        this.p.u();
    }

    final void I() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            if (this.af == null || (!P(0).m && this.q == null)) {
                android.window.OnBackInvokedCallback onBackInvokedCallback = this.ag;
                if (onBackInvokedCallback != null) {
                    ae$.ExternalSyntheticApiModelOutline0.m(this.af, onBackInvokedCallback);
                    this.ag = null;
                    return;
                }
                return;
            }
            if (this.ag == null) {
                android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.af;
                j$.util.Objects.requireNonNull(this);
                ls lsVar = new ls(this, 1);
                ae$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcher, 1000000, lsVar);
                this.ag = lsVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bc, code lost:
    
        if (M(r0, r7) != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean J(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq.J(android.view.KeyEvent):boolean");
    }

    public final boolean K() {
        boolean z = this.V;
        this.V = false;
        defpackage.C0000do c0000doP = P(0);
        if (!c0000doP.m) {
            ey eyVar = this.q;
            if (eyVar != null) {
                eyVar.f();
            } else {
                cp cpVarB = b();
                if (cpVarB == null || !cpVarB.m()) {
                    return false;
                }
            }
        } else if (!z) {
            C(c0000doP, true);
        }
        return true;
    }

    @Override // defpackage.fr
    public final boolean L(defpackage.ft ftVar, android.view.MenuItem menuItem) {
        defpackage.C0000do c0000doW;
        android.view.Window.Callback callbackX = x();
        if (callbackX == null || this.E || (c0000doW = w(ftVar.a())) == null) {
            return false;
        }
        return callbackX.onMenuItemSelected(c0000doW.a, menuItem);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:81:0x012b  */
    public final boolean M(defpackage.C0000do c0000do, android.view.KeyEvent keyEvent) {
        android.content.res.Resources.Theme themeNewTheme;
        iq iqVar;
        iq iqVar2;
        android.os.Bundle bundle;
        int deviceId;
        boolean z;
        iq iqVar3;
        iq iqVar4;
        if (this.E) {
            return false;
        }
        if (!c0000do.k) {
            defpackage.C0000do c0000do2 = this.C;
            if (c0000do2 != null && c0000do2 != c0000do) {
                C(c0000do2, false);
            }
            android.view.Window.Callback callbackX = x();
            if (callbackX != null) {
                c0000do.g = callbackX.onCreatePanelView(c0000do.a);
            }
            int i2 = c0000do.a;
            boolean z2 = i2 == 0 || i2 == 108;
            if (z2 && (iqVar4 = this.p) != null) {
                iqVar4.m();
            }
            if (c0000do.g == null && (!z2 || !(this.n instanceof dy))) {
                if (c0000do.h != null) {
                    if (c0000do.o) {
                    }
                    c0000do.h.u();
                    bundle = c0000do.p;
                    if (bundle != null) {
                        c0000do.h.p(bundle);
                        c0000do.p = null;
                    }
                    if (!callbackX.onPreparePanel(0, c0000do.g, c0000do.h)) {
                        if (z2 && (iqVar3 = this.p) != null) {
                            iqVar3.l((android.view.Menu) null, this.ah);
                        }
                        c0000do.h.t();
                        return false;
                    }
                    if (keyEvent != null) {
                        deviceId = keyEvent.getDeviceId();
                    } else {
                        deviceId = -1;
                    }
                    if (android.view.KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0000do.h.setQwertyMode(z);
                    c0000do.h.t();
                } else {
                    android.content.Context context = this.k;
                    if ((i2 == 0 || i2 == 108) && this.p != null) {
                        android.util.TypedValue typedValue = new android.util.TypedValue();
                        android.content.res.Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(2130968588, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(2130968589, typedValue, true);
                        } else {
                            theme.resolveAttribute(2130968589, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            defpackage.pc pcVar = new defpackage.pc(context, 0);
                            pcVar.getTheme().setTo(themeNewTheme);
                            context = pcVar;
                        }
                    }
                    defpackage.ft ftVar = new defpackage.ft(context);
                    ftVar.b = this;
                    c0000do.a(ftVar);
                    if (c0000do.h == null) {
                        return false;
                    }
                }
                if (z2 && (iqVar2 = this.p) != null) {
                    if (this.ah == null) {
                        this.ah = new dp(this, 1);
                    }
                    iqVar2.l(c0000do.h, this.ah);
                }
                c0000do.h.u();
                if (!callbackX.onCreatePanelMenu(i2, c0000do.h)) {
                    c0000do.a(null);
                    if (!z2 || (iqVar = this.p) == null) {
                        return false;
                    }
                    iqVar.l((android.view.Menu) null, this.ah);
                    return false;
                }
                c0000do.o = false;
                c0000do.h.u();
                bundle = c0000do.p;
                if (bundle != null) {
                    c0000do.h.p(bundle);
                    c0000do.p = null;
                }
                if (!callbackX.onPreparePanel(0, c0000do.g, c0000do.h)) {
                    if (z2) {
                        iqVar3.l((android.view.Menu) null, this.ah);
                    }
                    c0000do.h.t();
                    return false;
                }
                if (keyEvent != null) {
                    deviceId = keyEvent.getDeviceId();
                } else {
                    deviceId = -1;
                }
                if (android.view.KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                    z = true;
                } else {
                    z = false;
                }
                c0000do.h.setQwertyMode(z);
                c0000do.h.t();
            }
            c0000do.k = true;
            c0000do.l = false;
            this.C = c0000do;
        }
        return true;
    }

    public final boolean N() {
        android.view.ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && viewGroup.isLaidOut();
    }

    public final android.view.View O(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        hj hwVar;
        android.support.v7.app.AppCompatViewInflater appCompatViewInflater = this.ae;
        hj hjVar = null;
        if (appCompatViewInflater == null) {
            android.content.Context context2 = this.k;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(defpackage.ef.j);
            java.lang.String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                appCompatViewInflater = new android.support.v7.app.AppCompatViewInflater();
                this.ae = appCompatViewInflater;
            } else {
                try {
                    appCompatViewInflater = (android.support.v7.app.AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.ae = appCompatViewInflater;
                } catch (java.lang.Throwable th) {
                    android.util.Log.i("AppCompatDelegate", defpackage.a.bk(string, "Failed to instantiate custom view inflater ", ". Falling back to default."), th);
                    appCompatViewInflater = new android.support.v7.app.AppCompatViewInflater();
                    this.ae = appCompatViewInflater;
                }
            }
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.ef.z, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            android.util.Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        android.content.Context pcVar = (resourceId == 0 || ((context instanceof defpackage.pc) && ((defpackage.pc) context).a == resourceId)) ? context : new defpackage.pc(context, resourceId);
        switch (str) {
            case "RatingBar":
                hwVar = new hw(pcVar, attributeSet);
                break;
            case "CheckedTextView":
                hwVar = new hl(pcVar, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                hwVar = new hs(pcVar, attributeSet);
                break;
            case "TextView":
                hwVar = appCompatViewInflater.e(pcVar, attributeSet);
                break;
            case "ImageButton":
                hwVar = new defpackage.hr(pcVar, attributeSet);
                break;
            case "SeekBar":
                hwVar = new hx(pcVar, attributeSet);
                break;
            case "Spinner":
                hwVar = new ie(pcVar, attributeSet);
                break;
            case "RadioButton":
                hwVar = appCompatViewInflater.d(pcVar, attributeSet);
                break;
            case "ToggleButton":
                hwVar = new in(pcVar, attributeSet);
                break;
            case "ImageView":
                hwVar = new android.support.v7.widget.AppCompatImageView(pcVar, attributeSet);
                break;
            case "AutoCompleteTextView":
                hwVar = appCompatViewInflater.a(pcVar, attributeSet);
                break;
            case "CheckBox":
                hwVar = appCompatViewInflater.c(pcVar, attributeSet);
                break;
            case "EditText":
                hwVar = new defpackage.hq(pcVar, attributeSet);
                break;
            case "Button":
                hwVar = appCompatViewInflater.b(pcVar, attributeSet);
                break;
            default:
                hwVar = null;
                break;
        }
        if (hwVar == null && context != pcVar) {
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                java.lang.Object[] objArr = appCompatViewInflater.c;
                objArr[0] = pcVar;
                objArr[1] = attributeSet;
                if (str.indexOf(46) == -1) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < 3) {
                            hj hjVarF = appCompatViewInflater.f(pcVar, str, android.support.v7.app.AppCompatViewInflater.b[i2]);
                            if (hjVarF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                hjVar = hjVarF;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    hj hjVarF2 = appCompatViewInflater.f(pcVar, str, null);
                    java.lang.Object[] objArr2 = appCompatViewInflater.c;
                    objArr2[0] = null;
                    objArr2[1] = null;
                    hjVar = hjVarF2;
                }
            } catch (java.lang.Exception unused) {
                java.lang.Object[] objArr3 = appCompatViewInflater.c;
                objArr3[0] = hjVar;
                objArr3[1] = hjVar;
            } catch (java.lang.Throwable th2) {
                java.lang.Object[] objArr4 = appCompatViewInflater.c;
                objArr4[0] = hjVar;
                objArr4[1] = hjVar;
                throw th2;
            }
            hwVar = hjVar;
        }
        if (hwVar != null) {
            android.content.Context context3 = hwVar.getContext();
            if ((context3 instanceof android.content.ContextWrapper) && hwVar.hasOnClickListeners()) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, android.support.v7.app.AppCompatViewInflater.a);
                java.lang.String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    hwVar.setOnClickListener(new du(hwVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
        }
        return hwVar;
    }

    public final defpackage.C0000do P(int i2) {
        defpackage.C0000do[] c0000doArr = this.U;
        if (c0000doArr == null || c0000doArr.length <= i2) {
            defpackage.C0000do[] c0000doArr2 = new defpackage.C0000do[i2 + 1];
            if (c0000doArr != null) {
                java.lang.System.arraycopy(c0000doArr, 0, c0000doArr2, 0, c0000doArr.length);
            }
            this.U = c0000doArr2;
            c0000doArr = c0000doArr2;
        }
        defpackage.C0000do c0000do = c0000doArr[i2];
        if (c0000do != null) {
            return c0000do;
        }
        defpackage.C0000do c0000do2 = new defpackage.C0000do(i2);
        c0000doArr[i2] = c0000do2;
        return c0000do2;
    }

    public final boolean Q(defpackage.C0000do c0000do, int i2, android.view.KeyEvent keyEvent) {
        defpackage.ft ftVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0000do.k || M(c0000do, keyEvent)) && (ftVar = c0000do.h) != null) {
            return ftVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:81:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:86:0x0180  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void R(boolean z, boolean z2) {
        int i2;
        java.lang.Object obj;
        if (this.E) {
            return;
        }
        int iS = s();
        android.content.Context context = this.k;
        int iT = t(context, iS);
        defpackage.dxe dxeVarY = android.os.Build.VERSION.SDK_INT < 33 ? y(context) : null;
        if (!z2 && dxeVarY != null) {
            dxeVarY = defpackage.dxe.c(aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(context.getResources().getConfiguration())));
        }
        defpackage.dxe dxeVar = dxeVarY;
        android.content.res.Configuration configurationV = v(context, iT, dxeVar, null, false);
        boolean z3 = false;
        if (this.Z) {
            this.Z = true;
            i2 = this.Y;
        } else {
            java.lang.Object obj2 = this.j;
            if (obj2 instanceof android.app.Activity) {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    i2 = 0;
                } else {
                    try {
                        android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(new android.content.ComponentName(context, obj2.getClass()), 269221888);
                        if (activityInfo != null) {
                            this.Y = activityInfo.configChanges;
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                        android.util.Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                        this.Y = 0;
                    }
                    this.Z = true;
                    i2 = this.Y;
                }
            } else {
                this.Z = true;
                i2 = this.Y;
            }
        }
        android.content.res.Configuration configuration = this.F;
        if (configuration == null) {
            configuration = this.k.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = configurationV.uiMode & 48;
        defpackage.dxe dxeVarC = defpackage.dxe.c(aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(configuration)));
        defpackage.dxe dxeVarC2 = dxeVar == null ? null : defpackage.dxe.c(aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(configurationV)));
        int i5 = i3 != i4 ? 512 : 0;
        if (dxeVarC2 != null && !dxeVarC.equals(dxeVarC2)) {
            i5 |= 8196;
        }
        if (((~i2) & i5) != 0 && z && this.D && (i || this.W)) {
            java.lang.Object obj3 = this.j;
            if (obj3 instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) obj3;
                if (!activity.isChild()) {
                    if (android.os.Build.VERSION.SDK_INT >= 31 && (i5 & 8192) != 0) {
                        activity.getWindow().getDecorView().setLayoutDirection(configurationV.getLayoutDirection());
                    }
                    activity.recreate();
                    z3 = true;
                }
            }
        }
        if (z3) {
            obj = this.j;
            if (obj instanceof defpackage.da) {
                if ((i5 & 512) != 0) {
                    ((defpackage.da) obj).n();
                }
                if ((i5 & 4) != 0) {
                    ((defpackage.da) obj).m();
                }
            }
        } else if (i5 != 0) {
            int i6 = i2 & i5;
            android.content.Context context2 = this.k;
            android.content.res.Resources resources = context2.getResources();
            android.content.res.Configuration configuration2 = new android.content.res.Configuration(resources.getConfiguration());
            configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & (-49));
            if (dxeVarC2 != null) {
                defpackage.den.bP(configuration2, dxeVarC2);
            }
            resources.updateConfiguration(configuration2, null);
            int i7 = this.G;
            if (i7 != 0) {
                context2.setTheme(i7);
                context2.getTheme().applyStyle(this.G, true);
            }
            if (i6 == i5) {
                java.lang.Object obj4 = this.j;
                if (obj4 instanceof android.app.Activity) {
                    android.app.Activity activity2 = (android.app.Activity) obj4;
                    if (activity2 instanceof defpackage.emx) {
                        if (((defpackage.emx) activity2).P().a().a(defpackage.emq.c)) {
                            activity2.onConfigurationChanged(configuration2);
                            this.l.getDecorView().dispatchConfigurationChanged(configuration2);
                        }
                    } else if (this.W && !this.E) {
                        activity2.onConfigurationChanged(configuration2);
                        this.l.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                }
            }
            obj = this.j;
            if (obj instanceof defpackage.da) {
                if ((i5 & 512) != 0) {
                    ((defpackage.da) obj).n();
                }
                if ((i5 & 4) != 0) {
                    ((defpackage.da) obj).m();
                }
            }
        }
        if (dxeVarC2 != null) {
            aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(defpackage.dxe.c(aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(this.k.getResources().getConfiguration()))).e()));
        }
        if (iS == 0) {
            T(this.k).d();
        } else {
            dl dlVar = this.aa;
            if (dlVar != null) {
                dlVar.c();
            }
            if (iS == 3) {
                S(this.k).d();
                return;
            }
        }
        dl dlVar2 = this.ab;
        if (dlVar2 != null) {
            dlVar2.c();
        }
    }

    @Override // defpackage.dc
    public final android.content.Context a() {
        return this.k;
    }

    @Override // defpackage.dc
    public final cp b() {
        G();
        return this.n;
    }

    @Override // defpackage.dc
    public final android.view.View c(int i2) {
        F();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.dc
    public final void d(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        F();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.w.findViewById(android.R.id.content);
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.dc
    public final void e() {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof defpackage.dq) {
                return;
            }
            android.util.Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.dc
    public final void f() {
        if (this.n == null || b().n()) {
            return;
        }
        W(0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    @Override // defpackage.dc
    public final void g() {
        if (this.j instanceof android.app.Activity) {
            synchronized (defpackage.dc.g) {
                defpackage.dc.i(this);
            }
        }
        if (this.H) {
            this.l.getDecorView().removeCallbacks(this.ac);
        }
        this.E = true;
        if (this.X != -100) {
            java.lang.Object obj = this.j;
            if ((obj instanceof android.app.Activity) && ((android.app.Activity) obj).isChangingConfigurations()) {
                M.put(obj.getClass().getName(), java.lang.Integer.valueOf(this.X));
            } else {
                M.remove(this.j.getClass().getName());
            }
        } else {
            M.remove(this.j.getClass().getName());
        }
        cp cpVar = this.n;
        if (cpVar != null) {
            cpVar.f();
        }
        dl dlVar = this.aa;
        if (dlVar != null) {
            dlVar.c();
        }
        dl dlVar2 = this.ab;
        if (dlVar2 != null) {
            dlVar2.c();
        }
    }

    @Override // defpackage.dc
    public final void h() {
        cp cpVarB = b();
        if (cpVarB != null) {
            cpVarB.h(false);
        }
    }

    @Override // defpackage.dc
    public final void j(int i2) {
        F();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.w.findViewById(android.R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            android.view.LayoutInflater.from(this.k).inflate(i2, viewGroup);
        }
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.dc
    public final void k(android.view.View view) {
        F();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.w.findViewById(android.R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.dc
    public final void l(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        F();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.w.findViewById(android.R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(view, layoutParams);
        }
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.dc
    public final void n(java.lang.CharSequence charSequence) {
        this.O = charSequence;
        iq iqVar = this.p;
        if (iqVar != null) {
            iqVar.o(charSequence);
            return;
        }
        cp cpVar = this.n;
        if (cpVar != null) {
            cpVar.k(charSequence);
            return;
        }
        android.widget.TextView textView = this.Q;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return O(str, context, attributeSet);
    }

    @Override // defpackage.dc
    public final void p() {
        R(true, true);
    }

    @Override // defpackage.dc
    public final void q() {
        java.lang.String strL;
        this.D = true;
        R(false, true);
        V();
        java.lang.Object obj = this.j;
        if (obj instanceof android.app.Activity) {
            try {
                android.app.Activity activity = (android.app.Activity) obj;
                try {
                    strL = defpackage.dff.l(activity, activity.getComponentName());
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new java.lang.IllegalArgumentException(e);
                }
            } catch (java.lang.IllegalArgumentException unused) {
                strL = null;
            }
            if (strL != null) {
                cp cpVar = this.n;
                if (cpVar == null) {
                    this.ad = true;
                } else {
                    cpVar.g(true);
                }
            }
            synchronized (defpackage.dc.g) {
                defpackage.dc.i(this);
                defpackage.dc.f.add(new java.lang.ref.WeakReference(this));
            }
        }
        this.F = new android.content.res.Configuration(this.k.getResources().getConfiguration());
        this.W = true;
    }

    @Override // defpackage.dc
    public final void r(int i2) {
        if (i2 == 8) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.B && i2 == 108) {
            return;
        }
        if (this.x && i2 == 1) {
            this.x = false;
        }
        if (i2 == 1) {
            Y();
            this.B = true;
            return;
        }
        if (i2 == 2) {
            Y();
            this.R = true;
            return;
        }
        if (i2 == 5) {
            Y();
            this.S = true;
            return;
        }
        if (i2 == 10) {
            Y();
            this.z = true;
        } else if (i2 == 108) {
            Y();
            this.x = true;
        } else if (i2 != 109) {
            this.l.requestFeature(i2);
        } else {
            Y();
            this.y = true;
        }
    }

    public final int s() {
        int i2 = this.X;
        return i2 == -100 ? defpackage.dc.b : i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (S(r21).a.isPowerSaveMode() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
    
        if (r0 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0135, code lost:
    
        if (r0 < 22) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0137, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int t(android.content.Context r21, int r22) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq.t(android.content.Context, int):int");
    }

    final android.content.Context u() {
        cp cpVarB = b();
        android.content.Context contextB = cpVarB != null ? cpVarB.b() : null;
        return contextB == null ? this.k : contextB;
    }

    public final android.content.res.Configuration v(android.content.Context context, int i2, defpackage.dxe dxeVar, android.content.res.Configuration configuration, boolean z) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 != 2) {
            i3 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i3 = 32;
        }
        android.content.res.Configuration configuration2 = new android.content.res.Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (dxeVar != null) {
            defpackage.den.bP(configuration2, dxeVar);
        }
        return configuration2;
    }

    final defpackage.C0000do w(android.view.Menu menu) {
        defpackage.C0000do[] c0000doArr = this.U;
        int length = c0000doArr != null ? c0000doArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            defpackage.C0000do c0000do = c0000doArr[i2];
            if (c0000do != null && c0000do.h == menu) {
                return c0000do;
            }
        }
        return null;
    }

    final android.view.Window.Callback x() {
        return this.l.getCallback();
    }

    final defpackage.dxe y(android.content.Context context) {
        defpackage.dxe dxeVar;
        defpackage.dxe dxeVarB;
        if (android.os.Build.VERSION.SDK_INT >= 33 || (dxeVar = defpackage.dc.c) == null) {
            return null;
        }
        defpackage.dxe dxeVarC = defpackage.dxe.c(aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(context.getApplicationContext().getResources().getConfiguration())));
        if (dxeVar.g()) {
            dxeVarB = defpackage.dxe.a;
        } else {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int i2 = 0;
            while (i2 < dxeVar.a() + dxeVarC.a()) {
                java.util.Locale localeF = i2 < dxeVar.a() ? dxeVar.f(i2) : dxeVarC.f(i2 - dxeVar.a());
                if (localeF != null) {
                    linkedHashSet.add(localeF);
                }
                i2++;
            }
            dxeVarB = defpackage.dxe.b((java.util.Locale[]) linkedHashSet.toArray(new java.util.Locale[linkedHashSet.size()]));
        }
        return !dxeVarB.g() ? dxeVarB : dxeVarC;
    }

    final java.lang.CharSequence z() {
        java.lang.Object obj = this.j;
        return obj instanceof android.app.Activity ? ((android.app.Activity) obj).getTitle() : this.O;
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return O(str, context, attributeSet);
    }
}
