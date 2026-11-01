package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class annb {
    public static final boolean a = a("GRPC_ENABLE_RFC3986_URIS", true);

    public static boolean a(java.lang.String str, boolean z) {
        java.lang.String strTrim = java.lang.System.getenv(str);
        if (strTrim == null) {
            strTrim = java.lang.System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (z) {
            if (defpackage.ahvr.cp(strTrim) || java.lang.Boolean.parseBoolean(strTrim)) {
                return true;
            }
        } else if (!defpackage.ahvr.cp(strTrim) && java.lang.Boolean.parseBoolean(strTrim)) {
            return true;
        }
        return false;
    }
}
