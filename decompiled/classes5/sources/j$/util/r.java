package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class r extends j$.util.u {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.m, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        return this.a.contains(new j$.util.p((java.util.Map.Entry) obj));
    }

    @Override // j$.util.m, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.u, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (set.size() == this.a.size()) {
                return containsAll(set);
            }
        }
        return false;
    }

    @Override // j$.util.m, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        j$.util.Collection.EL.a(this.a, new j$.nio.file.y(consumer, (byte) 2));
    }

    @Override // j$.util.m, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.util.l(this);
    }

    @Override // j$.util.m, java.util.Collection, j$.util.Collection
    public final j$.util.stream.Stream parallelStream() {
        return j$.util.stream.StreamSupport.stream(spliterator(), true);
    }

    @Override // j$.util.m, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final j$.util.Spliterator spliterator() {
        return new j$.util.q(j$.util.Collection.EL.c(this.a));
    }

    @Override // j$.util.m, java.util.Collection, j$.util.Collection
    public final j$.util.stream.Stream stream() {
        return j$.util.stream.StreamSupport.stream(spliterator(), false);
    }

    @Override // j$.util.m, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        java.lang.Object[] array = this.a.toArray(objArr.length == 0 ? objArr : java.util.Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new j$.util.p((java.util.Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        java.lang.System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.m, java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new j$.util.p((java.util.Map.Entry) array[i]);
        }
        return array;
    }
}
