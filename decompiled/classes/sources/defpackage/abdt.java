package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abdt {
    public static final boolean a;

    static {
        boolean z;
        try {
            android.os.SystemClock.elapsedRealtimeNanos();
            z = true;
        } catch (java.lang.Throwable unused) {
            z = false;
        }
        a = z;
    }
}
