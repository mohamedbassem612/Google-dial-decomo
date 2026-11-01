package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrl {
    public final com.google.android.material.button.MaterialButton a;
    public agak b;
    public eka c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public android.graphics.PorterDuff.Mode j;
    public android.content.res.ColorStateList k;
    public android.content.res.ColorStateList l;
    public android.content.res.ColorStateList m;
    public boolean q;
    public int s;
    private android.graphics.drawable.Drawable t;
    private android.graphics.drawable.RippleDrawable u;
    private defpackage.aprf v;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public afrl(com.google.android.material.button.MaterialButton materialButton, agak agakVar) {
        this.a = materialButton;
        this.b = agakVar;
    }

    private final void i() {
        agaf agafVarA = a(false);
        if (agafVarA != null) {
            agafVarA.V(this.b);
            eka ekaVar = this.c;
            if (ekaVar != null) {
                agafVarA.P(ekaVar);
            }
        }
        agaf agafVarA2 = a(true);
        if (agafVarA2 != null) {
            agafVarA2.V(this.b);
            eka ekaVar2 = this.c;
            if (ekaVar2 != null) {
                agafVarA2.P(ekaVar2);
            }
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = this.u;
        agaw agawVar = null;
        if (rippleDrawable != null) {
            agaw agawVarFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (agawVarFindDrawableByLayerId instanceof agaw) {
                agawVar = agawVarFindDrawableByLayerId;
            }
        }
        if (agawVar != null) {
            if (!(agawVar instanceof agaf)) {
                agawVar.q(this.b.a());
                return;
            }
            agaf agafVar = (agaf) agawVar;
            agafVar.V(this.b);
            eka ekaVar3 = this.c;
            if (ekaVar3 != null) {
                agafVar.P(ekaVar3);
            }
        }
    }

    public final agaf a(boolean z) {
        android.graphics.drawable.RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return ((android.graphics.drawable.LayerDrawable) ((android.graphics.drawable.InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b() {
        this.o = true;
        com.google.android.material.button.MaterialButton materialButton = this.a;
        materialButton.s(this.k);
        materialButton.t(this.j);
    }

    public final void c(eka ekaVar) {
        this.c = ekaVar;
        if (this.b instanceof defpackage.agbd) {
            i();
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        com.google.android.material.button.MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.d;
        int i6 = this.f;
        int i7 = this.e;
        int i8 = this.g;
        this.d = i;
        this.f = i2;
        this.e = i3;
        this.g = i4;
        if (!this.o) {
            f();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void e(agak agakVar) {
        this.b = agakVar;
        i();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public final void f() {
        android.graphics.drawable.Drawable agafVar = new agaf(this.b);
        eka ekaVar = this.c;
        if (ekaVar != null) {
            agafVar.P(ekaVar);
        }
        defpackage.aprf aprfVar = this.v;
        if (aprfVar != null) {
            ((agaf) agafVar).B = aprfVar;
        }
        ?? r1 = this.a;
        android.content.Context context = r1.getContext();
        agafVar.N(context);
        agafVar.setTintList(this.k);
        android.graphics.PorterDuff.Mode mode = this.j;
        if (mode != null) {
            agafVar.setTintMode(mode);
        }
        agafVar.X(this.i, this.l);
        android.graphics.drawable.Drawable agafVar2 = new agaf(this.b);
        eka ekaVar2 = this.c;
        if (ekaVar2 != null) {
            agafVar2.P(ekaVar2);
        }
        agafVar2.setTint(0);
        agafVar2.W(this.i, this.n ? agab.X((android.view.View) r1, 2130969105) : 0);
        agaf agafVar3 = new agaf(this.b);
        this.t = agafVar3;
        eka ekaVar3 = this.c;
        if (ekaVar3 != null) {
            agafVar3.P(ekaVar3);
        }
        this.t.setTint(-1);
        android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(afzc.b(this.m), new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{agafVar2, agafVar}), this.d, this.f, this.e, this.g), this.t);
        this.u = rippleDrawable;
        com.google.android.material.focus.FocusRingDrawable.c(context, rippleDrawable, (agaf) null);
        r1.p(this.u);
        agaf agafVarA = a(false);
        if (agafVarA != null) {
            agafVarA.Q(this.s);
            agafVarA.setState(r1.getDrawableState());
        }
        com.google.android.material.focus.FocusRingDrawable focusRingDrawableB = com.google.android.material.focus.FocusRingDrawable.b(r1.getBackground());
        if (focusRingDrawableB != null) {
            focusRingDrawableB.d(agafVarA);
        }
    }

    public final void g() {
        agaf agafVarA = a(false);
        agaf agafVarA2 = a(true);
        if (agafVarA != null) {
            agafVarA.X(this.i, this.l);
            if (agafVarA2 != null) {
                agafVarA2.W(this.i, this.n ? agab.X(this.a, 2130969105) : 0);
            }
        }
    }

    public final void h(defpackage.aprf aprfVar) {
        this.v = aprfVar;
        agaf agafVarA = a(false);
        if (agafVarA != null) {
            agafVarA.B = aprfVar;
        }
    }
}
