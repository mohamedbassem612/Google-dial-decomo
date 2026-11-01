package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class t1 extends j$.util.stream.a6 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(j$.util.stream.f6 f6Var, java.lang.Object obj, byte b) {
        super(f6Var);
        this.b = b;
        this.c = obj;
    }

    @Override // j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(((java.util.function.LongFunction) this.c).apply(j));
                break;
            default:
                ((java.util.function.LongConsumer) this.c).accept(j);
                this.a.accept(j);
                break;
        }
    }
}
