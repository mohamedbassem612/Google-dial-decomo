package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zhh implements zhg {
    public final java.lang.Object a(defpackage.akmz akmzVar, java.lang.String str, akzx akzxVar, aoln aolnVar) {
        defpackage.akni akniVar = akmzVar.c;
        if (akniVar == null) {
            akniVar = defpackage.akni.a;
        }
        aooh.e(akniVar, "getPhoneNumberEntity(...)");
        java.lang.String str2 = akniVar.b;
        aooh.e(str2, "getEntityName(...)");
        if (str2.length() != 0) {
            java.lang.String str3 = akniVar.b;
            akzxVar.u();
            defpackage.zhj zhjVar = (defpackage.zhj) akzxVar.b;
            defpackage.zhj zhjVar2 = defpackage.zhj.a;
            j$.util.Objects.requireNonNull(str3);
            zhjVar.b |= 1;
            zhjVar.c = str3;
            int iAR = a.aR(akniVar.c);
            if ((iAR != 0 ? iAR : 1) - 2 == 2) {
                akzxVar.u();
                defpackage.zhj zhjVar3 = (defpackage.zhj) akzxVar.b;
                zhjVar3.d = 2;
                zhjVar3.b |= 2;
                java.lang.String str4 = akniVar.g;
                akzxVar.u();
                defpackage.zhj zhjVar4 = (defpackage.zhj) akzxVar.b;
                j$.util.Objects.requireNonNull(str4);
                zhjVar4.b |= 64;
                zhjVar4.i = str4;
            }
            boolean z = akniVar.h;
            akzxVar.u();
            defpackage.zhj zhjVar5 = (defpackage.zhj) akzxVar.b;
            zhjVar5.b |= 256;
            zhjVar5.k = z;
        }
        return akzxVar;
    }

    public final void b(akzx akzxVar) {
    }
}
