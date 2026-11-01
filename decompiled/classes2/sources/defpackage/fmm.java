package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmm {
    public static final defpackage.aizh a = new defpackage.aizh(new int[]{0, 2, 1});
    public static final defpackage.aizh b = new defpackage.aizh(new int[]{0, 2, 1, 3, 4});
    public static final defpackage.aizh c = new defpackage.aizh(new int[]{0, 2, 1, 5, 3, 4});
    public static final defpackage.aizh d = defpackage.aizh.f(2, 1, 6, 5, 3, 4);
    public static final defpackage.aizh e = defpackage.aizh.f(2, 1, 7, 5, 6, 3, 4);

    public static defpackage.eqy a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = (java.lang.String) list.get(i);
            java.lang.String str2 = eum.a;
            java.lang.String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                defpackage.etr.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(java.lang.String.valueOf(str)));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(defpackage.fnx.d(new defpackage.etx(android.util.Base64.decode(strArrSplit[1], 0))));
                } catch (java.lang.RuntimeException e2) {
                    defpackage.etr.g("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new defpackage.foy(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new defpackage.eqy(arrayList);
    }

    public static aify b(byte[] bArr) {
        defpackage.etx etxVar = new defpackage.etx(bArr);
        etxVar.R(1);
        int i = 0;
        while (etxVar.d() > 0 && etxVar.h() == 255) {
            etxVar.R(1);
            i += 255;
        }
        int iN = i + etxVar.n();
        int i2 = 0;
        while (etxVar.d() > 0 && etxVar.h() == 255) {
            etxVar.R(1);
            i2 += 255;
        }
        int iN2 = i2 + etxVar.n();
        byte[] bArr2 = new byte[iN];
        int i3 = etxVar.c;
        java.lang.System.arraycopy(bArr, i3, bArr2, 0, iN);
        int i4 = i3 + iN + iN2;
        int length = bArr.length - i4;
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(bArr, i4, bArr3, 0, length);
        return aify.q(bArr2, bArr3);
    }
}
