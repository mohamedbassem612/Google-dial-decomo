package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class v8 {
    public final long a;
    public final long b;
    public j$.util.Spliterator c;
    public long d;
    public long e;

    public v8(j$.util.Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.c = spliterator;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    public j$.util.Spliterator a(j$.util.Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new j$.util.stream.q8((j$.util.p0) spliterator, j, j2, j3, j4);
    }

    public final int characteristics() {
        return this.c.characteristics();
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - java.lang.Math.max(j2, this.d);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final j$.util.Spliterator m5trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            j$.util.Spliterator spliteratorTrySplit = this.c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.d;
            long jMin = java.lang.Math.min(jEstimateSize, this.b);
            long j2 = this.a;
            if (j2 >= jMin) {
                this.d = jMin;
            } else {
                long j3 = this.b;
                if (jMin < j3) {
                    long j4 = this.d;
                    if (j4 < j2 || jEstimateSize > j3) {
                        this.d = jMin;
                        return a(spliteratorTrySplit, j2, j3, j4, jMin);
                    }
                    this.d = jMin;
                    return spliteratorTrySplit;
                }
                this.c = spliteratorTrySplit;
                this.e = jMin;
            }
        }
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ j$.util.w0 m7trySplit() {
        return (j$.util.w0) m5trySplit();
    }

    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return (j$.util.Spliterator.OfInt) m5trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfLong m4trySplit() {
        return (j$.util.Spliterator.OfLong) m5trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ j$.util.p0 m6trySplit() {
        return (j$.util.p0) m5trySplit();
    }
}
