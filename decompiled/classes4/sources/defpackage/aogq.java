package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aogq {
    public static final appb a;
    public static final defpackage.aogn[] b;
    public static final java.util.Map c;

    static {
        appb appbVar = appb.a;
        a = aoov.aQ(":");
        int i = 0;
        b = new defpackage.aogn[]{new defpackage.aogn(defpackage.aogn.e, ""), new defpackage.aogn(defpackage.aogn.b, "GET"), new defpackage.aogn(defpackage.aogn.b, "POST"), new defpackage.aogn(defpackage.aogn.c, "/"), new defpackage.aogn(defpackage.aogn.c, "/index.html"), new defpackage.aogn(defpackage.aogn.d, "http"), new defpackage.aogn(defpackage.aogn.d, "https"), new defpackage.aogn(defpackage.aogn.a, "200"), new defpackage.aogn(defpackage.aogn.a, "204"), new defpackage.aogn(defpackage.aogn.a, "206"), new defpackage.aogn(defpackage.aogn.a, "304"), new defpackage.aogn(defpackage.aogn.a, "400"), new defpackage.aogn(defpackage.aogn.a, "404"), new defpackage.aogn(defpackage.aogn.a, "500"), new defpackage.aogn("accept-charset", ""), new defpackage.aogn("accept-encoding", "gzip, deflate"), new defpackage.aogn("accept-language", ""), new defpackage.aogn("accept-ranges", ""), new defpackage.aogn("accept", ""), new defpackage.aogn("access-control-allow-origin", ""), new defpackage.aogn("age", ""), new defpackage.aogn("allow", ""), new defpackage.aogn("authorization", ""), new defpackage.aogn("cache-control", ""), new defpackage.aogn("content-disposition", ""), new defpackage.aogn("content-encoding", ""), new defpackage.aogn("content-language", ""), new defpackage.aogn("content-length", ""), new defpackage.aogn("content-location", ""), new defpackage.aogn("content-range", ""), new defpackage.aogn("content-type", ""), new defpackage.aogn("cookie", ""), new defpackage.aogn("date", ""), new defpackage.aogn("etag", ""), new defpackage.aogn("expect", ""), new defpackage.aogn("expires", ""), new defpackage.aogn("from", ""), new defpackage.aogn("host", ""), new defpackage.aogn("if-match", ""), new defpackage.aogn("if-modified-since", ""), new defpackage.aogn("if-none-match", ""), new defpackage.aogn("if-range", ""), new defpackage.aogn("if-unmodified-since", ""), new defpackage.aogn("last-modified", ""), new defpackage.aogn("link", ""), new defpackage.aogn("location", ""), new defpackage.aogn("max-forwards", ""), new defpackage.aogn("proxy-authenticate", ""), new defpackage.aogn("proxy-authorization", ""), new defpackage.aogn("range", ""), new defpackage.aogn("referer", ""), new defpackage.aogn("refresh", ""), new defpackage.aogn("retry-after", ""), new defpackage.aogn("server", ""), new defpackage.aogn("set-cookie", ""), new defpackage.aogn("strict-transport-security", ""), new defpackage.aogn("transfer-encoding", ""), new defpackage.aogn("user-agent", ""), new defpackage.aogn("vary", ""), new defpackage.aogn("via", ""), new defpackage.aogn("www-authenticate", "")};
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(61);
        while (true) {
            defpackage.aogn[] aognVarArr = b;
            int length = aognVarArr.length;
            if (i >= 61) {
                c = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(aognVarArr[i].f)) {
                    linkedHashMap.put(aognVarArr[i].f, java.lang.Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void a(appb appbVar) throws java.io.IOException {
        int iC = appbVar.c();
        for (int i = 0; i < iC; i++) {
            byte bA = appbVar.a(i);
            if (bA >= 65 && bA <= 90) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(appbVar.i()));
            }
        }
    }
}
