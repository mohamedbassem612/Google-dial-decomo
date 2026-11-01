package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class obw implements defpackage.odm {
    final /* synthetic */ defpackage.oby a;

    public obw(defpackage.oby obyVar) {
        this.a = obyVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    /* JADX WARN: Code duplicated, block: B:100:0x047a  */
    /* JADX WARN: Code duplicated, block: B:101:0x0492  */
    /* JADX WARN: Code duplicated, block: B:103:0x0526  */
    /* JADX WARN: Code duplicated, block: B:104:0x0532  */
    /* JADX WARN: Code duplicated, block: B:107:0x055a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0584  */
    /* JADX WARN: Code duplicated, block: B:112:0x058b  */
    /* JADX WARN: Code duplicated, block: B:126:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:221:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:282:0x0b3d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.odm
    public final /* synthetic */ void a(java.lang.Object obj) throws aaos {
        int i;
        int i2;
        int i3;
        java.lang.String str;
        char c;
        int i4;
        defpackage.obd obdVarA;
        aimp aimpVar;
        defpackage.nzp nzpVarAL;
        int dimensionPixelSize;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe;
        dtv layoutParams;
        defpackage.obd obdVarA2;
        java.lang.Object obj2;
        defpackage.hux huxVarB;
        defpackage.hvc hvcVarC;
        int i5;
        android.widget.Button buttonA;
        ?? r15;
        android.widget.TextView textView;
        qbe qbeVarCp;
        java.lang.String str2;
        defpackage.obt obtVar;
        agby agbyVarO;
        int i6;
        defpackage.obd obdVarD;
        android.graphics.drawable.Drawable drawableBs;
        aimp aimpVar2 = defpackage.oby.a;
        aimpVar2.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer$modelCallback$<anonymous>", "onDataLoad", 175, "EmergencyVoiceFragmentPeer.kt").v("enter");
        defpackage.obf obfVar = (defpackage.obf) aooh.q((j$.util.Optional) obj);
        if (obfVar != null) {
            defpackage.oby obyVar = this.a;
            obyVar.o = obfVar;
            defpackage.heq heqVarF = obyVar.f();
            az azVarC = obyVar.c();
            java.lang.String str3 = "com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer";
            int i7 = 2;
            if (azVarC != null) {
                if (heqVarF.ad().getBackground() == null) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAd = heqVarF.ad();
                    if (rhx.c(azVarC) && rhx.b(azVarC)) {
                        android.content.Context contextV = heqVarF.V();
                        aooh.f(contextV, "context");
                        int iC = urg.c(contextV, 2130969107);
                        float dimension = contextV.getResources().getDimension(2131165600);
                        drawableBs = wsc.bs(iC, dimension, dimension, dimension, dimension);
                    } else {
                        android.content.Context contextV2 = heqVarF.V();
                        aooh.f(contextV2, "context");
                        int iC2 = urg.c(contextV2, 2130969107);
                        float dimension2 = contextV2.getResources().getDimension(2131165600);
                        drawableBs = wsc.bs(iC2, dimension2, dimension2, 0.0f, 0.0f);
                    }
                    constraintLayoutAd.setBackground(drawableBs);
                }
                for (pgg pggVar : obfVar.n) {
                    java.lang.String str4 = pggVar.c;
                    int iHashCode = str4.hashCode();
                    if (iHashCode != -1921959165) {
                        if (iHashCode == -441933728 && str4.equals("AUDIO_ROUTE")) {
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAg = heqVarF.ag();
                            constraintLayoutAg.findViewById(2131428128).setImageResource(pggVar.d);
                            ((android.widget.TextView) constraintLayoutAg.findViewById(2131428130)).setText(pggVar.e);
                            constraintLayoutAg.setContentDescription(pggVar.f);
                            constraintLayoutAg.setEnabled(pggVar.g);
                            constraintLayoutAg.findViewById(2131428128).setEnabled(pggVar.g);
                            constraintLayoutAg.setSelected(pggVar.h);
                            constraintLayoutAg.setOnClickListener(new defpackage.jjg(obyVar, obfVar, 18));
                        }
                    } else if (str4.equals("DIALPAD")) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAf = heqVarF.af();
                        constraintLayoutAf.findViewById(2131428128).setImageResource(pggVar.d);
                        ((android.widget.TextView) constraintLayoutAf.findViewById(2131428130)).setText(pggVar.e);
                        constraintLayoutAf.setContentDescription(pggVar.f);
                        constraintLayoutAf.setEnabled(pggVar.g);
                        constraintLayoutAf.findViewById(2131428128).setEnabled(pggVar.g);
                        constraintLayoutAf.setSelected(pggVar.h);
                        afsq.F(constraintLayoutAf, obyVar.i, "EmergencyVoiceFragmentPeer_updateButtonBar_toggleDialpad", new defpackage.nti(obyVar, i7));
                    }
                }
                aimpVar2.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "updateButtonBar", 544, "EmergencyVoiceFragmentPeer.kt").v("Configuring center button. Button disappearing fix enabled.");
                androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe2 = heqVarF.ae();
                int i8 = obfVar.b & 8192;
                if (i8 != 0) {
                    defpackage.nzp nzpVar = obfVar.q;
                    if (nzpVar == null) {
                        nzpVar = defpackage.nzp.a;
                    }
                    if (!nzpVar.i) {
                        if (constraintLayoutAe2.getVisibility() != 0 && (obdVarD = obyVar.d()) != null) {
                            defpackage.obd.a.b().l("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController", "onCenterButtonShown", 181, "EmergencyVoiceController.kt").v("enter");
                            defpackage.ocv ocvVar = (defpackage.ocv) aooh.q(obdVarD.b);
                            if (ocvVar == null) {
                                obdVarD.c.a(mcd.aB);
                            } else {
                                defpackage.ocv.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSButtonController", "onButtonShown", 45, "SatelliteSOSButtonController.kt").v("enter");
                                ocvVar.d.b(mce.eZ);
                                ocvVar.i.a(qbc.gQ);
                            }
                        }
                        constraintLayoutAe2.setVisibility(0);
                        defpackage.nzp nzpVar2 = obfVar.q;
                        if (nzpVar2 == null) {
                            nzpVar2 = defpackage.nzp.a;
                        }
                        constraintLayoutAe2.setSelected(nzpVar2.h);
                    }
                    com.google.android.material.imageview.ShapeableImageView shapeableImageViewFindViewById = constraintLayoutAe2.findViewById(2131428128);
                    defpackage.nzp nzpVar3 = obfVar.q;
                    if (nzpVar3 == null) {
                        nzpVar3 = defpackage.nzp.a;
                    }
                    shapeableImageViewFindViewById.setImageResource(nzpVar3.d);
                    android.widget.TextView textView2 = (android.widget.TextView) constraintLayoutAe2.findViewById(2131428130);
                    defpackage.nzp nzpVar4 = obfVar.q;
                    if (nzpVar4 == null) {
                        nzpVar4 = defpackage.nzp.a;
                    }
                    textView2.setText(nzpVar4.e);
                    defpackage.nzp nzpVar5 = obfVar.q;
                    if (nzpVar5 == null) {
                        nzpVar5 = defpackage.nzp.a;
                    }
                    constraintLayoutAe2.setContentDescription(nzpVar5.g);
                    afsq.F(constraintLayoutAe2, obyVar.i, "EmergencyVoiceFragmentPeer_updateButtonBar_onCenterButtonClicked", new defpackage.jjg(obfVar, obyVar, 19, null));
                } else if (i8 == 0) {
                    constraintLayoutAe2.setVisibility(4);
                }
            }
            android.view.View view = (android.view.View) heqVarF.a;
            com.google.android.material.card.MaterialCardView materialCardViewFindViewById = view.findViewById(2131428095);
            aooh.e(materialCardViewFindViewById, "findViewById(...)");
            materialCardViewFindViewById.c(obyVar.a());
            defpackage.obh obhVar = obfVar.p;
            if (obhVar == null) {
                obhVar = defpackage.obh.a;
            }
            aooh.e(obhVar, "getRttButtonModel(...)");
            com.google.android.material.chip.Chip chipAi = heqVarF.ai();
            boolean z = true;
            if (obfVar.c) {
                aimpVar2.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "updateRttButton", 694, "EmergencyVoiceFragmentPeer.kt").v("Making the RTT button visible.");
                i = 0;
            } else {
                aimpVar2.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "updateRttButton", 697, "EmergencyVoiceFragmentPeer.kt").v("Making the RTT button invisible.");
                i = 8;
            }
            chipAi.setVisibility(i);
            heqVarF.ai().setEnabled(obfVar.m);
            heqVarF.ai().i(android.content.res.ColorStateList.valueOf(obyVar.a()));
            heqVarF.ai().setText(obhVar.c);
            heqVarF.ai().k(obhVar.d);
            afsq.F(heqVarF.ai(), obyVar.i, "EmergencyVoiceFragmentPeer_updateRttButton_onUpgradeToRttClicked", new defpackage.jjg(obyVar, obfVar, 20));
            java.lang.String str5 = obfVar.l;
            aooh.e(str5, "getEmergencyDeviceNumberText(...)");
            if (str5.length() == 0) {
                aimpVar2.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "updateDeviceNumber", 629, "EmergencyVoiceFragmentPeer.kt").v("Not showing device number.");
            } else {
                heqVarF.aa().setText(heqVarF.V().getString(2132018525, obfVar.l));
                heqVarF.aa().setBackgroundColor(obyVar.a());
                heqVarF.aa().setVisibility(0);
                aimpVar2.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "updateDeviceNumber", 637, "EmergencyVoiceFragmentPeer.kt").v("Show device number.");
            }
            aimpVar2.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "updateFeaturePromo", 456, "EmergencyVoiceFragmentPeer.kt").v("enter");
            az azVarC2 = obyVar.c();
            if (azVarC2 == null) {
                aimpVar2 = aimpVar2;
                str3 = "com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer";
                i3 = -1;
                i2 = 8;
            } else {
                boolean zB = rhx.b(azVarC2);
                defpackage.nzp nzpVarAL2 = pez.aL(obfVar);
                if (nzpVarAL2 == null || !nzpVarAL2.i) {
                    aimpVar2 = aimpVar2;
                    str3 = "com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer";
                    obyVar.r = false;
                    defpackage.obl oblVar = obyVar.k;
                    defpackage.obl.a.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionNoAnimation", "hideModal", 59, "EmergencyFeatureModalTransitionNoAnimation.kt").v("enter");
                    i2 = 8;
                    heqVarF.ac().setVisibility(8);
                    heqVarF.ab().setVisibility(8);
                    heqVarF.af().setVisibility(0);
                    heqVarF.af().setAlpha(1.0f);
                    heqVarF.ag().setVisibility(0);
                    heqVarF.ag().setAlpha(1.0f);
                    android.view.View viewW = heqVarF.W();
                    if (viewW != null) {
                        viewW.setVisibility(8);
                    }
                    android.view.View viewX = heqVarF.X();
                    if (viewX != null) {
                        viewX.setVisibility(8);
                    }
                    android.view.View viewY = heqVarF.Y();
                    if (viewY != null) {
                        viewY.setVisibility(8);
                    }
                    heqVarF.Z().setVisibility(8);
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe3 = heqVarF.ae();
                    aooh.f(constraintLayoutAe3, "view");
                    pez.aI(constraintLayoutAe3).setVisibility(0);
                    pez.aG(constraintLayoutAe3).setVisibility(0);
                    pez.aJ(constraintLayoutAe3).setVisibility(8);
                    pez.aF(constraintLayoutAe3).setVisibility(8);
                    pez.aH(constraintLayoutAe3).setVisibility(8);
                    com.google.android.material.imageview.ShapeableImageView shapeableImageViewFindViewById2 = constraintLayoutAe3.findViewById(2131428205);
                    aooh.e(shapeableImageViewFindViewById2, "findViewById(...)");
                    shapeableImageViewFindViewById2.setVisibility(8);
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe4 = heqVarF.ae();
                    constraintLayoutAe4.setPadding(constraintLayoutAe4.getPaddingLeft(), constraintLayoutAe4.getPaddingTop(), constraintLayoutAe4.getPaddingRight(), 0);
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe5 = heqVarF.ae();
                    dtv layoutParams2 = constraintLayoutAe5.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    dtv dtvVar = layoutParams2;
                    dtvVar.u = 2131428999;
                    dtvVar.s = 2131428432;
                    i3 = -1;
                    dtvVar.t = -1;
                    dtvVar.v = -1;
                    constraintLayoutAe5.setLayoutParams(dtvVar);
                    z = true;
                    oblVar.c.a = 1;
                } else {
                    if (((java.lang.Boolean) obyVar.l.a()).booleanValue() && !obyVar.r) {
                        obyVar.r = true;
                        obyVar.v.aE(heqVarF.ae(), new defpackage.lge(obyVar, obfVar, 13, null));
                    }
                    if (obyVar.t.a == 3) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe6 = obyVar.f().ae();
                        aooh.f(constraintLayoutAe6, "view");
                        if (pez.aJ(constraintLayoutAe6).getVisibility() == 0) {
                            aimpVar2.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "updateFeaturePromo", 472, "EmergencyVoiceFragmentPeer.kt").v("Button already showing. Returning.");
                            str3 = "com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer";
                            heqVarF = heqVarF;
                            i3 = -1;
                            i2 = 8;
                        } else {
                            aimpVar2.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "updateFeaturePromo", 475, "EmergencyVoiceFragmentPeer.kt").v("Restoring button without animation.");
                            defpackage.obl oblVar2 = obyVar.k;
                            java.lang.String str6 = obfVar.g;
                            aimp aimpVar3 = defpackage.obl.a;
                            aimpVar3.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionNoAnimation", "showScrim", 102, "EmergencyFeatureModalTransitionNoAnimation.kt").v("enter");
                            android.view.View viewW2 = heqVarF.W();
                            if (viewW2 != null) {
                                viewW2.setVisibility(0);
                                aimpVar = aimpVar3;
                                afsq.F(viewW2, oblVar2.b, "EmergencyVoiceFragmentPeer_showScrim_scrimClicked", new defpackage.jjg(oblVar2, obfVar, 10));
                            } else {
                                aimpVar = aimpVar3;
                                android.view.View viewX2 = heqVarF.X();
                                android.view.View viewY2 = heqVarF.Y();
                                if (viewX2 != null && viewY2 != null) {
                                    viewX2.setVisibility(0);
                                    viewY2.setVisibility(0);
                                    ahpz ahpzVar = oblVar2.b;
                                    afsq.F(viewX2, ahpzVar, "EmergencyVoiceFragmentPeer_showScrim_scrimLeftSideClicked", new defpackage.jjg(oblVar2, obfVar, 11));
                                    afsq.F(viewY2, ahpzVar, "EmergencyVoiceFragmentPeer_showScrim_scrimRightSideClicked", new defpackage.jjg(oblVar2, obfVar, 12));
                                }
                                aimpVar.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionNoAnimation", "fadeOutButtons", 95, "EmergencyFeatureModalTransitionNoAnimation.kt").v("enter");
                                heqVarF.af().setVisibility(4);
                                heqVarF.ag().setVisibility(4);
                                heqVarF.ae().setVisibility(4);
                                nzpVarAL = pez.aL(obfVar);
                                if (nzpVarAL == null) {
                                    aimpVar.d().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionNoAnimation", "expandModalNoAnimation", 140, "EmergencyFeatureModalTransitionNoAnimation.kt").v("center button is null!");
                                    i3 = -1;
                                    i2 = 8;
                                } else {
                                    heqVarF.ac().setText(nzpVarAL.j);
                                    heqVarF.ab().setText(nzpVarAL.k);
                                    heqVarF.ac().setVisibility(0);
                                    heqVarF.ab().setVisibility(0);
                                    heqVarF.ae().setVisibility(0);
                                    heqVarF.ae().setAlpha(1.0f);
                                    heqVarF.af().setVisibility(8);
                                    heqVarF.ag().setVisibility(8);
                                    android.widget.ImageButton imageButtonZ = heqVarF.Z();
                                    imageButtonZ.setVisibility(0);
                                    afsq.F(imageButtonZ, oblVar2.b, "EmergencyVoiceFragmentPeer_showModal_onCloseButtonClicked", new defpackage.jjg(oblVar2, obfVar, 9));
                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe7 = heqVarF.ae();
                                    aooh.f(constraintLayoutAe7, "view");
                                    i2 = 8;
                                    pez.aI(constraintLayoutAe7).setVisibility(8);
                                    pez.aG(constraintLayoutAe7).setVisibility(8);
                                    pez.aJ(constraintLayoutAe7).setVisibility(0);
                                    android.widget.ImageView imageViewAF = pez.aF(constraintLayoutAe7);
                                    imageViewAF.setVisibility(0);
                                    imageViewAF.setImageResource(nzpVarAL.d);
                                    imageViewAF.setContentDescription(nzpVarAL.g);
                                    android.widget.TextView textViewAH = pez.aH(constraintLayoutAe7);
                                    textViewAH.setText(nzpVarAL.f);
                                    textViewAH.setVisibility(0);
                                    if (zB != 0) {
                                        dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167279);
                                    } else {
                                        dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167277);
                                    }
                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe8 = heqVarF.ae();
                                    constraintLayoutAe8.setPadding(constraintLayoutAe8.getPaddingLeft(), constraintLayoutAe8.getPaddingTop(), constraintLayoutAe8.getPaddingRight(), dimensionPixelSize);
                                    constraintLayoutAe = heqVarF.ae();
                                    layoutParams = constraintLayoutAe.getLayoutParams();
                                    if (layoutParams != null) {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                    }
                                    dtv dtvVar2 = layoutParams;
                                    dtvVar2.t = 2131428533;
                                    i3 = -1;
                                    dtvVar2.u = -1;
                                    dtvVar2.s = -1;
                                    dtvVar2.v = 2131428533;
                                    constraintLayoutAe.setLayoutParams(dtvVar2);
                                }
                                oblVar2.d.i(str6).b(mce.fg);
                                oblVar2.c.a = 3;
                                obdVarA2 = oblVar2.a(obfVar);
                                if (obdVarA2 != null) {
                                    obdVarA2.e();
                                }
                                heqVarF = heqVarF;
                            }
                            aimpVar.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionNoAnimation", "fadeOutButtons", 95, "EmergencyFeatureModalTransitionNoAnimation.kt").v("enter");
                            heqVarF.af().setVisibility(4);
                            heqVarF.ag().setVisibility(4);
                            heqVarF.ae().setVisibility(4);
                            nzpVarAL = pez.aL(obfVar);
                            if (nzpVarAL == null) {
                                aimpVar.d().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionNoAnimation", "expandModalNoAnimation", 140, "EmergencyFeatureModalTransitionNoAnimation.kt").v("center button is null!");
                                i3 = -1;
                                i2 = 8;
                            } else {
                                heqVarF.ac().setText(nzpVarAL.j);
                                heqVarF.ab().setText(nzpVarAL.k);
                                heqVarF.ac().setVisibility(0);
                                heqVarF.ab().setVisibility(0);
                                heqVarF.ae().setVisibility(0);
                                heqVarF.ae().setAlpha(1.0f);
                                heqVarF.af().setVisibility(8);
                                heqVarF.ag().setVisibility(8);
                                android.widget.ImageButton imageButtonZ2 = heqVarF.Z();
                                imageButtonZ2.setVisibility(0);
                                afsq.F(imageButtonZ2, oblVar2.b, "EmergencyVoiceFragmentPeer_showModal_onCloseButtonClicked", new defpackage.jjg(oblVar2, obfVar, 9));
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe9 = heqVarF.ae();
                                aooh.f(constraintLayoutAe9, "view");
                                i2 = 8;
                                pez.aI(constraintLayoutAe9).setVisibility(8);
                                pez.aG(constraintLayoutAe9).setVisibility(8);
                                pez.aJ(constraintLayoutAe9).setVisibility(0);
                                android.widget.ImageView imageViewAF2 = pez.aF(constraintLayoutAe9);
                                imageViewAF2.setVisibility(0);
                                imageViewAF2.setImageResource(nzpVarAL.d);
                                imageViewAF2.setContentDescription(nzpVarAL.g);
                                android.widget.TextView textViewAH2 = pez.aH(constraintLayoutAe9);
                                textViewAH2.setText(nzpVarAL.f);
                                textViewAH2.setVisibility(0);
                                if (zB != 0) {
                                    dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167279);
                                } else {
                                    dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167277);
                                }
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe10 = heqVarF.ae();
                                constraintLayoutAe10.setPadding(constraintLayoutAe10.getPaddingLeft(), constraintLayoutAe10.getPaddingTop(), constraintLayoutAe10.getPaddingRight(), dimensionPixelSize);
                                constraintLayoutAe = heqVarF.ae();
                                layoutParams = constraintLayoutAe.getLayoutParams();
                                if (layoutParams != null) {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                }
                                dtv dtvVar3 = layoutParams;
                                dtvVar3.t = 2131428533;
                                i3 = -1;
                                dtvVar3.u = -1;
                                dtvVar3.s = -1;
                                dtvVar3.v = 2131428533;
                                constraintLayoutAe.setLayoutParams(dtvVar3);
                            }
                            oblVar2.d.i(str6).b(mce.fg);
                            oblVar2.c.a = 3;
                            obdVarA2 = oblVar2.a(obfVar);
                            if (obdVarA2 != null) {
                                obdVarA2.e();
                            }
                            heqVarF = heqVarF;
                        }
                    } else {
                        str3 = "com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer";
                        i3 = -1;
                        defpackage.obr obrVar = obyVar.j;
                        defpackage.obs obsVar = obyVar.b;
                        java.lang.String str7 = obfVar.g;
                        emy emyVar = ((ahfw) obsVar).a;
                        aooh.f(emyVar, "lifecycle");
                        xm xmVar = obrVar.c;
                        if (xmVar.a == 1) {
                            aimz aimzVar = defpackage.obr.a;
                            aimzVar.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionWithAnimation", "showModal", 62, "EmergencyFeatureModalTransitionWithAnimation.kt").v("Starting animation to show the modal.");
                            xmVar.a = 2;
                            aimzVar.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionWithAnimation", "showScrim", 135, "EmergencyFeatureModalTransitionWithAnimation.kt").v("enter");
                            android.view.View viewW3 = heqVarF.W();
                            if (viewW3 != null) {
                                afsq.F(viewW3, obrVar.b, "EmergencyVoiceFragmentPeer_showScrim_scrimClicked", new defpackage.jjg(obrVar, obfVar, 15));
                                android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(viewW3, "alpha", 0.0f, 0.5f);
                                str = str7;
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.addListener(defpackage.hrz.c(emyVar, new defpackage.fcg(viewW3, 15)));
                                objectAnimatorOfFloat.start();
                            } else {
                                str = str7;
                                android.view.View viewX3 = heqVarF.X();
                                android.view.View viewY3 = heqVarF.Y();
                                if (viewX3 != null && viewY3 != null) {
                                    ahpz ahpzVar2 = obrVar.b;
                                    afsq.F(viewX3, ahpzVar2, "EmergencyVoiceFragmentPeer_showScrim_scrimLeftSideClicked", new defpackage.jjg(obrVar, obfVar, 16));
                                    afsq.F(viewY3, ahpzVar2, "EmergencyVoiceFragmentPeer_showScrim_scrimRightSideClicked", new defpackage.jjg(obrVar, obfVar, 17));
                                    android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(viewX3, "alpha", 0.0f, 0.5f);
                                    android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(viewY3, "alpha", 0.0f, 0.5f);
                                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                                    animatorSet.setDuration(300L);
                                    c = 0;
                                    i4 = 1;
                                    animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                                    animatorSet.addListener(defpackage.hrz.c(emyVar, new defpackage.rh(viewX3, viewY3, 7)));
                                    animatorSet.start();
                                }
                                heqVarF = heqVarF;
                                defpackage.obm obmVar = new defpackage.obm(obrVar, heqVarF, (ems) emyVar, obfVar, zB, str, 0);
                                aimzVar.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionWithAnimation", "fadeOutButtons", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "EmergencyFeatureModalTransitionWithAnimation.kt").v("enter");
                                android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat(heqVarF.af(), "alpha", 1.0f, 0.0f);
                                android.animation.ObjectAnimator objectAnimatorOfFloat5 = android.animation.ObjectAnimator.ofFloat(heqVarF.ag(), "alpha", 1.0f, 0.0f);
                                android.animation.ObjectAnimator objectAnimatorOfFloat6 = android.animation.ObjectAnimator.ofFloat(heqVarF.ae(), "alpha", 1.0f, 0.0f);
                                android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                                android.animation.Animator[] animatorArr = new android.animation.Animator[3];
                                animatorArr[c] = objectAnimatorOfFloat4;
                                animatorArr[i4] = objectAnimatorOfFloat5;
                                animatorArr[2] = objectAnimatorOfFloat6;
                                animatorSet2.playTogether(animatorArr);
                                animatorSet2.setDuration(300L);
                                animatorSet2.addListener(defpackage.hrz.a(emyVar, new defpackage.obo(heqVarF, obmVar, i4)));
                                animatorSet2.start();
                                obdVarA = obrVar.a(obfVar);
                                if (obdVarA != null) {
                                    obdVarA.e();
                                }
                                i3 = -1;
                                i2 = 8;
                            }
                            c = 0;
                            i4 = 1;
                            heqVarF = heqVarF;
                            defpackage.obm obmVar2 = new defpackage.obm(obrVar, heqVarF, (ems) emyVar, obfVar, zB, str, 0);
                            aimzVar.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionWithAnimation", "fadeOutButtons", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "EmergencyFeatureModalTransitionWithAnimation.kt").v("enter");
                            android.animation.ObjectAnimator objectAnimatorOfFloat7 = android.animation.ObjectAnimator.ofFloat(heqVarF.af(), "alpha", 1.0f, 0.0f);
                            android.animation.ObjectAnimator objectAnimatorOfFloat8 = android.animation.ObjectAnimator.ofFloat(heqVarF.ag(), "alpha", 1.0f, 0.0f);
                            android.animation.ObjectAnimator objectAnimatorOfFloat9 = android.animation.ObjectAnimator.ofFloat(heqVarF.ae(), "alpha", 1.0f, 0.0f);
                            android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
                            android.animation.Animator[] animatorArr2 = new android.animation.Animator[3];
                            animatorArr2[c] = objectAnimatorOfFloat7;
                            animatorArr2[i4] = objectAnimatorOfFloat8;
                            animatorArr2[2] = objectAnimatorOfFloat9;
                            animatorSet3.playTogether(animatorArr2);
                            animatorSet3.setDuration(300L);
                            animatorSet3.addListener(defpackage.hrz.a(emyVar, new defpackage.obo(heqVarF, obmVar2, i4)));
                            animatorSet3.start();
                            obdVarA = obrVar.a(obfVar);
                            if (obdVarA != null) {
                                obdVarA.e();
                            }
                            i3 = -1;
                            i2 = 8;
                        } else {
                            heqVarF = heqVarF;
                            i2 = 8;
                        }
                    }
                    z = true;
                }
            }
            az azVarC3 = obyVar.c();
            if (azVarC3 != null && !rhx.c(azVarC3)) {
                heqVarF.ad().setImportantForAccessibility(z != obfVar.e ? 1 : 4);
            }
            az azVarC4 = obyVar.c();
            if (azVarC4 != null) {
                pyh pyhVarA = pyi.a();
                pyhVarA.i(obfVar.e);
                pyhVarA.d(2131428382);
                pyhVarA.h(true);
                pyhVarA.c(j$.util.Optional.of(obfVar.g));
                if (rhx.c(azVarC4)) {
                    i6 = 3;
                    pyhVarA.a = 3;
                    pyhVarA.g(true);
                } else {
                    i6 = 3;
                }
                if (rhx.b(azVarC4)) {
                    pyhVarA.a = i6;
                    pyhVarA.g(true);
                    pyhVarA.f(true);
                    pyhVarA.b(obyVar.b.dX().getDimensionPixelSize(2131166203));
                }
                obyVar.c.c(pyhVarA.a());
                obyVar.m.f(obfVar.e);
            }
            obyVar.g(heqVarF, obfVar);
            if (!pez.aK(obfVar, obyVar.p)) {
                agbv agbvVar = obyVar.q;
                if (agbvVar != null) {
                    if (true != agbvVar.k()) {
                        agbvVar = null;
                    }
                    if (agbvVar != null) {
                        agbvVar.e(3);
                    }
                }
                obyVar.q = null;
                defpackage.obi obiVarB = defpackage.obi.b(obfVar.o);
                if (obiVarB == null) {
                    obiVarB = defpackage.obi.SNACKBAR_NOT_PRESENT;
                }
                defpackage.obi obiVar = defpackage.obi.SNACKBAR_NOT_PRESENT;
                if (obiVarB != obiVar) {
                    android.view.View viewFindViewById = view.findViewById(2131428396);
                    if (viewFindViewById == null) {
                        aimpVar2.d().i(zct.b).l(str3, "updateSnackbar", 769, "EmergencyVoiceFragmentPeer.kt").v("Snackbar container is null. Maybe the view is not ready?");
                    } else {
                        java.lang.String str8 = str3;
                        java.util.Map map = obyVar.f;
                        defpackage.obi obiVarB2 = defpackage.obi.b(obfVar.o);
                        if (obiVarB2 == null) {
                            obiVarB2 = obiVar;
                        }
                        defpackage.obj objVar = (defpackage.obj) map.get(obiVarB2);
                        if (objVar == null) {
                            aimw aimwVarL = aimpVar2.c().m(aioa.b).i(zct.b).l(str8, "createSnackbar", 787, "EmergencyVoiceFragmentPeer.kt");
                            defpackage.obi obiVarB3 = defpackage.obi.b(obfVar.o);
                            if (obiVarB3 != null) {
                                obiVar = obiVarB3;
                            }
                            aimwVarL.y("Missing SnackbarMessageData for %s", obiVar);
                            agbyVarO = null;
                        } else {
                            int iAN = a.aN(objVar.e);
                            if (iAN == 0) {
                                iAN = 1;
                            }
                            int i9 = iAN + i3;
                            agbyVarO = agby.o(viewFindViewById, objVar.c, i9 != 1 ? i9 != 3 ? 0 : -2 : i3);
                            agbyVarO.r(2);
                            agbyVarO.n(new defpackage.obv(obfVar, obyVar));
                            int i10 = objVar.d;
                            if (i10 != 0) {
                                agbyVarO.s(i10, new defpackage.hww(4));
                            }
                        }
                        obyVar.q = agbyVarO;
                        agby agbyVar = obyVar.q;
                        if (agbyVar != null) {
                            viewFindViewById.setVisibility(0);
                            agbyVar.h();
                        }
                    }
                }
            }
            android.view.View viewFindViewById2 = view.findViewById(2131428385);
            aooh.e(viewFindViewById2, "findViewById(...)");
            viewFindViewById2.setEnabled(obfVar.r);
            if (obfVar.h) {
                defpackage.obs obsVar2 = obyVar.b;
                if (obsVar2.I().e("AudioRouteSelectorDialog") == null) {
                    pez.j().r(obsVar2.I(), "AudioRouteSelectorDialog");
                }
            }
            if (((defpackage.her) aooh.q(obyVar.e)) != null && obfVar.j) {
                if (obyVar.b() == null) {
                    u uVar = new u(obyVar.b.I());
                    defpackage.hwl hwlVar = new defpackage.hwl();
                    amxr.g(hwlVar);
                    uVar.e(2131428398, hwlVar, "tag_voice_assist_fragment", 1);
                    uVar.c();
                    defpackage.obf obfVar2 = obyVar.o;
                    if (obfVar2 == null || (str2 = obfVar2.g) == null) {
                        qbeVarCp = null;
                    } else {
                        j$.util.Optional optionalE = obyVar.s.e(str2);
                        aooh.e(optionalE, "get(...)");
                        apqr apqrVar = (apqr) aooh.q(optionalE);
                        if (apqrVar == null || (obtVar = (defpackage.obt) apqrVar.a(defpackage.obt.class)) == null) {
                            qbeVarCp = null;
                        } else {
                            qbeVarCp = obtVar.cp();
                        }
                    }
                    if (qbeVarCp != null) {
                        qbeVarCp.a(qbc.gU);
                    }
                }
                ((android.widget.FrameLayout) obyVar.b.N().findViewById(2131428398)).setVisibility(0);
                defpackage.hwl hwlVarB = obyVar.b();
                defpackage.huv huvVar = obfVar.k;
                if (huvVar == null) {
                    huvVar = defpackage.huv.a;
                }
                defpackage.hwn hwnVarY = hwlVarB.y();
                aooh.f(huvVar, "model");
                hwnVarY.c = hwnVarY.b;
                hwnVarY.b = huvVar;
                defpackage.hwl hwlVar2 = hwnVarY.a;
                android.widget.TextView textView3 = (android.widget.TextView) hwlVar2.N().findViewById(2131428103);
                if (textView3 != null) {
                    textView3.setText(huvVar.j);
                }
                defpackage.huv huvVar2 = hwnVarY.c;
                boolean z2 = huvVar2 != null ? huvVar2.e : false;
                boolean z3 = huvVar.e;
                if (z2 == z3) {
                    obj2 = null;
                } else {
                    hwnVarY.b().setVisibility(true != z3 ? i2 : 0);
                    if (z3) {
                        hwnVarY.b().setBackgroundColor(hwnVarY.a());
                        com.google.android.material.chip.Chip chipFindViewById = hwlVar2.N().findViewById(2131428088);
                        aooh.e(chipFindViewById, "findViewById(...)");
                        chipFindViewById.i(android.content.res.ColorStateList.valueOf(hwnVarY.a()));
                        com.google.android.material.chip.Chip chipFindViewById2 = hwlVar2.N().findViewById(2131428087);
                        aooh.e(chipFindViewById2, "findViewById(...)");
                        chipFindViewById2.i(android.content.res.ColorStateList.valueOf(hwnVarY.a()));
                        com.google.android.material.chip.Chip chipFindViewById3 = hwlVar2.N().findViewById(2131428089);
                        aooh.e(chipFindViewById3, "findViewById(...)");
                        chipFindViewById3.i(android.content.res.ColorStateList.valueOf(hwnVarY.a()));
                        obj2 = null;
                        hwnVarY.e.i((java.lang.String) null).b(mce.bK);
                        qbe qbeVarE = hwnVarY.e();
                        if (qbeVarE != null) {
                            qbeVarE.a(qbc.gY);
                        }
                    } else {
                        obj2 = null;
                    }
                    defpackage.huv huvVar3 = hwnVarY.b;
                    if (huvVar3 == null || (huxVarB = defpackage.hux.b(huvVar3.h)) == null) {
                        huxVarB = defpackage.hux.VOICE_ASSIST_EMERGENCY_TYPE_UNSPECIFIED;
                    }
                    if (z3 && huxVarB != defpackage.hux.VOICE_ASSIST_EMERGENCY_TYPE_UNSPECIFIED && (hvcVarC = hwnVarY.c()) != null) {
                        hvcVarC.c(huxVarB);
                    }
                }
                defpackage.huv huvVar4 = hwnVarY.c;
                boolean z4 = (huvVar4 != null && huvVar4.f) || hwnVarY.d.a;
                boolean z5 = huvVar.f;
                hwnVarY.d.a = z5;
                if (z4 != z5) {
                    if (z5) {
                        java.lang.String str9 = huvVar.g;
                        aooh.e(str9, "getMessageText(...)");
                        aooh.f(str9, "messageText");
                        defpackage.hws hwsVar = new defpackage.hws();
                        amxr.g(hwsVar);
                        ahgl.c(hwsVar, str9);
                        hwsVar.r(hwlVar2.I(), "emergency_voice_assist");
                    } else {
                        defpackage.hws hwsVarD = hwnVarY.d();
                        if (hwsVarD != null) {
                            hwsVarD.f();
                        }
                    }
                }
                defpackage.hws hwsVarD2 = hwnVarY.d();
                if (hwsVarD2 != null) {
                    int i11 = huvVar.i;
                    defpackage.hwv hwvVarY = hwsVarD2.y();
                    android.app.Dialog dialog = ((defpackage.al) hwvVarY.c).d;
                    if (dialog != null) {
                        textView = (android.widget.TextView) dialog.findViewById(2131428101);
                    } else {
                        r15 = obj2;
                    }
                    if (r15 != 0) {
                        r15 = textView;
                        ?? r5 = hwvVarY.d;
                        i5 = 0;
                        ((android.text.SpannableString) r5).setSpan(hwvVarY.e, 0, i11, 18);
                        r15.setText(r5);
                    } else {
                        r15 = textView;
                        i5 = 0;
                    }
                } else {
                    r15 = textView;
                    i5 = 0;
                }
                defpackage.hws hwsVarD3 = hwnVarY.d();
                if (hwsVarD3 != null) {
                    defpackage.hwv hwvVarY2 = hwsVarD3.y();
                    defpackage.huu huuVar = huvVar.d;
                    if (huuVar == null) {
                        huuVar = defpackage.huu.a;
                    }
                    aooh.e(huuVar, "getRttButtonModel(...)");
                    aooh.f(huuVar, "rttButtonModel");
                    android.widget.Button buttonA2 = hwvVarY2.a();
                    if (buttonA2 != null) {
                        if (true == huuVar.c) {
                            i2 = i5;
                        }
                        buttonA2.setVisibility(i2);
                    }
                    if (huuVar.c && (buttonA = hwvVarY2.a()) != null) {
                        buttonA.setText(((defpackage.hws) hwvVarY2.c).Y(huuVar.d));
                    }
                }
            }
            obyVar.u.i(obfVar.g).b(mce.bu);
            obyVar.p = obfVar;
        }
    }

    @Override // defpackage.odm
    public final void b(java.lang.Throwable th) {
        defpackage.oby.a.c().i(zct.b).k(th).l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer$modelCallback$<anonymous>", "onDataLoadError", 206, "EmergencyVoiceFragmentPeer.kt").v("Error with EmergencyVoiceFragmentModel subscription callback");
        this.a.u.i((java.lang.String) null).a(mcd.D);
    }
}
