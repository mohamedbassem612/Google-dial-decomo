package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rrr {
    public static final aimz a = aimz.i("com/android/dialer/main/impl/ui/searchcontainer/SearchBarSearchFragmentPeer");
    public final rro b;
    public final java.lang.String c;
    public final android.view.inputmethod.InputMethodManager d;
    public final ahpz e;
    public final ruc f;
    public final ajwr g;
    public final gpd h;
    public final ahbv i;
    public final aogc j;

    public rrr(rro rroVar, java.lang.String str, android.view.inputmethod.InputMethodManager inputMethodManager, ajwr ajwrVar, gpd gpdVar, aogc aogcVar, ahpz ahpzVar, ruc rucVar, ahbv ahbvVar) {
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rucVar, "metrics");
        this.b = rroVar;
        this.c = str;
        this.d = inputMethodManager;
        this.g = ajwrVar;
        this.h = gpdVar;
        this.j = aogcVar;
        this.e = ahpzVar;
        this.f = rucVar;
        this.i = ahbvVar;
    }

    public final com.google.android.material.search.SearchView a() {
        android.view.View viewM = ft$.ExternalSyntheticApiModelOutline0.m(this.b.N(), 2131428887);
        aooh.e(viewM, "requireViewById(...)");
        return (com.google.android.material.search.SearchView) viewM;
    }
}
