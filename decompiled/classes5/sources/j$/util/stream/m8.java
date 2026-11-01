package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class m8 implements j$.util.stream.d6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.IntConsumer b;

    public /* synthetic */ m8(java.util.function.IntConsumer intConsumer, byte b) {
        this.a = b;
        this.b = intConsumer;
    }

    @Override // j$.util.stream.d6, j$.util.stream.f6
    public final void accept(int i) {
        byte b = this.a;
        java.util.function.IntConsumer intConsumer = this.b;
        switch (b) {
            case 0:
                intConsumer.accept(i);
                break;
            default:
                ((j$.util.stream.l7) intConsumer).accept(i);
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

    @Override // j$.util.stream.d6
    public final /* synthetic */ void r(java.lang.Integer num) {
        switch (this.a) {
            case 0:
                j$.util.stream.n4.g(this, num);
                break;
            default:
                j$.util.stream.n4.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        byte b = this.a;
        return false;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
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

    @Override // j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                j$.util.stream.n4.l();
                throw null;
            default:
                j$.util.stream.n4.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                r((java.lang.Integer) obj);
                break;
            default:
                r((java.lang.Integer) obj);
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
