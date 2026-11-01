package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface List<E> extends j$.util.Collection<E> {

    /* JADX INFO: renamed from: j$.util.List$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public final /* synthetic */ class CC {
        public static void $default$replaceAll(java.util.List list, java.util.function.UnaryOperator unaryOperator) {
            j$.util.Objects.requireNonNull(unaryOperator);
            java.util.ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(unaryOperator.apply(listIterator.next()));
            }
        }

        public static void $default$sort(java.util.List list, java.util.Comparator comparator) {
            java.lang.Object[] array = list.toArray();
            java.util.Arrays.sort(array, comparator);
            java.util.ListIterator<E> listIterator = list.listIterator();
            for (java.lang.Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }

        public static j$.util.Spliterator $default$spliterator(java.util.List list) {
            return list instanceof java.util.RandomAccess ? new j$.util.a(list) : j$.util.Spliterators.spliterator(list, 16);
        }
    }

    /* JADX INFO: renamed from: j$.util.List$-EL, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public final /* synthetic */ class EL {
        public static /* synthetic */ void sort(java.util.List list, java.util.Comparator comparator) {
            if (list instanceof j$.util.List) {
                ((j$.util.List) list).sort(comparator);
            } else {
                j$.util.List.CC.$default$sort(list, comparator);
            }
        }
    }

    void replaceAll(java.util.function.UnaryOperator<E> unaryOperator);

    void sort(java.util.Comparator<? super E> comparator);

    @Override // j$.util.Collection, j$.lang.a
    j$.util.Spliterator<E> spliterator();
}
