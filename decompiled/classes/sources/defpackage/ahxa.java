package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahxa extends defpackage.ahxh {
    private final java.util.BitSet a;

    public ahxa(java.util.BitSet bitSet, java.lang.String str) {
        super(str);
        this.a = bitSet.length() + 64 < bitSet.size() ? (java.util.BitSet) bitSet.clone() : bitSet;
    }

    @Override // defpackage.ahxn
    public final void b(java.util.BitSet bitSet) {
        bitSet.or(this.a);
    }

    @Override // defpackage.ahxn
    public final boolean c(char c) {
        return this.a.get(c);
    }
}
