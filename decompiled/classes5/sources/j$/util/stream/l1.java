package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class l1 extends j$.util.stream.z5 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(j$.util.stream.f6 f6Var, java.lang.Object obj, byte b) {
        super(f6Var);
        this.b = b;
        this.c = obj;
    }

    @Override // j$.util.stream.d6, j$.util.stream.f6
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(((java.util.function.IntFunction) this.c).apply(i));
                break;
            case 1:
                ((java.util.function.IntConsumer) this.c).accept(i);
                this.a.accept(i);
                break;
            case 2:
                this.a.accept(((java.util.function.IntUnaryOperator) this.c).applyAsInt(i));
                break;
            default:
                if (((java.util.function.IntPredicate) this.c).test(i)) {
                    this.a.accept(i);
                }
                break;
        }
    }

    @Override // j$.util.stream.z5, j$.util.stream.f6
    public final void p(long j) {
        switch (this.b) {
            case 3:
                this.a.p(-1L);
                break;
            default:
                super.p(j);
                break;
        }
    }
}
