package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class i7 extends j$.util.stream.o7 implements j$.util.p0 {
    public final /* synthetic */ j$.util.stream.j7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(j$.util.stream.j7 j7Var, int i, int i2, int i3, int i4) {
        super(j7Var, i, i2, i3, i4);
        this.g = j7Var;
    }

    @Override // j$.util.stream.o7
    public final void a(int i, java.lang.Object obj, java.lang.Object obj2) {
        ((java.util.function.DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.o7
    public final j$.util.w0 c(int i, int i2, int i3, int i4) {
        return new j$.util.stream.i7(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.s(this, consumer);
    }
}
