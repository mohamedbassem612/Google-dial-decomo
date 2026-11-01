package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class achf implements defpackage.ajbc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ achf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ajbc
    public final java.lang.Object a(defpackage.ajyk ajykVar, java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            android.database.Cursor cursor = (android.database.Cursor) obj;
            java.util.HashSet hashSet = new java.util.HashSet();
            while (cursor.moveToNext()) {
                java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow("account"));
                if (true == string.equals("signedout")) {
                    string = null;
                }
                hashSet.add(achu.a(string, cursor.getString(cursor.getColumnIndexOrThrow("key")), akmr.q(cursor.getBlob(cursor.getColumnIndexOrThrow("message")), akhm.a), cursor.getLong(cursor.getColumnIndexOrThrow("windowStartTimestamp")), cursor.getLong(cursor.getColumnIndexOrThrow("windowEndTimestamp"))));
            }
            return hashSet;
        }
        if (i != 1) {
            j$.time.Instant instantNow = j$.time.Instant.now();
            defpackage.agxh agxhVar = defpackage.agxh.a;
            obj.getClass();
            return new defpackage.agxh(obj, instantNow, true);
        }
        android.database.Cursor cursor2 = (android.database.Cursor) obj;
        java.lang.String[] strArr = defpackage.vva.a;
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        if (cursor2 == null) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vva.b.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "queryPhoneLookupHistoryForNumbers", (char) 1488, "VoicemailDataServiceImpl.java")).v("null cursor");
            return aigbVar.e(true);
        }
        if (cursor2.moveToFirst()) {
            int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("normalized_number");
            int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("phone_lookup_info");
            do {
                try {
                    java.lang.String string2 = cursor2.getString(columnIndexOrThrow);
                    byte[] blob = cursor2.getBlob(columnIndexOrThrow2);
                    spn spnVarE = defpackage.alad.E(spn.a, blob, 0, blob.length, defpackage.akzq.a());
                    defpackage.alad.V(spnVarE);
                    aigbVar.i(string2, spnVarE);
                } catch (defpackage.alaz e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vva.b.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "queryPhoneLookupHistoryForNumbers", (char) 1507, "VoicemailDataServiceImpl.java")).v("failed parsing PhoneLookupInfo");
                }
            } while (cursor2.moveToNext());
        }
        return aigbVar.e(true);
    }
}
