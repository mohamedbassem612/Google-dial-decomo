package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lde implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ lde(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.EditText editText = null;
        switch (this.$cid) {
            case 0:
                com.android.dialer.callscreen.impl.history.CallScreenSessionActivity callScreenSessionActivity = (com.android.dialer.callscreen.impl.history.CallScreenSessionActivity) this.a;
                callScreenSessionActivity.z(8);
                defpackage.hhe.K(view.getContext().getApplicationContext()).bt().o(rmx.bY);
                callScreenSessionActivity.y();
                break;
            case 1:
                defpackage.lce lceVar = (defpackage.lce) this.a;
                lceVar.e.o(rmx.bW);
                az azVarG = lceVar.c.G();
                ahvr.ci(azVarG);
                new afpl(azVarG).N(lceVar.h.s());
                break;
            case 2:
                com.android.dialer.callscreen.impl.history.CallScreenSessionActivity callScreenSessionActivity2 = (com.android.dialer.callscreen.impl.history.CallScreenSessionActivity) this.a;
                callScreenSessionActivity2.z(8);
                defpackage.hhe.K(view.getContext().getApplicationContext()).bt().o(rmx.bZ);
                callScreenSessionActivity2.y();
                break;
            case 3:
                defpackage.lhh lhhVar = (defpackage.lhh) this.a;
                lhhVar.e.o(rmx.bW);
                new afpl(lhhVar.c.G()).N(lhhVar.l.s());
                break;
            case 4:
                ahvr.j(new defpackage.lip(((defpackage.lis) this.a).a), view);
                break;
            case 5:
                defpackage.llh llhVar = (defpackage.llh) this.a;
                java.util.Map map = llhVar.b;
                if (map.isEmpty()) {
                    a.bI(defpackage.llh.a.c().m(aioa.b), "No results to log.", "com/android/dialer/callscreen/impl/survey/CallScreenSurveyFragmentPeer", "logSurveyResults", 'm', "CallScreenSurveyFragmentPeer.java", zct.b);
                } else {
                    akzx akzxVarM = ampf.a.m();
                    defpackage.lld lldVar = llhVar.c;
                    java.lang.String str = lldVar.d;
                    akzxVarM.u();
                    ampf ampfVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(str);
                    ampfVar.b |= 1;
                    ampfVar.c = str;
                    ypm ypmVarB = ypm.b(lldVar.e);
                    if (ypmVarB == null) {
                        ypmVarB = ypm.a;
                    }
                    akzxVarM.u();
                    ampf ampfVar2 = akzxVarM.b;
                    ampfVar2.d = ypmVarB.a();
                    ampfVar2.b |= 2;
                    for (ampc ampcVar : new alam(lldVar.f, defpackage.lld.a)) {
                        akzx akzxVarM2 = ampd.a.m();
                        akzxVarM2.u();
                        ampd ampdVar = akzxVarM2.b;
                        ampdVar.c = ampcVar.e;
                        ampdVar.b |= 1;
                        ampe ampeVar = (ampe) map.get(ampcVar);
                        akzxVarM2.u();
                        ampd ampdVar2 = akzxVarM2.b;
                        ampdVar2.d = ampeVar.g;
                        ampdVar2.b |= 2;
                        akzxVarM.u();
                        ampf ampfVar3 = akzxVarM.b;
                        ampd ampdVarP = akzxVarM2.p();
                        j$.util.Objects.requireNonNull(ampdVarP);
                        alat alatVar = ampfVar3.e;
                        if (!alatVar.c()) {
                            ampfVar3.e = alad.J(alatVar);
                        }
                        ampfVar3.e.add(ampdVarP);
                    }
                    llhVar.e.i(akzxVarM.p());
                }
                llhVar.a();
                break;
            case 6:
                ((defpackage.llh) this.a).a();
                break;
            case 7:
                defpackage.lmk lmkVar = (defpackage.lmk) this.a;
                lmkVar.b();
                lmkVar.c.o(rmx.bv);
                j$.util.Optional optionalA = lmkVar.a();
                if (true == optionalA.isPresent()) {
                    defpackage.lev levVar = (defpackage.lev) optionalA.get();
                    levVar.f.e(false);
                    levVar.w.a(qbc.q);
                    defpackage.ldn ldnVar = levVar.n;
                    akzx akzxVarM3 = defpackage.ljw.a.m();
                    akzx akzxVarM4 = defpackage.lko.a.m();
                    akzxVarM4.u();
                    defpackage.lko lkoVar = (defpackage.lko) akzxVarM4.b;
                    lkoVar.d = 2;
                    lkoVar.b |= 2;
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    akzxVarM4.u();
                    defpackage.lko lkoVar2 = (defpackage.lko) akzxVarM4.b;
                    lkoVar2.b |= 1;
                    lkoVar2.c = jElapsedRealtime;
                    akzxVarM3.u();
                    defpackage.ljw ljwVar = (defpackage.ljw) akzxVarM3.b;
                    defpackage.lko lkoVar3 = (defpackage.lko) akzxVarM4.p();
                    j$.util.Objects.requireNonNull(lkoVar3);
                    ljwVar.c = lkoVar3;
                    ljwVar.b = 4;
                    agsm.i(263, ldnVar.a((defpackage.ljw) akzxVarM3.p()), "failed to log user accept call event to Call Screen session metrics", new java.lang.Object[0]);
                    agsm.i(259, levVar.i.a(), "Failed to accept call", new java.lang.Object[0]);
                }
                break;
            case 8:
                defpackage.lmk lmkVar2 = (defpackage.lmk) this.a;
                lmkVar2.b();
                lmkVar2.c.o(rmx.bw);
                j$.util.Optional optionalA2 = lmkVar2.a();
                if (true == optionalA2.isPresent()) {
                    defpackage.lev levVar2 = (defpackage.lev) optionalA2.get();
                    defpackage.lgi lgiVar = levVar2.f;
                    defpackage.lgq lgqVar = defpackage.lgq.b;
                    lgiVar.e(false);
                    levVar2.w.a(qbc.p);
                    defpackage.ldn ldnVar2 = levVar2.n;
                    akzx akzxVarM5 = defpackage.ljw.a.m();
                    akzx akzxVarM6 = defpackage.lko.a.m();
                    akzxVarM6.u();
                    defpackage.lko lkoVar4 = (defpackage.lko) akzxVarM6.b;
                    lkoVar4.d = 3;
                    lkoVar4.b |= 2;
                    long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                    akzxVarM6.u();
                    defpackage.lko lkoVar5 = (defpackage.lko) akzxVarM6.b;
                    lkoVar5.b |= 1;
                    lkoVar5.c = jElapsedRealtime2;
                    akzxVarM5.u();
                    defpackage.ljw ljwVar2 = (defpackage.ljw) akzxVarM5.b;
                    defpackage.lko lkoVar6 = (defpackage.lko) akzxVarM6.p();
                    j$.util.Objects.requireNonNull(lkoVar6);
                    ljwVar2.c = lkoVar6;
                    ljwVar2.b = 4;
                    agsm.i(264, ldnVar2.a((defpackage.ljw) akzxVarM5.p()), "failed to log user reject call event to Call Screen session metrics", new java.lang.Object[0]);
                    agsm.i(270, levVar2.i.c(lgqVar), "Failed to disconnect call with strategy: %s", new java.lang.Object[]{lgqVar});
                }
                break;
            case 9:
                defpackage.loi.e((defpackage.loi) this.a, view);
                break;
            case 10:
                aimz aimzVar = zih.a;
                aolr aolrVarPlus = zih.b.plus(aols.a);
                defpackage.loi loiVar = (defpackage.loi) this.a;
                aoov.al(loiVar.e, aolrVarPlus, 1, new defpackage.loe((aoln) null, loiVar, 3, (char[]) null));
                break;
            case 11:
                java.lang.Object obj = this.a;
                ((androidx.preference.Preference) obj).j.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(((com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat) obj).c)), null);
                break;
            case 12:
                ((android.widget.CheckBox) this.a).performClick();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.lyi) this.a).e();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((android.app.Activity) this.a).finish();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.lyt lytVar = (defpackage.lyt) this.a;
                ahqx.l((android.content.Context) lytVar.a, ((met) lytVar.c).b());
                break;
            case 16:
                defpackage.mhw.a.b().l("com/android/dialer/defaultdialer/impl/DefaultDialerFragmentPeer", "setDefaultDialer", 78, "DefaultDialerFragmentPeer.java").v("enter");
                defpackage.mhw mhwVar = (defpackage.mhw) this.a;
                mhwVar.c.aQ(fn$.ExternalSyntheticApiModelOutline0.m(fn$.ExternalSyntheticApiModelOutline0.m(mhwVar.b.getSystemService(fn$.ExternalSyntheticApiModelOutline0.m())), "android.app.role.DIALER"), 8);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.mkw mkwVar = (defpackage.mkw) this.a;
                aigf aigfVar = mkwVar.d;
                aigf aigfVar2 = defpackage.mkw.a;
                if (aigfVar.containsKey(aigfVar2.get(java.lang.Integer.valueOf(view.getId())))) {
                    defpackage.mli mliVarY = mkwVar.f.y();
                    akzx akzxVarM7 = defpackage.miw.a.m();
                    defpackage.miu miuVar = (defpackage.miu) mkwVar.d.get(aigfVar2.get(java.lang.Integer.valueOf(view.getId())));
                    akzxVarM7.u();
                    defpackage.miw miwVar = (defpackage.miw) akzxVarM7.b;
                    j$.util.Objects.requireNonNull(miuVar);
                    miwVar.c = miuVar;
                    miwVar.b |= 1;
                    defpackage.miw miwVar2 = (defpackage.miw) akzxVarM7.p();
                    defpackage.mlm mlmVar = mliVarY.h;
                    if (!mlmVar.a().isEmpty()) {
                        akzx akzxVarP = miwVar2.p();
                        boolean z = mliVarY.f;
                        akzxVarP.u();
                        defpackage.miw miwVar3 = (defpackage.miw) akzxVarP.b;
                        miwVar3.b |= 2;
                        miwVar3.d = z;
                        defpackage.mji mjiVar = mliVarY.m;
                        defpackage.mla mlaVar = mliVarY.g;
                        mlaVar.G();
                        defpackage.miw miwVar4 = (defpackage.miw) akzxVarP.p();
                        aigf aigfVarK = mjiVar.i.k();
                        defpackage.miu miuVar2 = miwVar4.c;
                        if (miuVar2 == null) {
                            miuVar2 = defpackage.miu.a;
                        }
                        defpackage.miy miyVarB = defpackage.miy.b(miuVar2.h);
                        if (miyVarB == null) {
                            miyVarB = defpackage.miy.UNKNOWN;
                        }
                        defpackage.mln mlnVar = (defpackage.mln) ((aoin) aigfVarK.get(miyVarB)).a();
                        akzx akzxVarP2 = miwVar4.p();
                        java.lang.String strA = mjiVar.d.a();
                        akzxVarP2.u();
                        defpackage.miw miwVar5 = (defpackage.miw) akzxVarP2.b;
                        j$.util.Objects.requireNonNull(strA);
                        miwVar5.b |= 4;
                        miwVar5.e = strA;
                        mlnVar.b((defpackage.miw) akzxVarP2.p());
                        ahvr.i(new defpackage.mko(), mlaVar);
                    } else if (mliVarY.e.isPresent()) {
                        java.lang.String str2 = (java.lang.String) mliVarY.e.orElseThrow();
                        aooh.f(str2, "lastOutgoingPhoneNumber");
                        if (str2.length() != 0) {
                            mlmVar.c(2);
                            android.widget.EditText editText2 = mlmVar.k;
                            if (editText2 == null) {
                                aooh.j("digits");
                                editText2 = null;
                            }
                            editText2.setText(str2);
                            mlmVar.c(1);
                            android.widget.EditText editText3 = mlmVar.k;
                            if (editText3 == null) {
                                aooh.j("digits");
                                editText3 = null;
                            }
                            android.widget.EditText editText4 = mlmVar.k;
                            if (editText4 == null) {
                                aooh.j("digits");
                            } else {
                                editText = editText4;
                            }
                            editText3.setSelection(editText.getText().length());
                        }
                    } else {
                        agsm.i(361, mliVarY.n.a(26, 150), "fail to play tone prop back", new java.lang.Object[0]);
                    }
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooh.f(view, "p0");
                defpackage.mlm mlmVar2 = (defpackage.mlm) this.a;
                if (!mlmVar2.f()) {
                    android.widget.EditText editText5 = mlmVar2.k;
                    if (editText5 == null) {
                        aooh.j("digits");
                    } else {
                        editText = editText5;
                    }
                    editText.setCursorVisible(true);
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooh.f(view, "p0");
                ((defpackage.mlm) this.a).b(67);
                break;
            default:
                if (view.getId() == 2131427988) {
                    ((defpackage.mlp) this.a).c.a();
                } else {
                    a.bI(defpackage.mlp.a.d(), "unexpected event", "com/android/dialer/dialpadview/ui/PreCallDialpadOverflowMenuRenderer", "onOverflowMenuButtonClick", '<', "PreCallDialpadOverflowMenuRenderer.java", zct.b);
                }
                break;
        }
    }

    public lde(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
