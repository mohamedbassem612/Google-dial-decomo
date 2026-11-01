package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afze extends defpackage.afpn {
    final /* synthetic */ com.google.android.material.search.SearchBar a;

    public afze(com.google.android.material.search.SearchBar searchBar) {
        j$.util.Objects.requireNonNull(searchBar);
        this.a = searchBar;
    }

    @Override // defpackage.afpn
    public final void a(int i, float f) {
        com.google.android.material.search.SearchBar searchBar = this.a;
        android.content.res.ColorStateList colorStateList = searchBar.E;
        if (colorStateList != null) {
            searchBar.H.R(android.content.res.ColorStateList.valueOf(defpackage.agab.ab(searchBar.D, colorStateList.getDefaultColor(), f)));
        }
    }
}
