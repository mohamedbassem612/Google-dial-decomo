package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahng extends java.lang.IllegalStateException {
    public ahng(java.lang.String str) {
        super(a(null, str));
    }

    private static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return a.bD(str == null ? "" : ": ".concat(str), str2, "Starting new trace ", " when already associated with a trace", ". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
    }

    public ahng(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        super(a(str, str2), th);
    }
}
