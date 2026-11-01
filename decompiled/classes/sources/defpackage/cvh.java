package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cvh extends java.util.concurrent.CancellationException {
    public cvh(long j) {
        super(defpackage.a.bC(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(cvz.a);
        return this;
    }
}
