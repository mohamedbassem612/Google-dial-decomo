package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aish {
    public static final defpackage.aish e = new defpackage.aise("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final defpackage.aish f = new defpackage.aise("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final defpackage.aish g;

    static {
        new defpackage.aisg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new defpackage.aisg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        g = new defpackage.aisd(new defpackage.aisc("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public abstract int a(byte[] bArr, java.lang.CharSequence charSequence);

    public abstract void c(java.lang.Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract defpackage.aish f();

    public abstract defpackage.aish g();

    public java.lang.CharSequence h(java.lang.CharSequence charSequence) {
        throw null;
    }

    public abstract boolean j(java.lang.CharSequence charSequence);

    public final java.lang.String k(byte[] bArr) {
        return m(bArr, bArr.length);
    }

    public final byte[] l(java.lang.CharSequence charSequence) {
        try {
            java.lang.CharSequence charSequenceH = h(charSequence);
            int iD = d(charSequenceH.length());
            byte[] bArr = new byte[iD];
            int iA = a(bArr, charSequenceH);
            if (iA == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (defpackage.aisf e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
    }

    public final java.lang.String m(byte[] bArr, int i) {
        defpackage.ahvr.bX(0, i, bArr.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(e(i));
        try {
            c(sb, bArr, i);
            return sb.toString();
        } catch (java.io.IOException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }
}
