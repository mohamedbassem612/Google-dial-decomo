package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lwl implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public lwl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v30, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v31, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v33, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v35, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v42, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v43, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v44, types: [aoln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v45, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v50, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v51, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v52, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v53, types: [ajcq, java.lang.Object] */
    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) throws java.lang.Exception {
        java.lang.String strA = null;
        switch (this.$cid) {
            case 0:
                android.database.Cursor cursor = ((aguo) obj).a;
                long j = cursor.getLong(0);
                defpackage.aoin aoinVar = ((lwo) this.a).c;
                java.lang.String strA2 = "";
                if (!((java.lang.Boolean) aoinVar.a()).booleanValue() || lwo.e(j)) {
                    try {
                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                            if (!cursor.isNull(1)) {
                                defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
                                defpackage.aooa aooaVar = new defpackage.aooa(java.lang.String.class);
                                if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.String.class))) {
                                    strA = aguo.a(cursor, 1);
                                    if (strA == null) {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Integer.TYPE))) {
                                    strA = (java.lang.String) java.lang.Integer.valueOf(cursor.getInt(1));
                                } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(byte[].class))) {
                                    byte[] bArrB = aguo.b(cursor, 1);
                                    if (bArrB == 0) {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    strA = (java.lang.String) bArrB;
                                } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Short.TYPE))) {
                                    strA = (java.lang.String) java.lang.Short.valueOf(cursor.getShort(1));
                                } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Long.TYPE))) {
                                    strA = (java.lang.String) java.lang.Long.valueOf(cursor.getLong(1));
                                } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Float.TYPE))) {
                                    strA = (java.lang.String) java.lang.Float.valueOf(cursor.getFloat(1));
                                } else {
                                    if (!defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Double.TYPE))) {
                                        throw new java.lang.IllegalArgumentException("Cursor value not recognized: " + new defpackage.aooa(java.lang.String.class).c());
                                    }
                                    strA = (java.lang.String) java.lang.Double.valueOf(cursor.getDouble(1));
                                }
                            }
                            if (strA != null) {
                                strA2 = strA;
                            }
                        } else {
                            strA2 = aguo.a(cursor, 1);
                        }
                    } catch (java.lang.Exception e) {
                        if (e instanceof java.util.concurrent.CancellationException) {
                            throw e;
                        }
                        ((defpackage.aimw) ((defpackage.aimw) lwo.a.b()).k(e).l("com/android/dialer/contactsearch/ExtendedDirectorySearchDataSource", "getDirectoryDisplayName", 124, "ExtendedDirectorySearchDataSource.kt")).x("No name for directory %s", j);
                    }
                }
                return new lwi(j, strA2, sns.e(j));
            case 1:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case 2:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 3:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 4:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 5:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((qjl) this.a).c();
                return null;
            case 9:
                if (!defpackage.aooh.n((java.lang.Boolean) obj, java.lang.Boolean.TRUE)) {
                    return null;
                }
                ((qjl) this.a).h.b(defpackage.mce.IS_EMERGENCY_CALLBACK);
                return null;
            case 10:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 11:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 12:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 13:
                java.util.Map map = (java.util.Map) obj;
                defpackage.aooh.f(map, "it");
                this.a.w(map);
                return defpackage.aojh.a;
            case 14:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 15:
                wpu wpuVar = (wpu) obj;
                defpackage.aooh.f(wpuVar, "enrollmentStatus");
                if (wpuVar != wpu.a) {
                    return null;
                }
                defpackage.agsm.i(1057, ((wil) this.a).a.g(wpu.d), "Failed to auto-enroll Xatu", new java.lang.Object[0]);
                return null;
            case 16:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 17:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 18:
                this.a.cancel(false);
                return defpackage.aojh.a;
            default:
                this.a.cancel(false);
                return defpackage.aojh.a;
        }
    }
}
