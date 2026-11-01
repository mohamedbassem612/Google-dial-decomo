package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class acfj implements ahyc {
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.aktw aktwVar = (defpackage.aktw) obj;
        akzx akzxVarM = akkn.a.m();
        akzxVarM.aw(aktwVar.c);
        if ((aktwVar.b & 1) != 0) {
            ahxq ahxqVar = defpackage.acgl.a;
            defpackage.aktv aktvVarB = defpackage.aktv.b(aktwVar.d);
            if (aktvVarB == null) {
                aktvVarB = defpackage.aktv.ACTION_UNSPECIFIED;
            }
            defpackage.akkm akkmVar = (defpackage.akkm) ahxqVar.d(aktvVarB);
            akzxVarM.u();
            akkn akknVar = akzxVarM.b;
            akknVar.d = akkmVar.e;
            akknVar.b |= 1;
        }
        return akzxVarM.p();
    }
}
