package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mag implements defpackage.mab {
    private final android.content.Context a;
    private final rlv b;
    private final j$.util.Optional c;
    private final zjm d;
    private final zjm e;

    public mag(android.content.Context context, zjm zjmVar, zjm zjmVar2, rlv rlvVar, j$.util.Optional optional) {
        aooh.f(context, "context");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(optional, "transcriptAudioFeedback");
        this.a = context;
        this.d = zjmVar;
        this.e = zjmVar2;
        this.b = rlvVar;
        this.c = optional;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    @Override // defpackage.mab
    public final defpackage.mac a(defpackage.maf mafVar) {
        boolean z;
        boolean z2;
        aift aiftVar;
        java.lang.CharSequence charSequenceJoin;
        wxp wxpVar;
        wgu wguVar;
        j$.util.Optional optionalG = this.d.g();
        aooh.e(optionalG, "getFeature(...)");
        vqy vqyVar = (vqy) aooh.q(optionalG);
        j$.util.Optional optionalG2 = this.e.g();
        aooh.e(optionalG2, "getFeature(...)");
        defpackage.wye wyeVar = (defpackage.wye) aooh.q(optionalG2);
        defpackage.kip kipVar = mafVar.a;
        wgu wguVar2 = kipVar.s;
        if (wguVar2 == null) {
            wguVar2 = wgu.a;
        }
        aooh.e(wguVar2, "getXatuCallDetails(...)");
        wxp wxpVar2 = kipVar.o;
        if (wxpVar2 == null) {
            wxpVar2 = wxp.a;
        }
        aooh.e(wxpVar2, "getAtlasCallDetails(...)");
        defpackage.mae maeVar = null;
        if ((wyeVar == null || !wxpVar2.e) && (vqyVar == null || !wguVar2.e)) {
            return null;
        }
        android.content.Context context = this.a;
        wxp wxpVar3 = kipVar.o;
        if ((wxpVar3 == null ? wxp.a : wxpVar3).e) {
            if (wxpVar3 == null) {
                wxpVar3 = wxp.a;
            }
            if (wxpVar3.g) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        wgu wguVar3 = kipVar.s;
        if ((wguVar3 == null ? wgu.a : wguVar3).e) {
            if (wguVar3 == null) {
                wguVar3 = wgu.a;
            }
            if (wguVar3.c) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (z || z2) {
            java.lang.String string = context.getString(2132020595);
            aooh.e(string, "getString(...)");
            maeVar = new defpackage.mae(string, 2132083183);
        }
        if (wyeVar == null) {
            aiftVar = new aift(4);
            if (vqyVar != null) {
                wguVar = kipVar.s;
                if (wguVar == null) {
                    wguVar = wgu.a;
                }
                if (wguVar.e) {
                    aiftVar.i(vqyVar.a());
                }
            }
            if (wyeVar != null) {
                wxpVar = kipVar.o;
                if (wxpVar == null) {
                    wxpVar = wxp.a;
                }
                if (wxpVar.e) {
                    aiftVar.i(wyeVar.c.e());
                }
            }
            charSequenceJoin = android.text.TextUtils.join((java.lang.CharSequence) ", ", (java.lang.Iterable) aiftVar.h());
            aooh.e(charSequenceJoin, "join(...)");
        } else {
            wxp wxpVar4 = kipVar.o;
            if ((wxpVar4 == null ? wxp.a : wxpVar4).e) {
                if (vqyVar != null) {
                    wgu wguVar4 = kipVar.s;
                    if (wguVar4 == null) {
                        wguVar4 = wgu.a;
                    }
                    if (wguVar4.e) {
                        aiftVar = new aift(4);
                        if (vqyVar != null) {
                            wguVar = kipVar.s;
                            if (wguVar == null) {
                                wguVar = wgu.a;
                            }
                            if (wguVar.e) {
                                aiftVar.i(vqyVar.a());
                            }
                        }
                        if (wyeVar != null) {
                            wxpVar = kipVar.o;
                            if (wxpVar == null) {
                                wxpVar = wxp.a;
                            }
                            if (wxpVar.e) {
                                aiftVar.i(wyeVar.c.e());
                            }
                        }
                        charSequenceJoin = android.text.TextUtils.join((java.lang.CharSequence) ", ", (java.lang.Iterable) aiftVar.h());
                        aooh.e(charSequenceJoin, "join(...)");
                    }
                }
                xtq xtqVar = wyeVar.c;
                if (wxpVar4 == null) {
                    wxpVar4 = wxp.a;
                }
                wyb wybVar = wxpVar4.c;
                if (wybVar == null) {
                    wybVar = wyb.a;
                }
                int iAd = a.ad(wybVar.d);
                if (iAd == 0) {
                    iAd = 1;
                }
                wxp wxpVar5 = kipVar.o;
                if (wxpVar5 == null) {
                    wxpVar5 = wxp.a;
                }
                charSequenceJoin = xtqVar.f(iAd, wxpVar5.f);
                aooh.e(charSequenceJoin, "textForCallLogEntry(...)");
            } else {
                aiftVar = new aift(4);
                if (vqyVar != null) {
                    wguVar = kipVar.s;
                    if (wguVar == null) {
                        wguVar = wgu.a;
                    }
                    if (wguVar.e) {
                        aiftVar.i(vqyVar.a());
                    }
                }
                if (wyeVar != null) {
                    wxpVar = kipVar.o;
                    if (wxpVar == null) {
                        wxpVar = wxp.a;
                    }
                    if (wxpVar.e) {
                        aiftVar.i(wyeVar.c.e());
                    }
                }
                charSequenceJoin = android.text.TextUtils.join((java.lang.CharSequence) ", ", (java.lang.Iterable) aiftVar.h());
                aooh.e(charSequenceJoin, "join(...)");
            }
        }
        return new defpackage.mac(new defpackage.mae(charSequenceJoin, 2132083182), maeVar, new defpackage.maa(2131231550, java.lang.Integer.valueOf(urg.c(context, 2130968958))), maeVar != null);
    }

    @Override // defpackage.mab
    public final void b(android.view.View view, defpackage.maf mafVar) {
        utu utuVarX;
        this.b.o(rmx.mc);
        abwd abwdVar = mafVar.c;
        if (abwdVar != null) {
            vqf vqfVarBy = wsc.by(utu.a.m());
            defpackage.kip kipVar = mafVar.a;
            vqfVarBy.z(kipVar.d);
            vqfVarBy.C(5);
            java.lang.String strC = defpackage.kon.c(kipVar);
            aooh.e(strC, "getUniqueCallId(...)");
            vqfVarBy.B(strC);
            vqfVarBy.A(abwdVar);
            utuVarX = vqfVarBy.x();
        } else {
            utuVarX = null;
        }
        if (((wsc) aooh.q(this.c)) != null) {
            wsc.bf(view.getContext(), utuVarX);
        }
    }

    @Override // defpackage.mab
    public final void c() {
        this.b.o(rmx.ma);
    }
}
