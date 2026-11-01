package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class o8 implements j$.util.stream.e6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.LongConsumer b;

    public /* synthetic */ o8(java.util.function.LongConsumer longConsumer, byte b) {
        this.a = b;
        this.b = longConsumer;
    }

    @Override // j$.util.stream.e6
    public final /* synthetic */ void C(java.lang.Long l) {
        switch (this.a) {
            case 0:
                j$.util.stream.n4.i(this, l);
                break;
            default:
                j$.util.stream.n4.i(this, l);
                break;
        }
    }

    @Override // j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        byte b = this.a;
        java.util.function.LongConsumer longConsumer = this.b;
        switch (b) {
            case 0:
                longConsumer.accept(j);
                break;
            default:
                ((j$.util.stream.n7) longConsumer).accept(j);
                break;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f6
    public final void end() {
        byte b = this.a;
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        byte b = this.a;
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        byte b = this.a;
        return false;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                j$.util.stream.n4.k();
                throw null;
            default:
                j$.util.stream.n4.k();
                throw null;
        }
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                j$.util.stream.n4.d();
                throw null;
            default:
                j$.util.stream.n4.d();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                C((java.lang.Long) obj);
                break;
            default:
                C((java.lang.Long) obj);
                break;
        }
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }

    private final void c() {
    }

    private final void d() {
    }
}
