package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afbm extends aw implements epb {
    private defpackage.afbl a;
    private com.google.android.libraries.social.licenses.LicenseMenuActivity b;

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final void f(java.util.List list) {
        defpackage.afbl afblVar = this.a;
        if (afblVar != null) {
            em emVar = ((en) afblVar).a;
            int i = emVar.f + 1;
            emVar.f = i;
            java.util.List list2 = emVar.d;
            if (list != list2) {
                java.util.List list3 = emVar.e;
                if (list == null) {
                    int size = list2.size();
                    emVar.d = null;
                    emVar.e = java.util.Collections.EMPTY_LIST;
                    emVar.a.d(0, size);
                    emVar.a();
                    return;
                }
                if (list2 != null) {
                    emVar.g.a.execute(new el(emVar, list2, list, i, 0));
                    return;
                }
                emVar.d = list;
                emVar.e = j$.util.DesugarCollections.unmodifiableList(list);
                emVar.a.b(0, list.size());
                emVar.a();
            }
        }
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(2131624302, viewGroup, false);
    }

    public final /* synthetic */ void a(epl eplVar, java.lang.Object obj) {
        f((java.util.List) obj);
    }

    public final void ai() {
        super.ai();
        az azVarG = G();
        if (azVarG != null) {
            epc.a(azVarG).b(54321);
        }
    }

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        az azVarG = G();
        android.support.v7.widget.RecyclerView recyclerViewFindViewById = view.findViewById(2131428457);
        this.a = new defpackage.afbl(this.b);
        recyclerViewFindViewById.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
        recyclerViewFindViewById.Y(this.a);
        recyclerViewFindViewById.at(new iy(azVarG));
        defpackage.afbk afbkVar = new defpackage.afbk(recyclerViewFindViewById, recyclerViewFindViewById.getPaddingLeft(), recyclerViewFindViewById.getPaddingTop(), recyclerViewFindViewById.getPaddingRight(), recyclerViewFindViewById.getPaddingBottom(), 0);
        int i = dzs.a;
        dzk.o(recyclerViewFindViewById, afbkVar);
        epc.a(azVarG).e(54321, this);
    }

    public final void b(epl eplVar) {
        f(null);
    }

    public final epl c(int i) {
        return new defpackage.afbj(G());
    }

    public final void g(android.content.Context context) {
        super.g(context);
        com.google.android.libraries.social.licenses.LicenseMenuActivity licenseMenuActivityG = G();
        if (licenseMenuActivityG instanceof com.google.android.libraries.social.licenses.LicenseMenuActivity) {
            this.b = licenseMenuActivityG;
        }
    }

    public final void i() {
        super.i();
        this.a = null;
    }

    public final void j() {
        super.j();
        this.b = null;
    }
}
