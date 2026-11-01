package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adcq implements defpackage.acvk {
    public final defpackage.ahzi a;

    /* JADX WARN: Type inference failed for: r1v1, types: [ahzi, java.lang.Object] */
    public adcq(defpackage.aiyy aiyyVar) {
        this.a = aiyyVar.a;
    }

    @Override // defpackage.acvk
    public final defpackage.ajcq a(defpackage.acwi acwiVar) {
        int i = defpackage.adbe.a;
        defpackage.ajcq ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
        defpackage.ahzi ahziVar = this.a;
        if (ahziVar.eZ() != null && !((defpackage.acux) ahziVar.eZ()).c.isEmpty()) {
            ajcqVarZ = defpackage.aiql.z(defpackage.ahyn.h((defpackage.acux) ahziVar.eZ()));
        }
        aczi acziVar = new aczi(acwiVar, 20);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarZ, acziVar, ajbmVar);
        defpackage.ahvr.J(ajcqVarI, new uwo(this, 9), ajbmVar);
        return defpackage.abrz.ad(ajcqVarI).D(new defpackage.aczf(6), ajbmVar);
    }
}
