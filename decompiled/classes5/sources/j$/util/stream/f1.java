package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class f1 implements java.util.function.Consumer, j$.util.stream.w0 {
    public java.lang.Object a;
    public java.lang.Object b;
    public boolean c;
    public final /* synthetic */ java.util.function.Supplier d;
    public final /* synthetic */ java.util.function.Supplier e;
    public final /* synthetic */ java.util.function.BiConsumer f;
    public final /* synthetic */ j$.util.stream.z0 g;
    public final /* synthetic */ j$.util.stream.c1 h;
    public final /* synthetic */ java.util.function.Function i;

    public f1(java.util.function.Supplier supplier, java.util.function.Supplier supplier2, java.util.function.BiConsumer biConsumer, j$.util.stream.z0 z0Var, j$.util.stream.c1 c1Var, java.util.function.Function function) {
        this.d = supplier;
        this.e = supplier2;
        this.f = biConsumer;
        this.g = z0Var;
        this.h = c1Var;
        this.i = function;
        j$.util.stream.k1 k1Var = j$.util.stream.k1.DEFAULT;
        k1Var.getClass();
        if (supplier != k1Var) {
            this.a = supplier.get();
        }
        this.b = supplier2.get();
        this.c = true;
    }

    public final void a(j$.util.Spliterator spliterator) {
        while (this.c && spliterator.tryAdvance(this)) {
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (((j$.util.stream.x0) this.g).a(this.a, obj, this)) {
            return;
        }
        this.c = false;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final java.lang.Object b() {
        java.util.function.BiConsumer biConsumerD = ((j$.util.stream.a1) this.h).d();
        j$.util.stream.k1 k1Var = j$.util.stream.k1.DEFAULT;
        k1Var.getClass();
        if (biConsumerD != k1Var) {
            biConsumerD.accept(this.a, this);
        }
        java.lang.Object obj = this.b;
        java.util.function.Function function = this.i;
        return function != null ? function.apply(obj) : obj;
    }

    @Override // j$.util.stream.w0
    public final boolean isRejecting() {
        return false;
    }

    @Override // j$.util.stream.w0
    public final boolean push(java.lang.Object obj) {
        this.f.accept(this.b, obj);
        return true;
    }
}
