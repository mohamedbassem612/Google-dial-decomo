package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahpa {
    public final int[] a;
    public final defpackage.ahoy b;
    public defpackage.ahoy c;
    public int d;
    public int e;
    public int f;

    public ahpa(int[] iArr) {
        this.a = iArr;
        defpackage.ahoy ahoyVar = new defpackage.ahoy(-1, -1);
        this.b = ahoyVar;
        this.c = ahoyVar;
    }

    private final void d(defpackage.ahoy ahoyVar, java.lang.StringBuilder sb) {
        for (defpackage.ahoy ahoyVar2 : ahoyVar.d.values()) {
            sb.append("  ");
            sb.append(ahoyVar);
            sb.append(" -> ");
            sb.append(ahoyVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(java.util.Arrays.toString(java.util.Arrays.copyOfRange(iArr, ahoyVar2.a, java.lang.Math.min(iArr.length, ahoyVar2.b + 1))));
            sb.append("\"]\n");
            d(ahoyVar2, sb);
        }
    }

    final void a() {
        defpackage.ahoy ahoyVar = this.c.c;
        if (ahoyVar != null) {
            this.c = ahoyVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    final void b() {
        if (this.e == 0) {
            return;
        }
        java.util.Map map = this.c.d;
        int[] iArr = this.a;
        defpackage.ahoy ahoyVar = (defpackage.ahoy) map.get(java.lang.Integer.valueOf(iArr[this.d]));
        while (true) {
            int i = (ahoyVar.b - ahoyVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = ahoyVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                ahoyVar = (defpackage.ahoy) ahoyVar.d.get(java.lang.Integer.valueOf(iArr[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        int iMin = java.lang.Math.min(length, i2);
        if (iMin - i != java.lang.Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append('}');
        return sb.toString();
    }
}
