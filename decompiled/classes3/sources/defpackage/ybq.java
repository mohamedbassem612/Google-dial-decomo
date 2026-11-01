package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybq {
    public static final /* synthetic */ int a = 0;
    private static final java.io.File b = new java.io.File("/proc/self/fd");
    private static volatile defpackage.ybq c;
    private int d;
    private boolean e = true;

    public ybq() {
        new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static defpackage.ybq a() {
        if (c == null) {
            synchronized (defpackage.ybq.class) {
                if (c == null) {
                    c = new defpackage.ybq();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    private final synchronized boolean c() {
        int i = this.d + 1;
        this.d = i;
        if (i >= 50) {
            this.d = 0;
            int length = b.list().length;
            int i2 = (length > 20000L ? 1 : (length == 20000L ? 0 : -1));
            this.e = i2 >>> 31;
            if (i2 >= 0 && android.util.Log.isLoggable("Downsampler", 5)) {
                android.util.Log.w("Downsampler", a.bs(length, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ", ", limit 20000"));
            }
        }
        return this.e;
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (!android.util.Log.isLoggable("HardwareConfig", 2)) {
                return false;
            }
            android.util.Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        if (z2) {
            if (!android.util.Log.isLoggable("HardwareConfig", 2)) {
                return false;
            }
            android.util.Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            return false;
        }
        if (i < 0 || i2 < 0) {
            if (!android.util.Log.isLoggable("HardwareConfig", 2)) {
                return false;
            }
            android.util.Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            return false;
        }
        if (c()) {
            return true;
        }
        if (!android.util.Log.isLoggable("HardwareConfig", 2)) {
            return false;
        }
        android.util.Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        return false;
    }
}
