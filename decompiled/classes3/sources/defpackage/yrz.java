package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class yrz implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ yrz(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooh.f((defpackage.yse) obj, "it");
                return new ahda((byte[]) null);
            case 1:
                aooh.f((cdh) obj, "$this$DisposableEffect");
                return new dqz(4);
            case 2:
                return java.lang.Boolean.valueOf(((java.lang.Integer) obj).intValue() != -1);
            case 3:
                defpackage.yyn yynVar = (defpackage.yyn) obj;
                aooh.f(yynVar, "it");
                return yynVar.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.yyu yyuVar = (defpackage.yyu) obj;
                aooh.f(yyuVar, "it");
                return yyuVar.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.yyu yyuVar2 = (defpackage.yyu) obj;
                aooh.f(yyuVar2, "it");
                return yyuVar2.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return wsc.G(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.rze rzeVar = (defpackage.rze) obj;
                aooh.f(rzeVar, "it");
                ((defpackage.qbe) rzeVar.a).c(qbc.nG);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.zhq) obj).a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooh.f((diq) obj, "$this$clearAndSetSemantics");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                ajb ajbVar = defpackage.abeb.a;
                return bool;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ajb ajbVar2 = defpackage.abeb.a;
                return new dpp(4294967297L);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ajb ajbVar3 = defpackage.abeb.a;
                aooh.f((dbm) obj, "$this$drawWithContent");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ajb ajbVar4 = defpackage.abeb.a;
                aooh.f((diq) obj, "$this$clearAndSetSemantics");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aooh.f((dkw) obj, "layoutResult");
                return aojh.a;
            case 15:
                defpackage.aogy aogyVar = (defpackage.aogy) obj;
                aogyVar.a = 1200;
                afsq.bw(aogyVar);
                return aojh.a;
            case 16:
                defpackage.aogy aogyVar2 = (defpackage.aogy) obj;
                aogyVar2.a = 1500;
                afsq.bw(aogyVar2);
                aogyVar2.a += 3000;
                return aojh.a;
            case 17:
                aooh.f((aes) obj, "$this$AnimatedContent");
                return new afo(aga.n((ajl) null, 3), aga.o((ajl) null, 3), (ahu) null, 12);
            case 18:
                abis abisVar = (abis) obj;
                aooh.f(abisVar, "it");
                return abisVar.a;
            case 19:
                cra craVar = (cra) obj;
                aooh.f(craVar, "$this$graphicsLayer");
                craVar.t(1);
                return aojh.a;
            default:
                aooh.f((czb) obj, "$this$layout");
                return aojh.a;
        }
    }
}
