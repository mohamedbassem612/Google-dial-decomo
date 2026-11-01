package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qjm extends aomh implements aonj {
    java.lang.Object a;
    int b;
    final /* synthetic */ aoin c;
    final /* synthetic */ amzg d;
    final /* synthetic */ defpackage.zpo e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjm(aoin aoinVar, amzg amzgVar, defpackage.zpo zpoVar, boolean z, aoln aolnVar) {
        super(1, aolnVar);
        this.c = aoinVar;
        this.d = amzgVar;
        this.e = zpoVar;
        this.f = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.qjm(this.c, this.d, this.e, this.f, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final java.lang.Object b(java.lang.Object obj) {
        ?? r0;
        aolu aoluVar = aolu.a;
        if (this.b != 0) {
            java.lang.Object obj2 = this.a;
            aooc.af(obj);
            r0 = obj2;
        } else {
            aooc.af(obj);
            java.util.Set set = ((java.lang.Boolean) this.c.a()).booleanValue() ? defpackage.qjp.c : defpackage.qjp.b;
            ajcq ajcqVarD = this.d.d();
            this.a = set;
            this.b = 1;
            java.lang.Object objD = aosv.D(ajcqVarD, this);
            if (objD == aoluVar) {
                return aoluVar;
            }
            r0 = set;
            obj = objD;
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            defpackage.zpo zpoVar = this.e;
            if (defpackage.qjp.a.contains(zpoVar)) {
                return new defpackage.qip(defpackage.qid.REJECT, this.f ? defpackage.qid.ANSWER_VIDEO : defpackage.qid.ANSWER, defpackage.qim.BASIC_CALL_NOTIFICATION_PRIORITY);
            }
            if (r0.contains(zpoVar) || zpoVar == defpackage.zpo.l) {
                return new defpackage.qiz(defpackage.qid.DISCONNECT, defpackage.qim.BASIC_CALL_NOTIFICATION_PRIORITY);
            }
        }
        return null;
    }
}
