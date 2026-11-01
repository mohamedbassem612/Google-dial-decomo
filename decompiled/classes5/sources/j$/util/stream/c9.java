package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class c9 {
    public final j$.util.Spliterator a;
    public final boolean b;
    public final long c;
    public final java.util.concurrent.atomic.AtomicLong d;

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    public c9(j$.util.Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        this.b = i >>> 31;
        this.c = i >= 0 ? j2 : 0L;
        this.d = new java.util.concurrent.atomic.AtomicLong(i >= 0 ? j + j2 : j);
    }

    public final long a(long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j2;
        boolean z;
        long jMin;
        do {
            atomicLong = this.d;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                jMin = java.lang.Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - jMin));
        if (z) {
            return java.lang.Math.max(j - jMin, 0L);
        }
        long j3 = this.c;
        return j2 > j3 ? java.lang.Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    public j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        return new j$.util.stream.a9(spliterator, this);
    }

    public final j$.util.stream.b9 c() {
        if (this.d.get() > 0) {
            return j$.util.stream.b9.MAYBE_MORE;
        }
        return this.b ? j$.util.stream.b9.UNLIMITED : j$.util.stream.b9.NO_MORE;
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final j$.util.Spliterator trySplit() {
        j$.util.Spliterator spliteratorTrySplit;
        if (this.d.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(spliteratorTrySplit);
    }

    public c9(j$.util.Spliterator spliterator, j$.util.stream.c9 c9Var) {
        this.a = spliterator;
        this.b = c9Var.b;
        this.d = c9Var.d;
        this.c = c9Var.c;
    }
}
