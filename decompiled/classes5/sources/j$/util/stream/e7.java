package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class e7 extends j$.util.stream.s6 {
    public int[] c;
    public int d;

    @Override // j$.util.stream.d6, j$.util.stream.f6
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.z5, j$.util.stream.f6
    public final void end() {
        int i = 0;
        java.util.Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        j$.util.stream.f6 f6Var = this.a;
        f6Var.p(j);
        if (this.b) {
            while (i < this.d && !f6Var.t()) {
                f6Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                f6Var.accept(this.c[i]);
                i++;
            }
        }
        f6Var.end();
        this.c = null;
    }

    @Override // j$.util.stream.z5, j$.util.stream.f6
    public final void p(long j) {
        if (j < 2147483639) {
            this.c = new int[(int) j];
        } else {
            j$.time.g.b("Stream size exceeds max array size");
        }
    }
}
