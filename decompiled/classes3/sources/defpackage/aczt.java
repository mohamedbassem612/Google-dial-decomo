package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aczt implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ aczt(adlt adltVar, defpackage.acwe acweVar, defpackage.acvv acvvVar, java.util.List list, int i, int i2, int i3) {
        this.$cid = i3;
        this.c = adltVar;
        this.d = acweVar;
        this.e = acvvVar;
        this.f = list;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ymz] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [acxa, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.ylf ylfVar = (defpackage.ylf) obj;
            java.lang.Object obj2 = this.c;
            int i = this.b;
            int i2 = this.a;
            ?? r0 = this.e;
            java.lang.Object obj3 = this.d;
            try {
                java.lang.Object objA = r0.a(ylfVar);
                ((defpackage.yna) obj3).o(i2, i, (defpackage.ync) obj2, 4, 0);
                return aiql.z(objA);
            } catch (java.lang.Exception e) {
                boolean z = e instanceof defpackage.ymi;
                ((defpackage.yna) obj3).o(i2, i, (defpackage.ync) obj2, 5, z ? ((defpackage.ymi) e).b : 6);
                return z ? aiql.y(e) : aiql.y(new defpackage.ymi(3, 6, (java.lang.String) this.f, e));
            }
        }
        defpackage.acwg acwgVar = (defpackage.acwg) obj;
        java.lang.Object obj4 = this.c;
        if (acwgVar != null) {
            defpackage.acwa acwaVarB = defpackage.acwa.b(acwgVar.d);
            if (acwaVarB == null) {
                acwaVarB = defpackage.acwa.NONE;
            }
            if (acwaVarB == defpackage.acwa.DOWNLOAD_COMPLETE) {
                java.lang.Object obj5 = this.d;
                adlt adltVar = (adlt) obj4;
                java.lang.Object obj6 = adltVar.l;
                defpackage.acwe acweVar = (defpackage.acwe) obj5;
                int iAQ = a.aQ(acweVar.f);
                if (abrz.P((android.content.Context) obj6, iAQ == 0 ? 1 : iAQ, acwgVar.c, acweVar.e, (acxa) adltVar.d, (ahyn) adltVar.i, false) != null) {
                    return aiql.z(this.e);
                }
            }
        }
        return ((adlt) obj4).m((java.util.List) this.f, this.a + 1, this.b);
    }

    public /* synthetic */ aczt(defpackage.yna ynaVar, defpackage.ymz ymzVar, int i, int i2, defpackage.ync yncVar, java.lang.String str, int i3) {
        this.$cid = i3;
        this.d = ynaVar;
        this.e = ymzVar;
        this.a = i;
        this.b = i2;
        this.c = yncVar;
        this.f = str;
    }
}
