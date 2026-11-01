package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ahwx extends ahxh {
    static final ahxn a = new defpackage.ahwx();

    private ahwx() {
        super("CharMatcher.any()");
    }

    public final boolean c(char c) {
        return true;
    }

    public final int d(java.lang.CharSequence charSequence) {
        return charSequence.length() == 0 ? -1 : 0;
    }

    public final int e(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        ahvr.cm(i, length);
        if (i == length) {
            return -1;
        }
        return i;
    }

    public final ahxn f() {
        return ahxk.a;
    }

    public final java.lang.String g(java.lang.CharSequence charSequence) {
        ahvr.ci(charSequence);
        return "";
    }

    public final boolean h(java.lang.CharSequence charSequence) {
        ahvr.ci(charSequence);
        return true;
    }

    public final boolean i(java.lang.CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    public final java.lang.String j(java.lang.CharSequence charSequence) {
        char[] cArr = new char[charSequence.length()];
        java.util.Arrays.fill(cArr, '.');
        return new java.lang.String(cArr);
    }
}
