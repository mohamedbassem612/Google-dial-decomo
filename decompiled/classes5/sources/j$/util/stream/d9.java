package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class d9 implements j$.util.stream.f6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.Consumer b;

    public /* synthetic */ d9(java.util.function.Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        byte b = this.a;
        java.util.function.Consumer consumer = this.b;
        switch (b) {
            case 0:
                ((j$.util.stream.q7) consumer).r(obj);
                break;
            default:
                consumer.r(obj);
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

    private final void a(long j) {
    }

    private final void b(long j) {
    }

    private final void c() {
    }

    private final void d() {
    }
}
