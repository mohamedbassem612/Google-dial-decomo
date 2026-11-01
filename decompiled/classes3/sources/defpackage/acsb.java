package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acsb implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ acsb(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object a(java.lang.Object obj) {
        boolean z;
        switch (this.$cid) {
            case 0:
                java.util.Map map = defpackage.acsc.a;
                return afsq.aW((defpackage.aogy) obj);
            case 1:
                java.util.Map map2 = defpackage.acsc.a;
                return afsq.aV((defpackage.aogy) obj);
            case 2:
                java.util.Map map3 = defpackage.acsd.a;
                return afsq.aT((defpackage.aogy) obj);
            case 3:
                java.util.Map map4 = defpackage.acsd.a;
                return afsq.aU((defpackage.aogy) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.util.Map map5 = defpackage.acsd.a;
                return afsq.aV((defpackage.aogy) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.util.Map map6 = defpackage.acsd.a;
                return afsq.aW((defpackage.aogy) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                dmy dmyVar = (dmy) obj;
                aooh.f(dmyVar, "setting");
                return "'" + dmyVar.a() + "' " + dmyVar.c();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                we weVar = new we((byte[]) null);
                java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(((pd) obj).c);
                aooh.e(mapUnmodifiableMap, "getAll(...)");
                for (java.util.Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    pg pgVar = (pg) entry.getValue();
                    if (pgVar.b()) {
                        weVar.d(str, pgVar.a());
                    } else {
                        weVar.b(str, pgVar.a, pgVar.b);
                    }
                }
                return weVar.a();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.util.List list = (java.util.List) obj;
                aooh.f(list, "results");
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((defpackage.addc) it.next()).a);
                }
                return arrayList;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.String str2 = (java.lang.String) obj;
                aooh.f(str2, "it");
                return java.lang.Boolean.valueOf(aoov.ad(str2, "com.google.android"));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.util.List list2 = (java.util.List) obj;
                if (!list2.contains("g3attrinfo")) {
                    aify aifyVar = com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo.a;
                    aooh.e(aifyVar, "INDEXED_PROPERTY_PATH_LIST");
                    z = list2.containsAll(aifyVar) ? false : true;
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aify aifyVar2 = com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo.a;
                aooh.e(aifyVar2, "INDEXED_PROPERTY_PATH_LIST");
                return java.lang.Boolean.valueOf(!((java.util.List) obj).containsAll(aifyVar2));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.String str3 = (java.lang.String) obj;
                aooh.f(str3, "it");
                return "\"" + str3 + '\"';
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.String str4 = (java.lang.String) obj;
                aooh.f(str4, "it");
                return "\"" + str4 + '\"';
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                aiof aiofVar = aebs.a;
                aooh.f((java.util.Map) obj, "it");
                break;
            case 16:
                int i = aebz.b;
                aooh.f((java.util.Map) obj, "it");
                return aojh.a;
            case 17:
                return aesg.p(obj);
            case 18:
                java.lang.Enum r6 = (java.lang.Enum) obj;
                aooh.f(r6, "it");
                return r6.name() + '(' + ((defpackage.aehi) r6).a() + ')';
            case 19:
                diq diqVar = (diq) obj;
                aimz aimzVar = defpackage.afny.a;
                aooh.f(diqVar, "$this$semantics");
                dfb.f(diqVar);
                return aojh.a;
            default:
                aimz aimzVar2 = defpackage.afny.a;
                aooh.f((bcg) obj, "$this$item");
                return new bbl(wl.b(bcg.b));
        }
        return aojh.a;
    }
}
