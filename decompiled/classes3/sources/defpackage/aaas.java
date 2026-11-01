package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaas extends defpackage.zyz {
    private final defpackage.amum b;
    private final int c;

    public aaas(int i, defpackage.zzg zzgVar) {
        java.util.Random random = new java.util.Random();
        akzz akzzVarM = defpackage.amum.a.m();
        double d = zzgVar.c;
        akzzVarM.u();
        defpackage.amum amumVar = akzzVarM.b;
        amumVar.b |= 1;
        amumVar.c = d;
        defpackage.amum amumVarP = akzzVarM.p();
        super(random);
        this.c = i;
        this.b = amumVarP;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    @Override // defpackage.zyz
    public final ajcq a(defpackage.zzs zzsVar) {
        zzt zztVarA;
        defpackage.amum amumVar = this.b;
        double d = amumVar.c;
        if (d <= 0.0d) {
            zztVarA = zzt.a;
        } else if (d == 1.0d && (amumVar.b & 2) == 0) {
            zztVarA = zzt.e;
        } else {
            double dNextDouble = this.a.nextDouble();
            double d2 = amumVar.c;
            ?? r4 = (dNextDouble > d2 ? 1 : (dNextDouble == d2 ? 0 : -1)) >>> 31;
            if ((amumVar.b & 2) != 0) {
                d2 = amumVar.d;
            }
            zztVarA = zzt.a((boolean) r4, d2);
        }
        return aiql.z(zztVarA);
    }

    @Override // defpackage.zyz
    public final amtz b() {
        akzx akzxVarM = amtz.a.m();
        akzxVarM.u();
        amtz amtzVar = akzxVarM.b;
        amtzVar.c = anar.Q(this.c);
        amtzVar.b |= 1;
        akzx akzxVarM2 = defpackage.amty.a.m();
        float f = (float) this.b.c;
        akzxVarM2.u();
        defpackage.amty amtyVar = (defpackage.amty) akzxVarM2.b;
        amtyVar.b |= 1;
        amtyVar.c = f;
        akzxVarM.u();
        amtz amtzVar2 = akzxVarM.b;
        defpackage.amty amtyVar2 = (defpackage.amty) akzxVarM2.p();
        j$.util.Objects.requireNonNull(amtyVar2);
        amtzVar2.e = amtyVar2;
        amtzVar2.b |= 4;
        return akzxVarM.p();
    }
}
