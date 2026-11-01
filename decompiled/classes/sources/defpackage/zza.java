package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zza extends defpackage.zyw {
    public zzh g;
    public int h;

    public final defpackage.zzd b() {
        java.lang.String str = this.e;
        defpackage.zzv zzvVar = this.d;
        zzh zzhVar = this.g;
        int iAS = 0;
        if (zzhVar != null && (zzhVar.b & 4) != 0 && (iAS = defpackage.a.aS(zzhVar.e)) == 0) {
            iAS = 1;
        }
        android.content.Context context = this.a;
        int i = iAS;
        defpackage.zze zzeVar = this.c;
        zzh zzhVar2 = this.g;
        int i2 = this.h;
        aaaq aaaqVar = null;
        if (zzhVar2 != null && i2 != 0) {
            defpackage.aift aiftVar = new defpackage.aift(4);
            if ((zzhVar2.b & 2) != 0) {
                zzg zzgVar = zzhVar2.d;
                if (zzgVar == null) {
                    zzgVar = zzg.a;
                }
                aiftVar.i(new aaas(i2, zzgVar));
            }
            if ((zzhVar2.b & 1) != 0) {
                zzf zzfVar = zzhVar2.c;
                if (zzfVar == null) {
                    zzfVar = zzf.a;
                }
                aiftVar.i(new aaar(i2, zzfVar, new aaax(context)));
            }
            defpackage.aify aifyVarG = aiftVar.g();
            if (!aifyVarG.isEmpty()) {
                aaaqVar = new aaaq(aifyVarG);
            }
        }
        return new defpackage.zzd(context, this.b, str, zzvVar, i, zzeVar, null, aaaqVar, this.f);
    }
}
