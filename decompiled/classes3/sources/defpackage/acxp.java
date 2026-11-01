package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxp implements adsx {
    private final dsd a;

    public acxp(dsd dsdVar) {
        this.a = dsdVar;
    }

    public final void a(java.io.File file, adsw adswVar) {
        defpackage.acvg acvgVar;
        file.getName();
        int i = adbe.a;
        int i2 = adswVar.d;
        yg ygVarB = acvh.b();
        if (i2 == 0) {
            throw null;
        }
        switch (i2 - 1) {
            case 0:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_UNKNOWN;
                break;
            case 1:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_CANCELED;
                break;
            case 2:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_INVALID_REQUEST;
                break;
            case 3:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_HTTP_ERROR;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_REQUEST_ERROR;
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                break;
            default:
                acvgVar = defpackage.acvg.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                break;
        }
        ygVarB.b = acvgVar;
        java.lang.String str = "ANDROID_DOWNLOADER_" + agab.cc(i2) + "; ";
        int i3 = adswVar.a;
        if (i3 >= 0) {
            str = str + "HttpCode: " + i3 + "; ";
        }
        java.lang.String str2 = adswVar.b;
        if (str2 != null) {
            str = str + "Message: " + str2 + "; ";
        }
        java.lang.Throwable th = adswVar.c;
        ygVarB.d = str;
        if (th != null) {
            ygVarB.c = th;
        }
        this.a.d(ygVarB.d());
    }

    public final void b(java.io.File file) {
        file.getName();
        int i = adbe.a;
        this.a.b((java.lang.Object) null);
    }
}
