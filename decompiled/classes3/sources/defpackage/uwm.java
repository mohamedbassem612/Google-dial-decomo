package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uwm implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;

    public /* synthetic */ uwm(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                akzx akzxVar = (akzx) obj;
                akzxVar.u();
                amry amryVar = akzxVar.b;
                amry amryVar2 = amry.a;
                amryVar.b |= 256;
                amryVar.j = true;
                return;
            case 1:
                akzx akzxVar2 = (akzx) obj;
                akzxVar2.u();
                amry amryVar3 = akzxVar2.b;
                amry amryVar4 = amry.a;
                amryVar3.b |= 4;
                amryVar3.e = true;
                return;
            case 2:
                akzx akzxVar3 = (akzx) obj;
                akzxVar3.u();
                amry amryVar5 = akzxVar3.b;
                amry amryVar6 = amry.a;
                amryVar5.b |= 16;
                amryVar5.g = true;
                return;
            case 3:
                throw new java.lang.IllegalArgumentException("invalid data field, key: ".concat(java.lang.String.valueOf((java.lang.String) obj)));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((na) obj).f(false);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.String str = ((defpackage.vph) obj).d;
                try {
                    j$.nio.file.Files.delete(j$.nio.file.Paths.get(str, new java.lang.String[0]));
                    return;
                } catch (java.io.IOException e) {
                    hgb.g(vpq.a.c(), "Couldn't delete %s", str, "com/android/dialer/voicemail/settings/greeting/database/VoicemailGreetingsDataStore", "deleteLocalAudioFile", (char) 262, "VoicemailGreetingsDataStore.java", e, zct.b);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                wzd.j(wzd.b(((defpackage.wyz) obj).d));
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((defpackage.zoi) obj).eh();
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((defpackage.zoh) obj).a();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((zof) obj).a();
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((defpackage.zpn) obj).a();
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((zpu) obj).a();
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int i = achc.a;
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int i2 = achc.a;
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int i3 = achj.a;
                return;
            case 15:
                int i4 = achj.a;
                return;
            case 16:
                defpackage.ackf.a.c().y("Failed to increase permission request count", (java.lang.Throwable) obj);
                return;
            case 17:
                ((adqt) obj).b.cancel(false);
                return;
            case 18:
                ((defpackage.agte) obj).a();
                return;
            case 19:
                ((defpackage.agte) obj).b();
                return;
            default:
                ahnh ahnhVar = ahob.a;
                ((defpackage.ahqf) obj).a();
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
