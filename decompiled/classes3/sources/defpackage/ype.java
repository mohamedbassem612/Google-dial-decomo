package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ype {
    public static final defpackage.ypd a;

    static {
        defpackage.ypd ypdVar = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.util.StatsLog");
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.util.StatsEvent");
            java.lang.Class<?> cls3 = java.lang.Class.forName("android.util.StatsEvent$Builder");
            ypdVar = new defpackage.ypd(cls, cls2, cls.getMethod("write", cls2), cls2.getMethod("newBuilder", null), cls3.getMethod("setAtomId", java.lang.Integer.TYPE), cls3.getMethod("writeInt", java.lang.Integer.TYPE), cls3.getMethod("writeLong", java.lang.Long.TYPE), cls3.getMethod("usePooledBuffer", null), cls3.getMethod("build", null));
        } catch (java.lang.ReflectiveOperationException e) {
            android.util.Log.i("StatsLogReflector", "Statsd platform logging APIs not available in this environment.", e);
        }
        a = ypdVar;
    }
}
