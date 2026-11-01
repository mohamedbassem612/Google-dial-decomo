package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amek implements defpackage.amel {
    public final aihd a;

    public amek(aihd aihdVar) {
        ahvr.ci(aihdVar);
        this.a = aihdVar;
    }

    @Override // defpackage.amel
    public final aify a(defpackage.amcp amcpVar, defpackage.altp altpVar) {
        if (this.a.isEmpty()) {
            return aike.a;
        }
        int i = altpVar.a;
        if (i >= altpVar.b) {
            return aike.a;
        }
        java.lang.String str = amcpVar.b;
        java.lang.String strH = altpVar.h(str);
        final int i2 = 0;
        java.lang.String strSubstring = str.substring(0, i);
        final int length = strSubstring.trim().isEmpty() ? 0 : strSubstring.split(" ").length;
        j$.util.stream.Stream streamLimit = j$.util.DesugarArrays.stream(str.split(" ")).skip(length).limit(strH.trim().isEmpty() ? 0 : strH.split(" ").length);
        j$.util.stream.Collector collector = aido.a;
        final aify aifyVar = (aify) streamLimit.collect(collector);
        return (aify) j$.util.Collection.-EL.stream((aify) j$.util.stream.IntStream.-CC.range(0, aifyVar.size() - 1).filter(new java.util.function.IntPredicate() { // from class: amei
            @Override // java.util.function.IntPredicate
            public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
                return j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final /* synthetic */ java.util.function.IntPredicate negate() {
                return j$.util.function.IntPredicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.IntPredicate
            public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
                return j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i3) {
                java.lang.String str2 = (java.lang.String) aifyVar.get(i3 + 1);
                return java.lang.Character.isUpperCase(str2.charAt(0)) && this.a.a.contains(str2);
            }
        }).map(new java.util.function.IntUnaryOperator() { // from class: amej
            @Override // java.util.function.IntUnaryOperator
            public final /* synthetic */ java.util.function.IntUnaryOperator andThen(java.util.function.IntUnaryOperator intUnaryOperator) {
                return i2 != 0 ? j$.util.function.IntUnaryOperator.-CC.$default$andThen(this, intUnaryOperator) : j$.util.function.IntUnaryOperator.-CC.$default$andThen(this, intUnaryOperator);
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                int i4 = i2;
                int i5 = length;
                return i4 != 0 ? java.lang.Math.max(i3, i5) : i5 + i3;
            }

            @Override // java.util.function.IntUnaryOperator
            public final /* synthetic */ java.util.function.IntUnaryOperator compose(java.util.function.IntUnaryOperator intUnaryOperator) {
                return i2 != 0 ? j$.util.function.IntUnaryOperator.-CC.$default$compose(this, intUnaryOperator) : j$.util.function.IntUnaryOperator.-CC.$default$compose(this, intUnaryOperator);
            }
        }).boxed().collect(collector)).map(new defpackage.amcr(aify.o(str.split(" ")), 11)).collect(collector);
    }
}
