package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wtd extends defpackage.agbx {
    final /* synthetic */ defpackage.wtk a;

    public wtd(defpackage.wtk wtkVar) {
        j$.util.Objects.requireNonNull(wtkVar);
        this.a = wtkVar;
    }

    @Override // defpackage.agbx, defpackage.aftt
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, int i) {
        c(i);
    }

    @Override // defpackage.agbx, defpackage.aftt
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // defpackage.agbx
    public final void c(int i) {
        defpackage.wtk wtkVar = this.a;
        ahok ahokVarF = wtkVar.i.f(1109, "onDismiss activatingHfmSnackbar");
        try {
            j$.util.Optional optionalB = wtkVar.b();
            defpackage.oxt oxtVar = new defpackage.oxt(i, 6);
            if (true == optionalB.isPresent()) {
                java.lang.Object obj = optionalB.get();
                int i2 = oxtVar.a;
                defpackage.wkp wkpVar = (defpackage.wkp) obj;
                akzx akzxVarM = defpackage.wgz.a.m();
                defpackage.wha whaVar = defpackage.wha.ADDON_FEATURE_KEY_HOLD_FOR_ME;
                akzxVarM.u();
                defpackage.wgz wgzVar = (defpackage.wgz) akzxVarM.b;
                wgzVar.c = whaVar.e;
                wgzVar.b |= 1;
                akzxVarM.u();
                defpackage.wgz wgzVar2 = (defpackage.wgz) akzxVarM.b;
                wgzVar2.b |= 2;
                wgzVar2.d = true;
                defpackage.wgz wgzVar3 = (defpackage.wgz) akzxVarM.p();
                defpackage.wha whaVarB = defpackage.wha.b(wgzVar3.c);
                if (whaVarB == null) {
                    whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
                }
                defpackage.wha whaVar2 = whaVarB;
                aimz aimzVar = zih.a;
                aoov.al(wkpVar.b, zih.b.plus(aols.a), 1, new defpackage.tgn((aoln) null, wkpVar, whaVar2, 11, (byte[]) null));
                if (i2 == 2) {
                    wkpVar.f(wgzVar3);
                }
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
