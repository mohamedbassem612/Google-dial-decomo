package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apde {
    public static final java.lang.String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        java.lang.String property;
        int i = defpackage.apcn.a;
        try {
            property = java.lang.System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = defpackage.aosv.z("kotlinx.coroutines.scheduler.resolution.ns", 100000L, Long.MAX_VALUE);
        c = defpackage.aosv.y("kotlinx.coroutines.scheduler.core.pool.size", defpackage.aooc.t(defpackage.apcn.a, 2), Integer.MAX_VALUE);
        d = defpackage.aosv.y("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 2097150);
        e = java.util.concurrent.TimeUnit.SECONDS.toNanos(defpackage.aosv.z("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, Long.MAX_VALUE));
    }
}
