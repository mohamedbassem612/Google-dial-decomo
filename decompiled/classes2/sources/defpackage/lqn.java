package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lqn extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public lqn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.lqn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aikn aiknVar;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        zpm zpmVar = (zpm) list.get(1);
        qbe qbeVar = (qbe) list.get(2);
        ajct ajctVar = (ajct) list.get(3);
        if (!zBooleanValue) {
            qbeVar.c(qbc.fN);
            return aiql.z(j$.util.Optional.empty());
        }
        akzx akzxVarM = defpackage.lqj.a.m();
        j$.util.Optional optionalH = zpmVar.h();
        if (optionalH.isPresent()) {
            aiknVar = (aihd) j$.util.Collection.-EL.stream(zpmVar.b.values()).filter(new defpackage.lvq(zpmVar, zpmVar.h.d(((zpl) ((apqr) optionalH.orElseThrow()).a(zpl.class)).c()), 7)).collect(aido.b);
        } else {
            aiknVar = aikn.a;
        }
        if (aiknVar.isEmpty()) {
            qbeVar.c(qbc.fO);
            return aiql.z(j$.util.Optional.empty());
        }
        ahoq ahoqVarW = ahvr.W(316, "ConferenceProducerModule_produceConferenceModelExpensiveWork");
        try {
            aify aifyVar = (aify) j$.util.Collection.-EL.stream(aiknVar).map(new defpackage.jil(zpmVar, 9)).collect(aido.a);
            ajcq ajcqVarO = ahvr.aj(aifyVar).o(new defpackage.lly(aifyVar, akzxVarM, 2), ajctVar);
            ahoqVarW.a(ajcqVarO);
            ahoqVarW.close();
            return ajcqVarO;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
