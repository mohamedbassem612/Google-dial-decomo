package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class h0 implements j$.time.chrono.k {
    public static final j$.time.chrono.h0 BE;
    public static final j$.time.chrono.h0 BEFORE_BE;
    public static final /* synthetic */ j$.time.chrono.h0[] a;

    static {
        j$.time.chrono.h0 h0Var = new j$.time.chrono.h0("BEFORE_BE", 0);
        BEFORE_BE = h0Var;
        j$.time.chrono.h0 h0Var2 = new j$.time.chrono.h0("BE", 1);
        BE = h0Var2;
        a = new j$.time.chrono.h0[]{h0Var, h0Var2};
    }

    public static j$.time.chrono.h0 valueOf(java.lang.String str) {
        return (j$.time.chrono.h0) java.lang.Enum.valueOf(j$.time.chrono.h0.class, str);
    }

    public static j$.time.chrono.h0[] values() {
        return (j$.time.chrono.h0[]) a.clone();
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
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.i(this, (j$.time.temporal.a) lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }
}
