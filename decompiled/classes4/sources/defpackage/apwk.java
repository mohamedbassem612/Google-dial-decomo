package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwk {
    final defpackage.apwy a;
    final java.util.concurrent.Executor b;
    final java.util.concurrent.Executor c;
    public final /* synthetic */ defpackage.apwm d;

    public apwk(defpackage.apwm apwmVar, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor) {
        j$.util.Objects.requireNonNull(apwmVar);
        this.d = apwmVar;
        this.a = new defpackage.apwy(callback);
        if (apwmVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new defpackage.dxq(executor, 2);
            this.c = executor;
        }
    }

    public final void a(defpackage.apwn apwnVar, java.lang.String str) {
        try {
            b(new anxz(this.d, apwnVar, 18), str);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            this.d.b(new defpackage.apvl("Exception posting task to executor", e));
        }
    }

    final void b(java.lang.Runnable runnable, java.lang.String str) {
        new xkn("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str), 3, (byte[]) null);
        try {
            this.b.execute(new defpackage.apwi(str, runnable, 2));
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        this.d.d(new defpackage.aobd(this, 19), "maybeReportMetrics");
    }

    final void d() {
        a(new defpackage.apwb(this, 5), "onResponseStarted");
    }
}
