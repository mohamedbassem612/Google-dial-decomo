package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aogp {
    public final apoy a;
    defpackage.aogn[] b;
    int c;
    public int d;
    private int e;

    public aogp(apoy apoyVar) {
        defpackage.aogn[] aognVarArr = new defpackage.aogn[8];
        this.b = aognVarArr;
        this.d = aognVarArr.length - 1;
        this.a = apoyVar;
    }

    public final void a(defpackage.aogn aognVar) {
        int i;
        int i2 = aognVar.h;
        if (i2 > 4096) {
            java.util.Arrays.fill(this.b, (java.lang.Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int i3 = (this.e + i2) - 4096;
        if (i3 > 0) {
            int length = this.b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.b[length].h;
                i3 -= i5;
                this.e -= i5;
                this.c--;
                i4++;
                length--;
            }
            defpackage.aogn[] aognVarArr = this.b;
            int i6 = i + 1;
            java.lang.System.arraycopy(aognVarArr, i6, aognVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c + 1;
        defpackage.aogn[] aognVarArr2 = this.b;
        int length2 = aognVarArr2.length;
        if (i7 > length2) {
            defpackage.aogn[] aognVarArr3 = new defpackage.aogn[length2 << 1];
            java.lang.System.arraycopy(aognVarArr2, 0, aognVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = aognVarArr3;
            aognVarArr2 = aognVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        aognVarArr2[i8] = aognVar;
        this.c++;
        this.e += i2;
    }

    final void b(appb appbVar) throws java.io.IOException {
        c(appbVar.c(), 127, 0);
        this.a.I(appbVar);
    }

    final void c(int i, int i2, int i3) throws java.io.IOException {
        apoy apoyVar = this.a;
        if (i < i2) {
            apoyVar.N(i3 | i);
            return;
        }
        apoyVar.N(i3 | i2);
        int i4 = i - i2;
        if (i4 > 268435455) {
            throw new java.io.IOException("Varint would overflow reader");
        }
        while (i4 >= 128) {
            apoyVar.N((i4 & 127) | 128);
            i4 >>>= 7;
        }
        apoyVar.N(i4);
    }
}
