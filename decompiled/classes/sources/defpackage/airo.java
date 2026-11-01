package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class airo extends defpackage.airq implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public airo(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.airq
    public final int a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        defpackage.ahvr.ca(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
    }

    @Override // defpackage.airq
    public final int b() {
        return this.a.length << 3;
    }

    @Override // defpackage.airq
    public final boolean c(defpackage.airq airqVar) {
        int length = airqVar.e().length;
        byte[] bArr = this.a;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == airqVar.e()[i];
        }
        return z;
    }

    @Override // defpackage.airq
    public final byte[] d() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.airq
    public final byte[] e() {
        return this.a;
    }
}
