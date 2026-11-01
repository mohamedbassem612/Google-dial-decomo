package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apue implements apug {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public apue(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.nio.channels.FileChannel a() throws java.io.IOException {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            return j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new java.io.FileInputStream((java.io.File) obj).getChannel());
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) obj;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new java.lang.IllegalArgumentException("Not a file: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
    }
}
