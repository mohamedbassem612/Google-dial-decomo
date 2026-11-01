package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afzu {
    public static final /* synthetic */ int x = 0;
    private static final android.animation.TimeInterpolator y = afpc.a;
    private final android.widget.ImageButton A;
    public final com.google.android.material.search.SearchView a;
    public final android.view.View b;
    public final com.google.android.material.internal.ClippableRoundedCornerLayout c;
    public final android.widget.FrameLayout d;
    public final android.widget.FrameLayout e;
    public final android.support.v7.widget.Toolbar f;
    public final android.support.v7.widget.Toolbar g;
    public final android.widget.TextView h;
    public final android.widget.TextView i;
    public final android.widget.EditText j;
    public final android.view.View k;
    public final com.google.android.material.internal.TouchObserverFrameLayout l;
    public defpackage.afpb m;
    public android.animation.AnimatorSet n;
    public final defpackage.afwb o;
    public android.animation.AnimatorSet p;
    public com.google.android.material.search.SearchBar q;
    public final android.content.Context r;
    public final defpackage.afzn s;
    public final android.animation.TimeInterpolator t;
    public final android.animation.TimeInterpolator u;
    public final int v;
    public final int w;
    private final android.view.View z;

    public afzu(android.content.Context context, com.google.android.material.search.SearchView searchView, boolean z) {
        this.r = context;
        this.a = searchView;
        this.b = searchView.a;
        this.z = searchView.c;
        com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.b;
        this.c = clippableRoundedCornerLayout;
        this.d = searchView.e;
        this.e = searchView.f;
        this.f = searchView.g;
        this.g = searchView.h;
        this.h = searchView.i;
        this.i = searchView.j;
        this.j = searchView.k;
        this.A = searchView.l;
        this.k = searchView.m;
        this.l = searchView.n;
        this.o = new defpackage.afwb(clippableRoundedCornerLayout);
        android.animation.TimeInterpolator timeInterpolator = y;
        this.t = agab.C(context, 2130970075, timeInterpolator);
        this.u = agab.C(context, 2130970076, timeInterpolator);
        this.v = agab.u(context, 2130970062, 100);
        this.w = agab.u(context, 2130970063, 100);
        this.s = z ? new defpackage.afzr(this) : new defpackage.afzt(this);
    }

    public static final void n(android.support.v7.widget.Toolbar toolbar) {
        android.support.v7.widget.ActionMenuView actionMenuViewA = afvm.a(toolbar);
        if (actionMenuViewA != null) {
            for (int i = 0; i < actionMenuViewA.getChildCount(); i++) {
                android.view.View childAt = actionMenuViewA.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private final void o(android.animation.AnimatorSet animatorSet) {
        android.widget.ImageButton imageButtonB = afvm.b(this.f);
        if (imageButtonB != null) {
            eh ehVarC = dzk.C(imageButtonB.getDrawable());
            if (!this.a.p) {
                if (ehVarC instanceof eh) {
                    ehVarC.b(1.0f);
                }
                if (ehVarC instanceof defpackage.afud) {
                    ((defpackage.afud) ehVarC).a(1.0f);
                    return;
                }
                return;
            }
            if (ehVarC instanceof eh) {
                android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new mh(ehVarC, 19, (byte[]) null));
                animatorSet.playTogether(valueAnimatorOfFloat);
            }
            if (ehVarC instanceof defpackage.afud) {
                android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.addUpdateListener(new mh((defpackage.afud) ehVarC, 20, (byte[]) null));
                animatorSet.playTogether(valueAnimatorOfFloat2);
            }
            com.google.android.material.search.SearchBar searchBar = this.q;
            if (searchBar == null || searchBar.e() != null) {
                return;
            }
            android.animation.ValueAnimator valueAnimatorOfFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat3.addUpdateListener(new defpackage.afzo(imageButtonB, 1));
            animatorSet.playTogether(valueAnimatorOfFloat3);
        }
    }

    public final int a(android.view.View view, android.view.View view2) {
        if (view != null) {
            return b(view) - b(view2);
        }
        int marginStart = ((android.view.ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.q.getPaddingStart();
        int iB = b(this.q);
        return agab.L(this.q) ? (((iB + this.q.getWidth()) + marginStart) - paddingStart) - this.a.getRight() : (iB - marginStart) + paddingStart;
    }

    public final int b(android.view.View view) {
        int left = view.getLeft();
        for (android.view.ViewParent parent = view.getParent(); (parent instanceof android.view.View) && parent != this.a.getParent(); parent = parent.getParent()) {
            left += ((android.view.View) parent).getLeft();
        }
        return left;
    }

    public final int c(android.view.View view) {
        int top = view.getTop();
        for (android.view.ViewParent parent = view.getParent(); (parent instanceof android.view.View) && parent != this.a.getParent(); parent = parent.getParent()) {
            top += ((android.view.View) parent).getTop();
        }
        return top;
    }

    public final android.animation.Animator d(boolean z) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(true != z ? 42L : 50L);
        valueAnimatorOfFloat.setStartDelay(true != z ? 0L : 250L);
        valueAnimatorOfFloat.setInterpolator(defpackage.afva.a(z, afpc.a));
        valueAnimatorOfFloat.addUpdateListener(defpackage.afuk.a(this.A));
        return valueAnimatorOfFloat;
    }

    public final android.animation.AnimatorSet e(boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        o(animatorSet);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(defpackage.afva.a(z, afpc.b));
        return animatorSet;
    }

    public final android.animation.AnimatorSet f(boolean z) {
        android.animation.AnimatorSet animatorSetA = this.s.a(z);
        if (this.p == null) {
            animatorSetA.playTogether(e(z));
        }
        return animatorSetA;
    }

    public final android.animation.AnimatorSet g(boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(defpackage.afuk.c(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        o(animatorSet);
        animatorSet.setInterpolator(defpackage.afva.a(z, afpc.b));
        animatorSet.setDuration(true != z ? 300L : 350L);
        return animatorSet;
    }

    public final android.animation.AnimatorSet h() {
        j();
        com.google.android.material.search.SearchBar searchBar = this.q;
        com.google.android.material.search.SearchView searchView = this.a;
        if (searchBar == null) {
            if (searchView.k()) {
                this.j.clearFocus();
            }
            android.animation.AnimatorSet animatorSetG = g(false);
            animatorSetG.addListener(new defpackage.afzm(this, animatorSetG));
            animatorSetG.start();
            this.n = animatorSetG;
            return animatorSetG;
        }
        if (searchView.k()) {
            this.j.clearFocus();
        }
        defpackage.afpb afpbVar = new defpackage.afpb();
        android.animation.AnimatorSet animatorSetF = f(false);
        afpbVar.a(animatorSetF);
        java.util.Iterator it = i(false).iterator();
        while (it.hasNext()) {
            afpbVar.b((ejz) it.next());
        }
        afpbVar.c(new defpackage.afzk(this, afpbVar, 0));
        afpbVar.e();
        this.m = afpbVar;
        return animatorSetF;
    }

    public final java.util.List i(boolean z) {
        return this.s.b(z);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void j() {
        defpackage.afpb afpbVar = this.m;
        if (afpbVar != null) {
            ?? r3 = afpbVar.d;
            java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) r3);
            r3.clear();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((android.animation.Animator) arrayList.get(i)).end();
            }
            java.util.List list = afpbVar.a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list);
            list.clear();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ejz ejzVar = (ejx) arrayList2.get(i2);
                if (ejzVar instanceof ejz) {
                    ejz ejzVar2 = ejzVar;
                    if (ejzVar2.l()) {
                        ejzVar2.k();
                    } else {
                        ejzVar2.b();
                    }
                } else {
                    ejzVar.b();
                }
            }
            afpbVar.e.clear();
            afpbVar.b = 0;
            afpbVar.c = false;
            this.m = null;
        }
        android.animation.AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
    }

    public final void k(float f) {
        this.z.getBackground().mutate().setAlpha((int) (f * 255.0f));
    }

    public final void l(float f) {
        android.support.v7.widget.ActionMenuView actionMenuViewA;
        this.A.setAlpha(f);
        this.k.setAlpha(f);
        this.l.setAlpha(f);
        if (!this.a.q || (actionMenuViewA = afvm.a(this.f)) == null) {
            return;
        }
        actionMenuViewA.setAlpha(f);
    }

    public final boolean m() {
        android.view.Menu menuF;
        com.google.android.material.search.SearchBar searchBar = this.q;
        if (searchBar.G == -1 || !this.a.q || (menuF = searchBar.f()) == null) {
            return false;
        }
        for (int i = 0; i < menuF.size(); i++) {
            if (menuF.getItem(i).isVisible()) {
                return true;
            }
        }
        return false;
    }
}
