package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class crt {
    public static final defpackage.aco a;

    static {
        float[] fArr = defpackage.crp.a;
        defpackage.csb csbVar = defpackage.crp.e;
        int i = csbVar.c;
        defpackage.crq crqVar = new defpackage.crq(csbVar);
        defpackage.csb csbVar2 = defpackage.crp.e;
        int i2 = csbVar2.c;
        defpackage.crn crnVar = defpackage.crp.x;
        int i3 = i2 | (crnVar.c << 6);
        defpackage.crs crsVar = new defpackage.crs(csbVar2, crnVar);
        defpackage.crn crnVar2 = defpackage.crp.x;
        int i4 = crnVar2.c;
        defpackage.csb csbVar3 = defpackage.crp.e;
        int i5 = i4 | (csbVar3.c << 6);
        defpackage.crs crsVar2 = new defpackage.crs(crnVar2, csbVar3);
        defpackage.aco acoVar = defpackage.acp.a;
        defpackage.aco acoVar2 = new defpackage.aco(6);
        acoVar2.g(i | (i << 6), crqVar);
        acoVar2.g(i3, crsVar);
        acoVar2.g(i5, crsVar2);
        a = acoVar2;
    }
}
