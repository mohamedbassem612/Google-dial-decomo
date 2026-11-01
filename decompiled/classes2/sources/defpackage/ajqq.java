package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajqq {
    private java.lang.Integer d = null;
    private java.lang.Integer e = null;
    public defpackage.ajqr a = null;
    public defpackage.ajqr b = null;
    public java.lang.Integer c = null;
    private java.lang.Integer f = null;

    public final defpackage.ajqs a() throws java.security.GeneralSecurityException {
        if (this.d == null) {
            throw new java.security.GeneralSecurityException("keySizeBytes needs to be set");
        }
        java.lang.Integer num = this.e;
        if (num == null) {
            throw new java.security.GeneralSecurityException("derivedKeySizeBytes needs to be set");
        }
        if (this.a == null) {
            throw new java.security.GeneralSecurityException("hkdfHashType needs to be set");
        }
        if (this.b == null) {
            throw new java.security.GeneralSecurityException("hmacHashType needs to be set");
        }
        if (this.c == null) {
            throw new java.security.GeneralSecurityException("hmacTagSizeBytes needs to be set");
        }
        if (this.f == null) {
            throw new java.security.GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
        }
        if (num.intValue() != 16 && this.e.intValue() != 32) {
            throw new java.security.GeneralSecurityException("derivedKeySizeBytes needs to be 16 or 32, not ".concat(java.lang.String.valueOf(this.e)));
        }
        if (this.d.intValue() < this.e.intValue()) {
            throw new java.security.GeneralSecurityException("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., ".concat(java.lang.String.valueOf(this.e)));
        }
        if (this.f.intValue() <= this.e.intValue() + this.c.intValue() + 8) {
            throw new java.security.GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., " + (this.e.intValue() + this.c.intValue() + 9));
        }
        defpackage.ajqr ajqrVar = this.b;
        int i = ajqrVar != defpackage.ajqr.b ? ajqrVar == defpackage.ajqr.a ? 20 : 0 : 32;
        if (ajqrVar == defpackage.ajqr.c) {
            i = 64;
        }
        if (this.c.intValue() >= 10 && this.c.intValue() <= i) {
            return new defpackage.ajqs(this.d, this.e, this.a, this.b, this.c, this.f);
        }
        throw new java.security.GeneralSecurityException("hmacTagSize must be in range [10, " + i + "], but is " + this.c);
    }

    public final void b(int i) {
        this.f = java.lang.Integer.valueOf(i);
    }

    public final void c(int i) {
        this.e = java.lang.Integer.valueOf(i);
    }

    public final void d(int i) {
        this.d = java.lang.Integer.valueOf(i);
    }
}
