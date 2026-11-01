package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c5 implements j$.util.stream.i5, j$.util.stream.d6 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.util.function.IntBinaryOperator c;

    public c5(int i, java.util.function.IntBinaryOperator intBinaryOperator) {
        this.b = i;
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.i5
    public final void B(j$.util.stream.i5 i5Var) {
        accept(((j$.util.stream.c5) i5Var).a);
    }

    @Override // j$.util.stream.f6
    public final void accept(int i) {
        this.a = this.c.applyAsInt(this.a, i);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return java.lang.Integer.valueOf(this.a);
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.d6
    public final /* synthetic */ void r(java.lang.Integer num) {
        j$.util.stream.n4.g(this, num);
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        r((java.lang.Integer) obj);
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(double d) {
        j$.util.stream.n4.d();
        throw null;
    }

    @Override // j$.util.stream.f6
    public final void end() {
    }
}
