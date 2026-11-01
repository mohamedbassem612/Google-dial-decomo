package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class f0 extends j$.util.stream.j0 implements j$.util.stream.c6 {
    public static final j$.util.stream.e0 c;
    public static final j$.util.stream.e0 d;

    static {
        j$.util.stream.w7 w7Var = j$.util.stream.w7.DOUBLE_VALUE;
        j$.util.stream.l lVar = new j$.util.stream.l((byte) 22);
        j$.util.stream.l lVar2 = new j$.util.stream.l((byte) 23);
        j$.util.OptionalDouble optionalDouble = j$.util.OptionalDouble.c;
        c = new j$.util.stream.e0(true, w7Var, optionalDouble, lVar, lVar2);
        d = new j$.util.stream.e0(false, w7Var, optionalDouble, new j$.util.stream.l((byte) 22), new j$.util.stream.l((byte) 23));
    }

    @Override // j$.util.stream.j0, j$.util.stream.f6
    public final void accept(double d2) {
        r(java.lang.Double.valueOf(d2));
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.a) {
            return new j$.util.OptionalDouble(((java.lang.Double) this.b).doubleValue());
        }
        return null;
    }
}
