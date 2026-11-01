package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adag {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public adag(defpackage.adxm adxmVar, defpackage.gat gatVar) {
        defpackage.aooh.f(adxmVar, "clearcutLogger");
        defpackage.aooh.f(gatVar, "gnpLogEventFactory");
        this.b = adxmVar;
        this.a = gatVar;
    }

    private static final int C(defpackage.adtv adtvVar) {
        j$.util.Objects.checkIndex(0, 7);
        if (adtvVar == null) {
            return 1;
        }
        int i = 2;
        if (!(adtvVar instanceof aedi) && !(adtvVar instanceof aedh)) {
            i = 4;
            if (!(adtvVar instanceof aedn) && !(adtvVar instanceof aedj)) {
                if (adtvVar instanceof aead) {
                    return 3;
                }
                if (adtvVar instanceof aeck) {
                    return ((aeck) adtvVar).k() ? 6 : 5;
                }
                return 1;
            }
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [adxm, java.lang.Object] */
    private final void D(defpackage.aduy aduyVar, int i, defpackage.adtv adtvVar) {
        adxp adxpVarP = ((defpackage.gat) this.a).p(15);
        adxpVarP.c(aduyVar);
        adxp adxpVar = adxpVarP;
        adxpVar.A = i;
        java.lang.String simpleName = adtvVar.b().getClass().getSimpleName();
        defpackage.aooh.e(simpleName, "getSimpleName(...)");
        defpackage.aooh.f(simpleName, "exceptionClassName");
        adxpVar.o = simpleName;
        this.b.a(adxpVarP);
    }

    public static final boolean b(long j, long j2) {
        return j % j2 == 0;
    }

    public static java.lang.String l(android.database.Cursor cursor) {
        java.lang.String string;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String[] columnNames = cursor.getColumnNames();
            sb.append(java.util.Arrays.toString(columnNames));
            sb.append('\n');
            while (cursor.moveToNext()) {
                for (int i = 0; i < columnNames.length; i++) {
                    try {
                        string = cursor.getString(i);
                    } catch (java.lang.Exception unused) {
                        string = cursor.getType(i) != 4 ? "Unknown" : "Blob, length " + cursor.getBlob(i).length;
                    }
                    sb.append('|');
                    sb.append(string);
                }
                sb.append('\n');
            }
            java.lang.String string2 = sb.toString();
            if (cursor != null) {
                cursor.close();
            }
            return string2;
        } catch (java.lang.Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void m() throws java.lang.InterruptedException {
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
    }

    public final void A(defpackage.adag adagVar) throws java.lang.InterruptedException {
        m();
        java.lang.Object obj = adagVar.b;
        defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1271, "execSQL: ".concat((java.lang.String) obj));
        try {
            ((android.database.sqlite.SQLiteDatabase) this.a).execSQL((java.lang.String) obj, (java.lang.Object[]) adagVar.a);
            ahoqVarZ.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarZ.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final defpackage.adag B() {
        java.lang.String string = ((java.lang.StringBuilder) this.b).toString();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.a;
        return new defpackage.adag(string, (java.lang.Object) arrayList.toArray(new java.lang.Object[arrayList.size()]));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [acvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [adbf, java.lang.Object] */
    public final defpackage.ajcq a(long j, defpackage.ahyn ahynVar) {
        if (j == 0) {
            return defpackage.aiql.z(defpackage.ahwt.a);
        }
        if (j < 0) {
            defpackage.adbe.c("Bad sample interval (negative number): %d", java.lang.Long.valueOf(j));
            return defpackage.aiql.z(defpackage.ahwt.a);
        }
        if (this.a.H() && ahynVar.f()) {
            return adcs.e(ahynVar.b().d()).f(new adbc(j, 0), defpackage.ajbm.INSTANCE);
        }
        if (j == 0 || !b(((java.util.Random) this.b).nextLong(), j)) {
            return defpackage.aiql.z(defpackage.ahwt.a);
        }
        defpackage.akzx akzxVarM = aixg.a.m();
        akzxVarM.u();
        aixg aixgVar = akzxVarM.b;
        aixgVar.b |= 1;
        aixgVar.c = false;
        return defpackage.aiql.z(defpackage.ahyn.h(akzxVarM.r()));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq c(defpackage.adfk adfkVar, int i) {
        android.net.Uri uri;
        if (i == 0) {
            uri = android.net.Uri.parse(adfkVar.b);
        } else if (i == 1) {
            uri = android.net.Uri.parse(adfkVar.c);
        } else if (i == 2) {
            uri = android.net.Uri.parse(adfkVar.d);
        } else if (i != 3) {
            uri = i != 4 ? android.net.Uri.parse(adfkVar.g) : android.net.Uri.parse(adfkVar.f);
        } else {
            uri = android.net.Uri.parse(adfkVar.e);
        }
        return defpackage.aiql.E(new adck(this, uri, 2), this.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object d(java.util.Map map, aeac aeacVar, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.a, new zgb(map, aeacVar, this, aduwVar, (defpackage.aoln) null, 2), aolnVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [adxm, java.lang.Object] */
    public final void e(defpackage.adtz adtzVar, java.util.Set set) {
        defpackage.aooh.f(adtzVar, "result");
        defpackage.aooh.f(set, "accounts");
        int iR = defpackage.anty.R(adtzVar);
        if (iR != 0) {
            if (iR != 1) {
                throw new defpackage.aois();
            }
            defpackage.adtv adtvVar = (defpackage.adtv) adtzVar;
            int iC = C(adtvVar);
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                D((defpackage.aduy) it.next(), iC, adtvVar);
            }
            return;
        }
        for (java.util.Map.Entry entry : ((java.util.Map) ((defpackage.adub) adtzVar).a).entrySet()) {
            if (entry.getValue() instanceof defpackage.adub) {
                defpackage.aduy aduyVar = (defpackage.aduy) entry.getKey();
                ?? r0 = this.b;
                adxn adxnVarQ = ((defpackage.gat) this.a).q(33);
                adxnVarQ.c(aduyVar);
                r0.a(adxnVarQ);
            } else {
                java.lang.Object value = entry.getValue();
                defpackage.aooh.d(value, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                defpackage.adtv adtvVar2 = (defpackage.adtv) value;
                D((defpackage.aduy) entry.getKey(), C(adtvVar2), adtvVar2);
            }
        }
    }

    public final defpackage.ajcq f(com.google.apps.tiktok.account.AccountId accountId) {
        java.lang.Object obj = this.b;
        return defpackage.ajan.g(((defpackage.aogc) ((defpackage.agqj) obj).h).F(), defpackage.ahqx.c(new adot(obj, accountId, 16, (byte[]) null)), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq g(com.google.apps.tiktok.account.AccountId accountId) {
        return defpackage.ahvr.H(((defpackage.aogc) ((defpackage.adai) this.a).a).F(), new agnw(accountId, 5), defpackage.ajbm.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq h() {
        defpackage.adai adaiVar = (defpackage.adai) this.a;
        return defpackage.ahvr.H(((defpackage.aogc) adaiVar.a).F(), new agqd(0), adaiVar.b);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq i() {
        defpackage.adai adaiVar = (defpackage.adai) this.a;
        return defpackage.ahvr.H(((defpackage.aogc) adaiVar.a).F(), new defpackage.agqh(1), adaiVar.b);
    }

    @java.lang.SafeVarargs
    public final int j(java.lang.String str, java.lang.String str2, java.lang.String... strArr) throws java.lang.InterruptedException {
        m();
        defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1270, defpackage.hgb.n(str2, str, "DELETE FROM ", " WHERE "));
        try {
            int iDelete = ((android.database.sqlite.SQLiteDatabase) this.a).delete(str, str2, strArr);
            ahoqVarZ.close();
            return iDelete;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarZ.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long k(java.lang.String str, android.content.ContentValues contentValues, int i) throws java.lang.InterruptedException {
        m();
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1272, "INSERT WITH ON CONFLICT ".concat(str), defpackage.ahot.a, true);
        try {
            long jInsertWithOnConflict = ((android.database.sqlite.SQLiteDatabase) this.a).insertWithOnConflict(str, null, contentValues, i);
            ahoqVarX.close();
            return jInsertWithOnConflict;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void n(java.lang.String str) {
        ((java.lang.StringBuilder) this.b).append(str);
    }

    public final void o(java.lang.Long l) {
        ((java.util.ArrayList) this.a).add(l);
    }

    public final void p(java.lang.String str) {
        ((java.util.ArrayList) this.a).add(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final java.lang.String q() {
        ?? r0 = this.b;
        int size = r0.size();
        if (size == 0) {
            return ((android.content.Context) this.a).getPackageName();
        }
        if (size != 1) {
            throw new java.lang.IllegalArgumentException("More than 1 custom main process specified");
        }
        java.lang.String strA = ((afaf) defpackage.ahvr.aZ(((defpackage.aikh) r0).iterator())).a();
        defpackage.ahvr.bR(strA.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", strA);
        return java.lang.String.valueOf(((android.content.Context) this.a).getPackageName()).concat(java.lang.String.valueOf(strA));
    }

    public final boolean r() {
        if (!defpackage.agab.ao()) {
            return false;
        }
        java.lang.String strAp = defpackage.agab.ap();
        if (strAp == null) {
            return true;
        }
        return strAp.equals(q());
    }

    public final defpackage.aeyr s(java.lang.String str, double d) {
        return new defpackage.aeyi((java.lang.String) this.b, str, (defpackage.aeyz) this.a, d);
    }

    public final defpackage.aeyr t(java.lang.String str, long j) {
        return new defpackage.aeyk((java.lang.String) this.b, str, (defpackage.aeyz) this.a, j);
    }

    public final defpackage.aeyr u(java.lang.String str, java.lang.String str2) {
        return new defpackage.aeym((java.lang.String) this.b, str, (defpackage.aeyz) this.a, str2);
    }

    public final defpackage.aeyr v(java.lang.String str, boolean z) {
        return new defpackage.aeye((java.lang.String) this.b, str, (defpackage.aeyz) this.a, z);
    }

    public final defpackage.aeyr w(java.lang.String str, defpackage.aeyd aeydVar, java.lang.String str2) {
        return new defpackage.aeyg((java.lang.String) this.b, str, (defpackage.aeyz) this.a, aeydVar, str2);
    }

    public final int x(wsk wskVar) throws java.lang.InterruptedException {
        m();
        java.lang.Object obj = wskVar.c;
        java.lang.Object obj2 = wskVar.a;
        defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1269, defpackage.hgb.n((java.lang.String) obj2, (java.lang.String) obj, "DELETE FROM ", " WHERE "));
        try {
            java.lang.String str = (java.lang.String) obj;
            int iDelete = ((android.database.sqlite.SQLiteDatabase) this.a).delete(str, (java.lang.String) obj2, (java.lang.String[]) wskVar.b);
            ahoqVarZ.close();
            return iDelete;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarZ.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final android.database.Cursor y(defpackage.adag adagVar) {
        m();
        if (android.util.Log.isLoggable("ASQLDB", 2)) {
            android.util.Log.v("ASQLDB", l(((android.database.sqlite.SQLiteDatabase) this.a).rawQueryWithFactory(new defpackage.afif(adagVar), "EXPLAIN QUERY PLAN ".concat((java.lang.String) adagVar.b), null, null)));
        }
        java.lang.Object obj = adagVar.b;
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1273, "Query: ".concat((java.lang.String) obj), defpackage.ahot.a, true);
        try {
            android.database.Cursor cursorRawQueryWithFactory = ((android.database.sqlite.SQLiteDatabase) this.a).rawQueryWithFactory(new defpackage.afif(adagVar), (java.lang.String) obj, null, null, (android.os.CancellationSignal) this.b);
            ahoqVarX.close();
            return cursorRawQueryWithFactory;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final afih z(defpackage.adag adagVar) throws java.lang.InterruptedException {
        m();
        java.lang.Object[] objArr = (java.lang.Object[]) adagVar.a;
        defpackage.ahvr.bS(objArr.length == 0, "Arguments should not be passed on prepared statements: %s", objArr);
        return new afih(this, (java.lang.String) adagVar.b);
    }

    public adag() {
        throw null;
    }

    public adag(android.content.Context context, defpackage.apnt apntVar) {
        this.b = context;
        this.a = apntVar;
    }

    public adag(defpackage.aogc aogcVar, defpackage.aolr aolrVar) {
        defpackage.aooh.f(aolrVar, "backgroundContext");
        this.b = aogcVar;
        this.a = aolrVar;
    }

    public adag(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public adag(java.lang.String str, java.lang.Object obj) {
        this.b = str;
        this.a = obj;
    }

    public adag(defpackage.ahyn ahynVar, defpackage.ahzi ahziVar) {
        this.a = ahynVar;
        this.b = defpackage.ahvr.bI(ahziVar);
    }

    public adag(android.content.Context context, java.util.Map map) {
        this.a = context;
        this.b = ((defpackage.aikj) map).keySet();
    }

    public adag(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public adag(byte[] bArr) {
        this.b = new java.lang.StringBuilder();
        this.a = new java.util.ArrayList();
    }

    public adag(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = new android.os.CancellationSignal();
    }
}
