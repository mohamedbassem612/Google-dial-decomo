package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class w6 extends j$.util.stream.s6 {
    public j$.util.stream.l7 c;

    @Override // j$.util.stream.d6, j$.util.stream.f6
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.z5, j$.util.stream.f6
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        java.util.Arrays.sort(iArr);
        long length = iArr.length;
        j$.util.stream.f6 f6Var = this.a;
        f6Var.p(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (f6Var.t()) {
                    break;
                }
                f6Var.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                f6Var.accept(iArr[i]);
                i++;
            }
        }
        f6Var.end();
    }

    @Override // j$.util.stream.z5, j$.util.stream.f6
    public final void p(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new j$.util.stream.l7((int) j) : new j$.util.stream.l7();
        } else {
            j$.time.g.b("Stream size exceeds max array size");
        }
    }
}
