package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b0 implements j$.time.chrono.k {
    public static final j$.time.chrono.b0 BEFORE_ROC;
    public static final j$.time.chrono.b0 ROC;
    public static final /* synthetic */ j$.time.chrono.b0[] a;

    static {
        j$.time.chrono.b0 b0Var = new j$.time.chrono.b0("BEFORE_ROC", 0);
        BEFORE_ROC = b0Var;
        j$.time.chrono.b0 b0Var2 = new j$.time.chrono.b0("ROC", 1);
        ROC = b0Var2;
        a = new j$.time.chrono.b0[]{b0Var, b0Var2};
    }

    public static j$.time.chrono.b0 valueOf(java.lang.String str) {
        return (j$.time.chrono.b0) java.lang.Enum.valueOf(j$.time.chrono.b0.class, str);
    }

    public static j$.time.chrono.b0[] values() {
        return (j$.time.chrono.b0[]) a.clone();
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
