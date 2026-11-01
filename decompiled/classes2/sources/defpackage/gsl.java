package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gsl extends gus {
    private final java.lang.Throwable a;

    public gsl(java.lang.Throwable th) {
        this.a = th;
    }

    public final java.lang.String toString() {
        return "FAILURE (" + this.a.getMessage() + ')';
    }
}
