package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tif extends android.database.MergeCursor implements defpackage.tht {
    public static final java.lang.String[] b;

    static {
        java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(a, 2);
        strArr[strArr.length - 1] = "directory_id";
        b = strArr;
    }

    public final long a() {
        int i;
        int position = getPosition();
        while (moveToPrevious()) {
            int columnIndex = getColumnIndex("directory_id");
            if (columnIndex != -1 && (i = getInt(columnIndex)) != -1) {
                moveToPosition(position);
                return i;
            }
        }
        throw new java.lang.IllegalStateException(a.bj(position, "No directory id for contact at: "));
    }

    @Override // defpackage.tht
    public final java.lang.String b() {
        return getString(0);
    }

    @Override // defpackage.tht
    public final boolean c() {
        return (isClosed() || getColumnIndex(a[0]) == -1) ? false : true;
    }
}
