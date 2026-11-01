package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class czh extends defpackage.dbj {
    public static final defpackage.czh a = new defpackage.czh();

    private czh() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.cye
    public final defpackage.cyf e(defpackage.cyi cyiVar, java.util.List list, long j) {
        int size = list.size();
        if (size == 0) {
            return cyiVar.du(defpackage.dpd.d(j), defpackage.dpd.c(j), defpackage.aokd.a, new bxb(9));
        }
        if (size == 1) {
            defpackage.czc czcVarV = ((defpackage.cyd) list.get(0)).v(j);
            int i = czcVarV.a;
            int iD = defpackage.dpd.d(j);
            int iB = defpackage.dpd.b(j);
            if (i < iD) {
                i = iD;
            }
            if (i <= iB) {
                iB = i;
            }
            int i2 = czcVarV.b;
            int iC = defpackage.dpd.c(j);
            int iA = defpackage.dpd.a(j);
            if (i2 < iC) {
                i2 = iC;
            }
            if (i2 <= iA) {
                iA = i2;
            }
            return cyiVar.du(iB, iA, defpackage.aokd.a, new defpackage.bjp(czcVarV, 17));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            defpackage.czc czcVarV2 = ((defpackage.cyd) list.get(i3)).v(j);
            iMax = java.lang.Math.max(czcVarV2.a, iMax);
            iMax2 = java.lang.Math.max(czcVarV2.b, iMax2);
            arrayList.add(czcVarV2);
        }
        int iD2 = defpackage.dpd.d(j);
        int iB2 = defpackage.dpd.b(j);
        if (iMax < iD2) {
            iMax = iD2;
        }
        if (iMax <= iB2) {
            iB2 = iMax;
        }
        int iC2 = defpackage.dpd.c(j);
        int iA2 = defpackage.dpd.a(j);
        if (iMax2 < iC2) {
            iMax2 = iC2;
        }
        if (iMax2 <= iA2) {
            iA2 = iMax2;
        }
        return cyiVar.du(iB2, iA2, defpackage.aokd.a, new defpackage.clc(arrayList, 16));
    }
}
