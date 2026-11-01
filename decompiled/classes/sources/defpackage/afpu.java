package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afpu extends android.graphics.drawable.Drawable implements defpackage.afvg {
    public final java.lang.ref.WeakReference a;
    public final afvh b;
    public final afpv c;
    public final int d;
    private final defpackage.agaf e;
    private final android.graphics.Rect f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private java.lang.ref.WeakReference l;
    private java.lang.ref.WeakReference m;

    public afpu(android.content.Context context, com.google.android.material.badge.BadgeState.State state) {
        afza afzaVar;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        this.a = weakReference;
        defpackage.afvl.c(context);
        this.f = new android.graphics.Rect();
        afvh afvhVar = new afvh(this);
        this.b = afvhVar;
        afvhVar.a.setTextAlign(android.graphics.Paint.Align.CENTER);
        afpv afpvVar = new afpv(context, state);
        this.c = afpvVar;
        this.e = new defpackage.agaf(new defpackage.agal(defpackage.agal.l(context, q() ? afpvVar.e() : afpvVar.c(), q() ? afpvVar.d() : afpvVar.b())));
        p();
        android.content.Context context2 = (android.content.Context) weakReference.get();
        if (context2 != null && afvhVar.e != (afzaVar = new afza(context2, afpvVar.b.d.intValue()))) {
            afvhVar.c(afzaVar, context2);
            g();
            j();
            invalidateSelf();
        }
        if (a() != -2) {
            this.d = ((int) java.lang.Math.pow(10.0d, ((double) a()) - 1.0d)) - 1;
        } else {
            this.d = afpvVar.b.m;
        }
        afvhVar.f();
        j();
        invalidateSelf();
        f();
        o();
        e();
        g();
        java.lang.ref.WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            android.view.View view = (android.view.View) this.l.get();
            java.lang.ref.WeakReference weakReference3 = this.m;
            i(view, weakReference3 != null ? (android.widget.FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(afpvVar.b.t.booleanValue(), false);
    }

    private final java.lang.String m() {
        if (!l()) {
            if (!k()) {
                return null;
            }
            int i = this.d;
            if (i == -2 || b() <= i) {
                return java.text.NumberFormat.getInstance(this.c.i()).format(b());
            }
            android.content.Context context = (android.content.Context) this.a.get();
            return context != null ? java.lang.String.format(this.c.i(), context.getString(2132019382), java.lang.Integer.valueOf(i), "+") : "";
        }
        java.lang.String strD = d();
        int iA = a();
        if (iA == -2 || strD == null || strD.length() <= iA) {
            return strD;
        }
        android.content.Context context2 = (android.content.Context) this.a.get();
        if (context2 != null) {
            return java.lang.String.format(context2.getString(2132019187), strD.substring(0, iA - 1), "…");
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n(android.view.View view, android.view.View view2) {
        float y;
        float x;
        android.view.ViewParent parent;
        android.widget.FrameLayout frameLayoutC = c();
        if (frameLayoutC == null) {
            float y2 = view.getY();
            x = view.getX();
            parent = view.getParent();
            y = y2;
        } else {
            y = 0.0f;
            x = 0.0f;
            parent = frameLayoutC;
        }
        while (parent instanceof android.view.View) {
            if (parent != view2) {
                android.view.ViewParent parent2 = parent.getParent();
                if ((parent2 instanceof android.view.ViewGroup) && !((android.view.ViewGroup) parent2).getClipChildren()) {
                    android.view.View view3 = (android.view.View) parent;
                    y += view3.getY();
                    x += view3.getX();
                    parent = parent.getParent();
                }
            }
            float f = (this.h - this.k) + y;
            float f2 = (this.g - this.j) + x;
            android.view.View view4 = (android.view.View) parent;
            float height = ((this.h + this.k) - view4.getHeight()) + y;
            float width = ((this.g + this.j) - view4.getWidth()) + x;
            if (f < 0.0f) {
                this.h += java.lang.Math.abs(f);
            }
            if (f2 < 0.0f) {
                this.g += java.lang.Math.abs(f2);
            }
            if (height > 0.0f) {
                this.h -= java.lang.Math.abs(height);
            }
            if (width > 0.0f) {
                this.g -= java.lang.Math.abs(width);
                return;
            }
            return;
        }
    }

    private final void o() {
        this.b.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    private final void p() {
        android.content.Context context = (android.content.Context) this.a.get();
        if (context != null) {
            defpackage.agaf agafVar = this.e;
            boolean zQ = q();
            afpv afpvVar = this.c;
            int iE = zQ ? afpvVar.e() : afpvVar.c();
            boolean zQ2 = q();
            afpv afpvVar2 = this.c;
            agafVar.q(new defpackage.agal(defpackage.agal.l(context, iE, zQ2 ? afpvVar2.d() : afpvVar2.b())));
            invalidateSelf();
        }
    }

    private final boolean q() {
        return l() || k();
    }

    public final int a() {
        return this.c.b.l;
    }

    public final int b() {
        afpv afpvVar = this.c;
        if (afpvVar.j()) {
            return afpvVar.h();
        }
        return 0;
    }

    public final android.widget.FrameLayout c() {
        java.lang.ref.WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (android.widget.FrameLayout) weakReference.get();
        }
        return null;
    }

    public final java.lang.String d() {
        return this.c.b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        java.lang.String strM;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.e.draw(canvas);
        if (!q() || (strM = m()) == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        afvh afvhVar = this.b;
        int length = strM.length();
        android.text.TextPaint textPaint = afvhVar.a;
        textPaint.getTextBounds(strM, 0, length, rect);
        float fExactCenterY = this.h - rect.exactCenterY();
        canvas.drawText(strM, this.g, rect.bottom <= 0 ? (int) fExactCenterY : java.lang.Math.round(fExactCenterY), textPaint);
    }

    public final void e() {
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(this.c.b.b.intValue());
        defpackage.agaf agafVar = this.e;
        if (agafVar.H() != colorStateListValueOf) {
            agafVar.R(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public final void f() {
        this.b.f();
        p();
        j();
        invalidateSelf();
    }

    public final void g() {
        this.b.a.setColor(this.c.b.c.intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.afvg
    public final void h() {
        invalidateSelf();
    }

    public final void i(android.view.View view, android.widget.FrameLayout frameLayout) {
        this.l = new java.lang.ref.WeakReference(view);
        this.m = new java.lang.ref.WeakReference(frameLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        java.lang.ref.WeakReference weakReference = this.a;
        android.content.Context context = (android.content.Context) weakReference.get();
        java.lang.ref.WeakReference weakReference2 = this.l;
        android.view.View view = weakReference2 != null ? (android.view.View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = this.f;
        rect.set(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        view.getDrawingRect(rect3);
        java.lang.ref.WeakReference weakReference3 = this.m;
        android.view.ViewGroup viewGroup = weakReference3 != null ? (android.view.ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zQ = q();
        afpv afpvVar = this.c;
        float f11 = zQ ? afpvVar.d : afpvVar.c;
        this.i = f11;
        if (f11 != -1.0f) {
            this.j = f11;
            this.k = f11;
        } else {
            boolean zQ2 = q();
            afpv afpvVar2 = this.c;
            this.j = java.lang.Math.round((zQ2 ? afpvVar2.g : afpvVar2.e) / 2.0f);
            boolean zQ3 = q();
            afpv afpvVar3 = this.c;
            this.k = java.lang.Math.round((zQ3 ? afpvVar3.h : afpvVar3.f) / 2.0f);
        }
        if (q()) {
            java.lang.String strM = m();
            float f12 = this.j;
            afvh afvhVar = this.b;
            float fA = afvhVar.a(strM) / 2.0f;
            com.google.android.material.badge.BadgeState.State state = this.c.b;
            this.j = java.lang.Math.max(f12, fA + state.u.intValue());
            float f13 = this.k;
            if (afvhVar.c) {
                afvhVar.b(strM);
                f10 = afvhVar.b;
            } else {
                f10 = afvhVar.b;
            }
            float fMax = java.lang.Math.max(f13, (f10 / 2.0f) + state.v.intValue());
            this.k = fMax;
            this.j = java.lang.Math.max(this.j, fMax);
        }
        afpv afpvVar4 = this.c;
        com.google.android.material.badge.BadgeState.State state2 = afpvVar4.b;
        int iIntValue = state2.x.intValue();
        if (q()) {
            iIntValue = state2.z.intValue();
            android.content.Context context2 = (android.content.Context) weakReference.get();
            if (context2 != null) {
                iIntValue = defpackage.afpc.b(iIntValue, iIntValue - state2.C.intValue(), defpackage.afpc.a(0.0f, 1.0f, 0.3f, 1.0f, defpackage.agab.k(context2) - 1.0f));
            }
        }
        int i = afpvVar4.k;
        if (i == 0) {
            iIntValue -= java.lang.Math.round(this.k);
            i = 0;
        }
        int iIntValue2 = iIntValue + state2.B.intValue();
        int iA = afpvVar4.a();
        if (iA == 8388691 || iA == 8388693) {
            this.h = rect3.bottom - iIntValue2;
        } else {
            this.h = rect3.top + iIntValue2;
        }
        int iIntValue3 = q() ? state2.y.intValue() : afpvVar4.g();
        if (i == 1) {
            iIntValue3 += q() ? afpvVar4.j : afpvVar4.i;
        }
        int iIntValue4 = iIntValue3 + state2.A.intValue();
        int iA2 = afpvVar4.a();
        float f14 = iIntValue4;
        if (iA2 == 8388659 || iA2 == 8388691) {
            if (afpvVar4.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f7 = rect3.left + this.j;
                    f8 = this.k;
                    f9 = f7 - ((f8 + f8) - f14);
                } else {
                    f5 = rect3.right - this.j;
                    f6 = this.k;
                    f9 = f5 + ((f6 + f6) - f14);
                }
            } else if (view.getLayoutDirection() == 0) {
                f3 = rect3.left;
                f4 = this.j;
                f9 = (f3 - f4) + f14;
            } else {
                f = rect3.right;
                f2 = this.j;
                f9 = (f + f2) - f14;
            }
        } else if (afpvVar4.l == 0) {
            if (view.getLayoutDirection() == 0) {
                f = rect3.right;
                f2 = this.j;
                f9 = (f + f2) - f14;
            } else {
                f3 = rect3.left;
                f4 = this.j;
                f9 = (f3 - f4) + f14;
            }
        } else if (view.getLayoutDirection() == 0) {
            f5 = rect3.right - this.j;
            f6 = this.k;
            f9 = f5 + ((f6 + f6) - f14);
        } else {
            f7 = rect3.left + this.j;
            f8 = this.k;
            f9 = f7 - ((f8 + f8) - f14);
        }
        this.g = f9;
        if (state2.D.booleanValue()) {
            android.view.ViewParent viewParentC = c();
            if (viewParentC == null) {
                viewParentC = view.getParent();
            }
            if ((viewParentC instanceof android.view.View) && (viewParentC.getParent() instanceof android.view.View)) {
                n(view, (android.view.View) viewParentC.getParent());
            }
        } else {
            n(view, null);
        }
        float f15 = this.g;
        float f16 = this.h;
        float f17 = this.j;
        float f18 = this.k;
        rect2.set((int) (f15 - f17), (int) (f16 - f18), (int) (f15 + f17), (int) (f16 + f18));
        float f19 = this.i;
        if (f19 != -1.0f) {
            this.e.O(f19);
        }
        if (rect.equals(rect2)) {
            return;
        }
        this.e.setBounds(rect2);
    }

    public final boolean k() {
        afpv afpvVar = this.c;
        return !afpvVar.k() && afpvVar.j();
    }

    public final boolean l() {
        return this.c.k();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.afvg
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        afpv afpvVar = this.c;
        afpvVar.a.i = i;
        afpvVar.b.i = i;
        o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
