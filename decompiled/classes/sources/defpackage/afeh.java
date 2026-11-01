package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afeh extends defpackage.affv {
    private final android.content.Context a;
    private final defpackage.affu b;
    private final defpackage.affu c;
    private final java.lang.Object d = new java.lang.Object();
    private volatile java.lang.String e;

    /* JADX WARN: Type inference failed for: r3v1, types: [affu, java.lang.Object] */
    public afeh(defpackage.ajxw ajxwVar) {
        this.b = new defpackage.afel((defpackage.afew) ajxwVar.b);
        this.a = (android.content.Context) ajxwVar.a;
        this.c = ajxwVar.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeo */
    private final void r() throws afeo {
        if (this.c == null) {
            throw new afeo("Android backend cannot perform remote operations without a remote backend");
        }
    }

    private final boolean s(android.net.Uri uri) {
        return (android.text.TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeo */
    @Override // defpackage.affv, defpackage.affu
    public final java.io.File c(android.net.Uri uri) throws afeo, java.io.IOException {
        if (s(uri)) {
            throw new java.io.IOException("operation is not permitted in other authorities.");
        }
        android.content.Context context = this.a;
        java.io.File fileH = new defpackage.zzx((java.lang.Object) context, (byte[]) null).H(uri);
        if (!defpackage.abyl.h(context)) {
            java.lang.String str = this.e;
            if (str == null) {
                synchronized (this.d) {
                    str = this.e;
                    if (str == null) {
                        java.lang.String absolutePath = defpackage.agab.ak(context).getAbsolutePath();
                        this.e = absolutePath;
                        str = absolutePath;
                    }
                }
            }
            if (!fileH.getAbsolutePath().startsWith(str)) {
                throw new afeo("Cannot access credential-protected data from direct boot");
            }
        }
        return fileH;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeo */
    @Override // defpackage.affv, defpackage.affu
    public final java.io.InputStream d(android.net.Uri uri) throws afeo {
        if (!s(uri)) {
            return this.b.d(p(uri));
        }
        r();
        return this.c.d(uri);
    }

    @Override // defpackage.affu
    public final java.lang.String h() {
        return "android";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeo */
    @Override // defpackage.affv, defpackage.affu
    public final boolean m(android.net.Uri uri) throws afeo {
        if (!s(uri)) {
            return this.b.m(p(uri));
        }
        r();
        return this.c.m(uri);
    }

    @Override // defpackage.affv
    protected final android.net.Uri o(android.net.Uri uri) throws defpackage.afex {
        try {
            android.content.Context context = this.a;
            java.util.regex.Pattern pattern = defpackage.afej.a;
            defpackage.afei afeiVar = new defpackage.afei(context);
            afeiVar.b(uri.getPath());
            return afeiVar.a();
        } catch (java.lang.IllegalArgumentException e) {
            throw new defpackage.afex(e);
        }
    }

    @Override // defpackage.affv
    protected final android.net.Uri p(android.net.Uri uri) throws defpackage.afex {
        if (s(uri)) {
            throw new defpackage.afex("Operation across authorities is not allowed.");
        }
        java.io.File fileC = c(uri);
        android.net.Uri.Builder builderPath = new android.net.Uri.Builder().scheme("file").authority("").path("/");
        defpackage.aift aiftVar = new defpackage.aift(4);
        builderPath.path(fileC.getAbsolutePath());
        return builderPath.encodedFragment(defpackage.affh.a(aiftVar.g())).build();
    }

    @Override // defpackage.affv
    protected final defpackage.affu q() {
        return this.b;
    }
}
