package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmj {
    public static final defpackage.apmg[] a = {new defpackage.apmg(defpackage.apmg.f, ""), new defpackage.apmg(defpackage.apmg.c, "GET"), new defpackage.apmg(defpackage.apmg.c, "POST"), new defpackage.apmg(defpackage.apmg.d, "/"), new defpackage.apmg(defpackage.apmg.d, "/index.html"), new defpackage.apmg(defpackage.apmg.e, "http"), new defpackage.apmg(defpackage.apmg.e, "https"), new defpackage.apmg(defpackage.apmg.b, "200"), new defpackage.apmg(defpackage.apmg.b, "204"), new defpackage.apmg(defpackage.apmg.b, "206"), new defpackage.apmg(defpackage.apmg.b, "304"), new defpackage.apmg(defpackage.apmg.b, "400"), new defpackage.apmg(defpackage.apmg.b, "404"), new defpackage.apmg(defpackage.apmg.b, "500"), new defpackage.apmg("accept-charset", ""), new defpackage.apmg("accept-encoding", "gzip, deflate"), new defpackage.apmg("accept-language", ""), new defpackage.apmg("accept-ranges", ""), new defpackage.apmg("accept", ""), new defpackage.apmg("access-control-allow-origin", ""), new defpackage.apmg("age", ""), new defpackage.apmg("allow", ""), new defpackage.apmg("authorization", ""), new defpackage.apmg("cache-control", ""), new defpackage.apmg("content-disposition", ""), new defpackage.apmg("content-encoding", ""), new defpackage.apmg("content-language", ""), new defpackage.apmg("content-length", ""), new defpackage.apmg("content-location", ""), new defpackage.apmg("content-range", ""), new defpackage.apmg("content-type", ""), new defpackage.apmg("cookie", ""), new defpackage.apmg("date", ""), new defpackage.apmg("etag", ""), new defpackage.apmg("expect", ""), new defpackage.apmg("expires", ""), new defpackage.apmg("from", ""), new defpackage.apmg("host", ""), new defpackage.apmg("if-match", ""), new defpackage.apmg("if-modified-since", ""), new defpackage.apmg("if-none-match", ""), new defpackage.apmg("if-range", ""), new defpackage.apmg("if-unmodified-since", ""), new defpackage.apmg("last-modified", ""), new defpackage.apmg("link", ""), new defpackage.apmg("location", ""), new defpackage.apmg("max-forwards", ""), new defpackage.apmg("proxy-authenticate", ""), new defpackage.apmg("proxy-authorization", ""), new defpackage.apmg("range", ""), new defpackage.apmg("referer", ""), new defpackage.apmg("refresh", ""), new defpackage.apmg("retry-after", ""), new defpackage.apmg("server", ""), new defpackage.apmg("set-cookie", ""), new defpackage.apmg("strict-transport-security", ""), new defpackage.apmg("transfer-encoding", ""), new defpackage.apmg("user-agent", ""), new defpackage.apmg("vary", ""), new defpackage.apmg("via", ""), new defpackage.apmg("www-authenticate", "")};
    public static final java.util.Map b;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            defpackage.apmg[] apmgVarArr = a;
            if (!linkedHashMap.containsKey(apmgVarArr[i].g)) {
                linkedHashMap.put(apmgVarArr[i].g, java.lang.Integer.valueOf(i));
            }
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        defpackage.aooh.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        b = mapUnmodifiableMap;
    }

    public static final void a(defpackage.appb appbVar) {
        if (appbVar == null) {
            defpackage.aooh.i("name");
        }
        int iC = appbVar.c();
        for (int i = 0; i < iC; i++) {
            byte bA = appbVar.a(i);
            if (bA >= 65 && bA < 91) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(appbVar.i()));
            }
        }
    }
}
