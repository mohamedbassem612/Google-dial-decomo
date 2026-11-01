package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajtd implements ajtr {
    private final /* synthetic */ int $cid;
    public static final defpackage.ajtd h = new defpackage.ajtd(7);
    public static final defpackage.ajtd g = new defpackage.ajtd(6);
    public static final defpackage.ajtd f = new defpackage.ajtd(5);
    public static final defpackage.ajtd e = new defpackage.ajtd(4);
    public static final defpackage.ajtd d = new defpackage.ajtd(3);
    public static final defpackage.ajtd c = new defpackage.ajtd(2);
    public static final defpackage.ajtd b = new defpackage.ajtd(1);
    public static final defpackage.ajtd a = new defpackage.ajtd(0);

    public ajtd(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(ajtq ajtqVar) {
        switch (this.$cid) {
            case 0:
                java.lang.Object objD = ajtqVar.d(new ajui(ajtl.class, java.util.concurrent.Executor.class));
                aooh.e(objD, "get(...)");
                return aooc.ac((java.util.concurrent.Executor) objD);
            case 1:
                java.lang.Object objD2 = ajtqVar.d(new ajui(ajtj.class, java.util.concurrent.Executor.class));
                aooh.e(objD2, "get(...)");
                return aooc.ac((java.util.concurrent.Executor) objD2);
            case 2:
                java.lang.Object objD3 = ajtqVar.d(new ajui(ajtk.class, java.util.concurrent.Executor.class));
                aooh.e(objD3, "get(...)");
                return aooc.ac((java.util.concurrent.Executor) objD3);
            case 3:
                java.lang.Object objD4 = ajtqVar.d(new ajui(ajtm.class, java.util.concurrent.Executor.class));
                aooh.e(objD4, "get(...)");
                return aooc.ac((java.util.concurrent.Executor) objD4);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object objD5 = ajtqVar.d(new ajui(ajtj.class, java.util.concurrent.Executor.class));
                aooh.e(objD5, "get(...)");
                return aooc.ac((java.util.concurrent.Executor) objD5);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object objD6 = ajtqVar.d(new ajui(ajtl.class, java.util.concurrent.Executor.class));
                aooh.e(objD6, "get(...)");
                return aooc.ac((java.util.concurrent.Executor) objD6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object objD7 = ajtqVar.d(new ajui(ajtk.class, java.util.concurrent.Executor.class));
                aooh.e(objD7, "get(...)");
                return aooc.ac((java.util.concurrent.Executor) objD7);
            default:
                java.lang.Object objD8 = ajtqVar.d(new ajui(ajtm.class, java.util.concurrent.Executor.class));
                aooh.e(objD8, "get(...)");
                return aooc.ac((java.util.concurrent.Executor) objD8);
        }
    }
}
