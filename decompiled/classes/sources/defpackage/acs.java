package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class acs extends defpackage.aomg implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    int c;
    int d;
    long e;
    long f;
    int g;
    final /* synthetic */ java.lang.Object h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acs(defpackage.acd acdVar, defpackage.aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.h = acdVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.acs) c((defpackage.aoqn) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return ((defpackage.acs) c((defpackage.aoqn) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 2) {
            return ((defpackage.acs) c((defpackage.aoqn) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.acs) c((defpackage.aoqn) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Code duplicated, block: B:73:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r2v20, types: [long[]] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0079 -> B:17:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00fc -> B:32:0x00fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0192 -> B:47:0x0194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0221 -> B:64:0x0225). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:9:0x0019
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.acs acsVar = new defpackage.acs((act) this.h, aolnVar, 0);
            acsVar.i = obj;
            return acsVar;
        }
        if (i == 1) {
            defpackage.acs acsVar2 = new defpackage.acs((defpackage.acd) this.h, aolnVar, 1);
            acsVar2.i = obj;
            return acsVar2;
        }
        java.lang.Object obj2 = this.h;
        if (i != 2) {
            defpackage.acs acsVar3 = new defpackage.acs((aeh) obj2, aolnVar, 3);
            acsVar3.i = obj;
            return acsVar3;
        }
        defpackage.acs acsVar4 = new defpackage.acs((defpackage.aea) obj2, aolnVar, 2);
        acsVar4.i = obj;
        return acsVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acs(act actVar, defpackage.aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.h = actVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acs(defpackage.aea aeaVar, defpackage.aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.h = aeaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acs(aeh aehVar, defpackage.aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.h = aehVar;
    }
}
