package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajxv {
    public static final /* synthetic */ int d = 0;
    private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public ajxv(java.lang.String str, java.lang.String str2) {
        java.lang.String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            android.util.Log.w("FirebaseMessaging", java.lang.String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !e.matcher(strSubstring).matches()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.a = strSubstring;
        this.b = str;
        this.c = defpackage.a.bE(str2, (byte) 33, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajxv)) {
            return false;
        }
        defpackage.ajxv ajxvVar = (defpackage.ajxv) obj;
        return this.a.equals(ajxvVar.a) && this.b.equals(ajxvVar.b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.b, this.a});
    }
}
