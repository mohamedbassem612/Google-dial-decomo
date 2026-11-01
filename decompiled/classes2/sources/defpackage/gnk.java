package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gnk {
    public static final java.util.Set a;
    private static final java.util.List d;
    private static final java.util.List e;
    private static final java.util.List f;
    private static final java.util.List g;
    public final int b;
    public final int c;

    static {
        java.util.List listBb = ajsz.bb(new java.lang.Integer[]{0, 600, 840});
        d = listBb;
        java.util.List listBT = ajsz.bT(listBb, ajsz.bb(new java.lang.Integer[]{1200, 1600}));
        e = listBT;
        java.util.List listBb2 = ajsz.bb(new java.lang.Integer[]{0, 480, 900});
        f = listBb2;
        g = listBb2;
        a = defpackage.fsu.E(listBb, listBb2);
        defpackage.fsu.E(listBT, listBb2);
    }

    public gnk(int i, int i2) {
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(a.bw((byte) 46, i, "Expected minWidthDp to be at least 0, minWidthDp: "));
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(a.bw((byte) 46, i2, "Expected minHeightDp to be at least 0, minHeightDp: "));
        }
    }

    public final boolean a() {
        return this.c >= 480;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.gnk gnkVar = (defpackage.gnk) obj;
            if (this.b == gnkVar.b && this.c == gnkVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "WindowSizeClass(minWidthDp=" + this.b + ", minHeightDp=" + this.c + ')';
    }
}
