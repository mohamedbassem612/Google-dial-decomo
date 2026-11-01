package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwu extends org.chromium.net.UrlResponseInfo {
    public final int a;
    public final java.lang.String b;
    private final java.util.List c;
    private final java.lang.String d;
    private final java.lang.String e = "";
    private final java.util.concurrent.atomic.AtomicLong f = new java.util.concurrent.atomic.AtomicLong(0);
    private final defpackage.apwt g;

    public apwu(java.util.List list, int i, java.lang.String str, java.util.List list2, java.lang.String str2) {
        this.c = j$.util.DesugarCollections.unmodifiableList(list);
        this.a = i;
        this.d = str;
        this.g = new defpackage.apwt(j$.util.DesugarCollections.unmodifiableList(list2));
        this.b = str2;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.util.Map getAllHeaders() {
        defpackage.apwt apwtVar = this.g;
        java.util.Map map = apwtVar.b;
        if (map != null) {
            return map;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (java.util.Map.Entry entry : apwtVar.a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((java.lang.String) entry.getValue());
            treeMap.put((java.lang.String) entry.getKey(), j$.util.DesugarCollections.unmodifiableList(arrayList));
        }
        apwtVar.b = j$.util.DesugarCollections.unmodifiableMap(treeMap);
        return apwtVar.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.util.List getAllHeadersAsList() {
        return this.g.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getHttpStatusText() {
        return this.d;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getNegotiatedProtocol() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getProxyServer() {
        return this.e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getUrl() {
        java.util.List list = this.c;
        return (java.lang.String) list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.util.List getUrlChain() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        java.util.List list = this.c;
        return java.lang.String.format(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", hexString, (java.lang.String) list.get(list.size() - 1), list.toString(), java.lang.Integer.valueOf(this.a), this.d, getAllHeadersAsList().toString(), java.lang.Boolean.FALSE, this.b, this.e, java.lang.Long.valueOf(this.f.get()));
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return false;
    }
}
