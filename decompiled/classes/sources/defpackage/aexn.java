package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aexn extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    final /* synthetic */ defpackage.aexp a;

    public aexn(defpackage.aexp aexpVar) {
        j$.util.Objects.requireNonNull(aexpVar);
        this.a = aexpVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.lang.Object obj = this.a.a;
            int iInflate = ((java.util.zip.Inflater) obj).inflate(bArr, i, i2);
            if (iInflate > 0) {
                return iInflate;
            }
            if (i2 == 0) {
                return 0;
            }
            if (((java.util.zip.Inflater) obj).getRemaining() == 0) {
                return -1;
            }
            throw new java.io.IOException("Read no bytes (requested up to " + i2 + ") but did not reach end of stream, had " + ((java.util.zip.Inflater) this.a.a).getRemaining());
        } catch (java.util.zip.DataFormatException e) {
            throw new java.io.IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0];
        }
        return -1;
    }
}
