package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class epm extends java.util.concurrent.FutureTask {
    final /* synthetic */ defpackage.epn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epm(defpackage.epn epnVar, java.util.concurrent.Callable callable) {
        super(callable);
        this.a = epnVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            this.a.e(get());
        } catch (java.lang.InterruptedException e) {
            android.util.Log.w("AsyncTask", e);
        } catch (java.util.concurrent.CancellationException unused) {
            this.a.e(null);
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (java.lang.Throwable th) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
