package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class o5 extends j$.util.stream.j5 implements j$.util.stream.i5 {
    public long b;

    @Override // j$.util.stream.i5
    public final void B(j$.util.stream.i5 i5Var) {
        this.b += ((j$.util.stream.o5) i5Var).b;
    }

    public /* synthetic */ void accept(double d) {
        j$.util.stream.n4.d();
        throw null;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j5, java.util.function.Supplier
    public final java.lang.Object get() {
        return java.lang.Long.valueOf(this.b);
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    @Override // j$.util.stream.f6
    public final void end() {
    }
}
