package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class sea extends aomh implements aonn {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ defpackage.sdw d;
    final /* synthetic */ defpackage.spn e;
    final /* synthetic */ hrc f;
    final /* synthetic */ gpd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sea(hrc hrcVar, boolean z, gpd gpdVar, java.lang.String str, defpackage.sdw sdwVar, defpackage.spn spnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = hrcVar;
        this.b = z;
        this.g = gpdVar;
        this.c = str;
        this.d = sdwVar;
        this.e = spnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.sea seaVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        java.lang.String str = null;
        aooc.af(obj);
        if (i != 0) {
            seaVar = this;
        } else {
            boolean z = this.b;
            if (!z) {
                if (!z) {
                    this.g.j(this.c).b(mce.hE);
                }
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                aooh.e(optionalEmpty, "empty(...)");
                return optionalEmpty;
            }
            defpackage.sdw sdwVar = this.d;
            defpackage.spn spnVar = this.e;
            this.a = 1;
            defpackage.spd spdVarJ = snl.J(spnVar);
            if (spdVarJ != null) {
                long j = spdVarJ.j;
                java.lang.String str2 = spdVarJ.q;
                aooh.c(str2);
                java.lang.String str3 = str2.length() <= 0 ? null : str2;
                java.lang.String str4 = spdVarJ.l;
                aooh.c(str4);
                seaVar = this;
                java.lang.Object objD = sdwVar.d(j, str3, str4.length() <= 0 ? null : str4, seaVar);
                if (objD != aoluVar) {
                    objD = (defpackage.abxt) objD;
                }
                obj = objD;
            } else {
                seaVar = this;
                obj = null;
            }
            if (obj == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.abxt abxtVar = (defpackage.abxt) obj;
        if (abxtVar != null) {
            defpackage.abxp abxpVar = abxtVar.c;
            if (abxpVar == null) {
                abxpVar = defpackage.abxp.a;
            }
            if (abxpVar != null) {
                defpackage.abxs abxsVar = abxpVar.b == 1 ? (defpackage.abxs) abxpVar.c : defpackage.abxs.a;
                if (abxsVar != null) {
                    str = abxsVar.f;
                }
            }
        }
        if (abxtVar == null || str == null || str.length() == 0) {
            seaVar.g.j(seaVar.c).b(mce.hF);
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(abxtVar);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.sea(this.f, this.b, this.g, this.c, this.d, this.e, aolnVar);
    }
}
