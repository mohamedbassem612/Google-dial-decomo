package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class i2 extends j$.util.stream.b {
    public final j$.nio.file.e0 j;

    public i2(j$.util.stream.i2 i2Var, j$.util.Spliterator spliterator) {
        super(i2Var, spliterator);
        this.j = i2Var.j;
    }

    @Override // j$.util.stream.d
    public final java.lang.Object a() {
        j$.util.stream.a aVar = this.a;
        j$.util.stream.g2 g2Var = (j$.util.stream.g2) ((java.util.function.Supplier) this.j.c).get();
        aVar.O(this.b, g2Var);
        boolean z = g2Var.b;
        if (z == ((j$.util.stream.h2) this.j.b).b) {
            j$.com.android.tools.r8.a.H(this.h, null, java.lang.Boolean.valueOf(z));
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final j$.util.stream.d e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.i2(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final java.lang.Object j() {
        return java.lang.Boolean.valueOf(!((j$.util.stream.h2) this.j.b).b);
    }

    public i2(j$.nio.file.e0 e0Var, j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = e0Var;
    }
}
