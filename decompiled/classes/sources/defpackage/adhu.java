package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adhu implements java.lang.Iterable {
    private final java.util.ArrayList a;

    public adhu(defpackage.adhu adhuVar) {
        this.a = new java.util.ArrayList(adhuVar.a);
    }

    public final void a(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.a;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (((defpackage.ahyo) arrayList.get(i)).a.equals(obj)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            if (((java.lang.Integer) ((defpackage.ahyo) arrayList.get(i)).b).intValue() == 0) {
                return;
            } else {
                arrayList.remove(i);
            }
        }
        int i2 = 0;
        while (i2 < arrayList.size() && ((java.lang.Integer) ((defpackage.ahyo) arrayList.get(i2)).b).intValue() <= 0) {
            i2++;
        }
        arrayList.add(i2, new defpackage.ahyo(obj, 0));
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.aiib(this.a.iterator(), new defpackage.adcu(7));
    }

    public adhu() {
        this.a = new java.util.ArrayList();
    }
}
