package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class x6 extends j$.util.stream.t6 {
    public j$.util.stream.n7 c;

    @Override // j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.a6, j$.util.stream.f6
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        java.util.Arrays.sort(jArr);
        long length = jArr.length;
        j$.util.stream.f6 f6Var = this.a;
        f6Var.p(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (f6Var.t()) {
                    break;
                }
                f6Var.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                f6Var.accept(jArr[i]);
                i++;
            }
        }
        f6Var.end();
    }

    @Override // j$.util.stream.a6, j$.util.stream.f6
    public final void p(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new j$.util.stream.n7((int) j) : new j$.util.stream.n7();
        } else {
            j$.time.g.b("Stream size exceeds max array size");
        }
    }
}
