package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wks implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wks(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v66, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v69, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return ((whh) this.a).a();
            case 1:
                return ((whh) this.a).a();
            case 2:
                return ((whh) this.a).a();
            case 3:
                return ((whh) this.a).a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((whh) this.a).a();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((whh) this.a).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.xax) this.a).a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((wyc) this.a).a();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((defpackage.xax) this.a).a();
            case 15:
                return ((wyc) this.a).a();
            case 16:
                return ((wyc) this.a).a();
            case 17:
                return ((wyc) this.a).a();
            case 18:
                if (((tvn) this.a).c()) {
                    return true;
                }
                defpackage.yvk.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/sharpie/impl/aicore/SharpieAiCoreIntegrationModule", "providesSharpieAiCoreIntegration$<anonymous>", 37, "SharpieAiCoreIntegrationModule.kt").v("enabledfn disabled, not providing AiCoreIntegration");
                return false;
            case 19:
                return afsq.bJ((aoin) this.a).booleanValue();
            default:
                return afsq.bJ((aoin) this.a).booleanValue();
        }
    }
}
