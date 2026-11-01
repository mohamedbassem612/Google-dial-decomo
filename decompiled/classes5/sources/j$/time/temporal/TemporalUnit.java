package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface TemporalUnit {
    long between(j$.time.temporal.Temporal temporal, j$.time.temporal.Temporal temporal2);

    j$.time.Duration getDuration();

    j$.time.temporal.Temporal h(j$.time.temporal.Temporal temporal, long j);

    boolean isDurationEstimated();
}
