package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ahxf extends ahxb {
    private final char a;

    public ahxf(char c) {
        this.a = c;
    }

    public final void b(java.util.BitSet bitSet) {
        char c = this.a;
        bitSet.set(0, c);
        bitSet.set(c + 1, 65536);
    }

    public final boolean c(char c) {
        return c != this.a;
    }

    public final ahxn f() {
        return new ahxd(this.a);
    }

    public final java.lang.String toString() {
        return "CharMatcher.isNot('" + ahxn.p(this.a) + "')";
    }
}
