package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yoy {
    private static final double a = 0.01980262729617973d;

    public static long a(long j) {
        if (j > 0) {
            return java.lang.Math.round(java.lang.Math.pow(1.02d, java.lang.Math.round((java.lang.Math.log(j + 10.0d) / a) - 113.0d) + 113.0d) - 10.0d);
        }
        return 0L;
    }
}
