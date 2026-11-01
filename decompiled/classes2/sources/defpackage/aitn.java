package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class aitn extends defpackage.aitt {
    private final j$.util.stream.Stream a;
    public final java.util.function.Function b;
    public final java.util.function.Function c;

    public aitn(j$.util.stream.Stream stream, java.util.function.Function function, java.util.function.Function function2) {
        ahvr.ci(stream);
        this.a = stream;
        ahvr.ci(function);
        this.b = function;
        ahvr.ci(function2);
        this.c = function2;
    }

    @Override // defpackage.aitt
    public final defpackage.aitt b(java.util.function.Function function) {
        return new defpackage.aitn(this.a, aa$.ExternalSyntheticApiModelOutline1.m(this.b, function), this.c);
    }

    @Override // defpackage.aitt
    public final defpackage.aitt c(java.util.function.Function function) {
        return new defpackage.aitn(this.a, this.b, aa$.ExternalSyntheticApiModelOutline1.m(this.c, function));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.aitt
    public final j$.util.stream.Stream d(final java.util.function.BiFunction biFunction) {
        return this.a.map(new java.util.function.Function() { // from class: aitm
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.function.BiFunction biFunction2 = biFunction;
                defpackage.aitn aitnVar = this.a;
                return aa$.ExternalSyntheticApiModelOutline1.m(biFunction2, aa$.ExternalSyntheticApiModelOutline1.m(aitnVar.b, obj), aa$.ExternalSyntheticApiModelOutline1.m(aitnVar.c, obj));
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.aitt
    public final java.lang.Object e(defpackage.aita aitaVar) {
        final java.util.function.Function function = this.b;
        j$.util.Objects.requireNonNull(function);
        java.util.function.Function function2 = new java.util.function.Function() { // from class: aitl
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function3) {
                return j$.util.function.Function.-CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return aa$.ExternalSyntheticApiModelOutline1.m(function, obj);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function3) {
                return j$.util.function.Function.-CC.$default$compose(this, function3);
            }
        };
        final java.util.function.Function function3 = this.c;
        j$.util.Objects.requireNonNull(function3);
        return this.a.collect(aitaVar.a(function2, new java.util.function.Function() { // from class: aitl
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function4) {
                return j$.util.function.Function.-CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return aa$.ExternalSyntheticApiModelOutline1.m(function3, obj);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function4) {
                return j$.util.function.Function.-CC.$default$compose(this, function4);
            }
        }));
    }
}
