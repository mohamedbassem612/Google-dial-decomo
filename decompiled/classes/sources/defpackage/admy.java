package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class admy {
    public static final defpackage.admy a;
    public static final java.util.Random b;
    public final long c;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        a = new defpackage.admy(3600L);
        b = new java.util.Random();
    }

    public admy(long j) {
        java.util.Set set = defpackage.adik.a;
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s must be greater than zero.", "expBackoffMaxDelaySeconds"));
        }
        this.c = j;
    }
}
