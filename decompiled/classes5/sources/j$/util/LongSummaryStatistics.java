package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class LongSummaryStatistics implements java.util.function.LongConsumer, java.util.function.IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = java.lang.Math.min(this.min, j);
        this.max = java.lang.Math.max(this.max, j);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public void combine(j$.util.LongSummaryStatistics longSummaryStatistics) {
        this.count += longSummaryStatistics.count;
        this.sum += longSummaryStatistics.sum;
        this.min = java.lang.Math.min(this.min, longSummaryStatistics.min);
        this.max = java.lang.Math.max(this.max, longSummaryStatistics.max);
    }

    public final double getAverage() {
        if (getCount() > 0) {
            return this.sum / getCount();
        }
        return 0.0d;
    }

    public final long getCount() {
        return this.count;
    }

    public final long getMax() {
        return this.max;
    }

    public final long getMin() {
        return this.min;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", getClass().getSimpleName(), java.lang.Long.valueOf(getCount()), java.lang.Long.valueOf(this.sum), java.lang.Long.valueOf(getMin()), java.lang.Double.valueOf(getAverage()), java.lang.Long.valueOf(getMax()));
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        accept(i);
    }
}
