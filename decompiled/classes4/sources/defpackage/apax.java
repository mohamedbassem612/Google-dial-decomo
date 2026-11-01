package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class apax extends java.lang.Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apax(java.lang.StackTraceElement[] stackTraceElementArr) {
        super("Coroutine encountered an exception.");
        aooh.f(stackTraceElementArr, "stackTrace");
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
