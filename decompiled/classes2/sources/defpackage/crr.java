package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class crr extends crs {
    private final csb a;
    private final csb b;
    private final float[] c;

    public crr(csb csbVar, csb csbVar2) {
        float[] fArrX;
        super(csbVar2, csbVar, csbVar2);
        this.a = csbVar;
        this.b = csbVar2;
        if (cfd.u(csbVar.d, csbVar2.d)) {
            fArrX = cfd.x(csbVar2.j, csbVar.i);
        } else {
            float[] fArr = csbVar.i;
            float[] fArr2 = csbVar2.j;
            float[] fArrA = csbVar.d.a();
            float[] fArrA2 = csbVar2.d.a();
            csd csdVar = csbVar.d;
            csd csdVar2 = crv.a;
            csd csdVar3 = crv.b;
            fArrX = cfd.x(cfd.u(csbVar2.d, csdVar3) ? fArr2 : cfd.w(cfd.x(cfd.v(crl.b.c, fArrA2, crv.a()), csbVar2.i)), cfd.u(csdVar, csdVar3) ? fArr : cfd.x(cfd.v(crl.b.c, fArrA, crv.a()), csbVar.i));
        }
        this.c = fArrX;
    }

    public final long a(long j) {
        double d = cqg.d(j);
        float fC = cqg.c(j);
        float fB = cqg.b(j);
        cru cruVar = this.a.p;
        float fA = (float) cruVar.a(d);
        float fA2 = (float) cruVar.a(fC);
        float fA3 = (float) cruVar.a(fB);
        float[] fArr = this.c;
        float f = fArr[0] * fA;
        float f2 = fArr[3] * fA2;
        float f3 = fArr[6] * fA3;
        float f4 = fArr[1] * fA;
        float f5 = fArr[4] * fA2;
        float f6 = fArr[7] * fA3;
        float f7 = fArr[2] * fA;
        float f8 = fArr[5] * fA2;
        float f9 = fArr[8] * fA3;
        csb csbVar = this.b;
        cru cruVar2 = csbVar.m;
        return cfd.N((float) cruVar2.a(f + f2 + f3), (float) cruVar2.a(f4 + f5 + f6), (float) cruVar2.a(f7 + f8 + f9), cqg.a(j), csbVar);
    }
}
