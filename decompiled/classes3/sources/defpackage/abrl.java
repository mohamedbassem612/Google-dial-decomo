package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abrl extends java.lang.RuntimeException {
    public abrl(java.lang.String str, java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Throwable th) {
        super(str, th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
