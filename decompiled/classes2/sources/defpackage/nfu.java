package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nfu extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfu(aoin aoinVar, defpackage.nms nmsVar, defpackage.neu neuVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aoinVar;
        this.c = nmsVar;
        this.d = neuVar;
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

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Type inference failed for: r2v5, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [aoin, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        boolean z;
        qie qieVar;
        j$.util.Optional optionalOf;
        emx emxVarK;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 != 0) {
                z = obj == defpackage.nev.TYPE_ASK_IF_URGENT;
            } else if (((java.lang.Boolean) this.b.a()).booleanValue() && this.c == defpackage.nms.CASE_MANUAL_SCREENING) {
                java.lang.Object obj2 = this.d;
                this.a = 1;
                obj = ((defpackage.neu) obj2).c(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (obj == defpackage.nev.TYPE_ASK_IF_URGENT) {
                }
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i != 1) {
            aolu aoluVar2 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 == 0 && (emxVarK = dzo.k(((defpackage.oji) this.d).d)) != null) {
                ?? r2 = this.b;
                ?? r3 = this.c;
                emq emqVar = emq.d;
                defpackage.ohh ohhVar = new defpackage.ohh((aoxh) r2, (aonj) r3, (aoln) null, 5);
                this.a = 1;
                if (dzn.g(emxVarK, emqVar, ohhVar, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
            return aojh.a;
        }
        aolu aoluVar3 = aolu.a;
        int i4 = this.a;
        aooc.af(obj);
        if (i4 != 0) {
            qieVar = (qie) obj;
            if (qieVar == null) {
                qieVar = new qie(aokc.a, 1, (java.lang.CharSequence) this.c, true);
            }
            optionalOf = j$.util.Optional.of(qieVar);
        } else if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            java.lang.Object obj3 = this.d;
            qit qitVar = qit.b;
            this.a = 1;
            obj = ((rai) obj3).b(qitVar, this);
            if (obj == aoluVar3) {
                return aoluVar3;
            }
            qieVar = (qie) obj;
            if (qieVar == null) {
                qieVar = new qie(aokc.a, 1, (java.lang.CharSequence) this.c, true);
            }
            optionalOf = j$.util.Optional.of(qieVar);
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        j$.util.Optional optional = optionalOf;
        aooh.c(optional);
        return optional;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aonj, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.nfu((aoin) this.b, (defpackage.nms) this.c, (defpackage.neu) this.d, aolnVar, 0);
        }
        if (i != 1) {
            return new defpackage.nfu((defpackage.oji) this.d, (aoxh) this.b, (aonj) this.c, aolnVar, 2);
        }
        return new defpackage.nfu((aoin) this.b, (rai) this.d, (java.lang.CharSequence) this.c, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfu(aoin aoinVar, rai raiVar, java.lang.CharSequence charSequence, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aoinVar;
        this.d = raiVar;
        this.c = charSequence;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfu(defpackage.oji ojiVar, aoxh aoxhVar, aonj aonjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = ojiVar;
        this.b = aoxhVar;
        this.c = aonjVar;
    }
}
