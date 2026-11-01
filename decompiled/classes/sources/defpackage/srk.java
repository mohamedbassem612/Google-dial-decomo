package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class srk extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srk(defpackage.aogc aogcVar, android.view.View view, defpackage.aomy aomyVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aogcVar;
        this.b = view;
        this.c = aomyVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.srk) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.srk) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        java.util.Map mapE;
        if (this.$cid != 0) {
            defpackage.aooc.af(obj);
            ((defpackage.aogc) this.a).aF((android.view.View) this.b, new defpackage.ddv(this.c, 13));
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        java.lang.Object obj2 = this.a;
        if (((defpackage.srl) obj2).h.m()) {
            throw new java.lang.IllegalStateException("Cannot access in direct boot");
        }
        try {
            android.database.sqlite.SQLiteDatabase readableDatabase = ((defpackage.srl) obj2).a().getReadableDatabase();
            java.lang.String[] strArr = defpackage.srl.b;
            java.lang.Object obj3 = this.b;
            java.lang.String str = null;
            java.lang.Object obj4 = obj3 != null ? ((defpackage.rsr) obj3).b : null;
            java.lang.Object obj5 = obj3 != null ? ((defpackage.rsr) obj3).a : null;
            java.lang.Object obj6 = this.c;
            if (obj6 != null) {
                ((java.lang.Integer) obj6).intValue();
                str = "1";
            }
            android.database.Cursor cursorQuery = readableDatabase.query("PhoneLookupHistory", strArr, (java.lang.String) obj4, (java.lang.String[]) obj5, null, null, null, str);
            try {
                if (cursorQuery == null) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.srl.a.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/phonelookup/database/PhoneLookupHistoryDataRepository$Companion", "getPhoneLookupHistoryEntries", 273, "PhoneLookupHistoryDataRepository.kt")).v("PhoneLookupHistoryDataRepository got null cursor");
                    throw new java.io.IOException("Cursor is null");
                }
                if (cursorQuery.getCount() == 0) {
                    ((defpackage.aimw) defpackage.srl.a.b().l("com/android/dialer/phonelookup/database/PhoneLookupHistoryDataRepository$Companion", "getPhoneLookupHistoryEntries", 276, "PhoneLookupHistoryDataRepository.kt")).v("Cursor is empty");
                    mapE = defpackage.aokd.a;
                } else {
                    defpackage.aola aolaVar = new defpackage.aola(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        java.lang.String string = cursorQuery.getString(0);
                        if (string == null) {
                            defpackage.aooh.g();
                        }
                        try {
                            byte[] blob = cursorQuery.getBlob(1);
                            spn spnVarE = defpackage.alad.E(spn.a, blob, 0, blob.length, defpackage.akzq.a());
                            defpackage.alad.V(spnVarE);
                            spn spnVar = spnVarE;
                            if (spnVar == null) {
                                defpackage.aooh.g();
                            }
                            aolaVar.put(string, new srn(string, spnVar, cursorQuery.getLong(2)));
                        } catch (defpackage.alaz e) {
                            throw new java.lang.AssertionError(e);
                        }
                    }
                    mapE = aolaVar.e();
                }
                cursorQuery.close();
                return mapE;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (java.lang.Exception e2) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.srl.a.c()).k(e2).l("com/android/dialer/phonelookup/database/PhoneLookupHistoryDataRepository", "query$<anonymous>", 251, "PhoneLookupHistoryDataRepository.kt")).v("PhoneLookupHistoryDataRepository failed to query");
            throw e2;
        }
        ((defpackage.aimw) ((defpackage.aimw) defpackage.srl.a.c()).k(e2).l("com/android/dialer/phonelookup/database/PhoneLookupHistoryDataRepository", "query$<anonymous>", 251, "PhoneLookupHistoryDataRepository.kt")).v("PhoneLookupHistoryDataRepository failed to query");
        throw e2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [aomy, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.a;
        if (i != 0) {
            return new defpackage.srk((defpackage.aogc) obj2, (android.view.View) this.b, (defpackage.aomy) this.c, aolnVar, 1);
        }
        return new defpackage.srk((defpackage.srl) obj2, (defpackage.rsr) this.b, (java.lang.Integer) this.c, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srk(defpackage.srl srlVar, defpackage.rsr rsrVar, java.lang.Integer num, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = srlVar;
        this.b = rsrVar;
        this.c = num;
    }
}
