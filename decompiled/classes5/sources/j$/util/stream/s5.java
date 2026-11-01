package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class s5 extends j$.util.stream.w5 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ java.util.function.Function o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5(j$.util.stream.x5 x5Var, int i, java.util.function.Function function, byte b) {
        super(x5Var, i, (byte) 1);
        this.n = b;
        this.o = function;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        switch (this.n) {
            case 0:
                return new j$.util.stream.q(f6Var, this.o, (byte) 3);
            default:
                return new j$.util.stream.p(f6Var, this.o);
        }
    }
}
