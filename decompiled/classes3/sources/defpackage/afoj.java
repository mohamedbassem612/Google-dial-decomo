package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afoj extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoj(defpackage.afod afodVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.c = afodVar;
        this.b = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i = this.a;
            aooc.af(obj);
            if (i == 0) {
                aoss aossVar = (aoss) this.d;
                java.lang.Object obj2 = this.c;
                int i2 = this.b;
                synchronized (aossVar) {
                    ((defpackage.afod) obj2).c = java.lang.Math.max(i2, ((defpackage.afod) obj2).c);
                }
                java.lang.Object obj3 = this.c;
                this.a = 1;
                if (((defpackage.afod) obj3).c(this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aolu aoluVar2 = aolu.a;
        int i3 = this.a;
        aooc.af(obj);
        if (i3 == 0) {
            aoss aossVar2 = (aoss) this.d;
            java.lang.Object obj4 = this.c;
            int i4 = this.b;
            synchronized (aossVar2) {
                ((defpackage.afok) obj4).b = java.lang.Math.max(i4, ((defpackage.afok) obj4).b);
            }
            java.lang.Object obj5 = this.c;
            this.a = 1;
            if (((defpackage.afok) obj5).c(this) == aoluVar2) {
                return aoluVar2;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.c;
        if (i != 0) {
            defpackage.afoj afojVar = new defpackage.afoj((defpackage.afod) obj2, this.b, aolnVar, 1);
            afojVar.d = obj;
            return afojVar;
        }
        defpackage.afoj afojVar2 = new defpackage.afoj((defpackage.afok) obj2, this.b, aolnVar, 0);
        afojVar2.d = obj;
        return afojVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoj(defpackage.afok afokVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.c = afokVar;
        this.b = i;
    }
}
