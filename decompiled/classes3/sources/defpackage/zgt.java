package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgt extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgt(akhn akhnVar, acig acigVar, java.lang.String str, akst akstVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = akhnVar;
        this.c = acigVar;
        this.b = str;
        this.e = akstVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((defpackage.yqt) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
    
        if (((defpackage.swi) r13).d(r5, false) != r0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgt.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.zgt zgtVar;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.c;
            defpackage.zfd zfdVar = (defpackage.zfd) obj2;
            zgtVar = new defpackage.zgt(zfdVar, (defpackage.zff) this.d, this.b, (defpackage.zge) this.e, aolnVar, 0);
            zgtVar.f = obj;
        } else {
            if (i != 1) {
                java.lang.Object obj3 = this.d;
                akhn akhnVar = (akhn) obj3;
                defpackage.zgt zgtVar2 = new defpackage.zgt(akhnVar, (acig) this.c, this.b, (akst) this.e, aolnVar, 2);
                zgtVar2.f = obj;
                return zgtVar2;
            }
            java.lang.Object obj4 = this.e;
            java.lang.Object obj5 = this.c;
            defpackage.pqo pqoVar = (defpackage.pqo) this.d;
            defpackage.swi swiVar = (defpackage.swi) obj4;
            zgtVar = new defpackage.zgt(aolnVar, swiVar, (android.telecom.Call.Details) obj5, pqoVar, this.b, 1);
            zgtVar.f = obj;
        }
        return zgtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgt(aoln aolnVar, defpackage.swi swiVar, android.telecom.Call.Details details, defpackage.pqo pqoVar, java.lang.String str, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = swiVar;
        this.c = details;
        this.d = pqoVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgt(defpackage.zfd zfdVar, defpackage.zff zffVar, java.lang.String str, defpackage.zge zgeVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = zfdVar;
        this.d = zffVar;
        this.b = str;
        this.e = zgeVar;
    }
}
