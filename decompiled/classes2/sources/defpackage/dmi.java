package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dmi implements cer {
    public boolean a = true;
    public final ipc b;
    private final java.util.List c;
    private final dnj d;
    private final aonj e;
    private final ccp f;
    private final aogc g;

    public dmi(java.util.List list, java.lang.Object obj, dnj dnjVar, aogc aogcVar, aonj aonjVar, ipc ipcVar) {
        this.c = list;
        this.d = dnjVar;
        this.g = aogcVar;
        this.e = aonjVar;
        this.b = ipcVar;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cdu.c);
    }

    public final java.lang.Object a() {
        return this.f.a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:29:0x0084, B:31:0x00b0, B:18:0x0043, B:21:0x004d), top: B:39:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:29:0x0084, B:31:0x00b0, B:18:0x0043, B:21:0x004d), top: B:39:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #0 {all -> 0x00dd, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:29:0x0084, B:31:0x00b0, B:18:0x0043, B:21:0x004d), top: B:39:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0 A[Catch: all -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00dd, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:29:0x0084, B:31:0x00b0, B:18:0x0043, B:21:0x004d), top: B:39:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [dmp] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0065 -> B:33:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00be -> B:33:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(aoln r14) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmi.b(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object c(dmp dmpVar, aoln aolnVar) {
        defpackage.dmh dmhVar;
        if (aolnVar instanceof defpackage.dmh) {
            dmhVar = (defpackage.dmh) aolnVar;
            int i = dmhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmhVar.d = i - Integer.MIN_VALUE;
            } else {
                dmhVar = new defpackage.dmh(this, aolnVar);
            }
        } else {
            dmhVar = new defpackage.dmh(this, aolnVar);
        }
        java.lang.Object objM = dmhVar.b;
        aolu aoluVar = aolu.a;
        int i2 = dmhVar.d;
        try {
            if (i2 == 0) {
                aooc.af(objM);
                bnl bnlVar = new bnl(this, dmpVar, (aoln) null, 12);
                dmhVar.a = dmpVar;
                dmhVar.d = 1;
                objM = aooh.M(15000L, bnlVar, dmhVar);
                dmpVar = dmpVar;
                if (objM == aoluVar) {
                    objM = aoluVar;
                    dmpVar = dmpVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj = dmhVar.a;
                aooc.af(objM);
                dmpVar = obj;
            }
            return objM;
        } catch (java.util.concurrent.CancellationException e) {
            if (!aooc.aa(dmhVar.u())) {
                throw e;
            }
            return null;
        } catch (java.lang.Exception e2) {
            kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = dmhVar.u().get(kotlinx.coroutines.CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                aolr aolrVarU = dmhVar.u();
                java.util.Objects.toString(dmpVar);
                coroutineExceptionHandler.handleException(aolrVarU, new java.lang.IllegalStateException("Unable to load font ".concat(java.lang.String.valueOf(dmpVar)), e2));
            }
            return null;
        }
    }
}
