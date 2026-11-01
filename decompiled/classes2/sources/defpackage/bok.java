package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bok implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bok(long j, aonn aonnVar, int i) {
        this.$cid = i;
        this.a = j;
        this.b = aonnVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aonn, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return boq.a(this.a, (aonn) this.b, (cav) obj, ((java.lang.Integer) obj2).intValue());
        }
        if (i == 1) {
            return boq.a(this.a, (aonn) this.b, (cav) obj, ((java.lang.Integer) obj2).intValue());
        }
        if (i == 2) {
            cav cavVar = (cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            if (cavVar.H(i2 != 2, iIntValue & 1)) {
                aaoo.V(aehj.aM((defpackage.abja) this.b, cavVar), (java.lang.String) null, azm.p(cmw.c), this.a, cavVar, 392, 0);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            java.lang.Object obj3 = this.b;
            long j = den.ak(cavVar2).A;
            boolean zB = cavVar2.B(obj3) | cavVar2.A(j);
            java.lang.Object objG = cavVar2.g();
            if (zB || objG == cau.a) {
                objG = new aev(obj3, j, 11);
                cavVar2.w(objG);
            }
            afsq.bm(afsq.bl((aonj) objG), vn.b(den.aZ(cmw.c, 16.0f, 8.0f)), this.a, 0L, (dot) null, 0, false, 0, den.an(cavVar2).j, cavVar2, 0, 504);
        } else {
            cavVar2.s();
        }
        return aojh.a;
    }

    public /* synthetic */ bok(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }
}
