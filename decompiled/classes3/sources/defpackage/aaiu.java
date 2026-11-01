package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaiu {
    public static final java.lang.reflect.Method a;
    public static final java.lang.reflect.Method b;
    private static final java.lang.reflect.Method c;
    private static final java.lang.reflect.Method d;
    private static java.lang.Boolean e;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        android.os.Process.myUid();
        try {
            method = android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused) {
            method = null;
        }
        c = method;
        try {
            method2 = android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.Exception unused2) {
            method2 = null;
        }
        d = method2;
        try {
            method3 = android.os.WorkSource.class.getMethod("size", null);
        } catch (java.lang.Exception unused3) {
            method3 = null;
        }
        a = method3;
        try {
            android.os.WorkSource.class.getMethod("get", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused4) {
        }
        try {
            android.os.WorkSource.class.getMethod("getName", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused5) {
        }
        try {
            android.os.WorkSource.class.getMethod("createWorkChain", null);
        } catch (java.lang.Exception e2) {
            android.util.Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
        }
        try {
            java.lang.Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.Exception e3) {
            android.util.Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
        }
        try {
            method4 = android.os.WorkSource.class.getMethod("isEmpty", null);
            try {
                method4.setAccessible(true);
            } catch (java.lang.Exception unused6) {
            }
        } catch (java.lang.Exception unused7) {
            method4 = null;
        }
        b = method4;
        e = null;
    }

    public static void a(android.os.WorkSource workSource, int i, java.lang.String str) {
        java.lang.reflect.Method method = d;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, java.lang.Integer.valueOf(i), str);
                return;
            } catch (java.lang.Exception e2) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        java.lang.reflect.Method method2 = c;
        if (method2 != null) {
            try {
                method2.invoke(workSource, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception e3) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    public static synchronized boolean b(android.content.Context context) {
        java.lang.Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z = dvx.c(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        e = boolValueOf;
        boolValueOf.getClass();
        return z;
    }
}
