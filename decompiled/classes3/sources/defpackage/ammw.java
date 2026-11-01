package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ammw {
    public final ahyn b;
    public final long a = 60;
    private final long c = 0;
    private final java.security.MessageDigest d = null;
    private final boolean e = false;

    public ammw(defpackage.vaa vaaVar) {
        this.b = (ahyn) vaaVar.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ammw) {
            defpackage.ammw ammwVar = (defpackage.ammw) obj;
            long j = ammwVar.a;
            long j2 = ammwVar.c;
            java.security.MessageDigest messageDigest = ammwVar.d;
            if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && this.b.equals(ammwVar.b)) {
                boolean z = ammwVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{60L, 0L, null, this.b, java.lang.Boolean.FALSE});
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "TransferOptions[idleTimeout %d sec, resumableTransferThreshold=%d, digest=%s, crc32c=%s, forceMultipart=%s]", 60L, 0L, null, ahwt.a, java.lang.Boolean.FALSE);
    }
}
