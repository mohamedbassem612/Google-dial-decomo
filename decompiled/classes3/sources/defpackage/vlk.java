package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vlk implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vlk(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String string;
        switch (this.$cid) {
            case 0:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                throw new java.lang.IllegalStateException("Need read phone state permission");
            case 1:
                throw new defpackage.vcx(defpackage.vbx.GENERAL_HTTP_EXCEPTION, (defpackage.ajzi) obj);
            case 2:
                return ((java.lang.Boolean) obj).booleanValue() ? defpackage.vcf.c : defpackage.vcf.b;
            case 3:
                defpackage.alic alicVar = (defpackage.alic) obj;
                aimz aimzVar = vma.a;
                try {
                    org.json.JSONArray jSONArray = vma.e(alicVar).getJSONObject("bulkResponseList").getJSONArray("response");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                        java.lang.String string2 = jSONObject.getString("code");
                        if ("200".equals(string2) || "204".equals(string2)) {
                            string = jSONObject.getJSONObject("success").getString("resourceURL");
                        } else {
                            if ("404".equals(string2)) {
                                string = jSONObject.getJSONObject("failure").getJSONObject("serviceException").getJSONArray("variables").getString(0);
                            } else {
                                vma.a.d().i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmJsonParser", "parseBulkDeletedIds", 379, "RestVvmJsonParser.java").y("Failed to delete voicemail, item code: %s", string2);
                            }
                        }
                        arrayList.add(vma.c(string));
                    }
                    return aify.n(arrayList);
                } catch (org.json.JSONException e) {
                    throw new defpackage.vmh(e);
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aify aifyVar = (aify) obj;
                aimz aimzVar2 = vls.a;
                return defpackage.vlr.a(aifyVar.isEmpty() ? j$.util.Optional.empty() : j$.util.Collection.-EL.stream(aifyVar).filter(new vgb(6)).findFirst());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aimz aimzVar3 = vls.a;
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.alic alicVar2 = (defpackage.alic) obj;
                java.lang.String strG = vls.g(alicVar2, "content-transfer-encoding");
                if (!"base64".equals(strG)) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Unsupported audio content transfer encoding: %s", strG));
                }
                java.lang.String strG2 = vls.g(alicVar2, "content-type");
                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) alicVar2.b;
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                return new defpackage.vmd(strG2, akzc.u(android.util.Base64.decode(bArr, 0)));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.alic alicVar3 = (defpackage.alic) obj;
                aimz aimzVar4 = vma.a;
                try {
                    org.json.JSONArray jSONArray2 = vma.e(alicVar3).getJSONObject("bulkResponseList").getJSONArray("response");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(jSONArray2.length());
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                        java.lang.String string3 = jSONObject2.getString("code");
                        if ("200".equals(string3)) {
                            arrayList2.add(vma.c(jSONObject2.getJSONObject("success").getString("resourceURL")));
                        } else {
                            vma.a.d().i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmJsonParser", "parseBulkMarkedAsReadIds", 407, "RestVvmJsonParser.java").y("Failed to mark voicemail as read, item code: %s", string3);
                        }
                    }
                    return aify.n(arrayList2);
                } catch (org.json.JSONException e2) {
                    throw new defpackage.vmh(e2);
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.alic alicVar4 = (defpackage.alic) obj;
                int i3 = alicVar4.a;
                aimz aimzVar5 = vls.a;
                if (i3 == 201) {
                    aimz aimzVar6 = vma.a;
                    try {
                        return defpackage.vlr.a(vma.e(alicVar4).getJSONObject("reference").getString("resourceURL"));
                    } catch (org.json.JSONException e3) {
                        throw new defpackage.vmh(e3);
                    }
                }
                defpackage.vbx vbxVar = defpackage.vbx.UPLOAD_GREETING_UNSUCCESSFUL;
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                akzx akzxVarM = vcp.a.m();
                akzxVarM.u();
                vcp vcpVar = akzxVarM.b;
                vcpVar.c = java.lang.Integer.valueOf(vbxVar.a());
                vcpVar.b = 2;
                return new defpackage.vlr(optionalEmpty, j$.util.Optional.of(akzxVarM.p()));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aimz aimzVar7 = vls.a;
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return defpackage.vlr.a((defpackage.vlv) obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return defpackage.vlr.a((defpackage.vlz) obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aimz aimzVar8 = vls.a;
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return vmc.b;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aimz aimzVar9 = vmc.a;
                return ((defpackage.vcx) obj).a;
            case 15:
                aimz aimzVar10 = vmc.a;
                return ((defpackage.vcx) obj).a;
            case 16:
                aimz aimzVar11 = vmc.a;
                return null;
            case 17:
                aimz aimzVar12 = vmc.a;
                return null;
            case 18:
                j$.util.Optional optionalOfNullable = ((defpackage.vlr) obj).a;
                vcr vcrVar = vmg.a;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.vlz) optionalOfNullable.get()).a));
                }
                return (java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE);
            case 19:
                j$.util.Optional optionalOfNullable2 = ((defpackage.vlr) obj).a;
                vcr vcrVar2 = vmg.a;
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.vlz) optionalOfNullable2.get()).b));
                }
                return (java.lang.Boolean) optionalOfNullable2.orElse(java.lang.Boolean.FALSE);
            default:
                vcr vcrVar3 = vmg.a;
                return ((defpackage.vcx) obj).a;
        }
    }
}
