package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aobo {
    public final java.lang.Object a;
    java.util.concurrent.Future b;
    public boolean c;

    public aobo(java.lang.Object obj) {
        this.a = obj;
    }

    public final java.util.concurrent.Future a() {
        this.c = true;
        return this.b;
    }

    final void b(java.util.concurrent.Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.c;
            if (!z) {
                this.b = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }
}
