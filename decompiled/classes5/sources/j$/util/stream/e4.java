package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class e4 extends j$.util.stream.g4 implements j$.util.stream.e6 {
    public final long[] h;

    public e4(j$.util.stream.e4 e4Var, j$.util.Spliterator spliterator, long j, long j2) {
        super(e4Var, spliterator, j, j2, e4Var.h.length);
        this.h = e4Var.h;
    }

    @Override // j$.util.stream.e6
    public final /* synthetic */ void C(java.lang.Long l) {
        j$.util.stream.n4.i(this, l);
    }

    @Override // j$.util.stream.g4
    public final j$.util.stream.g4 a(j$.util.Spliterator spliterator, long j, long j2) {
        return new j$.util.stream.e4(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.g4, j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Integer.toString(i));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    public e4(j$.util.Spliterator spliterator, j$.util.stream.a aVar, long[] jArr) {
        super(spliterator, aVar, jArr.length);
        this.h = jArr;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        C((java.lang.Long) obj);
    }
}
