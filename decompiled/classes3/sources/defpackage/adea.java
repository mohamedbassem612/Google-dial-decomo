package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adea extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    int g;
    final /* synthetic */ qx h;
    final /* synthetic */ defpackage.adei i;
    final /* synthetic */ java.lang.String j;
    final /* synthetic */ java.lang.String k;
    final /* synthetic */ defpackage.adec l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adea(qx qxVar, defpackage.adei adeiVar, java.lang.String str, java.lang.String str2, defpackage.adec adecVar, aoln aolnVar) {
        super(2, aolnVar);
        this.h = qxVar;
        this.i = adeiVar;
        this.j = str;
        this.k = str2;
        this.l = adecVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0098 A[Catch: all -> 0x017a, LOOP:0: B:16:0x0092->B:18:0x0098, LOOP_END, TryCatch #0 {all -> 0x017a, blocks: (B:15:0x0076, B:16:0x0092, B:18:0x0098, B:19:0x00ae, B:20:0x00d3, B:22:0x00d9, B:24:0x00f0, B:26:0x00f8, B:27:0x011f, B:29:0x014c, B:31:0x0154, B:33:0x015d, B:35:0x016c), top: B:45:0x0076, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9 A[Catch: all -> 0x017a, TryCatch #0 {all -> 0x017a, blocks: (B:15:0x0076, B:16:0x0092, B:18:0x0098, B:19:0x00ae, B:20:0x00d3, B:22:0x00d9, B:24:0x00f0, B:26:0x00f8, B:27:0x011f, B:29:0x014c, B:31:0x0154, B:33:0x015d, B:35:0x016c), top: B:45:0x0076, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.String strSubstring;
        java.lang.String strSubstring2;
        java.lang.String str;
        defpackage.akxm akxmVar;
        java.util.Map map;
        java.util.Map map2;
        java.lang.String strH;
        com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo g3AttributionInfo;
        java.util.Map map3;
        aolu aoluVar = aolu.a;
        int i = this.g;
        try {
            if (i != 0) {
                if (i != 1) {
                    obj5 = this.f;
                    obj3 = this.e;
                    obj2 = this.d;
                    java.lang.Object obj8 = this.c;
                    java.lang.Object obj9 = this.b;
                    obj4 = this.a;
                    aooc.af(obj);
                    obj7 = obj8;
                    obj6 = obj9;
                } else {
                    aooc.af(obj);
                }
                try {
                    aimz aimzVar = defpackage.adei.a;
                    ((defpackage.adei) obj7).i.j((java.lang.String) obj2);
                    for (pw pwVar : ((pd) obj4).b().values()) {
                        aooh.c(pwVar);
                        ((defpackage.adei) obj7).l((java.lang.String) obj2, (java.lang.String) obj3, pwVar);
                    }
                    strSubstring = ((java.lang.String) obj3).substring(9);
                    strSubstring2 = ((qx) obj5).d.substring(10);
                    java.util.Map mapA = ((pd) obj4).a();
                    aooh.e(mapA, "getFailures(...)");
                    for (java.util.Map.Entry entry : mapA.entrySet()) {
                        str = (java.lang.String) entry.getKey();
                        if (((pg) entry.getValue()).a != 6) {
                            if (str.startsWith("__G3_TAG__")) {
                                defpackage.vqy vqyVar = ((defpackage.adei) obj7).g;
                                aooh.c(strSubstring);
                                aooh.c(strSubstring2);
                                vqyVar.b((java.lang.String) obj2, strSubstring, strSubstring2);
                                defpackage.adei.a.c().l("com/google/android/libraries/mdi/search/g3appsearch/app/impl/G3GlobalSearchSessionImpl$TagStoreObserver", "onDocumentChanged$<anonymous>$<anonymous>", 753, "G3GlobalSearchSessionImpl.kt").I("Schema tag document '%s' was removed from package '%s'", str, obj2);
                            } else {
                                akxmVar = ((defpackage.adei) obj7).h;
                                aooh.c(strSubstring);
                                aooh.c(strSubstring2);
                                aooh.c(str);
                                aooh.f(obj2, "packageName");
                                aooh.f(strSubstring, "databaseName");
                                aooh.f(strSubstring2, "schemaType");
                                aooh.f(str, "id");
                                map = (java.util.Map) akxmVar.d.get(obj2);
                                map2 = null;
                                if (map != null && (map3 = (java.util.Map) map.get(strSubstring)) != null) {
                                    map2 = (java.util.Map) map3.get(strSubstring2);
                                }
                                if (map2 != null) {
                                    strH = defpackage.akxm.h((java.lang.String) obj2, strSubstring, strSubstring2, str);
                                    g3AttributionInfo = (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo) map2.remove(strH);
                                    if (g3AttributionInfo != null) {
                                        akxmVar.g((java.lang.String) obj2, strSubstring2, strH, g3AttributionInfo);
                                    }
                                }
                            }
                        }
                    }
                    return aojh.a;
                } finally {
                    ((apdp) obj6).d();
                }
            }
            aooc.af(obj);
            qx qxVar = this.h;
            java.lang.String str2 = qxVar.c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.Set set = qxVar.e;
            dzk.x(set);
            arrayList.addAll(set);
            ajcq ajcqVarB = this.i.e.b(this.j, this.k, new px(str2, arrayList, bundle));
            this.g = 1;
            obj = aosv.D(ajcqVarB, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            pd pdVar = (pd) obj;
            defpackage.adei adeiVar = this.i;
            apdp apdpVar = adeiVar.f;
            obj2 = this.j;
            obj3 = this.k;
            qx qxVar2 = this.h;
            this.a = pdVar;
            this.b = apdpVar;
            this.c = adeiVar;
            this.d = obj2;
            this.e = obj3;
            this.f = qxVar2;
            this.g = 2;
            if (apdpVar.b(this) == aoluVar) {
                return aoluVar;
            }
            obj4 = pdVar;
            obj5 = qxVar2;
            obj7 = adeiVar;
            obj6 = apdpVar;
            aimz aimzVar2 = defpackage.adei.a;
            ((defpackage.adei) obj7).i.j((java.lang.String) obj2);
            while (r12.hasNext()) {
                aooh.c(pwVar);
                ((defpackage.adei) obj7).l((java.lang.String) obj2, (java.lang.String) obj3, pwVar);
            }
            strSubstring = ((java.lang.String) obj3).substring(9);
            strSubstring2 = ((qx) obj5).d.substring(10);
            java.util.Map mapA2 = ((pd) obj4).a();
            aooh.e(mapA2, "getFailures(...)");
            while (r11.hasNext()) {
                str = (java.lang.String) entry.getKey();
                if (((pg) entry.getValue()).a != 6) {
                    if (str.startsWith("__G3_TAG__")) {
                        defpackage.vqy vqyVar2 = ((defpackage.adei) obj7).g;
                        aooh.c(strSubstring);
                        aooh.c(strSubstring2);
                        vqyVar2.b((java.lang.String) obj2, strSubstring, strSubstring2);
                        defpackage.adei.a.c().l("com/google/android/libraries/mdi/search/g3appsearch/app/impl/G3GlobalSearchSessionImpl$TagStoreObserver", "onDocumentChanged$<anonymous>$<anonymous>", 753, "G3GlobalSearchSessionImpl.kt").I("Schema tag document '%s' was removed from package '%s'", str, obj2);
                    } else {
                        akxmVar = ((defpackage.adei) obj7).h;
                        aooh.c(strSubstring);
                        aooh.c(strSubstring2);
                        aooh.c(str);
                        aooh.f(obj2, "packageName");
                        aooh.f(strSubstring, "databaseName");
                        aooh.f(strSubstring2, "schemaType");
                        aooh.f(str, "id");
                        map = (java.util.Map) akxmVar.d.get(obj2);
                        map2 = null;
                        if (map != null) {
                            map2 = (java.util.Map) map3.get(strSubstring2);
                        }
                        if (map2 != null) {
                            strH = defpackage.akxm.h((java.lang.String) obj2, strSubstring, strSubstring2, str);
                            g3AttributionInfo = (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo) map2.remove(strH);
                            if (g3AttributionInfo != null) {
                                akxmVar.g((java.lang.String) obj2, strSubstring2, strH, g3AttributionInfo);
                            }
                        }
                    }
                }
            }
            return aojh.a;
        } catch (java.lang.Exception e) {
            defpackage.adei.a.c().k(e).l("com/google/android/libraries/mdi/search/g3appsearch/app/impl/G3GlobalSearchSessionImpl$TagStoreObserver", "onDocumentChanged$<anonymous>", 769, "G3GlobalSearchSessionImpl.kt").v("Exception thrown in TagStore observer onDocumentChanged");
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.adea(this.h, this.i, this.j, this.k, this.l, aolnVar);
    }
}
