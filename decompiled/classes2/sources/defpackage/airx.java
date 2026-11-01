package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class airx extends airl implements java.io.Serializable {
    private final java.security.MessageDigest a;
    private final int b;
    private final boolean c;
    private final java.lang.String d;

    public airx(java.lang.String str, int i) {
        this.d = "Hashing.sha256()";
        java.security.MessageDigest messageDigestF = f(str);
        this.a = messageDigestF;
        int digestLength = messageDigestF.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        ahvr.bT(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = g(messageDigestF);
    }

    private static java.security.MessageDigest f(java.lang.String str) {
        try {
            return java.security.MessageDigest.getInstance(str);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    private static boolean g(java.security.MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (java.lang.CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public final airs e() {
        if (this.c) {
            try {
                return new defpackage.airv((java.security.MessageDigest) this.a.clone(), this.b);
            } catch (java.lang.CloneNotSupportedException unused) {
            }
        }
        return new defpackage.airv(f(this.a.getAlgorithm()), this.b);
    }

    public final java.lang.String toString() {
        return this.d;
    }

    java.lang.Object writeReplace() {
        return new defpackage.airw(this.a.getAlgorithm(), this.b);
    }

    public airx() {
        java.security.MessageDigest messageDigestF = f("SHA-256");
        this.a = messageDigestF;
        this.b = messageDigestF.getDigestLength();
        this.d = "Hashing.sha256()";
        this.c = g(messageDigestF);
    }
}
