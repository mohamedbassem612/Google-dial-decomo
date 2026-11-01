package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybm extends defpackage.yap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.yap
    protected final android.graphics.Bitmap c(defpackage.xxm xxmVar, android.graphics.Bitmap bitmap, int i, int i2) {
        return defpackage.ycc.c(xxmVar, bitmap, i, i2);
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.ybm;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return 1572326941;
    }
}
