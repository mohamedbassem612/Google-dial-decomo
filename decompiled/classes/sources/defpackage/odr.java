package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class odr implements java.lang.Thread.UncaughtExceptionHandler {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/errors/uncaughtexception/UncaughtExceptionInterceptor");
    private final j$.util.Optional b = j$.util.Optional.ofNullable(java.lang.Thread.getDefaultUncaughtExceptionHandler());
    private final java.lang.Thread.UncaughtExceptionHandler c;

    public odr(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.c = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            this.c.uncaughtException(thread, th);
        } catch (java.lang.RuntimeException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/errors/uncaughtexception/UncaughtExceptionInterceptor", "uncaughtException", '2', "UncaughtExceptionInterceptor.java")).v("Reporting exception to intermediate handler failed.");
        }
        j$.util.Optional optional = this.b;
        if (optional.isPresent()) {
            ((java.lang.Thread.UncaughtExceptionHandler) optional.orElseThrow()).uncaughtException(thread, th);
        } else {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/errors/uncaughtexception/UncaughtExceptionInterceptor", "uncaughtException", '@', "UncaughtExceptionInterceptor.java")).v("Unable to report exception to original handler; no default handler was set.");
        }
    }
}
