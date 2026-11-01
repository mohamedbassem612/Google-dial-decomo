package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kqo {
    public static final aimz a = aimz.i("com/android/dialer/callnotesinfra/summarizer/callaction/PartialTime");
    public static final aopq b = new aopq(1, 31);
    public static final aopq c = new aopq(1, 12);
    public static final aopq d = new aopq(1900, 3000);
    public static final aopq e = new aopq(0, 23);
    public static final aopq f = new aopq(0, 59);
    public final java.lang.String g;
    public final j$.time.DayOfWeek h;
    public final java.lang.Integer i;
    public final java.lang.Integer j;
    public final java.lang.Integer k;
    public final java.lang.Integer l;
    public final java.lang.Integer m;

    public kqo(java.lang.String str, j$.time.DayOfWeek dayOfWeek, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5) {
        this.g = str;
        this.h = dayOfWeek;
        this.i = num;
        this.j = num2;
        this.k = num3;
        this.l = num4;
        this.m = num5;
    }

    public static /* synthetic */ defpackage.kqo c(defpackage.kqo kqoVar, j$.time.DayOfWeek dayOfWeek, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i) {
        java.lang.String str = (i & 1) != 0 ? kqoVar.g : null;
        if ((i & 2) != 0) {
            dayOfWeek = kqoVar.h;
        }
        j$.time.DayOfWeek dayOfWeek2 = dayOfWeek;
        if ((i & 4) != 0) {
            num = kqoVar.i;
        }
        java.lang.Integer num4 = num;
        if ((i & 8) != 0) {
            num2 = kqoVar.j;
        }
        java.lang.Integer num5 = num2;
        if ((i & 16) != 0) {
            num3 = kqoVar.k;
        }
        return new defpackage.kqo(str, dayOfWeek2, num4, num5, num3, kqoVar.l, kqoVar.m);
    }

    public final defpackage.kqo a(j$.time.LocalDate localDate) {
        aooh.f(localDate, "date");
        return c(this, null, java.lang.Integer.valueOf(localDate.getDayOfMonth()), java.lang.Integer.valueOf(localDate.getMonthValue()), java.lang.Integer.valueOf(localDate.getYear()), 97);
    }

    public final j$.time.ZonedDateTime b(j$.time.ZoneId zoneId) {
        aooh.f(zoneId, "zoneId");
        java.lang.Integer num = this.k;
        if (num == null) {
            throw new java.lang.IllegalStateException("Year must be present");
        }
        java.lang.Integer num2 = this.j;
        int iIntValue = num.intValue();
        if (num2 == null) {
            throw new java.lang.IllegalStateException("Month must be present");
        }
        java.lang.Integer num3 = this.i;
        int iIntValue2 = num2.intValue();
        if (num3 == null) {
            throw new java.lang.IllegalStateException("Day must be present");
        }
        java.lang.Integer num4 = this.l;
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        java.lang.Integer num5 = this.m;
        j$.time.ZonedDateTime zonedDateTimeOf = j$.time.ZonedDateTime.of(iIntValue, iIntValue2, iIntValue3, iIntValue4, num5 != null ? num5.intValue() : 0, 0, 0, zoneId);
        aooh.e(zonedDateTimeOf, "of(...)");
        return zonedDateTimeOf;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kqo) {
            defpackage.kqo kqoVar = (defpackage.kqo) obj;
            if (aooh.n(this.g, kqoVar.g) && this.h == kqoVar.h && aooh.n(this.i, kqoVar.i) && aooh.n(this.j, kqoVar.j) && aooh.n(this.k, kqoVar.k) && aooh.n(this.l, kqoVar.l) && aooh.n(this.m, kqoVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.g;
        int iHashCode = str == null ? 0 : str.hashCode();
        j$.time.DayOfWeek dayOfWeek = this.h;
        int iHashCode2 = dayOfWeek == null ? 0 : dayOfWeek.hashCode();
        int i = iHashCode * 31;
        java.lang.Integer num = this.i;
        int iHashCode3 = (((i + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.j;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.k;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Integer num4 = this.l;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.Integer num5 = this.m;
        return iHashCode6 + (num5 != null ? num5.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "PartialTime(debugDateString=" + this.g + ", dayOfWeek=" + this.h + ", day=" + this.i + ", month=" + this.j + ", year=" + this.k + ", hour=" + this.l + ", minutes=" + this.m + ')';
    }

    public kqo() {
        this(null, null, null, null, null, null, null);
    }
}
