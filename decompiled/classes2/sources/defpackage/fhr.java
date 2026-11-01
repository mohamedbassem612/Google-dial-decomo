package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fhr extends defpackage.fhs {
    private final int[] e;

    public fhr(defpackage.ern ernVar, int[] iArr, java.util.List list, java.util.Comparator comparator) {
        super(ernVar, iArr, comparator);
        aify.n(list);
        int[] iArr2 = new int[this.c];
        this.e = iArr2;
        java.util.Arrays.fill(iArr2, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static void d(java.util.List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            aift aiftVar = (aift) list.get(i);
            if (aiftVar != null) {
                aiftVar.i(new defpackage.fhq(j, jArr[i]));
            }
        }
    }
}
