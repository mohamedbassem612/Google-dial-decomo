package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class aitt implements java.lang.AutoCloseable {
    public static defpackage.aitt g(java.lang.Iterable iterable) {
        return l(iterable, j$.util.function.Function.-CC.identity(), j$.util.function.Function.-CC.identity());
    }

    public static defpackage.aitt k(java.util.Map map) {
        return m(j$.util.Collection.-EL.stream(map.entrySet()));
    }

    public static defpackage.aitt l(java.lang.Iterable iterable, java.util.function.Function function, java.util.function.Function function2) {
        return new defpackage.aitn(o(iterable), function, function2);
    }

    public static defpackage.aitt m(j$.util.stream.Stream stream) {
        return new defpackage.aitj(stream, new ailg(2), new ailg(3), stream);
    }

    public static defpackage.aitt n(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        return new defpackage.aits(o(iterable), o(iterable2));
    }

    private static j$.util.stream.Stream o(java.lang.Iterable iterable) {
        return iterable instanceof java.util.Collection ? j$.util.Collection.-EL.stream((java.util.Collection) iterable) : j$.util.stream.StreamSupport.stream(new defpackage.aitk(iterable.iterator()), false);
    }

    public j$.util.stream.Stream a() {
        return d(new aitf(0));
    }

    public abstract defpackage.aitt b(java.util.function.Function function);

    public abstract defpackage.aitt c(java.util.function.Function function);

    public abstract j$.util.stream.Stream d(java.util.function.BiFunction biFunction);

    public abstract java.lang.Object e(defpackage.aita aitaVar);

    public final aigf f() {
        final int i = 0;
        return (aigf) e(new defpackage.aita() { // from class: aitg
            @Override // defpackage.aita
            public final j$.util.stream.Collector a(java.util.function.Function function, java.util.function.Function function2) {
                return i != 0 ? aido.b(function, function2) : aido.b(function, function2);
            }
        });
    }

    public final defpackage.aitt h(final java.util.function.BiPredicate biPredicate) {
        return m(a().filter(new java.util.function.Predicate() { // from class: aiti
            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate.-CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate negate() {
                return j$.util.function.Predicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate.-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return aa$.ExternalSyntheticApiModelOutline1.m(biPredicate, entry.getKey(), entry.getValue());
            }
        }));
    }

    public final defpackage.aitt i(final java.util.function.Predicate predicate) {
        ahvr.ci(predicate);
        return h(new java.util.function.BiPredicate() { // from class: aitd
            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$and(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate negate() {
                return j$.util.function.BiPredicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
                return aa$.ExternalSyntheticApiModelOutline1.m$1(predicate, obj);
            }
        });
    }

    public final defpackage.aitt j(final java.util.function.Predicate predicate) {
        ahvr.ci(predicate);
        return h(new java.util.function.BiPredicate() { // from class: aith
            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$and(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate negate() {
                return j$.util.function.BiPredicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
                return aa$.ExternalSyntheticApiModelOutline1.m$1(predicate, obj2);
            }
        });
    }
}
