package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class f implements java.util.stream.BaseStream {
    public final /* synthetic */ j$.util.stream.BaseStream a;

    public /* synthetic */ f(j$.util.stream.BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ java.util.stream.BaseStream e(j$.util.stream.BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof j$.util.stream.e) {
            return ((j$.util.stream.e) baseStream).a;
        }
        if (baseStream instanceof j$.util.stream.DoubleStream) {
            return j$.util.stream.d0.e((j$.util.stream.DoubleStream) baseStream);
        }
        if (baseStream instanceof j$.util.stream.IntStream) {
            return j$.util.stream.s1.e((j$.util.stream.IntStream) baseStream);
        }
        if (baseStream instanceof j$.util.stream.LongStream) {
            return j$.util.stream.a2.e((j$.util.stream.LongStream) baseStream);
        }
        return baseStream instanceof j$.util.stream.Stream ? j$.util.stream.s7.e((j$.util.stream.Stream) baseStream) : new j$.util.stream.f(baseStream);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.BaseStream baseStream = this.a;
        if (obj instanceof j$.util.stream.f) {
            obj = ((j$.util.stream.f) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.a.iterator2();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return e(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return e(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return e(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return j$.util.y0.a(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return e(this.a.unordered());
    }
}
