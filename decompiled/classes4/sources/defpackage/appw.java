package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appw extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    final /* synthetic */ appx a;

    public appw(appx appxVar) {
        this.a = appxVar;
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        appx appxVar = this.a;
        if (appxVar.c) {
            throw new java.io.IOException("closed");
        }
        return (int) java.lang.Math.min(appxVar.b.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        aooh.f(bArr, "data");
        appx appxVar = this.a;
        if (appxVar.c) {
            throw new java.io.IOException("closed");
        }
        aoov.aV(bArr.length, i, i2);
        apoy apoyVar = appxVar.b;
        if (apoyVar.b == 0 && appxVar.a.b(apoyVar, 8192L) == -1) {
            return -1;
        }
        return apoyVar.e(bArr, i, i2);
    }

    public final java.lang.String toString() {
        appx appxVar = this.a;
        java.util.Objects.toString(appxVar);
        return appxVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream
    public final long transferTo(java.io.OutputStream outputStream) throws java.io.IOException {
        aooh.f(outputStream, "out");
        appx appxVar = this.a;
        if (appxVar.c) {
            throw new java.io.IOException("closed");
        }
        long j = 0;
        while (true) {
            apoy apoyVar = appxVar.b;
            if (apoyVar.b == 0 && appxVar.a.b(apoyVar, 8192L) == -1) {
                return j;
            }
            j += apoyVar.b;
            apoy.T(apoyVar, outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        appx appxVar = this.a;
        if (appxVar.c) {
            throw new java.io.IOException("closed");
        }
        apoy apoyVar = appxVar.b;
        if (apoyVar.b == 0 && appxVar.a.b(apoyVar, 8192L) == -1) {
            return -1;
        }
        return apoyVar.d() & 255;
    }
}
