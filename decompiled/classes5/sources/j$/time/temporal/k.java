package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class k implements j$.time.temporal.TemporalAdjuster {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ k(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                int iH = temporal.h(j$.time.temporal.a.DAY_OF_WEEK) - i;
                return temporal.b(iH >= 0 ? 7 - iH : -iH, j$.time.temporal.ChronoUnit.DAYS);
            case 1:
                int iH2 = temporal.h(j$.time.temporal.a.DAY_OF_WEEK);
                if (iH2 == i) {
                    return temporal;
                }
                int i2 = iH2 - i;
                return temporal.b(i2 >= 0 ? 7 - i2 : -i2, j$.time.temporal.ChronoUnit.DAYS);
            default:
                int iH3 = temporal.h(j$.time.temporal.a.DAY_OF_WEEK);
                if (iH3 == i) {
                    return temporal;
                }
                int i3 = i - iH3;
                return temporal.y(i3 >= 0 ? 7 - i3 : -i3, j$.time.temporal.ChronoUnit.DAYS);
        }
    }
}
