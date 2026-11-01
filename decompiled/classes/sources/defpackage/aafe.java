package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aafe {
    public volatile defpackage.aafc a;
    private final java.util.concurrent.Executor b;

    public aafe(java.util.concurrent.Executor executor, java.lang.Object obj, java.lang.String str) {
        defpackage.aais.at(executor, "Executor must not be null");
        this.b = executor;
        defpackage.aais.at(obj, "Listener must not be null");
        defpackage.aais.ap(str);
        this.a = new defpackage.aafc(obj, str);
    }

    public final void a() {
        this.a = null;
    }

    public final void b(aafd aafdVar) {
        this.b.execute(new wdm(this, aafdVar, 15, (byte[]) null));
    }

    public aafe(android.os.Looper looper, java.lang.Object obj, java.lang.String str) {
        this.b = new defpackage.aauo(looper, 1);
        defpackage.aais.ap(str);
        this.a = new defpackage.aafc(obj, str);
    }
}
