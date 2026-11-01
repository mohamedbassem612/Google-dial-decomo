package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afzk implements defpackage.afpa {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.afpb a;
    final /* synthetic */ defpackage.afzu b;

    public afzk(defpackage.afzu afzuVar, defpackage.afpb afpbVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = afpbVar;
        j$.util.Objects.requireNonNull(afzuVar);
        this.b = afzuVar;
    }

    @Override // defpackage.afpa
    public final void a() {
        int i = this.$cid;
        defpackage.afzu afzuVar = this.b;
        if (i != 0) {
            afzuVar.s.c(true);
            com.google.android.material.search.SearchView searchView = afzuVar.a;
            if (!searchView.k()) {
                searchView.d();
            }
            searchView.m(4, true);
            if (afzuVar.m == this.a) {
                afzuVar.m = null;
                return;
            }
            return;
        }
        afzuVar.s.c(false);
        afzuVar.c.setVisibility(8);
        com.google.android.material.search.SearchView searchView2 = afzuVar.a;
        if (!searchView2.k()) {
            afzuVar.j.clearFocus();
        }
        searchView2.m(2, true);
        if (afzuVar.m == this.a) {
            afzuVar.m = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afpa
    public final void b() {
        int i = this.$cid;
        defpackage.afzu afzuVar = this.b;
        if (i == 0) {
            afzuVar.s.d(false);
            afzuVar.a.m(1, true);
            return;
        }
        afzuVar.s.d(true);
        afzuVar.c.setVisibility(0);
        com.google.android.material.search.SearchBar searchBar = afzuVar.q;
        agab agabVar = searchBar.K;
        android.view.View view = searchBar.F;
        if (view instanceof defpackage.afox) {
            ((defpackage.afox) view).a();
        }
        if (view != 0) {
            view.setAlpha(0.0f);
        }
    }

    public afzk(defpackage.afzu afzuVar, defpackage.afpb afpbVar, int i) {
        this.$cid = i;
        this.a = afpbVar;
        j$.util.Objects.requireNonNull(afzuVar);
        this.b = afzuVar;
    }
}
