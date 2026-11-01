package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class y extends j$.time.chrono.a implements java.io.Serializable {
    public static final j$.time.chrono.y c = new j$.time.chrono.y();
    private static final long serialVersionUID = 1039765215346859963L;

    private y() {
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final java.lang.String B() {
        return "roc";
    }

    @Override // j$.time.chrono.a
    public final java.lang.String C() {
        return "Minguo";
    }

    @Override // j$.time.chrono.a
    public final boolean D(long j) {
        return j$.time.chrono.q.c.D(j + 1911);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.d G(j$.time.temporal.Temporal temporal) {
        return super.G(temporal);
    }

    @Override // j$.time.chrono.a
    public final int N(j$.time.chrono.k kVar, int i) {
        if (kVar instanceof j$.time.chrono.b0) {
            return kVar != j$.time.chrono.b0.ROC ? 1 - i : i;
        }
        throw new java.lang.ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.o O(j$.time.temporal.a aVar) {
        int i = j$.time.chrono.x.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.o oVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.o.f(oVar.a - 22932, oVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.o oVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.o.g(1L, oVar2.d - 1911, (-oVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.o oVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.o.f(oVar3.a - 1911, oVar3.d - 1911);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate R(java.util.Map map, j$.time.format.c0 c0Var) {
        return (j$.time.chrono.a0) super.R(map, c0Var);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoZonedDateTime V(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        return j$.time.chrono.j.t(this, instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoZonedDateTime W(j$.time.temporal.Temporal temporal) {
        return super.W(temporal);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate k(int i, int i2, int i3) {
        return new j$.time.chrono.a0(j$.time.LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate l(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof j$.time.chrono.a0 ? (j$.time.chrono.a0) temporalAccessor : new j$.time.chrono.a0(j$.time.LocalDate.from(temporalAccessor));
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate p(long j) {
        return new j$.time.chrono.a0(j$.time.LocalDate.Q(j));
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate r() {
        int i = j$.time.b.a;
        return new j$.time.chrono.a0(j$.time.LocalDate.from(j$.time.LocalDate.P(new j$.time.a(j$.time.ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.ChronoLocalDate t(int i, int i2) {
        return new j$.time.chrono.a0(j$.time.LocalDate.R(i + 1911, i2));
    }

    public java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 1, this);
    }

    @Override // j$.time.chrono.a
    public final j$.time.chrono.k y(int i) {
        if (i == 0) {
            return j$.time.chrono.b0.BEFORE_ROC;
        }
        if (i == 1) {
            return j$.time.chrono.b0.ROC;
        }
        j$.time.g.c("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final java.util.List z() {
        return j$.com.android.tools.r8.a.F(j$.time.chrono.b0.values());
    }
}
