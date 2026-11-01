package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class eiw extends eiv {
    public final int a(java.lang.String str, byte[] bArr, int i, int i2) {
        return anty.z(str, bArr, i, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: eho */
    public final java.lang.String b(byte[] bArr, int i, int i2) throws eho {
        java.lang.String str = new java.lang.String(bArr, i, i2, java.nio.charset.StandardCharsets.UTF_8);
        if (str.indexOf(65533) < 0 || java.util.Arrays.equals(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), java.util.Arrays.copyOfRange(bArr, i, i2 + i))) {
            return str;
        }
        throw new eho("Protocol message had invalid UTF-8.");
    }
}
