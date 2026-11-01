package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgb implements defpackage.affz {
    private static boolean c = false;
    private final android.content.Context e;
    private final defpackage.afew f;
    private volatile boolean g = false;
    private ajfl h = null;
    public static final byte[] a = new byte[0];
    private static final java.lang.Object d = new java.lang.Object();
    public static final defpackage.afew b = new defpackage.afew(new j$.util.concurrent.ConcurrentHashMap());

    public afgb(android.content.Context context, defpackage.afew afewVar) {
        this.e = context;
        this.f = afewVar;
    }

    private static byte[] h(java.lang.String str) {
        return android.util.Base64.decode(str, 2);
    }

    @Override // defpackage.affz
    public final java.io.InputStream a(android.net.Uri uri, java.io.InputStream inputStream) throws java.io.IOException {
        afeq afeqVarB = afes.b(uri);
        g();
        try {
            if (afeqVarB.a().isEmpty()) {
                return this.h.a(inputStream, a);
            }
            afer aferVar = (afer) afeqVarB.a().get(0);
            java.lang.String str = aferVar.a;
            if (j$.util.Objects.equals(str, "aes_gcm_key")) {
                return new affg(new afgu(h(aferVar.b), inputStream, 1));
            }
            if (!j$.util.Objects.equals(str, "aes_gcm_hkdf_key")) {
                throw new defpackage.affa(defpackage.a.bx(aferVar.a, "Unsupported decryption mode: "));
            }
            byte[] bArrH = h(aferVar.b);
            try {
                return ((ajfl) ajex.f(uzx.aW(bArrH).af(), ajfj.b).i(ajrb.a(), ajfl.class)).a(inputStream, a);
            } catch (java.io.IOException unused) {
                throw new java.security.GeneralSecurityException("Parse keyset failed");
            }
        } catch (java.security.GeneralSecurityException e) {
            throw new java.io.IOException("Failed to decrypt stream", e);
        }
    }

    @Override // defpackage.affz
    public final java.io.OutputStream b(android.net.Uri uri, java.io.OutputStream outputStream) throws java.io.IOException {
        afeq afeqVarB = afes.b(uri);
        g();
        try {
            if (afeqVarB.a().isEmpty()) {
                return this.h.b(outputStream, a);
            }
            throw new defpackage.affa(defpackage.a.bx(((afer) afeqVarB.a().get(0)).a, "Unsupported encryption mode: "));
        } catch (java.security.GeneralSecurityException e) {
            throw new java.io.IOException("Failed to encrypt stream", e);
        }
    }

    @Override // defpackage.affz
    public final java.lang.String c() {
        return "encrypt";
    }

    @Override // defpackage.affz
    public final /* synthetic */ java.io.OutputStream d(java.io.OutputStream outputStream) {
        return defpackage.aehj.M(this, outputStream);
    }

    public final void g() {
        if (this.g) {
            return;
        }
        synchronized (d) {
            if (!this.g) {
                try {
                    android.net.Uri.Builder builderPath = new android.net.Uri.Builder().scheme("file").authority("").path("/");
                    defpackage.aift aiftVar = new defpackage.aift(4);
                    android.content.Context context = this.e;
                    builderPath.path(defpackage.agab.al(context).getAbsolutePath());
                    builderPath.appendPath("mobstore_encrypt");
                    java.io.Closeable closeable = (java.io.Closeable) new defpackage.aogc(java.util.Arrays.asList(new defpackage.afel(this.f))).M(defpackage.agab.aj(builderPath, aiftVar), new defpackage.affo(false, false));
                    try {
                        if (!c) {
                            ajrc.a();
                            c = true;
                        }
                        ajlf ajlfVar = new ajlf();
                        ajlfVar.c(context.getApplicationContext(), "aes128_gcm_hkdf_4kb", "mobstore_encrypt");
                        defpackage.ajmo ajmoVar = ajqv.a;
                        ajlfVar.d = (defpackage.ajyk) defpackage.ajne.a(new ajqz(1));
                        ajlfVar.b("android-keystore://mobstore_encrypt");
                        this.h = (ajfl) ajlfVar.a().a().i(ajrb.a(), ajfl.class);
                        if (closeable != null) {
                            closeable.close();
                        }
                        this.g = true;
                    } catch (java.lang.Throwable th) {
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (java.security.GeneralSecurityException e) {
                    throw new java.io.IOException("Failed to initialize encryption", e);
                }
            }
        }
    }

    @Override // defpackage.affz
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.affz
    public final /* synthetic */ void f() {
    }
}
