package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class shl implements aonj {
    public static final defpackage.shl a = new defpackage.shl();

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        java.lang.String strA;
        android.net.Uri uri;
        java.lang.String strA2;
        android.database.Cursor cursor = ((defpackage.aguo) obj).a;
        long j = cursor.getLong(cursor.getColumnIndex("raw_contact_id"));
        long j2 = cursor.getLong(cursor.getColumnIndex("data1"));
        int columnIndex = cursor.getColumnIndex("photo_uri");
        java.lang.String strA3 = null;
        if (cursor.isNull(columnIndex)) {
            strA = null;
        } else {
            aopu[] aopuVarArr = aoou.a;
            aooa aooaVar = new aooa(java.lang.String.class);
            if (aooh.n(aooaVar, new aooa(java.lang.String.class))) {
                strA = defpackage.aguo.a(cursor, columnIndex);
                if (strA == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (aooh.n(aooaVar, new aooa(java.lang.Integer.TYPE))) {
                strA = (java.lang.String) java.lang.Integer.valueOf(cursor.getInt(columnIndex));
            } else if (aooh.n(aooaVar, new aooa(byte[].class))) {
                byte[] bArrB = defpackage.aguo.b(cursor, columnIndex);
                if (bArrB == 0) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                strA = (java.lang.String) bArrB;
            } else if (aooh.n(aooaVar, new aooa(java.lang.Short.TYPE))) {
                strA = (java.lang.String) java.lang.Short.valueOf(cursor.getShort(columnIndex));
            } else if (aooh.n(aooaVar, new aooa(java.lang.Long.TYPE))) {
                strA = (java.lang.String) java.lang.Long.valueOf(cursor.getLong(columnIndex));
            } else if (aooh.n(aooaVar, new aooa(java.lang.Float.TYPE))) {
                strA = (java.lang.String) java.lang.Float.valueOf(cursor.getFloat(columnIndex));
            } else {
                if (!aooh.n(aooaVar, new aooa(java.lang.Double.TYPE))) {
                    throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.String.class).c())));
                }
                strA = (java.lang.String) java.lang.Double.valueOf(cursor.getDouble(columnIndex));
            }
        }
        if (strA != null) {
            android.net.Uri uri2 = android.net.Uri.parse(strA);
            aooh.e(uri2, "parse(...)");
            uri = uri2;
        } else {
            uri = null;
        }
        int columnIndex2 = cursor.getColumnIndex("display_name");
        if (cursor.isNull(columnIndex2)) {
            strA2 = null;
        } else {
            aopu[] aopuVarArr2 = aoou.a;
            aooa aooaVar2 = new aooa(java.lang.String.class);
            if (aooh.n(aooaVar2, new aooa(java.lang.String.class))) {
                strA2 = defpackage.aguo.a(cursor, columnIndex2);
                if (strA2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Integer.TYPE))) {
                strA2 = (java.lang.String) java.lang.Integer.valueOf(cursor.getInt(columnIndex2));
            } else if (aooh.n(aooaVar2, new aooa(byte[].class))) {
                byte[] bArrB2 = defpackage.aguo.b(cursor, columnIndex2);
                if (bArrB2 == 0) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                strA2 = (java.lang.String) bArrB2;
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Short.TYPE))) {
                strA2 = (java.lang.String) java.lang.Short.valueOf(cursor.getShort(columnIndex2));
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Long.TYPE))) {
                strA2 = (java.lang.String) java.lang.Long.valueOf(cursor.getLong(columnIndex2));
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Float.TYPE))) {
                strA2 = (java.lang.String) java.lang.Float.valueOf(cursor.getFloat(columnIndex2));
            } else {
                if (!aooh.n(aooaVar2, new aooa(java.lang.Double.TYPE))) {
                    throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.String.class).c())));
                }
                strA2 = (java.lang.String) java.lang.Double.valueOf(cursor.getDouble(columnIndex2));
            }
        }
        int columnIndex3 = cursor.getColumnIndex("lookup");
        if (!cursor.isNull(columnIndex3)) {
            aopu[] aopuVarArr3 = aoou.a;
            aooa aooaVar3 = new aooa(java.lang.String.class);
            if (aooh.n(aooaVar3, new aooa(java.lang.String.class))) {
                strA3 = defpackage.aguo.a(cursor, columnIndex3);
                if (strA3 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Integer.TYPE))) {
                strA3 = (java.lang.String) java.lang.Integer.valueOf(cursor.getInt(columnIndex3));
            } else if (aooh.n(aooaVar3, new aooa(byte[].class))) {
                byte[] bArrB3 = defpackage.aguo.b(cursor, columnIndex3);
                if (bArrB3 == 0) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                strA3 = (java.lang.String) bArrB3;
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Short.TYPE))) {
                strA3 = (java.lang.String) java.lang.Short.valueOf(cursor.getShort(columnIndex3));
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Long.TYPE))) {
                strA3 = (java.lang.String) java.lang.Long.valueOf(cursor.getLong(columnIndex3));
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Float.TYPE))) {
                strA3 = (java.lang.String) java.lang.Float.valueOf(cursor.getFloat(columnIndex3));
            } else {
                if (!aooh.n(aooaVar3, new aooa(java.lang.Double.TYPE))) {
                    throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.String.class).c())));
                }
                strA3 = (java.lang.String) java.lang.Double.valueOf(cursor.getDouble(columnIndex3));
            }
        }
        return new defpackage.sib(j, j2, uri, strA2, strA3);
    }
}
