package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class zqi implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ zqi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v42, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v65, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v67, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v68, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.afpl afplVar;
        boolean z = true;
        int i = 0;
        switch (this.$cid) {
            case 0:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                defpackage.zqj zqjVar = (defpackage.zqj) this.a;
                zqjVar.a |= zqjVar.h.i(zqjVar.g.getDetails().getAccountHandle()).f() == 13;
                return null;
            case 1:
                ailj ailjVarK = ((aigf) obj).e().k();
                while (true) {
                    java.lang.Object obj2 = this.a;
                    if (!ailjVarK.hasNext()) {
                        return ((aift) obj2).h();
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                    if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                        ((aift) obj2).i((android.telecom.PhoneAccountHandle) entry.getKey());
                    }
                }
                break;
            case 2:
                ((stw) ((zsk) this.a).f.b).a((defpackage.zrx) obj);
                return null;
            case 3:
                defpackage.aavt aavtVar = (defpackage.aavt) obj;
                aify aifyVar = (aify) j$.util.Collection.-EL.stream(aavtVar.a()).filter(new defpackage.zun(0)).collect(aido.a);
                defpackage.zur.a.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/sender/impl/DialerMessageSenderImpl", "lookupFirstCapableNearbyNode", 155, "DialerMessageSenderImpl.java").M("Found %d nearby nodes out of %d reachable %s nodes", java.lang.Integer.valueOf(aifyVar.size()), java.lang.Integer.valueOf(aavtVar.a().size()), ((defpackage.zur) this.a).b);
                return aifyVar.isEmpty() ? defpackage.afpl.af(defpackage.zul.b) : defpackage.afpl.ag((com.google.android.gms.wearable.internal.NodeParcelable) aifyVar.get(0));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aacw aacwVar = (java.lang.Throwable) obj;
                boolean z2 = aacwVar instanceof aacw;
                java.lang.Object obj3 = this.a;
                if (!z2) {
                    defpackage.zur.a.c().k(aacwVar).l("com/google/android/dialershared/wearabledatalayer/messageclient/sender/impl/DialerMessageSenderImpl", "lookupFirstCapableNearbyNode", 171, "DialerMessageSenderImpl.java").y("Failed to lookup %s.", ((defpackage.zur) obj3).b);
                    return defpackage.afpl.af(defpackage.zul.d);
                }
                aacw aacwVar2 = aacwVar;
                if (aacwVar2.a() == 17) {
                    return defpackage.afpl.af(defpackage.zul.e);
                }
                defpackage.zur.a.c().k(aacwVar).l("com/google/android/dialershared/wearabledatalayer/messageclient/sender/impl/DialerMessageSenderImpl", "lookupFirstCapableNearbyNode", 181, "DialerMessageSenderImpl.java").G("Failed to lookup %s. Status code %d", ((defpackage.zur) obj3).b, aacwVar2.a());
                return defpackage.afpl.af(defpackage.zul.d);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.afpl afplVar2 = (defpackage.afpl) obj;
                java.lang.Object obj4 = afplVar2.b;
                defpackage.zul zulVar = defpackage.zul.a;
                boolean zEquals = ((defpackage.zul) obj4).equals(zulVar);
                java.lang.Object obj5 = this.a;
                if (zEquals) {
                    java.lang.Object obj6 = afplVar2.a;
                    j$.util.Optional optional = (j$.util.Optional) obj6;
                    if (optional.isPresent() && ((byte[]) optional.orElseThrow()).length == 0) {
                        return new defpackage.afpl(defpackage.zul.a, j$.util.Optional.empty(), (byte[]) null);
                    }
                    try {
                        afplVar = new defpackage.afpl(zulVar, j$.util.Optional.of(((defpackage.ztw) obj5).i.a((byte[]) ((j$.util.Optional) obj6).orElseThrow(), akzq.a())), (byte[]) null);
                    } catch (alaz e) {
                        throw new java.lang.IllegalArgumentException("unable to parse invalid protocol buffer", e);
                    }
                    break;
                } else {
                    afplVar = new defpackage.afpl(afplVar2.b, j$.util.Optional.empty(), (byte[]) null);
                }
                return afplVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return zzt.a(((java.lang.Boolean) obj).booleanValue(), ((defpackage.aaar) this.a).c.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                akzx akzxVarP = ((defpackage.abdm) obj).p();
                while (true) {
                    java.lang.Object obj7 = this.a;
                    if (i >= ((defpackage.abdm) akzxVarP.b).b.size()) {
                        akzxVarP.u();
                        defpackage.abdm abdmVar = (defpackage.abdm) akzxVarP.b;
                        j$.util.Objects.requireNonNull(obj7);
                        abdmVar.b();
                        abdmVar.b.add(obj7);
                        return (defpackage.abdm) akzxVarP.p();
                    }
                    if (((defpackage.abdk) ((defpackage.abdm) akzxVarP.b).b.get(i)).d.equals(((defpackage.abdk) obj7).d)) {
                        akzxVarP.u();
                        defpackage.abdm abdmVar2 = (defpackage.abdm) akzxVarP.b;
                        j$.util.Objects.requireNonNull(obj7);
                        abdmVar2.b();
                        abdmVar2.b.set(i, obj7);
                        return (defpackage.abdm) akzxVarP.p();
                    }
                    i++;
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aiof aiofVar = acea.a;
                this.a.a(obj);
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((achq) this.a).h();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aiof aiofVar2 = defpackage.acjg.a;
                return java.lang.Boolean.valueOf(((java.lang.String) this.a).equals(((android.view.View) obj).getTag(2131428318)));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aiof aiofVar3 = defpackage.acjg.a;
                return java.lang.Boolean.valueOf(((java.lang.String) this.a).equals(((android.view.View) obj).getTag(2131428318)));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.acui acuiVar = (defpackage.acui) obj;
                if (acuiVar == null) {
                    return acuiVar;
                }
                ((acwx) this.a).b.h(acwx.i(acuiVar));
                return acuiVar;
            case 15:
                return new defpackage.adad((defpackage.acvu) this.a, (defpackage.acvu) obj);
            case 16:
                return (defpackage.acui) ((akzx) this.a).p();
            case 17:
                ahyn ahynVar = (ahyn) obj;
                if (ahynVar.f() && ((ahyn) this.a).equals(ahynVar)) {
                    z = false;
                }
                if (ahynVar != null) {
                    return new defpackage.acxj(z, ahynVar);
                }
                throw new java.lang.NullPointerException("Null freshETagOptional");
            case 18:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                ((adak) this.a).j.l(1036);
                adbe.c("%s: Failed to remove expired groups!", "ExpirationHandler");
                return null;
            case 19:
                android.net.Uri uri = (android.net.Uri) obj;
                if (uri == null) {
                    return null;
                }
                this.a.add(uri);
                return null;
            default:
                this.a.addAll((java.util.List) obj);
                return null;
        }
    }
}
