package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzv implements defpackage.xzq {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public xzv(int i) {
        this.$cid = i;
        this.a = new defpackage.vqu(500L);
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, xzp] */
    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        defpackage.xzb xzbVar;
        defpackage.xzp xzfVar;
        defpackage.xzp abyvVar;
        switch (this.$cid) {
            case 0:
                xzbVar = new defpackage.xzb(this.a, xzuVar.a(android.net.Uri.class, android.content.res.AssetFileDescriptor.class), 2);
                return xzbVar;
            case 1:
                xzfVar = new defpackage.xzf(this.a, 2);
                return xzfVar;
            case 2:
                xzbVar = new defpackage.xzb(this.a, xzuVar.a(android.net.Uri.class, java.io.InputStream.class), 2);
                return xzbVar;
            case 3:
                xzfVar = new defpackage.xzb(this.a, defpackage.xzt.a, 2);
                return xzfVar;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                xzfVar = new defpackage.yad((defpackage.vqu) this.a);
                return xzfVar;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                xzfVar = new defpackage.xzf((android.content.Context) this.a, 4, (byte[]) null);
                return xzfVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                xzfVar = new defpackage.xzf((android.content.Context) this.a, 5, (char[]) null);
                return xzfVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                abyvVar = new defpackage.abyv(xzuVar.a(defpackage.xzg.class, java.nio.ByteBuffer.class), (defpackage.afmo) this.a, java.nio.ByteBuffer.class);
                return abyvVar;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                abyvVar = new defpackage.abyv(xzuVar.a(defpackage.xzg.class, java.io.InputStream.class), (defpackage.afmo) this.a, java.io.InputStream.class);
                return abyvVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return this.a;
            default:
                abyvVar = new defpackage.agpx(xzuVar.a(defpackage.aelb.class, android.graphics.Bitmap.class), this.a, 0);
                return abyvVar;
        }
    }

    public xzv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public xzv(defpackage.afmo afmoVar, int i) {
        this.$cid = i;
        this.a = afmoVar;
    }
}
