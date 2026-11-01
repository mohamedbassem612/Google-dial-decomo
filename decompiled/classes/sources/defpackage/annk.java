package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class annk {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    private java.lang.Object d;

    public annk(byte[] bArr) {
        this.b = null;
        this.d = null;
        this.c = null;
        this.a = defpackage.ajnq.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.concurrent.ThreadFactory] */
    public static java.util.concurrent.ThreadFactory p(defpackage.annk annkVar) {
        java.lang.Object obj = annkVar.d;
        java.lang.Object obj2 = annkVar.a;
        java.lang.Object obj3 = annkVar.b;
        java.lang.Object objDefaultThreadFactory = annkVar.c;
        if (objDefaultThreadFactory == null) {
            objDefaultThreadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        }
        return new ajde(objDefaultThreadFactory, (java.lang.String) obj, obj != null ? new java.util.concurrent.atomic.AtomicLong(0L) : null, (java.lang.Boolean) obj2, (java.lang.Integer) obj3);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [anny, java.lang.Object] */
    public final defpackage.annm a() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            throw new java.lang.NullPointerException("description");
        }
        java.lang.Object obj2 = this.b;
        if (obj2 == null) {
            throw new java.lang.NullPointerException("severity");
        }
        java.lang.Object obj3 = this.d;
        if (obj3 == null) {
            throw new java.lang.NullPointerException("timestampNanos");
        }
        return new defpackage.annm((java.lang.String) obj, (defpackage.annl) obj2, ((java.lang.Long) obj3).longValue(), this.c);
    }

    public final void b(long j) {
        this.d = java.lang.Long.valueOf(j);
    }

    public final defpackage.ajnr c() throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.b;
        if (obj == null) {
            throw new java.security.GeneralSecurityException("key size is not set");
        }
        if (this.d == null) {
            throw new java.security.GeneralSecurityException("tag size is not set");
        }
        if (this.c == null) {
            throw new java.security.GeneralSecurityException("hash type is not set");
        }
        if (this.a == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        if (((java.lang.Integer) obj).intValue() < 16) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.b));
        }
        java.lang.Integer num = (java.lang.Integer) this.d;
        int iIntValue = num.intValue();
        java.lang.Object obj2 = this.c;
        if (iIntValue < 10) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num));
        }
        if (obj2 == defpackage.ajnp.a) {
            if (iIntValue > 20) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (obj2 == defpackage.ajnp.b) {
            if (iIntValue > 28) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (obj2 == defpackage.ajnp.c) {
            if (iIntValue > 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (obj2 == defpackage.ajnp.d) {
            if (iIntValue > 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (obj2 != defpackage.ajnp.e) {
                throw new java.security.GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new defpackage.ajnr(((java.lang.Integer) this.b).intValue(), ((java.lang.Integer) this.d).intValue(), (defpackage.ajnq) this.a, (defpackage.ajnp) this.c);
    }

    public final void d(int i) {
        this.b = java.lang.Integer.valueOf(i);
    }

    public final void e(int i) {
        this.d = java.lang.Integer.valueOf(i);
    }

    public final defpackage.ajgm f() throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.b;
        if (obj == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.c == null) {
            throw new java.security.GeneralSecurityException("Variant is not set");
        }
        if (this.a == null) {
            throw new java.security.GeneralSecurityException("IV size is not set");
        }
        if (this.d == null) {
            throw new java.security.GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        ((java.lang.Integer) this.a).intValue();
        ((java.lang.Integer) this.d).intValue();
        return new defpackage.ajgm(iIntValue, (defpackage.ajgl) this.c);
    }

    public final void g() {
        this.a = 12;
    }

    public final void h(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.b = java.lang.Integer.valueOf(i);
    }

    public final void i() {
        this.d = 16;
    }

    public final defpackage.ajgh j() throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.d;
        if (obj == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.b == null) {
            throw new java.security.GeneralSecurityException("IV size is not set");
        }
        if (this.a == null) {
            throw new java.security.GeneralSecurityException("Variant is not set");
        }
        if (this.c == null) {
            throw new java.security.GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int iIntValue2 = ((java.lang.Integer) this.b).intValue();
        ((java.lang.Integer) this.c).intValue();
        return new defpackage.ajgh(iIntValue, iIntValue2, (defpackage.ajgg) this.a);
    }

    public final void k(int i) throws java.security.GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", java.lang.Integer.valueOf(i)));
        }
        this.b = java.lang.Integer.valueOf(i);
    }

    public final void l(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.d = java.lang.Integer.valueOf(i);
    }

    public final void m() {
        this.c = 16;
    }

    public final void n(boolean z) {
        this.a = java.lang.Boolean.valueOf(z);
    }

    public final void o(java.lang.String str) {
        java.lang.String.format(java.util.Locale.ROOT, str, 0);
        this.d = str;
    }

    public annk(byte[] bArr, byte[] bArr2) {
        this.b = null;
        this.a = null;
        this.d = null;
        this.c = defpackage.ajgl.c;
    }

    public annk(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public annk(char[] cArr) {
        this.d = null;
        this.b = null;
        this.c = null;
        this.a = defpackage.ajgg.c;
    }
}
