package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aits extends defpackage.aitt {
    public final j$.util.stream.Stream a;
    public final j$.util.stream.Stream b;

    public aits(j$.util.stream.Stream stream, j$.util.stream.Stream stream2) {
        ahvr.ci(stream);
        this.a = stream;
        ahvr.ci(stream2);
        this.b = stream2;
    }

    @Override // defpackage.aitt
    public final defpackage.aitt b(java.util.function.Function function) {
        throw null;
    }

    @Override // defpackage.aitt
    public final defpackage.aitt c(java.util.function.Function function) {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        j$.util.stream.Stream stream = this.a;
        try {
            this.b.close();
            stream.close();
        } catch (java.lang.Throwable th) {
            try {
                stream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitt
    public final j$.util.stream.Stream d(final java.util.function.BiFunction biFunction) {
        j$.util.stream.Stream stream = j$.util.stream.StreamSupport.stream(new java.util.function.Supplier() { // from class: aitp
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                defpackage.aitr aitrVar = new defpackage.aitr(this.a);
                return new defpackage.aitq(aitrVar, java.lang.Math.min(aitrVar.c.estimateSize(), aitrVar.d.estimateSize()), biFunction);
            }
        }, 16, false);
        j$.util.stream.Stream stream2 = this.a;
        j$.util.Objects.requireNonNull(stream2);
        j$.util.stream.Stream streamOnClose = stream.onClose(new ahts(stream2, 5));
        j$.util.stream.Stream stream3 = this.b;
        j$.util.Objects.requireNonNull(stream3);
        return streamOnClose.onClose(new ahts(stream3, 5));
    }

    @Override // defpackage.aitt
    public final java.lang.Object e(defpackage.aita aitaVar) {
        defpackage.aitr aitrVar = new defpackage.aitr(this);
        j$.util.stream.Collector collectorB = aido.b(new aite(aitrVar, 2), new aite(aitrVar, 3));
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(collectorB.supplier());
        java.util.function.BiConsumer biConsumerAccumulator = collectorB.accumulator();
        while (aitrVar.a()) {
            aa$.ExternalSyntheticApiModelOutline1.m(biConsumerAccumulator, objM, (java.lang.Object) null);
        }
        return aa$.ExternalSyntheticApiModelOutline1.m(collectorB.finisher(), objM);
    }
}
