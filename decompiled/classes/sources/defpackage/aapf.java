package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aapf implements defpackage.affu {
    public final defpackage.ahzi a;
    private final defpackage.afew b;

    public aapf(android.content.Context context) {
        defpackage.afew afewVar = new defpackage.afew();
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.acxg acxgVar = defpackage.aapj.a;
        this.a = new defpackage.ahzm(new defpackage.abce(applicationContext, (char[]) null, (byte[]) null));
        this.b = afewVar;
    }

    private final android.os.ParcelFileDescriptor o(final android.net.Uri uri, final int i) {
        return (android.os.ParcelFileDescriptor) p("open file", new java.util.concurrent.Callable() { // from class: aapc
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return ((com.google.android.gms.mobstore.OpenFileDescriptorResponse) defpackage.aazc.t(((defpackage.abce) ((defpackage.ahzm) this.a.a).a).r(uri, i))).a;
            }
        });
    }

    private static final java.lang.Object p(java.lang.String str, java.util.concurrent.Callable callable) throws java.io.IOException {
        try {
            return callable.call();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.IOException("Unable to ".concat(str), e);
        } catch (java.util.concurrent.ExecutionException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof defpackage.aacw) {
                defpackage.aacw aacwVar = (defpackage.aacw) cause;
                java.lang.String str2 = aacwVar.a.g;
                if (aacwVar.a() == 33500) {
                    throw new java.io.FileNotFoundException(defpackage.hgb.n(str2, str, "Unable to ", " because "));
                }
                if (aacwVar.a() == 10 && !android.text.TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    throw new java.io.FileNotFoundException(defpackage.hgb.n(str2, str, "Unable to ", " because "));
                }
            }
            throw new java.io.IOException("Unable to ".concat(str), e2);
        } catch (java.lang.Exception e3) {
            throw new java.io.IOException("Unable to ".concat(str), e3);
        }
    }

    @Override // defpackage.affu
    public final /* synthetic */ long a(android.net.Uri uri) throws defpackage.affa {
        throw new defpackage.affa("fileSize not supported by android");
    }

    @Override // defpackage.affu
    public final defpackage.afew b() {
        return this.b;
    }

    @Override // defpackage.affu
    public final /* synthetic */ java.io.File c(android.net.Uri uri) throws defpackage.affa {
        throw new defpackage.affa("Cannot convert uri to file android ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
    }

    @Override // defpackage.affu
    public final java.io.InputStream d(android.net.Uri uri) {
        return new defpackage.aapd(o(uri, 0));
    }

    @Override // defpackage.affu
    public final /* synthetic */ java.io.OutputStream e(android.net.Uri uri) throws defpackage.affa {
        throw new defpackage.affa("openForAppend not supported by android");
    }

    @Override // defpackage.affu
    public final java.io.OutputStream f(android.net.Uri uri) {
        return new aape(o(uri, 1));
    }

    @Override // defpackage.affu
    public final /* synthetic */ java.lang.Iterable g(android.net.Uri uri) throws defpackage.affa {
        throw new defpackage.affa("children not supported by android");
    }

    @Override // defpackage.affu
    public final java.lang.String h() {
        return "android";
    }

    @Override // defpackage.affu
    public final /* synthetic */ void i(android.net.Uri uri) throws defpackage.affa {
        throw new defpackage.affa("createDirectory not supported by android");
    }

    @Override // defpackage.affu
    public final /* synthetic */ void j(android.net.Uri uri) throws defpackage.affa {
        throw new defpackage.affa("deleteDirectory not supported by android");
    }

    @Override // defpackage.affu
    public final void k(android.net.Uri uri) throws java.io.IOException {
        p("delete file", new wzc(this, uri, 11, (byte[]) null));
    }

    @Override // defpackage.affu
    public final void l(android.net.Uri uri, android.net.Uri uri2) throws java.io.IOException {
        p("rename file", new wwx(this, uri, uri2, 5, (short[]) null));
    }

    @Override // defpackage.affu
    public final boolean m(android.net.Uri uri) throws java.io.IOException {
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptorO = o(uri, 0);
            if (parcelFileDescriptorO != null) {
                parcelFileDescriptorO.close();
            }
            return true;
        } catch (java.io.FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.affu
    public final /* synthetic */ boolean n(android.net.Uri uri) throws defpackage.affa {
        throw new defpackage.affa("isDirectory not supported by android");
    }
}
