package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ewd extends defpackage.evm {
    private java.io.RandomAccessFile a;
    private android.net.Uri b;
    private long c;
    private boolean d;

    public ewd() {
        super(false);
    }

    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) throws defpackage.ewc {
        if (i2 == 0) {
            return 0;
        }
        if (this.c == 0) {
            return -1;
        }
        try {
            java.io.RandomAccessFile randomAccessFile = this.a;
            java.lang.String str = eum.a;
            int i3 = randomAccessFile.read(bArr, i, (int) java.lang.Math.min(this.c, i2));
            if (i3 > 0) {
                this.c -= (long) i3;
                g(i3);
            }
            return i3;
        } catch (java.io.IOException e) {
            throw new defpackage.ewc(e, 2000);
        }
    }

    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) throws defpackage.ewc {
        android.net.Uri uri = evvVar.a;
        this.b = uri;
        j();
        try {
            java.lang.String path = uri.getPath();
            ahvr.ci(path);
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                long j = evvVar.e;
                randomAccessFile.seek(j);
                long j2 = evvVar.f;
                long length = this.a.length() - j;
                this.c = length;
                if (length < 0) {
                    throw new defpackage.ewc(null, null, 2008);
                }
                this.d = true;
                i(evvVar);
                return this.c;
            } catch (java.io.IOException e) {
                throw new defpackage.ewc(e, 2000);
            }
        } catch (java.io.FileNotFoundException e2) {
            if (android.text.TextUtils.isEmpty(uri.getQuery()) && android.text.TextUtils.isEmpty(uri.getFragment())) {
                throw new defpackage.ewc(e2, ((e2.getCause() instanceof android.system.ErrnoException) && ((android.system.ErrnoException) e2.getCause()).errno == android.system.OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new defpackage.ewc(java.lang.String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (java.lang.SecurityException e3) {
            throw new defpackage.ewc(e3, 2006);
        } catch (java.lang.RuntimeException e4) {
            throw new defpackage.ewc(e4, 2000);
        }
    }

    @Override // defpackage.evr
    public final android.net.Uri c() {
        return this.b;
    }

    @Override // defpackage.evr
    public final void d() {
        this.b = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.a = null;
                if (this.d) {
                    this.d = false;
                    h();
                }
            } catch (java.io.IOException e) {
                throw new defpackage.ewc(e, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                h();
            }
            throw th;
        }
    }
}
