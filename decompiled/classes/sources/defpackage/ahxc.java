package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahxc extends defpackage.ahxb {
    private final char a;
    private final char b;

    public ahxc(char c, char c2) {
        if (c2 < c) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.ahxn
    public final void b(java.util.BitSet bitSet) {
        bitSet.set(this.a, this.b + 1);
    }

    @Override // defpackage.ahxn
    public final boolean c(char c) {
        return this.a <= c && c <= this.b;
    }

    public final java.lang.String toString() {
        return "CharMatcher.inRange('" + defpackage.ahxn.p(this.a) + "', '" + defpackage.ahxn.p(this.b) + "')";
    }
}
