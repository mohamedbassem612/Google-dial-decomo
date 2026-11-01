package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajiu {
    public java.lang.Object a;
    public java.lang.Object b;

    public ajiu() {
        this.b = null;
        this.a = defpackage.ajiv.c;
    }

    public final defpackage.ajiw a() throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.b;
        if (obj == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.a != null) {
            return new defpackage.ajiw(((java.lang.Integer) obj).intValue(), (defpackage.ajiv) this.a);
        }
        throw new java.security.GeneralSecurityException("Variant is not set");
    }

    public final void b(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 32 && i != 48 && i != 64) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.b = java.lang.Integer.valueOf(i);
    }

    public final defpackage.ajgq c() throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.b;
        if (obj == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.a != null) {
            return new defpackage.ajgq(((java.lang.Integer) obj).intValue(), (defpackage.ajgp) this.a);
        }
        throw new java.security.GeneralSecurityException("Variant is not set");
    }

    public final void d(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.b = java.lang.Integer.valueOf(i);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [afez, java.lang.Object] */
    public final void e() throws java.io.IOException {
        if (this.a == null) {
            throw new defpackage.affa("Cannot sync underlying stream");
        }
        ((java.io.OutputStream) this.b).flush();
        this.a.b();
    }

    public final defpackage.adhv f() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            this.b = ((defpackage.aigb) obj).e(true);
        } else if (this.b == null) {
            this.b = defpackage.aikj.b;
        }
        return new defpackage.adhv((defpackage.aigf) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.aigb g() {
        if (this.a == null) {
            if (this.b == null) {
                this.a = new defpackage.aigb(4);
            } else {
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                this.a = aigbVar;
                aigbVar.l(this.b);
                this.b = null;
            }
        }
        return (defpackage.aigb) this.a;
    }

    public final void h(java.lang.String str, java.lang.Object obj) {
        g().i(str, obj);
    }

    public ajiu(byte[] bArr) {
        this.b = null;
        this.a = defpackage.ajgp.c;
    }

    public ajiu(char[] cArr) {
    }
}
