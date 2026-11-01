package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agkd implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ agkd(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.agkf agkfVar = (defpackage.agkf) obj;
                aooh.f(agkfVar, "$this$copy");
                agkfVar.a = 0.4f;
                return aojh.a;
            case 1:
                defpackage.agkq agkqVar = (defpackage.agkq) obj;
                aooh.f(agkqVar, "$this$copy");
                agkqVar.c = 0.0f;
                return aojh.a;
            case 2:
                return defpackage.agkb.d(obj);
            case 3:
                defpackage.agko agkoVar = (defpackage.agko) obj;
                aooh.f(agkoVar, "$this$copy");
                agkoVar.c();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.agkl agklVar = (defpackage.agkl) obj;
                aooh.f(agklVar, "$this$layoutConfig");
                agklVar.a = defpackage.agly.e(32.0f);
                agklVar.d = true;
                agklVar.g = 20.0f;
                agklVar.f = true;
                agklVar.e = true;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.agkm agkmVar = (defpackage.agkm) obj;
                aooh.f(agkmVar, "$this$copy");
                agkmVar.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.agkn agknVar = (defpackage.agkn) obj;
                aooh.f(agknVar, "$this$copy");
                agknVar.b();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.agko agkoVar2 = (defpackage.agko) obj;
                aooh.f(agkoVar2, "$this$copy");
                agkoVar2.b();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.agkq agkqVar2 = (defpackage.agkq) obj;
                aooh.f(agkqVar2, "$this$copy");
                agkqVar2.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return defpackage.agkb.d(obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return defpackage.agkb.c(obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return defpackage.agkb.c(obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aooh.f((defpackage.agkp) obj, "$this$copy");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.agkj agkjVar = (defpackage.agkj) obj;
                aooh.f(agkjVar, "$this$copy");
                agkjVar.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.agkf agkfVar2 = (defpackage.agkf) obj;
                aooh.f(agkfVar2, "$this$copy");
                agkfVar2.b();
                return aojh.a;
            case 15:
                defpackage.agkn agknVar2 = (defpackage.agkn) obj;
                aooh.f(agknVar2, "$this$copy");
                agknVar2.b();
                return aojh.a;
            case 16:
                defpackage.agkm agkmVar2 = (defpackage.agkm) obj;
                aooh.f(agkmVar2, "$this$copy");
                agkmVar2.a();
                return aojh.a;
            case 17:
                aooh.f((defpackage.agkk) obj, "$this$copy");
                return aojh.a;
            case 18:
                defpackage.agko agkoVar3 = (defpackage.agko) obj;
                aooh.f(agkoVar3, "$this$copy");
                agkoVar3.b();
                return aojh.a;
            case 19:
                defpackage.agkq agkqVar3 = (defpackage.agkq) obj;
                aooh.f(agkqVar3, "$this$copy");
                agkqVar3.a();
                return aojh.a;
            default:
                return defpackage.agkb.d(obj);
        }
    }
}
