package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bug extends aomh implements aono {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bug(defpackage.abgx abgxVar, aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.a = abgxVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            long j = ((cpm) obj2).a;
            return new defpackage.bug((defpackage.bun) this.a, (aoln) obj3, 0).b(aojh.a);
        }
        if (i == 1) {
            return new defpackage.bug((aoop) this.a, (aoln) obj3, 1).b(aojh.a);
        }
        if (i == 2) {
            ((java.lang.Number) obj2).floatValue();
            return new defpackage.bug((defpackage.bun) this.a, (aoln) obj3, 2, null).b(aojh.a);
        }
        if (i != 3) {
            long j2 = ((cpm) obj2).a;
            return new defpackage.bug((defpackage.abgx) this.a, (aoln) obj3, 4).b(aojh.a);
        }
        return new defpackage.bug((defpackage.loi) this.a, (aoln) obj3, 3).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            ((defpackage.bun) this.a).i(true);
            return aojh.a;
        }
        if (i == 1) {
            aooc.af(obj);
            ((aoop) this.a).a = true;
            return aojh.a;
        }
        if (i == 2) {
            aooc.af(obj);
            ((defpackage.bun) this.a).i(false);
            return aojh.a;
        }
        if (i != 3) {
            aooc.af(obj);
            java.lang.Object obj2 = this.a;
            ((defpackage.abgx) obj2).k.a(defpackage.abgt.a);
            return aojh.a;
        }
        aooc.af(obj);
        java.lang.Object obj3 = this.a;
        ((defpackage.loi) obj3).g.o(rmx.lr);
        return aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bug(aoop aoopVar, aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.a = aoopVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bug(defpackage.bun bunVar, aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.a = bunVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bug(defpackage.bun bunVar, aoln aolnVar, int i, byte[] bArr) {
        super(3, aolnVar);
        this.$cid = i;
        this.a = bunVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bug(defpackage.loi loiVar, aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.a = loiVar;
    }
}
