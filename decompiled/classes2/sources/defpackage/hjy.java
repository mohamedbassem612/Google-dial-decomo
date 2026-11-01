package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hjy implements amyz {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    private final int b;

    public hjy(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.a = obj;
        this.b = i;
    }

    public final java.lang.Object a() {
        aile raiVar;
        int i = this.$cid;
        int i2 = this.b;
        if (i == 0) {
            java.lang.Object obj = this.a;
            if (i2 == 0) {
                defpackage.hjz hjzVar = (defpackage.hjz) obj;
                return anah.a(hjzVar.c, hjzVar.d);
            }
            aihb aihbVarI = aihd.i(2);
            aihbVarI.i(new ahrh());
            aihbVarI.k(((defpackage.hjz) obj).a.hr());
            return aihbVarI.h();
        }
        if (i2 != 0) {
            java.lang.Object obj2 = this.a;
            if (i2 != 1) {
                j$.util.Objects.requireNonNull(new hrc(7));
                defpackage.hqc hqcVar = new defpackage.hqc(8);
                defpackage.hip hipVar = ((defpackage.him) obj2).a;
                return aihd.r(new zjm(new uir(hipVar.li, 6), hqcVar), zjm.h(new wcx(hipVar.lj, 0)));
            }
            raiVar = new aile(zjm.h(new zlk(((defpackage.him) obj2).a.lh, 0)));
        } else {
            raiVar = new rai(this);
        }
        return raiVar;
    }
}
