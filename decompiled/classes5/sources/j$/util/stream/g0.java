package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g0 extends j$.util.stream.j0 implements j$.util.stream.d6 {
    public static final j$.util.stream.e0 c;
    public static final j$.util.stream.e0 d;

    static {
        j$.util.stream.w7 w7Var = j$.util.stream.w7.INT_VALUE;
        c = new j$.util.stream.e0(true, w7Var, j$.util.OptionalInt.empty(), new j$.util.stream.l((byte) 24), new j$.util.stream.l((byte) 25));
        d = new j$.util.stream.e0(false, w7Var, j$.util.OptionalInt.empty(), new j$.util.stream.l((byte) 24), new j$.util.stream.l((byte) 25));
    }

    @Override // j$.util.stream.j0, j$.util.stream.f6
    public final void accept(int i) {
        r(java.lang.Integer.valueOf(i));
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.a) {
            return j$.util.OptionalInt.of(((java.lang.Integer) this.b).intValue());
        }
        return null;
    }
}
