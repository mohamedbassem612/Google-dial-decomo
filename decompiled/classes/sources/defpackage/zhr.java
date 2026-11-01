package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zhr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/callingshared/trace/DialerTrace");

    public static final java.lang.String a(java.lang.String str) {
        if (str.length() <= 127) {
            return str;
        }
        ((defpackage.aimw) a.b().l("com/google/android/callingshared/trace/DialerTrace", "shortenTraceName", 39, "DialerTrace.kt")).y("%s trace section name was truncated.", str);
        java.lang.String strSubstring = str.substring(0, 127);
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void b(java.lang.String str, int i) {
        if (str == null) {
            defpackage.aooh.i("methodName");
        }
        da$.ExternalSyntheticApiModelOutline0.m$1(a(str), i);
    }

    public static final void c(java.lang.String str, int i) {
        if (str == null) {
            defpackage.aooh.i("methodName");
        }
        da$.ExternalSyntheticApiModelOutline0.m(a(str), i);
    }
}
