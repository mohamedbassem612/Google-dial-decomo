package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pib extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pib(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pib.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        final defpackage.pgi pgiVar = (defpackage.pgi) list.get(0);
        final java.lang.String str = (java.lang.String) list.get(1);
        if (((java.lang.Boolean) list.get(2)).booleanValue()) {
            optionalEmpty = j$.util.Optional.of(java.lang.Integer.valueOf(j$.util.concurrent.atomic.DesugarAtomicInteger.updateAndGet((java.util.concurrent.atomic.AtomicInteger) pgiVar.b, new java.util.function.IntUnaryOperator() { // from class: plo
                @Override // java.util.function.IntUnaryOperator
                public final /* synthetic */ java.util.function.IntUnaryOperator andThen(java.util.function.IntUnaryOperator intUnaryOperator) {
                    return j$.util.function.IntUnaryOperator.-CC.$default$andThen(this, intUnaryOperator);
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i) {
                    if (i != 0) {
                        return i;
                    }
                    java.lang.String str2 = str;
                    java.lang.Object obj2 = pgiVar.a;
                    return ((java.lang.Integer) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(((php) obj2).b, str2, new defpackage.pei(obj2, 2))).intValue();
                }

                @Override // java.util.function.IntUnaryOperator
                public final /* synthetic */ java.util.function.IntUnaryOperator compose(java.util.function.IntUnaryOperator intUnaryOperator) {
                    return j$.util.function.IntUnaryOperator.-CC.$default$compose(this, intUnaryOperator);
                }
            })));
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
