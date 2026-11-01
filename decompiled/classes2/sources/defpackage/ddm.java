package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ddm implements defpackage.ddr {
    protected java.lang.String a;
    private final int[] b = new int[2];

    protected final java.lang.String a() {
        java.lang.String str = this.a;
        if (str != null) {
            return str;
        }
        aooh.j("text");
        return null;
    }

    protected final int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }
}
