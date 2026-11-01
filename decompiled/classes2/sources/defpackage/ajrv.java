package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajrv extends defpackage.ajsi {
    public final int a;
    private final int b;
    private final int c;
    private final java.lang.String d;
    private final byte[] e;

    public ajrv(defpackage.ajqt ajqtVar) throws java.security.GeneralSecurityException {
        java.lang.String str;
        this.e = ajqtVar.b.k();
        if (ajqtVar.a.a.equals(defpackage.ajqx.a)) {
            str = "HmacSha1";
        } else if (ajqtVar.a.a.equals(defpackage.ajqx.b)) {
            str = "HmacSha256";
        } else {
            if (!ajqtVar.a.a.equals(defpackage.ajqx.c)) {
                throw new java.security.GeneralSecurityException("Unknown HKDF algorithm ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajqtVar.a.a))));
            }
            str = "HmacSha512";
        }
        this.d = str;
        this.a = ajqtVar.a.d();
        int iC = ajqtVar.a.c();
        this.b = iC;
        this.c = iC - 16;
    }

    public static javax.crypto.Cipher i() {
        return (javax.crypto.Cipher) defpackage.ajse.a.a("AES/GCM/NoPadding");
    }

    public static javax.crypto.spec.GCMParameterSpec j(byte[] bArr, long j, boolean z) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(12);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        agmc.aj(byteBufferAllocate, j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        return new javax.crypto.spec.GCMParameterSpec(128, byteBufferAllocate.array());
    }

    @Override // defpackage.ajsi
    public final int c() {
        return e();
    }

    @Override // defpackage.ajsi
    public final int d() {
        return this.b;
    }

    @Override // defpackage.ajsi
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.ajsi
    public final int f() {
        return this.c;
    }

    @Override // defpackage.ajsi
    public final /* synthetic */ defpackage.ajso g() {
        return new defpackage.ajrt(this);
    }

    @Override // defpackage.ajsi
    public final /* synthetic */ defpackage.ajsp h(byte[] bArr) {
        return new defpackage.ajru(this, bArr);
    }

    public final javax.crypto.spec.SecretKeySpec k(byte[] bArr, byte[] bArr2) {
        return new javax.crypto.spec.SecretKeySpec(agmc.al(this.d, this.e, bArr, bArr2, this.a), "AES");
    }
}
