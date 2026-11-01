package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class h0 extends j$.util.stream.j0 implements j$.util.stream.e6 {
    public static final j$.util.stream.e0 c;
    public static final j$.util.stream.e0 d;

    static {
        j$.util.stream.w7 w7Var = j$.util.stream.w7.LONG_VALUE;
        c = new j$.util.stream.e0(true, w7Var, j$.util.OptionalLong.empty(), new j$.util.stream.l((byte) 26), new j$.util.stream.l((byte) 27));
        d = new j$.util.stream.e0(false, w7Var, j$.util.OptionalLong.empty(), new j$.util.stream.l((byte) 26), new j$.util.stream.l((byte) 27));
    }

    @Override // j$.util.stream.j0, j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        r(java.lang.Long.valueOf(j));
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.a) {
            return j$.util.OptionalLong.of(((java.lang.Long) this.b).longValue());
        }
        return null;
    }
}
