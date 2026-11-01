package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;
    private final java.lang.String mZoneShortName;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        MAX_ZONE_OFFSET_SECONDS = 64800L;
    }

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    public static androidx.car.app.model.DateTimeWithZone create(long j, int i, java.lang.String str) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Time since epoch must be greater than or equal to zero");
        }
        if (java.lang.Math.abs(i) > MAX_ZONE_OFFSET_SECONDS) {
            throw new java.lang.IllegalArgumentException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (((java.lang.String) j$.util.Objects.requireNonNull(str)).isEmpty()) {
            throw new java.lang.IllegalArgumentException("The time zone short name can not be null or empty");
        }
        return new androidx.car.app.model.DateTimeWithZone(j, i, str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.DateTimeWithZone) {
            androidx.car.app.model.DateTimeWithZone dateTimeWithZone = (androidx.car.app.model.DateTimeWithZone) obj;
            if (this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && j$.util.Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName)) {
                return true;
            }
        }
        return false;
    }

    public long getTimeSinceEpochMillis() {
        return this.mTimeSinceEpochMillis;
    }

    public int getZoneOffsetSeconds() {
        return this.mZoneOffsetSeconds;
    }

    public java.lang.String getZoneShortName() {
        return this.mZoneShortName;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.mTimeSinceEpochMillis), java.lang.Integer.valueOf(this.mZoneOffsetSeconds), this.mZoneShortName});
    }

    public java.lang.String toString() {
        return "[time since epoch (ms): " + this.mTimeSinceEpochMillis + "( " + new java.util.Date(this.mTimeSinceEpochMillis) + ")  zone offset (s): " + this.mZoneOffsetSeconds + ", zone: " + this.mZoneShortName + ']';
    }

    private DateTimeWithZone(long j, int i, java.lang.String str) {
        this.mTimeSinceEpochMillis = j;
        this.mZoneOffsetSeconds = i;
        this.mZoneShortName = str;
    }

    public static androidx.car.app.model.DateTimeWithZone create(long j, java.util.TimeZone timeZone) {
        if (j >= 0) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            return create(j, (int) (((long) ((java.util.TimeZone) j$.util.Objects.requireNonNull(timeZone)).getOffset(j)) / 1000), timeZone.getDisplayName(false, 0));
        }
        throw new java.lang.IllegalArgumentException("timeSinceEpochMillis must be greater than or equal to zero");
    }

    public static androidx.car.app.model.DateTimeWithZone create(j$.time.ZonedDateTime zonedDateTime) {
        j$.time.LocalDateTime localDateTime = ((j$.time.ZonedDateTime) j$.util.Objects.requireNonNull(zonedDateTime)).toLocalDateTime();
        j$.time.ZoneId zone = zonedDateTime.getZone();
        j$.time.ZoneOffset offset = zone.getRules().getOffset(localDateTime);
        return create(java.util.concurrent.TimeUnit.SECONDS.toMillis(localDateTime.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(j$.time.format.TextStyle.SHORT, java.util.Locale.getDefault()));
    }
}
