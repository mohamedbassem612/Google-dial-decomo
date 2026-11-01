package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class anbe implements ahaw {
    private final /* synthetic */ int $cid;

    public final void a(aigb aigbVar) {
        switch (this.$cid) {
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aigbVar.i("45862480", ahbb.b);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aigbVar.i("45857161", ahbb.b);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aigbVar.i("45861388", ahbb.b);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aigbVar.i("45862505", ahbb.b);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aigbVar.i("45863517", ahbb.b);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aigbVar.i("45864234", ahbb.b);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aigbVar.i("45859552", ahbb.b);
                break;
        }
    }
}
