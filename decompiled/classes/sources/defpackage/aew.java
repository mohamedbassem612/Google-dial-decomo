package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aew extends defpackage.agn {
    public defpackage.cer a;
    public defpackage.aex b;
    public defpackage.czc c;
    public defpackage.czc d;
    public ett g;
    public long e = 0;
    public long f = 0;
    private final defpackage.aonj h = new defpackage.nm(this, 8);
    private final defpackage.aonj i = new defpackage.nm(this, 9);
    private long j = -9223372034707292160L;

    public aew(ett ettVar, defpackage.cer cerVar, defpackage.aex aexVar) {
        this.g = ettVar;
        this.a = cerVar;
        this.b = aexVar;
    }

    public final long a(long j) {
        long j2 = this.j;
        return !defpackage.anty.ah(j2, -9223372034707292160L) ? j2 : j;
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        long j2;
        defpackage.czc czcVarV = cydVar.v(j);
        if (cyiVar.dw()) {
            j2 = (((long) czcVarV.a) << 32) | (((long) czcVarV.b) & 4294967295L);
        } else {
            ett ettVar = this.g;
            if (ettVar == null) {
                j2 = (((long) czcVarV.a) << 32) | (((long) czcVarV.b) & 4294967295L);
                this.j = j2;
            } else {
                long j3 = (((long) czcVarV.a) << 32) | (((long) czcVarV.b) & 4294967295L);
                defpackage.cer cerVarC = ettVar.c(new aev(this, j3, 1), (java.lang.Object) null, (defpackage.aiw) null, new aev(this, j3, 0));
                j2 = ((defpackage.dpp) cerVarC.a()).a;
                this.j = ((defpackage.dpp) cerVarC.a()).a;
            }
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (4294967295L & j2);
        if (cyiVar.dw()) {
            this.c = czcVarV;
            this.e = j2;
            return cyiVar.du(i, i2, defpackage.aokd.a, this.h);
        }
        this.d = czcVarV;
        this.f = j2;
        return cyiVar.du(i, i2, defpackage.aokd.a, this.i);
    }

    @Override // defpackage.cmv
    public final void cZ() {
        this.j = -9223372034707292160L;
    }
}
