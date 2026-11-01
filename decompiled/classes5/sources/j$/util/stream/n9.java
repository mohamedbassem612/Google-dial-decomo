package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class n9 extends j$.util.stream.b6 implements j$.util.stream.z9 {
    public long b;
    public boolean c;
    public final /* synthetic */ java.util.function.Predicate d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(j$.util.stream.f6 f6Var, java.util.function.Predicate predicate, boolean z) {
        super(f6Var);
        this.d = predicate;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.d.test(obj);
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
            this.a.accept(obj);
        }
    }

    @Override // j$.util.stream.z9
    public final long z() {
        return this.b;
    }
}
