package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahak extends kh {
    private final ahyc a;
    private final ahxt e;
    private final ahyc f;
    private final defpackage.ahag g;
    private java.util.List h;
    private final akbx i;

    public ahak(ahyc ahycVar, ahyc ahycVar2, ahxt ahxtVar, defpackage.ahag ahagVar, akbx akbxVar) {
        this.a = ahycVar;
        this.f = ahycVar2;
        this.e = ahxtVar;
        this.g = ahagVar;
        this.i = akbxVar;
    }

    public final int a() {
        java.util.List list = this.h;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int b(int i) {
        return this.i.b(w(i));
    }

    public final long c(int i) {
        ahyc ahycVar;
        java.util.List list = this.h;
        if (list == null || (ahycVar = this.f) == null) {
            return -1L;
        }
        return ahycVar.apply(list.get(i)).hashCode();
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        defpackage.ahao ahaoVarC = this.i.c(i);
        ahvr.cj(ahaoVarC, "No ViewBinder for the provided viewType");
        return new aham(ahaoVarC.a(viewGroup), (byte[]) null);
    }

    public final void l(android.support.v7.widget.RecyclerView recyclerView) {
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        boolean z = true;
        if (recyclerView.r && a() <= 0 && (layoutParams.height == -2 || layoutParams.width == -2)) {
            z = false;
        }
        ahvr.bZ(z, "RecyclerViews that use WRAP_CONTENT with setHasFixedSize(true) won't resize on new data. If you have static data, you should set it on the adapter before setAdapter().");
    }

    public final /* bridge */ /* synthetic */ void m(ld ldVar, int i) {
        aham ahamVar = (aham) ldVar;
        defpackage.ahao ahaoVarC = this.i.c(((ld) ahamVar).f);
        try {
            ahaoVarC.b(ahamVar.s, this.h.get(i));
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Attempting to bind data with an incompatible ViewBinder class (%s). Check that your ViewBinder function is correct.", ahaoVarC), e);
        }
    }

    public final /* bridge */ /* synthetic */ void q(ld ldVar) {
        aham ahamVar = (aham) ldVar;
        this.i.c(((ld) ahamVar).f).f(ahamVar.s);
    }

    public final defpackage.ahao w(int i) {
        return (defpackage.ahao) this.a.apply(this.h.get(i));
    }

    public final void x(java.util.List list) {
        defpackage.ahag ahagVar;
        afec.c();
        java.util.List list2 = this.h;
        this.h = list;
        if (list2 == null) {
            if (list != null) {
                j(0, list.size());
                return;
            }
        } else {
            if (list == null) {
                k(0, list2.size());
                return;
            }
            ahxt ahxtVar = this.e;
            if (ahxtVar != null && (ahagVar = this.g) != null) {
                if (!ahns.q()) {
                    this.g.a(list2, list, this.e, this);
                    return;
                }
                ahoq ahoqVarW = ahvr.W(1342, "RecyclerView Data Diff");
                try {
                    ahagVar.a(list2, list, ahxtVar, this);
                    ahoqVarW.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        e();
    }
}
