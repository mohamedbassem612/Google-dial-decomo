package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vlj implements ajat {
    public final /* synthetic */ vlm a;
    public final /* synthetic */ defpackage.adrp b;

    public /* synthetic */ vlj(vlm vlmVar, defpackage.adrp adrpVar) {
        this.a = vlmVar;
        this.b = adrpVar;
    }

    public final ajcq a(java.lang.Object obj) {
        java.lang.String str;
        defpackage.voy voyVarJ = this.b.j();
        vlf vlfVar = this.a.f;
        vls vlsVar = vlfVar.b;
        java.lang.String str2 = java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/objects", vlsVar.j.o(), (java.lang.String) obj);
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        long j = voyVarJ.b;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            java.lang.String string = new org.json.JSONObject().put("object", new org.json.JSONObject().put("parentFolderPath", "/VV-Mail/Greetings").put("attributes", new org.json.JSONObject().put("attribute", new org.json.JSONArray().put(new org.json.JSONObject().put("name", "date").put("value", new org.json.JSONArray().put(new java.text.SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SS'Z'", java.util.Locale.US).format(java.lang.Long.valueOf(epochMilli))))).put(new org.json.JSONObject().put("name", "X-CNS-Greeting-Type").put("value", new org.json.JSONArray().put("normal-greeting"))).put(new org.json.JSONObject().put("name", "Message-Id").put("value", new org.json.JSONArray().put(java.lang.String.valueOf(epochMilli)))).put(new org.json.JSONObject().put("name", "Subject").put("value", new org.json.JSONArray().put("my greeting"))).put(new org.json.JSONObject().put("name", "MIME-Version").put("value", new org.json.JSONArray().put("1.0"))).put(new org.json.JSONObject().put("name", "Content-Duration").put("value", new org.json.JSONArray().put(java.lang.String.valueOf((int) (j / 1000))))))).put("flags", new org.json.JSONObject().put("flag", new org.json.JSONArray().put("\\Seen").put("$CNS-Greeting-On"))).put("parentFolderPath", "/VV-Mail/Greetings")).toString();
            apiz apizVar = new apiz("google-dialer-voicemail-greeting-deposit-outer");
            apizVar.c(apjc.b);
            apiu apiuVar = apiu.a;
            apiu apiuVarU = aooh.U(new java.lang.String[]{"Content-Disposition", "form-data; name=\"root-fields\""});
            aorg aorgVar = apiy.a;
            apiy apiyVarS = aooh.S("application/json; charset=utf-8");
            aooh.f(string, "content");
            aooh.f(string, "<this>");
            java.nio.charset.Charset charsetForName = aoqv.a;
            if (apiyVarS != null) {
                java.lang.String[] strArr = apiyVarS.e;
                int iAl = ajsz.al(0, strArr.length - 1, 2);
                if (iAl < 0) {
                    str = null;
                    break;
                }
                int i = 0;
                while (true) {
                    if (!aoov.s(strArr[i], "charset", true)) {
                        if (i == iAl) {
                            str = null;
                            break;
                        }
                        i += 2;
                    } else {
                        str = strArr[i + 1];
                        break;
                    }
                }
                if (str != null) {
                    try {
                        charsetForName = java.nio.charset.Charset.forName(str);
                    } catch (java.lang.IllegalArgumentException unused) {
                        charsetForName = null;
                    }
                } else {
                    charsetForName = null;
                }
                if (charsetForName == null) {
                    charsetForName = aoqv.a;
                    java.util.Objects.toString(apiyVarS);
                    apiyVarS = aooh.S(apiyVarS.c.concat("; charset=utf-8"));
                }
            }
            aoiu aoiuVar = new aoiu(charsetForName, apiyVarS);
            java.lang.Object obj2 = aoiuVar.a;
            apiy apiyVar = (apiy) aoiuVar.b;
            byte[] bytes = string.getBytes((java.nio.charset.Charset) obj2);
            aooh.e(bytes, "getBytes(...)");
            apizVar.b(apiuVarU, antw.w(bytes, apiyVar, bytes.length));
            apiz apizVar2 = new apiz("google-dialer-voicemail-greeting-deposit-inner");
            apizVar2.c(apjc.a);
            byte[] bArrEncode = android.util.Base64.encode(ajee.n(voyVarJ.c), 0);
            apiu apiuVarU2 = aooh.U(new java.lang.String[]{"Content-Disposition", "attachment;filename=\"audio.amr\"", "Content-Transfer-Encoding", "base64"});
            apiy apiyVarS2 = aooh.S("audio/amr");
            aooh.f(bArrEncode, "content");
            int length = bArrEncode.length;
            aooh.f(bArrEncode, "content");
            apizVar2.b(apiuVarU2, antw.w(bArrEncode, apiyVarS2, length));
            apizVar.b(aooh.U(new java.lang.String[]{"Content-Disposition", "form-data;name=\"attachments\""}), apizVar2.a());
            apoy apoyVar = new apoy();
            akzc akzcVar = akzc.d;
            defpackage.akzb akzbVar = new defpackage.akzb(128);
            try {
                apizVar.a().b(apoyVar, false);
                apoy.T(apoyVar, akzbVar);
                byte[] bArrD = akzbVar.b().D();
                defpackage.ajzk ajzkVar = new defpackage.ajzk();
                ajzkVar.f(str2);
                ajzkVar.d("POST");
                ajzkVar.e(java.lang.String.format("multipart/form-data; boundary=%s", "google-dialer-voicemail-greeting-deposit-outer"), java.nio.ByteBuffer.wrap(bArrD));
                ajzkVar.b(defpackage.ajzj.a("content-length"), java.lang.String.valueOf(bArrD.length));
                ahrv ahrvVarG = ahrv.g(ahvr.H(vlsVar.e(new defpackage.ajzm(ajzkVar), 12), new defpackage.vlk(8), vlsVar.d));
                defpackage.vju vjuVar = new defpackage.vju(18);
                ajct ajctVar = vlfVar.c;
                return ahrvVarG.h(vjuVar, ajctVar).e(defpackage.vcx.class, new defpackage.vju(19), ajctVar);
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException("Failed to write greeting audio data", e);
            }
        } catch (org.json.JSONException e2) {
            throw new defpackage.vmh(e2);
        }
    }
}
