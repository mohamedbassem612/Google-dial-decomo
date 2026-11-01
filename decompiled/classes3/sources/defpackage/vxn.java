package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class vxn implements agye {
    final /* synthetic */ defpackage.vxq a;

    public vxn(defpackage.vxq vxqVar) {
        j$.util.Objects.requireNonNull(vxqVar);
        this.a = vxqVar;
    }

    public final void a(java.lang.Throwable th) {
        defpackage.vxq vxqVar = this.a;
        if (((java.lang.Boolean) vxqVar.R.a()).booleanValue()) {
            a.by(defpackage.vxq.a.c(), "cannot get VisualVoicemailFragmentModel", "com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$8", "onError", (char) 733, "VisualVoicemailFragmentPeer.java", th);
        } else {
            a.bq(defpackage.vxq.a.c(), "cannot get VisualVoicemailFragmentModel", "com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$8", "onError", (char) 739, "VisualVoicemailFragmentPeer.java", th, zct.b);
        }
        ahbv.D(vxqVar.d);
    }

    public final /* synthetic */ void b(java.lang.Object obj) throws java.lang.Throwable {
        ahoq ahoqVar;
        java.lang.Throwable th;
        j$.util.Optional optionalOf;
        j$.util.Optional optionalEmpty;
        j$.util.Optional optionalEmpty2;
        int i;
        char c;
        java.lang.String string;
        android.text.SpannableString spannableString;
        java.lang.String string2;
        java.lang.String string3;
        char c2;
        java.lang.String string4;
        defpackage.vts vtsVar = (defpackage.vts) obj;
        ahoq ahoqVarW = ahvr.W(1018, "VisualVoicemailFragmentPeer_onNewData");
        try {
            defpackage.vxq vxqVar = this.a;
            aimz aimzVar = defpackage.vxq.a;
            aimzVar.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "updateUi", 747, "VisualVoicemailFragmentPeer.java").v("enter");
            if ((vtsVar.b & 2) != 0) {
                try {
                    defpackage.vtx vtxVar = vtsVar.f;
                    if (vtxVar == null) {
                        vtxVar = defpackage.vtx.a;
                    }
                    optionalOf = j$.util.Optional.of(vtxVar);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ahoqVar = ahoqVarW;
                    try {
                        ahoqVar.close();
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                        throw th;
                    }
                }
            } else {
                optionalOf = j$.util.Optional.empty();
            }
            vxqVar.F = optionalOf;
            vxqVar.D = aike.a;
            defpackage.vtt vttVar = vtsVar.d;
            if (vttVar == null) {
                vttVar = defpackage.vtt.a;
            }
            j$.util.Optional optional = vxqVar.B;
            defpackage.qgz qgzVar = new defpackage.qgz(vxqVar, vttVar, 20, null);
            if (true == optional.isPresent()) {
                java.lang.Object obj2 = optional.get();
                java.lang.Object obj3 = qgzVar.a;
                if (!((alad) qgzVar.b).equals(obj2)) {
                    j$.util.Optional optional2 = ((defpackage.vxq) obj3).J;
                    if (true == optional2.isPresent()) {
                        ((android.view.ActionMode) optional2.get()).finish();
                    }
                }
            }
            vxqVar.B = j$.util.Optional.of(vttVar);
            defpackage.vyg vygVar = vxqVar.e;
            boolean z = vygVar.c;
            int size = vtsVar.c.size();
            vxqVar.S = android.text.TextUtils.equals(vttVar.c, "com.google.android.apps.tycho");
            android.view.View viewB = vxqVar.b();
            if (z || size < 2) {
                viewB.setVisibility(8);
            } else {
                viewB.setVisibility(0);
            }
            int size2 = vtsVar.e.size();
            defpackage.vwz vwzVar = vxqVar.d;
            android.view.View viewFindViewById = ((aw) vwzVar).Q.findViewById(2131428945);
            android.widget.TextView textView = (android.widget.TextView) viewFindViewById.findViewById(2131427479);
            android.content.Context context = vxqVar.b;
            ahoqVar = ahoqVarW;
            try {
                textView.setText(context.getString(2132020015, java.lang.Integer.toString(size2)));
                if (vygVar.c) {
                    viewFindViewById.setVisibility(8);
                } else if (vxqVar.z() || size2 > 0) {
                    viewFindViewById.setVisibility(0);
                }
                if (z) {
                    vxqVar.D = aify.n(vtsVar.e);
                } else {
                    if (size > 0) {
                        defpackage.vtt vttVar2 = vtsVar.d;
                        if (vttVar2 == null) {
                            vttVar2 = defpackage.vtt.a;
                        }
                        aify aifyVarN = aify.n(vtsVar.c);
                        aify aifyVar = (aify) j$.util.Collection.-EL.stream(aifyVarN).map(new defpackage.vun(4)).collect(aido.a);
                        akzx akzxVarM = defpackage.vwq.a.m();
                        akzxVarM.u();
                        defpackage.vwq vwqVar = (defpackage.vwq) akzxVarM.b;
                        j$.util.Objects.requireNonNull(vttVar2);
                        vwqVar.c = vttVar2;
                        vwqVar.b |= 1;
                        akzxVarM.u();
                        defpackage.vwq vwqVar2 = (defpackage.vwq) akzxVarM.b;
                        alat alatVar = vwqVar2.d;
                        if (!alatVar.c()) {
                            vwqVar2.d = alad.J(alatVar);
                        }
                        akyl.i(aifyVarN, vwqVar2.d);
                        defpackage.vwq vwqVar3 = (defpackage.vwq) akzxVarM.p();
                        boolean zAP = ahvr.aP(aifyVar, vxqVar.C);
                        defpackage.vww vwwVar = (defpackage.vww) vwzVar.N().findViewById(2131428954);
                        if (!zAP || vwwVar == null) {
                            defpackage.vww vwwVar2 = new defpackage.vww(vxqVar.c);
                            vwwVar2.y().a(vwqVar3);
                            vwwVar2.setId(2131428954);
                            android.view.View viewB2 = vxqVar.b();
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewB2;
                            frameLayout.removeView(viewB2.findViewById(2131428954));
                            frameLayout.addView(vwwVar2);
                        } else {
                            vwwVar.y().a(vwqVar3);
                        }
                        vxqVar.C = aifyVar;
                        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(aifyVarN).filter(new vpl(vttVar2, 9)).findFirst();
                        if (optionalFindFirst.isEmpty()) {
                            aimzVar.d().m(aioa.b).l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "updateUi", 803, "VisualVoicemailFragmentPeer.java").v("no model corresponding to phone account");
                        } else {
                            defpackage.vtu vtuVar = (defpackage.vtu) optionalFindFirst.orElseThrow();
                            if ((vtsVar.b & 2) != 0) {
                                defpackage.vtx vtxVar2 = vtsVar.f;
                                if (vtxVar2 == null) {
                                    vtxVar2 = defpackage.vtx.a;
                                }
                                optionalEmpty = j$.util.Optional.of(vtxVar2);
                            } else {
                                optionalEmpty = j$.util.Optional.empty();
                            }
                            if ((vtuVar.b & 8) != 0) {
                                vvl vvlVar = vxqVar.W;
                                defpackage.vuc vucVar = vtuVar.g;
                                if (vucVar == null) {
                                    vucVar = defpackage.vuc.a;
                                }
                                vzi vziVar = vucVar.f;
                                if (vziVar == null) {
                                    vziVar = vzi.a;
                                }
                                if (!vvl.n(vziVar)) {
                                    optionalEmpty2 = j$.util.Optional.empty();
                                } else if (vucVar.c) {
                                    boolean z2 = vucVar.d;
                                    defpackage.vua vuaVar = new defpackage.vua();
                                    vuaVar.f(vvl.o(vziVar) ? vvlVar.b.getString(2132020716) : vvlVar.b.getString(2132018314));
                                    if (vvl.o(vziVar)) {
                                        android.content.Context context2 = vvlVar.b;
                                        java.lang.String string5 = context2.getString(2132020715);
                                        if (vvl.p()) {
                                            string4 = context2.getString(2132020705, string5);
                                            c2 = 0;
                                        } else {
                                            c2 = 0;
                                            string4 = context2.getString(2132020704, string5);
                                        }
                                        java.lang.Object[] objArr = new java.lang.Object[2];
                                        objArr[c2] = context2.getString(2132018309);
                                        objArr[1] = string4;
                                        spannableString = new android.text.SpannableString(context2.getString(2132020714, objArr));
                                        int length = spannableString.length() - string4.length();
                                        spannableString.setSpan(new android.text.style.TextAppearanceSpan(context2, 2132085224), length, string4.length() + length, 33);
                                        java.lang.String string6 = context2.getString(2132020715);
                                        vvlVar.q(spannableString, string6, string6);
                                    } else {
                                        android.content.Context context3 = vvlVar.b;
                                        java.lang.String string7 = context3.getString(2132018313, context3.getString(true != z2 ? 2132018310 : 2132018300, context3.getString(2132018311)));
                                        spannableString = new android.text.SpannableString(string7);
                                        spannableString.setSpan(new android.text.style.AlignmentSpan.Standard(android.text.Layout.Alignment.ALIGN_CENTER), 0, string7.length(), 33);
                                        vvlVar.q(spannableString, context3.getString(2132018311), vvlVar.j());
                                    }
                                    vuaVar.d = spannableString;
                                    vuaVar.b();
                                    vuaVar.d(vvlVar.a(vziVar));
                                    vuaVar.e(vziVar.d);
                                    vuaVar.c(vziVar.h != -100);
                                    defpackage.vty vtyVarA = defpackage.vtz.a();
                                    vtyVarA.a = 2;
                                    if (vvl.o(vziVar)) {
                                        string2 = vvl.p() ? vvlVar.b.getString(2132020713) : vvlVar.b.getString(2132020710);
                                    } else {
                                        string2 = vvlVar.b.getString(2132018302);
                                    }
                                    vtyVarA.c(string2);
                                    vuaVar.e = vtyVarA.a();
                                    defpackage.vty vtyVarA2 = defpackage.vtz.a();
                                    vtyVarA2.a = 1;
                                    if (vvl.o(vziVar)) {
                                        string3 = vvl.p() ? vvlVar.b.getString(2132020707) : vvlVar.b.getString(2132020706);
                                    } else {
                                        string3 = vvlVar.b.getString(2132018301);
                                    }
                                    vtyVarA2.c(string3);
                                    vtyVarA2.b(true);
                                    vuaVar.f = vtyVarA2.a();
                                    optionalEmpty2 = j$.util.Optional.of(vuaVar.a());
                                } else if (vucVar.e) {
                                    boolean z3 = vucVar.d;
                                    defpackage.vua vuaVar2 = new defpackage.vua();
                                    vuaVar2.f(vvl.o(vziVar) ? vvlVar.b.getString(2132020716) : vvlVar.b.getString(2132018308));
                                    android.content.Context context4 = vvlVar.b;
                                    if (z3) {
                                        i = 1;
                                        c = 0;
                                        string = context4.getString(2132018305, context4.getString(2132018311));
                                    } else {
                                        string = "";
                                        i = 1;
                                        c = 0;
                                    }
                                    java.lang.Object[] objArr2 = new java.lang.Object[i];
                                    objArr2[c] = string;
                                    java.lang.String string8 = context4.getString(2132018313, objArr2);
                                    android.text.SpannableString spannableString2 = new android.text.SpannableString(string8);
                                    spannableString2.setSpan(new android.text.style.AlignmentSpan.Standard(android.text.Layout.Alignment.ALIGN_CENTER), 0, string8.length(), 33);
                                    vvlVar.q(spannableString2, context4.getString(2132018311), vvlVar.j());
                                    vuaVar2.d = spannableString2;
                                    vuaVar2.b();
                                    vuaVar2.d(vvlVar.a(vziVar));
                                    vuaVar2.e(vziVar.d);
                                    vuaVar2.c(vziVar.h != -100);
                                    defpackage.vty vtyVarA3 = defpackage.vtz.a();
                                    vtyVarA3.a = 4;
                                    vtyVarA3.c(context4.getString(2132018307));
                                    vuaVar2.e = vtyVarA3.a();
                                    defpackage.vty vtyVarA4 = defpackage.vtz.a();
                                    vtyVarA4.a = 3;
                                    vtyVarA4.c(context4.getString(2132018306));
                                    vtyVarA4.b(true);
                                    vuaVar2.f = vtyVarA4.a();
                                    optionalEmpty2 = j$.util.Optional.of(vuaVar2.a());
                                } else {
                                    optionalEmpty2 = j$.util.Optional.empty();
                                }
                            } else {
                                optionalEmpty2 = j$.util.Optional.empty();
                            }
                            vxqVar.E = optionalEmpty2;
                            vxqVar.u(vxqVar.E);
                            if (optionalEmpty.isPresent()) {
                                vxqVar.F = optionalEmpty;
                            } else if ((vtuVar.b & 4) != 0) {
                                defpackage.vtx vtxVar3 = vtuVar.f;
                                if (vtxVar3 == null) {
                                    vtxVar3 = defpackage.vtx.a;
                                }
                                vxqVar.F = j$.util.Optional.of(vtxVar3);
                            }
                            vxqVar.D = aify.n(vtuVar.e);
                        }
                        ahoqVar.close();
                        ahbv.D(this.a.d);
                    }
                    aimzVar.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "updateUi", 813, "VisualVoicemailFragmentPeer.java").v("No active voicemail accounts.");
                    vxqVar.u(j$.util.Optional.empty());
                    vxqVar.p(((aw) vwzVar).Q, vtsVar.e.size() > 0 || vxqVar.z());
                }
                if (((java.lang.Boolean) vxqVar.Q.a()).booleanValue()) {
                    nwv nwvVarB = nwv.b(vtsVar.g);
                    if (nwvVarB == null) {
                        nwvVarB = nwv.f;
                    }
                    vxqVar.D = (aify) j$.util.Collection.-EL.stream(vxqVar.D).map(new defpackage.vxb(nwvVarB, 0)).collect(aido.a);
                }
                aify aifyVar2 = vxqVar.D;
                com.android.dialer.widget.emptycontentview.EmptyContentView emptyContentView = (com.android.dialer.widget.emptycontentview.EmptyContentView) vwzVar.N().findViewById(2131428110);
                if (!vxqVar.F.isPresent()) {
                    android.support.v7.widget.RecyclerView recyclerViewFindViewById = vwzVar.N().findViewById(2131428773);
                    if (aifyVar2.isEmpty()) {
                        recyclerViewFindViewById.setPaddingRelative(recyclerViewFindViewById.getPaddingStart(), recyclerViewFindViewById.getPaddingTop(), recyclerViewFindViewById.getPaddingEnd(), 0);
                        if (emptyContentView == null) {
                            emptyContentView = (com.android.dialer.widget.emptycontentview.EmptyContentView) ((android.view.ViewStub) vwzVar.N().findViewById(2131428111)).inflate();
                        }
                        emptyContentView.f(2131951721);
                        emptyContentView.setVisibility(0);
                        emptyContentView.g(2132017723);
                    } else {
                        recyclerViewFindViewById.setPaddingRelative(recyclerViewFindViewById.getPaddingStart(), recyclerViewFindViewById.getPaddingTop(), recyclerViewFindViewById.getPaddingEnd(), context.getResources().getDimensionPixelSize(2131165784));
                        if (emptyContentView != null) {
                            emptyContentView.setVisibility(8);
                        }
                    }
                } else if (emptyContentView != null) {
                    emptyContentView.setVisibility(8);
                }
                vxqVar.w();
                vxqVar.v();
                if (!vxqVar.G) {
                    vxqVar.G = true;
                    vxqVar.o(new defpackage.vet(vxqVar, 7));
                }
                ahoqVar.close();
                ahbv.D(this.a.d);
            } catch (java.lang.Throwable th4) {
                th = th4;
                th = th;
                ahoqVar.close();
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            ahoqVar = ahoqVarW;
        }
    }

    public final /* synthetic */ void c() {
    }
}
