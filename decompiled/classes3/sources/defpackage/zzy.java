package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zzy extends zyy {
    public zzy(zyx zyxVar, akzc akzcVar) {
        super(zyxVar);
        akzz akzzVar = this.p;
        akzzVar.u();
        amua amuaVar = akzzVar.b;
        amua amuaVar2 = amua.a;
        j$.util.Objects.requireNonNull(akzcVar);
        amuaVar.b |= 2048;
        amuaVar.f = akzcVar;
    }

    public final com.google.android.gms.clearcut.LogEventParcelable c() {
        defpackage.aiva aivaVar = this.c;
        if (aivaVar != null) {
            akzz akzzVar = this.p;
            akzc akzcVarF = aivaVar.f();
            akzzVar.u();
            amua amuaVar = akzzVar.b;
            amua amuaVar2 = amua.a;
            j$.util.Objects.requireNonNull(akzcVarF);
            amuaVar.b |= 524288;
            amuaVar.h = akzcVarF;
        }
        amua amuaVarP = this.p.p();
        zyx zyxVar = this.a;
        com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext = new com.google.android.gms.clearcut.internal.PlayLoggerContext(zyxVar.h, zyx.a(zyxVar.e), this.j, this.i, l(), zyxVar.i);
        byte[] bArrI = amuaVarP.i();
        int[] iArrE = zyx.e(this.d);
        java.util.ArrayList arrayList = this.e;
        java.lang.String[] strArr = arrayList != null ? (java.lang.String[]) arrayList.toArray(zyx.b) : null;
        int[] iArrE2 = zyx.e(this.f);
        java.util.ArrayList arrayList2 = this.g;
        com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr = arrayList2 != null ? (com.google.android.gms.phenotype.ExperimentTokens[]) arrayList2.toArray(zyx.a) : null;
        java.util.Set set = this.h;
        return new com.google.android.gms.clearcut.LogEventParcelable(playLoggerContext, amuaVarP, bArrI, iArrE, strArr, iArrE2, experimentTokensArr, set != null ? (java.lang.String[]) set.toArray(zyx.b) : null, amuaVarP.e, (java.lang.Long) null);
    }

    public final aaum d() {
        throw null;
    }

    public final ajcq e(defpackage.zyz zyzVar) {
        return aiql.z(zzt.c);
    }

    public final /* bridge */ /* synthetic */ void i(double d) {
    }
}
