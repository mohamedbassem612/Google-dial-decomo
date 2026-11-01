package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fks {
    public final java.util.List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final java.lang.String l;

    private fks(java.util.List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, java.lang.String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static defpackage.fks a(defpackage.etx etxVar) {
        java.lang.String strF;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            etxVar.R(4);
            int iN = (etxVar.n() & 3) + 1;
            if (iN == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int iN2 = etxVar.n() & 31;
            for (int i9 = 0; i9 < iN2; i9++) {
                arrayList.add(b(etxVar));
            }
            int iN3 = etxVar.n();
            for (int i10 = 0; i10 < iN3; i10++) {
                arrayList.add(b(etxVar));
            }
            if (iN2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = defpackage.evc.a;
                defpackage.evb evbVarG = defpackage.evc.g(bArr2, 5, bArr.length);
                int i11 = evbVarG.e;
                int i12 = evbVarG.f;
                int i13 = evbVarG.h + 8;
                int i14 = evbVarG.i + 8;
                int i15 = evbVarG.j;
                int i16 = evbVarG.k;
                int i17 = evbVarG.l;
                int i18 = evbVarG.m;
                float f2 = evbVarG.g;
                strF = defpackage.ete.f(evbVarG.a, evbVarG.b, evbVarG.c);
                i5 = i17;
                i6 = i18;
                f = f2;
                i4 = i14;
                i7 = i15;
                i8 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                strF = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new defpackage.fks(arrayList, iN, i, i2, i3, i4, i7, i8, i5, i6, f, strF);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw new defpackage.era("Error parsing AVC config", e, true, 1);
        }
    }

    private static byte[] b(defpackage.etx etxVar) {
        int iS = etxVar.s();
        int i = etxVar.c;
        etxVar.R(iS);
        byte[] bArr = etxVar.b;
        byte[] bArr2 = defpackage.ete.a;
        byte[] bArr3 = new byte[iS + 4];
        java.lang.System.arraycopy(defpackage.ete.a, 0, bArr3, 0, 4);
        java.lang.System.arraycopy(bArr, i, bArr3, 4, iS);
        return bArr3;
    }
}
