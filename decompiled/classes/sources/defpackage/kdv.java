package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class kdv extends defpackage.aomh implements defpackage.aonn {
    final /* synthetic */ defpackage.kdw a;
    final /* synthetic */ defpackage.rsr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdv(defpackage.kdw kdwVar, defpackage.rsr rsrVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.a = kdwVar;
        this.b = rsrVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.kdv) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        java.util.Map mapE;
        defpackage.aooc.af(obj);
        defpackage.kdw kdwVar = this.a;
        defpackage.akfh.a(kdwVar.c);
        try {
            android.database.sqlite.SQLiteDatabase readableDatabase = kdwVar.f.getReadableDatabase();
            java.lang.String[] strArr = defpackage.kdw.b;
            defpackage.rsr rsrVar = this.b;
            android.database.Cursor cursorQuery = readableDatabase.query("AnnotatedCallLog", strArr, (java.lang.String) (rsrVar != null ? rsrVar.b : null), (java.lang.String[]) (rsrVar != null ? rsrVar.a : null), null, null, null);
            try {
                if (cursorQuery == null) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.kdw.a.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/calllog/database/AnnotatedCallLogDataRepository$Companion", "getAnnotatedCallLogEntries", 375, "AnnotatedCallLogDataRepository.kt")).v("AnnotatedCallLogDataRepository got null cursor");
                    throw new java.io.IOException("Cursor is null");
                }
                if (cursorQuery.getCount() == 0) {
                    ((defpackage.aimw) defpackage.kdw.a.b().l("com/android/dialer/calllog/database/AnnotatedCallLogDataRepository$Companion", "getAnnotatedCallLogEntries", 378, "AnnotatedCallLogDataRepository.kt")).v("Cursor is empty");
                    mapE = defpackage.aokd.a;
                } else {
                    defpackage.aola aolaVar = new defpackage.aola(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j = cursorQuery.getLong(0);
                        aolaVar.put(java.lang.Long.valueOf(j), new kdy(j, cursorQuery.getLong(1), hgt.y(cursorQuery.getBlob(2)), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6) == 1, cursorQuery.getInt(7) == 1, cursorQuery.getString(8), cursorQuery.getString(9), cursorQuery.getString(10), cursorQuery.getInt(11), hgt.y(cursorQuery.getBlob(12)), cursorQuery.getInt(13) == 1, cursorQuery.getString(14), cursorQuery.getInt(15), cursorQuery.getLong(16), cursorQuery.getLong(17), cursorQuery.getString(18), hgt.y(cursorQuery.getBlob(19)), hgt.y(cursorQuery.getBlob(20)), hgt.y(cursorQuery.getBlob(21)), hgt.y(cursorQuery.getBlob(22)), hgt.y(cursorQuery.getBlob(23)), hgt.y(cursorQuery.getBlob(24)), hgt.y(cursorQuery.getBlob(25)), hgt.y(cursorQuery.getBlob(26)), cursorQuery.getString(27), cursorQuery.getString(28), cursorQuery.getString(29)));
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
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.kdw.a.c()).k(e).l("com/android/dialer/calllog/database/AnnotatedCallLogDataRepository", "queryAcl$<anonymous>", 310, "AnnotatedCallLogDataRepository.kt")).v("AnnotatedCallLogDataRepository failed to query");
            throw e;
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.kdv(this.a, this.b, aolnVar);
    }
}
