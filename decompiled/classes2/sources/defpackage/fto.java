package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fto {
    public static final /* synthetic */ int a = 0;

    static {
        java.util.regex.Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(java.lang.String str) {
        if (str.endsWith("%")) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException("Percentages must end with %");
    }

    public static long b(java.lang.String str) {
        java.lang.String str2 = eum.a;
        java.lang.String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (java.lang.String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + java.lang.Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            java.lang.String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new java.lang.IllegalArgumentException("Expected 3 decimal places, got: ".concat(java.lang.String.valueOf(strTrim)));
            }
            j2 += java.lang.Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }
}
