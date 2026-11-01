package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class khc {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/halo/impl/appdisplayname/HaloAppDisplayName");
    private final j$.util.concurrent.ConcurrentHashMap b = new j$.util.concurrent.ConcurrentHashMap();
    private final defpackage.kaw c;
    private final defpackage.rsr d;

    public khc(defpackage.rsr rsrVar, defpackage.kaw kawVar) {
        this.d = rsrVar;
        this.c = kawVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final java.lang.Object a(java.lang.String str, defpackage.aoln aolnVar) {
        kha khaVar;
        java.lang.Object obj;
        ?? r5;
        java.lang.CharSequence charSequence;
        if (aolnVar instanceof kha) {
            khaVar = (kha) aolnVar;
            int i = khaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                khaVar.d = i - Integer.MIN_VALUE;
            } else {
                khaVar = new kha(this, aolnVar);
            }
        } else {
            khaVar = new kha(this, aolnVar);
        }
        java.lang.Object obj2 = khaVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = khaVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.b;
            obj = concurrentHashMap.get(str);
            if (obj == null) {
                khaVar.a = concurrentHashMap;
                khaVar.e = str;
                khaVar.d = 1;
                java.lang.Object objB = b(str, khaVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                obj2 = objB;
                r5 = concurrentHashMap;
            }
            charSequence = (java.lang.CharSequence) obj;
            if (charSequence.length() == 0) {
                return null;
            }
            return charSequence;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = khaVar.e;
        java.lang.Object obj3 = khaVar.a;
        defpackage.aooc.af(obj2);
        r5 = obj3;
        java.lang.String str2 = (java.lang.String) obj2;
        if (str2 == null) {
            str2 = "";
        }
        obj = str2;
        java.lang.Object objPutIfAbsent = r5.putIfAbsent(str, obj);
        if (objPutIfAbsent != null) {
            obj = objPutIfAbsent;
        }
        charSequence = (java.lang.CharSequence) obj;
        if (charSequence.length() == 0) {
            return null;
        }
        return charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object b(java.lang.String str, defpackage.aoln aolnVar) {
        khb khbVar;
        if (aolnVar instanceof khb) {
            khbVar = (khb) aolnVar;
            int i = khbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                khbVar.c = i - Integer.MIN_VALUE;
            } else {
                khbVar = new khb(this, aolnVar);
            }
        } else {
            khbVar = new khb(this, aolnVar);
        }
        java.lang.Object objAj = khbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = khbVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            defpackage.kaw kawVar = this.c;
            defpackage.aooh.f(str, "packageName");
            java.lang.String str2 = (java.lang.String) j$.util.DesugarCollections.unmodifiableMap(((defpackage.ypy) kawVar.a.a()).b).get(str);
            if (str2 != null) {
                ((defpackage.aimw) a.b().l("com/android/dialer/calllog/halo/impl/appdisplayname/HaloAppDisplayName", "getWithoutCache$<anonymous>", 35, "HaloAppDisplayName.kt")).y("haloFlagProvidedAppDisplayName found: %s", str);
                return str2;
            }
            defpackage.rsr rsrVar = this.d;
            khbVar.d = str;
            khbVar.c = 1;
            objAj = defpackage.aoov.aj(rsrVar.b, new kdr(rsrVar, str, (defpackage.aoln) null, 2), khbVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = khbVar.d;
            defpackage.aooc.af(objAj);
        }
        java.lang.String str3 = (java.lang.String) objAj;
        defpackage.aimz aimzVar = a;
        if (str3 != null) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/calllog/halo/impl/appdisplayname/HaloAppDisplayName", "getWithoutCache$<anonymous>", 41, "HaloAppDisplayName.kt")).y("haloAppDisplayNameFetcher found: %s", str);
            return str3;
        }
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/calllog/halo/impl/appdisplayname/HaloAppDisplayName", "getWithoutCache", 45, "HaloAppDisplayName.kt")).y("display name not found: %s", str);
        return null;
    }
}
