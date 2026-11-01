package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kae extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kae(ccp ccpVar, defpackage.ajw ajwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ccpVar;
        this.d = ajwVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ccp, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:12:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x006d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kae.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ccp, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.kae kaeVar = new defpackage.kae((ccp) this.c, (defpackage.ajw) this.d, aolnVar, 1);
            kaeVar.e = obj;
            return kaeVar;
        }
        defpackage.kae kaeVar2 = new defpackage.kae((defpackage.kao) this.c, (kag) this.d, aolnVar, 0);
        kaeVar2.e = obj;
        return kaeVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kae(defpackage.kao kaoVar, kag kagVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = kaoVar;
        this.d = kagVar;
    }
}
