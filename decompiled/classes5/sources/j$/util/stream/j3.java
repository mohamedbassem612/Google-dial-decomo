package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class j3 extends j$.util.stream.j7 implements j$.util.stream.o2, j$.util.stream.j2 {
    @Override // j$.util.stream.j7
    /* JADX INFO: renamed from: D */
    public final j$.util.p0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.c6
    public final /* synthetic */ void L(java.lang.Double d) {
        j$.util.stream.n4.e(this, d);
    }

    @Override // j$.util.stream.t2, j$.util.stream.u2
    public final j$.util.stream.t2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.p7, j$.util.stream.t2
    public final java.lang.Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.p7, j$.util.stream.t2
    public final void c(int i, java.lang.Object obj) {
        super.c(i, (double[]) obj);
    }

    @Override // j$.util.stream.p7, j$.util.stream.t2
    public final void d(java.lang.Object obj) {
        super.d((java.util.function.DoubleConsumer) obj);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.t(this, j, j2);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void h(java.lang.Object[] objArr, int i) {
        j$.util.stream.n4.n(this, (java.lang.Double[]) objArr, i);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ java.lang.Object[] k(java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.m(this, intFunction);
    }

    @Override // j$.util.stream.u2
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        clear();
        x(j);
    }

    @Override // j$.util.stream.j7, java.lang.Iterable, j$.lang.a
    public final j$.util.w0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    @Override // j$.util.stream.m2
    public final j$.util.stream.u2 build() {
        return this;
    }

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    @Override // j$.util.stream.j7, java.lang.Iterable, j$.lang.a
    public final j$.util.Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.u2
    public final j$.util.stream.u2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        L((java.lang.Double) obj);
    }

    @Override // j$.util.stream.j2, j$.util.stream.m2
    public final j$.util.stream.o2 build() {
        return this;
    }

    @Override // j$.util.stream.f6
    public final void end() {
    }
}
