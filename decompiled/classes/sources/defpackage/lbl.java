package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lbl implements defpackage.lbi {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callrecording/impl/storage/CallRecordingInfoStorageAsyncSqlite");
    private static final defpackage.ahbq g;
    public final android.content.Context b;
    public final defpackage.kvj c;
    public final defpackage.aoin d;
    private final defpackage.ajct e;
    private final defpackage.ajct f;
    private final defpackage.zzx h;

    static {
        defpackage.afib afibVar = new defpackage.afib();
        afibVar.a("CREATE TABLE call_recording_info (call_creation_time_millis INTEGER PRIMARY KEY, call_recording_details BLOB, last_modified_timestamp_millis INTEGER)");
        afibVar.a("ALTER TABLE call_recording_info ADD COLUMN call_recording_extras BLOB");
        g = afibVar.b();
    }

    public lbl(android.content.Context context, defpackage.aogc aogcVar, defpackage.kvj kvjVar, defpackage.aoin aoinVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2) {
        this.b = context;
        this.c = kvjVar;
        this.d = aoinVar;
        this.e = ajctVar;
        this.f = ajctVar2;
        this.h = aogcVar.aB("callrecording", g);
    }

    private final defpackage.ajcq m(defpackage.aifo aifoVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/storage/CallRecordingInfoStorageAsyncSqlite", "deleteRecordingFiles", 535, "CallRecordingInfoStorageAsyncSqlite.java")).v("enter");
        return defpackage.ahvr.F(new jyr(aifoVar, 10), this.e);
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq a(lbh lbhVar) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("call_creation_time_millis", java.lang.Long.valueOf(lbhVar.a));
        contentValues.put("call_recording_details", lbhVar.b.i());
        contentValues.put("last_modified_timestamp_millis", java.lang.Long.valueOf(lbhVar.c));
        kwv kwvVar = new kwv(contentValues, 4);
        j$.util.Optional optional = lbhVar.d;
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            ((android.content.ContentValues) kwvVar.a).put("call_recording_extras", ((defpackage.akym) obj).i());
        }
        return this.h.G(new jsg(contentValues, 3));
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq b(long j) {
        return this.h.F(new lbk(j, 1));
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq c(long j) {
        return defpackage.ahrv.g(h(j)).h(new kwz(19), this.f);
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq d(defpackage.aigf aigfVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/storage/CallRecordingInfoStorageAsyncSqlite", "delete", 422, "CallRecordingInfoStorageAsyncSqlite.java")).v("enter");
        if (aigfVar.size() <= 0) {
            return defpackage.ajcm.a;
        }
        defpackage.aifo aifoVarValues = aigfVar.values();
        defpackage.aihd aihdVarO = defpackage.aihd.o(aigfVar.keySet().g());
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(m(aifoVarValues));
        kwa kwaVar = new kwa(this, aihdVarO, 3);
        defpackage.ajct ajctVar = this.f;
        return ahrvVarG.i(kwaVar, ajctVar).i(new kwa(this, aihdVarO, 4), ajctVar).h(new kxn(this, 6), ajctVar);
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq e() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/storage/CallRecordingInfoStorageAsyncSqlite", "deleteAll", 409, "CallRecordingInfoStorageAsyncSqlite.java")).v("enter");
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(h(j$.time.Instant.now().toEpochMilli()));
        kxm kxmVar = new kxm(this, 12);
        defpackage.ajct ajctVar = this.f;
        return ahrvVarG.i(kxmVar, ajctVar).i(new kxm(this, 13), ajctVar);
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq f(defpackage.aigf aigfVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/storage/CallRecordingInfoStorageAsyncSqlite", "deleteCallLogInitiated", 501, "CallRecordingInfoStorageAsyncSqlite.java")).v("enter");
        if (aigfVar.size() <= 0) {
            return defpackage.ajcm.a;
        }
        return defpackage.ahrv.g(m(aigfVar.values())).i(new kwa(this, defpackage.aihd.o(aigfVar.keySet().g()), 2), this.f);
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq g(long j) {
        return defpackage.ahvr.F(new jww(this, j, 5), this.e);
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq h(long j) {
        return this.h.F(new lbk(j, 0));
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq i(final long j) {
        return this.h.F(new defpackage.afig() { // from class: lbj
            @Override // defpackage.afig
            public final java.lang.Object a(defpackage.adag adagVar) {
                defpackage.aigf aigfVarE;
                defpackage.aimz aimzVar = defpackage.lbl.a;
                defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
                adagVar2.n("SELECT call_creation_time_millis,call_recording_details,last_modified_timestamp_millis,call_recording_extras FROM call_recording_info WHERE last_modified_timestamp_millis > ?");
                adagVar2.o(java.lang.Long.valueOf(j));
                android.database.Cursor cursorY = adagVar.y(adagVar2.B());
                try {
                    if (cursorY.moveToFirst()) {
                        int columnIndexOrThrow = cursorY.getColumnIndexOrThrow("call_creation_time_millis");
                        int columnIndexOrThrow2 = cursorY.getColumnIndexOrThrow("call_recording_details");
                        int columnIndexOrThrow3 = cursorY.getColumnIndexOrThrow("last_modified_timestamp_millis");
                        int columnIndexOrThrow4 = cursorY.getColumnIndexOrThrow("call_recording_extras");
                        defpackage.aigb aigbVar = new defpackage.aigb(4);
                        do {
                            long j2 = cursorY.getLong(columnIndexOrThrow);
                            long j3 = cursorY.getLong(columnIndexOrThrow3);
                            defpackage.kui kuiVar = (defpackage.kui) ((defpackage.akzx) defpackage.kui.a.m().h(cursorY.getBlob(columnIndexOrThrow2), defpackage.akzq.a())).r();
                            byte[] blob = cursorY.getBlob(columnIndexOrThrow4);
                            j$.util.Optional optionalEmpty = blob == null ? j$.util.Optional.empty() : j$.util.Optional.of(((defpackage.akzx) kuj.a.m().h(blob, defpackage.akzq.a())).r());
                            java.lang.Long lValueOf = java.lang.Long.valueOf(j2);
                            lbg lbgVarA = lbh.a();
                            lbgVarA.c(kuiVar);
                            lbgVarA.b(j2);
                            lbgVarA.e(j3);
                            lbgVarA.d(optionalEmpty);
                            aigbVar.i(lValueOf, lbgVarA.a());
                        } while (cursorY.moveToNext());
                        aigfVarE = aigbVar.e(true);
                    } else {
                        aigfVarE = defpackage.aikj.b;
                    }
                    if (cursorY != null) {
                        cursorY.close();
                    }
                    return aigfVarE;
                } catch (java.lang.Throwable th) {
                    if (cursorY != null) {
                        try {
                            cursorY.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq j(defpackage.aify aifyVar) {
        if (aifyVar.isEmpty()) {
            return defpackage.aiql.z(defpackage.aikj.b);
        }
        java.lang.Iterable iterableBf = defpackage.ahvr.bf(aifyVar, 999);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterableBf.iterator();
        while (it.hasNext()) {
            arrayList.add(this.h.F(new jsh((java.util.List) it.next(), 4)));
        }
        return defpackage.ahvr.aj(arrayList).o(defpackage.ahqx.i(new jyr(arrayList, 11)), this.f);
    }

    @Override // defpackage.lbi
    public final defpackage.ajcq k() {
        return defpackage.ahvr.F(new jyr(this, 12), this.e);
    }

    public final defpackage.ajcq l(defpackage.aihd aihdVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/storage/CallRecordingInfoStorageAsyncSqlite", "deleteDbRows", 517, "CallRecordingInfoStorageAsyncSqlite.java")).v("enter");
        if (aihdVar.isEmpty()) {
            return defpackage.ajcm.a;
        }
        java.lang.Iterable iterableBf = defpackage.ahvr.bf(aihdVar, 999);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterableBf.iterator();
        while (it.hasNext()) {
            defpackage.aify aifyVarN = defpackage.aify.n((java.util.List) it.next());
            wsk wskVar = new wsk("call_recording_info");
            wskVar.e("call_creation_time_millis in (?");
            defpackage.ailk ailkVarListIterator = aifyVarN.listIterator(0);
            wskVar.f(java.lang.String.valueOf(ailkVarListIterator.next()));
            while (ailkVarListIterator.hasNext()) {
                wskVar.f(java.lang.String.valueOf(ailkVarListIterator.next()));
                wskVar.e(",?");
            }
            wskVar.e(")");
            arrayList.add(this.h.G(new jsg(wskVar, 4)));
        }
        return defpackage.ahvr.aj(arrayList).o(defpackage.ahqx.i(new jse(7)), this.f);
    }
}
