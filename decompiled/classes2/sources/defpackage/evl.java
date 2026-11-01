package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class evl extends defpackage.evm {
    private final android.content.res.AssetManager a;
    private android.net.Uri b;
    private java.io.InputStream c;
    private long d;
    private boolean e;

    public evl(android.content.Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) throws defpackage.evk {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) java.lang.Math.min(j, i2);
                } catch (java.io.IOException e) {
                    throw new defpackage.evk(e, 2000);
                }
            }
            java.io.InputStream inputStream = this.c;
            java.lang.String str = eum.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.d;
                if (j2 != -1) {
                    this.d = j2 - ((long) i3);
                }
                g(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) throws defpackage.evk {
        try {
            android.net.Uri uri = evvVar.a;
            this.b = uri;
            java.lang.String path = uri.getPath();
            ahvr.ci(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            j();
            java.io.InputStream inputStreamOpen = this.a.open(path, 1);
            this.c = inputStreamOpen;
            long j = evvVar.e;
            if (inputStreamOpen.skip(j) < j) {
                throw new defpackage.evk(null, 2008);
            }
            long j2 = evvVar.f;
            long jAvailable = this.c.available();
            this.d = jAvailable;
            if (jAvailable == 2147483647L) {
                this.d = -1L;
            }
            this.e = true;
            i(evvVar);
            return this.d;
        } catch (defpackage.evk e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new defpackage.evk(e2, true != (e2 instanceof java.io.FileNotFoundException) ? 2000 : 2005);
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
                java.io.InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.c = null;
                if (this.e) {
                    this.e = false;
                    h();
                }
            } catch (java.io.IOException e) {
                throw new defpackage.evk(e, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                h();
            }
            throw th;
        }
    }
}
