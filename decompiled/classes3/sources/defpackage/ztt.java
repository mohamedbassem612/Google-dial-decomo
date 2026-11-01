package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ztt implements defpackage.ztv {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ztt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ztv
    public final java.lang.Object a(byte[] bArr, akzq akzqVar) {
        switch (this.$cid) {
            case 0:
                return (defpackage.zug) alad.B(defpackage.zug.a, bArr, akzqVar);
            case 1:
                return (defpackage.zue) alad.B(defpackage.zue.a, bArr, akzqVar);
            case 2:
                return (defpackage.zki) alad.B(defpackage.zki.a, bArr, akzqVar);
            case 3:
                return (defpackage.zub) alad.B(defpackage.zub.a, bArr, akzqVar);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return (defpackage.zmc) alad.B(defpackage.zmc.a, bArr, akzqVar);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return (defpackage.zmd) alad.B(defpackage.zmd.a, bArr, akzqVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return (defpackage.zuc) alad.B(defpackage.zuc.a, bArr, akzqVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return (defpackage.zuh) alad.B(defpackage.zuh.a, bArr, akzqVar);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return (defpackage.zui) alad.B(defpackage.zui.a, bArr, akzqVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return (defpackage.zuj) alad.B(defpackage.zuj.a, bArr, akzqVar);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return (defpackage.zuk) alad.B(defpackage.zuk.a, bArr, akzqVar);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return (defpackage.ztz) alad.B(defpackage.ztz.a, bArr, akzqVar);
            default:
                return (defpackage.zua) alad.B(defpackage.zua.c, bArr, akzqVar);
        }
    }
}
