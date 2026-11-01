package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g7 extends j$.util.stream.u6 {
    public java.lang.Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        java.lang.Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final void end() {
        int i = 0;
        java.util.Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        j$.util.stream.f6 f6Var = this.a;
        f6Var.p(j);
        if (this.c) {
            while (i < this.e && !f6Var.t()) {
                f6Var.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                f6Var.accept(this.d[i]);
                i++;
            }
        }
        f6Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final void p(long j) {
        if (j < 2147483639) {
            this.d = new java.lang.Object[(int) j];
        } else {
            j$.time.g.b("Stream size exceeds max array size");
        }
    }
}
