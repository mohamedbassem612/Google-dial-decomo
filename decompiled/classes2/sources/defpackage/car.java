package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class car extends java.lang.RuntimeException {
    public final adq a;
    public final adq b;
    public final acm c;
    public final int d;

    public car(adq adqVar, adq adqVar2, acm acmVar, int i, java.lang.Throwable th) {
        super(th);
        this.a = adqVar;
        this.b = adqVar2;
        this.c = acmVar;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.util.List listBZ;
        java.util.List listK = aooc.k(new aoka(new defpackage.caq(this, null), 3));
        aooh.f(listK, "<this>");
        int size = listK.size();
        if (size <= 50) {
            listBZ = ajsz.bZ(listK);
        } else {
            int i = size - 50;
            java.util.ArrayList arrayList = new java.util.ArrayList(50);
            if (listK instanceof java.util.RandomAccess) {
                while (i < size) {
                    arrayList.add(listK.get(i));
                    i++;
                }
            } else {
                java.util.ListIterator listIterator = listK.listIterator(i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            listBZ = arrayList;
        }
        return aoov.n("\n            |Failed to execute op number " + this.d + ":\n            |" + ajsz.cr(listBZ, "\n", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62) + "\n            ");
    }
}
