package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum agya {
    DONT_CARE(j$.time.Duration.ofMillis(Long.MAX_VALUE)),
    SAME_WEEK(j$.time.Duration.ofDays(7)),
    SAME_DAY(j$.time.Duration.ofDays(1)),
    FEW_HOURS(j$.time.Duration.ofHours(4)),
    ONE_HOUR(j$.time.Duration.ofHours(1)),
    HALF_HOUR(j$.time.Duration.ofMinutes(30)),
    TEN_MINUTES(j$.time.Duration.ofMinutes(10)),
    FEW_MINUTES(j$.time.Duration.ofMinutes(4)),
    ONE_MINUTE(j$.time.Duration.ofMinutes(1)),
    FEW_SECONDS(j$.time.Duration.ofSeconds(4));

    final j$.time.Duration k;

    agya(j$.time.Duration duration) {
        this.k = duration;
    }
}
