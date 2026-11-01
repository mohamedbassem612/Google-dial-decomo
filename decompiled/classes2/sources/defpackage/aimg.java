package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class aimg {
    public static final ahyc c = new acen(13);

    public static defpackage.aimg d(java.lang.Iterable iterable, defpackage.aimn aimnVar) {
        aifi aifiVar = new aifi();
        defpackage.aima aimaVar = new defpackage.aima(aifiVar);
        ailk ailkVarY = ((aify) iterable).y(0);
        while (ailkVarY.hasNext()) {
            aimnVar.a(ailkVarY.next(), aimaVar);
        }
        return new defpackage.aimc(new defpackage.aijt(aifiVar), aimnVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    public static defpackage.aimg e(java.lang.Iterable iterable, ahyc ahycVar) {
        defpackage.aimf aimfVar;
        defpackage.aime aimeVar = new defpackage.aime(ahycVar);
        aify aifyVar = (aify) iterable;
        ailk ailkVarY = aifyVar.y(0);
        loop0: while (true) {
            aimfVar = null;
            if (!ailkVarY.hasNext()) {
                break;
            }
            defpackage.aizh aizhVar = (defpackage.aizh) ahycVar.apply(ailkVarY.next());
            for (int i = 0; i < aizhVar.c; i++) {
                if ((aizhVar.a(i) & (-128)) != 0) {
                    aimeVar = null;
                    break loop0;
                }
            }
        }
        if (aimeVar != null) {
            return aimeVar;
        }
        int[] iArr = new int[256];
        iArr[0] = 1;
        ailk ailkVarY2 = aifyVar.y(0);
        while (ailkVarY2.hasNext()) {
            defpackage.aizh aizhVar2 = (defpackage.aizh) ahycVar.apply(ailkVarY2.next());
            for (int i2 = 0; i2 < aizhVar2.c; i2++) {
                int iA = aizhVar2.a(i2);
                int i3 = iA & 255;
                int i4 = iArr[i3];
                if (i4 != iA) {
                    if ((i4 & 255) == i3) {
                        return aimfVar != null ? aimfVar : d(iterable, new defpackage.ailz(ahycVar));
                    }
                    iArr[i3] = iA;
                }
            }
        }
        aimfVar = new defpackage.aimf(iArr, ahycVar);
        if (aimfVar != null) {
        }
    }

    public abstract int a();

    public abstract defpackage.aizh b(java.lang.Object obj);
}
