package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xdh {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/uistate/HoldForMeUiStateController");
    public final ajct b;
    public defpackage.wya c = defpackage.wya.a;
    public final ahda d = new ahda();
    private final defpackage.wxm e;
    private final zpz f;

    public xdh(ajct ajctVar, defpackage.wxm wxmVar, zpz zpzVar) {
        this.b = ajctVar;
        this.e = wxmVar;
        this.f = zpzVar;
    }

    public static defpackage.wya a(defpackage.wya wyaVar, defpackage.wxx wxxVar) {
        int iJ = wsc.j(wyaVar.c);
        if (iJ == 0) {
            throw null;
        }
        int i = iJ - 1;
        if (i == 2) {
            akzx akzxVarP = wyaVar.p();
            akzx akzxVarM = defpackage.wxq.a.m();
            akzxVarM.u();
            defpackage.wxq wxqVar = (defpackage.wxq) akzxVarM.b;
            j$.util.Objects.requireNonNull(wxxVar);
            wxqVar.c = wxxVar;
            wxqVar.b |= 1;
            akzxVarP.u();
            defpackage.wya wyaVar2 = (defpackage.wya) akzxVarP.b;
            defpackage.wxq wxqVar2 = (defpackage.wxq) akzxVarM.p();
            j$.util.Objects.requireNonNull(wxqVar2);
            wyaVar2.d = wxqVar2;
            wyaVar2.c = 4;
            return (defpackage.wya) akzxVarP.p();
        }
        if (i != 3) {
            return wyaVar;
        }
        akzx akzxVarP2 = wyaVar.p();
        akzx akzxVarM2 = defpackage.wxy.a.m();
        akzxVarM2.u();
        defpackage.wxy wxyVar = (defpackage.wxy) akzxVarM2.b;
        j$.util.Objects.requireNonNull(wxxVar);
        wxyVar.c = wxxVar;
        wxyVar.b |= 1;
        akzxVarP2.u();
        defpackage.wya wyaVar3 = (defpackage.wya) akzxVarP2.b;
        defpackage.wxy wxyVar2 = (defpackage.wxy) akzxVarM2.p();
        j$.util.Objects.requireNonNull(wxyVar2);
        wyaVar3.d = wxyVar2;
        wyaVar3.c = 5;
        return (defpackage.wya) akzxVarP2.p();
    }

    public static j$.util.Optional c(defpackage.wya wyaVar) {
        int i = wyaVar.c;
        int iJ = wsc.j(i);
        if (iJ == 0) {
            throw null;
        }
        int i2 = iJ - 1;
        if (i2 == 2) {
            defpackage.wxx wxxVar = (i == 4 ? (defpackage.wxq) wyaVar.d : defpackage.wxq.a).c;
            if (wxxVar == null) {
                wxxVar = defpackage.wxx.a;
            }
            return j$.util.Optional.of(wxxVar);
        }
        if (i2 != 3) {
            return j$.util.Optional.empty();
        }
        defpackage.wxx wxxVar2 = (i == 5 ? (defpackage.wxy) wyaVar.d : defpackage.wxy.a).c;
        if (wxxVar2 == null) {
            wxxVar2 = defpackage.wxx.a;
        }
        return j$.util.Optional.of(wxxVar2);
    }

    public final ajcq b(defpackage.wya wyaVar) {
        return this.d.g(new defpackage.wzc(this, wyaVar, 6, null), this.b);
    }

    public final void d(defpackage.wya wyaVar) {
        defpackage.wya wyaVar2 = this.c;
        if (wyaVar.equals(wyaVar2)) {
            return;
        }
        if (wsc.j(wyaVar.c) != wsc.j(wyaVar2.c)) {
            aimw aimwVarL = a.b().i(zct.a).l("com/android/incallui/atlas/ui/impl/tidepods/uistate/HoldForMeUiStateController", "setUiStateAndNotify", 162, "HoldForMeUiStateController.java");
            int iJ = wsc.j(wyaVar.c);
            if (iJ == 0) {
                throw null;
            }
            aimwVarL.H("set UI state %s for call %d", wsc.i(iJ), wyaVar.e);
            int i = wyaVar.c;
            int iJ2 = wsc.j(i);
            if (iJ2 == 0) {
                throw null;
            }
            int i2 = iJ2 - 1;
            if (i2 == 3) {
                this.e.b(wyaVar.e, defpackage.alex.ATLAS_UI_IVR_SAVE);
            } else if (i2 == 4) {
                this.e.b(wyaVar.e, defpackage.alex.ATLAS_UI_NOTIFYING);
            } else if (i2 == 6) {
                int iAe = a.ae((i == 8 ? (defpackage.wxs) wyaVar.d : defpackage.wxs.a).c);
                if (iAe == 0) {
                    iAe = 1;
                }
                int i3 = iAe - 1;
                defpackage.wxm wxmVar = this.e;
                if (i3 != 0) {
                    wxmVar.b(wyaVar.e, defpackage.alex.ATLAS_UI_AUDIO_ERROR);
                } else {
                    wxmVar.b(wyaVar.e, defpackage.alex.ATLAS_UI_UNSPECIFIED_ERROR);
                }
            }
        }
        this.c = wyaVar;
        this.f.a(ajcm.a);
    }
}
