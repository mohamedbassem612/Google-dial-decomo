package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class k implements j$.time.temporal.TemporalAccessor, j$.time.temporal.TemporalAdjuster {
    public static final j$.time.k APRIL;
    public static final j$.time.k AUGUST;
    public static final j$.time.k DECEMBER;
    public static final j$.time.k FEBRUARY;
    public static final j$.time.k JANUARY;
    public static final j$.time.k JULY;
    public static final j$.time.k JUNE;
    public static final j$.time.k MARCH;
    public static final j$.time.k MAY;
    public static final j$.time.k NOVEMBER;
    public static final j$.time.k OCTOBER;
    public static final j$.time.k SEPTEMBER;
    public static final j$.time.k[] a;
    public static final /* synthetic */ j$.time.k[] b;

    static {
        j$.time.k kVar = new j$.time.k("JANUARY", 0);
        JANUARY = kVar;
        j$.time.k kVar2 = new j$.time.k("FEBRUARY", 1);
        FEBRUARY = kVar2;
        j$.time.k kVar3 = new j$.time.k("MARCH", 2);
        MARCH = kVar3;
        j$.time.k kVar4 = new j$.time.k("APRIL", 3);
        APRIL = kVar4;
        j$.time.k kVar5 = new j$.time.k("MAY", 4);
        MAY = kVar5;
        j$.time.k kVar6 = new j$.time.k("JUNE", 5);
        JUNE = kVar6;
        j$.time.k kVar7 = new j$.time.k("JULY", 6);
        JULY = kVar7;
        j$.time.k kVar8 = new j$.time.k("AUGUST", 7);
        AUGUST = kVar8;
        j$.time.k kVar9 = new j$.time.k("SEPTEMBER", 8);
        SEPTEMBER = kVar9;
        j$.time.k kVar10 = new j$.time.k("OCTOBER", 9);
        OCTOBER = kVar10;
        j$.time.k kVar11 = new j$.time.k("NOVEMBER", 10);
        NOVEMBER = kVar11;
        j$.time.k kVar12 = new j$.time.k("DECEMBER", 11);
        DECEMBER = kVar12;
        b = new j$.time.k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12};
        a = values();
    }

    public static j$.time.k B(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        j$.time.g.c("Invalid value for MonthOfYear: ", i);
        return null;
    }

    public static j$.time.k valueOf(java.lang.String str) {
        return (j$.time.k) java.lang.Enum.valueOf(j$.time.k.class, str);
    }

    public static j$.time.k[] values() {
        return (j$.time.k[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.MONTH_OF_YEAR) {
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
        if (temporalQuery == j$.time.temporal.m.b) {
            return j$.time.chrono.q.c;
        }
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.MONTHS : j$.time.temporal.m.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar != j$.time.temporal.a.MONTH_OF_YEAR) {
                return false;
            }
        } else if (lVar == null || !lVar.h(this)) {
            return false;
        }
        return true;
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.MONTH_OF_YEAR ? lVar.range() : j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        if (j$.com.android.tools.r8.a.y(temporal).equals(j$.time.chrono.q.c)) {
            return temporal.a(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
        }
        j$.time.g.h("Adjustment only supported on ISO date-time");
        return null;
    }

    public final int r(boolean z) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 60;
            case 3:
                return (z ? 1 : 0) + 91;
            case 4:
                return (z ? 1 : 0) + 121;
            case 5:
                return (z ? 1 : 0) + 152;
            case 6:
                return (z ? 1 : 0) + 182;
            case 7:
                return (z ? 1 : 0) + 213;
            case 8:
                return (z ? 1 : 0) + 244;
            case 9:
                return (z ? 1 : 0) + 274;
            case 10:
                return (z ? 1 : 0) + 305;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int t(boolean z) {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            return (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    public final int z() {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            return (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        }
        return 29;
    }
}
