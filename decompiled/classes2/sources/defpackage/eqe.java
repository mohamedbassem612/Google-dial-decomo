package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqe {
    public static final boolean a;
    private static final android.util.SparseBooleanArray b;
    private static final android.util.SparseBooleanArray c;

    static {
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
        b = sparseBooleanArray;
        sparseBooleanArray.put(1, false);
        sparseBooleanArray.put(2, false);
        sparseBooleanArray.put(4, false);
        sparseBooleanArray.put(5, false);
        sparseBooleanArray.put(6, false);
        sparseBooleanArray.put(7, false);
        sparseBooleanArray.put(10, false);
        sparseBooleanArray.put(3, true);
        a = true;
        c = new android.util.SparseBooleanArray();
    }

    public static void a(java.lang.StringBuilder sb, int[] iArr) {
        sb.append('[');
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(']');
    }

    public static boolean b(int i) {
        android.util.SparseBooleanArray sparseBooleanArray = c;
        if (eum.R(sparseBooleanArray, i)) {
            return sparseBooleanArray.get(i);
        }
        android.util.SparseBooleanArray sparseBooleanArray2 = b;
        return eum.R(sparseBooleanArray2, i) ? sparseBooleanArray2.get(i) : a;
    }

    public static int[] c(boolean z) {
        android.util.SparseBooleanArray sparseBooleanArray = c;
        int i = 0;
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (sparseBooleanArray.valueAt(i2) == z) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
            if (sparseBooleanArray.valueAt(i4) == z) {
                iArr[i3] = sparseBooleanArray.keyAt(i4);
                i3++;
            }
        }
        return iArr;
    }
}
