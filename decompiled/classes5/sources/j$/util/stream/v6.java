package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v6 extends j$.util.stream.r6 {
    public j$.util.stream.j7 c;

    @Override // j$.util.stream.c6, j$.util.stream.f6
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.y5, j$.util.stream.f6
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        java.util.Arrays.sort(dArr);
        long length = dArr.length;
        j$.util.stream.f6 f6Var = this.a;
        f6Var.p(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (f6Var.t()) {
                    break;
                }
                f6Var.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                f6Var.accept(dArr[i]);
                i++;
            }
        }
        f6Var.end();
    }

    @Override // j$.util.stream.y5, j$.util.stream.f6
    public final void p(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new j$.util.stream.j7((int) j) : new j$.util.stream.j7();
        } else {
            j$.time.g.b("Stream size exceeds max array size");
        }
    }
}
