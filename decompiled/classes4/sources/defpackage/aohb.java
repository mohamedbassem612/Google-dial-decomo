package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aohb extends java.io.InputStream implements j$.io.InputStreamRetargetInterface, defpackage.anmz, defpackage.annz {
    public albh a;
    public final albn b;
    private java.io.ByteArrayInputStream c;

    public aohb(albh albhVar, albn albnVar) {
        this.a = albhVar;
        this.b = albnVar;
    }

    @Override // defpackage.anmz
    public final int a(java.io.OutputStream outputStream) throws java.io.IOException {
        albh albhVar = this.a;
        if (albhVar != null) {
            int iL = albhVar.l();
            this.a.h(outputStream);
            this.a = null;
            return iL;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        akzq akzqVar = aohd.a;
        ahvr.cj(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                this.c = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        albh albhVar = this.a;
        if (albhVar != null) {
            return albhVar.l();
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        albh albhVar = this.a;
        if (albhVar != null) {
            int iL = albhVar.l();
            if (iL == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= iL) {
                akzh akzhVar = new akzh(bArr, i, iL);
                this.a.S(akzhVar);
                akzhVar.H();
                this.a = null;
                this.c = null;
                return iL;
            }
            this.c = new java.io.ByteArrayInputStream(this.a.i());
            this.a = null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        albh albhVar = this.a;
        if (albhVar != null) {
            this.c = new java.io.ByteArrayInputStream(albhVar.i());
            this.a = null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
