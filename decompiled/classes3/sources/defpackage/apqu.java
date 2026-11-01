package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apqu {
    public static final /* synthetic */ int a = 0;

    static {
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        treeMap.put(java.nio.charset.StandardCharsets.ISO_8859_1.name(), java.nio.charset.StandardCharsets.ISO_8859_1);
        treeMap.put(java.nio.charset.StandardCharsets.US_ASCII.name(), java.nio.charset.StandardCharsets.US_ASCII);
        treeMap.put(java.nio.charset.StandardCharsets.UTF_16.name(), java.nio.charset.StandardCharsets.UTF_16);
        treeMap.put(java.nio.charset.StandardCharsets.UTF_16BE.name(), java.nio.charset.StandardCharsets.UTF_16BE);
        treeMap.put(java.nio.charset.StandardCharsets.UTF_16LE.name(), java.nio.charset.StandardCharsets.UTF_16LE);
        treeMap.put(java.nio.charset.StandardCharsets.UTF_8.name(), java.nio.charset.StandardCharsets.UTF_8);
        j$.util.DesugarCollections.unmodifiableSortedMap(treeMap);
    }

    public static java.nio.charset.Charset a(java.nio.charset.Charset charset) {
        return charset == null ? java.nio.charset.Charset.defaultCharset() : charset;
    }
}
