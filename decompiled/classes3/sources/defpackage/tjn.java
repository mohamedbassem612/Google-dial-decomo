package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tjn {
    public android.animation.Animator a;
    public android.animation.Animator b;
    public boolean d;
    private final defpackage.aprf g;
    public j$.util.OptionalInt c = j$.util.OptionalInt.empty();
    public j$.util.Optional e = j$.util.Optional.empty();
    private final android.animation.Animator.AnimatorListener f = new defpackage.tjm(this, 0);

    public tjn(defpackage.aprf aprfVar) {
        this.g = aprfVar;
    }

    public final void a(com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView, int i) {
        if (this.d) {
            return;
        }
        if (!this.c.isPresent() || this.c.getAsInt() != i) {
            throw new java.lang.IllegalStateException("Trying to collapse an already collapsed item");
        }
        android.animation.Animator animatorD = expandableSheetView.d();
        this.a = null;
        this.b = animatorD;
        animatorD.addListener(this.f);
        animatorD.start();
        this.e = j$.util.Optional.empty();
        this.c = j$.util.OptionalInt.empty();
    }

    public final void b() {
        this.d = false;
        android.animation.Animator animator = this.a;
        if (animator != null && animator.isRunning()) {
            this.a.end();
        }
        android.animation.Animator animator2 = this.b;
        if (animator2 == null || !animator2.isRunning()) {
            return;
        }
        this.b.end();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView, int i) {
        if (this.d) {
            return;
        }
        if (f(i)) {
            throw new java.lang.IllegalStateException("Trying to expand an already expanded item");
        }
        if (this.c.isPresent()) {
            defpackage.aprf aprfVar = this.g;
            int asInt = this.c.getAsInt();
            android.support.v7.widget.LinearLayoutManager linearLayoutManager = ((defpackage.tkd) aprfVar.a).ak.n;
            if (asInt >= linearLayoutManager.L() && asInt <= linearLayoutManager.N()) {
                if (!this.e.isPresent()) {
                    throw new java.lang.IllegalStateException("Unable to collapse the expanded row");
                }
                android.animation.Animator animatorD = ((com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView) this.e.orElseThrow()).d();
                animatorD.start();
                this.b = animatorD;
            }
        }
        defpackage.tji tjiVar = expandableSheetView.g;
        int iAo = snl.ao(expandableSheetView);
        expandableSheetView.getLayoutParams().height = iAo;
        android.widget.LinearLayout linearLayoutA = defpackage.tji.a(expandableSheetView);
        linearLayoutA.setVisibility(0);
        aooh.c(linearLayoutA);
        int iAo2 = snl.ao(linearLayoutA);
        linearLayoutA.getLayoutParams().height = iAo2;
        ((android.widget.LinearLayout) expandableSheetView.findViewById(2131427851)).setShowDividers(0);
        hsh hshVar = tjiVar.d;
        hshVar.d();
        hshVar.g(iAo, iAo2 + iAo, defpackage.tji.c, new kkz(expandableSheetView, 5));
        hshVar.j(0.33333334f, 0.0f, 1.0f, defpackage.tji.a, new kkz(linearLayoutA, 6));
        hshVar.g(-snl.ap(expandableSheetView), 0.0f, defpackage.tji.b, new kkz(linearLayoutA, 7));
        hshVar.h(new kkz(expandableSheetView, 8));
        hshVar.i(new defpackage.sxq(expandableSheetView, 12));
        hshVar.setDuration(snl.an(expandableSheetView));
        this.a = hshVar;
        this.d = true;
        hshVar.addListener(this.f);
        hshVar.start();
        this.e = j$.util.Optional.of(expandableSheetView);
        e(i);
    }

    public final void d(com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView) {
        this.e = j$.util.Optional.of(expandableSheetView);
    }

    public final void e(int i) {
        this.c = j$.util.OptionalInt.of(i);
    }

    public final boolean f(int i) {
        return this.c.isPresent() && this.c.getAsInt() == i;
    }
}
