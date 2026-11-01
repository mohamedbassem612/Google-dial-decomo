package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajob extends ajsz {
    public final int a;

    private ajob(int i) {
        super((byte[]) null);
        this.a = i;
    }

    public static defpackage.ajob c(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new defpackage.ajob(i);
        }
        throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit are supported", java.lang.Integer.valueOf(i << 3)));
    }

    public final boolean dU() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ajob) && ((defpackage.ajob) obj).a == this.a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajob.class, java.lang.Integer.valueOf(this.a)});
    }

    public final java.lang.String toString() {
        return "AesCmac PRF Parameters (" + this.a + "-byte key)";
    }
}
