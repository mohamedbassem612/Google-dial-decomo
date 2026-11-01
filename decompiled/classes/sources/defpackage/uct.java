package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uct {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/alternativespamsolution/AlternativeSpamSolution");
    private final defpackage.aoin b;

    public uct(defpackage.aoin aoinVar) {
        this.b = aoinVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    public final boolean a(long j) {
        defpackage.ahvr.bQ(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31, "Call creation time should be non-negative, but is: %s", j);
        java.lang.Double d = (java.lang.Double) this.b.a();
        double dDoubleValue = d.doubleValue();
        defpackage.ahvr.cc(((dDoubleValue > 0.0d ? 1 : (dDoubleValue == 0.0d ? 0 : -1)) ^ (-1)) >>> 31, "Sample rate should be non-negative: %s", d);
        double d2 = dDoubleValue / 100.0d;
        double d3 = (j % 10000.0d) / 10000.0d;
        ?? r2 = (d3 > d2 ? 1 : (d3 == d2 ? 0 : -1)) >>> 31;
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/spam/alternativespamsolution/AlternativeSpamSolution", "shouldUseAlternativeSpamSolutionForCall", 49, "AlternativeSpamSolution.java")).M("Alternative spam solution used is %b, as random hash number is %f and sample rate is %f", java.lang.Boolean.valueOf((boolean) r2), java.lang.Double.valueOf(d3), java.lang.Double.valueOf(d2));
        return r2;
    }
}
