package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwt extends org.chromium.net.UrlResponseInfo.HeaderBlock {
    public final java.util.List a;
    public java.util.Map b;

    public apwt(java.util.List list) {
        this.a = list;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final java.util.List getAsList() {
        return this.a;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final java.util.Map getAsMap() {
        java.util.Map map = this.b;
        if (map != null) {
            return map;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (java.util.Map.Entry entry : this.a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((java.lang.String) entry.getValue());
            treeMap.put((java.lang.String) entry.getKey(), j$.util.DesugarCollections.unmodifiableList(arrayList));
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(treeMap);
        this.b = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }
}
