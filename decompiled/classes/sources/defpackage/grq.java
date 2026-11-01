package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class grq {
    public static final java.lang.String a = defpackage.gsh.b("Data");

    public static final java.lang.Byte[] a(byte[] bArr) {
        int length = bArr.length;
        java.lang.Byte[] bArr2 = new java.lang.Byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = java.lang.Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    public static final java.lang.Long[] b(long[] jArr) {
        int length = jArr.length;
        java.lang.Long[] lArr = new java.lang.Long[length];
        for (int i = 0; i < length; i++) {
            lArr[i] = java.lang.Long.valueOf(jArr[i]);
        }
        return lArr;
    }
}
