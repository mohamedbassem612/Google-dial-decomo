package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anqu implements defpackage.anpg {
    @Override // defpackage.anpg
    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        int i;
        byte b;
        java.util.List list = defpackage.anqw.a;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return defpackage.anqw.b;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return defpackage.anqw.d.f("Unknown code ".concat(new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            java.util.List list2 = defpackage.anqw.a;
            if (i2 < list2.size()) {
                return (defpackage.anqw) list2.get(i2);
            }
        }
        return defpackage.anqw.d.f("Unknown code ".concat(new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII)));
    }

    @Override // defpackage.anpg
    public final /* bridge */ /* synthetic */ byte[] b(java.lang.Object obj) {
        return ((defpackage.anqw) obj).o.s;
    }
}
