package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class sfu implements aonj {
    final /* synthetic */ android.net.Uri a;

    public sfu(android.net.Uri uri) {
        this.a = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        java.lang.String strA;
        java.lang.String str;
        java.lang.String strA2;
        java.lang.String str2;
        android.database.Cursor cursor = ((defpackage.aguo) obj).a;
        long jI = defpackage.sfz.i(this.a);
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("display_name");
        java.lang.String strA3 = null;
        if (cursor.isNull(columnIndexOrThrow)) {
            str = null;
        } else {
            aopu[] aopuVarArr = aoou.a;
            aooa aooaVar = new aooa(java.lang.String.class);
            if (aooh.n(aooaVar, new aooa(java.lang.String.class))) {
                strA = defpackage.aguo.a(cursor, columnIndexOrThrow);
                if (strA == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (aooh.n(aooaVar, new aooa(java.lang.Integer.TYPE))) {
                strA = (java.lang.String) java.lang.Integer.valueOf(cursor.getInt(columnIndexOrThrow));
            } else if (aooh.n(aooaVar, new aooa(byte[].class))) {
                byte[] bArrB = defpackage.aguo.b(cursor, columnIndexOrThrow);
                if (bArrB == 0) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                strA = (java.lang.String) bArrB;
            } else if (aooh.n(aooaVar, new aooa(java.lang.Short.TYPE))) {
                strA = (java.lang.String) java.lang.Short.valueOf(cursor.getShort(columnIndexOrThrow));
            } else if (aooh.n(aooaVar, new aooa(java.lang.Long.TYPE))) {
                strA = (java.lang.String) java.lang.Long.valueOf(cursor.getLong(columnIndexOrThrow));
            } else if (aooh.n(aooaVar, new aooa(java.lang.Float.TYPE))) {
                strA = (java.lang.String) java.lang.Float.valueOf(cursor.getFloat(columnIndexOrThrow));
            } else {
                if (!aooh.n(aooaVar, new aooa(java.lang.Double.TYPE))) {
                    throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.String.class).c())));
                }
                strA = (java.lang.String) java.lang.Double.valueOf(cursor.getDouble(columnIndexOrThrow));
            }
            str = strA;
        }
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("account_name");
        if (cursor.isNull(columnIndexOrThrow2)) {
            str2 = null;
        } else {
            aopu[] aopuVarArr2 = aoou.a;
            aooa aooaVar2 = new aooa(java.lang.String.class);
            if (aooh.n(aooaVar2, new aooa(java.lang.String.class))) {
                strA2 = defpackage.aguo.a(cursor, columnIndexOrThrow2);
                if (strA2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Integer.TYPE))) {
                strA2 = (java.lang.String) java.lang.Integer.valueOf(cursor.getInt(columnIndexOrThrow2));
            } else if (aooh.n(aooaVar2, new aooa(byte[].class))) {
                byte[] bArrB2 = defpackage.aguo.b(cursor, columnIndexOrThrow2);
                if (bArrB2 == 0) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                strA2 = (java.lang.String) bArrB2;
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Short.TYPE))) {
                strA2 = (java.lang.String) java.lang.Short.valueOf(cursor.getShort(columnIndexOrThrow2));
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Long.TYPE))) {
                strA2 = (java.lang.String) java.lang.Long.valueOf(cursor.getLong(columnIndexOrThrow2));
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Float.TYPE))) {
                strA2 = (java.lang.String) java.lang.Float.valueOf(cursor.getFloat(columnIndexOrThrow2));
            } else {
                if (!aooh.n(aooaVar2, new aooa(java.lang.Double.TYPE))) {
                    throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.String.class).c())));
                }
                strA2 = (java.lang.String) java.lang.Double.valueOf(cursor.getDouble(columnIndexOrThrow2));
            }
            str2 = strA2;
        }
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("account_type");
        if (!cursor.isNull(columnIndexOrThrow3)) {
            aopu[] aopuVarArr3 = aoou.a;
            aooa aooaVar3 = new aooa(java.lang.String.class);
            if (aooh.n(aooaVar3, new aooa(java.lang.String.class))) {
                strA3 = defpackage.aguo.a(cursor, columnIndexOrThrow3);
                if (strA3 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Integer.TYPE))) {
                strA3 = (java.lang.String) java.lang.Integer.valueOf(cursor.getInt(columnIndexOrThrow3));
            } else if (aooh.n(aooaVar3, new aooa(byte[].class))) {
                byte[] bArrB3 = defpackage.aguo.b(cursor, columnIndexOrThrow3);
                if (bArrB3 == 0) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                strA3 = (java.lang.String) bArrB3;
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Short.TYPE))) {
                strA3 = (java.lang.String) java.lang.Short.valueOf(cursor.getShort(columnIndexOrThrow3));
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Long.TYPE))) {
                strA3 = (java.lang.String) java.lang.Long.valueOf(cursor.getLong(columnIndexOrThrow3));
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Float.TYPE))) {
                strA3 = (java.lang.String) java.lang.Float.valueOf(cursor.getFloat(columnIndexOrThrow3));
            } else {
                if (!aooh.n(aooaVar3, new aooa(java.lang.Double.TYPE))) {
                    throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.String.class).c())));
                }
                strA3 = (java.lang.String) java.lang.Double.valueOf(cursor.getDouble(columnIndexOrThrow3));
            }
        }
        return new defpackage.sfe(str, java.lang.Long.valueOf(jI), null, null, null, str2, strA3, null);
    }
}
