package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fpr {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final defpackage.etx f;
    private final defpackage.etx g;
    private int h;
    private int i;

    public fpr(defpackage.etx etxVar, defpackage.etx etxVar2, boolean z) throws defpackage.era {
        this.g = etxVar;
        this.f = etxVar2;
        this.e = z;
        etxVar2.Q(12);
        this.a = etxVar2.q();
        etxVar.Q(12);
        this.i = etxVar.q();
        defpackage.hgu.am(etxVar.i() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        defpackage.etx etxVar = this.f;
        this.d = z ? etxVar.x() : etxVar.w();
        if (this.b != this.h) {
            return true;
        }
        defpackage.etx etxVar2 = this.g;
        this.c = etxVar2.q();
        etxVar2.R(4);
        int i2 = this.i - 1;
        this.i = i2;
        this.h = i2 > 0 ? (-1) + etxVar2.q() : -1;
        return true;
    }
}
