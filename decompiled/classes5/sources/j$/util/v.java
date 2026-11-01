package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v extends j$.util.s implements java.util.SortedMap {
    private static final long serialVersionUID = -8806743815996713206L;
    public final java.util.SortedMap e;

    public v(java.util.SortedMap sortedMap) {
        super(sortedMap);
        this.e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return this.e.comparator();
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return this.e.firstKey();
    }

    @Override // java.util.SortedMap
    public final java.util.SortedMap headMap(java.lang.Object obj) {
        return new j$.util.v(this.e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return this.e.lastKey();
    }

    @Override // java.util.SortedMap
    public final java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return new j$.util.v(this.e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final java.util.SortedMap tailMap(java.lang.Object obj) {
        return new j$.util.v(this.e.tailMap(obj));
    }
}
