package androidx.appsearch.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class AppSearchDocumentClassMap {
    private static volatile java.util.Map b;
    private static final java.lang.Object a = new java.lang.Object();
    private static volatile java.util.Map c = new aca();

    public static java.lang.Class a(java.util.Map map, java.lang.String str, java.lang.Class cls) {
        java.lang.Class<?> cls2;
        java.util.List list = (java.util.List) map.get(str);
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str2 = (java.lang.String) list.get(i);
            try {
                java.lang.Object obj = a;
                synchronized (obj) {
                    cls2 = (java.lang.Class) c.get(str2);
                }
                if (cls2 == null) {
                    cls2 = java.lang.Class.forName(str2);
                    synchronized (obj) {
                        try {
                            c.put(str2, cls2);
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                if (cls.isAssignableFrom(cls2)) {
                    return cls2.asSubclass(cls);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                android.util.Log.w("AppSearchDocumentClassM", a.bk(str2, "Failed to load document class \"", "\". Perhaps the class was proguarded out?"));
            }
        }
        return null;
    }
}
