package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gcy {
    private final defpackage.aono a;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final java.util.List b = new java.util.ArrayList();
    private final defpackage.ajni g = new defpackage.ajni(null, null, null);

    public gcy(defpackage.aono aonoVar) {
        this.a = aonoVar;
    }

    private static final defpackage.gdo d(defpackage.gdo gdoVar) {
        java.util.List list = gdoVar.b;
        java.util.List listBb = defpackage.ajsz.bb(defpackage.ajsz.bE(list), defpackage.ajsz.bI(list));
        java.util.List list2 = gdoVar.d;
        return new defpackage.gdo(gdoVar.a, listBb, gdoVar.c, defpackage.ajsz.bb(java.lang.Integer.valueOf(list2 != null ? ((java.lang.Number) defpackage.ajsz.bE(list2)).intValue() : 0), java.lang.Integer.valueOf(list2 != null ? ((java.lang.Number) defpackage.ajsz.bI(list2)).intValue() : defpackage.ajsz.aZ(list))));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:113:0x0301  */
    /* JADX WARN: Code duplicated, block: B:117:0x0309  */
    /* JADX WARN: Code duplicated, block: B:174:0x0442  */
    /* JADX WARN: Code duplicated, block: B:176:0x0478  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x0478 -> B:177:0x047f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x06d8 -> B:255:0x06dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:297:0x0806 -> B:298:0x0807). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.gag r26, defpackage.aoln r27) {
        /*
            Method dump skipped, instruction units count: 2320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcy.a(gag, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.gai gaiVar, defpackage.aoln aolnVar) {
        gcx gcxVar;
        if (aolnVar instanceof gcx) {
            gcxVar = (gcx) aolnVar;
            int i = gcxVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                gcxVar.h = i - Integer.MIN_VALUE;
            } else {
                gcxVar = new gcx(this, aolnVar);
            }
        } else {
            gcxVar = new gcx(this, aolnVar);
        }
        java.lang.Object obj = gcxVar.f;
        int i2 = gcxVar.h;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            new java.util.ArrayList();
            java.util.List list = gaiVar.a;
            throw null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = gcxVar.e;
        int i4 = gcxVar.d;
        java.lang.Object obj2 = gcxVar.c;
        java.lang.Object obj3 = gcxVar.b;
        java.lang.Object obj4 = gcxVar.a;
        defpackage.gai gaiVar2 = gcxVar.i;
        defpackage.aooc.af(obj);
        if (obj == null && obj2 == null && i4 == 0) {
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        if (r8 != r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        if (r8 != r1) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dzn r7, defpackage.aoln r8) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcy.c(dzn, aoln):java.lang.Object");
    }
}
