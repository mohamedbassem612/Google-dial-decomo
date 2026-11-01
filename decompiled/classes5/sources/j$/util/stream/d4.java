package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class d4 extends j$.util.stream.g4 implements j$.util.stream.d6 {
    public final int[] h;

    public d4(j$.util.stream.d4 d4Var, j$.util.Spliterator spliterator, long j, long j2) {
        super(d4Var, spliterator, j, j2, d4Var.h.length);
        this.h = d4Var.h;
    }

    @Override // j$.util.stream.g4
    public final j$.util.stream.g4 a(j$.util.Spliterator spliterator, long j, long j2) {
        return new j$.util.stream.d4(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.g4, j$.util.stream.f6
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Integer.toString(i2));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.d6
    public final /* synthetic */ void r(java.lang.Integer num) {
        j$.util.stream.n4.g(this, num);
    }

    public d4(j$.util.Spliterator spliterator, j$.util.stream.a aVar, int[] iArr) {
        super(spliterator, aVar, iArr.length);
        this.h = iArr;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        r((java.lang.Integer) obj);
    }
}
