package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class t4 implements j$.util.stream.i5, j$.util.stream.c6 {
    public boolean a;
    public double b;
    public final /* synthetic */ java.util.function.DoubleBinaryOperator c;

    public t4(java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        this.c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.i5
    public final void B(j$.util.stream.i5 i5Var) {
        j$.util.stream.t4 t4Var = (j$.util.stream.t4) i5Var;
        if (t4Var.a) {
            return;
        }
        accept(t4Var.b);
    }

    @Override // j$.util.stream.c6
    public final /* synthetic */ void L(java.lang.Double d) {
        j$.util.stream.n4.e(this, d);
    }

    @Override // j$.util.stream.f6
    public final void accept(double d) {
        if (!this.a) {
            this.b = this.c.applyAsDouble(this.b, d);
        } else {
            this.a = false;
            this.b = d;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return this.a ? j$.util.OptionalDouble.c : new j$.util.OptionalDouble(this.b);
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        L((java.lang.Double) obj);
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    @Override // j$.util.stream.f6
    public final void end() {
    }
}
