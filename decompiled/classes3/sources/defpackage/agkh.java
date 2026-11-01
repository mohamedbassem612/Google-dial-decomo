package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agkh implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ agkh(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return defpackage.agkb.c(obj);
            case 1:
                return defpackage.agkb.c(obj);
            case 2:
                aooh.f((defpackage.agkp) obj, "$this$copy");
                return aojh.a;
            case 3:
                defpackage.agkj agkjVar = (defpackage.agkj) obj;
                aooh.f(agkjVar, "$this$copy");
                agkjVar.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.agkf agkfVar = (defpackage.agkf) obj;
                aooh.f(agkfVar, "$this$copy");
                agkfVar.b();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.app.Activity activity = (android.app.Activity) obj;
                aooh.f(activity, "it");
                return activity.getIntent();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.app.Activity activity2 = (android.app.Activity) obj;
                aooh.f(activity2, "it");
                return java.lang.Boolean.valueOf(activity2.isFinishing());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.app.Activity activity3 = (android.app.Activity) obj;
                aooh.f(activity3, "it");
                return java.lang.Boolean.valueOf(activity3.isChangingConfigurations());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.agwm agwmVar = (defpackage.agwm) obj;
                aooh.f(agwmVar, "response");
                return java.lang.Boolean.valueOf(agwmVar instanceof defpackage.agwp);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooh.f((java.lang.Exception) obj, "it");
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ahda ahdaVar = (ahda) obj;
                aooh.f(ahdaVar, "it");
                return ahdaVar.a().c;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.util.List list = (java.util.List) obj;
                aooh.f(list, "registrationInfoList");
                return ajsz.bS(list);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ajsy ajsyVar = (ajsy) obj;
                aooh.f(ajsyVar, "it");
                return ajsyVar.g;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aado aadoVar = (aado) obj;
                aooh.f(aadoVar, "e");
                return java.lang.Integer.valueOf(android.util.Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot", aadoVar));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                anmb anmbVar = (anmb) obj;
                aooh.f(anmbVar, "callOptions");
                return anmbVar.e(defpackage.akaa.a, java.lang.Boolean.TRUE);
            case 15:
                anmb anmbVar2 = (anmb) obj;
                aooh.f(anmbVar2, "it");
                return anmbVar2;
            case 16:
                return java.lang.Boolean.valueOf(obj == null);
            case 17:
                java.lang.String str = (java.lang.String) obj;
                aooh.f(str, "line");
                return str;
            case 18:
                int i = apbv.a;
                return null;
            case 19:
                aplf aplfVar = (aplf) obj;
                aooh.f(aplfVar, "it");
                return java.lang.Boolean.valueOf(aplfVar instanceof defpackage.aple);
            default:
                aplf aplfVar2 = (aplf) obj;
                aooh.f(aplfVar2, "it");
                return java.lang.Boolean.valueOf(aplfVar2 instanceof defpackage.aple);
        }
    }
}
