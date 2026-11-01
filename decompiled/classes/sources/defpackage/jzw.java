package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzw extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzw(defpackage.aogc aogcVar, android.net.Uri uri, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aogcVar;
        this.c = uri;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.jzw) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return ((defpackage.jzw) c((defpackage.aows) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 2) {
            return ((defpackage.jzw) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 3) {
            return ((defpackage.jzw) c((defpackage.aows) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.jzw) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0253  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference failed for: r7v5, types: [gom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kfj] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x025f -> B:94:0x0261). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzw.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kfj] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.jzw jzwVar;
        int i = this.$cid;
        if (i == 0) {
            defpackage.jzw jzwVar2 = new defpackage.jzw((java.lang.Long) this.b, (defpackage.jzx) this.c, aolnVar, 0);
            jzwVar2.d = obj;
            return jzwVar2;
        }
        if (i == 1) {
            jzwVar = new defpackage.jzw((defpackage.ipc) this.b, (android.app.Activity) this.c, aolnVar, 1);
            jzwVar.d = obj;
        } else {
            if (i != 2) {
                java.lang.Object obj2 = this.b;
                if (i != 3) {
                    defpackage.jzw jzwVar3 = new defpackage.jzw((defpackage.aogc) obj2, (android.net.Uri) this.c, aolnVar, 4);
                    jzwVar3.d = obj;
                    return jzwVar3;
                }
                defpackage.jzw jzwVar4 = new defpackage.jzw((defpackage.rpa) obj2, (android.content.Intent) this.c, aolnVar, 3);
                jzwVar4.d = obj;
                return jzwVar4;
            }
            jzwVar = new defpackage.jzw((defpackage.kek) this.c, (defpackage.kfj) this.b, aolnVar, 2);
            jzwVar.d = obj;
        }
        return jzwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzw(defpackage.ipc ipcVar, android.app.Activity activity, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ipcVar;
        this.c = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzw(java.lang.Long l, defpackage.jzx jzxVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = l;
        this.c = jzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzw(defpackage.kek kekVar, defpackage.kfj kfjVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = kekVar;
        this.b = kfjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzw(defpackage.rpa rpaVar, android.content.Intent intent, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = rpaVar;
        this.c = intent;
    }
}
