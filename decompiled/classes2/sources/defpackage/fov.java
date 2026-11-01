package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fov extends defpackage.fnr {
    private final defpackage.etx a = new defpackage.etx();
    private final defpackage.etv b = new defpackage.etv();
    private defpackage.euk c;

    @Override // defpackage.fnr
    protected final defpackage.eqy b(defpackage.fnp fnpVar, java.nio.ByteBuffer byteBuffer) {
        defpackage.eqx fouVar;
        long j;
        defpackage.euk eukVar = this.c;
        if (eukVar == null || fnpVar.h != eukVar.f()) {
            defpackage.euk eukVar2 = new defpackage.euk(fnpVar.f);
            this.c = eukVar2;
            eukVar2.a(fnpVar.f - fnpVar.h);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        defpackage.etx etxVar = this.a;
        etxVar.O(bArrArray, iLimit);
        defpackage.etv etvVar = this.b;
        etvVar.k(bArrArray, iLimit);
        etvVar.n(39);
        long jD = etvVar.d(1);
        long jD2 = etvVar.d(32);
        etvVar.n(20);
        int iD = etvVar.d(12);
        int iD2 = etvVar.d(8);
        etxVar.R(14);
        long j2 = (jD << 32) | jD2;
        if (iD2 == 0) {
            fouVar = new defpackage.fou();
        } else if (iD2 == 255) {
            long jW = etxVar.w();
            int i = iD - 4;
            etxVar.L(new byte[i], 0, i);
            fouVar = new defpackage.fot(jW, j2);
        } else if (iD2 == 4) {
            int iN = etxVar.n();
            java.util.ArrayList arrayList = new java.util.ArrayList(iN);
            for (int i2 = 0; i2 < iN; i2++) {
                etxVar.w();
                int iN2 = etxVar.n() & 128;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (iN2 == 0) {
                    int iN3 = etxVar.n();
                    int i3 = iN3 & 64;
                    int i4 = iN3 & 32;
                    if (i3 != 0) {
                        etxVar.w();
                    } else {
                        int iN4 = etxVar.n();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(iN4);
                        for (int i5 = 0; i5 < iN4; i5++) {
                            etxVar.n();
                            etxVar.w();
                            arrayList3.add(new defpackage.fsu());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (i4 != 0) {
                        etxVar.n();
                        etxVar.w();
                    }
                    etxVar.s();
                    etxVar.n();
                    etxVar.n();
                }
                arrayList.add(new defpackage.fsu(arrayList2));
            }
            fouVar = new defpackage.fou(arrayList);
        } else if (iD2 == 5) {
            defpackage.euk eukVar3 = this.c;
            etxVar.w();
            int iN5 = etxVar.n() & 128;
            java.util.List list = java.util.Collections.EMPTY_LIST;
            if (iN5 == 0) {
                int iN6 = etxVar.n();
                boolean z = (iN6 & 64) != 0;
                int i6 = iN6 & 32;
                boolean z2 = (iN6 & 16) != 0;
                long jD3 = (!z || z2) ? -9223372036854775807L : defpackage.fox.d(etxVar, j2);
                if (!z) {
                    int iN7 = etxVar.n();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(iN7);
                    int i7 = 0;
                    while (i7 < iN7) {
                        etxVar.n();
                        eukVar3.b(!z2 ? defpackage.fox.d(etxVar, j2) : -9223372036854775807L);
                        arrayList4.add(new defpackage.fsu());
                        i7++;
                        z2 = z2;
                    }
                    list = arrayList4;
                }
                if (i6 != 0) {
                    etxVar.n();
                    etxVar.w();
                }
                etxVar.s();
                etxVar.n();
                etxVar.n();
                j = jD3;
            } else {
                j = -9223372036854775807L;
            }
            fouVar = new defpackage.fow(j, eukVar3.b(j), list);
        } else if (iD2 != 6) {
            fouVar = null;
        } else {
            defpackage.euk eukVar4 = this.c;
            long jD4 = defpackage.fox.d(etxVar, j2);
            fouVar = new defpackage.fox(jD4, eukVar4.b(jD4));
        }
        return fouVar == null ? new defpackage.eqy(-9223372036854775807L, new defpackage.eqx[0]) : new defpackage.eqy(-9223372036854775807L, fouVar);
    }
}
