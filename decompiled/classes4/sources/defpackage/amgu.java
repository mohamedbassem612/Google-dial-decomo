package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amgu implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ amgu(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.alip) obj).n((defpackage.altn) ((akzx) this.a).p());
            return;
        }
        if (i != 1) {
            java.lang.Object obj2 = this.a;
            ((defpackage.alip) obj).m(new defpackage.alio(java.lang.String.format("Exception while running conversation infra. Reason: %s.", ((defpackage.aljs) obj2).a.name()), defpackage.alti.CORE_INFRA_FATAL_FAILURE, (java.lang.Throwable) obj2));
            return;
        }
        defpackage.amfv amfvVar = (defpackage.amfv) obj;
        defpackage.amfd amfdVar = (defpackage.amfd) this.a;
        if (amfdVar.h) {
            defpackage.amcg amcgVar = amfdVar.d;
            defpackage.amfu amfuVar = amfvVar.c;
            if (amfuVar == null) {
                amfuVar = defpackage.amfu.a;
            }
            aify.n(amfuVar.b);
            amcgVar.m();
        }
        j$.util.Optional optionalB = amfdVar.d.b();
        if (!optionalB.isPresent()) {
            amfdVar.k(defpackage.amfd.m(amfvVar, amfdVar.j), false);
            return;
        }
        defpackage.amfd.b.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler", "onAmStateUpdate", 194, "VisualCallingResultHandler.java").v("Publishing cache transcription mode update.");
        defpackage.alsi alsiVarM = defpackage.amfd.m(amfvVar, amfdVar.j);
        java.lang.Object obj3 = optionalB.get();
        akzz akzzVarP = alsiVarM.p();
        apdi apdiVar = defpackage.amgq.g;
        alsiVarM.c(apdiVar);
        java.lang.Object objJ = ((alaa) alsiVarM).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        akzx akzxVarP = ((defpackage.amgq) objJ).p();
        akzxVarP.u();
        defpackage.amgq amgqVar = (defpackage.amgq) akzxVarP.b;
        j$.util.Objects.requireNonNull(obj3);
        amgqVar.d = obj3;
        amgqVar.c = 7;
        akzzVarP.bV(apdiVar, (defpackage.amgq) akzxVarP.p());
        amfdVar.k((defpackage.alsi) akzzVarP.p(), true);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
