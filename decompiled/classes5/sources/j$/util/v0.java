package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class v0 implements java.util.Spliterator.OfPrimitive {
    public final /* synthetic */ j$.util.w0 a;

    public /* synthetic */ v0(j$.util.w0 w0Var) {
        this.a = w0Var;
    }

    public static /* synthetic */ java.util.Spliterator.OfPrimitive a(j$.util.w0 w0Var) {
        if (w0Var == null) {
            return null;
        }
        if (w0Var instanceof j$.util.u0) {
            return ((j$.util.u0) w0Var).a;
        }
        if (w0Var instanceof j$.util.p0) {
            return j$.util.o0.a((j$.util.p0) w0Var);
        }
        if (w0Var instanceof j$.util.Spliterator.OfInt) {
            return j$.util.r0.a((j$.util.Spliterator.OfInt) w0Var);
        }
        return w0Var instanceof j$.util.Spliterator.OfLong ? j$.util.t0.a((j$.util.Spliterator.OfLong) w0Var) : new j$.util.v0(w0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.w0 w0Var = this.a;
        if (obj instanceof j$.util.v0) {
            obj = ((j$.util.v0) obj).a;
        }
        return w0Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return a(this.a.trySplit());
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return j$.util.y0.a(this.a.trySplit());
    }
}
