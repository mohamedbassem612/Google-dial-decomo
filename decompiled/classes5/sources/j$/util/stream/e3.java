package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class e3 extends j$.util.stream.f3 implements j$.util.stream.s2 {
    @Override // j$.util.stream.u2
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.n4.s(this, consumer);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.v(this, j, j2);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void h(java.lang.Object[] objArr, int i) {
        j$.util.stream.n4.p(this, (java.lang.Long[]) objArr, i);
    }

    @Override // j$.util.stream.t2
    public final java.lang.Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.u2
    public final j$.util.w0 spliterator() {
        return new j$.util.stream.v3(this);
    }

    @Override // j$.util.stream.u2
    public final j$.util.Spliterator spliterator() {
        return new j$.util.stream.v3(this);
    }
}
