package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q4 extends j$.util.stream.n4 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ java.lang.Object i;

    public /* synthetic */ q4(j$.util.stream.w7 w7Var, java.lang.Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // j$.util.stream.n4
    public final j$.util.stream.i5 Q() {
        switch (this.h) {
            case 0:
                return new j$.util.stream.h5((java.util.function.LongBinaryOperator) this.i);
            case 1:
                return new j$.util.stream.t4((java.util.function.DoubleBinaryOperator) this.i);
            case 2:
                return new j$.util.stream.y4((java.util.function.BinaryOperator) this.i);
            default:
                return new j$.util.stream.e5((java.util.function.IntBinaryOperator) this.i);
        }
    }
}
