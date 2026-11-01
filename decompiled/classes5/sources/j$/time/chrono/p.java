package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p implements j$.time.chrono.k {
    public static final j$.time.chrono.p AH;
    public static final /* synthetic */ j$.time.chrono.p[] a;

    static {
        j$.time.chrono.p pVar = new j$.time.chrono.p("AH", 0);
        AH = pVar;
        a = new j$.time.chrono.p[]{pVar};
    }

    public static j$.time.chrono.p valueOf(java.lang.String str) {
        return (j$.time.chrono.p) java.lang.Enum.valueOf(j$.time.chrono.p.class, str);
    }

    public static j$.time.chrono.p[] values() {
        return (j$.time.chrono.p[]) a.clone();
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

    @Override // j$.time.chrono.k
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.i(this, (j$.time.temporal.a) lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.ERA ? j$.time.temporal.o.f(1L, 1L) : j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(1L, j$.time.temporal.a.ERA);
    }
}
