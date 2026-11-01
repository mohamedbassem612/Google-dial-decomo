package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afsi {
    static final double[][] a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    static final double[] b = {95.047d, 100.0d, 108.883d};
    public static final /* synthetic */ int c = 0;

    public static double a(double d) {
        return d > 0.008856451679035631d ? java.lang.Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double b(int i) {
        double d = ((double) i) / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : java.lang.Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static int c(double[] dArr) {
        int iAE = a.aE(dArr[0]);
        int i = (iAE << 16) | (-16777216);
        return i | (a.aE(dArr[1]) << 8) | a.aE(dArr[2]);
    }
}
