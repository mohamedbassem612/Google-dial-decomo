package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amux extends defpackage.amuz {
    private final short c;
    private final short d;

    public amux(defpackage.amuz amuzVar, int i, int i2) {
        super(amuzVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.amuz
    public final void a(defpackage.amva amvaVar, byte[] bArr) {
        amvaVar.d(this.c, this.d);
    }

    public final java.lang.String toString() {
        int i = 1 << this.d;
        return "<" + java.lang.Integer.toBinaryString((this.c & (i - 1)) | i | i).substring(1) + '>';
    }
}
