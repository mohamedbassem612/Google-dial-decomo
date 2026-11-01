package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sia {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/patrick/impl/storage/PatrickCpgStorage");
    public final defpackage.aolr b;
    public final defpackage.aoin c;
    public final defpackage.ipc d;
    private final defpackage.aolr e;

    public sia(defpackage.ipc ipcVar, defpackage.aolr aolrVar, defpackage.aolr aolrVar2, defpackage.aoin aoinVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableCallingCardRepositoryV2");
        }
        this.d = ipcVar;
        this.e = aolrVar;
        this.b = aolrVar2;
        this.c = aoinVar;
    }

    public static final void j(abuk abukVar) {
        abuf abufVar = abukVar.a;
        abuf abufVar2 = abuf.c;
        defpackage.aimz aimzVar = a;
        if (abufVar == abufVar2) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "logDeleteItemError", 505, "PatrickCpgStorage.kt")).v("Delete my calling card from CPG failed due not existing card for identifier");
        } else {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).k(abukVar.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "logDeleteItemError", 510, "PatrickCpgStorage.kt")).y("Item error deleting my calling card from CPG with status: %s", new defpackage.aepg((java.lang.Enum) abufVar));
        }
    }

    private final java.lang.Object k(java.util.List list) {
        abuk abukVar;
        abuf abufVar;
        abui abuiVar;
        abuf abufVar2;
        if (list.size() != 1) {
            throw new java.lang.IllegalStateException("Expected exactly one calling card, but got " + list.size());
        }
        abuj abujVar = (abuo) defpackage.ajsz.bM(list);
        j$.util.Objects.checkIndex(0, 6);
        if (abujVar != null) {
            if (abujVar instanceof abuj) {
                if (!((java.lang.Boolean) this.c.a()).booleanValue()) {
                    return null;
                }
                abuq abuqVar = abujVar.a;
                ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "handleFetchCallingCardResponse", 305, "PatrickCpgStorage.kt")).v("callingCardCpgData received successfully");
                j$.util.Objects.checkIndex(0, 4);
                if (abuqVar instanceof abuq) {
                    abuq abuqVar2 = abuqVar;
                    return defpackage.abts.b(abuqVar2.b, abuqVar2.a, null, null);
                }
                if (abuqVar instanceof abuz) {
                    abuz abuzVar = (abuz) abuqVar;
                    return defpackage.abts.b(abuzVar.b, abuzVar.a, abuzVar.e, abuzVar.c);
                }
                if (!(abuqVar instanceof abvc)) {
                    throw new defpackage.aois();
                }
                abvc abvcVar = (abvc) abuqVar;
                return defpackage.abts.b(abvcVar.b, abvcVar.a, abvcVar.d, abvcVar.c);
            }
            if (abujVar instanceof abui) {
                if (!((java.lang.Boolean) this.c.a()).booleanValue() || (abufVar2 = (abuiVar = (abui) abujVar).a) == abuf.c) {
                    return null;
                }
                ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abuiVar.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "handleFetchCallingCardResponse", 317, "PatrickCpgStorage.kt")).y("Error fetching calling card from CPG with status: %s", new defpackage.aepg((java.lang.Enum) abufVar2));
                return null;
            }
            if (abujVar instanceof abuk) {
                if (!((java.lang.Boolean) this.c.a()).booleanValue() || (abufVar = (abukVar = (abuk) abujVar).a) == abuf.c) {
                    return null;
                }
                ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abukVar.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "handleFetchCallingCardResponse", 331, "PatrickCpgStorage.kt")).y("Item error fetching calling card from CPG with status: %s", new defpackage.aepg((java.lang.Enum) abufVar));
                return null;
            }
            if (abujVar instanceof abue) {
                abud abudVar = (abud) defpackage.ajsz.bO(((abue) abujVar).a);
                if (abudVar == null) {
                    ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "handleFetchCallingCardResponse", 343, "PatrickCpgStorage.kt")).v("Either received no response or multiple response from getCallingCard.");
                    return null;
                }
                abuf abufVar3 = abudVar.a;
                if (abufVar3 != abuf.l) {
                    ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "handleFetchCallingCardResponse", 347, "PatrickCpgStorage.kt")).y("Failed to fetch the data. %s", abufVar3);
                    return null;
                }
                abtw abtwVar = abudVar.b;
                defpackage.aimz aimzVar = a;
                if (abtwVar == null) {
                    ((defpackage.aimw) aimzVar.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "handleFetchCallingCardResponse", 352, "PatrickCpgStorage.kt")).v("callingCardCpgData is null, even with SUCCESS status");
                    return null;
                }
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "handleFetchCallingCardResponse", 355, "PatrickCpgStorage.kt")).v("callingCardCpgData fetched with SUCCESS status with non-null object.");
                return defpackage.abts.b(abtwVar.b, abtwVar.a, null, null);
            }
            if (abujVar instanceof abub) {
                ((defpackage.aimw) ((defpackage.aimw) a.c()).k(((abub) abujVar).a).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "handleFetchCallingCardResponse", 360, "PatrickCpgStorage.kt")).v("Error fetching calling card from CPG.");
                return null;
            }
        }
        ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "handleFetchCallingCardResponse", 364, "PatrickCpgStorage.kt")).y("Unknown response type %s encountered while fetching calling card from CPG.", abujVar);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[Catch: all -> 0x018e, TRY_ENTER, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011e A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0122 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x012a A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x013e A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0142 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0147 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x014f A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0153 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0171 A[Catch: all -> 0x018e, TryCatch #2 {all -> 0x018e, blocks: (B:12:0x0026, B:29:0x0086, B:32:0x0097, B:34:0x009b, B:36:0x00a9, B:61:0x0184, B:37:0x00af, B:39:0x00b3, B:41:0x00c1, B:42:0x00e7, B:44:0x00eb, B:46:0x00f9, B:47:0x011e, B:49:0x0122, B:51:0x012a, B:52:0x013e, B:54:0x0142, B:55:0x0147, B:56:0x014e, B:57:0x014f, B:59:0x0153, B:60:0x0171), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(abxt abxtVar, defpackage.aoln aolnVar) throws java.io.IOException {
        shr shrVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        abug abugVar;
        long jLongValue;
        abty abtyVar;
        abuf abufVar;
        java.lang.Long l;
        if (aolnVar instanceof shr) {
            shrVar = (shr) aolnVar;
            int i = shrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shrVar.c = i - Integer.MIN_VALUE;
            } else {
                shrVar = new shr(this, aolnVar);
            }
        } else {
            shrVar = new shr(this, aolnVar);
        }
        shr shrVar2 = shrVar;
        java.lang.Object obj = shrVar2.a;
        java.lang.Object l2 = defpackage.aolu.a;
        int i2 = shrVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(shrVar2.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(798, "PatrickCpgStorage_createContactCallingCard");
            try {
                abxp abxpVar = abxtVar.c;
                if (abxpVar == null) {
                    abxpVar = abxp.a;
                }
                java.lang.String str = (abxpVar.b == 1 ? (abxs) abxpVar.c : abxs.a).f;
                defpackage.aooh.e(str, "getImageUri(...)");
                android.net.Uri uri = android.net.Uri.parse(str);
                defpackage.aooh.e(uri, "parse(...)");
                defpackage.ipc ipcVar = this.d;
                abuc abucVar = abuc.b;
                amjp amjpVarC = defpackage.abts.c(abxtVar);
                afaw afawVarP = defpackage.snl.P(abxtVar);
                shrVar2.d = ahoqVarZ;
                shrVar2.c = 1;
                java.lang.Object objAu = ipcVar.au(uri, abucVar, amjpVarC, afawVarP, shrVar2);
                if (objAu != l2) {
                    obj = objAu;
                    ahoqVar = ahoqVarZ;
                    abugVar = (abuo) obj;
                    j$.util.Objects.checkIndex(0, 6);
                    jLongValue = -1;
                    if (abugVar == null) {
                        ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 98, "PatrickCpgStorage.kt")).y("Unknown response type %s encountered while creating calling card in CPG.", abugVar);
                    } else if (abugVar instanceof abug) {
                        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                            jLongValue = abugVar.a;
                        }
                    } else if (abugVar instanceof abui) {
                        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                            abui abuiVar = (abui) abugVar;
                            ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abuiVar.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 61, "PatrickCpgStorage.kt")).y("Error creating calling card in CPG with status: %s", new defpackage.aepg((java.lang.Enum) abuiVar.a));
                        }
                    } else if (abugVar instanceof abuk) {
                        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                            abuk abukVar = (abuk) abugVar;
                            ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abukVar.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 72, "PatrickCpgStorage.kt")).y("Item error creating calling card in CPG with status: %s", new defpackage.aepg((java.lang.Enum) abukVar.a));
                        }
                    } else if (abugVar instanceof abty) {
                        abtyVar = (abty) abugVar;
                        abufVar = abtyVar.a;
                        if (abufVar != abuf.l) {
                            ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 83, "PatrickCpgStorage.kt")).y("Failed to create the data. %s", abufVar);
                        } else {
                            l = abtyVar.b;
                            if (l != null) {
                                throw new java.lang.IllegalStateException("Calling card ID is null, even with SUCCESS status");
                            }
                            jLongValue = l.longValue();
                        }
                    } else if (abugVar instanceof abub) {
                        ((defpackage.aimw) ((defpackage.aimw) a.c()).k(((abub) abugVar).a).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 94, "PatrickCpgStorage.kt")).v("Error creating calling card in CPG.");
                    } else {
                        ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 98, "PatrickCpgStorage.kt")).y("Unknown response type %s encountered while creating calling card in CPG.", abugVar);
                    }
                    l2 = new java.lang.Long(jLongValue);
                    defpackage.ajsz.ak(ahoqVar, null);
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = shrVar2.d;
            try {
                defpackage.aooc.af(obj);
                abugVar = (abuo) obj;
                j$.util.Objects.checkIndex(0, 6);
                jLongValue = -1;
                if (abugVar == null) {
                    ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 98, "PatrickCpgStorage.kt")).y("Unknown response type %s encountered while creating calling card in CPG.", abugVar);
                } else if (abugVar instanceof abug) {
                    if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                        jLongValue = abugVar.a;
                    }
                } else if (abugVar instanceof abui) {
                    if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                        abui abuiVar2 = (abui) abugVar;
                        ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abuiVar2.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 61, "PatrickCpgStorage.kt")).y("Error creating calling card in CPG with status: %s", new defpackage.aepg((java.lang.Enum) abuiVar2.a));
                    }
                } else if (abugVar instanceof abuk) {
                    if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                        abuk abukVar2 = (abuk) abugVar;
                        ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abukVar2.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 72, "PatrickCpgStorage.kt")).y("Item error creating calling card in CPG with status: %s", new defpackage.aepg((java.lang.Enum) abukVar2.a));
                    }
                } else if (abugVar instanceof abty) {
                    abtyVar = (abty) abugVar;
                    abufVar = abtyVar.a;
                    if (abufVar != abuf.l) {
                        ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 83, "PatrickCpgStorage.kt")).y("Failed to create the data. %s", abufVar);
                    } else {
                        l = abtyVar.b;
                        if (l != null) {
                            throw new java.lang.IllegalStateException("Calling card ID is null, even with SUCCESS status");
                        }
                        jLongValue = l.longValue();
                    }
                } else if (abugVar instanceof abub) {
                    ((defpackage.aimw) ((defpackage.aimw) a.c()).k(((abub) abugVar).a).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 94, "PatrickCpgStorage.kt")).v("Error creating calling card in CPG.");
                } else {
                    ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "createContactCallingCard$<anonymous>", 98, "PatrickCpgStorage.kt")).y("Unknown response type %s encountered while creating calling card in CPG.", abugVar);
                }
                l2 = new java.lang.Long(jLongValue);
                defpackage.ajsz.ak(ahoqVar, null);
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th4;
                }
            }
        }
        return l2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(long j, defpackage.aoln aolnVar) throws java.io.IOException {
        shs shsVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        java.lang.Object obj;
        if (aolnVar instanceof shs) {
            shsVar = (shs) aolnVar;
            int i = shsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shsVar.c = i - Integer.MIN_VALUE;
            } else {
                shsVar = new shs(this, aolnVar);
            }
        } else {
            shsVar = new shs(this, aolnVar);
        }
        java.lang.Object obj2 = shsVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = shsVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (!defpackage.ahvr.R(shsVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(799, "PatrickCpgStorage_deleteContactCallingCard");
            try {
                defpackage.aolr aolrVar = this.e;
                atg atgVar = new atg(this, j, (defpackage.aoln) null, 19);
                shsVar.d = ahoqVarZ;
                shsVar.c = 1;
                java.lang.Object objAj = defpackage.aoov.aj(aolrVar, atgVar, shsVar);
                obj = aoluVar;
                if (objAj != aoluVar) {
                    obj2 = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = shsVar.d;
        try {
            defpackage.aooc.af(obj2);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        bool.booleanValue();
        defpackage.ajsz.ak(ahoqVar, null);
        obj = bool;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.util.List list, defpackage.aoln aolnVar) throws java.io.IOException {
        sht shtVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        java.lang.Object obj;
        if (aolnVar instanceof sht) {
            shtVar = (sht) aolnVar;
            int i = shtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shtVar.c = i - Integer.MIN_VALUE;
            } else {
                shtVar = new sht(this, aolnVar);
            }
        } else {
            shtVar = new sht(this, aolnVar);
        }
        java.lang.Object obj2 = shtVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = shtVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (!defpackage.ahvr.R(shtVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(800, "PatrickCpgStorage_deleteMyCallingCard");
            try {
                defpackage.aolr aolrVar = this.e;
                rka rkaVar = new rka(this, list, (defpackage.aoln) null, 12);
                shtVar.d = ahoqVarZ;
                shtVar.c = 1;
                java.lang.Object objAj = defpackage.aoov.aj(aolrVar, rkaVar, shtVar);
                obj = aoluVar;
                if (objAj != aoluVar) {
                    obj2 = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = shtVar.d;
        try {
            defpackage.aooc.af(obj2);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        bool.booleanValue();
        defpackage.ajsz.ak(ahoqVar, null);
        obj = bool;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) throws java.io.IOException {
        shu shuVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        java.lang.Object obj;
        if (aolnVar instanceof shu) {
            shuVar = (shu) aolnVar;
            int i = shuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shuVar.c = i - Integer.MIN_VALUE;
            } else {
                shuVar = new shu(this, aolnVar);
            }
        } else {
            shuVar = new shu(this, aolnVar);
        }
        java.lang.Object obj2 = shuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = shuVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (!defpackage.ahvr.R(shuVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(801, "PatrickCpgStorage_deleteSelfMyCallingCards");
            try {
                defpackage.aolr aolrVar = this.e;
                sge sgeVar = new sge(this, (defpackage.aoln) null, 7);
                shuVar.d = ahoqVarZ;
                shuVar.c = 1;
                java.lang.Object objAj = defpackage.aoov.aj(aolrVar, sgeVar, shuVar);
                obj = aoluVar;
                if (objAj != aoluVar) {
                    obj2 = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = shuVar.d;
        try {
            defpackage.aooc.af(obj2);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        bool.booleanValue();
        defpackage.ajsz.ak(ahoqVar, null);
        obj = bool;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(long j, defpackage.aoln aolnVar) throws java.io.IOException {
        shv shvVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        defpackage.ahoq ahoqVar2;
        if (aolnVar instanceof shv) {
            shvVar = (shv) aolnVar;
            int i = shvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shvVar.c = i - Integer.MIN_VALUE;
            } else {
                shvVar = new shv(this, aolnVar);
            }
        } else {
            shvVar = new shv(this, aolnVar);
        }
        java.lang.Object objK = shvVar.a;
        abxt abxtVar = defpackage.aolu.a;
        int i2 = shvVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            if (!defpackage.ahvr.R(shvVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(802, "PatrickCpgStorage_fetchContactCallingCard");
            try {
                shvVar.e = ahoqVarZ;
                shvVar.d = this;
                shvVar.c = 1;
                java.lang.Object objAy = this.d.ay(new long[]{j}, shvVar);
                if (objAy != abxtVar) {
                    objK = objAy;
                    ahoqVar2 = ahoqVarZ;
                }
                return abxtVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = shvVar.e;
            try {
                defpackage.aooc.af(objK);
                abxtVar = (abxt) objK;
                defpackage.ajsz.ak(ahoqVar, null);
                return abxtVar;
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th4;
                }
            }
        }
        this = shvVar.d;
        ahoqVar2 = shvVar.e;
        try {
            defpackage.aooc.af(objK);
        } catch (java.lang.Throwable th5) {
            defpackage.ahoq ahoqVar3 = ahoqVar2;
            th = th5;
            ahoqVar = ahoqVar3;
            throw th;
        }
        shvVar.e = ahoqVar2;
        shvVar.d = null;
        shvVar.c = 2;
        objK = this.k((java.util.List) objK);
        if (objK != abxtVar) {
            ahoqVar = ahoqVar2;
            abxtVar = (abxt) objK;
            defpackage.ajsz.ak(ahoqVar, null);
        }
        return abxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) throws java.io.IOException {
        shw shwVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        defpackage.ahoq ahoqVar2;
        if (aolnVar instanceof shw) {
            shwVar = (shw) aolnVar;
            int i = shwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shwVar.c = i - Integer.MIN_VALUE;
            } else {
                shwVar = new shw(this, aolnVar);
            }
        } else {
            shwVar = new shw(this, aolnVar);
        }
        java.lang.Object objK = shwVar.a;
        abxt abxtVar = defpackage.aolu.a;
        int i2 = shwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            if (!defpackage.ahvr.R(shwVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(803, "PatrickCpgStorage_fetchMyCallingCard");
            try {
                defpackage.ipc ipcVar = this.d;
                siq[] siqVarArr = {new sip(str, str2)};
                shwVar.e = ahoqVarZ;
                shwVar.d = this;
                shwVar.c = 1;
                java.lang.Object objAz = ipcVar.az(siqVarArr, shwVar);
                if (objAz != abxtVar) {
                    objK = objAz;
                    ahoqVar2 = ahoqVarZ;
                }
                return abxtVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = shwVar.e;
            try {
                defpackage.aooc.af(objK);
                abxtVar = (abxt) objK;
                defpackage.ajsz.ak(ahoqVar, null);
                return abxtVar;
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th4;
                }
            }
        }
        this = shwVar.d;
        ahoqVar2 = shwVar.e;
        try {
            defpackage.aooc.af(objK);
        } catch (java.lang.Throwable th5) {
            defpackage.ahoq ahoqVar3 = ahoqVar2;
            th = th5;
            ahoqVar = ahoqVar3;
            throw th;
        }
        shwVar.e = ahoqVar2;
        shwVar.d = null;
        shwVar.c = 2;
        objK = this.k((java.util.List) objK);
        if (objK != abxtVar) {
            ahoqVar = ahoqVar2;
            abxtVar = (abxt) objK;
            defpackage.ajsz.ak(ahoqVar, null);
        }
        return abxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object g(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) throws java.io.IOException {
        shx shxVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        defpackage.ahoq ahoqVar2;
        if (aolnVar instanceof shx) {
            shxVar = (shx) aolnVar;
            int i = shxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shxVar.c = i - Integer.MIN_VALUE;
            } else {
                shxVar = new shx(this, aolnVar);
            }
        } else {
            shxVar = new shx(this, aolnVar);
        }
        java.lang.Object objK = shxVar.a;
        abxt abxtVar = defpackage.aolu.a;
        int i2 = shxVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            if (!defpackage.ahvr.R(shxVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(804, "PatrickCpgStorage_getSelfMyCallingCard");
            try {
                ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "getSelfMyCallingCard$<anonymous>", 214, "PatrickCpgStorage.kt")).v("getSelfMyCallingCard");
                defpackage.ipc ipcVar = this.d;
                siq[] siqVarArr = {new sio(str, str2)};
                shxVar.e = ahoqVarZ;
                shxVar.d = this;
                shxVar.c = 1;
                java.lang.Object objAz = ipcVar.az(siqVarArr, shxVar);
                if (objAz != abxtVar) {
                    objK = objAz;
                    ahoqVar2 = ahoqVarZ;
                }
                return abxtVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = shxVar.e;
            try {
                defpackage.aooc.af(objK);
                abxtVar = (abxt) objK;
                defpackage.ajsz.ak(ahoqVar, null);
                return abxtVar;
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th4;
                }
            }
        }
        this = shxVar.d;
        ahoqVar2 = shxVar.e;
        try {
            defpackage.aooc.af(objK);
        } catch (java.lang.Throwable th5) {
            defpackage.ahoq ahoqVar3 = ahoqVar2;
            th = th5;
            ahoqVar = ahoqVar3;
            throw th;
        }
        shxVar.e = ahoqVar2;
        shxVar.d = null;
        shxVar.c = 2;
        objK = this.k((java.util.List) objK);
        if (objK != abxtVar) {
            ahoqVar = ahoqVar2;
            abxtVar = (abxt) objK;
            defpackage.ajsz.ak(ahoqVar, null);
        }
        return abxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0106 A[Catch: all -> 0x0123, TryCatch #0 {all -> 0x0123, blocks: (B:12:0x0028, B:29:0x0085, B:32:0x0094, B:34:0x0098, B:36:0x009c, B:38:0x00aa, B:39:0x00cf, B:41:0x00d3, B:43:0x00e1, B:46:0x011a, B:44:0x0106), top: B:59:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object h(java.lang.String str, abxt abxtVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, defpackage.aoln aolnVar) throws java.io.IOException {
        shy shyVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof shy) {
            shyVar = (shy) aolnVar;
            int i = shyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shyVar.c = i - Integer.MIN_VALUE;
            } else {
                shyVar = new shy(this, aolnVar);
            }
        } else {
            shyVar = new shy(this, aolnVar);
        }
        shy shyVar2 = shyVar;
        java.lang.Object objAD = shyVar2.a;
        java.lang.Object objValueOf = defpackage.aolu.a;
        int i2 = shyVar2.c;
        boolean z = true;
        if (i2 == 0) {
            defpackage.aooc.af(objAD);
            if (!defpackage.ahvr.R(shyVar2.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(805, "PatrickCpgStorage_upsertMyCallingCard");
            try {
                abxp abxpVar = abxtVar.c;
                if (abxpVar == null) {
                    abxpVar = abxp.a;
                }
                java.lang.String str5 = (abxpVar.b == 1 ? (abxs) abxpVar.c : abxs.a).f;
                defpackage.aooh.e(str5, "getImageUri(...)");
                android.net.Uri uri = android.net.Uri.parse(str5);
                defpackage.aooh.e(uri, "parse(...)");
                defpackage.ipc ipcVar = this.d;
                amjp amjpVarC = defpackage.abts.c(abxtVar);
                afaw afawVarP = defpackage.snl.P(abxtVar);
                shyVar2.d = ahoqVarZ;
                shyVar2.c = 1;
                objAD = ipcVar.aD(str, uri, amjpVarC, str2, str3, str4, afawVarP, shyVar2);
                if (objAD != objValueOf) {
                    ahoqVar = ahoqVarZ;
                }
                return objValueOf;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = shyVar2.d;
        try {
            defpackage.aooc.af(objAD);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        abui abuiVar = (abuo) objAD;
        j$.util.Objects.checkIndex(0, 4);
        if (abuiVar == null) {
            ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "upsertMyCallingCard$<anonymous>", 154, "PatrickCpgStorage.kt")).y("Unknown response type %s encountered while upserting My Calling Card in CPG.", abuiVar);
            z = false;
        } else if (!(abuiVar instanceof abum)) {
            if (abuiVar instanceof abui) {
                if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                    abui abuiVar2 = abuiVar;
                    ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abuiVar2.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "upsertMyCallingCard$<anonymous>", 134, "PatrickCpgStorage.kt")).y("Error upserting my calling card in CPG with status: %s", new defpackage.aepg((java.lang.Enum) abuiVar2.a));
                }
            } else if (!(abuiVar instanceof abuk)) {
                ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "upsertMyCallingCard$<anonymous>", 154, "PatrickCpgStorage.kt")).y("Unknown response type %s encountered while upserting My Calling Card in CPG.", abuiVar);
            } else if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                abuk abukVar = (abuk) abuiVar;
                ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abukVar.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "upsertMyCallingCard$<anonymous>", 145, "PatrickCpgStorage.kt")).y("Item error upserting my calling card in CPG with status: %s", new defpackage.aepg((java.lang.Enum) abukVar.a));
            }
            z = false;
        }
        objValueOf = java.lang.Boolean.valueOf(z);
        defpackage.ajsz.ak(ahoqVar, null);
        return objValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ff A[Catch: all -> 0x011c, TryCatch #2 {all -> 0x011c, blocks: (B:12:0x0026, B:36:0x009a, B:39:0x00a9, B:41:0x00ad, B:43:0x00b1, B:44:0x00d6, B:46:0x00da, B:49:0x0113, B:47:0x00ff), top: B:66:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(java.lang.String str, java.lang.String str2, abxt abxtVar, defpackage.aoln aolnVar) throws java.io.IOException {
        shz shzVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof shz) {
            shzVar = (shz) aolnVar;
            int i = shzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shzVar.c = i - Integer.MIN_VALUE;
            } else {
                shzVar = new shz(this, aolnVar);
            }
        } else {
            shzVar = new shz(this, aolnVar);
        }
        shz shzVar2 = shzVar;
        java.lang.Object obj = shzVar2.a;
        java.lang.Object objValueOf = defpackage.aolu.a;
        int i2 = shzVar2.c;
        boolean z = true;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(shzVar2.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(806, "PatrickCpgStorage_upsertSelfMyCallingCard");
            try {
                abxp abxpVar = abxtVar.c;
                if (abxpVar == null) {
                    abxpVar = abxp.a;
                }
                java.lang.String str3 = (abxpVar.b == 1 ? (abxs) abxpVar.c : abxs.a).f;
                defpackage.aooh.e(str3, "getImageUri(...)");
                android.net.Uri uri = android.net.Uri.parse(str3);
                defpackage.aooh.e(uri, "parse(...)");
                defpackage.ipc ipcVar = this.d;
                amjp amjpVarC = defpackage.abts.c(abxtVar);
                abxp abxpVar2 = abxtVar.c;
                if (abxpVar2 == null) {
                    abxpVar2 = abxp.a;
                }
                java.lang.String str4 = (abxpVar2.b == 1 ? (abxs) abxpVar2.c : abxs.a).g;
                defpackage.aooh.e(str4, "getPhotoToken(...)");
                afaw afawVarP = defpackage.snl.P(abxtVar);
                shzVar2.d = ahoqVarZ;
                shzVar2.c = 1;
                java.lang.Object objAE = ipcVar.aE(str, str2, uri, amjpVarC, str4, afawVarP, shzVar2);
                if (objAE != objValueOf) {
                    obj = objAE;
                    ahoqVar = ahoqVarZ;
                }
                return objValueOf;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = shzVar2.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        abui abuiVar = (abuo) obj;
        j$.util.Objects.checkIndex(0, 4);
        if (abuiVar == null) {
            ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "upsertSelfMyCallingCard$<anonymous>", 203, "PatrickCpgStorage.kt")).y("Unknown response type %s encountered while upserting My Calling Card in CPG.", abuiVar);
            z = false;
        } else if (!(abuiVar instanceof abun)) {
            if (abuiVar instanceof abui) {
                abui abuiVar2 = abuiVar;
                ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abuiVar2.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "upsertSelfMyCallingCard$<anonymous>", 186, "PatrickCpgStorage.kt")).y("Error upserting my calling card in CPG with status: %s", new defpackage.aepg((java.lang.Enum) abuiVar2.a));
            } else if (abuiVar instanceof abuk) {
                abuk abukVar = (abuk) abuiVar;
                ((defpackage.aimw) ((defpackage.aimw) a.c()).k(abukVar.b).l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "upsertSelfMyCallingCard$<anonymous>", 195, "PatrickCpgStorage.kt")).y("Item error upserting my calling card in CPG with status: %s", new defpackage.aepg((java.lang.Enum) abukVar.a));
            } else {
                ((defpackage.aimw) a.d().l("com/android/dialer/patrick/impl/storage/PatrickCpgStorage", "upsertSelfMyCallingCard$<anonymous>", 203, "PatrickCpgStorage.kt")).y("Unknown response type %s encountered while upserting My Calling Card in CPG.", abuiVar);
            }
            z = false;
        }
        objValueOf = java.lang.Boolean.valueOf(z);
        defpackage.ajsz.ak(ahoqVar, null);
        return objValueOf;
    }
}
