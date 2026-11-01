package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aozr extends java.util.concurrent.CancellationException {
    public final transient java.lang.Object a;

    public aozr(java.lang.Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        if (defpackage.aosu.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
