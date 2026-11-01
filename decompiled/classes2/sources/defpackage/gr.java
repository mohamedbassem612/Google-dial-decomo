package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gr implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public gr(androidx.media3.ui.TrackSelectionView trackSelectionView, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(trackSelectionView);
        this.a = trackSelectionView;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r10v50, types: [java.lang.Object, rlv] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws aois {
        android.os.Message message;
        android.os.Message message2;
        android.os.Message message3;
        int i;
        rmx rmxVar;
        boolean z = false;
        android.os.Message messageObtain = null;
        switch (this.$cid) {
            case 0:
                ((defpackage.ey) this.a).f();
                return;
            case 1:
                defpackage.cw cwVar = (defpackage.cw) this.a;
                if (view == cwVar.j && (message3 = cwVar.l) != null) {
                    messageObtain = android.os.Message.obtain(message3);
                } else if (view == cwVar.m && (message2 = cwVar.o) != null) {
                    messageObtain = android.os.Message.obtain(message2);
                } else if (view == cwVar.p && (message = cwVar.r) != null) {
                    messageObtain = android.os.Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                cwVar.I.obtainMessage(1, cwVar.b).sendToTarget();
                return;
            case 2:
                ((android.support.v7.widget.Toolbar) this.a).k();
                return;
            case 3:
                androidx.media3.ui.TrackSelectionView trackSelectionView = (androidx.media3.ui.TrackSelectionView) this.a;
                android.widget.CheckedTextView checkedTextView = trackSelectionView.a;
                if (view == checkedTextView) {
                    trackSelectionView.e = true;
                    trackSelectionView.d.clear();
                } else {
                    if (view != trackSelectionView.b) {
                        trackSelectionView.e = false;
                        java.lang.Object tag = view.getTag();
                        ahvr.ci(tag);
                        throw null;
                    }
                    trackSelectionView.e = false;
                    trackSelectionView.d.clear();
                }
                checkedTextView.setChecked(trackSelectionView.e);
                android.widget.CheckedTextView checkedTextView2 = trackSelectionView.b;
                if (!trackSelectionView.e && trackSelectionView.d.isEmpty()) {
                    z = true;
                }
                checkedTextView2.setChecked(z);
                throw null;
            case 4:
                ((androidx.preference.Preference) this.a).b(view);
                return;
            case 5:
                aooh.f(view, "view");
                defpackage.hvc hvcVarC = ((defpackage.hwn) this.a).c();
                if (hvcVarC != null) {
                    hvcVarC.c(defpackage.hux.MEDICAL);
                    return;
                }
                return;
            case 6:
                aooh.f(view, "view");
                defpackage.hvc hvcVarC2 = ((defpackage.hwn) this.a).c();
                if (hvcVarC2 != null) {
                    hvcVarC2.c(defpackage.hux.FIRE);
                    return;
                }
                return;
            case 7:
                aooh.f(view, "view");
                defpackage.hvc hvcVarC3 = ((defpackage.hwn) this.a).c();
                if (hvcVarC3 != null) {
                    hvcVarC3.c(defpackage.hux.POLICE);
                    return;
                }
                return;
            case 8:
                defpackage.iyi iyiVar = (defpackage.iyi) this.a;
                iyiVar.c(iyiVar.n);
                return;
            case 9:
                final android.widget.PopupMenu popupMenu = new android.widget.PopupMenu(view.getContext(), view);
                final defpackage.jab jabVar = (defpackage.jab) this.a;
                defpackage.ixc ixcVar = jabVar.e;
                int iOrdinal = ixcVar.ordinal();
                if (iOrdinal == 0) {
                    i = 2131755009;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new aois();
                        }
                        java.util.Objects.toString(ixcVar);
                        throw new java.lang.IllegalStateException("setupMenuButton - Unknown greeting type: ".concat(ixcVar.toString()));
                    }
                    i = 2131755010;
                }
                popupMenu.getMenuInflater().inflate(i, popupMenu.getMenu());
                android.view.MenuItem menuItemFindItem = popupMenu.getMenu().findItem(2131427426);
                boolean z2 = !jabVar.d;
                menuItemFindItem.setVisible(z2);
                if (ixcVar == defpackage.ixc.b) {
                    popupMenu.getMenu().findItem(2131427414).setVisible(z2);
                    popupMenu.getMenu().findItem(2131427425).setVisible(true);
                }
                popupMenu.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() { // from class: iyx
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                        aomy aomyVar;
                        popupMenu.dismiss();
                        int itemId = menuItem.getItemId();
                        defpackage.jab jabVar2 = jabVar;
                        if (itemId == 2131427426) {
                            aomyVar = jabVar2.f;
                        } else if (itemId == 2131427425) {
                            aomyVar = jabVar2.g;
                        } else {
                            if (itemId != 2131427414) {
                                return false;
                            }
                            aomyVar = jabVar2.h;
                        }
                        aomyVar.a();
                        return true;
                    }
                });
                popupMenu.show();
                return;
            case 10:
                aooh.f(view, "view");
                ((defpackage.jjd) this.a).b.f();
                return;
            case 11:
                aooh.f(view, "view");
                defpackage.jjd.a.b().l("com/android/dialer/blockreportspam/BlockNumberDialogFragmentPeer", "onPositiveClick", 183, "BlockNumberDialogFragmentPeer.kt").v("block number");
                defpackage.jjd jjdVar = (defpackage.jjd) this.a;
                zoe zoeVar = new zoe(jjdVar.j.c());
                agtk agtkVar = jjdVar.g;
                agtj agtjVar = jjdVar.e;
                agtjVar.i(zoeVar, agtkVar);
                jjdVar.b.A();
                defpackage.jjx jjxVar = jjdVar.f.d;
                if (jjxVar == null) {
                    jjxVar = defpackage.jjx.a;
                }
                aooh.e(jjxVar, "getSpamDialogInfo(...)");
                jjdVar.c.n(rmw.m);
                int iAD = a.aD(jjxVar.g);
                if (iAD != 0 && iAD == 2) {
                    jjdVar.m.bm(rmu.m);
                }
                agtjVar.i(zoe.N(jjdVar.k.j(aify.p(jjxVar.c), jjxVar.e)), jjdVar.h);
                return;
            case 12:
                aooh.f(view, "view");
                defpackage.jjo jjoVar = (defpackage.jjo) this.a;
                jjoVar.c.o(rmx.uE);
                jjoVar.b.f();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooh.f(view, "view");
                defpackage.jjo jjoVar2 = (defpackage.jjo) this.a;
                jjoVar2.u.i((java.lang.String) null).b(mce.dk);
                defpackage.jjf jjfVar = jjoVar2.b;
                android.widget.CheckBox checkBox = (android.widget.CheckBox) jjfVar.c().findViewById(2131428994);
                android.widget.CheckBox checkBox2 = (android.widget.CheckBox) jjfVar.c().findViewById(2131428862);
                z = checkBox.isChecked() || checkBox2.isChecked();
                if (z) {
                    jjoVar2.e.i(new zoe(jjoVar2.q.c()), jjoVar2.k);
                }
                if (!checkBox2.isChecked()) {
                    jjfVar.A();
                    defpackage.jjx jjxVar2 = jjoVar2.f.d;
                    if (jjxVar2 == null) {
                        jjxVar2 = defpackage.jjx.a;
                    }
                    aooh.e(jjxVar2, "getSpamDialogInfo(...)");
                    jjoVar2.b(jjxVar2);
                }
                if (z) {
                    defpackage.jjo.a.b().l("com/android/dialer/blockreportspam/BlockOptionallyReportDialogFragmentPeer", "onPositiveClick", 358, "BlockOptionallyReportDialogFragmentPeer.kt").v("report spam");
                    defpackage.jmf.a(jjfVar.A());
                }
                if (!checkBox2.isChecked()) {
                    jjoVar2.a(defpackage.jjo.c(z));
                }
                boolean zIsChecked = checkBox.isChecked();
                boolean zIsChecked2 = checkBox2.isChecked();
                if (zIsChecked && zIsChecked2) {
                    rmxVar = rmx.uF;
                } else if (zIsChecked2) {
                    rmxVar = rmx.uH;
                } else {
                    rmxVar = zIsChecked ? rmx.uG : rmx.uI;
                }
                jjoVar2.c.o(rmxVar);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooh.f(view, "view");
                ((defpackage.jke) this.a).b.f();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooh.f(view, "view");
                defpackage.jke jkeVar = (defpackage.jke) this.a;
                jkeVar.p.i((java.lang.String) null).b(mce.dk);
                defpackage.jjy jjyVar = jkeVar.b;
                android.widget.CheckBox checkBox3 = (android.widget.CheckBox) jjyVar.c().findViewById(2131428783);
                if (checkBox3.isChecked()) {
                    jkeVar.c.o(rmx.ux);
                    jkeVar.e.i(new zoe(jkeVar.m.c()), jkeVar.h);
                } else {
                    defpackage.jjx jjxVar3 = jkeVar.f.d;
                    if (jjxVar3 == null) {
                        jjxVar3 = defpackage.jjx.a;
                    }
                    if (jjxVar3.q) {
                        jkeVar.e.i(new zoe(jkeVar.m.c()), jkeVar.h);
                    } else {
                        jkeVar.c.o(rmx.uy);
                    }
                }
                if (!checkBox3.isChecked()) {
                    jjyVar.A();
                    defpackage.jjx jjxVar4 = jkeVar.f.d;
                    if (jjxVar4 == null) {
                        jjxVar4 = defpackage.jjx.a;
                    }
                    aooh.e(jjxVar4, "getSpamDialogInfo(...)");
                    jkeVar.b(jjxVar4);
                }
                if (checkBox3.isChecked()) {
                    defpackage.jke.a.b().l("com/android/dialer/blockreportspam/BlockingNumberAndOptionallyReportingAsSpamFragmentPeer", "onPositiveClick", 306, "BlockingNumberAndOptionallyReportingAsSpamFragmentPeer.kt").v("report spam");
                    defpackage.jmf.a(jjyVar.A());
                    return;
                }
                return;
            case 16:
                aooh.f(view, "view");
                defpackage.jkq jkqVar = (defpackage.jkq) this.a;
                jkqVar.c.o(rmx.vr);
                ((defpackage.jkp) jkqVar.a).f();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooh.f(view, "view");
                defpackage.jkq jkqVar2 = (defpackage.jkq) this.a;
                jkqVar2.c.o(rmx.vs);
                defpackage.ni niVarF = defpackage.jlr.F(defpackage.jlw.a.m());
                defpackage.jjx jjxVar5 = ((defpackage.jmk) jkqVar2.d).d;
                if (jjxVar5 == null) {
                    jjxVar5 = defpackage.jjx.a;
                }
                aooh.e(jjxVar5, "getSpamDialogInfo(...)");
                niVarF.P(jjxVar5);
                niVarF.O(2132019486);
                niVarF.N(defpackage.jmu.SCAM_SELECTOR_QUESTION_KEY_NOT_SCAM);
                defpackage.jlf jlfVarAX = defpackage.jlf.aX(niVarF.M());
                defpackage.jkp jkpVar = (defpackage.jkp) jkqVar2.a;
                jlfVarAX.r(jkpVar.J(), "ScamContextSelectorDialogFragment");
                jkpVar.f();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooh.f(view, "view");
                ((defpackage.jkv) this.a).b.f();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooh.f(view, "view");
                defpackage.jkv.a.b().l("com/android/dialer/blockreportspam/NotSpamDialogFragmentPeer", "onPositiveClick", 160, "NotSpamDialogFragmentPeer.kt").v("confirmed");
                defpackage.jkv jkvVar = (defpackage.jkv) this.a;
                jkvVar.e.i(new zoe(jkvVar.k.c()), jkvVar.i);
                return;
            default:
                aooh.f(view, "view");
                ((defpackage.jld) this.a).b.f();
                return;
        }
    }

    public /* synthetic */ gr(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }

    public gr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
