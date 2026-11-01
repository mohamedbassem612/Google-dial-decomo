package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class r extends j$.util.concurrent.b implements j$.util.Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        consumer.getClass();
        j$.util.concurrent.k[] kVarArr = this.a.a;
        if (kVarArr == null) {
            return;
        }
        j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            j$.util.concurrent.k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            } else {
                consumer.r(kVarA.c);
            }
        }
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        j$.util.concurrent.k[] kVarArr = concurrentHashMap.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new j$.util.concurrent.h(kVarArr, length, length, concurrentHashMap, (byte) 1);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        j$.util.concurrent.a aVar;
        if (obj != null) {
            java.lang.Object it = iterator();
            do {
                aVar = (j$.util.concurrent.a) it;
                if (aVar.hasNext()) {
                }
            } while (!obj.equals(((j$.util.concurrent.h) it).next()));
            aVar.remove();
            return true;
        }
        return false;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        java.lang.Object it = iterator();
        boolean z = false;
        while (true) {
            j$.util.concurrent.a aVar = (j$.util.concurrent.a) it;
            if (!aVar.hasNext()) {
                return z;
            }
            if (collection.contains(((j$.util.concurrent.h) it).next())) {
                aVar.remove();
                z = true;
            }
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        predicate.getClass();
        j$.util.concurrent.k[] kVarArr = concurrentHashMap.a;
        boolean z = false;
        if (kVarArr != null) {
            j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                j$.util.concurrent.k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                java.lang.Object obj = kVarA.b;
                java.lang.Object obj2 = kVarA.c;
                if (predicate.test(obj2) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final j$.util.Spliterator spliterator() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        long j = concurrentHashMap.j();
        j$.util.concurrent.k[] kVarArr = concurrentHashMap.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new j$.util.concurrent.i(kVarArr, length, 0, length, j < 0 ? 0L : j, (byte) 1);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }
}
