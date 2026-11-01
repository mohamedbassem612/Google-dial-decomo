package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class y4 implements j$.util.stream.i5 {
    public boolean a;
    public java.lang.Object b;
    public final /* synthetic */ java.util.function.BinaryOperator c;

    public y4(java.util.function.BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // j$.util.stream.i5
    public final void B(j$.util.stream.i5 i5Var) {
        j$.util.stream.y4 y4Var = (j$.util.stream.y4) i5Var;
        if (y4Var.a) {
            return;
        }
        r(y4Var.b);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        if (!this.a) {
            this.b = this.c.apply(this.b, obj);
        } else {
            this.a = false;
            this.b = obj;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return this.a ? j$.util.Optional.empty() : j$.util.Optional.of(this.b);
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
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
