package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajqw {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public ajqw() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final defpackage.ajqy a() throws java.security.GeneralSecurityException {
        if (this.a == null) {
            throw new java.security.GeneralSecurityException("keySizeBytes needs to be set");
        }
        java.lang.Object obj = this.b;
        if (obj == null) {
            throw new java.security.GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be set");
        }
        if (this.c == null) {
            throw new java.security.GeneralSecurityException("hkdfHashType needs to be set");
        }
        if (this.d == null) {
            throw new java.security.GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
        }
        if (((java.lang.Integer) obj).intValue() != 16 && ((java.lang.Integer) this.b).intValue() != 32) {
            java.lang.Object obj2 = this.b;
            java.util.Objects.toString(obj2);
            throw new java.security.GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be 16 or 32, not ".concat(java.lang.String.valueOf(obj2)));
        }
        if (((java.lang.Integer) this.a).intValue() < ((java.lang.Integer) this.b).intValue()) {
            java.lang.Object obj3 = this.b;
            java.util.Objects.toString(obj3);
            throw new java.security.GeneralSecurityException("keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., ".concat(java.lang.String.valueOf(obj3)));
        }
        if (((java.lang.Integer) this.d).intValue() <= ((java.lang.Integer) this.b).intValue() + 24) {
            throw new java.security.GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., " + (((java.lang.Integer) this.b).intValue() + 25));
        }
        return new defpackage.ajqy((java.lang.Integer) this.a, (java.lang.Integer) this.b, (defpackage.ajqx) this.c, (java.lang.Integer) this.d);
    }

    public final void b(int i) {
        this.d = java.lang.Integer.valueOf(i);
    }

    public final void c(int i) {
        this.b = java.lang.Integer.valueOf(i);
    }

    public final void d(int i) {
        this.a = java.lang.Integer.valueOf(i);
    }

    public final void e(int i, java.lang.String str, android.content.Intent intent) {
        if (this.d == null) {
            this.d = new aift(4);
        }
        ((aift) this.d).i(new ahin(i, str, intent));
    }

    public final void f() {
        this.a = "android_default";
    }

    public ajqw(byte[] bArr) {
    }
}
