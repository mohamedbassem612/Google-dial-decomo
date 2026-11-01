package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class appv implements defpackage.apoz {
    public final defpackage.apqb a;
    public final defpackage.apoy b;
    public boolean c;

    public appv(defpackage.apqb apqbVar) {
        if (apqbVar == null) {
            defpackage.aooh.i("sink");
        }
        this.a = apqbVar;
        this.b = new defpackage.apoy();
    }

    @Override // defpackage.apoz
    public final void J(defpackage.appb appbVar) {
        if (appbVar == null) {
            defpackage.aooh.i("byteString");
        }
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.J(appbVar);
        c();
    }

    @Override // defpackage.apoz
    public final void L(byte[] bArr, int i, int i2) {
        defpackage.aooh.f(bArr, "source");
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.L(bArr, i, i2);
        c();
    }

    @Override // defpackage.apoz
    public final void O(int i) {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.N(i);
        c();
    }

    @Override // defpackage.apoz
    public final void Q(int i) {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.P(i);
        c();
    }

    @Override // defpackage.apoz
    public final void R(int i) {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        defpackage.apoy apoyVar = this.b;
        defpackage.appy appyVarV = apoyVar.v(2);
        byte[] bArr = appyVarV.a;
        int i2 = appyVarV.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        appyVarV.c = i2 + 2;
        apoyVar.b += 2;
        c();
    }

    @Override // defpackage.apoz
    public final void aa(byte[] bArr) {
        defpackage.aooh.f(bArr, "source");
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.aa(bArr);
        c();
    }

    @Override // defpackage.apoz
    public final void ab(java.lang.String str) {
        defpackage.aooh.f(str, "string");
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.ab(str);
        c();
    }

    public final void c() {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        defpackage.apoy apoyVar = this.b;
        long jH = apoyVar.h();
        if (jH > 0) {
            this.a.fQ(apoyVar, jH);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.apqb
    public final void close() throws java.lang.Throwable {
        java.lang.Throwable th;
        if (this.c) {
            return;
        }
        try {
            defpackage.apoy apoyVar = this.b;
            long j = apoyVar.b;
            th = null;
            if (j > 0) {
                this.a.fQ(apoyVar, j);
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        try {
            this.a.close();
        } catch (java.lang.Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.apqb
    public final defpackage.apqf fP() {
        return this.a.fP();
    }

    @Override // defpackage.apqb
    public final void fQ(defpackage.apoy apoyVar, long j) {
        if (apoyVar == null) {
            defpackage.aooh.i("source");
        }
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.fQ(apoyVar, j);
        c();
    }

    @Override // defpackage.apoz, defpackage.apqb, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        defpackage.apoy apoyVar = this.b;
        long j = apoyVar.b;
        if (j > 0) {
            this.a.fQ(apoyVar, j);
        }
        this.a.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final java.lang.String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) {
        defpackage.aooh.f(byteBuffer, "source");
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        int iWrite = this.b.write(byteBuffer);
        c();
        return iWrite;
    }
}
