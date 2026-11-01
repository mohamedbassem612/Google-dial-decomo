package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajje {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    public ajje() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = defpackage.ajji.c;
        this.f = null;
    }

    public final defpackage.ajjj a() throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.a;
        if (obj == null) {
            throw new java.security.GeneralSecurityException("Elliptic curve type is not set");
        }
        if (this.b == null) {
            throw new java.security.GeneralSecurityException("Hash type is not set");
        }
        if (this.d == null) {
            throw new java.security.GeneralSecurityException("DEM parameters are not set");
        }
        if (this.e == null) {
            throw new java.security.GeneralSecurityException("Variant is not set");
        }
        defpackage.ajjf ajjfVar = defpackage.ajjf.d;
        java.lang.Object obj2 = this.c;
        if (obj != ajjfVar) {
            if (obj2 == null) {
                throw new java.security.GeneralSecurityException("Point format is not set");
            }
        } else if (obj2 != null) {
            throw new java.security.GeneralSecurityException("For Curve25519 point format must not be set");
        }
        java.lang.Object obj3 = this.a;
        java.lang.Object obj4 = this.b;
        java.lang.Object obj5 = this.c;
        java.lang.Object obj6 = this.d;
        return new defpackage.ajjj((defpackage.ajjf) obj3, (defpackage.ajjg) obj4, (defpackage.ajjh) obj5, (defpackage.ajsz) obj6, (defpackage.ajji) this.e, (ajst) this.f);
    }

    public final defpackage.ajgc b() throws java.security.GeneralSecurityException {
        if (this.b == null) {
            throw new java.security.GeneralSecurityException("AES key size is not set");
        }
        if (this.c == null) {
            throw new java.security.GeneralSecurityException("HMAC key size is not set");
        }
        if (this.e == null) {
            throw new java.security.GeneralSecurityException("iv size is not set");
        }
        java.lang.Object obj = this.f;
        if (obj == null) {
            throw new java.security.GeneralSecurityException("tag size is not set");
        }
        if (this.d == null) {
            throw new java.security.GeneralSecurityException("hash type is not set");
        }
        if (this.a == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        java.lang.Integer num = (java.lang.Integer) obj;
        int iIntValue = num.intValue();
        java.lang.Object obj2 = this.d;
        if (obj2 == defpackage.ajga.a) {
            if (iIntValue > 20) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (obj2 == defpackage.ajga.b) {
            if (iIntValue > 28) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (obj2 == defpackage.ajga.c) {
            if (iIntValue > 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (obj2 == defpackage.ajga.d) {
            if (iIntValue > 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (obj2 != defpackage.ajga.e) {
                throw new java.security.GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new defpackage.ajgc(((java.lang.Integer) this.b).intValue(), ((java.lang.Integer) this.c).intValue(), ((java.lang.Integer) this.e).intValue(), ((java.lang.Integer) this.f).intValue(), (defpackage.ajgb) this.a, (defpackage.ajga) this.d);
    }

    public final void c(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.b = java.lang.Integer.valueOf(i);
    }

    public final void d(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", java.lang.Integer.valueOf(i)));
        }
        this.c = java.lang.Integer.valueOf(i);
    }

    public final void e(int i) throws java.security.GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", java.lang.Integer.valueOf(i)));
        }
        this.e = java.lang.Integer.valueOf(i);
    }

    public final void f(int i) throws java.security.GeneralSecurityException {
        if (i < 10) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", java.lang.Integer.valueOf(i)));
        }
        this.f = java.lang.Integer.valueOf(i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ahzi, java.lang.Object] */
    public final defpackage.aewq g() {
        this.d.getClass();
        if (this.f == null) {
            this.f = defpackage.aewq.b;
        }
        if (this.c == null) {
            java.lang.Object obj = this.d;
            java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.aewq.a;
            this.c = defpackage.ahvr.bI(new defpackage.aeex(obj, 10));
        }
        if (this.b == null) {
            this.b = new defpackage.aell(this, 16);
        }
        if (this.e == null) {
            java.lang.Object obj2 = this.d;
            java.util.concurrent.atomic.AtomicReference atomicReference2 = defpackage.aewq.a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Collections.addAll(arrayList, new defpackage.afeh(new defpackage.ajxw((android.content.Context) obj2)), new defpackage.afel());
            this.e = defpackage.ahvr.bI(new defpackage.aell(arrayList, 15));
        }
        if (this.a == null) {
            this.a = new defpackage.aeex(this, 12);
        }
        return new defpackage.aewq((android.content.Context) this.d, this.f, this.c, this.b, this.e, this.a);
    }

    public final void h(defpackage.ajsz ajszVar) throws java.security.GeneralSecurityException {
        if (!defpackage.ajjj.a.contains(ajszVar)) {
            throw new java.security.GeneralSecurityException(defpackage.a.bJ(ajszVar, "Invalid DEM parameters ", "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
        }
        this.d = ajszVar;
    }

    public final defpackage.adju i() {
        defpackage.ahvr.bZ((this.c != null) ^ (this.f != null), "One of metadata or metadata table must set, but not both at the same time");
        return new defpackage.adju(this);
    }

    public ajje(byte[] bArr) {
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
        this.d = null;
        this.a = defpackage.ajgb.c;
    }

    public ajje(char[] cArr) {
    }
}
