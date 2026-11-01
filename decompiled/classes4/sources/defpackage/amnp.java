package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amnp {
    public static final double[][] a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[] b = {95.047d, 100.0d, 108.883d};

    public static final int a(double d) {
        double d2 = d / 100.0d;
        return aooc.w(aopc.h((d2 <= 0.0031308d ? d2 * 12.92d : (java.lang.Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, 255);
    }

    public static final double b(int i) {
        double d = ((double) i) / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : java.lang.Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static final int c(double[] dArr) {
        return ((a(dArr[0]) & 255) << 16) | (-16777216) | ((a(dArr[1]) & 255) << 8) | (a(dArr[2]) & 255);
    }

    public static final int d(double d) {
        int iA = a(anar.g((d + 16.0d) / 116.0d) * 100.0d) & 255;
        return (iA << 16) | (-16777216) | (iA << 8) | iA;
    }
}
