package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vma {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmJsonParser");
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^.*objects/(((?!/).)+)$");
    public final defpackage.ajct b;
    private final defpackage.rlv d;

    public vma(defpackage.ajct ajctVar, defpackage.rlv rlvVar) {
        this.b = ajctVar;
        this.d = rlvVar;
    }

    public static vmf b(vlx vlxVar) {
        j$.util.Optional optionalOf;
        j$.util.OptionalLong optionalLongEmpty;
        defpackage.aigf aigfVar = vlxVar.b;
        if (aigfVar.containsKey("from")) {
            java.lang.String str = (java.lang.String) aigfVar.get("from");
            int iIndexOf = str.indexOf("@");
            java.lang.String strSubstring = iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
            if (str.startsWith("tel:")) {
                strSubstring = str.replace("tel:", "");
            }
            optionalOf = j$.util.Optional.of(strSubstring);
            optionalOf.isPresent();
            if (true != defpackage.anty.aD((java.lang.String) optionalOf.get())) {
                optionalOf = j$.util.Optional.empty();
            }
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        java.lang.String str2 = (java.lang.String) optionalOf.orElseThrow(new vjq(7));
        if (aigfVar.containsKey("date")) {
            optionalLongEmpty = j$.util.OptionalLong.of(((j$.time.Instant) j$.time.format.DateTimeFormatter.ISO_INSTANT.parse((java.lang.String) aigfVar.get("date"), new vlt(0))).toEpochMilli());
        } else {
            optionalLongEmpty = j$.util.OptionalLong.empty();
        }
        long jOrElseThrow = optionalLongEmpty.orElseThrow(new vjq(8));
        long jOrElseThrow2 = (aigfVar.containsKey("content-duration") ? j$.util.OptionalLong.of(java.lang.Long.parseLong((java.lang.String) aigfVar.get("content-duration"))) : j$.util.OptionalLong.empty()).orElseThrow(new vjq(9));
        boolean zContains = vlxVar.c.contains("\\Seen");
        defpackage.aify aifyVar = vlxVar.d;
        j$.util.Optional optionalF = f(aifyVar, "audio/");
        j$.util.Optional optionalF2 = f(aifyVar, "text/");
        j$.util.Optional.empty();
        j$.util.Optional.empty();
        java.lang.String str3 = vlxVar.a;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null fromNumber");
        }
        if (optionalF == null) {
            throw new java.lang.NullPointerException("Null audioUrl");
        }
        if (optionalF2 != null) {
            return new vmf(str3, str2, jOrElseThrow, jOrElseThrow2, zContains, optionalF, optionalF2);
        }
        throw new java.lang.NullPointerException("Null transcriptionUrl");
    }

    static java.lang.String c(java.lang.String str) {
        java.util.regex.Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        throw new java.lang.IllegalStateException("no object id matched");
    }

    public static org.json.JSONObject e(alic alicVar) {
        return new org.json.JSONObject(defpackage.akzc.t((java.nio.ByteBuffer) alicVar.b).A());
    }

    private static j$.util.Optional f(java.util.List list, java.lang.String str) {
        defpackage.ailk ailkVarListIterator = ((defpackage.aify) list).listIterator(0);
        while (ailkVarListIterator.hasNext()) {
            vlw vlwVar = (vlw) ailkVarListIterator.next();
            if (vlwVar.a.contains(str)) {
                return j$.util.Optional.of(vlwVar.b);
            }
        }
        return j$.util.Optional.empty();
    }

    public final vlx a(org.json.JSONObject jSONObject) throws org.json.JSONException {
        defpackage.aify aifyVarG;
        java.lang.String strC = c(jSONObject.getString("resourceURL"));
        org.json.JSONArray jSONArray = jSONObject.getJSONObject("attributes").getJSONArray("attribute");
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            java.lang.String strP = defpackage.ahvr.p(jSONObject2.getString("name"));
            if (jSONObject2.getJSONArray("value").length() != 0) {
                aigbVar.i(strP, jSONObject2.getJSONArray("value").optString(0));
            }
        }
        defpackage.aigf aigfVarE = aigbVar.e(true);
        if (jSONObject.has("flags")) {
            org.json.JSONArray jSONArray2 = jSONObject.getJSONObject("flags").getJSONArray("flag");
            defpackage.aift aiftVar = new defpackage.aift(4);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                aiftVar.i(jSONArray2.getString(i2));
            }
            aifyVarG = aiftVar.g();
        } else {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmJsonParser", "parseVvmObjectFromJsonObject", (char) 257, "RestVvmJsonParser.java")).v("flags element is missing in VVM object");
            this.d.o(defpackage.rmx.VM_OBJECT_MISSING_FLAGS);
            aifyVarG = defpackage.aike.a;
        }
        org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("payloadPart");
        defpackage.aift aiftVar2 = new defpackage.aift(4);
        for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
            org.json.JSONObject jSONObject3 = jSONArray3.getJSONObject(i3);
            aiftVar2.i(new vlw(jSONObject3.getString("contentType"), jSONObject3.getString("href")));
        }
        return new vlx(strC, aigfVarE, aifyVarG, aiftVar2.g());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vmh */
    public final vly d(alic alicVar) throws vmh {
        try {
            org.json.JSONObject jSONObjectE = e(alicVar);
            org.json.JSONArray jSONArray = jSONObjectE.getJSONObject("objectList").getJSONArray("object");
            defpackage.aift aiftVar = new defpackage.aift(4);
            for (int i = 0; i < jSONArray.length(); i++) {
                aiftVar.i(a(jSONArray.getJSONObject(i)));
            }
            j$.util.Optional optionalOf = j$.util.Optional.of(jSONObjectE.getJSONObject("objectList").optString("cursor"));
            optionalOf.isPresent();
            if (true != defpackage.anty.aD((java.lang.String) optionalOf.get())) {
                optionalOf = j$.util.Optional.empty();
            }
            return new vly(aiftVar.g(), optionalOf);
        } catch (org.json.JSONException e) {
            throw new vmh(e);
        }
    }
}
