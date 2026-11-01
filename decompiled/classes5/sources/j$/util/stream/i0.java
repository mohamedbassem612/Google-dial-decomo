package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class i0 extends j$.util.stream.j0 {
    public static final j$.util.stream.e0 c;
    public static final j$.util.stream.e0 d;

    static {
        j$.util.stream.w7 w7Var = j$.util.stream.w7.REFERENCE;
        c = new j$.util.stream.e0(true, w7Var, j$.util.Optional.empty(), new j$.util.stream.l((byte) 28), new j$.util.stream.l((byte) 29));
        d = new j$.util.stream.e0(false, w7Var, j$.util.Optional.empty(), new j$.util.stream.l((byte) 28), new j$.util.stream.l((byte) 29));
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.a) {
            return j$.util.Optional.of(this.b);
        }
        return null;
    }
}
