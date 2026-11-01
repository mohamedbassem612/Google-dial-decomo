package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kqn implements defpackage.kqq {
    public static final defpackage.kqn a = new defpackage.kqn();
    private static final j$.time.Duration b;
    private static final j$.time.Duration c;
    private static final j$.time.Duration d;

    static {
        j$.time.Duration duration = j$.time.Duration.ZERO;
        aooh.e(duration, "ZERO");
        b = duration;
        j$.time.Duration durationOfDays = j$.time.Duration.ofDays(30L);
        aooh.e(durationOfDays, "ofDays(...)");
        c = durationOfDays;
        j$.time.Duration durationOfHours = j$.time.Duration.ofHours(1L);
        aooh.e(durationOfHours, "ofHours(...)");
        d = durationOfHours;
    }

    @Override // defpackage.kqq
    public final defpackage.kqo a(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime) {
        aooh.f(zonedDateTime, "referenceDateTime");
        java.lang.Integer num = kqoVar.l;
        if (num != null && num.intValue() > zonedDateTime.getHour()) {
            j$.time.LocalDate localDate = zonedDateTime.toLocalDate();
            aooh.e(localDate, "toLocalDate(...)");
            return kqoVar.a(localDate);
        }
        j$.time.ZonedDateTime zonedDateTimePlus = zonedDateTime.plus(d);
        aooh.e(zonedDateTimePlus, "plus(...)");
        aooh.f(zonedDateTimePlus, "dateTime");
        int year = zonedDateTimePlus.getYear();
        int monthValue = zonedDateTimePlus.getMonthValue();
        return new defpackage.kqo(null, null, java.lang.Integer.valueOf(zonedDateTimePlus.getDayOfMonth()), java.lang.Integer.valueOf(monthValue), java.lang.Integer.valueOf(year), java.lang.Integer.valueOf(zonedDateTimePlus.getHour()), java.lang.Integer.valueOf(zonedDateTimePlus.getMinute()));
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
        if (zonedDateTimeB.isBefore(zonedDateTime)) {
            j$.time.ZonedDateTime zonedDateTimePlus = zonedDateTime.plus(d);
            aooh.c(zonedDateTimePlus);
            return zonedDateTimePlus;
        }
        if (zonedDateTimeB.toLocalDate().isAfter(zonedDateTime.toLocalDate())) {
            java.lang.Integer num = kqoVar.l;
            j$.time.ZonedDateTime zonedDateTimeWithHour = zonedDateTimeB.withHour(num != null ? num.intValue() : zonedDateTime.getHour());
            java.lang.Integer num2 = kqoVar.m;
            j$.time.ZonedDateTime zonedDateTimeWithMinute = zonedDateTimeWithHour.withMinute(num2 != null ? num2.intValue() : zonedDateTime.getMinute());
            aooh.c(zonedDateTimeWithMinute);
            return zonedDateTimeWithMinute;
        }
        java.lang.Integer num3 = kqoVar.l;
        if (num3 == null || num3.intValue() <= zonedDateTime.getHour()) {
            j$.time.ZonedDateTime zonedDateTimePlus2 = zonedDateTime.plus(d);
            aooh.c(zonedDateTimePlus2);
            return zonedDateTimePlus2;
        }
        j$.time.ZonedDateTime zonedDateTimeWithHour2 = zonedDateTime.withHour(num3.intValue());
        java.lang.Integer num4 = kqoVar.m;
        j$.time.ZonedDateTime zonedDateTimeWithMinute2 = zonedDateTimeWithHour2.withMinute(num4 != null ? num4.intValue() : 0);
        aooh.c(zonedDateTimeWithMinute2);
        return zonedDateTimeWithMinute2;
    }

    @Override // defpackage.kqq
    public final boolean e() {
        return false;
    }
}
