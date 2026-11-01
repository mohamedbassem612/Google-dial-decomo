package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adho {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.ahxn b = new defpackage.ahxl(new defpackage.ahxl(new defpackage.ahxl(new defpackage.ahxc('a', 'z'), new defpackage.ahxc('A', 'Z')), new defpackage.ahxc('0', '9')), defpackage.ahxn.m("-_"));
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^[\\-a-zA-Z0-9_]+$");
    private static final java.lang.String d;
    private static final java.util.regex.Pattern e;
    private static final java.util.regex.Pattern f;

    static {
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "(?:\\.(%s))??%s", "[\\-a-zA-Z0-9_]+", ".fetched");
        d = str;
        e = java.util.regex.Pattern.compile(java.lang.String.format(java.util.Locale.US, "^(%s)(?:(?:%s)|(?:%s))??$", "[\\-a-zA-Z0-9_]+", str, ".staged"));
        f = java.util.regex.Pattern.compile(java.lang.String.format(java.util.Locale.US, "^(%s)-([0-9]+)$", "[\\-a-zA-Z0-9_]+"));
    }

    public static defpackage.adhw a(defpackage.adhw adhwVar, java.lang.String str) {
        java.lang.String strConcat = str != null ? ".".concat(str) : "";
        defpackage.adhb adhbVar = (defpackage.adhb) adhwVar;
        java.lang.String str2 = adhbVar.b;
        return new defpackage.adhb(adhbVar.a, str2 + strConcat + ".fetched");
    }

    public static defpackage.adhw b(defpackage.adhw adhwVar) {
        defpackage.adhb adhbVar = (defpackage.adhb) adhwVar;
        return new defpackage.adhb(adhbVar.a, adhbVar.b.concat(".staged"));
    }

    public static com.google.android.libraries.micore.superpacks.base.VersionedName c(java.lang.String str) {
        java.lang.String strGroup;
        java.lang.String strGroup2;
        java.util.regex.Matcher matcher = e.matcher(str);
        java.lang.String strGroup3 = matcher.find() ? matcher.group(1) : null;
        if (strGroup3 == null) {
            return null;
        }
        java.util.regex.Matcher matcher2 = f.matcher(strGroup3);
        if (!matcher2.find() || (strGroup = matcher2.group(1)) == null || (strGroup2 = matcher2.group(2)) == null) {
            return null;
        }
        try {
            return com.google.android.libraries.micore.superpacks.base.VersionedName.c(strGroup, java.lang.Integer.parseInt(strGroup2));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.lang.String d(java.lang.String str, int i) {
        return str + '-' + i;
    }

    public static void e(java.lang.String str) {
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Name should not be empty");
        }
        if (str.length() > 256) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bk(str, "Name '", "' exceeds maximum length of 256"));
        }
        if (b.h(str)) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + " is not valid, expected: " + java.lang.String.valueOf(c));
    }
}
