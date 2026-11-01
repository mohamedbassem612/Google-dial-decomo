package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adki {
    public final defpackage.adjz a;
    public final java.util.List b;
    public long g;
    public long h;
    public long i;
    private final long k;
    private final long l;
    private final java.util.Set j = new java.util.HashSet();
    public final java.util.List c = new java.util.ArrayList();
    public final java.util.Map d = new java.util.HashMap();
    public final java.util.Map e = new java.util.HashMap();
    public final defpackage.adkf f = new defpackage.adkf();

    /* JADX WARN: Code duplicated, block: B:67:0x01fe  */
    public adki(defpackage.adjz adjzVar, defpackage.adkh adkhVar, java.util.List list, long j) throws java.lang.Throwable {
        java.util.Collection<defpackage.adkh> collectionValues;
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor;
        int i;
        int i2;
        com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName autoValue_VersionedName;
        this.a = adjzVar;
        this.b = list;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.j.add(((defpackage.adkd) it.next()).e());
        }
        this.g = j;
        synchronized (adjzVar.b) {
            collectionValues = adjzVar.c.values();
        }
        for (defpackage.adkh adkhVar2 : collectionValues) {
            if (!adkhVar2.c) {
                java.lang.String str = adkhVar2.a;
                defpackage.ahyp ahypVar = defpackage.adjz.a;
                java.util.HashMap map = new java.util.HashMap();
                java.io.File fileG = adjzVar.g(str);
                if (fileG.exists()) {
                    defpackage.adhk adhkVar = adjzVar.e;
                    for (java.io.File file : defpackage.adhk.d(fileG)) {
                        defpackage.ajje ajjeVar = new defpackage.ajje((char[]) null);
                        java.lang.String name = file.getName();
                        int i3 = defpackage.adhw.c;
                        ajjeVar.e = new defpackage.adhb(str, name);
                        ajjeVar.d = file;
                        ajjeVar.a = adjzVar.b(str);
                        ajjeVar.f = adjzVar.d;
                        ajjeVar.b = adhkVar;
                        defpackage.adju adjuVarI = ajjeVar.i();
                        map.put(adjuVarI.a, adjuVarI);
                    }
                }
                defpackage.adjd adjdVar = adjzVar.d;
                java.util.ArrayList<defpackage.adjc> arrayList = new java.util.ArrayList();
                try {
                    cursorQuery = ((defpackage.adjo) adjdVar).b.getReadableDatabase().query("file_metadata", defpackage.adjo.a, "namespace=?", new java.lang.String[]{str}, null, null, null, null);
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                try {
                                    int i4 = cursorQuery.getInt(4);
                                    com.google.android.libraries.micore.superpacks.base.BasePriority.d(i4);
                                    i = i4;
                                } catch (java.lang.IllegalArgumentException e) {
                                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).k(e)).v("Invalid gc priority value found in the table, ignoring row...");
                                    i = 0;
                                }
                                try {
                                    i2 = cursorQuery.getInt(3);
                                    defpackage.adik.m(i2);
                                } catch (java.lang.IllegalArgumentException e2) {
                                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).k(e2)).v("Invalid reservation state value found in the table, ignoring row...");
                                    i2 = 0;
                                }
                                java.lang.String string = cursorQuery.getString(7);
                                if (string != null) {
                                    int i5 = cursorQuery.getInt(8);
                                    defpackage.adik.k("version", i5);
                                    autoValue_VersionedName = new com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName(string, i5);
                                } else {
                                    autoValue_VersionedName = null;
                                }
                                defpackage.adjb adjbVarI = defpackage.adjc.i();
                                java.lang.String string2 = cursorQuery.getString(0);
                                java.lang.String string3 = cursorQuery.getString(1);
                                int i6 = defpackage.adhw.c;
                                adjbVarI.d(new defpackage.adhb(string2, string3));
                                adjbVarI.b(i);
                                adjbVarI.e(i2);
                                adjbVarI.c(cursorQuery.getLong(5));
                                adjbVarI.f(cursorQuery.getLong(2));
                                adjbVarI.b = cursorQuery.getString(6);
                                adjbVarI.a = autoValue_VersionedName;
                                adjbVarI.g(cursorQuery.getInt(9));
                                arrayList.add(adjbVarI.a());
                            } catch (android.database.sqlite.SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                try {
                                    defpackage.adiz adizVar = ((defpackage.adjo) adjdVar).b;
                                    java.io.IOException iOException = new java.io.IOException("SqliteFileMetadataTable#getAll, SQL query failed", e);
                                    adizVar.a(iOException);
                                    throw iOException;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        cursorQuery.close();
                    }
                    for (defpackage.adjc adjcVar : arrayList) {
                        if (ahypVar.a(java.lang.Integer.valueOf(adjcVar.b()))) {
                            defpackage.adhw adhwVarF = adjcVar.f();
                            defpackage.ajje ajjeVar2 = new defpackage.ajje((char[]) null);
                            ajjeVar2.d = adjzVar.f(adhwVarF);
                            ajjeVar2.e = adhwVarF;
                            ajjeVar2.a = adjzVar.b(str);
                            ajjeVar2.c = adjcVar;
                            ajjeVar2.b = adjzVar.e;
                            map.put(adhwVarF, ajjeVar2.i());
                        }
                    }
                    this.e.putAll(map);
                    if (adkhVar2.equals(adkhVar)) {
                        this.d.putAll(map);
                    }
                } catch (android.database.sqlite.SQLiteException e4) {
                    e = e4;
                    cursorQuery = null;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    cursorQuery = null;
                }
            }
        }
        this.k = defpackage.agab.ck(this.d.values());
        this.l = defpackage.agab.ck(this.e.values());
    }

    final long a() {
        return defpackage.agab.cj(this.e.values());
    }

    final long b() {
        return defpackage.agab.cj(this.d.values());
    }

    final long c() {
        return (this.l + this.h) - this.i;
    }

    final long d() {
        return (this.k + this.h) - this.i;
    }

    final void e(long j, defpackage.adkd adkdVar, int i, int i2) {
        long jMax;
        defpackage.aiof aiofVar = defpackage.adhn.a;
        java.util.Map map = i == 3 ? this.e : this.d;
        java.util.Set set = this.j;
        defpackage.adjz adjzVar = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.adju adjuVar : map.values()) {
            defpackage.adai adaiVar = adjzVar.g;
            if (!adaiVar.b(adjuVar.b) && !set.contains(adjuVar.a) && adjuVar.c().b() != 2) {
                arrayList.add(adjuVar);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((defpackage.adju) it.next()).c();
        }
        java.util.Collections.sort(arrayList, new adke(i));
        defpackage.aiof aiofVar2 = defpackage.adhn.a;
        int iF = adkdVar.f();
        java.util.ArrayList<defpackage.adju> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            jMax = 0;
            if (!it2.hasNext()) {
                break;
            }
            defpackage.adju adjuVar2 = (defpackage.adju) it2.next();
            defpackage.adjc adjcVarC = adjuVar2.c();
            int iB = adjcVarC.b();
            if (iB > i2) {
                defpackage.aiof aiofVar3 = defpackage.adhn.a;
            } else {
                int iA = adjuVar2.a();
                if (iB <= 0 || iA < iF) {
                    arrayList2.add(adjuVar2);
                    j -= (i == 3 || i == 2) ? adjuVar2.b() : adjcVarC.e();
                    if (j <= 0) {
                        break;
                    }
                } else {
                    defpackage.aiof aiofVar4 = defpackage.adhn.a;
                }
            }
        }
        defpackage.aiof aiofVar5 = defpackage.adhn.a;
        for (defpackage.adju adjuVar3 : arrayList2) {
            java.util.Map map2 = this.e;
            defpackage.adhw adhwVar = adjuVar3.a;
            map2.remove(adhwVar);
            this.d.remove(adhwVar);
            long jB = adjuVar3.b();
            this.c.add(adjuVar3);
            jMax = java.lang.Math.max(jMax, jMax + jB);
            long j2 = this.g;
            this.g = java.lang.Math.max(j2, jB + j2);
        }
        long j3 = this.i;
        this.i = java.lang.Math.max(j3, jMax + j3);
        defpackage.aiof aiofVar6 = defpackage.adhn.a;
        arrayList2.size();
    }
}
