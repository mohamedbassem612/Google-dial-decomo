package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ahxi extends ahxn {
    final ahxn b;

    public ahxi(ahxn ahxnVar) {
        this.b = ahxnVar;
    }

    public final void b(java.util.BitSet bitSet) {
        java.util.BitSet bitSet2 = new java.util.BitSet();
        this.b.b(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    public final boolean c(char c) {
        return !this.b.c(c);
    }

    public final ahxn f() {
        return this.b;
    }

    public final boolean h(java.lang.CharSequence charSequence) {
        return this.b.i(charSequence);
    }

    public final boolean i(java.lang.CharSequence charSequence) {
        return this.b.h(charSequence);
    }

    public java.lang.String toString() {
        return this.b.toString().concat(".negate()");
    }
}
