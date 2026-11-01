package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lnx extends gcp {
    public final defpackage.lnv b;
    public final rlv c;
    public final gpd d;
    private final uzx e;

    public lnx(defpackage.lnv lnvVar, uzx uzxVar, rlv rlvVar, gpd gpdVar) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.b = lnvVar;
        this.e = uzxVar;
        this.c = rlvVar;
        this.d = gpdVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(gcq gcqVar) {
        aooh.f(gcqVar, "state");
        java.lang.Integer num = gcqVar.b;
        if (num == null) {
            return null;
        }
        return java.lang.Integer.valueOf(aooc.t(num.intValue() - (gcqVar.c.a / 2), 0));
    }

    public final java.lang.Object b(gcl gclVar, aoln aolnVar) {
        return this.e.aN("ContactsPagingSource#load", new defpackage.bhp(gclVar, this, (aoln) null, 12), aolnVar);
    }

    public final boolean d() {
        return true;
    }

    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(final int i, final int i2, boolean z, aoln aolnVar) {
        defpackage.lnw lnwVar;
        java.lang.String str;
        java.util.List list;
        gco gcoVar;
        java.lang.Integer num;
        java.lang.Integer num2;
        if (aolnVar instanceof defpackage.lnw) {
            lnwVar = (defpackage.lnw) aolnVar;
            int i3 = lnwVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lnwVar.d = i3 - Integer.MIN_VALUE;
            } else {
                lnwVar = new defpackage.lnw(this, aolnVar);
            }
        } else {
            lnwVar = new defpackage.lnw(this, aolnVar);
        }
        java.lang.Object objD = lnwVar.b;
        aolu aoluVar = aolu.a;
        int i4 = lnwVar.d;
        if (i4 == 0) {
            aooc.af(objD);
            final defpackage.lnv lnvVar = this.b;
            lvs lvsVar = lnvVar.g;
            android.net.Uri uriCD = mni.cD();
            java.lang.String[] strArrCE = mni.cE(lvsVar);
            aooh.f(lvsVar, "contactDisplayPreferences");
            java.lang.String strValueOf = java.lang.String.valueOf(mni.cE(lvsVar)[1]);
            aooh.f(lvsVar, "contactDisplayPreferences");
            defpackage.lvp lvpVarB = lvsVar.b();
            if (lvpVarB != null) {
                int iOrdinal = lvpVarB.ordinal();
                if (iOrdinal != 0) {
                    str = iOrdinal == 1 ? "sort_key_alt" : "sort_key";
                }
                ajck ajckVarH = lnvVar.c.d(uriCD, strArrCE, strValueOf.concat(" IS NOT NULL"), (java.lang.String[]) null, str.concat(" ASC")).c(ahqx.e(new ajbc() { // from class: lnu
                    public final java.lang.Object a(ajyk ajykVar, java.lang.Object obj) {
                        java.lang.String str2;
                        java.util.Map.Entry entryFloorEntry;
                        java.util.TreeMap treeMap;
                        android.database.Cursor cursor = (android.database.Cursor) obj;
                        aooh.f(cursor, "cursor");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int count = cursor.getCount();
                        int i5 = count == 0 ? 0 : count + 1;
                        int i6 = i;
                        if (!cursor.moveToPosition(i6)) {
                            return new defpackage.lnt(i6, ajsz.bZ(arrayList), i5);
                        }
                        if (i6 == 0) {
                            android.net.Uri uri = android.net.Uri.EMPTY;
                            aooh.e(uri, "EMPTY");
                            arrayList.add(new defpackage.lns("+", "", 0L, uri, android.net.Uri.EMPTY, 0L, false));
                        }
                        defpackage.lnv lnvVar2 = lnvVar;
                        android.os.Bundle extras = cursor.getExtras();
                        if (lnvVar2.f == null && extras.containsKey("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES") && extras.containsKey("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS")) {
                            java.lang.String[] stringArray = extras.getStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES");
                            int[] intArray = extras.getIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS");
                            aooh.d(intArray, "null cannot be cast to non-null type kotlin.IntArray");
                            if (stringArray == null || intArray == null) {
                                treeMap = null;
                            } else {
                                treeMap = new java.util.TreeMap();
                                treeMap.put(0, "+");
                                int i7 = 1;
                                for (int i8 = 0; i8 < intArray.length; i8++) {
                                    treeMap.put(java.lang.Integer.valueOf(i7), stringArray[i8]);
                                    i7 += intArray[i8];
                                }
                            }
                            lnvVar2.f = treeMap;
                        }
                        int i9 = 0;
                        while (i9 != i2) {
                            int position = cursor.getPosition() + 1;
                            java.util.TreeMap treeMap2 = lnvVar2.f;
                            if (treeMap2 == null || (entryFloorEntry = treeMap2.floorEntry(java.lang.Integer.valueOf(position))) == null || (str2 = (java.lang.String) entryFloorEntry.getValue()) == null) {
                                str2 = "";
                            }
                            java.lang.String str3 = str2;
                            java.util.TreeMap treeMap3 = lnvVar2.f;
                            boolean zContainsKey = treeMap3 != null ? treeMap3.containsKey(java.lang.Integer.valueOf(cursor.getPosition() + 1)) : false;
                            aooh.f(cursor, "cursor");
                            long j = cursor.getLong(0);
                            java.lang.String string = cursor.getString(1);
                            long j2 = cursor.getLong(2);
                            java.lang.String string2 = cursor.getString(3);
                            java.lang.String string3 = cursor.getString(4);
                            android.net.Uri uri2 = string2 != null ? android.net.Uri.parse(string2) : null;
                            android.net.Uri lookupUri = android.provider.ContactsContract.Contacts.getLookupUri(j, string3);
                            aooh.c(string);
                            aooh.c(lookupUri);
                            arrayList.add(new defpackage.lns(str3, string, j, lookupUri, uri2, j2, zContainsKey));
                            i9++;
                            if (!cursor.moveToNext()) {
                                return new defpackage.lnt(cursor.getPosition() + 1, ajsz.bZ(arrayList), i5);
                            }
                        }
                        return new defpackage.lnt(cursor.getPosition(), ajsz.bZ(arrayList), i5);
                    }
                }), z ? lnvVar.d : lnvVar.e).h();
                aooh.e(ajckVarH, "finishToFuture(...)");
                lnwVar.a = i;
                lnwVar.d = 1;
                objD = aosv.D(ajckVarH, lnwVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            throw new java.lang.AssertionError("exhaustive switch when selecting contacts sort key");
        }
        if (i4 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = lnwVar.a;
        aooc.af(objD);
        defpackage.lnt lntVar = (defpackage.lnt) objD;
        int i5 = lntVar.a;
        if (i5 == 0) {
            java.util.List list2 = lntVar.b;
            if (list2.isEmpty()) {
                aooh.f(list2, "data");
                gcoVar = new gco(list2, (java.lang.Object) null, (java.lang.Object) null, Integer.MIN_VALUE, Integer.MIN_VALUE);
            } else {
                i5 = 0;
                list = lntVar.b;
                num = null;
                if (i == 0) {
                    num2 = null;
                } else {
                    num2 = new java.lang.Integer(i - 1);
                }
                if (!list.isEmpty() && i5 < lntVar.c) {
                    num = new java.lang.Integer(i5);
                }
                java.lang.Integer num3 = num;
                int iT = aooc.t(i, 0);
                int i6 = lntVar.c;
                gcoVar = new gco(list, num2, num3, aooc.u(iT, i6), aooc.t((i6 - i5) - 1, 0));
            }
        } else {
            list = lntVar.b;
            num = null;
            if (i == 0) {
                num2 = null;
            } else {
                num2 = new java.lang.Integer(i - 1);
            }
            if (!list.isEmpty()) {
                num = new java.lang.Integer(i5);
            }
            java.lang.Integer num4 = num;
            int iT2 = aooc.t(i, 0);
            int i7 = lntVar.c;
            gcoVar = new gco(list, num2, num4, aooc.u(iT2, i7), aooc.t((i7 - i5) - 1, 0));
        }
        return gcoVar;
    }
}
