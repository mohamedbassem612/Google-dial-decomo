package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnu extends defpackage.fnr {
    @Override // defpackage.fnr
    protected final defpackage.eqy b(defpackage.fnp fnpVar, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        defpackage.etv etvVar = new defpackage.etv(byteBuffer.array(), byteBuffer.limit());
        etvVar.n(12);
        int iB = etvVar.b() + etvVar.d(12);
        etvVar.n(44);
        etvVar.o(etvVar.d(12));
        etvVar.n(16);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (etvVar.b() < iB - 4) {
            etvVar.n(48);
            int iD = etvVar.d(8);
            etvVar.n(4);
            int iB2 = etvVar.b() + etvVar.d(12);
            java.lang.String strF = null;
            java.lang.String strF2 = null;
            while (etvVar.b() < iB2) {
                int iD2 = etvVar.d(8);
                int iD3 = etvVar.d(8);
                int iB3 = etvVar.b() + iD3;
                if (iD2 == 2) {
                    int iD4 = etvVar.d(16);
                    etvVar.n(8);
                    if (iD4 == 3) {
                        while (etvVar.b() < iB3) {
                            strF = etvVar.f(etvVar.d(8), java.nio.charset.StandardCharsets.US_ASCII);
                            int iD5 = etvVar.d(8);
                            for (int i = 0; i < iD5; i++) {
                                etvVar.o(etvVar.d(8));
                            }
                        }
                    }
                } else if (iD2 == 21) {
                    strF2 = etvVar.f(iD3, java.nio.charset.StandardCharsets.US_ASCII);
                }
                etvVar.l(iB3 << 3);
            }
            etvVar.l(iB2 << 3);
            if (strF != null && strF2 != null) {
                arrayList.add(new defpackage.fnt(iD, strF.concat(strF2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new defpackage.eqy(arrayList);
    }
}
