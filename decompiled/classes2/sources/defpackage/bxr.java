package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bxr extends aomg implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxr(amn amnVar, aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.b = amnVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((cwc) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((cwc) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 2) {
            return c((cwc) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoqn) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[LOOP:1: B:47:0x00d6->B:50:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee A[EDGE_INSN: B:73:0x00ee->B:52:0x00ee BREAK  A[LOOP:1: B:47:0x00d6->B:50:0x00ea], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v4, types: [ccp, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0112 -> B:36:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxr.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [ccp, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.bxr bxrVar = new defpackage.bxr((defpackage.cvg) this.b, aolnVar, 0);
            bxrVar.c = obj;
            return bxrVar;
        }
        if (i == 1) {
            defpackage.bxr bxrVar2 = new defpackage.bxr((amn) this.b, aolnVar, 1);
            bxrVar2.c = obj;
            return bxrVar2;
        }
        if (i != 2) {
            defpackage.bxr bxrVar3 = new defpackage.bxr((ccp) this.b, aolnVar, 3);
            bxrVar3.c = obj;
            return bxrVar3;
        }
        defpackage.bxr bxrVar4 = new defpackage.bxr((android.view.View) this.b, aolnVar, 2);
        bxrVar4.c = obj;
        return bxrVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxr(android.view.View view, aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.b = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxr(ccp ccpVar, aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.b = ccpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxr(defpackage.cvg cvgVar, aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.b = cvgVar;
    }
}
