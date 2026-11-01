package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aczr implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.acvv a;
    public final /* synthetic */ defpackage.acvr b;
    public final /* synthetic */ defpackage.acwe c;
    public final /* synthetic */ defpackage.acwb d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ defpackage.acvw h;
    public final /* synthetic */ int i;
    public final /* synthetic */ java.util.List j;
    public final /* synthetic */ java.lang.Object k;
    public final /* synthetic */ java.lang.Object l;
    public final /* synthetic */ adlt m;

    public /* synthetic */ aczr(adlt adltVar, defpackage.acwe acweVar, java.lang.String str, defpackage.acvr acvrVar, defpackage.acvv acvvVar, defpackage.acwb acwbVar, int i, long j, java.lang.String str2, defpackage.acvw acvwVar, int i2, java.util.List list, akyp akypVar, int i3) {
        this.$cid = i3;
        this.m = adltVar;
        this.c = acweVar;
        this.l = str;
        this.b = acvrVar;
        this.a = acvvVar;
        this.d = acwbVar;
        this.e = i;
        this.f = j;
        this.g = str2;
        this.h = acvwVar;
        this.i = i2;
        this.j = list;
        this.k = akypVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [acvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [acxa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [acvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [adba, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        defpackage.acvv acvvVar;
        if (this.$cid != 0) {
            defpackage.acwg acwgVar = (defpackage.acwg) obj;
            defpackage.acwa acwaVarB = defpackage.acwa.b(acwgVar.d);
            if (acwaVarB == null) {
                acwaVarB = defpackage.acwa.NONE;
            }
            if (acwaVarB == defpackage.acwa.DOWNLOAD_COMPLETE) {
                return ajcm.a;
            }
            defpackage.acwe acweVar = this.c;
            akzx akzxVarP = acwgVar.p();
            int iAQ = a.aQ(acweVar.f);
            int i = iAQ == 0 ? 1 : iAQ;
            java.lang.Object obj2 = this.k;
            java.util.List list = this.j;
            int i2 = this.i;
            defpackage.acvw acvwVar = this.h;
            java.lang.String str = this.g;
            long j = this.f;
            int i3 = this.e;
            defpackage.acwb acwbVar = this.d;
            defpackage.acvv acvvVar2 = this.a;
            defpackage.acvr acvrVar = this.b;
            java.lang.Object obj3 = this.l;
            adlt adltVar = this.m;
            ajcq ajcqVarN = adltVar.n(i, (java.lang.String) obj3, acvrVar.g);
            defpackage.adcs adcsVarE = defpackage.adcs.e(ajcqVarN);
            defpackage.aczq aczqVar = new defpackage.aczq((java.lang.Object) adltVar, (java.lang.Object) akzxVarP, (java.lang.Object) acweVar, 3, (char[]) null);
            ?? r5 = adltVar.h;
            return adcsVarE.g(aczqVar, r5).g(new defpackage.aczr(adltVar, ajcqVarN, acvvVar2, acvrVar, acweVar, acwbVar, i3, j, str, acvwVar, i2, list, (akyp) obj2, 0), r5);
        }
        android.net.Uri uri = (android.net.Uri) aiql.H((java.util.concurrent.Future) this.k);
        adlt adltVar2 = this.m;
        ahyn ahynVar = (ahyn) adltVar2.k;
        boolean zF = ahynVar.f();
        java.lang.Object obj4 = this.l;
        java.util.List list2 = this.j;
        int i4 = this.i;
        defpackage.acvw acvwVar2 = this.h;
        java.lang.String str2 = this.g;
        long j2 = this.f;
        int i5 = this.e;
        defpackage.acwb acwbVar2 = this.d;
        defpackage.acwe acweVar2 = this.c;
        defpackage.acvr acvrVar2 = this.b;
        if (!zF || (acvvVar = this.a) == null) {
            ?? r6 = adltVar2.e;
            java.lang.Object obj5 = adltVar2.g;
            int iAQ2 = a.aQ(acweVar2.f);
            defpackage.adat adatVar = new defpackage.adat(r6, (aogc) obj5, acvrVar2, iAQ2 == 0 ? 1 : iAQ2, adltVar2.b, acwbVar2, i5, j2, str2, adltVar2.c, adltVar2.h);
            adltVar2.l(acwbVar2, uri);
            return ((adax) adltVar2.f).c(acweVar2.e, acwbVar2, i5, j2, str2, uri, acvrVar2.d, acvrVar2.e, acvwVar2, adatVar, i4, list2, (akyp) obj4);
        }
        java.lang.Object obj6 = adltVar2.l;
        ?? r0 = adltVar2.e;
        java.lang.Object obj7 = adltVar2.g;
        ?? r1 = adltVar2.d;
        int iAQ3 = a.aQ(acweVar2.f);
        defpackage.adas adasVar = new defpackage.adas((android.content.Context) obj6, r0, (aogc) obj7, r1, acvrVar2, iAQ3 == 0 ? 1 : iAQ3, (adae) ahynVar.b(), acvvVar, adltVar2.b, acwbVar2, i5, j2, str2, (ahyn) adltVar2.i, adltVar2.c, adltVar2.h);
        adltVar2.l(acwbVar2, uri);
        return ((adax) adltVar2.f).c(acweVar2.e, acwbVar2, i5, j2, str2, uri, acvvVar.c, acvvVar.d, acvwVar2, adasVar, i4, list2, (akyp) obj4);
    }

    public /* synthetic */ aczr(adlt adltVar, ajcq ajcqVar, defpackage.acvv acvvVar, defpackage.acvr acvrVar, defpackage.acwe acweVar, defpackage.acwb acwbVar, int i, long j, java.lang.String str, defpackage.acvw acvwVar, int i2, java.util.List list, akyp akypVar, int i3) {
        this.$cid = i3;
        this.m = adltVar;
        this.k = ajcqVar;
        this.a = acvvVar;
        this.b = acvrVar;
        this.c = acweVar;
        this.d = acwbVar;
        this.e = i;
        this.f = j;
        this.g = str;
        this.h = acvwVar;
        this.i = i2;
        this.j = list;
        this.l = akypVar;
    }
}
