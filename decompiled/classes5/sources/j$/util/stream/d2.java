package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class d2 extends j$.util.stream.g2 implements j$.util.stream.d6 {
    public final /* synthetic */ j$.util.stream.h2 c;
    public final /* synthetic */ java.util.function.IntPredicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(j$.util.stream.h2 h2Var, java.util.function.IntPredicate intPredicate) {
        super(h2Var);
        this.c = h2Var;
        this.d = intPredicate;
    }

    @Override // j$.util.stream.g2, j$.util.stream.f6
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(i);
        j$.util.stream.h2 h2Var = this.c;
        if (zTest == h2Var.a) {
            this.a = true;
            this.b = h2Var.b;
        }
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.d6
    public final /* synthetic */ void r(java.lang.Integer num) {
        j$.util.stream.n4.g(this, num);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        r((java.lang.Integer) obj);
    }
}
