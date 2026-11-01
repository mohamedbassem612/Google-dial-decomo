package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajlf {
    public uzx e;
    public android.content.Context a = null;
    public java.lang.String b = null;
    public java.lang.String c = null;
    private java.lang.String f = null;
    private ajei g = null;
    public ajyk d = null;

    private final ajei d() throws java.security.KeyStoreException {
        boolean z;
        java.lang.Object obj = defpackage.ajlg.a;
        defpackage.ajlj ajljVar = new defpackage.ajlj();
        try {
            java.lang.String str = this.f;
            synchronized (defpackage.ajlj.a) {
                try {
                    java.lang.String strB = defpackage.ajss.b(str);
                    if (aftt.J().containsAlias(strB)) {
                        z = false;
                    } else {
                        android.security.keystore.KeyGenParameterSpec keyGenParameterSpecBuild = new android.security.keystore.KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        keyGenerator.init(keyGenParameterSpecBuild);
                        keyGenerator.generateKey();
                        z = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            try {
                return ajljVar.a(this.f);
            } catch (java.security.GeneralSecurityException | java.security.ProviderException e) {
                if (!z) {
                    throw new java.security.KeyStoreException(java.lang.String.format("the master key %s exists but is unusable", this.f), e);
                }
                android.util.Log.w(defpackage.ajlg.b, "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (java.security.GeneralSecurityException | java.security.ProviderException e2) {
            android.util.Log.w(defpackage.ajlg.b, "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    private final uzx e(byte[] bArr) {
        try {
            this.g = new defpackage.ajlj().a(this.f);
            try {
                byte[] bArr2 = new byte[0];
                uzx uzxVarAW = uzx.aW(bArr);
                ajei ajeiVar = this.g;
                ajel ajelVar = defpackage.ajfj.b;
                try {
                    java.lang.Object obj = uzxVarAW.a;
                    defpackage.ajpm ajpmVar = (defpackage.ajpm) alad.A(defpackage.ajpm.a, (java.io.InputStream) obj, akzq.a);
                    ((java.io.InputStream) uzxVarAW.a).close();
                    if (ajpmVar == null || ajpmVar.c.c() == 0) {
                        throw new java.security.GeneralSecurityException("empty keyset");
                    }
                    try {
                        defpackage.ajqb ajqbVar = (defpackage.ajqb) alad.B(defpackage.ajqb.a, ajeiVar.a(ajpmVar.c.D(), bArr2), akzq.a);
                        defpackage.ajex.j(ajqbVar);
                        return uzx.aV(defpackage.ajex.f(ajqbVar, ajelVar));
                    } catch (alaz unused) {
                        throw new java.security.GeneralSecurityException("invalid keyset, corrupted key material");
                    }
                } catch (java.lang.Throwable th) {
                    ((java.io.InputStream) uzxVarAW.a).close();
                    throw th;
                }
            } catch (java.io.IOException | java.security.GeneralSecurityException e) {
                try {
                    return f(bArr);
                } catch (java.io.IOException unused2) {
                    throw e;
                }
            }
        } catch (java.security.GeneralSecurityException | java.security.ProviderException e2) {
            try {
                uzx uzxVarF = f(bArr);
                android.util.Log.w(defpackage.ajlg.b, "cannot use Android Keystore, it'll be disabled", e2);
                return uzxVarF;
            } catch (java.io.IOException unused3) {
                throw e2;
            }
        }
    }

    private static final uzx f(byte[] bArr) {
        uzx uzxVarAW = uzx.aW(bArr);
        return uzx.aV(defpackage.ajex.f(uzxVarAW.af(), defpackage.ajfj.b));
    }

    public final synchronized defpackage.ajlg a() {
        defpackage.ajlg ajlgVar;
        if (this.b == null) {
            throw new java.lang.IllegalArgumentException("keysetName cannot be null");
        }
        synchronized (defpackage.ajlg.a) {
            try {
                android.content.Context context = this.a;
                java.lang.String str = this.b;
                java.lang.String str2 = this.c;
                if (str == null) {
                    throw new java.lang.IllegalArgumentException("keysetName cannot be null");
                }
                android.content.Context applicationContext = context.getApplicationContext();
                try {
                    java.lang.String string = (str2 == null ? android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                    byte[] bArrAn = string != null ? agmc.an(string) : null;
                    java.lang.String str3 = this.f;
                    if (bArrAn == null) {
                        if (str3 != null) {
                            this.g = d();
                        }
                        ajyk ajykVar = this.d;
                        if (ajykVar == null) {
                            throw new java.security.GeneralSecurityException("cannot read or generate keyset");
                        }
                        defpackage.ajex ajexVarK = defpackage.ajex.k(ajykVar);
                        defpackage.ajlk ajlkVar = new defpackage.ajlk(this.a, this.b, this.c);
                        ajei ajeiVar = this.g;
                        try {
                            if (ajeiVar != null) {
                                defpackage.ajqb ajqbVarG = ajexVarK.g(defpackage.ajfj.b);
                                byte[] bArrB = ajeiVar.b(ajqbVarG.i(), new byte[0]);
                                akzx akzxVarM = defpackage.ajpm.a.m();
                                akzc akzcVarU = akzc.u(bArrB);
                                akzxVarM.u();
                                defpackage.ajpm ajpmVar = (defpackage.ajpm) akzxVarM.b;
                                j$.util.Objects.requireNonNull(akzcVarU);
                                ajpmVar.c = akzcVarU;
                                defpackage.ajqd ajqdVarA = defpackage.ajfm.a(ajqbVarG);
                                akzxVarM.u();
                                defpackage.ajpm ajpmVar2 = (defpackage.ajpm) akzxVarM.b;
                                j$.util.Objects.requireNonNull(ajqdVarA);
                                ajpmVar2.d = ajqdVarA;
                                ajpmVar2.b |= 1;
                                if (!ajlkVar.a.putString(ajlkVar.b, agmc.am(((defpackage.ajpm) akzxVarM.p()).i())).commit()) {
                                    throw new java.io.IOException("Failed to write to SharedPreferences");
                                }
                            } else {
                                defpackage.ajee.a(ajexVarK, ajlkVar);
                            }
                            this.e = uzx.aV(ajexVarK);
                        } catch (java.io.IOException e) {
                            throw new java.security.GeneralSecurityException(e);
                        }
                    } else if (str3 != null) {
                        this.e = e(bArrAn);
                    } else {
                        this.e = f(bArrAn);
                    }
                    ajlgVar = new defpackage.ajlg(this);
                } catch (java.lang.ClassCastException | java.lang.IllegalArgumentException unused) {
                    throw new java.io.CharConversionException(java.lang.String.format("can't read keyset; the pref value %s is not a valid hex string", str));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return ajlgVar;
    }

    public final void b(java.lang.String str) {
        if (!str.startsWith("android-keystore://")) {
            throw new java.lang.IllegalArgumentException("key URI must start with android-keystore://");
        }
        this.f = str;
    }

    public final void c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("need an Android context");
        }
        this.a = context;
        this.b = str;
        this.c = str2;
    }
}
