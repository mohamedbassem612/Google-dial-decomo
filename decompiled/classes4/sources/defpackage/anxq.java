package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anxq implements annt {
    public final /* bridge */ /* synthetic */ java.lang.Object a(byte[] bArr) {
        if (bArr.length < 3) {
            throw new java.lang.NumberFormatException("Malformed status code ".concat(new java.lang.String(bArr, annu.a)));
        }
        return java.lang.Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
    }

    public final /* bridge */ /* synthetic */ byte[] b(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
