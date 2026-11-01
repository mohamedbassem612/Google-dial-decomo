package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class apzr {
    final sun.misc.Unsafe a;

    public apzr(sun.misc.Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(java.lang.Object obj, long j);

    public abstract float b(java.lang.Object obj, long j);

    public abstract void c(java.lang.Object obj, long j, boolean z);

    public abstract void d(java.lang.Object obj, long j, double d);

    public abstract void e(java.lang.Object obj, long j, float f);

    public abstract boolean f(java.lang.Object obj, long j);

    public final int g(java.lang.Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long h(java.lang.Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final void i(java.lang.Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void j(java.lang.Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }
}
