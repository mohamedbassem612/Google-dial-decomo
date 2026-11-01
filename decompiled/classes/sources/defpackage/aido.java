package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aido {
    public static final j$.util.stream.Collector a;
    public static final j$.util.stream.Collector b;

    static {
        final int i = 1;
        final int i2 = 0;
        a = j$.util.stream.Collector.-CC.of(new defpackage.kjx(9), new java.util.function.BiConsumer() { // from class: aidk
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i3 = i;
                if (i3 == 0) {
                    ((defpackage.aihb) obj).c(obj2);
                } else if (i3 != 1) {
                    ((uzx) obj).aL((aikb) obj2);
                } else {
                    ((defpackage.aift) obj).i(obj2);
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                int i3 = i;
                if (i3 != 0) {
                    return i3 != 1 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new defpackage.aidj(i2), new defpackage.vaq(20), new j$.util.stream.Collector.Characteristics[0]);
        final int i3 = 2;
        b = j$.util.stream.Collector.-CC.of(new defpackage.kjx(10), new java.util.function.BiConsumer() { // from class: aidk
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i4 = i2;
                if (i4 == 0) {
                    ((defpackage.aihb) obj).c(obj2);
                } else if (i4 != 1) {
                    ((uzx) obj).aL((aikb) obj2);
                } else {
                    ((defpackage.aift) obj).i(obj2);
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                int i4 = i2;
                if (i4 != 0) {
                    return i4 != 1 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new defpackage.aidj(i3), new defpackage.aidm(i), new j$.util.stream.Collector.Characteristics[0]);
        j$.util.stream.Collector.-CC.of(new defpackage.kjx(11), new java.util.function.BiConsumer() { // from class: aidk
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i4 = i3;
                if (i4 == 0) {
                    ((defpackage.aihb) obj).c(obj2);
                } else if (i4 != 1) {
                    ((uzx) obj).aL((aikb) obj2);
                } else {
                    ((defpackage.aift) obj).i(obj2);
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                int i4 = i3;
                if (i4 != 0) {
                    return i4 != 1 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new defpackage.aidj(i), new defpackage.vaq(19), new j$.util.stream.Collector.Characteristics[0]);
    }

    public static j$.util.stream.Collector a(java.util.function.Function function, java.util.function.Function function2) {
        return j$.util.stream.Collector.-CC.of(new ahuq(3), new aidn(function, function2), new vfd(2), new adci(18), new j$.util.stream.Collector.Characteristics[0]);
    }

    public static j$.util.stream.Collector b(final java.util.function.Function function, final java.util.function.Function function2) {
        function.getClass();
        function2.getClass();
        return j$.util.stream.Collector.-CC.of(new defpackage.kjx(12), new java.util.function.BiConsumer() { // from class: aidl
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                j$.util.stream.Collector collector = defpackage.aido.a;
                ((defpackage.aigb) obj).i(aa$.ExternalSyntheticApiModelOutline1.m(function, obj2), aa$.ExternalSyntheticApiModelOutline1.m(function2, obj2));
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new defpackage.aidj(3), new defpackage.aidm(0), new j$.util.stream.Collector.Characteristics[0]);
    }

    public static j$.util.stream.Collector c(java.util.function.Function function, java.util.function.Function function2, java.util.function.BinaryOperator binaryOperator) {
        return j$.util.stream.Collectors.collectingAndThen(j$.util.stream.Collectors.toMap(function, function2, binaryOperator, new ahuq(4)), new adci(19));
    }
}
