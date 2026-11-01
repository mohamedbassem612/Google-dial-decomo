package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrp {
    private static final double v = 0.7071067811865476d;
    public final com.google.android.material.card.MaterialCardView a;
    public final agaf c;
    public final agaf d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public android.graphics.drawable.Drawable j;
    public android.graphics.drawable.Drawable k;
    public android.content.res.ColorStateList l;
    public android.content.res.ColorStateList m;
    public agak n;
    public android.content.res.ColorStateList o;
    public android.graphics.drawable.Drawable p;
    public android.graphics.drawable.LayerDrawable q;
    public agaf r;
    public boolean t;
    private android.animation.ValueAnimator w;
    private final android.animation.TimeInterpolator x;
    private final int y;
    private final int z;
    public final android.graphics.Rect b = new android.graphics.Rect();
    public boolean s = false;
    public float u = 0.0f;

    public afrp(com.google.android.material.card.MaterialCardView materialCardView, android.util.AttributeSet attributeSet, int i) {
        this.e = -1.0f;
        this.a = materialCardView;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, abq.a, i, 2132083201);
        agaf agafVar = new agaf(materialCardView.getContext(), attributeSet, i, 2132086089);
        this.c = agafVar;
        agafVar.N(materialCardView.getContext());
        agafVar.U(-12303292);
        aguv aguvVar = new aguv(agafVar.es());
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            this.e = dimension;
            aguvVar.k(dimension);
        }
        this.d = new agaf();
        g(new agal(aguvVar));
        this.x = agab.C(materialCardView.getContext(), 2130970073, afpc.a);
        this.y = agab.u(materialCardView.getContext(), 2130970063, 300);
        this.z = agab.u(materialCardView.getContext(), 2130970062, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float q() {
        float fMax = 0.0f;
        for (agal agalVar : this.n.e()) {
            if (agalVar != null) {
                agaf agafVar = this.c;
                float fMax2 = java.lang.Math.max(s(agalVar.j, agafVar.B()), s(agalVar.k, agafVar.C()));
                float[] fArr = agafVar.A;
                float fA = fArr != null ? fArr[1] : agafVar.q.a.a().d.a(agafVar.I());
                agab agabVar = agalVar.l;
                agab agabVar2 = agalVar.m;
                float fS = s(agabVar, fA);
                float[] fArr2 = agafVar.A;
                fMax = java.lang.Math.max(fMax, java.lang.Math.max(fMax2, java.lang.Math.max(fS, s(agabVar2, fArr2 != null ? fArr2[2] : agafVar.q.a.a().e.a(agafVar.I())))));
            }
        }
        return fMax;
    }

    private final boolean r() {
        return this.c.ab();
    }

    private static final float s(agab agabVar, float f) {
        if (agabVar instanceof agaj) {
            return (float) ((1.0d - v) * ((double) f));
        }
        if (agabVar instanceof defpackage.agaa) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        return this.a.a() + (o() ? q() : 0.0f);
    }

    public final float b() {
        return (this.a.a() * 1.5f) + (o() ? q() : 0.0f);
    }

    public final android.graphics.drawable.Drawable c() {
        if (this.p == null) {
            this.r = new agaf(this.n);
            this.p = new android.graphics.drawable.RippleDrawable(this.l, null, this.r);
        }
        android.graphics.drawable.LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        android.graphics.drawable.LayerDrawable layerDrawable2 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{this.p, this.d, this.k});
        com.google.android.material.focus.FocusRingDrawable.c(this.a.getContext(), layerDrawable2, this.r);
        layerDrawable2.setId(2, 2131428544);
        this.q = layerDrawable2;
        return layerDrawable2;
    }

    public final android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (((androidx.cardview.widget.CardView) this.a).a) {
            iCeil2 = (int) java.lang.Math.ceil(b());
            iCeil = (int) java.lang.Math.ceil(a());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new defpackage.afro(this, drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void e(android.content.res.ColorStateList colorStateList) {
        this.c.R(colorStateList);
    }

    public final void f(boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawable = this.k;
        if (drawable != null) {
            float f = true != z ? 0.0f : 1.0f;
            if (!z2) {
                drawable.setAlpha(true == z ? 255 : 0);
                this.u = f;
                return;
            }
            float f2 = this.u;
            if (z) {
                f2 = 1.0f - f2;
            }
            android.animation.ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.u, f);
            this.w = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new mh(this, 14, (byte[]) null));
            this.w.setInterpolator(this.x);
            this.w.setDuration((long) ((z ? this.y : this.z) * f2));
            this.w.start();
        }
    }

    public final void g(agak agakVar) {
        this.n = agakVar;
        agaf agafVar = this.c;
        agafVar.V(agakVar);
        this.d.V(agakVar);
        agaf agafVar2 = this.r;
        if (agafVar2 != null) {
            agafVar2.V(agakVar);
        }
        agafVar.y = !agafVar.ab();
    }

    public final void h() {
        android.graphics.drawable.Drawable drawable = this.j;
        android.graphics.drawable.Drawable drawableC = p() ? c() : this.d;
        this.j = drawableC;
        if (drawable != drawableC) {
            com.google.android.material.card.MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof android.graphics.drawable.InsetDrawable) {
                ((android.graphics.drawable.InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void i() {
        float fD = 0.0f;
        float fQ = (n() || o()) ? q() : 0.0f;
        com.google.android.material.card.MaterialCardView materialCardView = this.a;
        if (((androidx.cardview.widget.CardView) materialCardView).b && ((androidx.cardview.widget.CardView) materialCardView).a) {
            fD = (float) ((1.0d - v) * ((double) sa.d(((androidx.cardview.widget.CardView) materialCardView).e)));
        }
        android.graphics.Rect rect = this.b;
        int i = (int) (fQ - fD);
        ((androidx.cardview.widget.CardView) materialCardView).c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        sa.e(((androidx.cardview.widget.CardView) materialCardView).e);
    }

    public final void j() {
        this.c.Q(((androidx.cardview.widget.CardView) this.a).e.b.getElevation());
    }

    public final void k() {
        this.d.X(this.i, this.o);
    }

    public final boolean l() {
        return (this.h & 80) == 80;
    }

    public final boolean m() {
        return (this.h & 8388613) == 8388613;
    }

    public final boolean n() {
        return ((androidx.cardview.widget.CardView) this.a).b && !r();
    }

    public final boolean o() {
        com.google.android.material.card.MaterialCardView materialCardView = this.a;
        return ((androidx.cardview.widget.CardView) materialCardView).b && r() && ((androidx.cardview.widget.CardView) materialCardView).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final boolean p() {
        com.google.android.material.card.MaterialCardView materialCardView = this.a;
        boolean zIsClickable = materialCardView.isClickable();
        ?? r1 = materialCardView;
        if (zIsClickable) {
            return true;
        }
        while (r1.isDuplicateParentStateEnabled() && (r1.getParent() instanceof android.view.View)) {
            r1 = (android.view.View) r1.getParent();
        }
        return r1.isClickable();
    }
}
