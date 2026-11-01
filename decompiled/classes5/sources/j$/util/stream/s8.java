package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class s8 extends j$.util.stream.t8 implements j$.util.Spliterator.OfLong {
    @Override // j$.util.stream.v8
    public final j$.util.Spliterator a(j$.util.Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new j$.util.stream.s8((j$.util.Spliterator.OfLong) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.t8
    public final java.lang.Object b() {
        return new j$.util.stream.r2((byte) 1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.u(this, consumer);
    }
}
