package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kqp implements defpackage.kqq {
    public static final defpackage.kqp a = new defpackage.kqp();
    private static final j$.time.Duration b;
    private static final j$.time.Duration c;

    static {
        j$.time.Duration durationOfDays = j$.time.Duration.ofDays(1L);
        aooh.e(durationOfDays, "ofDays(...)");
        b = durationOfDays;
        j$.time.Duration durationOfDays2 = j$.time.Duration.ofDays(60L);
        aooh.e(durationOfDays2, "ofDays(...)");
        c = durationOfDays2;
    }

    @Override // defpackage.kqq
    public final defpackage.kqo a(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime) {
        aooh.f(zonedDateTime, "referenceDateTime");
        j$.time.LocalDate localDate = (kqoVar.l == null && kqoVar.m == null) ? zonedDateTime.plusDays(1L).toLocalDate() : zonedDateTime.toLocalDate();
        aooh.c(localDate);
        return kqoVar.a(localDate);
    }

    @Override // defpackage.kqq
    public final j$.time.Duration b() {
        return c;
    }

    @Override // defpackage.kqq
    public final j$.time.Duration c() {
        return b;
    }

    @Override // defpackage.kqq
    public final j$.time.ZonedDateTime d(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime) {
        aooh.f(zonedDateTime, "referenceDateTime");
        j$.time.ZoneId zone = zonedDateTime.getZone();
        aooh.e(zone, "getZone(...)");
        j$.time.ZonedDateTime zonedDateTimeB = kqoVar.b(zone);
        java.lang.Integer num = kqoVar.l;
        int iIntValue = num != null ? num.intValue() : 10;
        java.lang.Integer num2 = kqoVar.m;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        if (zonedDateTimeB.toLocalDate().isBefore(zonedDateTime.toLocalDate())) {
            j$.time.ZonedDateTime zonedDateTimeWithMinute = zonedDateTime.plusDays(1L).withHour(iIntValue).withMinute(iIntValue2);
            aooh.c(zonedDateTimeWithMinute);
            return zonedDateTimeWithMinute;
        }
        if (zonedDateTimeB.toLocalDate().isAfter(zonedDateTime.toLocalDate())) {
            j$.time.ZonedDateTime zonedDateTimeWithMinute2 = zonedDateTimeB.withHour(iIntValue).withMinute(iIntValue2);
            aooh.c(zonedDateTimeWithMinute2);
            return zonedDateTimeWithMinute2;
        }
        if (num != null) {
            j$.time.ZonedDateTime zonedDateTimeWithMinute3 = zonedDateTimeB.isAfter(zonedDateTime.plusHours(1L)) ? zonedDateTimeB.withHour(zonedDateTimeB.getHour()).withMinute(zonedDateTimeB.getMinute()) : zonedDateTimeB.plusDays(1L).withHour(zonedDateTimeB.getHour()).withMinute(zonedDateTimeB.getMinute());
            aooh.c(zonedDateTimeWithMinute3);
            return zonedDateTimeWithMinute3;
        }
        j$.time.ZonedDateTime zonedDateTimeWithMinute4 = zonedDateTime.plusHours(2L).withMinute(zonedDateTimeB.getMinute());
        aooh.c(zonedDateTimeWithMinute4);
        return zonedDateTimeWithMinute4;
    }

    @Override // defpackage.kqq
    public final boolean e() {
        return true;
    }
}
