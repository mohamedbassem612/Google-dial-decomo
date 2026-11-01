package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoik {
    public static final /* synthetic */ int a = 0;

    static {
        java.lang.Object obj;
        java.lang.Class<?> cls;
        defpackage.aoij aoijVar;
        try {
            cls = java.lang.Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (java.lang.Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                aoijVar = (defpackage.aoij) cls.asSubclass(defpackage.aoij.class).getConstructor(defpackage.aoil.class).newInstance(defpackage.aoij.a);
            } catch (java.lang.Throwable th2) {
                obj = th2;
                aoijVar = null;
            }
        } else {
            aoijVar = null;
        }
        if (aoijVar == null) {
            new defpackage.aoij(defpackage.aoij.a);
        }
        if (obj != null) {
            try {
                if (java.lang.Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    java.lang.Class<?> cls2 = java.lang.Class.forName("java.util.logging.Logger");
                    java.lang.Object objInvoke = cls2.getMethod("getLogger", java.lang.String.class).invoke(null, defpackage.aoik.class.getName());
                    java.lang.Class<?> cls3 = java.lang.Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, java.lang.String.class, java.lang.Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private aoik() {
    }
}
