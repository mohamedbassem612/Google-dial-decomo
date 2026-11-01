package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class y {
    public final java.util.Map a;
    public final java.util.HashMap b;

    public y(java.util.Map map) {
        this.a = map;
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.util.HashMap map3 = new java.util.HashMap();
            for (java.util.Map.Entry entry2 : ((java.util.Map) entry.getValue()).entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getValue();
                java.lang.String str2 = (java.lang.String) entry2.getValue();
                java.lang.Long l = (java.lang.Long) entry2.getKey();
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = j$.time.format.z.a;
                map3.put(str, new java.util.AbstractMap.SimpleImmutableEntry(str2, l));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map3.values());
            java.util.Collections.sort(arrayList2, j$.time.format.z.b);
            map2.put((j$.time.format.TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        java.util.Collections.sort(arrayList, j$.time.format.z.b);
        this.b = map2;
    }

    public final java.lang.String a(long j, j$.time.format.TextStyle textStyle) {
        java.util.Map map = (java.util.Map) this.a.get(textStyle);
        if (map != null) {
            return (java.lang.String) map.get(java.lang.Long.valueOf(j));
        }
        return null;
    }
}
