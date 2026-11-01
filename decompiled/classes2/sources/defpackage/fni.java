package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fni extends defpackage.fnh {
    private final defpackage.etx a;
    private final defpackage.etx b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;

    public fni(defpackage.fmk fmkVar) {
        super(fmkVar);
        this.a = new defpackage.etx(defpackage.evc.a);
        this.b = new defpackage.etx(4);
    }

    @Override // defpackage.fnh
    protected final boolean a(defpackage.etx etxVar) throws defpackage.fng {
        int iN = etxVar.n();
        int i = iN >> 4;
        int i2 = iN & 15;
        if (i2 != 7) {
            throw new defpackage.fng(a.bj(i2, "Video format not supported: "));
        }
        this.g = i;
        return i != 5;
    }

    @Override // defpackage.fnh
    protected final boolean b(defpackage.etx etxVar, long j) {
        int i;
        int iN = etxVar.n();
        etxVar.I(3);
        byte[] bArr = etxVar.b;
        int i2 = etxVar.c;
        int i3 = i2 + 1;
        etxVar.c = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        etxVar.c = i5;
        int i6 = bArr[i3] & 255;
        etxVar.c = i2 + 3;
        int i7 = bArr[i5] & 255;
        if (iN == 0) {
            if (this.e) {
                return false;
            }
            defpackage.etx etxVar2 = new defpackage.etx(new byte[etxVar.d()]);
            etxVar.L(etxVar2.b, 0, etxVar.d());
            defpackage.fks fksVarA = defpackage.fks.a(etxVar2);
            this.c = fksVarA.b;
            defpackage.eqf eqfVar = new defpackage.eqf();
            eqfVar.a("video/x-flv");
            eqfVar.c("video/avc");
            eqfVar.j = fksVarA.l;
            eqfVar.t = fksVarA.c;
            eqfVar.u = fksVarA.d;
            eqfVar.A = fksVarA.k;
            eqfVar.q = fksVarA.a;
            this.d.p(new defpackage.eqg(eqfVar));
            this.e = true;
            return false;
        }
        if (iN != 1 || !this.e) {
            return false;
        }
        int i8 = this.g == 1 ? 1 : 0;
        if (this.f) {
            i = i8;
        } else {
            if (i8 == 0) {
                return false;
            }
            i = 1;
        }
        defpackage.etx etxVar3 = this.b;
        byte[] bArr2 = etxVar3.b;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i9 = 4 - this.c;
        int i10 = 0;
        while (etxVar.d() > 0) {
            etxVar.L(etxVar3.b, i9, this.c);
            etxVar3.Q(0);
            int iQ = etxVar3.q();
            defpackage.etx etxVar4 = this.a;
            etxVar4.Q(0);
            defpackage.fmk fmkVar = this.d;
            fmkVar.b(etxVar4, 4);
            fmkVar.b(etxVar, iQ);
            i10 = i10 + 4 + iQ;
        }
        this.d.d(j + (((long) (((i4 << 24) >> 8) | (i6 << 8) | i7)) * 1000), i, i10, 0, null);
        this.f = true;
        return true;
    }
}
