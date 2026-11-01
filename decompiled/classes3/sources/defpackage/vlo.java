package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vlo implements ahyc {
    public final /* synthetic */ vls a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ vlo(vls vlsVar, int i, java.lang.String str, long j) {
        this.a = vlsVar;
        this.d = i;
        this.b = str;
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0109 A[Catch: JSONException -> 0x013a, TRY_LEAVE, TryCatch #0 {JSONException -> 0x013a, blocks: (B:24:0x00d1, B:31:0x00f1, B:36:0x0109, B:35:0x0101), top: B:45:0x00d1 }] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aiii, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.String str;
        java.lang.Throwable vcxVar;
        defpackage.alic alicVar = (defpackage.alic) obj;
        int i = alicVar.a;
        aihd aihdVar = vls.b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        boolean zContains = aihdVar.contains(numValueOf);
        vls vlsVar = this.a;
        java.lang.String str2 = this.b;
        long j = this.c;
        if (zContains) {
            vlsVar.f(str2, 2, j);
            return alicVar;
        }
        ?? r1 = alicVar.c;
        java.lang.String str3 = r1.s(defpackage.ajzj.a("reason-phrase")) ? (java.lang.String) r1.f(defpackage.ajzj.a("reason-phrase")).get(0) : "";
        int i2 = this.d;
        aimw aimwVarL = vls.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmGateway", "assertSuccessfulHttpResponse", 612, "RestVvmGateway.java");
        switch (i2) {
            case 2:
                str = "SERVICE_PROFILE";
                break;
            case 3:
                str = "INBOX_QUOTA";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str = "OBJECT_SEARCH";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str = "MARK_OBJECT_AS_READ";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str = "BULK_DELETE";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str = "DOWNLOAD_OBJECT";
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                str = "OBJECT_DEPOSIT";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                str = "RETRIEVE_OBJECT";
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                str = "GREETING_ACTIVATION";
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                str = "GREETING_DEACTIVATION";
                break;
            default:
                str = "UPLOAD_OBJECT";
                break;
        }
        aimwVarL.M("Error making request to endpoint %s, http status code: %d, reason phrase: %s", str, numValueOf, str3);
        akzx akzxVarM = defpackage.amso.a.m();
        akzxVarM.u();
        defpackage.amso amsoVar = (defpackage.amso) akzxVarM.b;
        amsoVar.c = i2 - 1;
        amsoVar.b |= 1;
        java.lang.String strValueOf = java.lang.String.valueOf(i);
        akzxVarM.u();
        defpackage.amso amsoVar2 = (defpackage.amso) akzxVarM.b;
        j$.util.Objects.requireNonNull(strValueOf);
        amsoVar2.b |= 2;
        amsoVar2.d = strValueOf;
        defpackage.amso amsoVar3 = (defpackage.amso) akzxVarM.p();
        vdq vdqVar = vlsVar.g;
        agsm.i(972, ahvr.F(new defpackage.uwl(vdqVar, amsoVar3, 16), vdqVar.d), "failed to add VvmWorkMetrics", new java.lang.Object[0]);
        vlsVar.f(str2, 3, j);
        if (vls.c.contains(numValueOf)) {
            throw new defpackage.vcx(defpackage.vbx.SERVER_NOT_RESPONDING);
        }
        aimz aimzVar = vma.a;
        try {
            java.lang.String string = vma.e(alicVar).getString("error");
            int iHashCode = string.hashCode();
            if (iHashCode != -770386803) {
                if (iHashCode == -317456057 && string.equals("MSTORE_ANCHORING_FAILURE_AT_CDB")) {
                    vcxVar = new defpackage.vcv(defpackage.vbs.NETWORK_CONNECTION_AUTH_UNKNOWN_USER);
                } else {
                    vma.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmJsonParser", "getExceptionFromHttpResponse", 231, "RestVvmJsonParser.java").y("other error message: %s", string);
                    vcxVar = new defpackage.vcv(defpackage.vbs.UNRECOGNIZED_ERROR);
                }
            } else if (string.equals("MSTORE_RLY-MST_NWKERR")) {
                vcxVar = new defpackage.vcx(defpackage.vbs.NETWORK_CONNECTION_UNEXPECTED_ERROR);
            } else {
                vma.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmJsonParser", "getExceptionFromHttpResponse", 231, "RestVvmJsonParser.java").y("other error message: %s", string);
                vcxVar = new defpackage.vcv(defpackage.vbs.UNRECOGNIZED_ERROR);
            }
            throw vcxVar;
        } catch (org.json.JSONException unused) {
            a.bI(vma.a.d(), "no error message", "com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmJsonParser", "getExceptionFromHttpResponse", (char) 235, "RestVvmJsonParser.java", zct.b);
            throw new defpackage.vcv(defpackage.vbs.UNRECOGNIZED_ERROR);
        }
    }
}
