package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahxe extends defpackage.ahxb {
    private final char a;
    private final char b;

    public ahxe(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.ahxn
    public final void b(java.util.BitSet bitSet) {
        bitSet.set(this.a);
        bitSet.set(this.b);
    }

    @Override // defpackage.ahxn
    public final boolean c(char c) {
        return c == this.a || c == this.b;
    }

    public final java.lang.String toString() {
        return "CharMatcher.anyOf(\"" + defpackage.ahxn.p(this.a) + defpackage.ahxn.p(this.b) + "\")";
    }
}
