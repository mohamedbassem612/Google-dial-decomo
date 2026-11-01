package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class g implements j$.nio.file.PathMatcher, java.nio.file.DirectoryStream.Filter, j$.time.temporal.TemporalAccessor, java.util.function.BiPredicate, java.util.function.IntPredicate, java.util.function.Predicate, java.util.function.Supplier, java.util.function.LongFunction, java.util.function.Consumer, java.util.function.BooleanSupplier {
    public final /* synthetic */ byte a;
    public final java.lang.Object b;

    public /* synthetic */ g(byte b, java.lang.Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        throw new j$.time.temporal.n("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.m.a ? (j$.time.ZoneId) this.b : j$.time.temporal.m.c(this, temporalQuery);
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept, reason: collision with other method in class */
    public final boolean mo0accept(java.lang.Object obj) {
        switch (this.a) {
            case 1:
                return ((j$.nio.file.PathMatcher) this.b).matches(((j$.nio.file.Path) obj).getFileName());
            default:
                return ((java.nio.file.DirectoryStream.Filter) this.b).mo0accept(j$.nio.file.a.g(obj));
        }
    }

    public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
        return j$.util.function.BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.a) {
            case 11:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public final java.lang.Object apply(long j) {
        return j$.util.stream.n4.x(j, (java.util.function.IntFunction) this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return false;
    }

    public final void e(j$.util.stream.u7 u7Var) {
        ((java.util.EnumMap) this.b).put(u7Var, 1);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 7:
                return ((j$.util.stream.a) obj).L(0);
            case 8:
                return (j$.util.Spliterator) obj;
            default:
                java.util.Set set = j$.util.stream.Collectors.a;
                return new j$.util.StringJoiner((java.lang.CharSequence) obj, 0);
        }
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 14:
                j$.util.stream.l8 l8Var = (j$.util.stream.l8) obj;
                return l8Var.d.tryAdvance(l8Var.e);
            case 15:
                j$.util.stream.n8 n8Var = (j$.util.stream.n8) obj;
                return n8Var.d.tryAdvance(n8Var.e);
            case 16:
                j$.util.stream.p8 p8Var = (j$.util.stream.p8) obj;
                return p8Var.d.tryAdvance(p8Var.e);
            default:
                j$.util.stream.e9 e9Var = (j$.util.stream.e9) obj;
                return e9Var.d.tryAdvance(e9Var.e);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.nio.file.PathMatcher
    public final boolean matches(j$.nio.file.Path path) {
        return ((java.util.regex.Pattern) this.b).matcher(path.toString()).matches();
    }

    public final /* synthetic */ java.util.function.BiPredicate negate() {
        return j$.util.function.BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
        return j$.util.function.BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        return !((java.util.function.Predicate) this.b).test(obj);
    }

    public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
        return j$.util.function.IntPredicate$CC.$default$and(this, intPredicate);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public final /* synthetic */ java.util.function.IntPredicate m1negate() {
        return j$.util.function.IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
        return j$.util.function.IntPredicate$CC.$default$or(this, intPredicate);
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public final /* synthetic */ java.util.function.Predicate mo2negate() {
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        return !((java.util.function.IntPredicate) this.b).test(i);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
        return !((java.util.function.BiPredicate) this.b).test(obj, obj2);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        byte b = this.a;
        java.lang.Object obj2 = this.b;
        switch (b) {
            case 11:
                ((j$.util.stream.f6) obj2).r(obj);
                break;
            default:
                ((java.util.ArrayList) obj2).add(obj);
                break;
        }
    }
}
