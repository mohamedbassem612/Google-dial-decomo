package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bvz implements crd {
    private final ccp a;
    private final crd b;
    private final crd c;
    private final cpx d = new cpx((byte[]) null);
    private final cpx e = new cpx((byte[]) null);
    private final cpx f = new cpx((byte[]) null);

    public bvz(ccp ccpVar, crd crdVar, crd crdVar2) {
        this.a = ccpVar;
        this.b = crdVar;
        this.c = crdVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final cqx a(long j, dpq dpqVar, dpf dpfVar) throws aois {
        cpx cpxVar = this.d;
        cpxVar.k();
        cpx cpxVar2 = this.e;
        cpxVar2.k();
        cpx cpxVar3 = this.f;
        cpxVar3.k();
        cqu cquVarA = this.b.a(j, dpqVar, dpfVar);
        boolean z = cquVarA instanceof cqu;
        cqu cquVarA2 = this.c.a(j, dpqVar, dpfVar);
        if (z) {
            cpxVar.s(cquVarA.a);
        } else if (cquVarA instanceof cqw) {
            cpxVar.q(((cqw) cquVarA).a, 1);
        } else {
            if (!(cquVarA instanceof cqv)) {
                throw new aois();
            }
            cpxVar.t(((cqv) cquVarA).a);
        }
        cpxVar3.s(cquVarA2.a);
        cpxVar3.n(((cqt) this.a.a()).a);
        cpxVar2.r(cpxVar, cpxVar3, 2);
        return new cqu(cpxVar2);
    }
}
