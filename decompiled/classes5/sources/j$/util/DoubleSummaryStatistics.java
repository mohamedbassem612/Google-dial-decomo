package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class DoubleSummaryStatistics implements java.util.function.DoubleConsumer {
    public double a;
    public double b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final void a(double d) {
        double d2 = d - this.a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.a = (d4 - d3) - d2;
        this.sum = d4;
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        this.count++;
        this.b += d;
        a(d);
        this.min = java.lang.Math.min(this.min, d);
        this.max = java.lang.Math.max(this.max, d);
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    public void combine(j$.util.DoubleSummaryStatistics doubleSummaryStatistics) {
        this.count += doubleSummaryStatistics.count;
        this.b += doubleSummaryStatistics.b;
        a(doubleSummaryStatistics.sum);
        a(doubleSummaryStatistics.a);
        this.min = java.lang.Math.min(this.min, doubleSummaryStatistics.min);
        this.max = java.lang.Math.max(this.max, doubleSummaryStatistics.max);
    }

    public final double getAverage() {
        if (getCount() <= 0) {
            return 0.0d;
        }
        double d = this.sum + this.a;
        if (java.lang.Double.isNaN(d) && java.lang.Double.isInfinite(this.b)) {
            d = this.b;
        }
        return d / getCount();
    }

    public final long getCount() {
        return this.count;
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMin() {
        return this.min;
    }

    public final java.lang.String toString() {
        java.lang.String simpleName = getClass().getSimpleName();
        java.lang.Long lValueOf = java.lang.Long.valueOf(getCount());
        double d = this.sum + this.a;
        if (java.lang.Double.isNaN(d) && java.lang.Double.isInfinite(this.b)) {
            d = this.b;
        }
        return java.lang.String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, java.lang.Double.valueOf(d), java.lang.Double.valueOf(getMin()), java.lang.Double.valueOf(getAverage()), java.lang.Double.valueOf(getMax()));
    }
}
