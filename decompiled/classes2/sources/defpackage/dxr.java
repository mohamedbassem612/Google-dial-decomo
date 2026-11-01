package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dxr implements java.lang.Runnable {
    private final java.util.concurrent.Callable a;
    private final dxw b;
    private final android.os.Handler c;

    public dxr(android.os.Handler handler, java.util.concurrent.Callable callable, dxw dxwVar) {
        this.a = callable;
        this.b = dxwVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amwp amwpVarCall;
        try {
            amwpVarCall = ((defpackage.dxl) this.a).call();
        } catch (java.lang.Exception unused) {
            amwpVarCall = null;
        }
        this.c.post(new ad(this.b, amwpVarCall, 17));
    }
}
