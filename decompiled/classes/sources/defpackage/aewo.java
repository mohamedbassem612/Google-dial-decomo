package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aewo {
    public static final /* synthetic */ int a = 0;
    private static java.lang.Boolean b;
    private static final defpackage.aca c = new defpackage.aca();

    private aewo() {
    }

    public static synchronized android.net.Uri a(java.lang.String str) {
        android.net.Uri uri;
        defpackage.aca acaVar = c;
        uri = (android.net.Uri) acaVar.get(str);
        if (uri == null) {
            uri = android.net.Uri.parse("content://com.google.android.gms.phenotype/".concat(java.lang.String.valueOf(android.net.Uri.encode(str))));
            acaVar.put(str, uri);
        }
        return uri;
    }

    public static java.io.File b(android.content.Context context) {
        java.io.File filesDir = context.getFilesDir();
        if (filesDir == null) {
            android.os.SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new java.lang.IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    public static java.lang.String c(java.lang.String str) {
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            return str.substring(0, iIndexOf);
        }
        if (str.contains("@")) {
            throw new java.lang.IllegalArgumentException("Invalid package name: ".concat(java.lang.String.valueOf(str)));
        }
        return str;
    }

    public static boolean d() {
        java.lang.Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(ft$.ExternalSyntheticApiModelOutline0.m());
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static java.lang.String e(android.content.Context context, java.lang.String str) {
        if (str.contains("#")) {
            throw new java.lang.IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(java.lang.String.valueOf(str)));
        }
        return str + '#' + context.getPackageName();
    }
}
