package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fqd {
    public final defpackage.fmk a;
    public defpackage.fqq d;
    public defpackage.fqa e;
    public int f;
    public int g;
    public int h;
    public int i;
    public defpackage.eqg j;
    public defpackage.eqg k;
    public boolean l;
    public final defpackage.fqp b = new defpackage.fqp();
    public final defpackage.etx c = new defpackage.etx();
    private final defpackage.etx m = new defpackage.etx(1);
    private final defpackage.etx n = new defpackage.etx();

    public fqd(defpackage.fmk fmkVar, defpackage.fqq fqqVar, defpackage.fqa fqaVar, defpackage.eqg eqgVar) {
        this.a = fmkVar;
        this.d = fqqVar;
        this.e = fqaVar;
        this.k = eqgVar;
        if (defpackage.fli.g(eqgVar.p)) {
            this.j = eqgVar;
        }
        e(fqqVar, fqaVar);
    }

    public final int a() {
        int i;
        if (this.l) {
            i = this.b.j[this.f] ? 1 : 0;
        } else {
            i = this.d.g[this.f];
        }
        return d() != null ? i | 1073741824 : i;
    }

    public final int b(int i, int i2) {
        defpackage.etx etxVar;
        defpackage.fqo fqoVarD = d();
        if (fqoVarD == null) {
            return 0;
        }
        int i3 = fqoVarD.d;
        if (i3 != 0) {
            etxVar = this.b.n;
        } else {
            byte[] bArr = fqoVarD.e;
            java.lang.String str = eum.a;
            defpackage.etx etxVar2 = this.n;
            int length = bArr.length;
            etxVar2.O(bArr, length);
            etxVar = etxVar2;
            i3 = length;
        }
        defpackage.fqp fqpVar = this.b;
        boolean zC = fqpVar.c(this.f);
        boolean z = zC || i2 != 0;
        defpackage.etx etxVar3 = this.m;
        etxVar3.b[0] = (byte) ((true != z ? 0 : 128) | i3);
        etxVar3.Q(0);
        defpackage.fmk fmkVar = this.a;
        fmkVar.c(etxVar3, 1, 1);
        fmkVar.c(etxVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zC) {
            defpackage.etx etxVar4 = this.c;
            etxVar4.M(8);
            byte[] bArr2 = etxVar4.b;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            fmkVar.c(etxVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        defpackage.etx etxVar5 = fqpVar.n;
        int iS = etxVar5.s();
        etxVar5.R(-2);
        int i5 = (iS * 6) + 2;
        if (i2 != 0) {
            defpackage.etx etxVar6 = this.c;
            etxVar6.M(i5);
            byte[] bArr3 = etxVar6.b;
            etxVar5.L(bArr3, 0, i5);
            int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
            etxVar5 = etxVar6;
        }
        fmkVar.c(etxVar5, i5, 1);
        return i4 + i5;
    }

    public final long c() {
        return !this.l ? this.d.c[this.f] : this.b.f[this.h];
    }

    public final defpackage.fqo d() {
        if (!this.l) {
            return null;
        }
        defpackage.fqp fqpVar = this.b;
        defpackage.fqa fqaVar = fqpVar.a;
        java.lang.String str = eum.a;
        int i = fqaVar.a;
        defpackage.fqo fqoVarA = fqpVar.m;
        if (fqoVarA == null) {
            fqoVarA = this.d.a.a(i);
        }
        if (fqoVarA == null || !fqoVarA.a) {
            return null;
        }
        return fqoVarA;
    }

    public final void e(defpackage.fqq fqqVar, defpackage.fqa fqaVar) {
        this.d = fqqVar;
        this.e = fqaVar;
        if (this.j == null) {
            this.a.p(this.k);
        }
        f();
    }

    public final void f() {
        defpackage.fqp fqpVar = this.b;
        fqpVar.d = 0;
        fqpVar.p = 0L;
        fqpVar.q = false;
        fqpVar.k = false;
        fqpVar.o = false;
        fqpVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }

    public final boolean g() {
        this.f++;
        if (this.l) {
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
        }
        return false;
    }
}
