package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class TemporalAdjusters {
    public static j$.time.temporal.TemporalAdjuster next(j$.time.DayOfWeek dayOfWeek) {
        return new j$.time.temporal.k(dayOfWeek.getValue(), (byte) 0);
    }

    public static j$.time.temporal.TemporalAdjuster nextOrSame(j$.time.DayOfWeek dayOfWeek) {
        return new j$.time.temporal.k(dayOfWeek.getValue(), (byte) 1);
    }
}
