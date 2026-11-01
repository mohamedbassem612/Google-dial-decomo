package androidx.appsearch.usagereporting;

/* JADX INFO: renamed from: androidx.appsearch.usagereporting.$$__AppSearch__ImpressionAction, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class C$$__AppSearch__ImpressionAction implements defpackage.pr {
    @Override // defpackage.pr
    public final defpackage.pq a() {
        defpackage.pi piVar = new defpackage.pi("builtin:ImpressionAction");
        defpackage.pl plVar = new defpackage.pl("actionType");
        plVar.b(2);
        plVar.c(0);
        piVar.c(plVar.a());
        defpackage.po poVar = new defpackage.po("query");
        poVar.b(2);
        poVar.e(1);
        poVar.c(2);
        poVar.d(0);
        piVar.c(poVar.a());
        defpackage.po poVar2 = new defpackage.po("referencedQualifiedId");
        poVar2.b(2);
        poVar2.e(0);
        poVar2.c(0);
        poVar2.d(1);
        piVar.c(poVar2.a());
        defpackage.pl plVar2 = new defpackage.pl("resultRankInBlock");
        plVar2.b(2);
        plVar2.c(0);
        piVar.c(plVar2.a());
        defpackage.pl plVar3 = new defpackage.pl("resultRankGlobal");
        plVar3.b(2);
        plVar3.c(0);
        piVar.c(plVar3.a());
        return piVar.a();
    }

    @Override // defpackage.pr
    public final /* synthetic */ java.lang.Object b(defpackage.pw pwVar) {
        java.lang.String strH = pwVar.h();
        java.lang.String strG = pwVar.g();
        pwVar.b();
        pwVar.a();
        pwVar.q("actionType");
        java.lang.String[] strArrP = pwVar.p("query");
        if (strArrP != null && strArrP.length != 0) {
            java.lang.String str = strArrP[0];
        }
        java.lang.String[] strArrP2 = pwVar.p("referencedQualifiedId");
        if (strArrP2 != null && strArrP2.length != 0) {
            java.lang.String str2 = strArrP2[0];
        }
        pwVar.q("resultRankInBlock");
        pwVar.q("resultRankGlobal");
        new defpackage.ro(strH, strG);
        return new androidx.appsearch.usagereporting.ImpressionAction();
    }
}
