package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dgd extends defpackage.eoa {
    public final defpackage.aco a;

    public dgd() {
        defpackage.aco acoVar = defpackage.acp.a;
        this.a = new defpackage.aco(6);
    }

    @Override // defpackage.eoa
    protected final void d() {
        int i;
        defpackage.aco acoVar = this.a;
        int[] iArr = acoVar.b;
        java.lang.Object[] objArr = acoVar.c;
        long[] jArr = acoVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        int i6 = iArr[i5];
                        defpackage.adq adqVar = (defpackage.adq) objArr[i5];
                        java.lang.Object[] objArr2 = adqVar.a;
                        int i7 = adqVar.b;
                        for (int i8 = 0; i8 < i7; i8++) {
                            defpackage.dgc dgcVar = (defpackage.dgc) objArr2[i8];
                            dgcVar.a(null);
                            defpackage.cjn cjnVar = dgcVar.a.a;
                            cjnVar.b = true;
                            cjnVar.a = false;
                            cjnVar.b();
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }
}
