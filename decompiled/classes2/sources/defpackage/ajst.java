package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajst {
    private final byte[] a;

    private ajst(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static defpackage.ajst b(byte[] bArr) {
        if (bArr != null) {
            return new defpackage.ajst(bArr, bArr.length);
        }
        throw new java.lang.NullPointerException("data must be non-null");
    }

    public final int a() {
        return this.a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ajst) {
            return java.util.Arrays.equals(((defpackage.ajst) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return "Bytes(" + agmc.am(this.a) + ')';
    }
}
