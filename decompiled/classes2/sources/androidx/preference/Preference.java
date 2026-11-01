package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class Preference implements java.lang.Comparable {
    public int A;
    public int B;
    public androidx.preference.PreferenceGroup C;
    public defpackage.gek D;
    public defpackage.geu E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private java.util.List L;
    private boolean M;
    private defpackage.gej N;
    private final android.view.View.OnClickListener O;
    private java.lang.CharSequence a;
    private int b;
    private android.graphics.drawable.Drawable c;
    private android.os.Bundle d;
    private boolean e;
    private boolean f;
    private boolean g;
    private java.lang.String h;
    private boolean i;
    public final android.content.Context j;
    public gez k;
    public long l;
    public boolean m;
    public defpackage.geh n;
    public defpackage.gei o;
    public int p;
    public int q;
    public java.lang.CharSequence r;
    public java.lang.String s;
    public android.content.Intent t;
    public java.lang.String u;
    public boolean v;
    public java.lang.Object w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.p = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.q = 0;
        this.e = true;
        this.f = true;
        this.v = true;
        this.i = true;
        this.F = true;
        this.x = true;
        this.G = true;
        this.H = true;
        this.J = true;
        this.z = true;
        this.A = 2131624371;
        this.O = new defpackage.gr(this, 4);
        this.j = context;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gfd.g, i, i2);
        this.b = dvf.j(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.s = dvf.m(typedArrayObtainStyledAttributes, 26, 6);
        this.r = dvf.l(typedArrayObtainStyledAttributes, 34, 4);
        this.a = dvf.l(typedArrayObtainStyledAttributes, 33, 7);
        this.p = dvf.q(typedArrayObtainStyledAttributes, 28, 8);
        this.u = dvf.m(typedArrayObtainStyledAttributes, 22, 13);
        this.A = dvf.j(typedArrayObtainStyledAttributes, 27, 3, 2131624371);
        this.B = dvf.j(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.e = dvf.n(typedArrayObtainStyledAttributes, 21, 2, true);
        this.f = dvf.n(typedArrayObtainStyledAttributes, 30, 5, true);
        this.v = dvf.n(typedArrayObtainStyledAttributes, 29, 1, true);
        this.h = dvf.m(typedArrayObtainStyledAttributes, 19, 10);
        this.G = dvf.n(typedArrayObtainStyledAttributes, 16, 16, this.f);
        this.H = dvf.n(typedArrayObtainStyledAttributes, 17, 17, this.f);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.w = f(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.w = f(typedArrayObtainStyledAttributes, 11);
        }
        this.z = dvf.n(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.I = zHasValue;
        if (zHasValue) {
            this.J = dvf.n(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.K = dvf.n(typedArrayObtainStyledAttributes, 24, 15, false);
        this.x = dvf.n(typedArrayObtainStyledAttributes, 25, 25, true);
        this.y = dvf.n(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void k(android.view.View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof android.view.ViewGroup)) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void A(android.os.Bundle bundle) {
        if (W()) {
            this.M = false;
            android.os.Parcelable parcelableDM = dM();
            if (!this.M) {
                throw new java.lang.IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableDM != null) {
                bundle.putParcelable(this.s, parcelableDM);
            }
        }
    }

    public void B(boolean z) {
        java.util.List list = this.L;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((androidx.preference.Preference) list.get(i)).Z(z);
            }
        }
    }

    public final void C() {
        defpackage.geu geuVar = this.E;
        if (geuVar != null) {
            geuVar.y();
        }
    }

    public void D() {
        H();
    }

    public final void E(gez gezVar) {
        this.k = gezVar;
        if (!this.m) {
            this.l = gezVar.a();
        }
        if (Y()) {
            gez gezVar2 = this.k;
            if ((gezVar2 != null ? gezVar2.d() : null).contains(this.s)) {
                h(null);
                return;
            }
        }
        java.lang.Object obj = this.w;
        if (obj != null) {
            h(obj);
        }
    }

    public void F() {
        T();
    }

    public void G() {
        android.content.Intent intent;
        defpackage.gey geyVar;
        if (X() && this.f) {
            c();
            defpackage.gei geiVar = this.o;
            if (geiVar == null || !geiVar.a(this)) {
                gez gezVar = this.k;
                if ((gezVar == null || (geyVar = gezVar.e) == null || !geyVar.t(this)) && (intent = this.t) != null) {
                    this.j.startActivity(intent);
                }
            }
        }
    }

    public final void H() {
        if (android.text.TextUtils.isEmpty(this.h)) {
            return;
        }
        androidx.preference.Preference preferenceU = u(this.h);
        if (preferenceU != null) {
            if (preferenceU.L == null) {
                preferenceU.L = new java.util.ArrayList();
            }
            preferenceU.L.add(this);
            Z(preferenceU.j());
            return;
        }
        throw new java.lang.IllegalStateException("Dependency \"" + this.h + "\" not found for preference \"" + this.s + "\" (title: \"" + ((java.lang.Object) this.r) + '\"');
    }

    public final void I(boolean z) {
        if (this.e != z) {
            this.e = z;
            B(j());
            d();
        }
    }

    public final void J(int i) {
        K(den.bO(this.j, i));
        this.b = i;
    }

    public void K(android.graphics.drawable.Drawable drawable) {
        if (this.c != drawable) {
            this.c = drawable;
            this.b = 0;
            d();
        }
    }

    public final void L(java.lang.String str) {
        this.s = str;
        if (!this.g || W()) {
            return;
        }
        if (android.text.TextUtils.isEmpty(this.s)) {
            throw new java.lang.IllegalStateException("Preference does not have a key assigned.");
        }
        this.g = true;
    }

    public final void M(int i) {
        if (i != this.p) {
            this.p = i;
            C();
        }
    }

    public final void N(int i) {
        p(this.j.getString(i));
    }

    public final void O(defpackage.gek gekVar) {
        this.D = gekVar;
        d();
    }

    public void P(int i) {
        Q(this.j.getString(i));
    }

    public void Q(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(charSequence, this.r)) {
            return;
        }
        this.r = charSequence;
        d();
    }

    public final void R(boolean z) {
        if (this.x != z) {
            this.x = z;
            defpackage.geu geuVar = this.E;
            if (geuVar != null) {
                geuVar.y();
            }
        }
    }

    public final void S(android.content.SharedPreferences.Editor editor) {
        if (this.k.c) {
            return;
        }
        editor.apply();
    }

    public final void T() {
        androidx.preference.Preference preferenceU;
        java.util.List list;
        java.lang.String str = this.h;
        if (str == null || (preferenceU = u(str)) == null || (list = preferenceU.L) == null) {
            return;
        }
        list.remove(this);
    }

    public final boolean U(java.lang.Object obj) {
        defpackage.geh gehVar = this.n;
        return gehVar == null || gehVar.a(this, obj);
    }

    protected final boolean V(boolean z) {
        return Y() ? this.k.d().getBoolean(this.s, z) : z;
    }

    public final boolean W() {
        return !android.text.TextUtils.isEmpty(this.s);
    }

    public boolean X() {
        return this.e && this.i && this.F;
    }

    protected final boolean Y() {
        return this.k != null && this.v && W();
    }

    public final void Z(boolean z) {
        if (this.i == z) {
            this.i = !z;
            B(j());
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    public void a(defpackage.gfc gfcVar) {
        java.lang.Integer numValueOf;
        android.graphics.drawable.Drawable drawableBO;
        android.view.View view = gfcVar.a;
        view.setOnClickListener(this.O);
        view.setId(this.q);
        android.widget.TextView textView = (android.widget.TextView) gfcVar.C(android.R.id.summary);
        if (textView != null) {
            java.lang.CharSequence charSequenceM = m();
            if (android.text.TextUtils.isEmpty(charSequenceM)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceM);
                textView.setVisibility(0);
                numValueOf = java.lang.Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) gfcVar.C(android.R.id.title);
        if (textView2 != null) {
            java.lang.CharSequence charSequenceV = v();
            if (android.text.TextUtils.isEmpty(charSequenceV)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequenceV);
                textView2.setVisibility(0);
                if (this.I) {
                    textView2.setSingleLine(this.J);
                }
                if (!this.f && X() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) gfcVar.C(android.R.id.icon);
        if (imageView != null) {
            int i = this.b;
            if (i != 0) {
                drawableBO = this.c;
                if (drawableBO == null) {
                    drawableBO = den.bO(this.j, i);
                    this.c = drawableBO;
                }
                if (drawableBO != null) {
                    imageView.setImageDrawable(drawableBO);
                }
            } else if (this.c != null) {
                i = 0;
                drawableBO = this.c;
                if (drawableBO == null) {
                    drawableBO = den.bO(this.j, i);
                    this.c = drawableBO;
                }
                if (drawableBO != null) {
                    imageView.setImageDrawable(drawableBO);
                }
            }
            if (this.c != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(true != this.K ? 8 : 4);
            }
        }
        android.view.View viewC = gfcVar.C(2131428353);
        if (viewC == null) {
            viewC = gfcVar.C(android.R.id.icon_frame);
        }
        if (viewC != null) {
            if (this.c != null) {
                viewC.setVisibility(0);
            } else {
                viewC.setVisibility(true == this.K ? 4 : 8);
            }
        }
        if (this.z) {
            k(view, X());
        } else {
            k(view, true);
        }
        boolean z = this.f;
        view.setFocusable(z);
        view.setClickable(z);
        gfcVar.u = this.G;
        gfcVar.v = this.H;
        boolean z2 = this.y;
        if (z2 && this.N == null) {
            this.N = new defpackage.gej(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.N : null);
        view.setLongClickable(z2);
        if (!z2 || z) {
            return;
        }
        view.setBackground(null);
    }

    public final void aa(boolean z) {
        if (this.F == z) {
            this.F = !z;
            B(j());
            d();
        }
    }

    protected final void ab(java.lang.String str) {
        if (!Y() || android.text.TextUtils.equals(str, w(null))) {
            return;
        }
        android.content.SharedPreferences.Editor editorB = this.k.b();
        editorB.putString(this.s, str);
        S(editorB);
    }

    public final void ac() {
        if (!this.K) {
            this.K = true;
            d();
        }
    }

    public final void ad() {
        if (this.f) {
            this.f = false;
            d();
        }
    }

    public void b(android.view.View view) {
        G();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        androidx.preference.Preference preference = (androidx.preference.Preference) obj;
        int i = this.p;
        int i2 = preference.p;
        if (i != i2) {
            return i - i2;
        }
        java.lang.CharSequence charSequence = this.r;
        java.lang.CharSequence charSequence2 = preference.r;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.r.toString());
    }

    public void d() {
        int iIndexOf;
        defpackage.geu geuVar = this.E;
        if (geuVar == null || (iIndexOf = geuVar.a.indexOf(this)) == -1) {
            return;
        }
        ((kh) geuVar).b.c(iIndexOf, 1, this);
    }

    protected android.os.Parcelable dM() {
        this.M = true;
        return androidx.preference.Preference.BaseSavedState.EMPTY_STATE;
    }

    public long dN() {
        return this.l;
    }

    protected java.lang.Object f(android.content.res.TypedArray typedArray, int i) {
        return null;
    }

    protected void g(android.os.Parcelable parcelable) {
        this.M = true;
        if (parcelable != androidx.preference.Preference.BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new java.lang.IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean j() {
        return !X();
    }

    public java.lang.CharSequence m() {
        defpackage.gek gekVar = this.D;
        return gekVar != null ? gekVar.a(this) : this.a;
    }

    public void p(java.lang.CharSequence charSequence) {
        if (this.D != null) {
            throw new java.lang.IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (android.text.TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected final int r(int i) {
        return Y() ? this.k.d().getInt(this.s, i) : i;
    }

    public final android.graphics.drawable.Drawable s() {
        int i;
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null || (i = this.b) == 0) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawableBO = den.bO(this.j, i);
        this.c = drawableBO;
        return drawableBO;
    }

    public final android.os.Bundle t() {
        android.os.Bundle bundle = this.d;
        if (bundle != null) {
            return bundle;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        this.d = bundle2;
        return bundle2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.CharSequence charSequenceV = v();
        if (!android.text.TextUtils.isEmpty(charSequenceV)) {
            sb.append(charSequenceV);
            sb.append(' ');
        }
        java.lang.CharSequence charSequenceM = m();
        if (!android.text.TextUtils.isEmpty(charSequenceM)) {
            sb.append(charSequenceM);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    protected final androidx.preference.Preference u(java.lang.String str) {
        gez gezVar = this.k;
        if (gezVar == null) {
            return null;
        }
        return gezVar.e(str);
    }

    public java.lang.CharSequence v() {
        return this.r;
    }

    protected final java.lang.String w(java.lang.String str) {
        return Y() ? this.k.d().getString(this.s, str) : str;
    }

    public final java.util.Set x(java.util.Set set) {
        return Y() ? this.k.d().getStringSet(this.s, set) : set;
    }

    final void y(androidx.preference.PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.C != null) {
            throw new java.lang.IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.C = preferenceGroup;
    }

    public void z(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        if (!W() || (parcelable = bundle.getParcelable(this.s)) == null) {
            return;
        }
        this.M = false;
        g(parcelable);
        if (!this.M) {
            throw new java.lang.IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* JADX INFO: compiled from: PG */
    public class BaseSavedState extends android.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.gec(3);

        public BaseSavedState(android.os.Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    protected void c() {
    }

    protected void h(java.lang.Object obj) {
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, dvf.h(context, 2130970251, android.R.attr.preferenceStyle));
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(android.content.Context context) {
        this(context, null);
    }
}
