package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apsr implements defpackage.apss {
    private static final int[] i = {2, 2032, 2032, 8386560, 8388608, -16777216, -33554432};
    private static final int[] j = {0, 0, 0, 0, 0, 15, 15};
    public defpackage.apst a;
    defpackage.apsv b;
    public defpackage.apsw d;
    private int[] l;
    public final int[] g = new int[7];
    private java.util.List k = new java.util.ArrayList();
    private int m = -1;
    public defpackage.apsw c = new defpackage.apsw();
    public int e = -1;
    public int f = 0;

    public apsr(java.io.Reader reader) {
        this.b = new defpackage.apsv(reader);
        this.a = new defpackage.apst(this.b);
        for (int i2 = 0; i2 < 7; i2++) {
            this.g[i2] = -1;
        }
    }

    public static int b(defpackage.apsw apswVar) {
        return java.lang.Integer.parseInt(apswVar.d, 10);
    }

    public final int a() {
        defpackage.apsw apswVar = this.c;
        defpackage.apsw apswVar2 = apswVar.e;
        this.d = apswVar2;
        if (apswVar2 != null) {
            int i2 = apswVar2.a;
            this.e = i2;
            return i2;
        }
        defpackage.apsw apswVarA = this.a.a();
        apswVar.e = apswVarA;
        int i3 = apswVarA.a;
        this.e = i3;
        return i3;
    }

    public final defpackage.apsw c(int i2) throws defpackage.apsu {
        defpackage.apsw apswVar = this.c;
        defpackage.apsw apswVarA = apswVar.e;
        if (apswVarA != null) {
            this.c = apswVarA;
        } else {
            apswVarA = this.a.a();
            apswVar.e = apswVarA;
            this.c = apswVarA;
        }
        this.e = -1;
        if (apswVarA.a == i2) {
            this.f++;
            return apswVarA;
        }
        this.c = apswVar;
        this.m = i2;
        this.k.clear();
        boolean[] zArr = new boolean[49];
        int i3 = this.m;
        if (i3 >= 0) {
            zArr[i3] = true;
            this.m = -1;
        }
        for (int i4 = 0; i4 < 7; i4++) {
            if (this.g[i4] == this.f) {
                for (int i5 = 0; i5 < 32; i5++) {
                    int i6 = 1 << i5;
                    if ((i[i4] & i6) != 0) {
                        zArr[i5] = true;
                    }
                    if ((j[i4] & i6) != 0) {
                        zArr[i5 + 32] = true;
                    }
                }
            }
        }
        for (int i7 = 0; i7 < 49; i7++) {
            if (zArr[i7]) {
                int[] iArr = {i7};
                this.l = iArr;
                this.k.add(iArr);
            }
        }
        int[][] iArr2 = new int[this.k.size()][];
        for (int i8 = 0; i8 < this.k.size(); i8++) {
            iArr2[i8] = (int[]) this.k.get(i8);
        }
        throw new defpackage.apsu(this.c, iArr2, h);
    }
}
