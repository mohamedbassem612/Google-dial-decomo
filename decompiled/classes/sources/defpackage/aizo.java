package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aizo {
    public static final /* synthetic */ int a = 0;
    private static final j$.time.Duration b;
    private static final j$.time.Duration c;

    static {
        j$.time.Duration.ofSeconds(Long.MIN_VALUE);
        j$.time.Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        j$.time.Duration.ofMillis(Long.MAX_VALUE);
        j$.time.Duration.ofMillis(Long.MIN_VALUE);
        c(Long.MAX_VALUE);
        c(Long.MIN_VALUE);
        b = j$.time.Duration.ofNanos(Long.MAX_VALUE);
        c = j$.time.Duration.ofNanos(Long.MIN_VALUE);
        java.math.BigDecimal.valueOf(9.223372036854776E18d);
        java.math.BigDecimal.valueOf(-9.223372036854776E18d);
        j$.time.Duration.ofMillis(Long.MAX_VALUE).plusNanos(999999L);
    }

    public static double a(j$.time.Duration duration) {
        return duration.getSeconds() + (((double) duration.getNano()) / 1.0E9d);
    }

    public static long b(j$.time.Duration duration) {
        if (duration.compareTo(b) >= 0) {
            return Long.MAX_VALUE;
        }
        if (duration.compareTo(c) > 0) {
            try {
                return duration.toNanos();
            } catch (java.lang.ArithmeticException unused) {
                if (!duration.isNegative()) {
                    return Long.MAX_VALUE;
                }
            }
        }
        return Long.MIN_VALUE;
    }

    public static j$.time.Duration c(long j) {
        return j$.time.Duration.of(j, j$.time.temporal.ChronoUnit.MICROS);
    }
}
