package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ahww extends ahxn {
    final ahxn a;
    final ahxn b;

    public ahww(ahxn ahxnVar, ahxn ahxnVar2) {
        this.a = ahxnVar;
        this.b = ahxnVar2;
    }

    public final void b(java.util.BitSet bitSet) {
        java.util.BitSet bitSet2 = new java.util.BitSet();
        this.a.b(bitSet2);
        java.util.BitSet bitSet3 = new java.util.BitSet();
        this.b.b(bitSet3);
        bitSet2.and(bitSet3);
        bitSet.or(bitSet2);
    }

    public final boolean c(char c) {
        return this.a.c(c) && this.b.c(c);
    }

    public final java.lang.String toString() {
        ahxn ahxnVar = this.b;
        return this.a.toString() + ".and(" + ahxnVar.toString() + ')';
    }
}
