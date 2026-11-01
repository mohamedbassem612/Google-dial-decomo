package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c3 extends j$.util.stream.f3 implements j$.util.stream.o2 {
    @Override // j$.util.stream.u2
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.n4.q(this, consumer);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.t(this, j, j2);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void h(java.lang.Object[] objArr, int i) {
        j$.util.stream.n4.n(this, (java.lang.Double[]) objArr, i);
    }

    @Override // j$.util.stream.t2
    public final java.lang.Object newArray(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.u2
    public final j$.util.w0 spliterator() {
        return new j$.util.stream.t3(this);
    }

    @Override // j$.util.stream.u2
    public final j$.util.Spliterator spliterator() {
        return new j$.util.stream.t3(this);
    }
}
