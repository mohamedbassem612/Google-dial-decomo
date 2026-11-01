package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rrm {
    public static final aimz a = aimz.i("com/android/dialer/main/impl/ui/searchcontainer/NewSearchBarSearchFragmentPeer");
    public final defpackage.rrl b;
    public final java.lang.String c;
    public final android.view.inputmethod.InputMethodManager d;
    public final ruc e;
    public final ajwr f;
    public final gpd g;
    public final aogc h;

    public rrm(defpackage.rrl rrlVar, java.lang.String str, android.view.inputmethod.InputMethodManager inputMethodManager, ajwr ajwrVar, gpd gpdVar, aogc aogcVar, ahpz ahpzVar, ruc rucVar) {
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rucVar, "metrics");
        this.b = rrlVar;
        this.c = str;
        this.d = inputMethodManager;
        this.f = ajwrVar;
        this.g = gpdVar;
        this.h = aogcVar;
        this.e = rucVar;
    }

    public final com.google.android.material.search.SearchView a() {
        android.view.View viewM = ft$.ExternalSyntheticApiModelOutline0.m(this.b.N(), 2131428887);
        aooh.e(viewM, "requireViewById(...)");
        return (com.google.android.material.search.SearchView) viewM;
    }
}
