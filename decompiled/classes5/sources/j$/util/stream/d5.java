package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class d5 extends j$.util.stream.n4 {
    public final /* synthetic */ java.util.function.IntBinaryOperator h;
    public final /* synthetic */ int i;

    public d5(j$.util.stream.w7 w7Var, java.util.function.IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.n4
    public final j$.util.stream.i5 Q() {
        return new j$.util.stream.c5(this.i, this.h);
    }
}
