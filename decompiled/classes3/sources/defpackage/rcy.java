package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rcy implements aomy {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ defpackage.rdk c;

    public /* synthetic */ rcy(boolean z, boolean z2, defpackage.rdk rdkVar) {
        this.a = z;
        this.b = z2;
        this.c = rdkVar;
    }

    public final java.lang.Object a() {
        aify aifyVar;
        defpackage.rcc rccVarD;
        defpackage.rdk rdkVar = this.c;
        boolean z = this.a;
        if (z && (!this.b || ((rccVarD = rdkVar.d()) != null && rccVarD.q))) {
            return aokc.a;
        }
        defpackage.rcc rccVarD2 = rdkVar.d();
        if (rccVarD2 != null && (aifyVar = rccVarD2.d) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : aifyVar) {
                defpackage.qtw qtwVar = (defpackage.qtw) obj;
                if (z) {
                    int i = qtwVar.c;
                    defpackage.qug qugVarB = defpackage.qug.b(i);
                    if (qugVarB == null) {
                        qugVarB = defpackage.qug.BUTTON_UNKNOWN;
                    }
                    if (qugVarB != defpackage.qug.BUTTON_MORE) {
                        defpackage.qug qugVarB2 = defpackage.qug.b(i);
                        if (qugVarB2 == null) {
                            qugVarB2 = defpackage.qug.BUTTON_UNKNOWN;
                        }
                        if (qugVarB2 != defpackage.qug.BUTTON_AUDIO_ROUTE) {
                        }
                    }
                }
                arrayList.add(obj);
            }
            java.util.List listBV = ajsz.bV(arrayList);
            if (listBV != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(listBV, 10));
                for (java.util.Iterator it = listBV.iterator(); it.hasNext(); it = it) {
                    defpackage.qtw qtwVar2 = (defpackage.qtw) it.next();
                    aooh.c(qtwVar2);
                    int i2 = qtwVar2.d;
                    java.lang.String str = qtwVar2.e;
                    aooh.e(str, "getLabel(...)");
                    java.lang.String str2 = qtwVar2.f;
                    java.lang.String str3 = (qtwVar2.b & 512) != 0 ? qtwVar2.k : null;
                    boolean z2 = qtwVar2.h;
                    boolean z3 = qtwVar2.g;
                    boolean z4 = qtwVar2.i;
                    boolean z5 = qtwVar2.j;
                    java.lang.Object objA = rdkVar.t.a();
                    aooh.e(objA, "get(...)");
                    arrayList2.add(new defpackage.qxm(i2, z4, str, str2, str3, z2, z3, new defpackage.qza(rdkVar, qtwVar2, 4), z, z5, ((java.lang.Number) objA).longValue()));
                }
                return arrayList2;
            }
        }
        return aokc.a;
    }
}
