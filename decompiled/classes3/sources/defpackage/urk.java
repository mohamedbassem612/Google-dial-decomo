package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class urk implements dyy {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.view.View b;

    public /* synthetic */ urk(int i, android.view.View view) {
        this.a = i;
        this.b = view;
    }

    public final eax dC(android.view.View view, eax eaxVar) {
        url.a.b().l("com/android/dialer/theme/edgetoedge/EdgeToEdgeInsets", "applyBottomInsetAsPadding", 39, "EdgeToEdgeInsets.java").v("Insets consumed.");
        this.b.setPadding(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), eaxVar.f(this.a).e);
        return eaxVar;
    }
}
