package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizp {
    static {
        j$.time.Instant.ofEpochMilli(Long.MAX_VALUE);
        j$.time.Instant.ofEpochMilli(Long.MIN_VALUE);
        a(Long.MAX_VALUE);
        a(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        j$.time.Instant.MIN.getEpochSecond();
        j$.time.Instant.MAX.getEpochSecond();
    }

    public static j$.time.Instant a(long j) {
        return j$.time.Instant.ofEpochSecond(aiql.ag(j, 1000000L, java.math.RoundingMode.FLOOR), aiql.af(j, 1000000) * 1000);
    }

    public static void b(long j) {
        j$.time.Instant.ofEpochSecond(aiql.ag(j, 1000000000L, java.math.RoundingMode.FLOOR), aiql.af(j, 1000000000));
    }
}
