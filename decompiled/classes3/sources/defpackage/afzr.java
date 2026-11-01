package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afzr implements defpackage.afzn {
    final /* synthetic */ defpackage.afzu a;

    public afzr(defpackage.afzu afzuVar) {
        j$.util.Objects.requireNonNull(afzuVar);
        this.a = afzuVar;
    }

    public static final void g(android.view.View view, int i) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    private final int h(android.support.v7.widget.Toolbar toolbar) {
        defpackage.afzu afzuVar = this.a;
        int iB = afzuVar.b(afzuVar.q);
        android.widget.FrameLayout frameLayout = afzuVar.e;
        int paddingStart = frameLayout.getPaddingStart();
        int marginStart = ((android.view.ViewGroup.MarginLayoutParams) toolbar.getLayoutParams()).getMarginStart();
        return agab.L(afzuVar.q) ? (iB + afzuVar.q.getWidth()) - ((frameLayout.getWidth() - paddingStart) - marginStart) : (iB - paddingStart) - marginStart;
    }

    private final ejz i(android.view.View view, ejy ejyVar, float f, float f2) {
        ejz ejzVar = new ejz(view, ejyVar);
        ejzVar.t = agab.D(this.a.r, 2132083459);
        ejzVar.i(f);
        ejzVar.t.d(f2);
        return ejzVar;
    }

    private final ejz j(boolean z, android.view.View view) {
        defpackage.afzu afzuVar = this.a;
        android.widget.TextView textView = afzuVar.q.C;
        if (android.text.TextUtils.isEmpty(textView.getText()) || z) {
            textView = afzuVar.q.B;
        }
        float fA = afzuVar.a(textView, view) - h(afzuVar.f);
        if (agab.L(afzuVar.q)) {
            fA += textView.getWidth() - view.getWidth();
        }
        float f = true != z ? 0.0f : fA;
        if (true == z) {
            fA = 0.0f;
        }
        return i(view, ejz.a, f, fA);
    }

    private final ejz k(boolean z, android.support.v7.widget.Toolbar toolbar) {
        int iH = h(toolbar);
        int i = true != z ? 0 : iH;
        if (true == z) {
            iH = 0;
        }
        return i(toolbar, ejz.a, i, iH);
    }

    private final ejz l(final boolean z, final android.support.v7.widget.Toolbar toolbar) {
        defpackage.afzu afzuVar = this.a;
        int width = afzuVar.q.getWidth();
        android.widget.FrameLayout frameLayout = afzuVar.e;
        int width2 = frameLayout.getWidth();
        int paddingStart = frameLayout.getPaddingStart() + frameLayout.getPaddingEnd();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) afzuVar.f.getLayoutParams();
        int marginStart = (width2 - paddingStart) - (marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd());
        int i = true != z ? marginStart : width;
        if (true == z) {
            width = marginStart;
        }
        ejz ejzVarI = i(toolbar, new defpackage.afzq(this), i, width);
        ejzVarI.g(new ejv() { // from class: afzp
            public final void a(ejx ejxVar, boolean z2, float f) {
                if (z) {
                    defpackage.afzr.g(toolbar, -1);
                }
            }
        });
        return ejzVarI;
    }

    private static final android.animation.ValueAnimator m(boolean z) {
        return android.animation.ValueAnimator.ofFloat(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
    }

    private static final android.animation.Animator n(android.view.View view, boolean z, float f) {
        float f2 = true != z ? f : 0.0f;
        if (true != z) {
            f = 0.0f;
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(f2, f);
        valueAnimatorOfFloat.addUpdateListener(defpackage.afuk.b(view));
        return valueAnimatorOfFloat;
    }

    private static final android.animation.Animator o(android.view.View view, boolean z) {
        android.animation.ValueAnimator valueAnimatorM = m(!z);
        valueAnimatorM.addUpdateListener(defpackage.afuk.a(view));
        return valueAnimatorM;
    }

    @Override // defpackage.afzn
    public final android.animation.AnimatorSet a(boolean z) {
        long j;
        boolean z2;
        boolean z3;
        android.view.View view;
        boolean z4;
        android.view.View viewB;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.Animator[] animatorArr = new android.animation.Animator[6];
        android.animation.ValueAnimator valueAnimatorM = m(z);
        defpackage.afzu afzuVar = this.a;
        long j2 = afzuVar.w;
        valueAnimatorM.setDuration(j2);
        long j3 = 0;
        if (z) {
            j = 0;
            z2 = true;
        } else {
            j = afzuVar.v;
            z2 = false;
        }
        valueAnimatorM.setStartDelay(j);
        valueAnimatorM.setInterpolator(z2 ? afzuVar.u : afzuVar.t);
        valueAnimatorM.addUpdateListener(new defpackage.afzo(this, 2));
        animatorArr[0] = valueAnimatorM;
        android.animation.ValueAnimator valueAnimatorM2 = m(z);
        valueAnimatorM2.setDuration(j2);
        if (z) {
            j3 = afzuVar.v;
            z3 = true;
        } else {
            z3 = false;
        }
        valueAnimatorM2.setStartDelay(j3);
        valueAnimatorM2.setInterpolator(z3 ? afzuVar.t : afzuVar.u);
        valueAnimatorM2.addUpdateListener(defpackage.afuk.a(afzuVar.l));
        animatorArr[1] = valueAnimatorM2;
        android.animation.ValueAnimator valueAnimatorM3 = m(z);
        valueAnimatorM3.setDuration(j2);
        valueAnimatorM3.setInterpolator(z ? afzuVar.u : afzuVar.t);
        valueAnimatorM3.addUpdateListener(new defpackage.afzo(this, 0));
        animatorArr[2] = valueAnimatorM3;
        if (z) {
            view = afzuVar.q.B;
            z4 = true;
        } else {
            view = afzuVar.j;
            z4 = false;
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(view.getWidth(), (z4 ? afzuVar.j : afzuVar.q.B).getWidth());
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.setInterpolator(z4 ? afzuVar.u : afzuVar.t);
        valueAnimatorOfInt.addUpdateListener(new defpackage.afzo(this, 3));
        animatorArr[3] = valueAnimatorOfInt;
        animatorArr[4] = afzuVar.d(z);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        com.google.android.material.appbar.AppBarLayout appBarLayoutF = afzuVar.q.F();
        com.google.android.material.search.SearchBar searchBar = afzuVar.q;
        if (searchBar != null && appBarLayoutF != null) {
            int i = searchBar.I;
            android.view.View viewA = null;
            if (i != -1) {
                viewB = appBarLayoutF.findViewById(i);
            } else {
                android.support.v7.widget.Toolbar parent = searchBar.getParent();
                viewB = !(parent instanceof android.support.v7.widget.Toolbar) ? null : afvm.b(parent);
            }
            com.google.android.material.search.SearchBar searchBar2 = afzuVar.q;
            int i2 = searchBar2.J;
            if (i2 != -1) {
                viewA = appBarLayoutF.findViewById(i2);
            } else {
                android.support.v7.widget.Toolbar parent2 = searchBar2.getParent();
                if (parent2 instanceof android.support.v7.widget.Toolbar) {
                    viewA = afvm.a(parent2);
                }
            }
            boolean zL = agab.L(afzuVar.q);
            int width = appBarLayoutF.getWidth();
            if (viewB != null) {
                android.graphics.Rect rectF = agab.F(appBarLayoutF, viewB);
                animatorSet2.playTogether(n(viewB, z, zL ? width - rectF.left : -rectF.right));
                animatorSet2.playTogether(o(viewB, z));
            }
            if (viewA != null) {
                android.graphics.Rect rectF2 = agab.F(appBarLayoutF, viewA);
                animatorSet2.playTogether(n(viewA, z, zL ? -rectF2.right : width - rectF2.left));
                animatorSet2.playTogether(o(viewA, z));
            }
            animatorSet2.setDuration(j2);
            animatorSet2.setInterpolator(afpc.a);
        }
        animatorArr[5] = animatorSet2;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @Override // defpackage.afzn
    public final java.util.List b(boolean z) {
        ejz[] ejzVarArr = new ejz[7];
        defpackage.afzu afzuVar = this.a;
        android.support.v7.widget.Toolbar toolbar = afzuVar.f;
        ejzVarArr[0] = l(z, toolbar);
        ejzVarArr[1] = k(z, toolbar);
        android.support.v7.widget.Toolbar toolbar2 = afzuVar.g;
        ejzVarArr[2] = l(z, toolbar2);
        ejzVarArr[3] = k(z, toolbar2);
        int iC = afzuVar.c(afzuVar.q) - afzuVar.c(toolbar);
        ejzVarArr[4] = i(afzuVar.e, ejz.b, true != z ? 0 : iC, true != z ? iC : 0);
        ejzVarArr[5] = j(z, afzuVar.j);
        ejzVarArr[6] = j(z, afzuVar.i);
        return java.util.Arrays.asList(ejzVarArr);
    }

    @Override // defpackage.afzn
    public final void c(boolean z) {
        defpackage.afzu afzuVar = this.a;
        if (z) {
            afzuVar.k(1.0f);
            afzuVar.l.setAlpha(1.0f);
        } else {
            afzuVar.k(0.0f);
            afzuVar.l.setAlpha(0.0f);
            afzuVar.q.setVisibility(0);
        }
        defpackage.afzu afzuVar2 = this.a;
        afzuVar2.g.setVisibility(4);
        g(afzuVar2.i, -2);
    }

    @Override // defpackage.afzn
    public final void d(boolean z) {
        defpackage.afzu afzuVar = this.a;
        if (z) {
            afzuVar.k(0.0f);
            afzuVar.f.setAlpha(0.0f);
            afzuVar.l.setAlpha(0.0f);
            afzuVar.q.setVisibility(4);
        } else {
            afzuVar.k(1.0f);
            afzuVar.l.setAlpha(1.0f);
        }
        this.a.g.setVisibility(0);
    }

    @Override // defpackage.afzn
    public final void e() {
        defpackage.afzu afzuVar = this.a;
        android.widget.TextView textView = afzuVar.q.B;
        java.lang.CharSequence text = textView.getText();
        android.widget.TextView textView2 = afzuVar.i;
        textView2.setText(text);
        textView2.setHint(textView.getHint());
        textView2.setVisibility(0);
        if (afzuVar.q.getBackground() != null && afzuVar.q.getBackground().getConstantState() != null) {
            afzuVar.g.setBackground(afzuVar.q.getBackground().getConstantState().newDrawable());
        }
        android.support.v7.widget.Toolbar toolbar = afzuVar.g;
        android.view.Menu menuF = toolbar.f();
        if (menuF != null) {
            menuF.clear();
        }
        if (afzuVar.m()) {
            toolbar.o(afzuVar.q.G);
            defpackage.afzu.n(toolbar);
        }
    }

    @Override // defpackage.afzn
    public final void f() {
    }
}
