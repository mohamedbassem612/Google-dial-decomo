package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qhd implements odm {
    final /* synthetic */ defpackage.qhj a;

    public qhd(defpackage.qhj qhjVar) {
        j$.util.Objects.requireNonNull(qhjVar);
        this.a = qhjVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        defpackage.qbf qbfVar = new defpackage.qbf(this, 11);
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            ((defpackage.qhd) qbfVar.a).c((defpackage.qfz) obj2);
        }
        this.a.v = optional;
    }

    public final void b(java.lang.Throwable th) {
        a.bq(defpackage.qhj.a.c(), "Error with RttChatServiceModel subscription callback", "com/android/dialer/incall/rtt/ui/RttChatFragmentPeer$2", "onDataLoadError", (char) 266, "RttChatFragmentPeer.java", th, zct.b);
        this.a.M.i((java.lang.String) null).a(mcd.i);
    }

    public final /* synthetic */ void c(defpackage.qfz qfzVar) {
        int i;
        defpackage.qhj qhjVar = this.a;
        qhjVar.b.x(qfzVar.d);
        j$.util.Optional optionalX = qhjVar.N.X(qfzVar);
        defpackage.qbf qbfVar = new defpackage.qbf(qfzVar, 10);
        if (true == optionalX.isPresent()) {
            defpackage.qfj qfjVar = (defpackage.qfj) optionalX.get();
            alat alatVar = ((defpackage.qfz) qbfVar.a).d;
            if (!qfjVar.l && j$.util.Collection.-EL.stream(alatVar).anyMatch(new mif(11))) {
                qfjVar.l = true;
                qfjVar.p.a(qbc.dS);
            }
            qfjVar.c();
        }
        if (!qhjVar.x) {
            defpackage.qhm qhmVarE = qhjVar.e();
            if ((qfzVar.b & 524288) != 0 && (i = qfzVar.u) != -1 && ((qhmVarE.b & 8) == 0 || qhmVarE.f != i)) {
                ((aw) qhjVar.l).Q.findViewById(2131428847).ac(qfzVar.u);
                defpackage.agrv agrvVar = qhjVar.F;
                defpackage.akzn akznVar = defpackage.akzn.a;
                akzx akzxVarP = qhmVarE.p();
                int i2 = qfzVar.u;
                akzxVarP.u();
                defpackage.qhm qhmVar = (defpackage.qhm) akzxVarP.b;
                qhmVar.b |= 8;
                qhmVar.f = i2;
                agrvVar.b(akznVar, (defpackage.qhm) akzxVarP.p());
            }
        }
        if (qhjVar.c().getText().toString().isEmpty() && qhjVar.v.isPresent()) {
            j$.util.Optional optionalH = defpackage.qhj.h(qfzVar);
            j$.util.Optional optionalH2 = defpackage.qhj.h((defpackage.qfz) qhjVar.v.orElseThrow());
            if (optionalH.isPresent() && optionalH2.isPresent() && ((defpackage.qgp) optionalH2.orElseThrow()).d && !((defpackage.qgp) optionalH.orElseThrow()).d) {
                qhjVar.k(((defpackage.qgp) optionalH.orElseThrow()).c);
            }
        }
        if ((qfzVar.b & 16) != 0 && !android.text.TextUtils.equals(qhjVar.E, qfzVar.f)) {
            android.widget.TextView textView = (android.widget.TextView) ((aw) qhjVar.l).Q.findViewById(2131428843);
            textView.setText(qfzVar.f);
            textView.setSelected(true);
            qhjVar.E = qfzVar.f;
        }
        int i3 = 0;
        if (qfzVar.g && (qfzVar.b & 16) != 0) {
            qhjVar.d().setText(qhjVar.l.Z(2132019988, new java.lang.Object[]{qfzVar.f}));
            qhjVar.d().setVisibility(0);
        }
        defpackage.qhm qhmVarE2 = qhjVar.e();
        if ((qfzVar.b & 16) != 0 && qfzVar.w && (qhmVarE2.b & 1) == 0) {
            java.lang.String str = qfzVar.f;
            defpackage.qem qemVar = new defpackage.qem();
            amxr.g(qemVar);
            ahgl.c(qemVar, str);
            qemVar.r(qhjVar.l.I(), "TidePodsRttInfoDialog");
            defpackage.agrv agrvVar2 = qhjVar.F;
            defpackage.akzn akznVar2 = defpackage.akzn.a;
            akzx akzxVarP2 = qhmVarE2.p();
            akzxVarP2.u();
            defpackage.qhm qhmVar2 = (defpackage.qhm) akzxVarP2.b;
            qhmVar2.b |= 1;
            qhmVar2.c = true;
            agrvVar2.b(akznVar2, (defpackage.qhm) akzxVarP2.p());
            defpackage.qen qenVar = qhjVar.J;
            agsm.i(594, ((aogc) qenVar.b).bl(new lbn(7)), "Failed to set RTT info dialog state.", new java.lang.Object[0]);
            ((defpackage.qek) qenVar.a).a.set(false);
            ((zpz) qenVar.c).a(ajcm.a);
        }
        if (qfzVar.h) {
            qhjVar.b().setBase((qfzVar.k - j$.time.Instant.now().toEpochMilli()) + android.os.SystemClock.elapsedRealtime());
        }
        if (qhjVar.v.isPresent() ? !(((defpackage.qfz) qhjVar.v.orElseThrow()).h || !qfzVar.h) : qfzVar.h) {
            if (!qhjVar.z) {
                qhjVar.d().setVisibility(8);
                qhjVar.c().setVisibility(0);
                qhjVar.a().setVisibility(0);
                qhjVar.c().setFocusableInTouchMode(true);
                if (qhjVar.c().requestFocus()) {
                    qhjVar.h.showSoftInput(qhjVar.c(), 0);
                }
                qhjVar.b().start();
                qhjVar.M.i(qfzVar.c).b(mce.aI);
                qhjVar.z = true;
            }
        }
        aw awVar = qhjVar.l;
        com.google.android.flexbox.FlexboxLayout flexboxLayout = (com.google.android.flexbox.FlexboxLayout) awVar.Q.findViewById(2131428395);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        j$.lang.Iterable.-EL.forEach(qhjVar.e, new rh(qhjVar, arrayList, 13));
        defpackage.qhm qhmVarE3 = qhjVar.e();
        int i4 = 2;
        byte[] bArr = null;
        if (qfzVar.e) {
            if (!qhmVarE3.d) {
                if (!arrayList.isEmpty()) {
                    flexboxLayout.removeAllViews();
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ahoz ahozVar = (ahoz) arrayList.get(i5);
                        qhjVar.f.a(awVar, flexboxLayout, ahozVar, new defpackage.qgq(qhjVar, ahozVar, i4, bArr));
                    }
                    flexboxLayout.setVisibility(0);
                }
                defpackage.agrv agrvVar3 = qhjVar.F;
                defpackage.akzn akznVar3 = defpackage.akzn.a;
                akzx akzxVarP3 = qhmVarE3.p();
                akzxVarP3.u();
                defpackage.qhm qhmVar3 = (defpackage.qhm) akzxVarP3.b;
                qhmVar3.b |= 2;
                qhmVar3.d = true;
                agrvVar3.b(akznVar3, (defpackage.qhm) akzxVarP3.p());
                qhjVar.m.c(true);
            }
        } else if (qhmVarE3.d) {
            defpackage.agrv agrvVar4 = qhjVar.F;
            defpackage.akzn akznVar4 = defpackage.akzn.a;
            akzx akzxVarP4 = qhmVarE3.p();
            akzxVarP4.u();
            defpackage.qhm qhmVar4 = (defpackage.qhm) akzxVarP4.b;
            qhmVar4.b |= 2;
            qhmVar4.d = false;
            agrvVar4.b(akznVar4, (defpackage.qhm) akzxVarP4.p());
            flexboxLayout.setVisibility(8);
            qhjVar.m.c(false);
        }
        defpackage.qhv qhvVar = qhjVar.m;
        boolean z = qfzVar.l;
        qhvVar.l = z;
        qhvVar.g.setVisibility(true != z ? 8 : 0);
        qhjVar.m.i.setVisibility(true != qfzVar.m ? 8 : 0);
        if (qfzVar.p) {
            defpackage.qhv qhvVar2 = qhjVar.m;
            com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton = qhvVar2.h;
            rttCheckableButton.setOnClickListener(new defpackage.qht(qhvVar2, i3));
            rttCheckableButton.setVisibility(0);
        }
        qhjVar.m.a(qfzVar.n);
        defpackage.qhv qhvVar3 = qhjVar.m;
        boolean z2 = qfzVar.o;
        qhvVar3.k = z2;
        qhvVar3.f.setVisibility(true != z2 ? 8 : 0);
        defpackage.qhv qhvVar4 = qhjVar.m;
        qhvVar4.c.c(qfzVar.q);
        qhvVar4.n.i((java.lang.String) null).b(mce.bb);
        defpackage.qhv qhvVar5 = qhjVar.m;
        defpackage.qgo qgoVar = qfzVar.r;
        if (qgoVar == null) {
            qgoVar = defpackage.qgo.a;
        }
        if ((qgoVar.b & 8) != 0) {
            qhvVar5.d.setText(qgoVar.f);
        } else {
            qhvVar5.d.setText(qgoVar.e);
        }
        if (android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1) {
            qhvVar5.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, qgoVar.d, 0);
        } else {
            qhvVar5.d.setCompoundDrawablesWithIntrinsicBounds(qgoVar.d, 0, 0, 0);
        }
        if (qgoVar.c) {
            if (qhvVar5.j) {
                com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton2 = qhvVar5.d;
                rttCheckableButton2.setContentDescription(rttCheckableButton2.getText());
            }
            com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton3 = qhvVar5.d;
            rttCheckableButton3.setOnClickListener(new defpackage.qht(qhvVar5, i4));
            rttCheckableButton3.b = null;
        } else {
            com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton4 = qhvVar5.d;
            rttCheckableButton4.c(qgoVar.g);
            if (qhvVar5.j) {
                rttCheckableButton4.d();
            }
            rttCheckableButton4.setOnClickListener(null);
            rttCheckableButton4.b = qhvVar5;
        }
        qhvVar5.n.i((java.lang.String) null).b(mce.aY);
        defpackage.qgs qgsVar = qhjVar.n;
        if (qgsVar != null) {
            defpackage.zmw zmwVarA = defpackage.zmw.a(qfzVar.s);
            qgsVar.c.c(zmwVarA == defpackage.zmw.ROUTE_BLUETOOTH);
            qgsVar.d.c(zmwVarA == defpackage.zmw.ROUTE_SPEAKER);
            qgsVar.e.c(zmwVarA == defpackage.zmw.ROUTE_WIRED_HEADSET);
            qgsVar.f.c(zmwVarA == defpackage.zmw.ROUTE_EARPIECE);
            defpackage.qgs qgsVar2 = qhjVar.n;
            defpackage.qgo qgoVar2 = qfzVar.r;
            if (qgoVar2 == null) {
                qgoVar2 = defpackage.qgo.a;
            }
            qgsVar2.a(qgoVar2);
        }
        if (qfzVar.i || qfzVar.j) {
            qhjVar.c().setEnabled(false);
            qhjVar.d().setText(awVar.Y(true != qfzVar.i ? 2132019981 : 2132019979));
            qhjVar.d().setVisibility(0);
            qhjVar.m.b(qfzVar.i);
        } else if (qhjVar.v.isPresent() && !qfzVar.i && !qfzVar.j && ((((defpackage.qfz) qhjVar.v.orElseThrow()).i && !qfzVar.i) || (((defpackage.qfz) qhjVar.v.orElseThrow()).j && !qfzVar.j))) {
            if (!qhjVar.c().isEnabled()) {
                qhjVar.c().setEnabled(true);
                if (qhjVar.c().requestFocus()) {
                    qhjVar.h.showSoftInput(qhjVar.c(), 0);
                }
            }
            qhjVar.d().setVisibility(8);
            qhjVar.m.b(false);
        }
        if (qhjVar.w.isPresent()) {
            if (qfzVar.v) {
                ((defpackage.wde) qhjVar.w.orElseThrow()).a();
            } else {
                ((defpackage.wde) qhjVar.w.orElseThrow()).c();
            }
        }
        android.view.View viewN = awVar.N();
        defpackage.qhj.l(viewN.findViewById(2131428821), false);
        defpackage.qhj.l(viewN.findViewById(2131428825), false);
        boolean z3 = qfzVar.t;
        defpackage.qhm qhmVarE4 = qhjVar.e();
        if (qhmVarE4.e || z3) {
            android.view.View viewN2 = awVar.N();
            defpackage.qhj.l(viewN2.findViewById(2131428821), true);
            defpackage.qhj.l(viewN2.findViewById(2131428825), true);
            qhjVar.h.hideSoftInputFromWindow(qhjVar.c().getWindowToken(), 0);
        }
        if (qhmVarE4.e != z3) {
            if (z3) {
                qhjVar.h.hideSoftInputFromWindow(qhjVar.c().getWindowToken(), 0);
                awVar.Q.requestFocus();
                u uVar = new u(awVar.I());
                j$.util.Optional optionalG = qhjVar.g();
                if (optionalG.isPresent()) {
                    uVar.m((aw) optionalG.orElseThrow());
                } else {
                    akzx akzxVarM = defpackage.pyk.a.m();
                    akzxVarM.u();
                    defpackage.pyk pykVar = (defpackage.pyk) akzxVarM.b;
                    pykVar.b |= 1;
                    pykVar.c = 0;
                    akzxVarM.u();
                    defpackage.pyk pykVar2 = (defpackage.pyk) akzxVarM.b;
                    pykVar2.b |= 16;
                    pykVar2.g = true;
                    defpackage.pyk pykVar3 = (defpackage.pyk) akzxVarM.p();
                    aimz aimzVar = defpackage.pyu.a;
                    optionalG = j$.util.Optional.of(defpackage.pyn.q(pykVar3));
                    uVar.e(2131428382, (aw) optionalG.orElseThrow(), "tag_tidepods_dialpad_fragment", 1);
                }
                uVar.c();
                ((aw) ((defpackage.pyn) optionalG.orElseThrow())).Q.startAnimation(qhjVar.B);
                awVar.Q.findViewById(2131427997).a();
                qhjVar.G.f(true);
                defpackage.agrv agrvVar5 = qhjVar.F;
                defpackage.akzn akznVar5 = defpackage.akzn.a;
                akzx akzxVarP5 = qhmVarE4.p();
                akzxVarP5.u();
                defpackage.qhm qhmVar5 = (defpackage.qhm) akzxVarP5.b;
                qhmVar5.b |= 4;
                qhmVar5.e = true;
                agrvVar5.b(akznVar5, (defpackage.qhm) akzxVarP5.p());
            } else {
                j$.util.Optional optionalG2 = qhjVar.g();
                if (optionalG2.isPresent() && ((defpackage.pyn) optionalG2.orElseThrow()).aK()) {
                    ((aw) ((defpackage.pyn) optionalG2.orElseThrow())).Q.startAnimation(qhjVar.C);
                    ((aw) ((defpackage.pyn) optionalG2.orElseThrow())).Q.animate().setListener(hrz.a(qhjVar.o, new defpackage.oxr(qhjVar, 11))).start();
                    qhjVar.c().requestFocus();
                    qhjVar.G.f(false);
                }
                if (!qhjVar.o.a().equals(emq.e)) {
                    qhjVar.j();
                }
                defpackage.agrv agrvVar6 = qhjVar.F;
                defpackage.akzn akznVar6 = defpackage.akzn.a;
                akzx akzxVarP6 = qhmVarE4.p();
                akzxVarP6.u();
                defpackage.qhm qhmVar6 = (defpackage.qhm) akzxVarP6.b;
                qhmVar6.b |= 4;
                qhmVar6.e = false;
                agrvVar6.b(akznVar6, (defpackage.qhm) akzxVarP6.p());
            }
        }
        if (qhjVar.v.isPresent()) {
            j$.util.Optional optionalOf = qhjVar.v;
            if (true == optionalOf.isPresent()) {
                defpackage.qfz qfzVar2 = (defpackage.qfz) optionalOf.get();
                optionalOf = (qfzVar2.b & 1) != 0 ? j$.util.Optional.of(qfzVar2.c) : j$.util.Optional.empty();
                optionalOf.getClass();
            }
            defpackage.qgz qgzVar = new defpackage.qgz(qhjVar, qfzVar, i4, bArr);
            if (true == optionalOf.isPresent()) {
                java.lang.Object obj = optionalOf.get();
                java.lang.Object obj2 = qgzVar.a;
                defpackage.qfz qfzVar3 = (defpackage.qfz) qgzVar.b;
                if (!j$.util.Objects.equals(obj, qfzVar3.c)) {
                    aimz aimzVar2 = defpackage.qhj.a;
                    aimzVar2.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "clearEditTextOnCallSwap", 316, "RttChatFragmentPeer.java").v("Clearing RTT editText due to new call.");
                    defpackage.qhj qhjVar2 = (defpackage.qhj) obj2;
                    qhjVar2.i();
                    if ((qfzVar3.b & 16777216) != 0) {
                        aimzVar2.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "clearEditTextOnCallSwap", 320, "RttChatFragmentPeer.java").v("Restoring RTT editText from unfinished message.");
                        defpackage.qgp qgpVar = qfzVar3.z;
                        if (qgpVar == null) {
                            qgpVar = defpackage.qgp.a;
                        }
                        qhjVar2.k(qgpVar.c);
                    }
                }
            }
        }
        qhjVar.A = qfzVar.x;
    }
}
