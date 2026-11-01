package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aesq {
    public long a;

    final long a(android.view.FrameMetrics frameMetrics, long j) {
        long metric = frameMetrics.getMetric(10);
        long metric2 = frameMetrics.getMetric(8);
        long j2 = metric + metric2;
        long jMax = java.lang.Math.max(this.a + j, metric + j);
        this.a = jMax;
        long j3 = jMax - metric;
        if (j2 >= jMax && metric2 >= j) {
            this.a = (j2 - ((j2 - frameMetrics.getMetric(11)) % j)) + j;
        }
        return j3;
    }
}
