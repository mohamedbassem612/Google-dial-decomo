package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class b2 implements java.util.function.Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j$.util.stream.h2 b;

    public /* synthetic */ b2(j$.util.stream.h2 h2Var, byte b) {
        this.a = b;
        this.b = h2Var;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.a) {
            case 0:
                return new j$.util.stream.e2(this.b);
            default:
                return new j$.util.stream.f2(this.b);
        }
    }
}
