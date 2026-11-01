package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c7 extends j$.util.stream.u6 {
    public java.util.ArrayList d;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final void end() {
        j$.util.List.EL.sort(this.d, this.b);
        long size = this.d.size();
        j$.util.stream.f6 f6Var = this.a;
        f6Var.p(size);
        boolean z = this.c;
        java.util.ArrayList arrayList = this.d;
        if (z) {
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                if (f6Var.t()) {
                    break;
                } else {
                    f6Var.r(obj);
                }
            }
        } else {
            j$.util.Objects.requireNonNull(f6Var);
            j$.util.Collection.EL.a(arrayList, new j$.desugar.sun.nio.fs.g((byte) 11, f6Var));
        }
        f6Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final void p(long j) {
        if (j < 2147483639) {
            this.d = j >= 0 ? new java.util.ArrayList((int) j) : new java.util.ArrayList();
        } else {
            j$.time.g.b("Stream size exceeds max array size");
        }
    }
}
