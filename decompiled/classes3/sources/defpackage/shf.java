package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class shf extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boolean a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shf(defpackage.aeok aeokVar, boolean z, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = aeokVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return new defpackage.shf((aoin) this.b, this.a, (aoln) obj, 1).b(aojh.a);
        }
        java.lang.Object obj2 = this.b;
        return new defpackage.shf((defpackage.aeok) obj2, this.a, (aoln) obj, 0).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [aoin, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            aooc.af(obj);
            boolean zBooleanValue = ((java.lang.Boolean) this.b.a()).booleanValue();
            boolean z = this.a;
            if (zBooleanValue) {
                return new defpackage.qip(defpackage.qid.BEESLY_DECLINE, z ? defpackage.qid.ANSWER_VIDEO : defpackage.qid.BEESLY_ANSWER, defpackage.qim.BEESLY_CALL_NOTIFICATION_PRIORITY);
            }
            return new defpackage.qja(z ? defpackage.qid.ANSWER_VIDEO : defpackage.qid.BEESLY_ANSWER, defpackage.qid.BEESLY_DECLINE, true, defpackage.qim.BEESLY_CALL_NOTIFICATION_PRIORITY);
        }
        aooc.af(obj);
        boolean z2 = this.a;
        defpackage.aeok aeokVar = (defpackage.aeok) this.b;
        aeokVar.a = z2;
        aojh aojhVar = aojh.a;
        ((zpz) aeokVar.c).a(aiql.z(aojhVar));
        return aojhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shf(aoin aoinVar, boolean z, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = aoinVar;
        this.a = z;
    }
}
