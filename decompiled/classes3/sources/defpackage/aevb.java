package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aevb extends aevp {
    private final java.util.Random c;
    private final aevn d;
    private final aeuy e;
    private final aizr f;

    public aevb(apga apgaVar, aevn aevnVar, java.util.Random random, aeuy aeuyVar, aizr aizrVar) {
        super(aevnVar.c > 0, apgaVar);
        this.c = random;
        this.d = aevnVar;
        this.e = aeuyVar;
        this.f = aizrVar;
    }

    public final apga b(aevn aevnVar) {
        return ((aevp) this).a ? f(aevnVar) : e();
    }

    public final aevn d(java.lang.String str) {
        aevn aevnVar = this.d;
        if (!ahvr.cp(str)) {
            aeuy aeuyVar = this.e;
            long epochMilli = this.f.a().toEpochMilli() - aeuyVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long jMin = java.lang.Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = aeuyVar.a;
                    int i2 = (int) jMin;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = aeuyVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                aeuyVar.d += j * 14400000;
            }
            int iHashCode = str.hashCode() * aeuyVar.c;
            char cCharAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = iHashCode >>> 24;
            int length = (iHashCode >>> 16) + str.length();
            short[] sArr3 = aeuyVar.a;
            short[] sArr4 = aeuyVar.b;
            int i4 = (i3 + cCharAt) & 255;
            int i5 = length & 255;
            int iMin = java.lang.Math.min((int) sArr3[i4], (int) sArr4[i5]);
            int i6 = iMin + 1;
            short sMin = (short) java.lang.Math.min(32767, i6);
            if (sArr3[i4] == iMin) {
                sArr3[i4] = sMin;
            }
            if (sArr4[i5] == iMin) {
                sArr4[i5] = sMin;
            }
            double dSqrt = i6;
            if (i6 < 50) {
                dSqrt = java.lang.Math.sqrt(dSqrt);
            }
            aevnVar = new aevn((int) (((double) aevnVar.c) / dSqrt), aevnVar.d);
        }
        return !aevnVar.d(this.c.nextDouble()) ? aevn.b : aevnVar;
    }

    public final apga f(aevn aevnVar) {
        if (aevnVar == null || aevnVar.equals(this.d)) {
            return this.b;
        }
        akzx akzxVarM = apga.a.m();
        int iAM = a.aM(this.b.e);
        if (iAM == 0) {
            iAM = 1;
        }
        akzxVarM.u();
        apga apgaVar = akzxVarM.b;
        apgaVar.e = iAM - 1;
        apgaVar.b |= 2;
        aevnVar.h(akzxVarM);
        return akzxVarM.p();
    }
}
