package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alkq implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ alkq(defpackage.alkr alkrVar, defpackage.allf allfVar, defpackage.almy almyVar, int i) {
        this.$cid = i;
        this.a = alkrVar;
        this.b = allfVar;
        this.c = almyVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (this.$cid != 0) {
            ((defpackage.amgv) obj).c(new defpackage.aljs((java.lang.String) this.b, (defpackage.aljr) this.a, (java.lang.Throwable) this.c));
            return;
        }
        defpackage.almj almjVar = (defpackage.almj) obj;
        j$.util.Optional optionalFindFirst = defpackage.alkt.c((defpackage.allf) this.b, "outcome_argument_prediction_classes", "outcome_argument_prediction_scores").i(new defpackage.alks(almjVar.b, 6)).d(new defpackage.aitf(1)).findFirst();
        ida idaVar = new ida(almjVar, 11);
        if (true == optionalFindFirst.isPresent()) {
            if (((java.lang.Float) optionalFindFirst.get()).floatValue() <= ((defpackage.almj) idaVar.a).c) {
                optionalFindFirst = j$.util.Optional.empty();
            }
        }
        whq whqVar = new whq(this.a, this.c, 7);
        if (true == optionalFindFirst.isPresent()) {
            java.lang.Object obj2 = optionalFindFirst.get();
            java.lang.Object obj3 = whqVar.a;
            java.lang.Object obj4 = whqVar.b;
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_ROBOCALL_DETECTED;
            akzzVarM.u();
            defpackage.almz almzVar = akzzVarM.b;
            almzVar.c = alnbVar.aN;
            almzVar.b |= 1;
            ((defpackage.alkr) obj3).c.a(akzzVarM.p(), (defpackage.almy) obj4);
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ alkq(java.lang.String str, defpackage.aljr aljrVar, java.lang.Throwable th, int i) {
        this.$cid = i;
        this.b = str;
        this.a = aljrVar;
        this.c = th;
    }
}
