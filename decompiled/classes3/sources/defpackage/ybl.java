package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybl implements defpackage.xug {
    @Override // defpackage.xug
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType a(java.io.InputStream inputStream) {
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.xug
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType b(java.nio.ByteBuffer byteBuffer) {
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.xug
    public final int c(java.io.InputStream inputStream, defpackage.xxt xxtVar) {
        int iD = new ekq(inputStream).d();
        if (iD == 0) {
            return -1;
        }
        return iD;
    }

    @Override // defpackage.xug
    public final int d(java.nio.ByteBuffer byteBuffer, defpackage.xxt xxtVar) {
        int i = defpackage.yfp.a;
        return c(new defpackage.yfo(byteBuffer), xxtVar);
    }

    @Override // defpackage.xug
    public final boolean e(java.io.InputStream inputStream, defpackage.xxt xxtVar) {
        return false;
    }

    @Override // defpackage.xug
    public final boolean f(java.nio.ByteBuffer byteBuffer, defpackage.xxt xxtVar) {
        return false;
    }
}
