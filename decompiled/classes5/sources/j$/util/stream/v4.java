package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v4 extends j$.util.stream.j5 implements j$.util.stream.i5, j$.util.stream.c6 {
    public final /* synthetic */ java.util.function.Supplier b;
    public final /* synthetic */ java.util.function.ObjDoubleConsumer c;
    public final /* synthetic */ j$.util.stream.t d;

    public v4(java.util.function.Supplier supplier, java.util.function.ObjDoubleConsumer objDoubleConsumer, j$.util.stream.t tVar) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = tVar;
    }

    @Override // j$.util.stream.i5
    public final void B(j$.util.stream.i5 i5Var) {
        this.a = this.d.apply(this.a, ((j$.util.stream.v4) i5Var).a);
    }

    @Override // j$.util.stream.c6
    public final /* synthetic */ void L(java.lang.Double d) {
        j$.util.stream.n4.e(this, d);
    }

    @Override // j$.util.stream.f6
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        this.a = this.b.get();
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
