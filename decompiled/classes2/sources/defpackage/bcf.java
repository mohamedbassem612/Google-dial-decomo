package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bcf {
    final /* synthetic */ vx a;
    private final int b;
    private final int c;
    private final defpackage.bcd d;
    private final defpackage.bch e;
    private final vx f;

    public bcf(vx vxVar, int i, int i2, defpackage.bcd bcdVar, defpackage.bch bchVar) {
        this.a = vxVar;
        this.f = vxVar;
        this.b = i;
        this.c = i2;
        this.d = bcdVar;
        this.e = bchVar;
    }

    public final int a(int i) {
        defpackage.bch bchVar = this.e;
        int i2 = bchVar.g;
        return bchVar.c(i);
    }

    public final long b(int i, int i2) {
        int i3;
        vx vxVar = this.f;
        if (i2 == 1) {
            i3 = ((int[]) vxVar.b)[i];
        } else {
            int[] iArr = (int[]) vxVar.a;
            int i4 = (i2 + i) - 1;
            i3 = (iArr[i4] + ((int[]) vxVar.b)[i4]) - iArr[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        return dpe.f(i3, i3, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final defpackage.bce c(int i) {
        int i2;
        amwp amwpVarD = this.e.d(i);
        ?? r5 = amwpVarD.b;
        int size = r5.size();
        int i3 = 0;
        if (size != 0) {
            i2 = amwpVarD.a + size == this.b ? 0 : this.c;
        } else {
            size = 0;
            i2 = 0;
        }
        defpackage.bcc[] bccVarArr = new defpackage.bcc[size];
        int i4 = 0;
        while (i3 < size) {
            int i5 = (int) ((defpackage.bbl) r5.get(i3)).a;
            int i6 = i2;
            defpackage.bcc bccVarC = this.d.c(amwpVarD.a + i3, b(i4, i5), i4, i5, i6);
            i4 += i5;
            bccVarArr[i3] = bccVarC;
            i3++;
            i2 = i6;
        }
        return new defpackage.bce(i, bccVarArr, this.a, r5, i2);
    }
}
