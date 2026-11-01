package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajni {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;

    public ajni() {
        this.a = null;
        this.b = null;
        this.c = defpackage.ajnj.d;
    }

    public final defpackage.ajnk a() throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.a;
        if (obj == null) {
            throw new java.security.GeneralSecurityException("key size not set");
        }
        if (this.b == null) {
            throw new java.security.GeneralSecurityException("tag size not set");
        }
        if (this.c != null) {
            return new defpackage.ajnk(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) this.b).intValue(), (defpackage.ajnj) this.c);
        }
        throw new java.security.GeneralSecurityException("variant not set");
    }

    public final void b(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i << 3)));
        }
        this.a = java.lang.Integer.valueOf(i);
    }

    public final void c(int i) throws java.security.GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new java.security.GeneralSecurityException(defpackage.a.bj(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.b = java.lang.Integer.valueOf(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajzt, java.lang.Object] */
    public final defpackage.ahjz d() {
        ?? r0 = this.b;
        if (r0 == 0) {
            throw new java.lang.IllegalStateException("Missing required properties: rpcServiceConfig");
        }
        defpackage.ahjz ahjzVar = new defpackage.ahjz((java.lang.String) this.c, (java.lang.Integer) this.a, r0);
        java.lang.String str = ahjzVar.a;
        boolean z = false;
        defpackage.ahvr.bZ((str == null) == (ahjzVar.b == null), "If host is set, port must be set (and vice-versa)");
        if (str != null) {
            if (str.matches("[a-zA-Z0-9-.]+")) {
            }
            defpackage.ahvr.cc(z, "Host string is invalid: %s", str);
            return ahjzVar;
        }
        str = null;
        z = true;
        defpackage.ahvr.cc(z, "Host string is invalid: %s", str);
        return ahjzVar;
    }

    public final void e(defpackage.ajzt ajztVar) {
        if (ajztVar == null) {
            throw new java.lang.NullPointerException("Null rpcServiceConfig");
        }
        this.b = ajztVar;
    }

    public final defpackage.gaa f(defpackage.gac gacVar) {
        java.lang.Object obj;
        if (gacVar == null) {
            defpackage.aooh.i("loadType");
        }
        int iOrdinal = gacVar.ordinal();
        if (iOrdinal == 0) {
            obj = this.c;
        } else if (iOrdinal == 1) {
            obj = this.a;
        } else {
            if (iOrdinal != 2) {
                throw new defpackage.aois();
            }
            obj = this.b;
        }
        return (defpackage.gaa) obj;
    }

    public final defpackage.gab g() {
        java.lang.Object obj = this.c;
        return new defpackage.gab((defpackage.gaa) obj, (defpackage.gaa) this.a, (defpackage.gaa) this.b);
    }

    public final void h(defpackage.gab gabVar) {
        this.c = gabVar.b;
        this.b = gabVar.d;
        this.a = gabVar.c;
    }

    public final void i(defpackage.gac gacVar, defpackage.gaa gaaVar) {
        if (gacVar == null) {
            defpackage.aooh.i("type");
        }
        int iOrdinal = gacVar.ordinal();
        if (iOrdinal == 0) {
            this.c = gaaVar;
        } else if (iOrdinal == 1) {
            this.a = gaaVar;
        } else {
            if (iOrdinal != 2) {
                throw new defpackage.aois();
            }
            this.b = gaaVar;
        }
    }

    public ajni(byte[] bArr) {
    }

    public ajni(byte[] bArr, byte[] bArr2) {
        this.c = null;
    }

    public ajni(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        defpackage.fzz fzzVar = defpackage.fzz.b;
        this.c = fzzVar;
        this.a = fzzVar;
        this.b = fzzVar;
    }
}
