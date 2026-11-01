package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agtu extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtu(aoln aolnVar, aogc aogcVar, android.net.Uri uri, android.content.ContentValues contentValues, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aogcVar;
        this.a = uri;
        this.b = contentValues;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid == 0) {
            aooc.af(obj);
            java.lang.Object obj2 = this.b;
            return ((apni) ((aogc) this.c).a).o((android.net.Uri) this.a, (android.content.ContentValues) obj2);
        }
        aooc.af(obj);
        aoss aossVar = (aoss) this.d;
        aihd<defpackage.lmv> aihdVarE = ((defpackage.lnh) this.a).l.e();
        aooh.e(aihdVarE, "get(...)");
        for (defpackage.lmv lmvVar : aihdVarE) {
            java.lang.Object obj3 = this.c;
            java.lang.Object obj4 = this.b;
            aimz aimzVar = zih.a;
            aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.fxp((aoln) null, lmvVar, (defpackage.lmq) obj4, (defpackage.lnl) obj3, 5));
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            java.lang.Object obj2 = this.a;
            defpackage.lnh lnhVar = (defpackage.lnh) obj2;
            defpackage.agtu agtuVar = new defpackage.agtu(lnhVar, (defpackage.lmq) this.b, (defpackage.lnl) this.c, aolnVar, 1);
            agtuVar.d = obj;
            return agtuVar;
        }
        java.lang.Object obj3 = this.c;
        aogc aogcVar = (aogc) obj3;
        defpackage.agtu agtuVar2 = new defpackage.agtu(aolnVar, aogcVar, (android.net.Uri) this.a, (android.content.ContentValues) this.b, 0);
        agtuVar2.d = obj;
        return agtuVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtu(defpackage.lnh lnhVar, defpackage.lmq lmqVar, defpackage.lnl lnlVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = lnhVar;
        this.b = lmqVar;
        this.c = lnlVar;
    }
}
