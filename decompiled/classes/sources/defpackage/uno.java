package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uno {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/speeddial/bar/impl/data/FavoritesBarDataMutator");
    private final defpackage.uqc b;

    public uno(defpackage.uqc uqcVar) {
        if (uqcVar == null) {
            defpackage.aooh.i("speedDialUiItemMutator");
        }
        this.b = uqcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(android.net.Uri uri, defpackage.aoln aolnVar) {
        unl unlVar;
        if (aolnVar instanceof unl) {
            unlVar = (unl) aolnVar;
            int i = unlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                unlVar.c = i - Integer.MIN_VALUE;
            } else {
                unlVar = new unl(this, aolnVar);
            }
        } else {
            unlVar = new unl(this, aolnVar);
        }
        java.lang.Object obj = unlVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = unlVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ((defpackage.aimw) a.b().l("com/android/dialer/speeddial/bar/impl/data/FavoritesBarDataMutator", "starContact", 28, "FavoritesBarDataMutator.kt")).y("starContact: %s", uri);
            defpackage.uqc uqcVar = this.b;
            ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "starContact", 280, "SpeedDialUiItemMutator.java")).v("enter");
            defpackage.ajcq ajcqVarD = uqcVar.k.d(defpackage.ahqx.i(new syg(uqcVar, uri, 17, (byte[]) null)), uqcVar.c);
            defpackage.aooh.e(ajcqVarD, "starContact(...)");
            unlVar.c = 1;
            if (defpackage.aosv.D(ajcqVarD, unlVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        unm unmVar;
        java.lang.Object next;
        if (aolnVar instanceof unm) {
            unmVar = (unm) aolnVar;
            int i = unmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                unmVar.d = i - Integer.MIN_VALUE;
            } else {
                unmVar = new unm(this, aolnVar);
            }
        } else {
            unmVar = new unm(this, aolnVar);
        }
        java.lang.Object objD = unmVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = unmVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                j = unmVar.a;
                defpackage.aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objD);
        defpackage.ajcq ajcqVarB = this.b.b();
        defpackage.aooh.e(ajcqVarB, "loadSpeedDialUiItems(...)");
        unmVar.a = j;
        unmVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarB, unmVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        defpackage.aify aifyVar = (defpackage.aify) objD;
        defpackage.aooh.c(aifyVar);
        java.util.Iterator<E> it = aifyVar.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((upt) next).c != j);
        upt uptVar = (upt) next;
        if (uptVar == null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/speeddial/bar/impl/data/FavoritesBarDataMutator", "unstarContact", 21, "FavoritesBarDataMutator.kt")).v("No speedDialUiItem to remove");
            return defpackage.aojh.a;
        }
        defpackage.ajcq ajcqVarC = this.b.c(uptVar);
        defpackage.aooh.e(ajcqVarC, "removeSpeedDialUiItem(...)");
        unmVar.d = 2;
        if (defpackage.aosv.D(ajcqVarC, unmVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    public final java.lang.Object c(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        unn unnVar;
        ?? r10;
        if (aolnVar instanceof unn) {
            unnVar = (unn) aolnVar;
            int i = unnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                unnVar.d = i - Integer.MIN_VALUE;
            } else {
                unnVar = new unn(this, aolnVar);
            }
        } else {
            unnVar = new unn(this, aolnVar);
        }
        java.lang.Object objD = unnVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = unnVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = unnVar.a;
                defpackage.aooc.af(objD);
                r10 = obj;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objD);
        defpackage.ajcq ajcqVarB = this.b.b();
        defpackage.aooh.e(ajcqVarB, "loadSpeedDialUiItems(...)");
        unnVar.a = list;
        unnVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarB, unnVar);
        if (objD == aoluVar) {
            r10 = list;
            return aoluVar;
        }
        r10 = list;
        defpackage.aify aifyVar = (defpackage.aify) objD;
        defpackage.aooh.c(aifyVar);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(aifyVar, 10)), 16));
        for (java.lang.Object obj2 : aifyVar) {
            linkedHashMap.put(new java.lang.Long(((upt) obj2).c), obj2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = r10.iterator();
        while (it.hasNext()) {
            upt uptVar = (upt) linkedHashMap.get(new java.lang.Long(((java.lang.Number) it.next()).longValue()));
            if (uptVar == null) {
                ((defpackage.aimw) a.b().l("com/android/dialer/speeddial/bar/impl/data/FavoritesBarDataMutator", "updatePinnedPosition$<anonymous>$<anonymous>", 38, "FavoritesBarDataMutator.kt")).v("No speedDialUiItem with the given speedDialEntryId");
            } else {
                arrayList.add(uptVar);
            }
        }
        defpackage.ajcq ajcqVarD = this.b.d(arrayList);
        unnVar.a = null;
        unnVar.d = 2;
        if (defpackage.aosv.D(ajcqVarD, unnVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }
}
