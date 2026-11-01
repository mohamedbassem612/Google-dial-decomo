package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aas implements java.lang.AutoCloseable {
    public final java.util.ArrayDeque a;
    private java.lang.String[] b;

    private aas(java.lang.Object obj, java.lang.String str, java.util.ArrayDeque arrayDeque) {
        this.a = arrayDeque;
        if (obj != null) {
            defpackage.aar aarVar = new defpackage.aar(obj, str);
            arrayDeque.addFirst(aarVar);
            if (android.util.Log.isLoggable("CarApp.Bun", 2)) {
                int size = arrayDeque.size();
                int i = 11;
                int iMin = java.lang.Math.min(size, 11);
                java.lang.String[] strArr = this.b;
                if (strArr == null) {
                    strArr = new java.lang.String[12];
                    this.b = strArr;
                }
                java.lang.String strConcat = strArr[iMin];
                if (strConcat == null) {
                    char[] cArr = new char[iMin];
                    java.util.Arrays.fill(cArr, ' ');
                    java.lang.String str2 = new java.lang.String(cArr);
                    if (iMin == 11) {
                        strConcat = str2.concat("...");
                    } else {
                        i = iMin;
                        strConcat = str2;
                    }
                    this.b[i] = strConcat;
                }
                android.util.Log.v("CarApp.Bun", strConcat.concat(defpackage.aau.e(aarVar.a.getClass()) + ' ' + aarVar.b));
            }
        }
    }

    public static defpackage.aas a() {
        return new defpackage.aas(null, "", new java.util.ArrayDeque());
    }

    static defpackage.aas b(java.lang.Object obj, java.lang.String str, defpackage.aas aasVar) {
        return new defpackage.aas(obj, str, aasVar.a);
    }

    final java.lang.String c() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayDeque arrayDeque = this.a;
        int iMin = java.lang.Math.min(arrayDeque.size(), 8);
        java.util.Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            int i = iMin - 1;
            if (iMin <= 0) {
                break;
            }
            sb.append(((defpackage.aar) itDescendingIterator.next()).a());
            iMin = i;
        }
        if (itDescendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.removeFirst();
    }
}
