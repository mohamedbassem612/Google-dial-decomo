package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acdh implements defpackage.accr {
    private final android.content.Context a;
    private final defpackage.acit b;
    private final defpackage.acbd c;
    private final defpackage.accq d;

    public acdh(android.content.Context context, defpackage.acit acitVar, defpackage.acbd acbdVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (acitVar == null) {
            defpackage.aooh.i("userActionUtil");
        }
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.a = context;
        this.b = acitVar;
        this.c = acbdVar;
        this.d = defpackage.accq.h;
    }

    @Override // defpackage.accr
    public final defpackage.accq a() {
        return this.d;
    }

    @Override // defpackage.accu
    public final boolean b(akkj akkjVar, acct acctVar) {
        java.util.List<akjc> listAY;
        defpackage.aooh.f(akkjVar, "triggeringConditions");
        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = acctVar.b;
        akjx akjxVar = promoContext.c().h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        defpackage.aooh.e(akjxVar, "getUi(...)");
        defpackage.aooh.f(akjxVar, "ui");
        int i = akjxVar.c;
        if (i == 2) {
            listAY = ((akjh) akjxVar.d).g;
            defpackage.aooh.e(listAY, "getUserActionList(...)");
        } else if (i == 6) {
            akjh akjhVar = ((akju) akjxVar.d).d;
            if (akjhVar == null) {
                akjhVar = akjh.a;
            }
            listAY = akjhVar.g;
            defpackage.aooh.e(listAY, "getUserActionList(...)");
        } else if (((i == 5 ? (akkh) akjxVar.d : akkh.a).b & 32) != 0) {
            akjc akjcVar = (akjxVar.c == 5 ? (akkh) akjxVar.d : akkh.a).k;
            if (akjcVar == null) {
                akjcVar = akjc.a;
            }
            listAY = defpackage.ajsz.aY(akjcVar);
        } else {
            listAY = defpackage.aokc.a;
        }
        for (akjc akjcVar2 : listAY) {
            if (akjcVar2.c == 8) {
                akik akikVar = (akik) akjcVar2.d;
                defpackage.aooh.e(akikVar, "getIntentTarget(...)");
                if (!this.b.b(this.a, akikVar)) {
                    defpackage.acbd acbdVar = this.c;
                    akjb akjbVarB = akjb.b(akjcVar2.e);
                    if (akjbVarB == null) {
                        akjbVarB = akjb.a;
                    }
                    acbdVar.a(promoContext, "Found an invalid intent target in action %s.", akjbVarB.name());
                    return false;
                }
            }
        }
        return true;
    }
}
