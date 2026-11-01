package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ixx {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/settings/greeting/service/BotGreetingWriter");
    public final defpackage.aolr b;
    public final android.content.Context c;
    public final defpackage.kaw d;
    public final defpackage.rsr e;
    public final defpackage.ipc f;
    public final defpackage.aogc g;
    private final defpackage.aolr h;
    private final defpackage.iql i;
    private final defpackage.ivi j;
    private final defpackage.iqm k;

    public ixx(defpackage.aolr aolrVar, defpackage.aolr aolrVar2, defpackage.iql iqlVar, defpackage.kaw kawVar, defpackage.rsr rsrVar, defpackage.aogc aogcVar, defpackage.ipc ipcVar, android.content.Context context, defpackage.ivi iviVar, defpackage.iqm iqmVar) {
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(aolrVar2, "blockingContext");
        defpackage.aooh.f(aogcVar, "synchronousFileStorage");
        defpackage.aooh.f(context, "appContext");
        this.h = aolrVar;
        this.b = aolrVar2;
        this.i = iqlVar;
        this.d = kawVar;
        this.e = rsrVar;
        this.g = aogcVar;
        this.f = ipcVar;
        this.c = context;
        this.j = iviVar;
        this.k = iqmVar;
    }

    private final java.lang.Object d(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.h, new hyq(this, str, str2, (defpackage.aoln) null, 9), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f5 -> B:44:0x00f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.aoln r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixx.a(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        ixw ixwVar;
        if (aolnVar instanceof ixw) {
            ixwVar = (ixw) aolnVar;
            int i = ixwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixwVar.c = i - Integer.MIN_VALUE;
            } else {
                ixwVar = new ixw(this, aolnVar);
            }
        } else {
            ixwVar = new ixw(this, aolnVar);
        }
        java.lang.Object objD = ixwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            ixwVar.d = str;
            ixwVar.e = str2;
            ixwVar.c = 1;
            objD = d(str, str2, ixwVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = ixwVar.e;
            str = ixwVar.d;
            defpackage.aooc.af(objD);
        }
        if (objD != null) {
            return objD;
        }
        throw new java.lang.IllegalArgumentException("Failed to retrieve simplified bot greeting for version: " + str + " and locale: " + str2 + '.');
    }

    public final java.lang.Object c(java.io.File file, java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.h, new isf(file, this, str, str2, (defpackage.aoln) null, 2), aolnVar);
    }
}
