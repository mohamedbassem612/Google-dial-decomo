package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class rni implements aonj {
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        java.lang.String strA;
        java.lang.Integer numValueOf;
        java.lang.String strA2;
        android.database.Cursor cursor = ((defpackage.aguo) obj).a;
        int columnIndex = cursor.getColumnIndex("number");
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
        if (strA == null) {
            return defpackage.rna.a;
        }
        int columnIndex2 = cursor.getColumnIndex("type");
        if (cursor.isNull(columnIndex2)) {
            numValueOf = null;
        } else {
            aopu[] aopuVarArr2 = aoou.a;
            aooa aooaVar2 = new aooa(java.lang.Integer.class);
            if (aooh.n(aooaVar2, new aooa(java.lang.String.class))) {
                java.lang.Object objA = defpackage.aguo.a(cursor, columnIndex2);
                if (objA == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                numValueOf = (java.lang.Integer) objA;
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Integer.TYPE))) {
                numValueOf = java.lang.Integer.valueOf(cursor.getInt(columnIndex2));
            } else if (aooh.n(aooaVar2, new aooa(byte[].class))) {
                byte[] bArrB2 = defpackage.aguo.b(cursor, columnIndex2);
                if (bArrB2 == 0) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                numValueOf = (java.lang.Integer) bArrB2;
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Short.TYPE))) {
                numValueOf = (java.lang.Integer) java.lang.Short.valueOf(cursor.getShort(columnIndex2));
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Long.TYPE))) {
                numValueOf = (java.lang.Integer) java.lang.Long.valueOf(cursor.getLong(columnIndex2));
            } else if (aooh.n(aooaVar2, new aooa(java.lang.Float.TYPE))) {
                numValueOf = (java.lang.Integer) java.lang.Float.valueOf(cursor.getFloat(columnIndex2));
            } else {
                if (!aooh.n(aooaVar2, new aooa(java.lang.Double.TYPE))) {
                    throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.Integer.class).c())));
                }
                numValueOf = (java.lang.Integer) java.lang.Double.valueOf(cursor.getDouble(columnIndex2));
            }
        }
        if (numValueOf == null) {
            return defpackage.rna.a;
        }
        int iIntValue = numValueOf.intValue();
        int columnIndex3 = cursor.getColumnIndex("countryiso");
        if (cursor.isNull(columnIndex3)) {
            strA2 = null;
        } else {
            aopu[] aopuVarArr3 = aoou.a;
            aooa aooaVar3 = new aooa(java.lang.String.class);
            if (aooh.n(aooaVar3, new aooa(java.lang.String.class))) {
                strA2 = defpackage.aguo.a(cursor, columnIndex3);
                if (strA2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Integer.TYPE))) {
                strA2 = (java.lang.String) java.lang.Integer.valueOf(cursor.getInt(columnIndex3));
            } else if (aooh.n(aooaVar3, new aooa(byte[].class))) {
                byte[] bArrB3 = defpackage.aguo.b(cursor, columnIndex3);
                if (bArrB3 == 0) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                strA2 = (java.lang.String) bArrB3;
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Short.TYPE))) {
                strA2 = (java.lang.String) java.lang.Short.valueOf(cursor.getShort(columnIndex3));
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Long.TYPE))) {
                strA2 = (java.lang.String) java.lang.Long.valueOf(cursor.getLong(columnIndex3));
            } else if (aooh.n(aooaVar3, new aooa(java.lang.Float.TYPE))) {
                strA2 = (java.lang.String) java.lang.Float.valueOf(cursor.getFloat(columnIndex3));
            } else {
                if (!aooh.n(aooaVar3, new aooa(java.lang.Double.TYPE))) {
                    throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.String.class).c())));
                }
                strA2 = (java.lang.String) java.lang.Double.valueOf(cursor.getDouble(columnIndex3));
            }
        }
        if (strA2 == null) {
            return defpackage.rna.a;
        }
        int columnIndex4 = cursor.getColumnIndex("subscription_id");
        if (!cursor.isNull(columnIndex4)) {
            aopu[] aopuVarArr4 = aoou.a;
            aooa aooaVar4 = new aooa(java.lang.String.class);
            if (aooh.n(aooaVar4, new aooa(java.lang.String.class))) {
                strA3 = defpackage.aguo.a(cursor, columnIndex4);
                if (strA3 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (aooh.n(aooaVar4, new aooa(java.lang.Integer.TYPE))) {
                strA3 = (java.lang.String) java.lang.Integer.valueOf(cursor.getInt(columnIndex4));
            } else if (aooh.n(aooaVar4, new aooa(byte[].class))) {
                byte[] bArrB4 = defpackage.aguo.b(cursor, columnIndex4);
                if (bArrB4 == 0) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                strA3 = (java.lang.String) bArrB4;
            } else if (aooh.n(aooaVar4, new aooa(java.lang.Short.TYPE))) {
                strA3 = (java.lang.String) java.lang.Short.valueOf(cursor.getShort(columnIndex4));
            } else if (aooh.n(aooaVar4, new aooa(java.lang.Long.TYPE))) {
                strA3 = (java.lang.String) java.lang.Long.valueOf(cursor.getLong(columnIndex4));
            } else if (aooh.n(aooaVar4, new aooa(java.lang.Float.TYPE))) {
                strA3 = (java.lang.String) java.lang.Float.valueOf(cursor.getFloat(columnIndex4));
            } else {
                if (!aooh.n(aooaVar4, new aooa(java.lang.Double.TYPE))) {
                    throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.String.class).c())));
                }
                strA3 = (java.lang.String) java.lang.Double.valueOf(cursor.getDouble(columnIndex4));
            }
        }
        return strA3 == null ? defpackage.rna.a : new defpackage.rnb(strA, iIntValue, strA2, strA3);
    }
}
