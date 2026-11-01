package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dzj implements android.view.View.OnApplyWindowInsetsListener {
    final /* synthetic */ defpackage.dyy a;

    public dzj(android.view.View view, defpackage.dyy dyyVar) {
        this.a = dyyVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        return this.a.dC(view, defpackage.eax.q(windowInsets, view)).e();
    }
}
