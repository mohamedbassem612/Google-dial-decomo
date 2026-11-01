package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adlx {
    public final java.lang.String a;
    public final java.util.List b;
    public final java.util.Set c;
    public final defpackage.adlt f;
    public boolean d = false;
    public defpackage.ajcq e = defpackage.ajcm.a;
    private defpackage.ajcq g = null;

    public adlx(java.lang.String str, java.util.List list, java.util.Set set, defpackage.adlt adltVar) {
        this.a = str;
        this.b = list;
        this.c = set;
        this.f = adltVar;
    }

    public final synchronized void a() {
        this.d = true;
        defpackage.ajcq ajcqVar = this.g;
        if (ajcqVar != null) {
            ajcqVar.cancel(false);
        }
    }

    final synchronized void b(defpackage.adlx adlxVar) {
        defpackage.ajcq ajcqVar = adlxVar.g;
        if (ajcqVar != null) {
            c(ajcqVar);
        }
    }

    final synchronized void c(defpackage.ajcq ajcqVar) {
        this.e = ajcqVar;
    }

    public final synchronized void d(defpackage.ajcq ajcqVar) {
        this.g = ajcqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v4, types: [ajcq, java.lang.Object] */
    public final defpackage.ajcq e(java.util.Collection collection, boolean z, defpackage.adjz adjzVar, defpackage.ajct ajctVar, defpackage.adjl adjlVar, defpackage.apnt apntVar, defpackage.gat gatVar) {
        int i;
        defpackage.adip adipVar;
        defpackage.adim adimVarC;
        defpackage.admd admdVar;
        defpackage.adkm adkmVar;
        defpackage.adhp adhpVar;
        java.lang.String str;
        defpackage.adiz adizVar;
        long jReplaceOrThrow;
        defpackage.aiof aiofVar = defpackage.adhn.a;
        collection.size();
        int i2 = 4;
        if (z) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifestF = ((com.google.android.libraries.micore.superpacks.common.Slice) it.next()).f();
                boolean zExists = adjzVar.f(packManifestF.p()).exists();
                com.google.android.libraries.micore.superpacks.base.BasePriority basePriorityB = adjzVar.b(((defpackage.adhb) packManifestF.p()).a);
                defpackage.adkc adkcVarG = defpackage.adkd.g();
                adkcVarG.d(2);
                defpackage.adhw adhwVarP = packManifestF.p();
                java.lang.String strL = packManifestF.l();
                int i3 = defpackage.adho.a;
                adkcVarG.c(adhwVarP);
                adkcVarG.e(packManifestF.d());
                hashSet.add(adkcVarG.a());
                if (!zExists) {
                    defpackage.adhw adhwVarA = defpackage.adho.a(adhwVarP, strL);
                    adkcVarG.c(packManifestF.p());
                    adkcVarG.b(packManifestF.b());
                    adkcVarG.a = basePriorityB;
                    if (strL == null) {
                        adkcVarG.c(adhwVarA);
                        adkcVarG.e(0L);
                        hashSet.add(adkcVarG.a());
                    } else {
                        adkcVarG.c(adhwVarA);
                        adkcVarG.e(packManifestF.c());
                        hashSet.add(adkcVarG.a());
                        adkcVarG.c(defpackage.adho.b(adhwVarP));
                        adkcVarG.e(0L);
                        hashSet.add(adkcVarG.a());
                    }
                }
            }
            defpackage.aiof aiofVar2 = defpackage.adhn.a;
            hashSet.size();
            new defpackage.adfi(hashSet, i2).eZ();
            adjzVar.k(new java.util.ArrayList(hashSet));
        }
        java.util.Iterator it2 = collection.iterator();
        do {
            defpackage.adip adipVar2 = null;
            if (it2.hasNext()) {
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifestF2 = ((com.google.android.libraries.micore.superpacks.common.Slice) it2.next()).f();
                defpackage.adjk adjkVar = new defpackage.adjk(packManifestF2.p(), packManifestF2.l());
                str = this.a;
                try {
                    adizVar = ((defpackage.adjq) adjlVar).b;
                    android.database.sqlite.SQLiteDatabase writableDatabase = adizVar.getWritableDatabase();
                    android.content.ContentValues contentValues = new android.content.ContentValues(3);
                    contentValues.put("parent_id", str);
                    contentValues.put("pack_name", adjkVar.a.toString());
                    contentValues.put("packing_scheme", adjkVar.b);
                    jReplaceOrThrow = writableDatabase.replaceOrThrow("pending_packs", null, contentValues);
                } catch (android.database.sqlite.SQLiteException e) {
                    defpackage.adiz adizVar2 = ((defpackage.adjq) adjlVar).b;
                    java.io.IOException iOException = new java.io.IOException("SqlitePendingPacks#add, SQL replace failed, parentId: ".concat(str), e);
                    adizVar2.a(iOException);
                    throw iOException;
                }
            } else {
                java.util.ArrayList<defpackage.adld> arrayList = new java.util.ArrayList(collection.size());
                java.util.Iterator it3 = collection.iterator();
                while (true) {
                    int i4 = 0;
                    if (!it3.hasNext()) {
                        java.util.HashMap map = new java.util.HashMap();
                        for (defpackage.adld adldVar : arrayList) {
                            com.google.android.libraries.micore.superpacks.common.PackManifest packManifestF3 = adldVar.d().f();
                            defpackage.adhw adhwVarP2 = adldVar.d().f().p();
                            defpackage.aiof aiofVar3 = defpackage.adhn.c;
                            ?? r6 = gatVar.a;
                            defpackage.ajxw ajxwVar = (defpackage.ajxw) r6.get(adhwVarP2);
                            if (ajxwVar != null) {
                                defpackage.aiof aiofVar4 = defpackage.adhn.c;
                                i = 1;
                                ajxwVar.c.cancel(true);
                                ((defpackage.adhh) ajxwVar.a).b();
                            } else {
                                i = 1;
                            }
                            defpackage.ajxw ajxwVar2 = new defpackage.ajxw(adldVar);
                            defpackage.ajcq ajcqVarD = gatVar.D(ajxwVar2);
                            defpackage.ajcq[] ajcqVarArr = new defpackage.ajcq[i];
                            ajcqVarArr[0] = ajcqVarD;
                            defpackage.ajcq ajcqVarC = new defpackage.anpu(false, defpackage.aify.o(ajcqVarArr)).c(new defpackage.vuw(gatVar, adhwVarP2, ajcqVarD, 3), gatVar.d);
                            ajxwVar2.c = ajcqVarC;
                            r6.put(adhwVarP2, ajxwVar2);
                            map.put(packManifestF3, defpackage.aiql.A(ajcqVarC));
                        }
                        return new defpackage.anpu(false, defpackage.aify.j(map.values())).b(new defpackage.nyf(collection, map, 13), ajctVar);
                    }
                    com.google.android.libraries.micore.superpacks.common.Slice slice = (com.google.android.libraries.micore.superpacks.common.Slice) it3.next();
                    com.google.android.libraries.micore.superpacks.common.PackManifest packManifestF4 = slice.f();
                    java.util.Iterator it4 = apntVar.i().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            adipVar = adipVar2;
                            adimVarC = adipVar;
                            break;
                        }
                        adipVar = (defpackage.adip) it4.next();
                        adimVarC = adipVar.c(packManifestF4);
                        if (adimVarC != null) {
                            defpackage.aiof aiofVar5 = defpackage.adhn.a;
                            adipVar.a();
                            break;
                        }
                    }
                    if (adipVar == null) {
                        throw new adlq(packManifestF4);
                    }
                    adimVarC.getClass();
                    java.lang.String str2 = adimVarC.b;
                    if (str2 != null) {
                        java.util.Iterator it5 = apntVar.j().iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                adhpVar = adipVar2;
                                break;
                            }
                            adhpVar = (defpackage.admd) it5.next();
                            if (defpackage.admd.f(str2)) {
                                defpackage.aiof aiofVar6 = defpackage.adhn.a;
                                break;
                            }
                        }
                        if (adhpVar == null) {
                            throw new adlr(packManifestF4, str2);
                        }
                        admdVar = adhpVar;
                    } else {
                        admdVar = adipVar2;
                    }
                    defpackage.aify aifyVarH = packManifestF4.h();
                    int i5 = ((defpackage.aike) aifyVarH).d;
                    defpackage.aigb aigbVar = adipVar2;
                    while (i4 < i5) {
                        java.lang.String str3 = (java.lang.String) aifyVarH.get(i4);
                        java.util.Iterator it6 = apntVar.k().iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                adkmVar = null;
                                break;
                            }
                            adkmVar = (defpackage.adkm) it6.next();
                            defpackage.agab agabVar = adkmVar.b;
                            if (str3 != null && defpackage.agab.ci(str3) != null) {
                                defpackage.aiof aiofVar7 = defpackage.adhn.a;
                                break;
                            }
                        }
                        if (adkmVar == null) {
                            throw new adls(packManifestF4, str3);
                        }
                        if (aigbVar == 0) {
                            aigbVar = new defpackage.aigb(4);
                        }
                        aigbVar.i(str3, adkmVar);
                        i4++;
                        aigbVar = aigbVar;
                    }
                    arrayList.add(new defpackage.adkj(slice, adipVar, adimVarC, admdVar, aigbVar == 0 ? defpackage.aikj.b : aigbVar.e(true), apntVar.h(((defpackage.adhb) packManifestF4.p()).a)));
                    adipVar2 = null;
                }
            }
        } while (jReplaceOrThrow >= 0);
        java.io.IOException iOException2 = new java.io.IOException("SqlitePendingPacks#add, SQL replace returned < 0, parentId: " + str + " rowId: " + jReplaceOrThrow);
        adizVar.a(iOException2);
        throw iOException2;
    }
}
