package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwo implements defpackage.tem {
    public static final aimz a = aimz.i("com/android/dialer/contactsearch/ExtendedDirectorySearchDataSource");
    private static final java.lang.String[] f = {"_id", "displayName", "photoSupport"};
    private static final java.lang.String g = "length(" + thq.b()[3] + ") < 1000 AND " + thq.b()[3] + " IS NOT NULL";
    public final android.content.Context b;
    public final aoin c;
    public final tek d;
    public final aonj e;
    private final ojo h;
    private final ajct i;

    public lwo(android.content.Context context, ojo ojoVar, ajct ajctVar, aoin aoinVar) {
        aooh.f(context, "context");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(ajctVar, "backgroundExecutor");
        this.b = context;
        this.h = ojoVar;
        this.i = ajctVar;
        this.c = aoinVar;
        this.d = tek.e;
        this.e = new aiuo(new defpackage.kqu(this, (aoln) null, 3));
    }

    public static final boolean e(long j) {
        if (sns.d(j)) {
            return false;
        }
        return fh$.ExternalSyntheticApiModelOutline0.m(j) || fh$.ExternalSyntheticApiModelOutline0.m$1(j);
    }

    @Override // defpackage.tem
    public final tek a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.lwk lwkVar;
        if (aolnVar instanceof defpackage.lwk) {
            lwkVar = (defpackage.lwk) aolnVar;
            int i = lwkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwkVar.c = i - Integer.MIN_VALUE;
            } else {
                lwkVar = new defpackage.lwk(this, aolnVar);
            }
        } else {
            lwkVar = new defpackage.lwk(this, aolnVar);
        }
        defpackage.lwk lwkVar2 = lwkVar;
        java.lang.Object objI = lwkVar2.a;
        java.util.ArrayList arrayList = aolu.a;
        int i2 = lwkVar2.c;
        if (i2 == 0) {
            aooc.af(objI);
            ojo ojoVar = this.h;
            android.net.Uri uriM$1 = fh$.ExternalSyntheticApiModelOutline0.m$1();
            aooh.e(uriM$1, "ENTERPRISE_CONTENT_URI");
            java.lang.String[] strArr = f;
            lwl lwlVar = new lwl(this, 0);
            lwkVar2.c = 1;
            objI = ojoVar.i(uriM$1, strArr, (java.lang.String) null, (java.lang.String[]) null, "_id", lwlVar, lwkVar2);
            if (objI != arrayList) {
            }
            return arrayList;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objI);
        arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : (java.lang.Iterable) objI) {
            if (e(((defpackage.lwi) obj).a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.tem
    public final aoxh c(tei teiVar) {
        aooh.f(teiVar, "query");
        return new aowy(new defpackage.lwe(teiVar, this, (aoln) null, 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.lwi lwiVar, java.lang.String str, aoln aolnVar) throws java.lang.Exception {
        defpackage.lwn lwnVar;
        java.util.List list;
        if (aolnVar instanceof defpackage.lwn) {
            lwnVar = (defpackage.lwn) aolnVar;
            int i = lwnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwnVar.c = i - Integer.MIN_VALUE;
            } else {
                lwnVar = new defpackage.lwn(this, aolnVar);
            }
        } else {
            lwnVar = new defpackage.lwn(this, aolnVar);
        }
        java.lang.Object objD = lwnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lwnVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objD);
                android.net.Uri uriBuild = android.net.Uri.withAppendedPath(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, "filter_enterprise").buildUpon().appendPath(str).appendQueryParameter("directory", java.lang.String.valueOf(lwiVar.a)).appendQueryParameter("remove_duplicate_entries", "true").appendQueryParameter("limit", "200").build();
                ojo ojoVar = this.h;
                aooh.c(uriBuild);
                ajck ajckVarH = ojoVar.d(uriBuild, thq.b(), g, (java.lang.String[]) null, thq.b()[11]).c(ahqx.e(new vuq(this, str, lwiVar, 1)), this.i).h();
                aooh.e(ajckVarH, "finishToFuture(...)");
                lwnVar.d = lwiVar;
                lwnVar.c = 1;
                objD = aosv.D(ajckVarH, lwnVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lwiVar = lwnVar.d;
                aooc.af(objD);
            }
            aooh.c(objD);
            list = (java.util.List) objD;
        } catch (java.lang.Exception e) {
            if (e instanceof java.util.concurrent.CancellationException) {
                throw e;
            }
            a.b().k(e).l("com/android/dialer/contactsearch/ExtendedDirectorySearchDataSource", "search", 187, "ExtendedDirectorySearchDataSource.kt").v("Error while fetching directory, it will be ignored.");
            list = aokc.a;
        }
        return list.isEmpty() ? aokc.a : ajsz.bT(ajsz.aY(lwiVar), list);
    }
}
