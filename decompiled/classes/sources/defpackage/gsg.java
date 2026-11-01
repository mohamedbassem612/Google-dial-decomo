package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gsg {
    public android.content.Context a;
    public androidx.work.WorkerParameters b;
    public boolean c;
    private final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger(-256);

    public gsg(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new java.lang.IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public defpackage.ajcq a() {
        return defpackage.dff.m(new gsc());
    }

    public abstract defpackage.ajcq b();

    public final int e() {
        return this.d.get();
    }

    public final defpackage.grp f() {
        return this.b.b;
    }

    public final java.util.UUID g() {
        return this.b.a;
    }

    public final java.util.concurrent.Executor h() {
        return this.b.e;
    }

    public final void i(int i) {
        if (this.d.compareAndSet(-256, i)) {
            d();
        }
    }

    public final boolean j() {
        return this.d.get() != -256;
    }

    public void d() {
    }
}
