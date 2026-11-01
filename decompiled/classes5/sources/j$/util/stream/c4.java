package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c4 extends j$.util.stream.g4 implements j$.util.stream.c6 {
    public final double[] h;

    public c4(j$.util.stream.c4 c4Var, j$.util.Spliterator spliterator, long j, long j2) {
        super(c4Var, spliterator, j, j2, c4Var.h.length);
        this.h = c4Var.h;
    }

    @Override // j$.util.stream.c6
    public final /* synthetic */ void L(java.lang.Double d) {
        j$.util.stream.n4.e(this, d);
    }

    @Override // j$.util.stream.g4
    public final j$.util.stream.g4 a(j$.util.Spliterator spliterator, long j, long j2) {
        return new j$.util.stream.c4(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.g4, j$.util.stream.f6
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Integer.toString(i));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    public c4(j$.util.Spliterator spliterator, j$.util.stream.a aVar, double[] dArr) {
        super(spliterator, aVar, dArr.length);
        this.h = dArr;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        L((java.lang.Double) obj);
    }
}
