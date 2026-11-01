package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyt implements defpackage.xzq {
    private final /* synthetic */ int $cid;

    public xyt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.xzf(new defpackage.xys(this, 0), 1);
        }
        if (i == 1) {
            return new defpackage.xzf(new defpackage.xys(this, 1, null), 1);
        }
        if (i == 2) {
            return new defpackage.xyv();
        }
        if (i != 3) {
            return i != 4 ? new defpackage.xzf(xzuVar.a(android.net.Uri.class, java.io.InputStream.class), 3) : new defpackage.xzf(xzuVar.a(android.net.Uri.class, android.os.ParcelFileDescriptor.class), 3);
        }
        return new defpackage.xzf(xzuVar.a(android.net.Uri.class, android.content.res.AssetFileDescriptor.class), 3);
    }
}
