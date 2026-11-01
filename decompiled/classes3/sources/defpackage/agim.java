package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agim extends kh {
    public android.view.View a;
    private final kh e;
    private final den f;

    public agim(kh khVar) {
        defpackage.agik agikVar = new defpackage.agik(this);
        this.f = agikVar;
        this.e = khVar;
        khVar.u(agikVar);
        r(khVar.c);
    }

    public final int a() {
        int iA = this.e.a();
        return this.a != null ? iA + 1 : iA;
    }

    public final int b(int i) {
        if (this.a != null) {
            i--;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return this.e.b(i);
    }

    public final long c(int i) {
        if (this.a != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.e.c(i);
    }

    public final ld d(android.view.ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.e.d(viewGroup, i);
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
        frameLayout.setImportantForAccessibility(2);
        frameLayout.setFocusable(false);
        frameLayout.setAccessibilityDelegate(new agil(this));
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        return new defpackage.agin(frameLayout);
    }

    public final void m(ld ldVar, int i) {
        android.view.View view = this.a;
        if (view != null) {
            i--;
        }
        if (!(ldVar instanceof defpackage.agin)) {
            this.e.m(ldVar, i);
        } else {
            if (view == null) {
                throw new java.lang.IllegalStateException("HeaderViewHolder cannot find mHeader");
            }
            if (view.getParent() != null) {
                ((android.view.ViewGroup) this.a.getParent()).removeView(this.a);
            }
            ((android.widget.FrameLayout) ldVar.a).addView(this.a);
        }
    }
}
