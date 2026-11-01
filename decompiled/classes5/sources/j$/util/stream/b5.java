package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b5 extends j$.util.stream.j5 implements j$.util.stream.i5 {
    public final /* synthetic */ java.util.function.Supplier b;
    public final /* synthetic */ java.util.function.BiConsumer c;
    public final /* synthetic */ java.util.function.BiConsumer d;

    public b5(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = biConsumer2;
    }

    @Override // j$.util.stream.i5
    public final void B(j$.util.stream.i5 i5Var) {
        this.d.accept(this.a, ((j$.util.stream.b5) i5Var).a);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        this.c.accept(this.a, obj);
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
