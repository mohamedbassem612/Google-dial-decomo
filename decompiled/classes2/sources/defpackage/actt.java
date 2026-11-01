package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class actt {
    public static final java.util.Comparator a = new qxq(15);

    public static final defpackage.actu a(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2, android.os.CancellationSignal cancellationSignal) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        android.net.Uri uriWithAppendedId;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.net.Uri uriBuild = new android.net.Uri.Builder().scheme("content").authority(str2).build();
        aooh.c(uriBuild);
        android.net.Uri uriBuild2 = new android.net.Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        aooh.c(uriBuild2);
        try {
            cursorQuery = contentResolver.query(uriBuild, new java.lang.String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new java.lang.String[]{str}, null, cancellationSignal);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            int i2 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                uriWithAppendedId = android.content.ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                                aooh.e(uriWithAppendedId, "withAppendedId(...)");
                            } else {
                                uriWithAppendedId = android.content.ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                                aooh.e(uriWithAppendedId, "withAppendedId(...)");
                            }
                            arrayList2.add(new defpackage.actu(uriWithAppendedId, i2, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return (defpackage.actu) ajsz.bE(arrayList);
        } catch (java.lang.Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
    }
}
