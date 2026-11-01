package j$.lang;

/* JADX INFO: renamed from: j$.lang.Iterable$-EL, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class Iterable$EL {
    public static void forEach(java.lang.Iterable iterable, java.util.function.Consumer consumer) {
        if (iterable instanceof j$.lang.a) {
            ((j$.lang.a) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof java.util.Collection)) {
            j$.lang.Iterable$CC.$default$forEach(iterable, consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        java.util.Iterator it = ((java.util.Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static j$.util.Spliterator spliterator(java.lang.Iterable iterable) {
        j$.util.Spliterator l1Var;
        if (iterable instanceof j$.lang.a) {
            return ((j$.lang.a) iterable).spliterator();
        }
        if (iterable instanceof java.util.LinkedHashSet) {
            return j$.util.Spliterators.spliterator((java.util.LinkedHashSet) iterable, 17);
        }
        if (iterable instanceof java.util.SortedSet) {
            java.util.SortedSet sortedSet = (java.util.SortedSet) iterable;
            l1Var = new j$.util.m0(sortedSet, sortedSet);
        } else {
            if (iterable instanceof java.util.Set) {
                return j$.util.Spliterators.spliterator((java.util.Set) iterable, 1);
            }
            if (iterable instanceof java.util.List) {
                return j$.util.List.CC.$default$spliterator((java.util.List) iterable);
            }
            if (iterable instanceof java.util.Collection) {
                return j$.util.Collection.CC.$default$spliterator((java.util.Collection) iterable);
            }
            l1Var = new j$.util.l1((java.util.Iterator) j$.util.Objects.requireNonNull(iterable.iterator()));
        }
        return l1Var;
    }
}
