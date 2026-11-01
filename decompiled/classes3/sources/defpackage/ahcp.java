package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahcp {
    private static final j$.time.Duration b;
    public final java.lang.String a;
    private final aoin c;
    private final j$.time.Duration d;

    static {
        j$.time.Duration durationOfMinutes = j$.time.Duration.ofMinutes(1L);
        aooh.e(durationOfMinutes, "ofMinutes(...)");
        b = durationOfMinutes;
    }

    public ahcp(aazc aazcVar, aoin aoinVar, j$.time.Duration duration, java.lang.String str) {
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar, "importanceThreshold");
        aooh.f(duration, "originalScheduleRealtime");
        this.c = aoinVar;
        this.d = duration;
        this.a = str;
    }

    public final defpackage.ahck a(j$.time.Duration duration) {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        java.lang.Object obj = this.c.b;
        aooh.e(obj, "get(...)");
        java.lang.Integer num = (java.lang.Integer) aooh.q((j$.util.Optional) obj);
        boolean z = (num != null ? num.intValue() : 400) > runningAppProcessInfo.importance;
        boolean z2 = duration != null && duration.compareTo(b) > 0;
        if (z2 || z) {
            return new defpackage.ahcl(new defpackage.ahdf(this.a, z2, z, j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()).minus(this.d).toMillis(), duration != null ? duration.toMillis() : 0L, runningAppProcessInfo.importance, runningAppProcessInfo.importanceReasonCode));
        }
        return defpackage.ahcj.a;
    }
}
