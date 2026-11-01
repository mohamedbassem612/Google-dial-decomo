package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afea {
    public static final java.lang.reflect.Method a;
    private static final java.lang.reflect.Method b;

    static {
        java.lang.Throwable th;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3 = null;
        try {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
                method2 = cls.getMethod("get", java.lang.String.class, java.lang.String.class);
                try {
                    method3 = cls.getMethod("getInt", java.lang.String.class, java.lang.Integer.TYPE);
                    cls.getMethod("getLong", java.lang.String.class, java.lang.Long.TYPE);
                    cls.getMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE);
                } catch (java.lang.Exception e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (java.lang.Throwable th2) {
                method = method3;
                method3 = method2;
                th = th2;
                b = method3;
                a = method;
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            method2 = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            method = null;
            b = method3;
            a = method;
            throw th;
        }
        b = method2;
        a = method3;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.Exception e;
        java.lang.String str3;
        try {
            java.lang.Object[] objArr = {str, str2};
            str3 = null;
            java.lang.String str4 = (java.lang.String) b.invoke(null, objArr);
            if (str2 == null) {
                try {
                    if ("".equals(str4)) {
                        return null;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    android.util.Log.e("SystemProperties", "get error", e);
                    return str3;
                }
            }
            return str4;
        } catch (java.lang.Exception e3) {
            e = e3;
            str3 = str2;
        }
    }
}
