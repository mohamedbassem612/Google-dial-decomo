package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeld extends defpackage.aele {
    public static final zzl a = new zzl(78315553, 4);
    private final defpackage.aehm b;
    private final zzd c;
    private final zzd d;
    private final java.lang.String e;

    public aeld(defpackage.aehm aehmVar, android.content.Context context) {
        java.util.List list = zzd.m;
        zza zzaVar = new zza(context, "ONEGOOGLE_MOBILE");
        ((zyw) zzaVar).f = new defpackage.afmw(1);
        zzd zzdVarB = zzaVar.b();
        zzd zzdVarI = zzd.i(context, "ONEGOOGLE_MOBILE");
        this.c = zzdVarB;
        this.d = zzdVarI;
        this.b = aehmVar;
        this.e = context.getApplicationContext().getPackageName();
    }

    @Override // defpackage.aele, defpackage.aelf
    public final void a(java.lang.Object obj, defpackage.alfm alfmVar) {
        acln aclnVarA;
        zzc zzcVarG;
        defpackage.aehm aehmVar = this.b;
        defpackage.agon agonVar = (defpackage.agon) obj;
        int i = 2;
        if (agonVar == null) {
            aclnVarA = new acln(3, (java.lang.String) null);
        } else {
            java.lang.String str = agonVar.b.j;
            if ("pseudonymous".equals(str)) {
                aclnVarA = new acln(2, (java.lang.String) null);
            } else if ("incognito".equals(str)) {
                aclnVarA = new acln(3, (java.lang.String) null);
            } else {
                aclnVarA = ((defpackage.agrb) aehmVar).g(agonVar) ? acln.a(defpackage.agrb.i(agonVar)) : new acln(2, (java.lang.String) null);
            }
        }
        int i2 = aclnVarA.b;
        if (i2 != 4) {
            if (i2 != 1 || (obj != null && aehmVar.g(obj))) {
                i = i2;
            }
            int iH = aknx.H(alfmVar.c);
            boolean z = false;
            ahvr.bM((iH == 0 || iH == 1) ? false : true);
            int I = aknx.I(alfmVar.d);
            ahvr.bM((I == 0 || I == 1) ? false : true);
            int iAd = a.ad(alfmVar.f);
            if (iAd != 0 && iAd != 1) {
                z = true;
            }
            ahvr.bM(z);
            akzx akzxVarM = defpackage.alfn.a.m();
            akzx akzxVarP = alfmVar.p();
            java.lang.String str2 = this.e;
            akzxVarP.u();
            defpackage.alfm alfmVar2 = (defpackage.alfm) akzxVarP.b;
            j$.util.Objects.requireNonNull(str2);
            alfmVar2.b |= 64;
            alfmVar2.g = str2;
            defpackage.alfm alfmVar3 = (defpackage.alfm) akzxVarP.p();
            akzxVarM.u();
            defpackage.alfn alfnVar = (defpackage.alfn) akzxVarM.b;
            j$.util.Objects.requireNonNull(alfmVar3);
            alfnVar.c = alfmVar3;
            alfnVar.b |= 1;
            defpackage.alfn alfnVar2 = (defpackage.alfn) akzxVarM.p();
            int i3 = i - 1;
            if (i3 != 0) {
                zzcVarG = i3 != 1 ? this.d.g(alfnVar2) : this.c.g(alfnVar2);
            } else {
                zzcVarG = this.c.g(alfnVar2);
                zzcVarG.k(java.lang.String.valueOf(aehmVar.c(obj)));
            }
            int iH2 = aknx.H(alfmVar.c);
            zzcVarG.m((iH2 != 0 ? iH2 : 1) - 1);
            zzcVarG.d();
        }
    }
}
