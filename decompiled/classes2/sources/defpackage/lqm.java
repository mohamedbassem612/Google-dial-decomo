package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lqm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;

    public lqm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10) {
        super(amyzVar2, new amzw(defpackage.lqm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.lqi lqiVar;
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        zpo zpoVar = (zpo) list.get(1);
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(2);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        abwd abwdVar = (abwd) list.get(4);
        j$.util.Optional optional = (j$.util.Optional) list.get(5);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(6)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(7);
        zpm zpmVar = (zpm) list.get(8);
        qbe qbeVar = (qbe) list.get(9);
        if (optional.isPresent() || optional2.isPresent()) {
            akzx akzxVarM = defpackage.lqi.a.m();
            akzxVarM.u();
            defpackage.lqi lqiVar2 = (defpackage.lqi) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            lqiVar2.b |= 1;
            lqiVar2.c = str;
            zpo zpoVar2 = zpo.e;
            boolean z = zpoVar == zpoVar2;
            akzxVarM.u();
            defpackage.lqi lqiVar3 = (defpackage.lqi) akzxVarM.b;
            lqiVar3.b |= 2;
            lqiVar3.d = z;
            boolean zCan = details.can(8192);
            akzxVarM.u();
            defpackage.lqi lqiVar4 = (defpackage.lqi) akzxVarM.b;
            lqiVar4.b |= 4;
            lqiVar4.e = zCan;
            boolean z2 = (zpmVar.b(zpo.f).isEmpty() || zpmVar.b(zpoVar2).isEmpty()) && details.can(4096);
            akzxVarM.u();
            defpackage.lqi lqiVar5 = (defpackage.lqi) akzxVarM.b;
            lqiVar5.b |= 8;
            lqiVar5.f = z2;
            akzxVarM.u();
            defpackage.lqi lqiVar6 = (defpackage.lqi) akzxVarM.b;
            lqiVar6.b |= 16;
            lqiVar6.g = zBooleanValue;
            akzxVarM.u();
            defpackage.lqi lqiVar7 = (defpackage.lqi) akzxVarM.b;
            j$.util.Objects.requireNonNull(abwdVar);
            lqiVar7.k = abwdVar;
            lqiVar7.b |= 256;
            akzxVarM.u();
            defpackage.lqi lqiVar8 = (defpackage.lqi) akzxVarM.b;
            lqiVar8.b |= 64;
            lqiVar8.i = zBooleanValue2;
            if (optional.isPresent()) {
                java.lang.String str2 = (java.lang.String) optional.orElseThrow();
                akzxVarM.u();
                defpackage.lqi lqiVar9 = (defpackage.lqi) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                lqiVar9.b |= 32;
                lqiVar9.h = str2;
            }
            if (optional2.isPresent()) {
                java.lang.String str3 = (java.lang.String) optional2.orElseThrow();
                akzxVarM.u();
                defpackage.lqi lqiVar10 = (defpackage.lqi) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                lqiVar10.b |= 128;
                lqiVar10.j = str3;
            }
            lqiVar = (defpackage.lqi) akzxVarM.p();
        } else {
            defpackage.lql.a.c().m(aioa.b).l("com/android/dialer/conference/impl/service/ConferenceProducerModule", "produceChildCall", 129, "ConferenceProducerModule.java").v("Neither name nor number available during conference management.");
            qbeVar.c(qbc.fT);
            lqiVar = null;
        }
        return aiql.z(lqiVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.k;
        amzg amzgVar2 = this.j;
        amzg amzgVar3 = this.i;
        amzg amzgVar4 = this.h;
        amzg amzgVar5 = this.g;
        amzg amzgVar6 = this.f;
        amzg amzgVar7 = this.e;
        amzg amzgVar8 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
