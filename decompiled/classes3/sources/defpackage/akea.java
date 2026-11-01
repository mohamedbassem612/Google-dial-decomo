package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akea {
    public static final defpackage.akea a = new defpackage.akea("", "", false);
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;

    static {
        new defpackage.akea("\n", "  ", true);
    }

    private akea(java.lang.String str, java.lang.String str2, boolean z) {
        j$.util.Objects.requireNonNull(str, "newline == null");
        j$.util.Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new java.lang.IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new java.lang.IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
