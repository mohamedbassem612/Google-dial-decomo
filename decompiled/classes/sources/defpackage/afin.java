package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afin implements defpackage.afik {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.afik
    public final akdx a() {
        defpackage.akzx akzxVarM = akdv.a.m();
        for (int i = 0; i < this.b; i++) {
            defpackage.akzx akzxVarM2 = akdu.a.m();
            double d = this.a[i];
            akzxVarM2.u();
            akdu akduVar = akzxVarM2.b;
            akduVar.b |= 1;
            akduVar.c = d;
            akzxVarM2.u();
            akdu akduVar2 = akzxVarM2.b;
            akduVar2.b |= 2;
            akduVar2.d = 1L;
            akzxVarM.u();
            akdv akdvVar = akzxVarM.b;
            akdu akduVarR = akzxVarM2.r();
            j$.util.Objects.requireNonNull(akduVarR);
            defpackage.alat alatVar = akdvVar.b;
            if (!alatVar.c()) {
                akdvVar.b = defpackage.alad.J(alatVar);
            }
            akdvVar.b.add(akduVarR);
        }
        defpackage.akzx akzxVarM3 = akdx.a.m();
        akzxVarM3.u();
        akdx akdxVar = akzxVarM3.b;
        akdv akdvVarR = akzxVarM.r();
        j$.util.Objects.requireNonNull(akdvVarR);
        akdxVar.c = akdvVarR;
        akdxVar.b = 3;
        return akzxVarM3.r();
    }

    @Override // defpackage.afik
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        java.lang.Double d = (java.lang.Double) obj;
        int i = this.b + 1;
        double[] dArrCopyOf = this.a;
        int length = dArrCopyOf.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new java.lang.OutOfMemoryError();
                }
                i2 = 2147483639;
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                }
            }
            dArrCopyOf = java.util.Arrays.copyOf(dArrCopyOf, i2);
            this.a = dArrCopyOf;
        }
        dArrCopyOf[this.b] = d.doubleValue();
        this.b++;
    }

    public final java.lang.String toString() {
        return ", count = " + this.b + ", value =" + java.util.Arrays.toString(this.a);
    }
}
