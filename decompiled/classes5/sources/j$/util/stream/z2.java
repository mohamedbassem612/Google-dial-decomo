package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class z2 implements java.util.function.BinaryOperator, java.util.function.LongFunction, java.util.function.IntFunction, java.util.function.Consumer {
    public final /* synthetic */ byte a;

    public /* synthetic */ z2(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        byte b = this.a;
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        switch (this.a) {
            case 0:
                break;
            case 1:
            case 3:
            default:
                break;
            case 2:
                break;
            case 4:
                break;
        }
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int i) {
        switch (this.a) {
            case 6:
                return new java.lang.Object[i];
            case 7:
                return new java.lang.Integer[i];
            case 8:
                return new java.lang.Long[i];
            case 9:
                return new java.lang.Double[i];
            case 10:
            case 11:
            default:
                return new java.lang.Double[i];
            case 12:
                return new java.lang.Integer[i];
            case 13:
                return new java.lang.Integer[i];
            case 14:
                return new java.lang.Long[i];
            case 15:
                return new java.lang.Long[i];
            case 16:
                return new java.lang.Double[i];
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.a) {
            case 10:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public final java.lang.Object apply(long j) {
        switch (this.a) {
            case 1:
                return j$.util.stream.n4.K(j);
            default:
                return j$.util.stream.n4.L(j);
        }
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case 0:
                return new j$.util.stream.c3((j$.util.stream.o2) obj, (j$.util.stream.o2) obj2);
            case 1:
            case 3:
            default:
                return new j$.util.stream.g3((j$.util.stream.u2) obj, (j$.util.stream.u2) obj2);
            case 2:
                return new j$.util.stream.d3((j$.util.stream.q2) obj, (j$.util.stream.q2) obj2);
            case 4:
                return new j$.util.stream.e3((j$.util.stream.s2) obj, (j$.util.stream.s2) obj2);
        }
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$0(java.lang.Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$1(java.lang.Object obj) {
    }
}
