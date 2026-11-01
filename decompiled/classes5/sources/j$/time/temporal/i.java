package j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class i implements j$.time.temporal.l {
    public static final j$.time.temporal.i JULIAN_DAY;
    public static final j$.time.temporal.i MODIFIED_JULIAN_DAY;
    public static final j$.time.temporal.i RATA_DIE;
    public static final /* synthetic */ j$.time.temporal.i[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient java.lang.String a;
    public final transient j$.time.temporal.o b;
    public final transient int c;

    static {
        j$.time.temporal.ChronoUnit chronoUnit = j$.time.temporal.ChronoUnit.DAYS;
        j$.time.temporal.ChronoUnit chronoUnit2 = j$.time.temporal.ChronoUnit.FOREVER;
        j$.time.temporal.i iVar = new j$.time.temporal.i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        j$.time.temporal.i iVar2 = new j$.time.temporal.i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        j$.time.temporal.i iVar3 = new j$.time.temporal.i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        d = new j$.time.temporal.i[]{iVar, iVar2, iVar3};
    }

    public i(java.lang.String str, int i, java.lang.String str2, j$.time.temporal.ChronoUnit chronoUnit, j$.time.temporal.ChronoUnit chronoUnit2, long j) {
        super(str, i);
        this.a = str2;
        this.b = j$.time.temporal.o.f((-365243219162L) + j, 365241780471L + j);
        this.c = (int) j;
    }

    public static j$.time.temporal.i valueOf(java.lang.String str) {
        return (j$.time.temporal.i) java.lang.Enum.valueOf(j$.time.temporal.i.class, str);
    }

    public static j$.time.temporal.i[] values() {
        return (j$.time.temporal.i[]) d.clone();
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.c(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.l
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.o k(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor.c(j$.time.temporal.a.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.g.h("Unsupported field: ".concat(java.lang.String.valueOf(this)));
        return null;
    }

    @Override // j$.time.temporal.l
    public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.D(j$.time.temporal.a.EPOCH_DAY) + ((long) this.c);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.b0 b0Var, j$.time.format.c0 c0Var) {
        long j = this.c;
        long jLongValue = ((java.lang.Long) map.remove(this)).longValue();
        j$.time.chrono.a aVarY = j$.com.android.tools.r8.a.y(b0Var);
        if (c0Var == j$.time.format.c0.LENIENT) {
            return aVarY.p(j$.com.android.tools.r8.a.P(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return aVarY.p(jLongValue - j);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
        if (this.b.e(j)) {
            return temporal.a(j$.com.android.tools.r8.a.P(j, this.c), j$.time.temporal.a.EPOCH_DAY);
        }
        throw new j$.time.DateTimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.o range() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.a;
    }
}
