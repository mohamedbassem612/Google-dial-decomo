package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class q0 implements j$.util.stream.j9, j$.util.stream.k9 {
    public final boolean a;

    public q0(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.j9
    public final java.lang.Object a(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        aVar.O(spliterator, this);
        return null;
    }

    public /* synthetic */ void accept(double d) {
        j$.util.stream.n4.d();
        throw null;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j9
    public final java.lang.Object b(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        if (this.a) {
            new j$.util.stream.s0(aVar, spliterator, this).invoke();
            return null;
        }
        new j$.util.stream.t0(aVar, spliterator, aVar.P(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.j9
    public final int c() {
        if (this.a) {
            return 0;
        }
        return j$.util.stream.v7.r;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return null;
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
    }

    @Override // j$.util.stream.f6
    public final void end() {
    }
}
