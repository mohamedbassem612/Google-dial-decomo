package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahxd extends defpackage.ahxb {
    private final char a;

    public ahxd(char c) {
        this.a = c;
    }

    @Override // defpackage.ahxn
    public final void b(java.util.BitSet bitSet) {
        bitSet.set(this.a);
    }

    @Override // defpackage.ahxn
    public final boolean c(char c) {
        return c == this.a;
    }

    @Override // defpackage.ahxb, defpackage.ahxn
    public final defpackage.ahxn f() {
        return new ahxf(this.a);
    }

    @Override // defpackage.ahxn
    public final java.lang.String j(java.lang.CharSequence charSequence) {
        return charSequence.toString().replace(this.a, '.');
    }

    public final java.lang.String toString() {
        return "CharMatcher.is('" + defpackage.ahxn.p(this.a) + "')";
    }
}
