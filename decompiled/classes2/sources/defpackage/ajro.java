package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajro extends defpackage.ajsi {
    public final int a;
    public final int b;
    private final java.lang.String c;
    private final int d;
    private final int e;
    private final java.lang.String f;
    private final byte[] g;

    public ajro(defpackage.ajqo ajqoVar) throws java.security.GeneralSecurityException {
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        this.g = ajqoVar.b.k();
        defpackage.ajqr ajqrVar = ajqoVar.a.a;
        defpackage.ajqr ajqrVar2 = defpackage.ajqr.a;
        java.lang.String str = "HmacSha512";
        this.f = ajqrVar.equals(ajqrVar2) ? "HmacSha1" : ajqoVar.a.a.equals(defpackage.ajqr.b) ? "HmacSha256" : ajqoVar.a.a.equals(defpackage.ajqr.c) ? "HmacSha512" : "";
        this.a = ajqoVar.a.d();
        if (ajqoVar.a.b.equals(ajqrVar2)) {
            str = "HmacSha1";
        } else if (ajqoVar.a.b.equals(defpackage.ajqr.b)) {
            str = "HmacSha256";
        } else if (!ajqoVar.a.b.equals(defpackage.ajqr.c)) {
            str = "";
        }
        this.c = str;
        int iE = ajqoVar.a.e();
        this.b = iE;
        int iC = ajqoVar.a.c();
        this.d = iC;
        this.e = iC - iE;
    }

    public static javax.crypto.Cipher i() {
        return (javax.crypto.Cipher) defpackage.ajse.a.a("AES/CTR/NoPadding");
    }

    public static final byte[] n(byte[] bArr, long j, boolean z) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(16);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        agmc.aj(byteBufferAllocate, j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }

    @Override // defpackage.ajsi
    public final int c() {
        return e();
    }

    @Override // defpackage.ajsi
    public final int d() {
        return this.d;
    }

    @Override // defpackage.ajsi
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.ajsi
    public final int f() {
        return this.e;
    }

    @Override // defpackage.ajsi
    public final /* synthetic */ defpackage.ajso g() {
        return new defpackage.ajrm(this);
    }

    @Override // defpackage.ajsi
    public final /* synthetic */ defpackage.ajsp h(byte[] bArr) {
        return new defpackage.ajrn(this, bArr);
    }

    public final javax.crypto.Mac j() {
        return (javax.crypto.Mac) defpackage.ajse.b.a(this.c);
    }

    public final javax.crypto.spec.SecretKeySpec k(byte[] bArr) {
        return new javax.crypto.spec.SecretKeySpec(bArr, this.a, 32, this.c);
    }

    public final javax.crypto.spec.SecretKeySpec l(byte[] bArr) {
        return new javax.crypto.spec.SecretKeySpec(bArr, 0, this.a, "AES");
    }

    public final byte[] m(byte[] bArr, byte[] bArr2) {
        return agmc.al(this.f, this.g, bArr, bArr2, this.a + 32);
    }
}
