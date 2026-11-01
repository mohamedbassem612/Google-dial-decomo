package com.google.android.material.search;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SearchView extends android.widget.FrameLayout implements dul, afvt {
    private final boolean A;
    private final boolean B;
    private java.util.Map C;
    private final android.view.ViewTreeObserver.OnTouchModeChangeListener D;
    private final aogc E;
    public final android.view.View a;
    public final com.google.android.material.internal.ClippableRoundedCornerLayout b;
    public final android.view.View c;
    public final android.view.View d;
    public final android.widget.FrameLayout e;
    public final android.widget.FrameLayout f;
    public final com.google.android.material.appbar.MaterialToolbar g;
    public final android.support.v7.widget.Toolbar h;
    public final android.widget.TextView i;
    public final android.widget.TextView j;
    public final android.widget.EditText k;
    public final android.widget.ImageButton l;
    public final android.view.View m;
    public final com.google.android.material.internal.TouchObserverFrameLayout n;
    public com.google.android.material.search.SearchBar o;
    public boolean p;
    public boolean q;
    public int r;
    private final boolean s;
    private final defpackage.afzu t;
    private final boolean u;
    private final afsr v;
    private final java.util.Set w;
    private int x;
    private boolean y;
    private final int z;

    /* JADX WARN: Type inference failed for: r9v6, types: [android.support.v7.widget.Toolbar, android.view.View, com.google.android.material.appbar.MaterialToolbar] */
    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132085950), attributeSet, i);
        this.E = new aogc(this);
        this.w = new java.util.LinkedHashSet();
        this.x = 16;
        this.r = 2;
        this.D = new defpackage.afzi(this);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, afzd.b, i, 2132085950, new int[0]);
        this.z = typedArrayA.getColor(11, 0);
        int resourceId = typedArrayA.getResourceId(18, -1);
        int resourceId2 = typedArrayA.getResourceId(0, -1);
        java.lang.String string = typedArrayA.getString(3);
        java.lang.String string2 = typedArrayA.getString(4);
        java.lang.String string3 = typedArrayA.getString(26);
        boolean z = typedArrayA.getBoolean(29, false);
        this.p = typedArrayA.getBoolean(8, true);
        this.q = typedArrayA.getBoolean(7, true);
        boolean z2 = typedArrayA.getBoolean(19, false);
        this.y = typedArrayA.getBoolean(9, true);
        this.u = typedArrayA.getBoolean(10, true);
        boolean z3 = typedArrayA.getBoolean(16, true);
        this.A = z3;
        boolean z4 = typedArrayA.getBoolean(14, false);
        this.B = z4;
        typedArrayA.recycle();
        android.view.LayoutInflater.from(context2).inflate(2131624332, this);
        this.s = true;
        this.a = findViewById(2131428636);
        com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = (com.google.android.material.internal.ClippableRoundedCornerLayout) findViewById(2131428635);
        this.b = clippableRoundedCornerLayout;
        this.c = findViewById(2131428627);
        android.view.View viewFindViewById = findViewById(2131428638);
        this.d = viewFindViewById;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(2131428634);
        this.e = frameLayout;
        this.f = (android.widget.FrameLayout) findViewById(2131428641);
        ?? r9 = (com.google.android.material.appbar.MaterialToolbar) findViewById(2131428640);
        this.g = r9;
        android.support.v7.widget.Toolbar toolbarFindViewById = findViewById(2131428632);
        this.h = toolbarFindViewById;
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428631);
        this.j = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(2131428637);
        this.i = textView2;
        android.widget.EditText editText = (android.widget.EditText) findViewById(2131428633);
        this.k = editText;
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(2131428628);
        this.l = imageButton;
        android.view.View viewFindViewById2 = findViewById(2131428630);
        this.m = viewFindViewById2;
        com.google.android.material.internal.TouchObserverFrameLayout touchObserverFrameLayout = (com.google.android.material.internal.TouchObserverFrameLayout) findViewById(2131428629);
        this.n = touchObserverFrameLayout;
        this.t = new defpackage.afzu(context2, this, z4);
        this.v = new afsr(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new defpackage.afmg(3));
        n();
        if (resourceId != -1) {
            frameLayout.addView(android.view.LayoutInflater.from(getContext()).inflate(resourceId, (android.view.ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
        textView2.setText(string3);
        textView2.setVisibility(true != android.text.TextUtils.isEmpty(string3) ? 0 : 8);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        editText.setOnFocusChangeListener(new defpackage.afzf());
        if (z2) {
            r9.t((android.graphics.drawable.Drawable) null);
        } else {
            r9.u(new defpackage.afrh(this, 2));
            if (z) {
                eh ehVar = new eh(getContext());
                ehVar.a(agab.X(this, 2130969053));
                r9.t(ehVar);
            }
        }
        imageButton.setOnClickListener(new defpackage.afrh(this, 3));
        editText.addTextChangedListener(new jul(this, 7));
        viewFindViewById2.setVisibility(true != z3 ? 8 : 0);
        touchObserverFrameLayout.a = new klw(this, 9);
        agab.J((android.view.View) r9, new afvo() { // from class: afzh
            /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, com.google.android.material.appbar.MaterialToolbar] */
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
            public final void a(android.view.View view, eax eaxVar, afvp afvpVar) {
                int i2;
                int i3;
                ?? r2 = this.a.g;
                if (agab.L((android.view.View) r2)) {
                    i2 = afvpVar.c;
                    i3 = afvpVar.a;
                } else {
                    i2 = afvpVar.a;
                    i3 = afvpVar.c;
                }
                dwn dwnVarF = eaxVar.f(647);
                r2.setPadding(i2 + dwnVarF.b, afvpVar.b, i3 + dwnVarF.d, afvpVar.d);
            }
        });
        final android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i2 = marginLayoutParams.leftMargin;
        final int i3 = marginLayoutParams.rightMargin;
        dyy dyyVar = new dyy() { // from class: afzg
            public final eax dC(android.view.View view, eax eaxVar) {
                dwn dwnVarF = eaxVar.f(647);
                int i4 = dwnVarF.b;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i2 + i4;
                marginLayoutParams2.rightMargin = i3 + dwnVarF.d;
                return eaxVar;
            }
        };
        int i4 = dzs.a;
        dzk.o(viewFindViewById2, dyyVar);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        f(identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0);
        dzk.o(viewFindViewById, new ebx(this, 12));
        r9.setTouchscreenBlocksFocus(false);
        if (z4) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) toolbarFindViewById.getLayoutParams();
            layoutParams.gravity = 8388611;
            toolbarFindViewById.setLayoutParams(layoutParams);
            toolbarFindViewById.setVisibility(4);
            if (resourceId2 != -1) {
                textView.setTextAppearance(resourceId2);
            }
            textView.setText(string);
            textView.setHint(string2);
        }
    }

    private final void n() {
        float dimension;
        com.google.android.material.search.SearchBar searchBar = this.o;
        if (searchBar != null) {
            agaf agafVar = searchBar.H;
            dimension = agafVar != null ? agafVar.z() : searchBar.getElevation();
        } else {
            dimension = getResources().getDimension(2131166826);
        }
        o(dimension);
    }

    private final void o(float f) {
        android.view.View view;
        afsr afsrVar = this.v;
        if (afsrVar == null || (view = this.c) == null) {
            return;
        }
        view.setBackgroundColor(afsrVar.b(this.z, f));
    }

    private final void p(android.view.ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.b.getId()) != null) {
                    p((android.view.ViewGroup) childAt, z);
                } else {
                    java.util.Map map = this.C;
                    if (z) {
                        map.put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((java.lang.Integer) this.C.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    private final void q() {
        android.widget.ImageButton imageButtonB = afvm.b(this.g);
        if (imageButtonB != null) {
            int i = this.b.getVisibility() == 0 ? 1 : 0;
            eh ehVarC = dzk.C(imageButtonB.getDrawable());
            if (ehVarC instanceof eh) {
                ehVarC.b(i);
            }
            if (ehVarC instanceof defpackage.afud) {
                ((defpackage.afud) ehVarC).a(i);
            }
        }
    }

    private final boolean r() {
        int i = this.r;
        if (i != 0) {
            return i == 2 || i == 1;
        }
        throw null;
    }

    private final void s(int i) {
        if (this.o == null || !this.u) {
            return;
        }
        if (i == 0) {
            throw null;
        }
        if (i == 4) {
            this.E.I(false);
        } else if (i == 2) {
            this.E.J();
        }
    }

    private final void t(int i) {
        if (i == 4) {
            e(true);
        } else if (i == 2) {
            e(false);
        }
    }

    public final dum a() {
        return new com.google.android.material.search.SearchView.Behavior();
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.s) {
            this.n.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public final void b() {
        int i = this.r;
        if (i == 0) {
            throw null;
        }
        if (i == 2 || i == 1) {
            return;
        }
        com.google.android.material.search.SearchBar searchBar = this.o;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            this.t.h();
            return;
        }
        if (!this.B) {
            this.o.I(this.k.getText().toString());
        }
        com.google.android.material.search.SearchBar searchBar2 = this.o;
        defpackage.afzu afzuVar = this.t;
        j$.util.Objects.requireNonNull(afzuVar);
        searchBar2.post(new defpackage.aflt(afzuVar, 7));
    }

    public final void c() {
        this.k.postDelayed(new defpackage.aflt(this, 8), 100L);
    }

    public final void d() {
        if (this.y) {
            c();
        } else {
            if (isInTouchMode()) {
                return;
            }
            this.k.postDelayed(new defpackage.aflt(this, 10), 100L);
        }
    }

    public final void e(boolean z) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView();
        if (z) {
            this.C = new java.util.HashMap(viewGroup.getChildCount());
        }
        p(viewGroup, z);
        if (z) {
            return;
        }
        this.C = null;
    }

    public final void f(int i) {
        android.view.View view = this.d;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    public final void g(boolean z) {
        com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(true != z ? 8 : 0);
        q();
        m(2 << (z ? 1 : 0), z2 != z);
    }

    public final void h(com.google.android.material.search.SearchBar searchBar) {
        this.o = searchBar;
        this.t.q = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new defpackage.afrh(this, 4));
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new defpackage.aflt(this, 9));
                    rp$.ExternalSyntheticApiModelOutline0.m(this.k, true);
                } catch (java.lang.LinkageError unused) {
                }
            }
        }
        com.google.android.material.appbar.MaterialToolbar materialToolbar = this.g;
        if (materialToolbar != null && !(dzk.C(materialToolbar.e()) instanceof eh)) {
            if (this.o == null) {
                materialToolbar.s(2131231683);
            } else {
                android.graphics.drawable.Drawable drawableMutate = den.bO(getContext(), 2131231683).mutate();
                java.lang.Integer num = materialToolbar.B;
                if (num != null) {
                    drawableMutate.setTint(num.intValue());
                }
                drawableMutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.t(new defpackage.afud(this.o.e(), drawableMutate));
                q();
            }
        }
        n();
        s(this.r);
    }

    public final void i() {
        int i = this.r;
        if (i == 0) {
            throw null;
        }
        if (i == 4 || i == 3) {
            return;
        }
        defpackage.afzu afzuVar = this.t;
        afzuVar.j();
        if (afzuVar.q == null) {
            com.google.android.material.search.SearchView searchView = afzuVar.a;
            if (searchView.k()) {
                j$.util.Objects.requireNonNull(searchView);
                searchView.postDelayed(new defpackage.aflt(searchView, 13), 150L);
            }
            com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = afzuVar.c;
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new defpackage.aflt(afzuVar, 14));
            return;
        }
        com.google.android.material.search.SearchView searchView2 = afzuVar.a;
        if (searchView2.k()) {
            searchView2.d();
        }
        searchView2.m(3, true);
        afzuVar.s.e();
        android.widget.EditText editText = afzuVar.j;
        editText.setText(afzuVar.q.H());
        editText.setSelection(editText.getText().length());
        com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = afzuVar.c;
        clippableRoundedCornerLayout2.setVisibility(4);
        clippableRoundedCornerLayout2.post(new defpackage.aflt(afzuVar, 12));
    }

    public final void j() {
        if (r() || this.o == null || android.os.Build.VERSION.SDK_INT < 34) {
            return;
        }
        defpackage.afzu afzuVar = this.t;
        afzuVar.o.f(afzuVar.q);
        android.animation.AnimatorSet animatorSet = afzuVar.p;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        afzuVar.p = null;
    }

    public final boolean k() {
        return this.x == 48;
    }

    public final void l() {
        if (r()) {
            return;
        }
        defpackage.afzu afzuVar = this.t;
        defpackage.afwb afwbVar = afzuVar.o;
        mk mkVarC = afwbVar.c();
        if (android.os.Build.VERSION.SDK_INT < 34 || this.o == null || mkVarC == null) {
            b();
            return;
        }
        long jM = aa$.ExternalSyntheticApiModelOutline1.m(afzuVar.h());
        android.animation.AnimatorSet animatorSetE = afwbVar.e(afzuVar.q);
        animatorSetE.setDuration(jM);
        animatorSetE.start();
        afwbVar.g();
        if (afzuVar.p != null) {
            afzuVar.s.f();
            afzuVar.p.resume();
        }
        afzuVar.p = null;
    }

    public final void m(int i, boolean z) {
        int i2 = this.r;
        if (i2 == 0) {
            throw null;
        }
        if (i2 != i) {
            if (z) {
                t(i);
            }
            this.r = i;
            java.util.Iterator it = new java.util.LinkedHashSet(this.w).iterator();
            while (it.hasNext()) {
                ((defpackage.afzj) it.next()).a();
            }
            s(i);
            com.google.android.material.search.SearchBar searchBar = this.o;
            if (searchBar == null || i != 2) {
                return;
            }
            searchBar.sendAccessibilityEvent(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        agab.f(this);
        int i = this.r;
        t(i);
        s(i);
        getViewTreeObserver().addOnTouchModeChangeListener(this.D);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e(false);
        this.E.J();
        getViewTreeObserver().removeOnTouchModeChangeListener(this.D);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        android.app.Activity activityO = agab.O(getContext());
        android.view.Window window = activityO == null ? null : activityO.getWindow();
        if (window != null) {
            this.x = window.getAttributes().softInputMode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.search.SearchView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.search.SearchView.SavedState savedState = (com.google.android.material.search.SearchView.SavedState) parcelable;
        super.onRestoreInstanceState(((androidx.customview.view.AbsSavedState) savedState).d);
        java.lang.String str = savedState.a;
        this.k.setText(str);
        this.j.setText(str);
        g(savedState.b == 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, com.google.android.material.search.SearchView$SavedState] */
    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        ?? savedState = new com.google.android.material.search.SearchView.SavedState(super.onSaveInstanceState());
        android.text.Editable text = this.k.getText();
        savedState.a = text == null ? null : text.toString();
        savedState.b = this.b.getVisibility();
        return savedState;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        o(f);
    }

    public final void v(mk mkVar) {
        com.google.android.material.search.SearchBar searchBar;
        if (r() || (searchBar = this.o) == null) {
            return;
        }
        if (!this.B) {
            searchBar.I(this.k.getText().toString());
        }
        defpackage.afzu afzuVar = this.t;
        com.google.android.material.search.SearchBar searchBar2 = afzuVar.q;
        defpackage.afwb afwbVar = afzuVar.o;
        ((afvs) afwbVar).e = mkVar;
        float f = mkVar.a;
        android.view.View view = afwbVar.a;
        afwbVar.g = agab.M(view);
        if (searchBar2 != null) {
            afwbVar.h = agab.F(view, searchBar2);
        }
        afwbVar.f = f;
    }

    public final void x(mk mkVar) {
        if (r() || this.o == null || android.os.Build.VERSION.SDK_INT < 34) {
            return;
        }
        defpackage.afzu afzuVar = this.t;
        float f = mkVar.b;
        if (f > 0.0f) {
            defpackage.afwb afwbVar = afzuVar.o;
            com.google.android.material.search.SearchBar searchBar = afzuVar.q;
            afwbVar.h(mkVar, searchBar, searchBar.E());
            android.animation.AnimatorSet animatorSet = afzuVar.p;
            if (animatorSet != null) {
                animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
                return;
            }
            com.google.android.material.search.SearchView searchView = afzuVar.a;
            if (searchView.k()) {
                afzuVar.j.clearFocus();
            }
            if (searchView.p) {
                afzuVar.p = afzuVar.e(false);
                afzuVar.p.start();
                afzuVar.p.pause();
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends dum {
        public Behavior() {
        }

        public final /* bridge */ /* synthetic */ boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            com.google.android.material.search.SearchView searchView = (com.google.android.material.search.SearchView) view;
            if (searchView.o != null || !(view2 instanceof com.google.android.material.search.SearchBar)) {
                return false;
            }
            searchView.h((com.google.android.material.search.SearchBar) view2);
            return false;
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new kw(9);
        java.lang.String a;
        int b;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readString();
            this.b = parcel.readInt();
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969890);
    }

    public SearchView(android.content.Context context) {
        this(context, null);
    }
}
