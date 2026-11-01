package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b4 extends j$.util.stream.n7 implements j$.util.stream.s2, j$.util.stream.l2 {
    @Override // j$.util.stream.e6
    public final /* synthetic */ void C(java.lang.Long l) {
        j$.util.stream.n4.i(this, l);
    }

    @Override // j$.util.stream.n7
    /* JADX INFO: renamed from: D */
    public final j$.util.Spliterator.OfLong spliterator() {
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
        return (long[]) super.b();
    }

    @Override // j$.util.stream.p7, j$.util.stream.t2
    public final void c(int i, java.lang.Object obj) {
        super.c(i, (long[]) obj);
    }

    @Override // j$.util.stream.p7, j$.util.stream.t2
    public final void d(java.lang.Object obj) {
        super.d((java.util.function.LongConsumer) obj);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.v(this, j, j2);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void h(java.lang.Object[] objArr, int i) {
        j$.util.stream.n4.p(this, (java.lang.Long[]) objArr, i);
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

    @Override // j$.util.stream.n7, java.lang.Iterable, j$.lang.a
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

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    @Override // j$.util.stream.n7, java.lang.Iterable, j$.lang.a
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
        C((java.lang.Long) obj);
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final j$.util.stream.s2 build() {
        return this;
    }

    @Override // j$.util.stream.f6
    public final void end() {
    }
}
