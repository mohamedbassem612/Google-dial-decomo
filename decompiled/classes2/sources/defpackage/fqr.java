package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fqr implements defpackage.fme {
    public final int a;
    public final defpackage.aizh b;

    public fqr(int i, int[] iArr) {
        this.a = i;
        this.b = iArr != null ? new defpackage.aizh(java.util.Arrays.copyOf(iArr, iArr.length)) : defpackage.aizh.a;
    }

    public final java.lang.String toString() {
        defpackage.aizh aizhVar = this.b;
        int i = aizhVar.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(eum.M(aizhVar.a(i2)));
        }
        return "UnsupportedBrands{major=" + eum.M(this.a) + ", compatible=" + arrayList.toString() + '}';
    }
}
