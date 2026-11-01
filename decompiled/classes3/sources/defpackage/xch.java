package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xch implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ xch(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((defpackage.xcn) this.a).d((defpackage.xcm) obj);
                break;
            case 1:
                da$.ExternalSyntheticApiModelOutline1.m((android.os.Vibrator) this.a, da$.ExternalSyntheticApiModelOutline1.m(obj));
                break;
            case 2:
                defpackage.wvi wviVar = ((defpackage.wus) obj).c;
                if (wviVar == null) {
                    wviVar = defpackage.wvi.a;
                }
                akzx akzxVar = ((defpackage.xcy) this.a).D;
                akzxVar.u();
                defpackage.xac xacVar = (defpackage.xac) akzxVar.b;
                defpackage.xac xacVar2 = defpackage.xac.a;
                j$.util.Objects.requireNonNull(wviVar);
                alat alatVar = xacVar.c;
                if (!alatVar.c()) {
                    xacVar.c = alad.J(alatVar);
                }
                xacVar.c.add(wviVar);
                break;
            case 3:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.xac xacVar3 = (defpackage.xac) akzxVar2.b;
                defpackage.xac xacVar4 = defpackage.xac.a;
                j$.util.Objects.requireNonNull(str);
                xacVar3.b |= 8;
                xacVar3.h = str;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((defpackage.rgo) this.a).e = j$.util.Optional.of((defpackage.rgu) obj);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.xdx.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/xatu/AtlasXatuAddonFeatureController", "handleActivationError", 63, "AtlasXatuAddonFeatureController.java").y("AtlasSessionController activation error: %s", (defpackage.xco) obj);
                ((defpackage.xdx) this.a).c.a(ajcm.a);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((aihb) this.a).i(obj);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((zyy) this.a).m(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                gou gouVar = (gou) obj;
                defpackage.zsx zsxVar = (defpackage.zsx) this.a;
                if (zsxVar.d) {
                    defpackage.zrx zrxVar = zsxVar.f;
                    if (zrxVar == null) {
                        zrxVar = defpackage.zrx.a;
                    }
                    gouVar.o(zrxVar, 3);
                } else if (!zsxVar.c) {
                    defpackage.zrx zrxVar2 = zsxVar.f;
                    if (zrxVar2 == null) {
                        zrxVar2 = defpackage.zrx.a;
                    }
                    gouVar.o(zrxVar2, 1);
                } else {
                    defpackage.zrx zrxVar3 = zsxVar.f;
                    if (zrxVar3 == null) {
                        zrxVar3 = defpackage.zrx.a;
                    }
                    gouVar.o(zrxVar3, 2);
                }
                break;
            case 16:
                ((gou) obj).l(((defpackage.zso) this.a).b);
                break;
            case 17:
                akzc akzcVarU = akzc.u((byte[]) obj);
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                defpackage.ahwn ahwnVar = (defpackage.ahwn) akzxVar3.b;
                defpackage.ahwn ahwnVar2 = defpackage.ahwn.a;
                j$.util.Objects.requireNonNull(akzcVarU);
                ahwnVar.b |= 16;
                ahwnVar.f = akzcVarU;
                break;
            case 18:
                this.a.a(obj);
                break;
            case 19:
                ((aihb) this.a).i(new adoz((kvt) obj));
                break;
            default:
                ((android.view.ViewGroup.MarginLayoutParams) this.a).setMarginEnd(((java.lang.Integer) obj).intValue());
                break;
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
