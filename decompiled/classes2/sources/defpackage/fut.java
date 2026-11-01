package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fut implements defpackage.fvc {
    private final defpackage.fus a;
    private final defpackage.etx b = new defpackage.etx(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public fut(defpackage.fus fusVar) {
        this.a = fusVar;
    }

    @Override // defpackage.fvc
    public final void a(defpackage.etx etxVar, int i) {
        int iN;
        int i2 = i & 1;
        if (i2 != 0) {
            iN = etxVar.c + etxVar.n();
        } else {
            iN = -1;
        }
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            etxVar.Q(iN);
            this.d = 0;
        }
        while (etxVar.d() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iN2 = etxVar.n();
                    etxVar.Q(etxVar.c - 1);
                    if (iN2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = java.lang.Math.min(etxVar.d(), 3 - this.d);
                defpackage.etx etxVar2 = this.b;
                etxVar.L(etxVar2.b, this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    etxVar2.Q(0);
                    etxVar2.P(3);
                    etxVar2.R(1);
                    int iN3 = etxVar2.n();
                    int iN4 = etxVar2.n();
                    this.e = (iN3 & 128) != 0;
                    this.c = (((iN3 & 15) << 8) | iN4) + 3;
                    int iE = etxVar2.e();
                    int i5 = this.c;
                    if (iE < i5) {
                        etxVar2.H(java.lang.Math.min(4098, java.lang.Math.max(i5, etxVar2.e() << 1)));
                    }
                }
            } else {
                int iMin2 = java.lang.Math.min(etxVar.d(), this.c - this.d);
                defpackage.etx etxVar3 = this.b;
                etxVar.L(etxVar3.b, this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        etxVar3.P(i7);
                    } else {
                        if (eum.e(etxVar3.b, 0, i7, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        etxVar3.P(this.c - 4);
                    }
                    etxVar3.Q(0);
                    this.a.a(etxVar3);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.fvc
    public final void b(defpackage.euk eukVar, defpackage.fll fllVar, defpackage.fvb fvbVar) {
        this.a.b(eukVar, fllVar, fvbVar);
        this.f = true;
    }

    @Override // defpackage.fvc
    public final void c() {
        this.f = true;
    }
}
