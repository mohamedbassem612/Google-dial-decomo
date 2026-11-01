package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class n implements java.util.function.Predicate, j$.time.temporal.TemporalQuery, j$.time.temporal.TemporalAdjuster, java.util.function.Function, java.util.function.UnaryOperator, java.util.function.IntFunction, java.util.function.Supplier, java.util.function.BiConsumer, java.util.function.BinaryOperator {
    public final /* synthetic */ byte a;

    public /* synthetic */ n(byte b) {
        this.a = b;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case 16:
                ((java.util.Collection) obj).add(obj2);
                break;
            case 19:
                ((java.util.List) obj).add(obj2);
                break;
            case 24:
                ((java.util.Set) obj).add(obj2);
                break;
            default:
                ((j$.util.StringJoiner) obj).add((java.lang.CharSequence) obj2);
                break;
        }
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        switch (this.a) {
            case 16:
                break;
            case 19:
                break;
            case 24:
                break;
            default:
                break;
        }
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case 17:
                java.util.Collection collection = (java.util.Collection) obj;
                java.util.Set set = j$.util.stream.Collectors.a;
                collection.addAll((java.util.Collection) obj2);
                return collection;
            case 20:
                java.util.List list = (java.util.List) obj;
                java.util.Set set2 = j$.util.stream.Collectors.a;
                list.addAll((java.util.List) obj2);
                return list;
            case 26:
                java.util.List list2 = (java.util.List) obj;
                java.util.Set set3 = j$.util.stream.Collectors.a;
                list2.addAll((java.util.List) obj2);
                return list2;
            default:
                j$.util.StringJoiner stringJoiner = (j$.util.StringJoiner) obj;
                j$.util.StringJoiner stringJoiner2 = (j$.util.StringJoiner) obj2;
                stringJoiner.getClass();
                j$.util.Objects.requireNonNull(stringJoiner2);
                if (stringJoiner2.d == null) {
                    return stringJoiner;
                }
                stringJoiner2.a();
                return stringJoiner.add(stringJoiner2.d[0]);
        }
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.a) {
            case 12:
                break;
            case 13:
                break;
            case 21:
                break;
            default:
                break;
        }
        return j$.util.function.Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.a) {
            case 15:
                return new j$.util.DoubleSummaryStatistics();
            case 18:
                return new java.util.ArrayList();
            case 22:
                return new j$.util.IntSummaryStatistics();
            case 23:
                return new java.util.HashSet();
            default:
                return new j$.util.LongSummaryStatistics();
        }
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo2negate() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporal.a(temporal.l(aVar).d, aVar);
    }

    @Override // j$.time.temporal.TemporalQuery
    public final java.lang.Object queryFrom(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.time.ZoneId zoneId;
        byte b = this.a;
        j$.desugar.sun.nio.fs.n nVar = j$.time.temporal.m.a;
        switch (b) {
            case 1:
                return j$.time.LocalDate.from(temporalAccessor);
            case 2:
                zoneId = (j$.time.ZoneId) temporalAccessor.G(nVar);
                if (zoneId == null || (zoneId instanceof j$.time.ZoneOffset)) {
                    return null;
                }
                break;
            case 3:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.c(aVar)) {
                    return j$.time.j.L(temporalAccessor.D(aVar));
                }
                return null;
            case 4:
                return (j$.time.ZoneId) temporalAccessor.G(nVar);
            case 5:
                return (j$.time.chrono.a) temporalAccessor.G(j$.time.temporal.m.b);
            case 6:
                return (j$.time.temporal.TemporalUnit) temporalAccessor.G(j$.time.temporal.m.c);
            case 7:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.c(aVar2)) {
                    return j$.time.ZoneOffset.Q(temporalAccessor.h(aVar2));
                }
                return null;
            case 8:
                zoneId = (j$.time.ZoneId) temporalAccessor.G(nVar);
                if (zoneId == null) {
                    zoneId = (j$.time.ZoneId) temporalAccessor.G(j$.time.temporal.m.d);
                }
                break;
            case 9:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.c(aVar3)) {
                    return j$.time.LocalDate.Q(temporalAccessor.D(aVar3));
                }
                return null;
        }
        return zoneId;
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                return true ^ ((java.lang.String) obj).isEmpty();
            default:
                j$.com.android.tools.r8.b bVar = j$.util.concurrent.ConcurrentLinkedQueue.a;
                return true;
        }
    }

    public final java.lang.String toString() {
        switch (this.a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        switch (this.a) {
            case 17:
                break;
            case 20:
                break;
            case 26:
                break;
            default:
                break;
        }
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public final /* synthetic */ java.util.function.Function mo3andThen(java.util.function.Function function) {
        switch (this.a) {
            case 12:
                break;
            case 13:
                break;
            case 21:
                break;
            default:
                break;
        }
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.a) {
            case 12:
            case 13:
                return obj;
            case 21:
                java.util.Set set = j$.util.stream.Collectors.a;
                return j$.com.android.tools.r8.a.F(((java.util.List) obj).toArray());
            default:
                java.util.Set set2 = j$.util.stream.Collectors.a;
                return obj;
        }
    }

    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int i) {
        return new java.lang.Object[i];
    }
}
