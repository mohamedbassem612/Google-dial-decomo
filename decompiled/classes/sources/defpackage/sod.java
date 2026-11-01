package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sod {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String[] b = {"lookup_key", "package_name", "display_name", "photo_uri", "capability"};
    private static final defpackage.aimz c = defpackage.aimz.i("com/android/dialer/peopledirectory/PeopleDirectoryFetcher");
    private final defpackage.ojo d;

    public sod(defpackage.ojo ojoVar) {
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        this.d = ojoVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.Map] */
    public final java.lang.Object a(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Exception {
        soc socVar;
        abvr abvrVar;
        ?? r11;
        if (aolnVar instanceof soc) {
            socVar = (soc) aolnVar;
            int i = socVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                socVar.d = i - Integer.MIN_VALUE;
            } else {
                socVar = new soc(this, aolnVar);
            }
        } else {
            socVar = new soc(this, aolnVar);
        }
        soc socVar2 = socVar;
        java.lang.Object obj = socVar2.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = socVar2.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                if (!list.isEmpty()) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sof sofVar = (sof) it.next();
                        java.lang.String lastPathSegment = sofVar.a.getLastPathSegment();
                        if (lastPathSegment != null) {
                            java.lang.String str = sofVar.b;
                            java.lang.Object linkedHashMap2 = linkedHashMap.get(str);
                            if (linkedHashMap2 == null) {
                                linkedHashMap2 = new java.util.LinkedHashMap();
                                linkedHashMap.put(str, linkedHashMap2);
                            }
                            ((java.util.Map) linkedHashMap2).put(lastPathSegment, sofVar);
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        skx skxVar = new skx(linkedHashMap, 14);
                        android.net.Uri uri = abvv.a;
                        if (android.os.Build.VERSION.SDK_INT < 37 || defpackage.a.D() < 3700002) {
                            abvrVar = new abvr(1, (byte[]) null);
                        } else {
                            boolean z = c.a;
                            if (android.os.Build.VERSION.SDK_INT < 36 || defpackage.a.D() < 3700002) {
                                if (!c.a) {
                                    c.a();
                                }
                                if (!c.b) {
                                    abvrVar = new abvr(1, (byte[]) null);
                                }
                            }
                            abvrVar = new abvr(0);
                        }
                        skxVar.a(abvrVar);
                        android.os.Bundle bundleA = abvrVar.a();
                        defpackage.ojo ojoVar = this.d;
                        android.net.Uri uri2 = abvu.a;
                        android.net.Uri uri3 = abvu.a;
                        java.lang.String[] strArr = b;
                        sqs sqsVar = sqs.b;
                        socVar2.a = linkedHashMap;
                        socVar2.d = 1;
                        java.lang.Object objH = ojoVar.h(uri3, strArr, bundleA, sqsVar, socVar2);
                        if (objH == aoluVar) {
                            return aoluVar;
                        }
                        obj = objH;
                        r11 = linkedHashMap;
                    }
                }
                return defpackage.aokd.a;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = socVar2.a;
            defpackage.aooc.af(obj);
            r11 = obj2;
            defpackage.aola aolaVar = new defpackage.aola(8);
            for (soe soeVar : (defpackage.aify) obj) {
                java.lang.String str2 = soeVar.b;
                if (str2.length() == 0) {
                    ((defpackage.aimw) c.d().l("com/android/dialer/peopledirectory/PeopleDirectoryFetcher", "matchResultsToOriginalUris$<anonymous>", 83, "PeopleDirectoryFetcher.kt")).v("Missing lookup key, ignoring entry");
                } else {
                    java.lang.String str3 = soeVar.c;
                    if (str3.length() == 0) {
                        ((defpackage.aimw) c.d().l("com/android/dialer/peopledirectory/PeopleDirectoryFetcher", "matchResultsToOriginalUris$<anonymous>", 88, "PeopleDirectoryFetcher.kt")).v("Missing package name, ignoring entry");
                    } else {
                        java.util.Map map = (java.util.Map) r11.get(str3);
                        sof sofVar2 = map != null ? (sof) map.get(str2) : null;
                        if (sofVar2 == null) {
                            ((defpackage.aimw) c.d().l("com/android/dialer/peopledirectory/PeopleDirectoryFetcher", "matchResultsToOriginalUris$<anonymous>", 94, "PeopleDirectoryFetcher.kt")).v("This person's URI is not among the requested URIs, ignoring entry.");
                        } else {
                            aolaVar.put(sofVar2, soeVar);
                        }
                    }
                }
            }
            return aolaVar.e();
        } catch (java.lang.Exception e) {
            if (e instanceof java.util.concurrent.CancellationException) {
                throw e;
            }
            ((defpackage.aimw) ((defpackage.aimw) c.d()).k(e).l("com/android/dialer/peopledirectory/PeopleDirectoryFetcher", "getByLookupUris", 56, "PeopleDirectoryFetcher.kt")).v("Error querying people provider for batch lookup URIs");
            return defpackage.aokd.a;
        }
    }
}
