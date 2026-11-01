package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class anpz extends ajsz {
    protected abstract ajsz c();

    public final boolean du() {
        return c().du();
    }

    public void dv(java.lang.String str, java.lang.Throwable th) {
        c().dv(str, th);
    }

    public void dw() {
        c().dw();
    }

    public void dx(int i) {
        c().dx(i);
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("delegate", c());
        return ahymVarL.toString();
    }
}
