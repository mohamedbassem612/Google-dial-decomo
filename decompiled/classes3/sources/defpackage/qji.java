package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qji implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qji(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v24, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v25, types: [bry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Object, rio] */
    /* JADX WARN: Type inference failed for: r14v49, types: [java.lang.Object, rst] */
    /* JADX WARN: Type inference failed for: r14v52, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v56, types: [ccp, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.qjl) this.a).m.f();
            case 1:
                return pez.aq((android.content.Context) this.a, (java.lang.CharSequence) obj);
            case 2:
                ((defpackage.qjl) this.a).c();
                return null;
            case 3:
                defpackage.apqr apqrVar = (defpackage.apqr) obj;
                aooh.f(apqrVar, "it");
                aoin aoinVar = (aoin) ((defpackage.qkk) apqrVar.a(defpackage.qkk.class)).al().e.get(this.a);
                if (aoinVar != null) {
                    ((defpackage.qjb) aoinVar.a()).a();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.qky.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/statusbarnotification/service/StatusBarNotificationProducerModule", "produceContentIntent$<anonymous>", 731, "StatusBarNotificationProducerModule.kt").v("apply OEM modification on content intent");
                return ((rsr) obj).o((j$.util.Optional) this.a, 0);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.qky.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/statusbarnotification/service/StatusBarNotificationProducerModule", "produceFullScreenIntent$<anonymous>", 764, "StatusBarNotificationProducerModule.kt").v("apply OEM modification on full screen intent");
                return ((rsr) obj).o((j$.util.Optional) this.a, 1);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                defpackage.qis qisVar = defpackage.qis.DEFAULT_ICON;
                aooh.c(bitmap);
                return new defpackage.qir(qisVar, new defpackage.qiq(bitmap, (defpackage.abwd) this.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return a.z((czc) this.a, (czb) obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.o(diqVar, 0);
                java.lang.String str = ((defpackage.qxm) this.a).e;
                if (str != null) {
                    dfb.q(diqVar, str);
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((java.lang.Boolean) obj).booleanValue();
                this.a.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aooh.f((aes) obj, "$this$AnimatedContent");
                ?? r14 = this.a;
                return new afo(aga.j(r14.b(), 0.0f, 0L, 6), aga.k(r14.b(), 0.0f, 0L, 6), (ahu) null, 12);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                diq diqVar2 = (diq) obj;
                aooh.f(diqVar2, "$this$semantics");
                defpackage.quf qufVar = (defpackage.quf) this.a;
                java.lang.String str2 = qufVar.n;
                aooh.e(str2, "getStateDescription(...)");
                if (str2.length() != 0) {
                    java.lang.String str3 = qufVar.n;
                    aooh.e(str3, "getStateDescription(...)");
                    dfb.q(diqVar2, str3);
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                rjb.a.b().l("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentStatusNotifier", "updateConsentValue$<anonymous>", 71, "JoyballConsentStatusNotifier.kt").y("Successfully update consent for %s", this.a.e());
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.rij rijVar = (defpackage.rij) obj;
                aooh.f(rijVar, "it");
                akzx akzxVarM = defpackage.rjs.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(rijVar, "value");
                akzxVarM.u();
                ((defpackage.rjs) akzxVarM.b).b = rijVar.a();
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.rjr rjrVar = new defpackage.rjr();
                amxr.g(rjrVar);
                ahgl.b(rjrVar, (defpackage.rjs) aladVarP);
                rjrVar.r(((defpackage.rkc) this.a).b.I(), "JOYBALL_DIALOG_FRAGMENT");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.String str4 = (java.lang.String) obj;
                aooh.f(str4, "it");
                aooh.f(str4, "value");
                akzx akzxVar = (akzx) ((hgw) this.a).a;
                akzxVar.u();
                rli rliVar = akzxVar.b;
                rli rliVar2 = rli.a;
                j$.util.Objects.requireNonNull(str4);
                rliVar.b |= 4;
                rliVar.e = str4;
                return aojh.a;
            case 15:
                aes aesVar = (aes) obj;
                aooh.f(aesVar, "$this$AnimatedContent");
                agf agfVarJ = aga.j(new alm(250, 150, new abnj((byte[]) null).e), 0.0f, mni.bj(0.5f, 0.5f), 2);
                alm almVarBv = den.bv(250, 0, new abnj((byte[]) null).d, 2);
                cmj cmjVar = cmh.e;
                afo afoVar = new afo(agfVarJ.a(aga.h(almVarBv, cmjVar, (aonj) null, 12)), aga.k(den.bv(150, 0, new abnj((byte[]) null).b, 2), 0.0f, mni.bj(0.5f, 0.5f), 2).a(aga.l(new alm(400, 150, new abnj((byte[]) null).d), cmjVar, 12)), (ahu) null, 12);
                if (((defpackage.rtp) this.a).a() instanceof rti) {
                    aesVar.a(afoVar, (ahu) null);
                }
                return afoVar;
            case 16:
                rsd rsdVar = (rsd) obj;
                aooh.f(rsdVar, "key");
                ((defpackage.qhr) this.a).b.a(rsdVar);
                return aojh.a;
            case 17:
                akzx akzxVar2 = (akzx) obj;
                aooh.f(akzxVar2, "it");
                akzxVar2.z((alad) this.a);
                return aojh.a;
            case 18:
                cra craVar = (cra) obj;
                aooh.f(craVar, "$this$graphicsLayer");
                craVar.v(a.G((cer) this.a));
                return aojh.a;
            case 19:
                return a.J((java.lang.String) this.a, (diq) obj);
            default:
                ((java.lang.Boolean) obj).booleanValue();
                ?? r15 = this.a;
                a.E((ccp) r15, !a.C((ccp) r15));
                return aojh.a;
        }
    }
}
