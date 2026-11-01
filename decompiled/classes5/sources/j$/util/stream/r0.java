package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class r0 implements java.util.function.IntFunction, java.util.function.Supplier, java.util.function.BiConsumer, java.util.function.BinaryOperator, java.util.function.Function, java.util.function.IntBinaryOperator, java.util.function.ObjIntConsumer, java.util.function.ToIntFunction, java.util.function.ObjLongConsumer, java.util.function.LongFunction, java.util.function.LongBinaryOperator, java.util.function.ToLongFunction, java.util.function.Consumer {
    public final /* synthetic */ byte a;

    public /* synthetic */ r0(byte b) {
        this.a = b;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case 2:
                ((j$.util.stream.i1) obj).r(obj2);
                break;
            case 8:
                ((j$.util.IntSummaryStatistics) obj).combine((j$.util.IntSummaryStatistics) obj2);
                break;
            case 13:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 17:
                ((j$.util.LongSummaryStatistics) obj).combine((j$.util.LongSummaryStatistics) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        switch (this.a) {
            case 2:
                break;
            case 8:
                break;
            case 13:
                break;
            case 17:
                break;
            default:
                break;
        }
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        j$.util.stream.i1 i1Var = (j$.util.stream.i1) obj;
        j$.util.stream.i1 i1Var2 = (j$.util.stream.i1) obj2;
        if (i1Var.a == null && i1Var.b == null) {
            return i1Var2;
        }
        if (i1Var2.a == null && i1Var2.b == null) {
            return i1Var;
        }
        j$.util.stream.u2 u2VarBuild = i1Var2.build();
        if (i1Var.a == null || !(u2VarBuild instanceof j$.util.stream.h1) || ((j$.util.stream.c) u2VarBuild).count() >= 8) {
            i1Var.b = j$.util.stream.n4.C(j$.util.stream.w7.REFERENCE, i1Var.build(), u2VarBuild);
            return i1Var;
        }
        ((j$.util.stream.q7) u2VarBuild).forEach(i1Var);
        return i1Var;
    }

    @Override // java.util.function.IntBinaryOperator
    public final int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 6:
                return java.lang.Math.min(i, i2);
            case 9:
                return i + i2;
            default:
                return java.lang.Math.max(i, i2);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public final long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 23:
                return java.lang.Math.max(j, j2);
            case 24:
                return j + j2;
            default:
                return java.lang.Math.min(j, j2);
        }
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.a) {
            case 1:
                return new j$.util.stream.i1();
            case 11:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(java.lang.Object obj) {
        return ((java.lang.Integer) obj).intValue();
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(java.lang.Object obj) {
        return ((java.lang.Long) obj).longValue();
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo3andThen(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        return ((j$.util.stream.i1) obj).build();
    }

    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int i) {
        switch (this.a) {
            case 0:
                return new java.lang.Object[i];
            case 5:
                return new java.lang.Integer[i];
            case 15:
                return java.lang.Integer.valueOf(i);
            case 18:
                return new java.lang.Long[i];
            default:
                return new java.lang.Object[i];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public final void accept(java.lang.Object obj, long j) {
        switch (this.a) {
            case 16:
                ((j$.util.LongSummaryStatistics) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
    }

    @Override // java.util.function.ObjIntConsumer
    public final void accept(java.lang.Object obj, int i) {
        switch (this.a) {
            case 7:
                ((j$.util.IntSummaryStatistics) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i);
                break;
        }
    }

    @Override // java.util.function.LongFunction
    public final java.lang.Object apply(long j) {
        switch (this.a) {
            case 19:
                return java.lang.Long.valueOf(j);
            default:
                return j$.util.stream.n4.D(j);
        }
    }
}
