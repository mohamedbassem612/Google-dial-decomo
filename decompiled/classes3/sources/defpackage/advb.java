package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class advb extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public advb(defpackage.advd advdVar, android.content.Intent intent, defpackage.aduc aducVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = advdVar;
        this.d = intent;
        this.e = aducVar;
        this.b = j;
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

    /* JADX WARN: Type inference failed for: r2v0, types: [advd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [biw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [biv, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 == 0) {
                ?? r2 = this.c;
                java.lang.Object obj2 = this.d;
                java.lang.Object obj3 = this.e;
                long j = this.b;
                this.a = 1;
                if (r2.a((android.content.Intent) obj2, (defpackage.aduc) obj3, j, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i != 1) {
            aolu aoluVar2 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 == 0) {
                defpackage.advw advwVar = (defpackage.advw) ((defpackage.adxa) this.c).a.a();
                java.lang.Object obj4 = this.e;
                defpackage.aduc aducVarA = agab.bB((android.content.Context) this.d) ? defpackage.aduc.a(defpackage.angl.a.eZ().a()) : defpackage.aduc.b();
                long j2 = this.b;
                this.a = 1;
                if (advwVar.b((defpackage.advu) obj4, aducVarA, j2, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
            return aojh.a;
        }
        aolu aoluVar3 = aolu.a;
        int i4 = this.a;
        aooc.af(obj);
        if (i4 != 0) {
            if (i4 == 1) {
            }
            return aojh.a;
        }
        aonn aonnVar = ((bin) this.e).a;
        if (aonnVar != null) {
            cpm cpmVar = new cpm(this.b);
            this.a = 1;
            if (aonnVar.a(cpmVar, this) == aoluVar3) {
                return aoluVar3;
            }
        }
        ?? r8 = this.c;
        ?? r9 = this.d;
        this.a = 2;
        if (r8.b((biv) r9, this) == aoluVar3) {
            return aoluVar3;
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [advd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [biw, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.advb advbVar;
        int i = this.$cid;
        if (i == 0) {
            ?? r1 = this.c;
            java.lang.Object obj2 = this.d;
            android.content.Intent intent = (android.content.Intent) obj2;
            advbVar = new defpackage.advb((defpackage.advd) r1, intent, (defpackage.aduc) this.e, this.b, aolnVar, 0);
        } else {
            if (i != 1) {
                java.lang.Object obj3 = this.c;
                java.lang.Object obj4 = this.e;
                return new defpackage.advb((defpackage.adxa) obj3, (defpackage.advu) obj4, (android.content.Context) this.d, this.b, aolnVar, 2);
            }
            advbVar = new defpackage.advb((bin) this.e, this.b, (biw) this.c, (bim) this.d, aolnVar, 1);
        }
        return advbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public advb(defpackage.adxa adxaVar, defpackage.advu advuVar, android.content.Context context, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = adxaVar;
        this.e = advuVar;
        this.d = context;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public advb(bin binVar, long j, biw biwVar, bim bimVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = binVar;
        this.b = j;
        this.c = biwVar;
        this.d = bimVar;
    }
}
