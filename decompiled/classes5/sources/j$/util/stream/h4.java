package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class h4 extends j$.util.stream.q7 implements j$.util.stream.u2, j$.util.stream.m2 {
    @Override // j$.util.stream.u2
    public final j$.util.stream.u2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(double d) {
        j$.util.stream.n4.d();
        throw null;
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.u2
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        clear();
        s(j);
    }

    @Override // j$.util.stream.q7, java.lang.Iterable, j$.lang.a
    public final j$.util.Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    @Override // j$.util.stream.m2
    public final j$.util.stream.u2 build() {
        return this;
    }

    @Override // j$.util.stream.f6
    public final void end() {
    }
}
