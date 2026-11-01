package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class b6 implements j$.util.stream.f6 {
    public final j$.util.stream.f6 a;

    public b6(j$.util.stream.f6 f6Var) {
        this.a = (j$.util.stream.f6) j$.util.Objects.requireNonNull(f6Var);
    }

    @Override // j$.util.stream.f6
    public final /* synthetic */ void accept(double d) {
        j$.util.stream.n4.d();
        throw null;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f6
    public void end() {
        this.a.end();
    }

    @Override // j$.util.stream.f6
    public void p(long j) {
        this.a.p(j);
    }

    @Override // j$.util.stream.f6
    public boolean t() {
        return this.a.t();
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
}
