package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahan extends kh {
    public final ahxt a;
    public final defpackage.ahag e;
    public java.util.List f;
    private final ahyc g;
    private final akbx h = new akbx();

    public ahan(ahyc ahycVar, ahxt ahxtVar, defpackage.ahag ahagVar) {
        this.g = ahycVar;
        this.a = ahxtVar;
        this.e = ahagVar;
    }

    public final int a() {
        aike aikeVar = this.f;
        if (aikeVar == null) {
            return 0;
        }
        return aikeVar.d;
    }

    public final int b(int i) {
        return this.h.b((defpackage.ahao) this.g.apply(this.f.get(i)));
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        defpackage.ahao ahaoVarC = this.h.c(i);
        ahvr.cj(ahaoVarC, "No ViewBinder for the provided viewType");
        return new aham(ahaoVarC.a(viewGroup));
    }

    public final void l(android.support.v7.widget.RecyclerView recyclerView) {
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        boolean z = true;
        if (recyclerView.r && (layoutParams.height == -2 || layoutParams.width == -2)) {
            z = false;
        }
        ahvr.bZ(z, "RecyclerViews that use WRAP_CONTENT with setHasFixedSize(true) won't resize on new data.");
        recyclerView.X(new defpackage.ahal(this, recyclerView));
    }

    public final /* bridge */ /* synthetic */ void m(ld ldVar, int i) {
        aham ahamVar = (aham) ldVar;
        defpackage.ahao ahaoVarC = this.h.c(((ld) ahamVar).f);
        try {
            ahaoVarC.b(ahamVar.s, this.f.get(i));
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Attempting to bind data with an incompatible ViewBinder class (%s). Check that your ViewBinder function is correct.", ahaoVarC), e);
        }
    }

    public final void n(android.support.v7.widget.RecyclerView recyclerView) {
        lf lfVar = recyclerView.Q;
        if (lfVar instanceof defpackage.ahal) {
            recyclerView.X(((defpackage.ahal) lfVar).c);
        }
    }

    public final /* bridge */ /* synthetic */ void q(ld ldVar) {
        aham ahamVar = (aham) ldVar;
        this.h.c(((ld) ahamVar).f).f(ahamVar.s);
    }
}
