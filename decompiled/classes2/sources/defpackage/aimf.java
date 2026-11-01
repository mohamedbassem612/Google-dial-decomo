package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aimf extends defpackage.aimd {
    final int[] b;

    public aimf(int[] iArr, ahyc ahycVar) {
        super(ahycVar);
        this.b = iArr;
    }

    @Override // defpackage.aimg
    public final int a() {
        return 257;
    }

    @Override // defpackage.aimd
    public final int c(int i) {
        int i2 = i & 255;
        if (i != this.b[i2]) {
            return 256;
        }
        return i2;
    }
}
