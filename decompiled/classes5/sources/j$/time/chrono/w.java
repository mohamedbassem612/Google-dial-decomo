package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class w implements j$.time.chrono.k, java.io.Serializable {
    public static final j$.time.chrono.w d;
    public static final j$.time.chrono.w[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient j$.time.LocalDate b;
    public final transient java.lang.String c;

    static {
        j$.time.chrono.w wVar = new j$.time.chrono.w(-1, j$.time.LocalDate.of(1868, 1, 1), "Meiji");
        d = wVar;
        e = new j$.time.chrono.w[]{wVar, new j$.time.chrono.w(0, j$.time.LocalDate.of(1912, 7, 30), "Taisho"), new j$.time.chrono.w(1, j$.time.LocalDate.of(1926, 12, 25), "Showa"), new j$.time.chrono.w(2, j$.time.LocalDate.of(1989, 1, 8), "Heisei"), new j$.time.chrono.w(3, j$.time.LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public w(int i, j$.time.LocalDate localDate, java.lang.String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static j$.time.chrono.w e(j$.time.LocalDate localDate) {
        if (localDate.isBefore(j$.time.chrono.v.d)) {
            j$.time.g.h("JapaneseDate before Meiji 6 are not supported");
            return null;
        }
        j$.time.chrono.w[] wVarArr = e;
        for (int length = wVarArr.length - 1; length >= 0; length--) {
            j$.time.chrono.w wVar = wVarArr[length];
            if (localDate.compareTo(wVar.b) >= 0) {
                return wVar;
            }
        }
        return null;
    }

    public static j$.time.chrono.w i(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            j$.time.chrono.w[] wVarArr = e;
            if (i2 < wVarArr.length) {
                return wVarArr[i2];
            }
        }
        j$.time.g.c("Invalid era: ", i);
        return null;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.c0((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long D(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.j(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.p(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean c(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.l(this, lVar);
    }

    public final j$.time.chrono.w f() {
        j$.time.chrono.w[] wVarArr = e;
        if (this == wVarArr[wVarArr.length - 1]) {
            return null;
        }
        return i(this.a + 1);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.i(this, (j$.time.temporal.a) lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return lVar == aVar ? j$.time.chrono.t.c.O(aVar) : j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }

    public final java.lang.String toString() {
        return this.c;
    }
}
