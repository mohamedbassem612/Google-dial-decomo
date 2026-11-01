package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aobf implements java.lang.Thread.UncaughtExceptionHandler {
    public aobf(defpackage.aobu aobuVar) {
        j$.util.Objects.requireNonNull(aobuVar);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        throw new defpackage.anqz(anqw.d(th).f("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
