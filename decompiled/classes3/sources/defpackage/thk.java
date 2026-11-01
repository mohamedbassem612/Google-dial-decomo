package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class thk extends android.database.MergeCursor implements defpackage.tht {
    private final android.database.Cursor b;

    private thk(android.database.Cursor[] cursorArr) {
        super(cursorArr);
        this.b = cursorArr[1];
    }

    public static defpackage.thk a(android.content.Context context, android.database.Cursor cursor) {
        android.database.MatrixCursor matrixCursor;
        android.database.MatrixCursor matrixCursor2 = new android.database.MatrixCursor(a);
        matrixCursor2.addRow(new java.lang.String[]{context.getString(2132017718)});
        android.database.Cursor[] cursorArr = new android.database.Cursor[2];
        cursorArr[0] = matrixCursor2;
        if (cursor == null) {
            matrixCursor = null;
        } else {
            android.database.MatrixCursor matrixCursor3 = new android.database.MatrixCursor(defpackage.thq.a());
            java.util.HashSet hashSet = new java.util.HashSet();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                java.lang.String string = cursor.getString(0);
                if (!hashSet.contains(string)) {
                    android.database.MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor3.newRow();
                    for (int i = 0; i < defpackage.thq.a().length; i++) {
                        rowBuilderNewRow.add(defpackage.thq.a()[i], cursor.getString(i));
                    }
                }
                hashSet.add(string);
                cursor.moveToNext();
            }
            cursor.close();
            matrixCursor = matrixCursor3;
        }
        cursorArr[1] = matrixCursor;
        return new defpackage.thk(cursorArr);
    }

    @Override // defpackage.tht
    public final java.lang.String b() {
        return getString(0);
    }

    @Override // defpackage.tht
    public final boolean c() {
        return isFirst();
    }

    @Override // android.database.MergeCursor, android.database.AbstractCursor, android.database.Cursor
    public final int getCount() {
        int count;
        android.database.Cursor cursor = this.b;
        if (cursor == null || cursor.isClosed() || (count = cursor.getCount()) == 0) {
            return 0;
        }
        return count + 1;
    }
}
