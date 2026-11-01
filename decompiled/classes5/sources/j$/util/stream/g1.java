package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g1 implements j$.util.stream.f6, j$.util.stream.w0 {
    public final j$.util.stream.f6 a;
    public final j$.util.stream.c1 b;
    public final j$.util.stream.z0 c;
    public java.lang.Object d;
    public boolean e = true;
    public boolean f = true;

    public g1(j$.util.stream.c1 c1Var, j$.util.stream.f6 f6Var) {
        this.b = c1Var;
        this.a = f6Var;
        this.c = ((j$.util.stream.a1) c1Var).f();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        this.e &= ((j$.util.stream.x0) this.c).a(this.d, obj, this);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f6
    public final void end() {
        java.util.function.BiConsumer biConsumerD = ((j$.util.stream.a1) this.b).d();
        j$.util.stream.k1 k1Var = j$.util.stream.k1.DEFAULT;
        k1Var.getClass();
        if (biConsumerD != k1Var) {
            biConsumerD.accept(this.d, this);
        }
        this.a.end();
        this.d = null;
    }

    @Override // j$.util.stream.w0
    public final boolean isRejecting() {
        return !this.f;
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        java.util.function.Supplier supplierE = ((j$.util.stream.a1) this.b).e();
        j$.util.stream.k1 k1Var = j$.util.stream.k1.DEFAULT;
        k1Var.getClass();
        if (supplierE != k1Var) {
            this.d = supplierE.get();
        }
        this.a.p(-1L);
    }

    @Override // j$.util.stream.w0
    public final boolean push(java.lang.Object obj) {
        boolean z;
        boolean z2 = this.f;
        j$.util.stream.f6 f6Var = this.a;
        if (z2) {
            f6Var.r(obj);
        }
        if (z2) {
            boolean zT = f6Var.t();
            z = false;
            if (zT) {
                this.f = false;
                z = true;
            }
        } else {
            z = true;
        }
        return !z;
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        if (this.e && this.f) {
            if (!this.a.t()) {
                return false;
            }
            this.f = false;
        }
        return true;
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
}
