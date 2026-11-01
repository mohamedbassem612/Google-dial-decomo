package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class giq {
    public final int a;
    public final /* synthetic */ defpackage.maw b;

    public giq(int i) {
        this.a = i;
    }

    public static final void a(java.lang.String str) {
        if (defpackage.aoov.s(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(true != z ? i : length);
            if (z) {
                if (cCharAt > ' ') {
                    break;
                } else {
                    length--;
                }
            } else if (cCharAt > ' ') {
                z = true;
            } else {
                i++;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() != 0) {
            android.util.Log.w("SupportSQLite", "deleting the database file: ".concat(java.lang.String.valueOf(str)));
            try {
                android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File(str));
            } catch (java.lang.Exception e) {
                android.util.Log.w("SupportSQLite", "delete failed: ", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[LOOP:4: B:9:0x001d->B:115:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    public final void b(defpackage.gip gipVar, int i, int i2) throws java.lang.Exception {
        java.lang.Iterable iterable;
        defpackage.ipc ipcVar;
        java.util.TreeMap treeMap;
        defpackage.aoiu aoiuVar;
        java.util.Iterator it;
        boolean z;
        int iIntValue;
        java.util.TreeMap treeMap2;
        defpackage.gjh gjhVar = new defpackage.gjh(gipVar);
        defpackage.maw mawVar = this.b;
        java.lang.Object obj = mawVar.e;
        if (i == i2) {
            iterable = defpackage.aokc.a;
        } else {
            boolean z2 = i2 > i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i3 = i;
            while (true) {
                if (z2) {
                    if (i3 < i2) {
                        ipcVar = ((defpackage.gfg) obj).r;
                        if (z2) {
                            treeMap2 = (java.util.TreeMap) ipcVar.a.get(java.lang.Integer.valueOf(i3));
                            if (treeMap2 != null) {
                                aoiuVar = new defpackage.aoiu(treeMap2, treeMap2.descendingKeySet());
                            } else {
                                aoiuVar = null;
                            }
                        } else {
                            treeMap = (java.util.TreeMap) ipcVar.a.get(java.lang.Integer.valueOf(i3));
                            if (treeMap == null) {
                                aoiuVar = null;
                            } else {
                                aoiuVar = new defpackage.aoiu(treeMap, treeMap.keySet());
                            }
                        }
                        if (aoiuVar != null) {
                            java.util.Map map = (java.util.Map) aoiuVar.a;
                            it = ((java.lang.Iterable) aoiuVar.b).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((java.lang.Number) it.next()).intValue();
                                if (z2) {
                                    if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                        java.lang.Object obj2 = map.get(java.lang.Integer.valueOf(iIntValue));
                                        defpackage.aooh.c(obj2);
                                        arrayList.add(obj2);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                    }
                                } else {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        java.lang.Object obj3 = map.get(java.lang.Integer.valueOf(iIntValue));
                                        defpackage.aooh.c(obj3);
                                        arrayList.add(obj3);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 <= i2) {
                    iterable = arrayList;
                } else {
                    ipcVar = ((defpackage.gfg) obj).r;
                    if (z2) {
                        treeMap2 = (java.util.TreeMap) ipcVar.a.get(java.lang.Integer.valueOf(i3));
                        if (treeMap2 != null) {
                            aoiuVar = new defpackage.aoiu(treeMap2, treeMap2.descendingKeySet());
                        } else {
                            aoiuVar = null;
                        }
                    } else {
                        treeMap = (java.util.TreeMap) ipcVar.a.get(java.lang.Integer.valueOf(i3));
                        if (treeMap == null) {
                            aoiuVar = null;
                        } else {
                            aoiuVar = new defpackage.aoiu(treeMap, treeMap.keySet());
                        }
                    }
                    if (aoiuVar != null) {
                        java.util.Map map2 = (java.util.Map) aoiuVar.a;
                        it = ((java.lang.Iterable) aoiuVar.b).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((java.lang.Number) it.next()).intValue();
                            if (z2) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                }
            }
        }
        if (iterable != null) {
            defpackage.gga ggaVar = (defpackage.gga) mawVar.b;
            ggaVar.d(gjhVar);
            java.util.Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((defpackage.ghg) it2.next()).b(gjhVar);
            }
            akwb akwbVarG = ggaVar.g(gjhVar);
            if (!akwbVarG.b) {
                throw new java.lang.IllegalStateException("Migration didn't properly handle: ".concat(java.lang.String.valueOf(akwbVarG.a)));
            }
            ggaVar.f();
            mawVar.a(gjhVar);
            return;
        }
        if (i <= i2 || !((defpackage.gfg) obj).i) {
            defpackage.gfg gfgVar = (defpackage.gfg) obj;
            java.util.Set set = gfgVar.j;
            if (gfgVar.h && !set.contains(java.lang.Integer.valueOf(i))) {
                throw new java.lang.IllegalStateException(defpackage.a.bA(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."));
            }
        }
        if (((defpackage.gfg) obj).m) {
            defpackage.gin ginVarA = gjhVar.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                defpackage.aokv aokvVar = new defpackage.aokv(10);
                while (ginVarA.m()) {
                    java.lang.String strE = ginVarA.e(0);
                    if (!defpackage.aoov.ad(strE, "sqlite_") && !defpackage.aooh.n(strE, "android_metadata")) {
                        aokvVar.add(new defpackage.aoiu(strE, java.lang.Boolean.valueOf(defpackage.aooh.n(ginVarA.e(1), "view"))));
                    }
                }
                java.util.List listAX = defpackage.ajsz.aX(aokvVar);
                defpackage.aooc.M(ginVarA, null);
                java.util.ListIterator listIterator = ((defpackage.aokv) listAX).listIterator(0);
                while (listIterator.hasNext()) {
                    defpackage.aoiu aoiuVar2 = (defpackage.aoiu) listIterator.next();
                    java.lang.String str = (java.lang.String) aoiuVar2.a;
                    if (((java.lang.Boolean) aoiuVar2.b).booleanValue()) {
                        defpackage.dzk.M(gjhVar, defpackage.a.bp((byte) 96, str, "DROP VIEW IF EXISTS `"));
                    } else {
                        defpackage.dzk.M(gjhVar, defpackage.a.bp((byte) 96, str, "DROP TABLE IF EXISTS `"));
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.aooc.M(ginVarA, th);
                    throw th2;
                }
            }
        } else {
            ((defpackage.gga) mawVar.b).b(gjhVar);
        }
        for (defpackage.gfz gfzVar : mawVar.a) {
        }
        ((defpackage.gga) mawVar.b).a(gjhVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public giq(defpackage.maw mawVar, int i) {
        this(i);
        this.b = mawVar;
    }
}
