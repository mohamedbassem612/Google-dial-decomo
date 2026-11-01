package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class l implements java.util.function.Function, java.util.function.BinaryOperator, java.util.function.Supplier, java.util.function.BiConsumer, java.util.function.DoubleFunction, java.util.function.ToDoubleFunction, java.util.function.IntFunction, java.util.function.DoubleBinaryOperator, java.util.function.ObjDoubleConsumer, java.util.function.Predicate {
    public final /* synthetic */ byte a;

    public /* synthetic */ l(byte b) {
        this.a = b;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case 3:
                ((java.lang.StringBuilder) obj).append((java.lang.CharSequence) obj2);
                break;
            case 7:
                ((java.util.LinkedHashSet) obj).add(obj2);
                break;
            case 8:
                ((java.util.LinkedHashSet) obj).addAll((java.util.LinkedHashSet) obj2);
                break;
            case 9:
                ((j$.util.DoubleSummaryStatistics) obj).combine((j$.util.DoubleSummaryStatistics) obj2);
                break;
            case 16:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                j$.util.stream.Collectors.a(dArr, dArr2[0]);
                j$.util.stream.Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            default:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                j$.util.stream.Collectors.a(dArr3, dArr4[0]);
                j$.util.stream.Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
        }
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.a) {
            case 22:
                break;
            case 23:
            case 25:
            default:
                break;
            case 24:
                break;
            case 26:
                break;
        }
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        switch (this.a) {
            case 3:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 16:
                break;
            default:
                break;
        }
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case 1:
                java.util.Set set = (java.util.Set) obj;
                java.util.Set set2 = (java.util.Set) obj2;
                java.util.Set set3 = j$.util.stream.Collectors.a;
                if (set.size() < set2.size()) {
                    set2.addAll(set);
                    return set2;
                }
                set.addAll(set2);
                return set;
            default:
                java.lang.StringBuilder sb = (java.lang.StringBuilder) obj;
                java.util.Set set4 = j$.util.stream.Collectors.a;
                sb.append((java.lang.CharSequence) obj2);
                return sb;
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public final double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 13:
                return java.lang.Math.max(d, d2);
            default:
                return java.lang.Math.min(d, d2);
        }
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.a) {
            case 2:
                return new java.lang.StringBuilder();
            case 6:
                return new java.util.LinkedHashSet();
            case 14:
                return new double[3];
            case 18:
                return new double[4];
            case 23:
                return new j$.util.stream.f0();
            case 25:
                return new j$.util.stream.g0();
            case 27:
                return new j$.util.stream.h0();
            default:
                return new j$.util.stream.i0();
        }
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo2negate() {
        switch (this.a) {
            case 22:
                break;
            case 23:
            case 25:
            default:
                break;
            case 24:
                break;
            case 26:
                break;
        }
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.a) {
            case 22:
                break;
            case 23:
            case 25:
            default:
                break;
            case 24:
                break;
            case 26:
                break;
        }
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.a) {
            case 22:
                return ((j$.util.OptionalDouble) obj).a;
            case 23:
            case 25:
            default:
                return ((j$.util.Optional) obj).isPresent();
            case 24:
                return ((j$.util.OptionalInt) obj).isPresent();
            case 26:
                return ((j$.util.OptionalLong) obj).isPresent();
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(java.lang.Object obj) {
        return ((java.lang.Double) obj).doubleValue();
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        switch (this.a) {
            case 1:
                break;
            default:
                break;
        }
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo3andThen(java.util.function.Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                return ((j$.util.StringJoiner) obj).toString();
            default:
                return ((java.lang.StringBuilder) obj).toString();
        }
    }

    @Override // java.util.function.DoubleFunction
    public final java.lang.Object apply(double d) {
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int i) {
        return new java.lang.Double[i];
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final void accept(java.lang.Object obj, double d) {
        switch (this.a) {
            case 15:
                double[] dArr = (double[]) obj;
                j$.util.stream.Collectors.a(dArr, d);
                dArr[2] = dArr[2] + d;
                break;
            case 19:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                j$.util.stream.Collectors.a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                break;
            default:
                ((j$.util.DoubleSummaryStatistics) obj).accept(d);
                break;
        }
    }
}
