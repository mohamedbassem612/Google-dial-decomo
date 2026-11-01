package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q9 extends j$.util.stream.z5 implements j$.util.stream.z9 {
    public long b;
    public boolean c;
    public final /* synthetic */ java.util.function.IntPredicate d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(j$.util.stream.f6 f6Var, java.util.function.IntPredicate intPredicate, boolean z) {
        super(f6Var);
        this.d = intPredicate;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    @Override // j$.util.stream.d6, j$.util.stream.f6
    public final void accept(int i) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.d.test(i);
            this.c = !zTest;
            if (zTest) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = this.e;
        if (z2 && !z) {
            this.b++;
        }
        if (z2 || z) {
            this.a.accept(i);
        }
    }

    @Override // j$.util.stream.z9
    public final long z() {
        return this.b;
    }
}
