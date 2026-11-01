package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g5 implements j$.util.stream.i5, j$.util.stream.e6 {
    public long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ java.util.function.LongBinaryOperator c;

    public g5(long j, java.util.function.LongBinaryOperator longBinaryOperator) {
        this.b = j;
        this.c = longBinaryOperator;
    }

    @Override // j$.util.stream.i5
    public final void B(j$.util.stream.i5 i5Var) {
        accept(((j$.util.stream.g5) i5Var).a);
    }

    @Override // j$.util.stream.e6
    public final /* synthetic */ void C(java.lang.Long l) {
        j$.util.stream.n4.i(this, l);
    }

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = this.c.applyAsLong(this.a, j);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return java.lang.Long.valueOf(this.a);
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        C((java.lang.Long) obj);
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
