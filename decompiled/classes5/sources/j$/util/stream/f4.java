package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class f4 extends j$.util.stream.g4 {
    public final java.lang.Object[] h;

    public f4(j$.util.stream.f4 f4Var, j$.util.Spliterator spliterator, long j, long j2) {
        super(f4Var, spliterator, j, j2, f4Var.h.length);
        this.h = f4Var.h;
    }

    @Override // j$.util.stream.g4
    public final j$.util.stream.g4 a(j$.util.Spliterator spliterator, long j, long j2) {
        return new j$.util.stream.f4(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Integer.toString(i));
        }
        java.lang.Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    public f4(j$.util.Spliterator spliterator, j$.util.stream.a aVar, java.lang.Object[] objArr) {
        super(spliterator, aVar, objArr.length);
        this.h = objArr;
    }
}
