package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afno implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ afno(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        int i = 16;
        int i2 = 15;
        int i3 = 17;
        defpackage.agji agjiVar = null;
        switch (this.$cid) {
            case 0:
                aimz aimzVar = defpackage.afny.a;
                aooh.f((aes) obj, "$this$NavHost");
                aonj aonjVar = aga.a;
                return aga.c(new aku(1.0f, 400.0f, new dpn(4294967297L)), new nm(new nq(11), 17)).a(aga.n((ajl) null, 3));
            case 1:
                aimz aimzVar2 = defpackage.afny.a;
                aooh.f((bcg) obj, "$this$item");
                return new bbl(wl.b(bcg.b));
            case 2:
                aimz aimzVar3 = defpackage.afny.a;
                aooh.f((aes) obj, "$this$NavHost");
                return aga.o((ajl) null, 3);
            case 3:
                defpackage.agkn agknVar = (defpackage.agkn) obj;
                aooh.f(agknVar, "$this$copy");
                agknVar.a = 25.0f;
                agknVar.b = 8.0f;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.agka agkaVar = (defpackage.agka) obj;
                aooh.f(agkaVar, "$this$transition");
                agkaVar.a = 1200L;
                ajh ajhVar = aji.f;
                aooh.f(ajhVar, "<set-?>");
                agkaVar.c = ajhVar;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.agka agkaVar2 = (defpackage.agka) obj;
                aooh.f(agkaVar2, "$this$transition");
                agkaVar2.a = 1200L;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.agkn agknVar2 = (defpackage.agkn) obj;
                aooh.f(agknVar2, "$this$copy");
                agknVar2.a = 64.0f;
                agknVar2.b = 32.0f;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.agki agkiVar = (defpackage.agki) obj;
                aooh.f(agkiVar, "$this$copy");
                defpackage.agjn agjnVar = agkiVar.b;
                agkiVar.b = agjnVar != null ? defpackage.agmc.D(agjnVar, new defpackage.agkd(15)) : null;
                defpackage.agjo agjoVar = agkiVar.c;
                agkiVar.c = agjoVar != null ? defpackage.agmc.E(agjoVar, new defpackage.agkd(18)) : null;
                defpackage.agjp agjpVar = agkiVar.d;
                agkiVar.d = agjpVar != null ? defpackage.agmc.F(agjpVar, new defpackage.agkd(19)) : null;
                defpackage.agjs agjsVar = agkiVar.e;
                agkiVar.e = agjsVar != null ? defpackage.agmc.H(agjsVar, new defpackage.agkd(20)) : null;
                defpackage.agiw agiwVar = agkiVar.f;
                agkiVar.f = agiwVar != null ? defpackage.agmc.y(agiwVar, new defpackage.agkh(1)) : null;
                defpackage.agiw agiwVar2 = agkiVar.g;
                agkiVar.g = agiwVar2 != null ? defpackage.agmc.y(agiwVar2, new defpackage.agkh(0)) : null;
                defpackage.agjq agjqVar = agkiVar.h;
                agkiVar.h = agjqVar != null ? defpackage.agmc.G(agjqVar, new defpackage.agkh(2)) : null;
                defpackage.agjc agjcVar = agkiVar.i;
                agkiVar.i = agjcVar != null ? defpackage.agmc.B(agjcVar, new defpackage.agkh(3)) : null;
                defpackage.agiy agiyVar = agkiVar.j;
                agkiVar.j = agiyVar != null ? defpackage.agmc.z(agiyVar, new defpackage.agkh(4)) : null;
                defpackage.agjm agjmVar = agkiVar.k;
                agkiVar.k = agjmVar != null ? defpackage.agmc.C(agjmVar, new defpackage.agkd(16)) : null;
                defpackage.agji agjiVar2 = agkiVar.l;
                if (agjiVar2 != null) {
                    defpackage.agkd agkdVar = new defpackage.agkd(17);
                    defpackage.agkk agkkVar = new defpackage.agkk(agjiVar2);
                    agkdVar.a(agkkVar);
                    agjiVar = new defpackage.agji(agkkVar.a);
                }
                agkiVar.l = agjiVar;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.agka agkaVar3 = (defpackage.agka) obj;
                aooh.f(agkaVar3, "$this$transition");
                agkaVar3.b = 4000L;
                agkaVar3.a = 1200L;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.agki agkiVar2 = (defpackage.agki) obj;
                aooh.f(agkiVar2, "$this$copy");
                agkiVar2.b = defpackage.agmc.D(agkiVar2.d(), new defpackage.afno(6));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.agka agkaVar4 = (defpackage.agka) obj;
                aooh.f(agkaVar4, "$this$transition");
                agkaVar4.a = 1200L;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.agka agkaVar5 = (defpackage.agka) obj;
                aooh.f(agkaVar5, "$this$transition");
                agkaVar5.a = 400L;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aooh.f((defpackage.agka) obj, "$this$transition");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.agkq agkqVar = (defpackage.agkq) obj;
                aooh.f(agkqVar, "$this$copy");
                agkqVar.a = 32.0f;
                agkqVar.b = 0.0f;
                agkqVar.c = 0.6f;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.agki agkiVar3 = (defpackage.agki) obj;
                aooh.f(agkiVar3, "$this$copy");
                agkiVar3.b = defpackage.agmc.D(agkiVar3.d(), new defpackage.afno(i2));
                agkiVar3.f = defpackage.agmc.y(agkiVar3.a(), new defpackage.afno(i));
                agkiVar3.j = defpackage.agmc.z(agkiVar3.b(), new defpackage.afno(i3));
                return aojh.a;
            case 15:
                defpackage.agkn agknVar3 = (defpackage.agkn) obj;
                aooh.f(agknVar3, "$this$copy");
                agknVar3.d = 0.0f;
                return aojh.a;
            case 16:
                defpackage.agkb agkbVar = (defpackage.agkb) obj;
                aooh.f(agkbVar, "$this$copy");
                agkbVar.i = 0.0f;
                return aojh.a;
            case 17:
                defpackage.agkf agkfVar = (defpackage.agkf) obj;
                aooh.f(agkfVar, "$this$copy");
                agkfVar.a = 0.0f;
                return aojh.a;
            case 18:
                defpackage.agkf agkfVar2 = (defpackage.agkf) obj;
                aooh.f(agkfVar2, "$this$copy");
                agkfVar2.a = 0.0f;
                return aojh.a;
            case 19:
                return defpackage.agkb.d(obj);
            default:
                defpackage.agkn agknVar4 = (defpackage.agkn) obj;
                aooh.f(agknVar4, "$this$copy");
                agknVar4.a = 0.0f;
                agknVar4.b = 0.0f;
                return aojh.a;
        }
    }
}
