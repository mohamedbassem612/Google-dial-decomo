package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ruf implements android.view.ViewTreeObserver.OnDrawListener {
    public final android.view.View a;
    public final android.view.ViewTreeObserver b;
    public final java.lang.Runnable c;
    public final boolean d;
    private boolean e = false;

    public ruf(android.view.View view, android.view.ViewTreeObserver viewTreeObserver, java.lang.Runnable runnable, boolean z) {
        this.a = view;
        this.b = viewTreeObserver;
        this.c = runnable;
        this.d = z;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.post(new defpackage.ddv(this, 14));
    }
}
