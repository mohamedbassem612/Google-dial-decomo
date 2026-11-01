package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class l0 implements java.util.function.DoubleFunction, java.util.function.Function, java.util.function.IntFunction, java.util.function.LongFunction {
    public java.lang.Object a;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo3andThen(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.Object objApply = ((java.util.function.Function) this.a).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.Stream) {
            return j$.util.stream.s7.e((j$.util.stream.Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return j$.util.stream.r7.e((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof j$.util.stream.IntStream) {
            return j$.util.stream.s1.e((j$.util.stream.IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return j$.util.stream.IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof j$.util.stream.DoubleStream) {
            return j$.util.stream.d0.e((j$.util.stream.DoubleStream) objApply);
        }
        if (objApply instanceof java.util.stream.DoubleStream) {
            return j$.util.stream.c0.e((java.util.stream.DoubleStream) objApply);
        }
        if (objApply instanceof j$.util.stream.LongStream) {
            return j$.util.stream.a2.e((j$.util.stream.LongStream) objApply);
        }
        if (objApply instanceof java.util.stream.LongStream) {
            return j$.util.stream.z1.e((java.util.stream.LongStream) objApply);
        }
        j$.util.f.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int i) {
        java.lang.Object objApply = ((java.util.function.IntFunction) this.a).apply(i);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.IntStream) {
            return j$.util.stream.s1.e((j$.util.stream.IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return j$.util.stream.IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        j$.util.f.a("java.util.stream.IntStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public final java.lang.Object apply(double d) {
        java.lang.Object objApply = ((java.util.function.DoubleFunction) this.a).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.DoubleStream) {
            return j$.util.stream.d0.e((j$.util.stream.DoubleStream) objApply);
        }
        if (objApply instanceof java.util.stream.DoubleStream) {
            return j$.util.stream.c0.e((java.util.stream.DoubleStream) objApply);
        }
        j$.util.f.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public final java.lang.Object apply(long j) {
        java.lang.Object objApply = ((java.util.function.LongFunction) this.a).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.LongStream) {
            return j$.util.stream.a2.e((j$.util.stream.LongStream) objApply);
        }
        if (objApply instanceof java.util.stream.LongStream) {
            return j$.util.stream.z1.e((java.util.stream.LongStream) objApply);
        }
        j$.util.f.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }
}
