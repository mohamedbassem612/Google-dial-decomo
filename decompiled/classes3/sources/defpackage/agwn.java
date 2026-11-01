package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agwn extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agwn(aonn aonnVar, java.lang.Object obj, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aonnVar;
        this.c = obj;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoxi) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoxi) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3, types: [aonn, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        aoxi aoxiVar;
        aoxi aoxiVar2;
        java.lang.Throwable th;
        java.lang.Object obj2;
        defpackage.agwm agvrVar;
        ?? r2;
        defpackage.agwp agwpVar;
        aoxi aoxiVar3;
        ?? r3;
        aoxi aoxiVar4;
        aoxh aoxhVarA;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    java.lang.Object obj3 = this.a;
                    aoxiVar3 = (aoxi) this.e;
                    aooc.af(obj);
                    r3 = obj3;
                } else if (i != 2) {
                    aooc.af(obj);
                } else {
                    aoxiVar4 = (aoxi) this.e;
                    aooc.af(obj);
                    java.lang.Object obj4 = this.c;
                    java.lang.String str = (java.lang.String) this.d;
                    defpackage.ytm ytmVar = (defpackage.ytm) obj4;
                    aoxhVarA = aoxo.a(aoyc.a(new aoxa(new pzf(ytmVar, str, (aoln) null, 7)), new ytl(ytmVar, str, (aoln) null, 0)));
                    this.e = null;
                    this.b = 3;
                    if (aoov.aG(aoxiVar4, aoxhVarA, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
            aooc.af(obj);
            aoxi aoxiVar5 = (aoxi) this.e;
            java.lang.Object obj5 = this.c;
            java.lang.Object obj6 = this.d;
            this.e = aoxiVar5;
            this.a = aoxiVar5;
            this.b = 1;
            java.lang.Object objB = ((defpackage.ytm) obj5).b.b((java.lang.String) obj6, this);
            if (objB == aoluVar) {
                return aoluVar;
            }
            aoxiVar3 = aoxiVar5;
            obj = objB;
            r3 = aoxiVar3;
            this.e = aoxiVar3;
            this.a = null;
            this.b = 2;
            if (r3.a(obj, this) == aoluVar) {
                return aoluVar;
            }
            aoxiVar4 = aoxiVar3;
            java.lang.Object obj7 = this.c;
            java.lang.String str2 = (java.lang.String) this.d;
            defpackage.ytm ytmVar2 = (defpackage.ytm) obj7;
            aoxhVarA = aoxo.a(aoyc.a(new aoxa(new pzf(ytmVar2, str2, (aoln) null, 7)), new ytl(ytmVar2, str2, (aoln) null, 0)));
            this.e = null;
            this.b = 3;
            if (aoov.aG(aoxiVar4, aoxhVarA, this) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.b;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aoxi aoxiVar6 = (aoxi) this.e;
                    aooc.af(obj);
                    aoxiVar = aoxiVar6;
                } else if (i2 != 2) {
                    aooc.af(obj);
                } else {
                    java.lang.Object obj8 = this.a;
                    aoxiVar2 = (aoxi) this.e;
                    try {
                        aooc.af(obj);
                        obj2 = obj8;
                        agvrVar = new defpackage.agvs(obj);
                        r2 = obj2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        agvrVar = new defpackage.agvr(th);
                        r2 = aoxiVar2;
                    }
                    agwpVar = new defpackage.agwp(agvrVar);
                    this.e = null;
                    this.a = null;
                    this.b = 3;
                    if (r2.a(agwpVar, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
                return aojh.a;
            }
            aooc.af(obj);
            aoxiVar = (aoxi) this.e;
            defpackage.agwq agwqVar = new defpackage.agwq();
            this.e = aoxiVar;
            this.b = 1;
            if (aoxiVar.a(agwqVar, this) == aoluVar2) {
                return aoluVar2;
            }
            ?? r4 = this.d;
            java.lang.Object obj9 = this.c;
            this.e = aoxiVar;
            this.a = aoxiVar;
            this.b = 2;
            java.lang.Object objA = r4.a(obj9, this);
            if (objA == aoluVar2) {
                return aoluVar2;
            }
            aoxiVar2 = aoxiVar;
            obj = objA;
            obj2 = aoxiVar2;
            agvrVar = new defpackage.agvs(obj);
            r2 = obj2;
            agwpVar = new defpackage.agwp(agvrVar);
            this.e = null;
            this.a = null;
            this.b = 3;
            if (r2.a(agwpVar, this) == aoluVar2) {
                return aoluVar2;
            }
            return aojh.a;
        } catch (java.lang.Throwable th3) {
            aoxiVar2 = aoxiVar;
            th = th3;
            agvrVar = new defpackage.agvr(th);
            r2 = aoxiVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aonn, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid == 0) {
            defpackage.agwn agwnVar = new defpackage.agwn((aonn) this.d, this.c, aolnVar, 0);
            agwnVar.e = obj;
            return agwnVar;
        }
        defpackage.agwn agwnVar2 = new defpackage.agwn((defpackage.ytm) this.c, (java.lang.String) this.d, aolnVar, 1);
        agwnVar2.e = obj;
        return agwnVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agwn(defpackage.ytm ytmVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ytmVar;
        this.d = str;
    }
}
