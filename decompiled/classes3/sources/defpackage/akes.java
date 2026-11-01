package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class akes implements java.lang.CharSequence {
    public char[] a;
    public java.lang.String b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length;
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return new java.lang.String(this.a, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        java.lang.String str = this.b;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = new java.lang.String(this.a);
        this.b = str2;
        return str2;
    }
}
