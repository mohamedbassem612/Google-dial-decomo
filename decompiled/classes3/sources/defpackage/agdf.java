package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agdf extends android.widget.LinearLayout {
    public final com.google.android.material.textfield.TextInputLayout a;
    public final com.google.android.material.internal.CheckableImageButton b;
    public android.content.res.ColorStateList c;
    public final com.google.android.material.internal.CheckableImageButton d;
    public int e;
    public android.content.res.ColorStateList f;
    public android.graphics.PorterDuff.Mode g;
    public java.lang.CharSequence h;
    public final android.widget.TextView i;
    public android.widget.EditText j;
    public final android.text.TextWatcher k;
    private final android.widget.FrameLayout l;
    private android.graphics.PorterDuff.Mode m;
    private final defpackage.agde n;
    private final java.util.LinkedHashSet o;
    private int p;
    private boolean q;
    private final android.view.accessibility.AccessibilityManager r;
    private android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener s;
    private final defpackage.aprf t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public agdf(com.google.android.material.textfield.TextInputLayout textInputLayout, ajxw ajxwVar) {
        super(textInputLayout.getContext());
        int i = 0;
        this.e = 0;
        this.o = new java.util.LinkedHashSet();
        this.k = new defpackage.agdd(this);
        defpackage.aprf aprfVar = new defpackage.aprf(this);
        this.t = aprfVar;
        this.r = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1, 8388613));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        ?? U = u(this, layoutInflaterFrom, 2131429248);
        this.b = U;
        ?? U2 = u(frameLayout, layoutInflaterFrom, 2131429247);
        this.d = U2;
        this.n = new defpackage.agde(this, ajxwVar);
        android.support.v7.widget.AppCompatTextView appCompatTextView = new android.support.v7.widget.AppCompatTextView(getContext());
        this.i = appCompatTextView;
        int[] iArr = defpackage.agdn.a;
        if (ajxwVar.z(38)) {
            this.c = agab.av(getContext(), ajxwVar, 38);
        }
        if (ajxwVar.z(39)) {
            this.m = a.q(ajxwVar.o(39, -1), (android.graphics.PorterDuff.Mode) null);
        }
        if (ajxwVar.z(37)) {
            n(ajxwVar.t(37));
        }
        U.setContentDescription(getResources().getText(2132018549));
        U.setImportantForAccessibility(2);
        U.setClickable(false);
        U.c = false;
        U.a(false);
        U.setFocusable(false);
        if (!ajxwVar.z(54)) {
            if (ajxwVar.z(32)) {
                this.f = agab.av(getContext(), ajxwVar, 32);
            }
            if (ajxwVar.z(33)) {
                this.g = a.q(ajxwVar.o(33, -1), (android.graphics.PorterDuff.Mode) null);
            }
        }
        int i2 = 1;
        if (ajxwVar.z(30)) {
            l(ajxwVar.o(30, 0));
            if (ajxwVar.z(27)) {
                k(ajxwVar.v(27));
            }
            j(ajxwVar.y(26, true));
        } else if (ajxwVar.z(54)) {
            if (ajxwVar.z(55)) {
                this.f = agab.av(getContext(), ajxwVar, 55);
            }
            if (ajxwVar.z(56)) {
                this.g = a.q(ajxwVar.o(56, -1), (android.graphics.PorterDuff.Mode) null);
            }
            l(ajxwVar.y(54, false) ? 1 : 0);
            k(ajxwVar.v(52));
        }
        int iN = ajxwVar.n(29, getResources().getDimensionPixelSize(2131167139));
        if (iN < 0) {
            throw new java.lang.IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iN != this.p) {
            this.p = iN;
            afsq.z((com.google.android.material.internal.CheckableImageButton) U2, iN);
            afsq.z((com.google.android.material.internal.CheckableImageButton) U, iN);
        }
        if (ajxwVar.z(31)) {
            android.widget.ImageView.ScaleType scaleTypeW = afsq.w(ajxwVar.o(31, -1));
            U2.setScaleType(scaleTypeW);
            U.setScaleType(scaleTypeW);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(2131429258);
        appCompatTextView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(ajxwVar.r(73, 0));
        if (ajxwVar.z(74)) {
            appCompatTextView.setTextColor(ajxwVar.s(74));
        }
        java.lang.CharSequence charSequenceV = ajxwVar.v(72);
        this.h = true != android.text.TextUtils.isEmpty(charSequenceV) ? charSequenceV : null;
        appCompatTextView.setText(charSequenceV);
        w();
        frameLayout.addView(U2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(U);
        U.d = new defpackage.agdc(this, i2);
        U2.d = new defpackage.agdc(this, i);
        textInputLayout.n.add(aprfVar);
        if (textInputLayout.c != null) {
            aprfVar.k(textInputLayout);
        }
        addOnAttachStateChangeListener(new gk(this, 5));
    }

    private final com.google.android.material.internal.CheckableImageButton u(android.view.ViewGroup viewGroup, android.view.LayoutInflater layoutInflater, int i) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) layoutInflater.inflate(2131624139, viewGroup, false);
        checkableImageButton.setId(i);
        if (agab.q(getContext())) {
            ((android.view.ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void v() {
        int i = 0;
        this.l.setVisibility((this.d.getVisibility() != 0 || t()) ? 8 : 0);
        char c = (this.h == null || this.q) ? '\b' : (char) 0;
        if (!s() && !t() && c != 0) {
            i = 8;
        }
        setVisibility(i);
    }

    private final void w() {
        android.widget.TextView textView = this.i;
        int visibility = textView.getVisibility();
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            c().h(i == 0);
        }
        v();
        textView.setVisibility(i);
        this.a.C();
    }

    public final int a() {
        int marginStart;
        if (s() || t()) {
            com.google.android.material.internal.CheckableImageButton checkableImageButton = this.d;
            marginStart = ((android.view.ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final android.graphics.drawable.Drawable b() {
        return this.d.getDrawable();
    }

    public final defpackage.agdg c() {
        int i = this.e;
        defpackage.agde agdeVar = this.n;
        android.util.SparseArray sparseArray = agdeVar.a;
        defpackage.agdg agctVar = (defpackage.agdg) sparseArray.get(i);
        if (agctVar == null) {
            if (i == -1) {
                agctVar = new defpackage.agct(agdeVar.b);
            } else if (i == 0) {
                agctVar = new defpackage.agdg(agdeVar.b);
            } else if (i == 1) {
                agctVar = new defpackage.agdm(agdeVar.b, agdeVar.d);
            } else if (i == 2) {
                agctVar = new defpackage.agcs(agdeVar.b);
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalArgumentException(a.bj(i, "Invalid end icon mode: "));
                }
                agctVar = new defpackage.agdb(agdeVar.b);
            }
            sparseArray.append(i, agctVar);
        }
        return agctVar;
    }

    final java.lang.CharSequence d() {
        return this.d.getContentDescription();
    }

    public final void e() {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        if (this.s == null || (accessibilityManager = this.r) == null || !isAttachedToWindow()) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(this.s);
    }

    public final void f(boolean z) {
        this.q = z;
        w();
    }

    public final void g() {
        afsq.y(this.a, this.d, this.f);
    }

    final void h(boolean z) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton;
        boolean zIsActivated;
        com.google.android.material.internal.CheckableImageButton checkableImageButton2;
        boolean z2;
        defpackage.agdg agdgVarC = c();
        boolean z3 = false;
        boolean z4 = true;
        if (agdgVarC.s() && (z2 = (checkableImageButton2 = this.d).a) != agdgVarC.t()) {
            checkableImageButton2.setChecked(!z2);
            z3 = true;
        }
        if (!agdgVarC.q() || (zIsActivated = (checkableImageButton = this.d).isActivated()) == agdgVarC.r()) {
            z4 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            g();
        }
    }

    public final void i() {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.r) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    final void j(boolean z) {
        this.d.a(z);
    }

    final void k(java.lang.CharSequence charSequence) {
        if (d() != charSequence) {
            com.google.android.material.internal.CheckableImageButton checkableImageButton = this.d;
            checkableImageButton.setContentDescription(charSequence);
            afsq.C(checkableImageButton, charSequence);
        }
    }

    final void l(int i) {
        if (this.e != i) {
            defpackage.agdg agdgVarC = c();
            i();
            this.s = null;
            agdgVarC.j();
            this.e = i;
            java.util.Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((defpackage.agdt) it.next()).a();
            }
            m(i != 0);
            defpackage.agdg agdgVarC2 = c();
            int iB = this.n.c;
            if (iB == 0) {
                iB = agdgVarC2.b();
            }
            android.graphics.drawable.Drawable drawableBO = iB != 0 ? den.bO(getContext(), iB) : null;
            com.google.android.material.internal.CheckableImageButton checkableImageButton = this.d;
            checkableImageButton.setImageDrawable(drawableBO);
            if (drawableBO != null) {
                afsq.x(this.a, checkableImageButton, this.f, this.g);
                g();
            }
            j(agdgVarC2.s());
            com.google.android.material.textfield.TextInputLayout textInputLayout = this.a;
            int i2 = textInputLayout.m;
            if (!agdgVarC2.o(i2)) {
                throw new java.lang.IllegalStateException(a.bf(i, i2, "The current box background mode ", " is not supported by the end icon mode "));
            }
            agdgVarC2.i();
            this.s = agdgVarC2.A();
            e();
            afsq.A(checkableImageButton, agdgVarC2.c());
            int iA = agdgVarC2.a();
            k(iA != 0 ? getResources().getText(iA) : null);
            android.widget.EditText editText = this.j;
            if (editText != null) {
                agdgVarC2.g(editText);
                o(agdgVarC2);
            }
            afsq.x(textInputLayout, checkableImageButton, this.f, this.g);
            h(true);
        }
    }

    public final void m(boolean z) {
        android.widget.EditText editText;
        if (s() != z) {
            if (!z && this.d.hasFocus() && (editText = this.j) != null) {
                editText.requestFocus();
            }
            this.d.setVisibility(true != z ? 8 : 0);
            v();
            q();
            this.a.C();
        }
    }

    final void n(android.graphics.drawable.Drawable drawable) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.b;
        checkableImageButton.setImageDrawable(drawable);
        p();
        afsq.x(this.a, checkableImageButton, this.c, this.m);
    }

    public final void o(defpackage.agdg agdgVar) {
        android.widget.EditText editText = this.j;
        if (editText != null) {
            if (agdgVar.d() != null) {
                editText.setOnFocusChangeListener(agdgVar.d());
            }
            if (agdgVar.e() != null) {
                this.d.setOnFocusChangeListener(agdgVar.e());
            }
        }
    }

    public final void p() {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.b;
        int i = 8;
        if (checkableImageButton.getDrawable() != null) {
            com.google.android.material.textfield.TextInputLayout textInputLayout = this.a;
            if (textInputLayout.d.g && textInputLayout.B()) {
                i = 0;
            }
        }
        checkableImageButton.setVisibility(i);
        v();
        q();
        if (r()) {
            return;
        }
        this.a.C();
    }

    public final void q() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.a;
        if (textInputLayout.c != null) {
            int paddingEnd = 0;
            if (!s() && !t()) {
                paddingEnd = textInputLayout.c.getPaddingEnd();
            }
            this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(2131166975), textInputLayout.c.getPaddingTop(), paddingEnd, textInputLayout.c.getPaddingBottom());
        }
    }

    public final boolean r() {
        return this.e != 0;
    }

    public final boolean s() {
        return this.l.getVisibility() == 0 && this.d.getVisibility() == 0;
    }

    public final boolean t() {
        return this.b.getVisibility() == 0;
    }
}
