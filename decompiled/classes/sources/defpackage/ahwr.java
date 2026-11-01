package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahwr {
    public static final defpackage.ahzp a;

    static {
        defpackage.ahwp ahwqVar;
        try {
            android.os.SystemClock.elapsedRealtimeNanos();
            ahwqVar = new defpackage.ahwp();
        } catch (java.lang.Throwable unused) {
            android.os.SystemClock.elapsedRealtime();
            ahwqVar = new ahwq();
        }
        a = ahwqVar;
    }
}
