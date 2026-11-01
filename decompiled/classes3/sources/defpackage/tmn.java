package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tmn extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmn(ajxw ajxwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ajxwVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (r5 != 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (r11 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dc, code lost:
    
        if (r11 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        r10 = ((java.util.List) r11).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        if (r10.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
    
        r11 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if ((((defpackage.tpb) r11) instanceof defpackage.toy) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        r11 = (defpackage.tpb) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fb, code lost:
    
        if (r11 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        return defpackage.tpa.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmn.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.tmn tmnVar = new defpackage.tmn((defpackage.tms) this.b, aolnVar, 0);
            tmnVar.c = obj;
            return tmnVar;
        }
        java.lang.Object obj2 = this.b;
        if (i != 1) {
            defpackage.tmn tmnVar2 = new defpackage.tmn((ajxw) obj2, aolnVar, 2);
            tmnVar2.c = obj;
            return tmnVar2;
        }
        defpackage.tmn tmnVar3 = new defpackage.tmn((sqc) obj2, aolnVar, 1);
        tmnVar3.c = obj;
        return tmnVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmn(sqc sqcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = sqcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmn(defpackage.tms tmsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tmsVar;
    }
}
