package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xze implements defpackage.xzd {
    private final /* synthetic */ int $cid;

    public xze(int i) {
        this.$cid = i;
    }

    @Override // defpackage.xzd
    public final java.lang.Class a() {
        return this.$cid != 0 ? android.os.ParcelFileDescriptor.class : java.io.InputStream.class;
    }

    @Override // defpackage.xzd
    public final /* synthetic */ java.lang.Object b(java.io.File file) {
        return this.$cid != 0 ? android.os.ParcelFileDescriptor.open(file, 268435456) : new java.io.FileInputStream(file);
    }

    @Override // defpackage.xzd
    public final /* synthetic */ void c(java.lang.Object obj) throws java.io.IOException {
        if (this.$cid != 0) {
            ((android.os.ParcelFileDescriptor) obj).close();
        } else {
            ((java.io.InputStream) obj).close();
        }
    }
}
