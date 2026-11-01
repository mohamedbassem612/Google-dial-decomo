package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class etr {
    private static final java.lang.Object a = new java.lang.Object();
    private static final defpackage.etq b = defpackage.etq.a;

    public static java.lang.String a(java.lang.String str, java.lang.Throwable th) {
        java.lang.String strReplace;
        if (th != null) {
            synchronized (a) {
                java.lang.Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    if (cause instanceof java.net.UnknownHostException) {
                        strReplace = "UnknownHostException (no network)";
                        break;
                    }
                    cause = cause.getCause();
                }
            }
        } else {
            strReplace = null;
        }
        if (android.text.TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + '\n';
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        synchronized (a) {
            android.util.Log.d(str, a(str2, null));
        }
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        synchronized (a) {
            b.a(str, str2, null);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (a) {
            b.a(str, str2, th);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        synchronized (a) {
            android.util.Log.i(str, a(str2, null));
        }
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        synchronized (a) {
            b.b(str, str2, null);
        }
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (a) {
            b.b(str, str2, th);
        }
    }
}
