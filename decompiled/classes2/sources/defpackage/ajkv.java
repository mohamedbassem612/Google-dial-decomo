package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajkv implements ajen {
    private final defpackage.ajmm a;

    public ajkv(defpackage.ajmm ajmmVar) {
        this.a = ajmmVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ajen, java.lang.Object] */
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int iBinarySearch;
        j$.util.Objects.requireNonNull(bArr, "text must be non-null");
        defpackage.ajmm ajmmVar = this.a;
        long[] jArr = ajmmVar.b;
        java.util.List list = (jArr.length == 0 || bArr.length < 5 || (iBinarySearch = java.util.Arrays.binarySearch(jArr, defpackage.ajmm.a(bArr))) < 0) ? ajmmVar.d : ajmmVar.c[iBinarySearch];
        for (int i = 0; i < list.size(); i++) {
            amwp amwpVar = (amwp) list.get(i);
            try {
                byte[] bArrA = amwpVar.b.a(bArr, bArr2);
                int i2 = amwpVar.a;
                int length = bArr.length;
                return bArrA;
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        throw new java.security.GeneralSecurityException("decryption failed");
    }
}
