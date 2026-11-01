package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rxm implements defpackage.zta {
    private final /* synthetic */ int $cid;

    public rxm(int i) {
        this.$cid = i;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) throws java.io.IOException {
        nwh nwhVar;
        if (this.$cid == 0) {
            defpackage.aooh.f(zrxVar, "callParameter");
            rxn rxnVar = new rxn();
            defpackage.amxr.g(rxnVar);
            defpackage.ahgl.b(rxnVar, zrxVar);
            return rxnVar;
        }
        defpackage.aooh.f(zrxVar, "callParameter");
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(387, "CallingAccountSelector_showDialog");
        try {
            zsc zscVar = (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).p;
            if (zscVar == null) {
                zscVar = zsc.a;
            }
            defpackage.aooh.e(zscVar, "getCallingAccountSelectorAsyncData(...)");
            if (zscVar.f) {
                nwhVar = new nwh();
                defpackage.amxr.g(nwhVar);
            } else {
                nwh nwoVar = new nwo();
                defpackage.amxr.g(nwoVar);
                defpackage.ahgl.b(nwoVar, zrxVar);
                nwhVar = nwoVar;
            }
            defpackage.ajsz.ak(ahoqVarW, null);
            return nwhVar;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        if (this.$cid != 0) {
            defpackage.aooh.f(zrxVar, "callParameter");
            return ((zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).b & 4096) != 0 ? defpackage.aiql.z(zsz.c) : defpackage.aiql.z(zsz.b);
        }
        defpackage.aooh.f(zrxVar, "callParameter");
        return ((zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).b & 16384) != 0 ? defpackage.aiql.z(zsz.c) : defpackage.aiql.z(zsz.b);
    }

    @Override // defpackage.zta
    public final /* synthetic */ defpackage.ajcq c(zrx zrxVar) {
        return this.$cid != 0 ? defpackage.aiql.z(zrxVar) : defpackage.aiql.z(zrxVar);
    }
}
