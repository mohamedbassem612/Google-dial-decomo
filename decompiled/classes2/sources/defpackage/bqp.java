package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bqp extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(aii aiiVar, java.lang.Object obj, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = aiiVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jfl] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, yvp] */
    /* JADX WARN: Type inference failed for: r2v11, types: [aosy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v34, types: [aosy, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return new defpackage.bqp((aomy) this.a, (aomy) this.b, (aoln) obj, 0).b(aojh.a);
            case 1:
                java.lang.Object obj2 = this.a;
                return new defpackage.bqp((aii) obj2, this.b, (aoln) obj, 1).b(aojh.a);
            case 2:
                return new defpackage.bqp((defpackage.jfl) this.b, (defpackage.jfc) this.a, (aoln) obj, 2).b(aojh.a);
            case 3:
                java.lang.Object obj3 = this.a;
                return new defpackage.bqp((defpackage.now) obj3, (java.lang.Integer) this.b, (aoln) obj, 3).b(aojh.a);
            case 4:
                java.lang.Object obj4 = this.b;
                return new defpackage.bqp((defpackage.now) obj4, (defpackage.nov) this.a, (aoln) obj, 4).b(aojh.a);
            case 5:
                aoln aolnVar = (aoln) obj;
                return new defpackage.bqp((defpackage.now) this.b, (defpackage.nov) this.a, aolnVar, 5, (byte[]) null).b(aojh.a);
            case 6:
                java.lang.Object obj5 = this.b;
                return new defpackage.bqp((zpo) obj5, (android.content.Context) this.a, (aoln) obj, 6).b(aojh.a);
            case 7:
                java.lang.Object obj6 = this.a;
                return new defpackage.bqp((toj) obj6, (ysc) this.b, (aoln) obj, 7).b(aojh.a);
            case 8:
                return new defpackage.bqp((yvp) this.a, (j$.util.Optional) this.b, (aoln) obj, 8).b(aojh.a);
            case 9:
                java.lang.Object obj7 = this.a;
                return new defpackage.bqp((yyf) obj7, (aosy) this.b, (aoln) obj, 9).b(aojh.a);
            default:
                aoln aolnVar2 = (aoln) obj;
                return new defpackage.bqp((yyf) this.a, (aosy) this.b, aolnVar2, 10, (byte[]) null).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Object, yvp] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aomy, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                this.a.a();
                this.b.a();
                return aojh.a;
            case 1:
                aooc.af(obj);
                aii aiiVar = (aii) this.a;
                aiiVar.h();
                air airVar = aiiVar.b;
                java.lang.Object objB = aiiVar.b(this.b);
                airVar.c(objB);
                aiiVar.j(objB);
                return aojh.a;
            case 2:
                aooc.af(obj);
                defpackage.jfc.a.d().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onBeeslySessionStartFailure$<anonymous>", 522, "BeeslyLifecycleControllerV2.kt").y("Beesly Session failed to start: %s", this.b);
                ((defpackage.jfc) this.a).i.a(mcd.aP);
                return aojh.a;
            case 3:
                aooc.af(obj);
                ((defpackage.now) this.a).c = (java.lang.Integer) this.b;
                return aojh.a;
            case 4:
                aooc.af(obj);
                ((defpackage.now) this.b).a = (defpackage.nov) this.a;
                return aojh.a;
            case 5:
                aooc.af(obj);
                ((defpackage.now) this.b).b = (defpackage.nov) this.a;
                return aojh.a;
            case 6:
                aooc.af(obj);
                if (android.os.Build.VERSION.SDK_INT < 34 || this.b != zpo.e) {
                    return null;
                }
                java.lang.Object obj2 = this.a;
                qic qicVar = qic.b;
                qid qidVar = qid.z;
                android.content.Context context = (android.content.Context) obj2;
                int iA = urg.a(context);
                java.lang.String string = context.getString(2132019500);
                aooh.e(string, "getString(...)");
                return new qib(qidVar, qicVar, string, (java.lang.Integer) null, new java.lang.Integer(iA), 2131231528, false, new java.lang.Integer(7));
            case 7:
                aooc.af(obj);
                toj tojVar = (toj) this.a;
                tth tthVarB = tth.b(tojVar.D.m().c);
                if (tthVarB == null) {
                    tthVarB = tth.i;
                }
                aimz aimzVar = toj.a;
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "onAiCoreAvailabilityStatusChanged$<anonymous>", 385, "SharpieLifecycleController.kt").K("ai core availability status changed to %b when lifecycle state is %s", ((ysc) this.b).a(), tthVarB);
                if (tthVarB == tth.a) {
                    tojVar.v.a(aiql.z(aojh.a));
                }
                aosb aosbVar = tojVar.s;
                if (aosbVar != null && !aosbVar.i()) {
                    aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "onAiCoreAvailabilityStatusChanged$<anonymous>", 397, "SharpieLifecycleController.kt").v("ai core availability status changed during pending lookup, mark pending lookup as complete");
                    aosb aosbVar2 = tojVar.s;
                    if (aosbVar2 != null) {
                        aosbVar2.w(aojh.a);
                    }
                }
                return aojh.a;
            case 8:
                aooc.af(obj);
                long j = this.a.a().c;
                ywi ywiVar = (ywi) aooh.q((j$.util.Optional) this.b);
                if (ywiVar == null || ywiVar.a() == null) {
                    return ajsz.aO(new aoiu[]{new aoiu("country", "all"), new aoiu("version", java.lang.String.valueOf(j))});
                }
                throw null;
            case 9:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((yyf) this.a).e.remove(this.b));
            default:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((yyf) this.a).e.add(this.b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(aomy aomyVar, aomy aomyVar2, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = aomyVar;
        this.b = aomyVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(defpackage.jfl jflVar, defpackage.jfc jfcVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = jflVar;
        this.a = jfcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(defpackage.now nowVar, java.lang.Integer num, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = nowVar;
        this.b = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(defpackage.now nowVar, defpackage.nov novVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = nowVar;
        this.a = novVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(defpackage.now nowVar, defpackage.nov novVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = nowVar;
        this.a = novVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(toj tojVar, ysc yscVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = tojVar;
        this.b = yscVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(yvp yvpVar, j$.util.Optional optional, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = yvpVar;
        this.b = optional;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(yyf yyfVar, aosy aosyVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = yyfVar;
        this.b = aosyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(yyf yyfVar, aosy aosyVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = yyfVar;
        this.b = aosyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(zpo zpoVar, android.content.Context context, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = zpoVar;
        this.a = context;
    }
}
