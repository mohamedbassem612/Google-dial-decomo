package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class boz implements crd {
    private final long a;

    public boz(long j) {
        this.a = j;
    }

    public final cqx a(long j, dpq dpqVar, dpf dpfVar) {
        cpx cpxVar = new cpx((byte[]) null);
        long j2 = this.a;
        float fDl = dpfVar.dl(dpk.b(j2));
        float fDl2 = dpfVar.dl(dpk.a(j2));
        cpxVar.f(0.0f, 0.0f);
        cpxVar.e(fDl / 2.0f, 0.0f);
        cpxVar.e(0.0f, fDl2);
        cpxVar.e((-fDl) / 2.0f, 0.0f);
        cpxVar.c();
        return new cqu(cpxVar);
    }
}
