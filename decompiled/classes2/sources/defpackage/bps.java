package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bps implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ bps(long j, java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = j;
        this.b = obj;
        this.c = obj2;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        int i2 = 2;
        if (i == 0) {
            cav cavVar = (cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i3 = iIntValue & 3;
            if (cavVar.H(i3 != 2, iIntValue & 1)) {
                den.af(this.a, (dkz) this.b, cfo.j(-1767363041, new axo(this.c, 19), cavVar), cavVar, 384);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        int i4 = 9;
        if (i == 1) {
            cav cavVar2 = (cav) obj;
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                den.af(this.a, den.an(cavVar2).m, cfo.j(-2115100680, new defpackage.awu(this.b, this.c, i4), cavVar2), cavVar2, 384);
            } else {
                cavVar2.s();
            }
            return aojh.a;
        }
        if (i != 2) {
            cav cavVar3 = (cav) obj;
            int iIntValue3 = ((java.lang.Integer) obj2).intValue();
            int i5 = iIntValue3 & 3;
            int i6 = iIntValue3 & 1;
            defpackage.bvf bvfVar = defpackage.bvf.a;
            if (cavVar3.H(i5 != 2, i6)) {
                den.af(this.a, den.an(cavVar3).m, cfo.j(-772984570, new defpackage.awu(this.b, this.c, 17), cavVar3), cavVar3, 384);
            } else {
                cavVar3.s();
            }
            return aojh.a;
        }
        cav cavVar4 = (cav) obj;
        int iIntValue4 = ((java.lang.Integer) obj2).intValue();
        if (cavVar4.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
            java.lang.Object obj3 = this.b;
            long j = this.a;
            ayy ayyVar = bnj.a;
            bni bniVarC = bnj.b(den.ak(cavVar4)).c(cfd.S(), j, cfd.S(), cfd.S());
            boolean zB = cavVar4.B(obj3);
            java.lang.Object objG = cavVar4.g();
            if (zB || objG == cau.a) {
                objG = new defpackage.bup(obj3, i2);
                cavVar4.w(objG);
            }
            den.aq((aomy) objG, (cmw) null, false, (crd) null, bniVarC, (ayy) null, cfo.j(521110564, new defpackage.ant(this.c, i4), cavVar4), cavVar4, 805306368, 494);
        } else {
            cavVar4.s();
        }
        return aojh.a;
    }
}
