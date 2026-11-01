package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptb extends defpackage.apta {
    public boolean a;
    public boolean b;
    private final defpackage.apta c;
    private final int d;

    public aptb(java.io.InputStream inputStream) {
        super(inputStream);
        this.a = false;
        this.b = false;
        this.c = (defpackage.apta) (true != (inputStream instanceof defpackage.apta) ? null : inputStream);
        this.d = 1000;
    }

    @Override // defpackage.apta
    public final int d(defpackage.aptw aptwVar) throws java.io.IOException {
        int i;
        int iD;
        defpackage.apta aptaVar = this.c;
        if (aptaVar != null) {
            iD = aptaVar.d(aptwVar);
        } else {
            int i2 = 0;
            while (true) {
                i = this.in.read();
                if (i == -1) {
                    break;
                }
                aptwVar.b(i);
                i2++;
                int i3 = this.d;
                if (i3 > 0 && aptwVar.b >= i3) {
                    throw new defpackage.apte(a.bs(i3, "Maximum line length limit ( ", ") exceeded"));
                }
                if (i == 10) {
                    i = 10;
                    break;
                }
            }
            iD = i2;
            if (iD == 0) {
                iD = i == -1 ? -1 : 0;
            }
        }
        this.b = iD == -1;
        this.a = true;
        return iD;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        int i = this.in.read();
        this.b = i == -1;
        this.a = true;
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int i;
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[j > 8192 ? 8192 : (int) j];
        long j2 = 0;
        while (j > 0 && (i = read(bArr)) != -1) {
            long j3 = i;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }

    public final java.lang.String toString() {
        return "[LineReaderInputStreamAdaptor: " + this.c + ']';
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.in.read(bArr, i, i2);
        this.b = i3 == -1;
        this.a = true;
        return i3;
    }
}
