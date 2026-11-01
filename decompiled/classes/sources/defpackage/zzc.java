package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zzc extends defpackage.zyy implements defpackage.zzn {
    public defpackage.zzu q;
    private final defpackage.albh r;

    public zzc(defpackage.zzd zzdVar, defpackage.albh albhVar) {
        super(zzdVar);
        this.r = albhVar;
    }

    @Override // defpackage.zyy
    public final com.google.android.gms.clearcut.LogEventParcelable c() {
        defpackage.amtz amtzVarB;
        aiva aivaVar = this.c;
        if (aivaVar != null) {
            defpackage.akzz akzzVar = this.p;
            defpackage.akzc akzcVarF = aivaVar.f();
            akzzVar.u();
            defpackage.amua amuaVar = (defpackage.amua) akzzVar.b;
            defpackage.amua amuaVar2 = defpackage.amua.a;
            j$.util.Objects.requireNonNull(akzcVarF);
            amuaVar.b |= 524288;
            amuaVar.h = akzcVarF;
        }
        defpackage.akzz akzzVar2 = this.p;
        defpackage.akzc akzcVarF2 = this.r.f();
        akzzVar2.u();
        defpackage.amua amuaVar3 = (defpackage.amua) akzzVar2.b;
        defpackage.amua amuaVar4 = defpackage.amua.a;
        j$.util.Objects.requireNonNull(akzcVarF2);
        amuaVar3.b |= 2048;
        amuaVar3.f = akzcVarF2;
        defpackage.zzd zzdVar = (defpackage.zzd) this.a;
        zyz zyzVar = zzdVar.n;
        if (zyzVar != null && (amtzVarB = zyzVar.b()) != null) {
            akzzVar2.u();
            defpackage.amua amuaVar5 = (defpackage.amua) akzzVar2.b;
            j$.util.Objects.requireNonNull(amtzVarB);
            amuaVar5.l = amtzVarB;
            amuaVar5.b |= 134217728;
        }
        defpackage.amua amuaVar6 = (defpackage.amua) akzzVar2.r();
        com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext = new com.google.android.gms.clearcut.internal.PlayLoggerContext(zzdVar.h, defpackage.zyx.a(zzdVar.e), this.j, this.i, l(), zzdVar.i);
        byte[] bArrI = amuaVar6.i();
        int[] iArrE = defpackage.zyx.e(this.d);
        java.util.ArrayList arrayList = this.e;
        java.lang.String[] strArr = arrayList != null ? (java.lang.String[]) arrayList.toArray(defpackage.zyx.b) : null;
        int[] iArrE2 = defpackage.zyx.e(this.f);
        java.util.ArrayList arrayList2 = this.g;
        com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr = arrayList2 != null ? (com.google.android.gms.phenotype.ExperimentTokens[]) arrayList2.toArray(defpackage.zyx.a) : null;
        java.util.Set set = this.h;
        return new com.google.android.gms.clearcut.LogEventParcelable(playLoggerContext, amuaVar6, bArrI, iArrE, strArr, iArrE2, experimentTokensArr, set != null ? (java.lang.String[]) set.toArray(defpackage.zyx.b) : null, amuaVar6.e, null);
    }

    @Override // defpackage.zyy
    public final defpackage.aaum d() {
        if (this.b) {
            throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
        }
        this.b = true;
        return ((defpackage.zzd) this.a).f.a(this);
    }

    @Override // defpackage.zyy
    public final defpackage.ajcq e(zyz zyzVar) {
        return zyzVar.a(new zzs(j$.time.Instant.ofEpochMilli(a())));
    }

    @Override // defpackage.zyy
    public final /* bridge */ /* synthetic */ void i(double d) {
        defpackage.akzz akzzVar = this.p;
        akzzVar.u();
        defpackage.amua amuaVar = (defpackage.amua) akzzVar.b;
        defpackage.amua amuaVar2 = defpackage.amua.a;
        amuaVar.b |= 67108864;
        amuaVar.k = d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.zyy
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
        for (defpackage.zzx zzxVar : defpackage.zzx.a().a) {
            if (!this.a.d()) {
                byte[] bArr = null;
                defpackage.gou.B(this, new defpackage.jvu(zzxVar, this, 12, bArr), new defpackage.jtv(zzxVar, this, 16, bArr));
                int i = 13;
                defpackage.jvu jvuVar = new defpackage.jvu(zzxVar, this, i, bArr);
                java.lang.Object obj = zzxVar.a;
                j$.util.Objects.requireNonNull(obj);
                defpackage.gou.B(this, jvuVar, new defpackage.vut(obj, i));
            }
        }
        java.util.Iterator it = defpackage.zzd.m.iterator();
        while (it.hasNext()) {
            ((defpackage.zzb) it.next()).a(this);
        }
    }
}
