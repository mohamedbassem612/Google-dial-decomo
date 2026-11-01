package j$.util;

/* JADX INFO: renamed from: j$.util.Map$Entry$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class Map$Entry$CC {
    public static <K extends java.lang.Comparable<? super K>, V> java.util.Comparator<java.util.Map.Entry<K, V>> comparingByKey() {
        return new j$.util.x();
    }

    public static <K, V> java.util.Comparator<java.util.Map.Entry<K, V>> comparingByValue(java.util.Comparator<? super V> comparator) {
        j$.util.Objects.requireNonNull(comparator);
        return new j$.util.b((byte) 4, comparator);
    }
}
