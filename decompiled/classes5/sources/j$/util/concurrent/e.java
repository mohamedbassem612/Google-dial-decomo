package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class e extends j$.util.concurrent.b implements java.util.Set, j$.util.Set {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return this.a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (this.a.f(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        java.util.Set set;
        return (obj instanceof java.util.Set) && ((set = (java.util.Set) obj) == this || (containsAll(set) && set.containsAll(this)));
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
                consumer.r(new j$.util.concurrent.j(kVarA.b, kVarA.c, this.a));
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        j$.util.concurrent.k[] kVarArr = this.a.a;
        int iHashCode = 0;
        if (kVarArr != null) {
            j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                j$.util.concurrent.k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                iHashCode += kVarA.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
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
                if (predicate.test(new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.a
    public final j$.util.Spliterator spliterator() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        long j = concurrentHashMap.j();
        j$.util.concurrent.k[] kVarArr = concurrentHashMap.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new j$.util.concurrent.f(kVarArr, length, 0, length, j < 0 ? 0L : j, concurrentHashMap);
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
