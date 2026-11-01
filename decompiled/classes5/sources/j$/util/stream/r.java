package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class r extends j$.util.stream.w5 {
    public static j$.util.stream.y2 R(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        j$.util.stream.l lVar = new j$.util.stream.l((byte) 6);
        j$.util.stream.l lVar2 = new j$.util.stream.l((byte) 7);
        j$.util.stream.l lVar3 = new j$.util.stream.l((byte) 8);
        j$.util.Objects.requireNonNull(lVar);
        j$.util.Objects.requireNonNull(lVar2);
        j$.util.Objects.requireNonNull(lVar3);
        return new j$.util.stream.y2((java.util.Collection) new j$.util.stream.s4(j$.util.stream.w7.REFERENCE, lVar3, lVar2, lVar, (byte) 3).b(aVar, spliterator));
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        if (j$.util.stream.v7.DISTINCT.p(aVar.f)) {
            return aVar.j(spliterator, false, intFunction);
        }
        if (j$.util.stream.v7.ORDERED.p(aVar.f)) {
            return R(aVar, spliterator);
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap();
        j$.nio.file.e0 e0Var = new j$.nio.file.e0(atomicBoolean, concurrentHashMap, (byte) 6);
        j$.util.Objects.requireNonNull(e0Var);
        new j$.util.stream.p0(e0Var, false).b(aVar, spliterator);
        java.util.Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            java.util.HashSet hashSet = new java.util.HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new j$.util.stream.y2(collectionKeySet);
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        if (j$.util.stream.v7.DISTINCT.p(aVar.f)) {
            return aVar.Q(spliterator);
        }
        return j$.util.stream.v7.ORDERED.p(aVar.f) ? R(aVar, spliterator).spliterator() : new j$.util.stream.j8(aVar.Q(spliterator), new j$.util.concurrent.ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        j$.util.Objects.requireNonNull(f6Var);
        if (j$.util.stream.v7.DISTINCT.p(i)) {
            return f6Var;
        }
        return j$.util.stream.v7.SORTED.p(i) ? new j$.util.stream.p(f6Var) : new j$.util.stream.q(f6Var);
    }
}
