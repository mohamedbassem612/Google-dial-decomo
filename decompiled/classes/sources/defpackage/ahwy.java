package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahwy extends defpackage.ahxn {
    private final char[] a;

    public ahwy(java.lang.CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        java.util.Arrays.sort(charArray);
    }

    @Override // defpackage.ahxn
    public final void b(java.util.BitSet bitSet) {
        for (char c : this.a) {
            bitSet.set(c);
        }
    }

    @Override // defpackage.ahxn
    public final boolean c(char c) {
        return java.util.Arrays.binarySearch(this.a, c) >= 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(defpackage.ahxn.p(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
