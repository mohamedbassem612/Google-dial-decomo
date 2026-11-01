package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class DayOfWeek implements j$.time.temporal.TemporalAccessor, j$.time.temporal.TemporalAdjuster {
    public static final j$.time.DayOfWeek FRIDAY;
    public static final j$.time.DayOfWeek MONDAY;
    public static final j$.time.DayOfWeek SATURDAY;
    public static final j$.time.DayOfWeek SUNDAY;
    public static final j$.time.DayOfWeek THURSDAY;
    public static final j$.time.DayOfWeek TUESDAY;
    public static final j$.time.DayOfWeek WEDNESDAY;
    public static final j$.time.DayOfWeek[] a;
    public static final /* synthetic */ j$.time.DayOfWeek[] b;

    static {
        j$.time.DayOfWeek dayOfWeek = new j$.time.DayOfWeek("MONDAY", 0);
        MONDAY = dayOfWeek;
        j$.time.DayOfWeek dayOfWeek2 = new j$.time.DayOfWeek("TUESDAY", 1);
        TUESDAY = dayOfWeek2;
        j$.time.DayOfWeek dayOfWeek3 = new j$.time.DayOfWeek("WEDNESDAY", 2);
        WEDNESDAY = dayOfWeek3;
        j$.time.DayOfWeek dayOfWeek4 = new j$.time.DayOfWeek("THURSDAY", 3);
        THURSDAY = dayOfWeek4;
        j$.time.DayOfWeek dayOfWeek5 = new j$.time.DayOfWeek("FRIDAY", 4);
        FRIDAY = dayOfWeek5;
        j$.time.DayOfWeek dayOfWeek6 = new j$.time.DayOfWeek("SATURDAY", 5);
        SATURDAY = dayOfWeek6;
        j$.time.DayOfWeek dayOfWeek7 = new j$.time.DayOfWeek("SUNDAY", 6);
        SUNDAY = dayOfWeek7;
        b = new j$.time.DayOfWeek[]{dayOfWeek, dayOfWeek2, dayOfWeek3, dayOfWeek4, dayOfWeek5, dayOfWeek6, dayOfWeek7};
        a = values();
    }

    public static j$.time.DayOfWeek r(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        j$.time.g.c("Invalid value for DayOfWeek: ", i);
        return null;
    }

    public static j$.time.DayOfWeek valueOf(java.lang.String str) {
        return (j$.time.DayOfWeek) java.lang.Enum.valueOf(j$.time.DayOfWeek.class, str);
    }

    public static j$.time.DayOfWeek[] values() {
        return (j$.time.DayOfWeek[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return 0L;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.DAYS : j$.time.temporal.m.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar != j$.time.temporal.a.DAY_OF_WEEK) {
                return false;
            }
        } else if (lVar == null || !lVar.h(this)) {
            return false;
        }
        return true;
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.DAY_OF_WEEK ? lVar.range() : j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
