package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anoa {
    private static final java.lang.Object[][] a = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, 0, 2);
    private java.util.List b;
    private final defpackage.anlw c = defpackage.anlw.a;
    private java.lang.Object[][] d = a;

    public final defpackage.anoc a() {
        return new defpackage.anoc(this.b, this.c, this.d);
    }

    public final void b(defpackage.anob anobVar, java.lang.Object obj) {
        int length = 0;
        while (true) {
            java.lang.Object[][] objArr = this.d;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (anobVar.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            java.lang.Object[][] objArr2 = this.d;
            int length2 = objArr2.length;
            java.lang.Object[][] objArr3 = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, length2 + 1, 2);
            java.lang.System.arraycopy(objArr2, 0, objArr3, 0, length2);
            this.d = objArr3;
            length = objArr3.length - 1;
        }
        this.d[length] = new java.lang.Object[]{anobVar, obj};
    }

    public final void c(java.util.List list) {
        ahvr.bN(!list.isEmpty(), "addrs is empty");
        this.b = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
    }
}
