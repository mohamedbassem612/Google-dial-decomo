package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fyi extends defpackage.fyd {
    private final android.window.OnBackInvokedDispatcher a;
    private final int b;
    private final android.window.OnBackInvokedCallback e;
    private boolean f;

    public fyi(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.a = onBackInvokedDispatcher;
        this.b = i;
        this.e = android.os.Build.VERSION.SDK_INT == 33 ? new ls(this, 3) : new defpackage.fyh(this);
    }

    private final void e(boolean z) {
        boolean z2 = this.f;
        if (z) {
            if (z2) {
                return;
            }
            ae$.ExternalSyntheticApiModelOutline0.m(this.a, this.b, this.e);
            this.f = true;
            return;
        }
        if (z2) {
            ae$.ExternalSyntheticApiModelOutline0.m(this.a, this.e);
            this.f = false;
        }
    }

    @Override // defpackage.fyd
    protected final void c(boolean z) {
        e(z);
    }

    @Override // defpackage.fyd
    protected final void d() {
        e(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fyi(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this(onBackInvokedDispatcher, 1000000);
        if (onBackInvokedDispatcher == null) {
            defpackage.aooh.i("onBackInvokedDispatcher");
        }
    }
}
