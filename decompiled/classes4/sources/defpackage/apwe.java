package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwe extends org.chromium.net.UploadDataSink {
    public final java.util.concurrent.atomic.AtomicInteger a;
    public final java.util.concurrent.Executor b;
    public final defpackage.apwx c;
    public java.nio.ByteBuffer d;
    public long e;
    public long f;
    public int g;
    public final java.net.HttpURLConnection h;
    public java.nio.channels.WritableByteChannel i;
    public java.io.OutputStream j;
    final /* synthetic */ defpackage.apwm k;
    private final java.util.concurrent.Executor l;
    private final java.util.concurrent.atomic.AtomicBoolean m;

    public apwe(defpackage.apwm apwmVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.net.HttpURLConnection httpURLConnection, defpackage.apwx apwxVar) {
        j$.util.Objects.requireNonNull(apwmVar);
        this.k = apwmVar;
        this.a = new java.util.concurrent.atomic.AtomicInteger(3);
        this.l = new defpackage.apwd(this, executor, 0);
        this.b = executor2;
        this.c = new defpackage.apwx(apwxVar);
        this.m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = httpURLConnection;
    }

    private final void h(java.lang.Runnable runnable, java.lang.String str) {
        new xkn("JavaUploadDataSinkBase#executeOnExecutor ".concat(str), 3, (byte[]) null);
        try {
            this.b.execute(new anxz(str, runnable, 14, (byte[]) null));
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

    public final void a(defpackage.apwn apwnVar, java.lang.String str) {
        try {
            new xkn(a.bx(str, "Cronet JavaUploadDataSinkBase#executeOnUploadExecutor "), 3, (byte[]) null);
            try {
                this.l.execute(new defpackage.apwa(this, str, apwnVar, 0));
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th) {
                try {
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.util.concurrent.RejectedExecutionException e) {
            g(e);
        }
    }

    public final void b() {
        a(new defpackage.apwb(this, 1), "readFromProvider");
    }

    public final void c() {
        h(d(new defpackage.apwb(this, 0)), "startRead");
    }

    protected final java.lang.Runnable d(defpackage.apwn apwnVar) {
        return new anxz(this.k, apwnVar, 15);
    }

    public final void e() {
        if (this.i == null || !this.m.compareAndSet(false, true)) {
            return;
        }
        this.i.close();
    }

    protected final void f() {
        e();
        this.k.g();
    }

    protected final void g(java.lang.Throwable th) {
        this.k.c(th);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(java.lang.Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 2)) {
            h(d(new defpackage.apwc(this, z, 0)), "onReadSucceeded");
            return;
        }
        throw new java.lang.IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + atomicInteger.get());
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(java.lang.Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(1, 2)) {
            c();
            return;
        }
        throw new java.lang.IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + atomicInteger.get());
    }
}
