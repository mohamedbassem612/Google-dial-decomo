package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tig extends epj {
    private static final android.net.Uri o = android.net.Uri.withAppendedPath(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, "filter_enterprise");
    private static final aimz p = aimz.i("com/android/dialer/searchfragment/cp2/extendeddirectories/Cp2ExtendedDirectoryContactCursorLoader");
    private final java.lang.String q;
    private final java.util.List r;
    private final android.database.Cursor[] s;
    private final ojo t;

    /* JADX WARN: Illegal instructions before constructor call */
    public tig(android.content.Context context, java.lang.String str, java.util.List list, ojo ojoVar) {
        java.lang.String[] strArrB = defpackage.thq.b();
        java.lang.String str2 = defpackage.thq.b()[3];
        super(context, (android.net.Uri) null, strArrB, java.lang.String.format("length(%s) < 1000 AND %s IS NOT NULL", str2, str2), (java.lang.String[]) null, defpackage.thq.b()[11]);
        this.q = str;
        this.r = new java.util.ArrayList(list);
        this.s = new android.database.Cursor[list.size()];
        this.t = ojoVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return i();
    }

    public final android.database.Cursor i() {
        android.database.Cursor cursorB;
        int i = 0;
        while (true) {
            java.util.List list = this.r;
            android.database.MatrixCursor matrixCursor = null;
            if (i >= list.size()) {
                android.content.Context context = ((epl) this).h;
                android.database.Cursor[] cursorArr = this.s;
                java.util.List list2 = this.r;
                java.lang.String[] strArr = defpackage.tif.b;
                int length = cursorArr.length;
                ahvr.bT(length == list2.size(), "Directories (%s) and cursors (%s) must be the same size.", list2.size(), length);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i2 = 0; i2 < cursorArr.length; i2++) {
                    android.database.Cursor cursor = cursorArr[i2];
                    if (cursor != null && !cursor.isClosed()) {
                        defpackage.tii tiiVar = (defpackage.tii) list2.get(i2);
                        if (cursor.getCount() == 0) {
                            cursor.close();
                        } else {
                            java.lang.String str = tiiVar.b;
                            long j = tiiVar.a;
                            android.database.MatrixCursor matrixCursor2 = new android.database.MatrixCursor(defpackage.tif.b, 1);
                            if (defpackage.sns.e(j)) {
                                matrixCursor2.addRow(new java.lang.Object[]{context.getString(2132018330), java.lang.Long.valueOf(j)});
                            } else {
                                matrixCursor2.addRow(new java.lang.Object[]{context.getString(2132018328, str), java.lang.Long.valueOf(j)});
                            }
                            arrayList.add(matrixCursor2);
                            arrayList.add(cursor);
                        }
                    }
                }
                android.database.Cursor[] cursorArr2 = (android.database.Cursor[]) arrayList.toArray(new android.database.Cursor[arrayList.size()]);
                if (cursorArr2.length > 0) {
                    return new defpackage.tif(cursorArr2);
                }
                return null;
            }
            long j2 = ((defpackage.tii) list.get(i)).a;
            if (!fh$.ExternalSyntheticApiModelOutline0.m(j2) && !fh$.ExternalSyntheticApiModelOutline0.m$1(j2)) {
                this.s[i] = null;
            } else if (defpackage.sns.d(j2)) {
                this.s[i] = null;
            } else {
                try {
                    cursorB = this.t.b(o.buildUpon().appendPath(this.q).appendQueryParameter("directory", java.lang.String.valueOf(j2)).appendQueryParameter("remove_duplicate_entries", "true").appendQueryParameter("limit", "200").build(), ((epj) this).c, ((epj) this).d, ((epj) this).e, ((epj) this).f);
                } catch (java.lang.RuntimeException e) {
                    a.bq(p.c(), "cursor query caught exception", "com/android/dialer/searchfragment/cp2/extendeddirectories/Cp2ExtendedDirectoryContactCursorLoader", "loadInBackground", 'v', "Cp2ExtendedDirectoryContactCursorLoader.java", e, zct.b);
                    cursorB = null;
                }
                android.database.Cursor[] cursorArr3 = this.s;
                if (cursorB != null) {
                    java.lang.String str2 = this.q;
                    android.content.Context context2 = ((epl) this).h;
                    android.database.MatrixCursor matrixCursor3 = new android.database.MatrixCursor(defpackage.thq.b());
                    try {
                        if (cursorB.moveToFirst()) {
                            do {
                                java.lang.String string = cursorB.getString(3);
                                java.lang.String string2 = cursorB.getString(4);
                                if (string != null && (defpackage.ths.g(str2, string) || defpackage.ths.e(str2, string2) || defpackage.ths.f(str2, string2, context2))) {
                                    java.lang.Object[] objArr = new java.lang.Object[defpackage.thq.b().length];
                                    for (int i3 = 0; i3 < defpackage.thq.b().length; i3++) {
                                        int columnIndex = cursorB.getColumnIndex(defpackage.thq.b()[i3]);
                                        if (columnIndex == -1) {
                                            objArr[i3] = null;
                                        } else {
                                            int type = cursorB.getType(columnIndex);
                                            if (type == 0) {
                                                objArr[i3] = null;
                                            } else if (type == 1) {
                                                objArr[i3] = java.lang.Long.valueOf(cursorB.getLong(columnIndex));
                                            } else if (type == 2) {
                                                objArr[i3] = java.lang.Double.valueOf(cursorB.getDouble(columnIndex));
                                            } else if (type == 3) {
                                                objArr[i3] = cursorB.getString(columnIndex);
                                            } else {
                                                if (type != 4) {
                                                    throw new java.lang.IllegalStateException("Unknown fieldType (" + defpackage.thq.b()[i3] + ") for column: " + columnIndex);
                                                }
                                                objArr[i3] = cursorB.getBlob(columnIndex);
                                            }
                                        }
                                    }
                                    matrixCursor3.addRow(objArr);
                                }
                                if (!cursorB.moveToNext()) {
                                    break;
                                }
                            } while (matrixCursor3.getCount() < 20);
                        }
                        cursorB.close();
                        matrixCursor = matrixCursor3;
                    } catch (java.lang.Throwable th) {
                        cursorB.close();
                        throw th;
                    }
                }
                cursorArr3[i] = matrixCursor;
            }
            i++;
        }
    }
}
