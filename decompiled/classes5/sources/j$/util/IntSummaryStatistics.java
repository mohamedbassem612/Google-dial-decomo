package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class IntSummaryStatistics implements java.util.function.IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        this.count++;
        this.sum += (long) i;
        this.min = java.lang.Math.min(this.min, i);
        this.max = java.lang.Math.max(this.max, i);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public void combine(j$.util.IntSummaryStatistics intSummaryStatistics) {
        this.count += intSummaryStatistics.count;
        this.sum += intSummaryStatistics.sum;
        this.min = java.lang.Math.min(this.min, intSummaryStatistics.min);
        this.max = java.lang.Math.max(this.max, intSummaryStatistics.max);
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

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", getClass().getSimpleName(), java.lang.Long.valueOf(getCount()), java.lang.Long.valueOf(this.sum), java.lang.Integer.valueOf(getMin()), java.lang.Double.valueOf(getAverage()), java.lang.Integer.valueOf(getMax()));
    }
}
