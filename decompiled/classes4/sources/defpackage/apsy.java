package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apsy extends defpackage.apta {
    public byte[] a;
    public int b;
    public int c;
    private final int d;

    public apsy(java.io.InputStream inputStream) {
        super(inputStream);
        if (inputStream == null) {
            throw new java.lang.IllegalArgumentException("Input stream may not be null");
        }
        this.a = new byte[4096];
        this.b = 0;
        this.c = 0;
        this.d = 1000;
    }

    public final int a() {
        return this.c - this.b;
    }

    public final int b(int i) {
        if (i >= this.b && i <= this.c) {
            return this.a[i] & 255;
        }
        throw new java.lang.IndexOutOfBoundsException("looking for " + i + " in " + this.b + '/' + this.c);
    }

    public final int c() throws java.io.IOException {
        int i = this.b;
        if (i > 0) {
            int iA = a();
            if (iA > 0) {
                byte[] bArr = this.a;
                java.lang.System.arraycopy(bArr, i, bArr, 0, iA);
            }
            this.b = 0;
            this.c = iA;
        }
        int i2 = this.c;
        int i3 = this.in.read(this.a, i2, this.a.length - i2);
        if (i3 == -1) {
            return -1;
        }
        this.c = i2 + i3;
        return i3;
    }

    @Override // defpackage.apta
    public final int d(defpackage.aptw aptwVar) throws defpackage.apte {
        int iA;
        boolean z;
        boolean z2 = false;
        int i = 0;
        int iC = 0;
        while (!z2 && (e() || (iC = c()) != -1)) {
            int iF = f(this.b, a());
            if (iF != -1) {
                iA = (iF + 1) - this.b;
                z = true;
            } else {
                iA = a();
                z = false;
            }
            if (iA > 0) {
                aptwVar.c(this.a, this.b, iA);
                g(iA);
                i += iA;
            }
            int i2 = this.d;
            if (i2 > 0 && aptwVar.b >= i2) {
                throw new defpackage.apte(a.bs(i2, "Maximum line length limit (", ") exceeded"));
            }
            z2 = z;
        }
        if (i == 0) {
            return iC == -1 ? -1 : 0;
        }
        return i;
    }

    public final boolean e() {
        return a() > 0;
    }

    public final int f(int i, int i2) {
        int i3;
        if (i < this.b || i2 < 0 || (i3 = i2 + i) > this.c) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        while (i < i3) {
            if (this.a[i] == 10) {
                return i;
            }
            i++;
        }
        return -1;
    }

    protected final void g(int i) {
        this.b += java.lang.Math.min(i, a());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        while (!e()) {
            if (c() == -1) {
                return -1;
            }
        }
        int iA = a();
        if (iA <= i2) {
            i2 = iA;
        }
        java.lang.System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
        return i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[pos: ");
        sb.append(this.b);
        sb.append("][limit: ");
        sb.append(this.c);
        sb.append("][");
        for (int i = this.b; i < this.c; i++) {
            sb.append((char) this.a[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        while (!e()) {
            if (c() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }
}
