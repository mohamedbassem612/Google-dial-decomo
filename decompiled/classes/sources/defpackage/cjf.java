package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cjf extends java.util.concurrent.CancellationException {
    public cjf() {
        super("The coroutine was canceled because it left the composition");
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(defpackage.cjg.a);
        return this;
    }
}
