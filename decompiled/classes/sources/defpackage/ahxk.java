package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahxk extends defpackage.ahxh {
    static final defpackage.ahxn a = new defpackage.ahxk();

    private ahxk() {
        super("CharMatcher.none()");
    }

    @Override // defpackage.ahxn
    public final boolean c(char c) {
        return false;
    }

    @Override // defpackage.ahxn
    public final int d(java.lang.CharSequence charSequence) {
        defpackage.ahvr.ci(charSequence);
        return -1;
    }

    @Override // defpackage.ahxn
    public final int e(java.lang.CharSequence charSequence, int i) {
        defpackage.ahvr.cm(i, charSequence.length());
        return -1;
    }

    @Override // defpackage.ahxb, defpackage.ahxn
    public final defpackage.ahxn f() {
        return ahwx.a;
    }

    @Override // defpackage.ahxn
    public final java.lang.String g(java.lang.CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override // defpackage.ahxn
    public final boolean h(java.lang.CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // defpackage.ahxn
    public final boolean i(java.lang.CharSequence charSequence) {
        defpackage.ahvr.ci(charSequence);
        return true;
    }

    @Override // defpackage.ahxn
    public final java.lang.String j(java.lang.CharSequence charSequence) {
        return charSequence.toString();
    }
}
