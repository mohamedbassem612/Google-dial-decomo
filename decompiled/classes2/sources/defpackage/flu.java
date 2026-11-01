package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class flu implements defpackage.fma {
    public long a;
    public final defpackage.aizg b;
    public final defpackage.aizg c;

    public flu(long[] jArr, long[] jArr2, long j) {
        defpackage.aizg aizgVar;
        defpackage.aizg aizgVar2;
        int length = jArr.length;
        int length2 = jArr2.length;
        ahvr.bM(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            aizgVar = new defpackage.aizg(length2, (char[]) null);
            this.b = aizgVar;
            aizgVar2 = new defpackage.aizg(length2, (char[]) null);
            this.c = aizgVar2;
        } else {
            int i = length2 + 1;
            aizgVar = new defpackage.aizg(i, (char[]) null);
            this.b = aizgVar;
            aizgVar2 = new defpackage.aizg(i, (char[]) null);
            this.c = aizgVar2;
            aizgVar.j(0L);
            aizgVar2.j(0L);
        }
        aizgVar.k(jArr);
        aizgVar2.k(jArr2);
        this.a = j;
    }

    @Override // defpackage.fma
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        defpackage.aizg aizgVar = this.c;
        if (aizgVar.a == 0) {
            defpackage.fmb fmbVar = defpackage.fmb.a;
            return new defpackage.fly(fmbVar, fmbVar);
        }
        int iAi = eum.ai(aizgVar, j);
        long jI = aizgVar.i(iAi);
        defpackage.aizg aizgVar2 = this.b;
        defpackage.fmb fmbVar2 = new defpackage.fmb(jI, aizgVar2.i(iAi));
        if (fmbVar2.b == j || iAi == aizgVar.a - 1) {
            return new defpackage.fly(fmbVar2, fmbVar2);
        }
        int i = iAi + 1;
        return new defpackage.fly(fmbVar2, new defpackage.fmb(aizgVar.i(i), aizgVar2.i(i)));
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return this.c.a > 0;
    }
}
