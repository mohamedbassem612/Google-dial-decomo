package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vju implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vju(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ork */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Type inference failed for: r0v73, types: [aiii, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) throws ork {
        java.lang.String str;
        defpackage.vbs vbsVar;
        switch (this.$cid) {
            case 0:
                defpackage.aprf aprfVar = (defpackage.aprf) obj;
                return java.lang.String.format(java.util.Locale.US, "%s:%s=%s;%s=%s;%s=%s;%s", "STATUS", "pv", "13", "ct", wsc.aE(), "pt", java.lang.Integer.valueOf(aprfVar.u()), aprfVar.v());
            case 1:
                defpackage.aprf aprfVar2 = (defpackage.aprf) obj;
                return java.lang.String.format(java.util.Locale.US, "%s:%s=%s;%s=%s;%s=%s;%s", "Activate", "pv", "13", "ct", wsc.aE(), "pt", java.lang.Integer.valueOf(aprfVar2.u()), aprfVar2.v());
            case 2:
                akzx akzxVarM = vcr.a.m();
                vcq vcqVar = vcq.a;
                akzxVarM.u();
                vcr vcrVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(vcqVar);
                vcrVar.c = vcqVar;
                vcrVar.b = 1;
                return akzxVarM.p();
            case 3:
                akzx akzxVarM2 = vcr.a.m();
                vcq vcqVar2 = vcq.a;
                akzxVarM2.u();
                vcr vcrVar2 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(vcqVar2);
                vcrVar2.c = vcqVar2;
                vcrVar2.b = 1;
                return akzxVarM2.p();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (((android.net.Uri) obj) != null) {
                    akzx akzxVarM3 = vcr.a.m();
                    vcq vcqVar3 = vcq.a;
                    akzxVarM3.u();
                    vcr vcrVar3 = akzxVarM3.b;
                    j$.util.Objects.requireNonNull(vcqVar3);
                    vcrVar3.c = vcqVar3;
                    vcrVar3.b = 1;
                    return akzxVarM3.p();
                }
                akzx akzxVarM4 = vcr.a.m();
                akzx akzxVarM5 = vcp.a.m();
                defpackage.vbs vbsVar2 = defpackage.vbs.CUSTOM_GREETING_DOWNLOAD_ERROR;
                akzxVarM5.u();
                vcp vcpVar = akzxVarM5.b;
                vcpVar.c = java.lang.Integer.valueOf(vbsVar2.a());
                vcpVar.b = 1;
                vcp vcpVarP = akzxVarM5.p();
                akzxVarM4.u();
                vcr vcrVar4 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(vcpVarP);
                vcrVar4.c = vcpVarP;
                vcrVar4.b = 2;
                return akzxVarM4.p();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                throw new defpackage.vcx(defpackage.vbw.NETWORK_CONNECTION_AUTH_MAILBOX_NOT_INITIALIZED, (java.util.concurrent.TimeoutException) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                throw new defpackage.vcv(defpackage.vbw.SELF_PROVISIONING_GATEWAY_CONNECTION_FAILED, "timeout on clicking subscribe link", (java.util.concurrent.TimeoutException) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.vbs vbsVar3 = defpackage.vbs.ACTIVATE_PROVISIONING_FAILED;
                throw new defpackage.vcv(vbsVar3, "General VVM error state: " + vbsVar3.a(), (defpackage.vki) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return true == optional.isPresent() ? j$.util.Optional.ofNullable(defpackage.vkj.f((java.lang.String) optional.get())) : optional;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                throw new defpackage.vcv(defpackage.vbw.SELF_PROVISIONING_GATEWAY_CONNECTION_FAILED, "timeout on retrieving self provisioning response", (java.util.concurrent.TimeoutException) obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new java.lang.String(((java.nio.ByteBuffer) ((defpackage.alic) obj).b).array());
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.ajzi ajziVar = (defpackage.ajzi) obj;
                int i = ajziVar.a;
                switch (i) {
                    case 1:
                        str = "OK";
                        break;
                    case 2:
                        str = "CANCELLED";
                        break;
                    case 3:
                        str = "UNKNOWN";
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        str = "INVALID_ARGUMENT";
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        str = "DEADLINE_EXCEEDED";
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        str = "NOT_FOUND";
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        str = "ALREADY_EXISTS";
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        str = "PERMISSION_DENIED";
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        str = "RESOURCE_EXHAUSTED";
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        str = "FAILED_PRECONDITION";
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        str = "ABORTED";
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        str = "OUT_OF_RANGE";
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        str = "UNIMPLEMENTED";
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        str = "INTERNAL";
                        break;
                    case 15:
                        str = "UNAVAILABLE";
                        break;
                    default:
                        str = "null";
                        break;
                }
                if (i != 0) {
                    throw new defpackage.vki("http request failed with the code: ".concat(str), ajziVar);
                }
                throw null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.String str2 = (java.lang.String) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray("[\"(?i)Subscribe to Basic Visual Voice Mail\",\"(?i)Subscribe to Basic Visual Voicemail\"]");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList.add(java.util.regex.Pattern.compile(jSONArray.getString(i2)));
                    }
                    if (arrayList.isEmpty()) {
                        throw new defpackage.vki("empty patterns");
                    }
                    android.text.Spanned spannedM = fh$.ExternalSyntheticApiModelOutline0.m(str2, 0);
                    android.text.style.URLSpan[] uRLSpanArr = (android.text.style.URLSpan[]) spannedM.getSpans(0, spannedM.length(), android.text.style.URLSpan.class);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (android.text.style.URLSpan uRLSpan : uRLSpanArr) {
                        java.lang.String string = spannedM.subSequence(spannedM.getSpanStart(uRLSpan), spannedM.getSpanEnd(uRLSpan)).toString();
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((java.util.regex.Pattern) it.next()).matcher(string).matches()) {
                                return uRLSpan.getURL();
                            }
                        }
                        sb.append(string);
                    }
                    throw new defpackage.vki("Subscribe link not found: ".concat(sb.toString()));
                } catch (org.json.JSONException e) {
                    throw new defpackage.vki("Unable to parse patterns", e);
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                throw new defpackage.vcv(defpackage.vbw.SELF_PROVISIONING_GATEWAY_CONNECTION_FAILED, "timeout on retrieving SPG URL", (java.util.concurrent.TimeoutException) obj);
            case 15:
                defpackage.vek vekVar = (defpackage.vek) obj;
                aimz aimzVar = defpackage.vko.a;
                java.lang.String str3 = (vekVar.b == 1 ? (defpackage.veo) vekVar.c : defpackage.veo.a).c;
                java.lang.String str4 = (vekVar.b == 1 ? (defpackage.veo) vekVar.c : defpackage.veo.a).d;
                if (android.text.TextUtils.isEmpty(str3)) {
                    a.bI(defpackage.vko.a.c().m(aioa.b), "missing status", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "performStatusCheck", (char) 176, "Vvm3Provisioner.java", zct.b);
                    return defpackage.vko.c;
                }
                if ("N".equals(str3)) {
                    defpackage.vko.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "performStatusCheck", 181, "Vvm3Provisioner.java").v("needs to initiate mailbox, retry activate VVM");
                    throw new defpackage.vcx(defpackage.vbw.NETWORK_CONNECTION_AUTH_MAILBOX_NOT_INITIALIZED);
                }
                if ("R".equals(str3) && "0".equals(str4)) {
                    return defpackage.vko.b;
                }
                defpackage.vko.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "performStatusCheck", 192, "Vvm3Provisioner.java").I("invalid status: %s, return code: %s", str3, str4);
                return defpackage.vko.c;
            case 16:
                defpackage.alic alicVar = (defpackage.alic) obj;
                int i3 = alicVar.a;
                vcr vcrVar5 = vlc.a;
                if (i3 == 200) {
                    return vlc.a;
                }
                ?? r0 = alicVar.c;
                java.lang.String str5 = r0.s(defpackage.ajzj.a("reason-phrase")) ? (java.lang.String) r0.f(defpackage.ajzj.a("reason-phrase")).get(0) : "";
                akzx akzxVarM6 = vcr.a.m();
                akzx akzxVarM7 = vcp.a.m();
                switch (str5) {
                    case "PIN length too Short":
                        vbsVar = defpackage.vbs.PIN_CHANGE_TOO_SHORT;
                        break;
                    case "PIN in Use":
                        vbsVar = defpackage.vbs.PIN_CHANGE_NEW_UNCHANGED;
                        break;
                    case "PIN length too Long":
                        vbsVar = defpackage.vbs.PIN_CHANGE_TOO_LONG;
                        break;
                    case "PIN has invalid Character":
                        vbsVar = defpackage.vbs.PIN_CHANGE_INVALID_CHARACTER;
                        break;
                    case "PIN recently Changed":
                        vbsVar = defpackage.vbs.PIN_CHANGE_RECENTLY_CHANGED;
                        break;
                    case "PIN last 4 digit match MSISDN":
                        vbsVar = defpackage.vbs.PIN_CHANGE_MSISDN_LAST_4_DIGITS;
                        break;
                    case "Invalid OLD PIN":
                        vbsVar = defpackage.vbs.PIN_CHANGE_INCORRECT_OLD_PIN;
                        break;
                    case "PIN has Repeated Digits":
                        vbsVar = defpackage.vbs.PIN_CHANGE_REPEATED_DIGITS;
                        break;
                    case "PIN has Consecutive Numbers":
                        vbsVar = defpackage.vbs.PIN_CHANGE_CONSECUTIVE_DIGITS;
                        break;
                    default:
                        vbsVar = defpackage.vbs.PIN_CHANGE_SYSTEM_ERROR;
                        break;
                }
                akzxVarM7.u();
                vcp vcpVar2 = akzxVarM7.b;
                vcpVar2.c = java.lang.Integer.valueOf(vbsVar.a());
                vcpVar2.b = 1;
                akzxVarM6.u();
                vcr vcrVar6 = akzxVarM6.b;
                vcp vcpVarP2 = akzxVarM7.p();
                j$.util.Objects.requireNonNull(vcpVarP2);
                vcrVar6.c = vcpVarP2;
                vcrVar6.b = 2;
                return akzxVarM6.p();
            case 17:
                vcr vcrVar7 = vlf.a;
                akzx akzxVarM8 = vcr.a.m();
                vcp vcpVar3 = ((defpackage.vle) obj).a;
                akzxVarM8.u();
                vcr vcrVar8 = akzxVarM8.b;
                j$.util.Objects.requireNonNull(vcpVar3);
                vcrVar8.c = vcpVar3;
                vcrVar8.b = 2;
                return akzxVarM8.p();
            case 18:
                defpackage.vlr vlrVar = (defpackage.vlr) obj;
                j$.util.Optional optional2 = vlrVar.a;
                vcr vcrVar9 = vlf.a;
                if (optional2.isPresent()) {
                    return vlf.a;
                }
                akzx akzxVarM9 = vcr.a.m();
                vcp vcpVar4 = (vcp) vlrVar.b.orElseThrow();
                akzxVarM9.u();
                vcr vcrVar10 = akzxVarM9.b;
                j$.util.Objects.requireNonNull(vcpVar4);
                vcrVar10.c = vcpVar4;
                vcrVar10.b = 2;
                return akzxVarM9.p();
            case 19:
                vcr vcrVar11 = vlf.a;
                return ((defpackage.vcx) obj).a;
            default:
                ork orkVar = (ork) obj;
                int i4 = orkVar.a;
                if (i4 == 1) {
                    throw new defpackage.vcx(defpackage.vbx.DIGEST_AUTH_FAILURE_NO_401);
                }
                if (i4 == 2) {
                    throw new defpackage.vcx(defpackage.vbx.DIGEST_AUTH_FAILURE_NO_WWW_HEADER);
                }
                throw orkVar;
        }
    }
}
