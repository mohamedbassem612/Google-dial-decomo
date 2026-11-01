package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fpx implements defpackage.fpt {
    private final defpackage.etx a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public fpx(defpackage.eut eutVar) {
        defpackage.etx etxVar = eutVar.a;
        this.a = etxVar;
        etxVar.Q(12);
        this.c = etxVar.q() & 255;
        this.b = etxVar.q();
    }

    @Override // defpackage.fpt
    public final int a() {
        return -1;
    }

    @Override // defpackage.fpt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fpt
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.n();
        }
        if (i == 16) {
            return this.a.s();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iN = this.a.n();
        this.e = iN;
        return (iN & 240) >> 4;
    }
}
