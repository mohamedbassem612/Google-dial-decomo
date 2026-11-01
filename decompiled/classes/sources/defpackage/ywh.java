package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ywh implements defpackage.zhg {
    @Override // defpackage.zhg
    public final java.lang.Object a(akmz akmzVar, java.lang.String str, defpackage.akzx akzxVar, defpackage.aoln aolnVar) {
        aknj aknjVar = akmzVar.f;
        if (aknjVar == null) {
            aknjVar = aknj.a;
        }
        akzxVar.u();
        zhj zhjVar = akzxVar.b;
        zhj zhjVar2 = zhj.a;
        j$.util.Objects.requireNonNull(aknjVar);
        zhjVar.j = aknjVar;
        zhjVar.b |= 128;
        return akzxVar;
    }

    @Override // defpackage.zhg
    public final void b(defpackage.akzx akzxVar) {
        defpackage.akzx akzxVarM = akmx.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        akzxVarM.b.b = true;
        akmx akmxVarR = akzxVarM.r();
        defpackage.aooh.e(akmxVarR, "build(...)");
        akmx akmxVar = akmxVarR;
        akzxVar.u();
        akmy akmyVar = akzxVar.b;
        akmy akmyVar2 = akmy.a;
        j$.util.Objects.requireNonNull(akmxVar);
        akmyVar.h = akmxVar;
        akmyVar.b |= 2;
    }
}
