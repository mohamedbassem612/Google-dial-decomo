package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class s3 extends j$.util.stream.l7 implements j$.util.stream.q2, j$.util.stream.k2 {
    @Override // j$.util.stream.l7
    /* JADX INFO: renamed from: D */
    public final j$.util.Spliterator.OfInt spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.t2, j$.util.stream.u2
    public final j$.util.stream.t2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(double d) {
        j$.util.stream.n4.d();
        throw null;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.p7, j$.util.stream.t2
    public final java.lang.Object b() {
        return (int[]) super.b();
    }

    @Override // j$.util.stream.p7, j$.util.stream.t2
    public final void c(int i, java.lang.Object obj) {
        super.c(i, (int[]) obj);
    }

    @Override // j$.util.stream.p7, j$.util.stream.t2
    public final void d(java.lang.Object obj) {
        super.d((java.util.function.IntConsumer) obj);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.u(this, j, j2);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void h(java.lang.Object[] objArr, int i) {
        j$.util.stream.n4.o(this, (java.lang.Integer[]) objArr, i);
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

    @Override // j$.util.stream.d6
    public final /* synthetic */ void r(java.lang.Integer num) {
        j$.util.stream.n4.g(this, num);
    }

    @Override // j$.util.stream.l7, java.lang.Iterable, j$.lang.a
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

    @Override // j$.util.stream.l7, java.lang.Iterable, j$.lang.a
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
        r((java.lang.Integer) obj);
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final j$.util.stream.q2 build() {
        return this;
    }

    @Override // j$.util.stream.f6
    public final void end() {
    }
}
