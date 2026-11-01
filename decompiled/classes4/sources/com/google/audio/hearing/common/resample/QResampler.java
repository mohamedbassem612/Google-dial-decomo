package com.google.audio.hearing.common.resample;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class QResampler {
    private static final aimz d = aimz.i("com/google/audio/hearing/common/resample/QResampler");
    public long a;
    public final double b;
    public final double c;

    static {
        java.lang.System.loadLibrary("resampler");
    }

    public QResampler(double d2, double d3) {
        this.a = 0L;
        this.b = d2;
        this.c = d3;
        this.a = init(d2, d3);
    }

    private native void destroy(long j);

    private native long init(double d2, double d3);

    private native float[] process(long j, float[] fArr);

    public final void a() {
        long j = this.a;
        if (j == 0) {
            d.c().l("com/google/audio/hearing/common/resample/QResampler", "destroy", 77, "QResampler.java").v("destroy() called multiple times or without call to init()!");
        } else {
            destroy(j);
            this.a = 0L;
        }
    }

    public final float[] b(float[] fArr) {
        return this.b == this.c ? java.util.Arrays.copyOf(fArr, fArr.length) : process(this.a, fArr);
    }
}
