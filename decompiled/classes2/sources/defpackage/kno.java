package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kno {
    public static final aimz a = aimz.i("com/android/dialer/calllog/ui/menu/ConversationHistoryCallLogDropdownActions");

    /* JADX WARN: Code duplicated, block: B:164:0x0351  */
    public static aify a(az azVar, kiu kiuVar, tcp tcpVar, wgi wgiVar) {
        kgu kguVarB;
        mau mauVarAy = defpackage.hgu.u(azVar).ay();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        knn knnVarU = defpackage.hgu.u(azVar);
        kgz kgzVar = (kgz) knnVarU.mZ().g().orElse((java.lang.Object) null);
        if (kgzVar != null && (kguVarB = kgzVar.b(kiuVar)) != null) {
            int i = kiuVar.o & 1;
            vua vuaVar = new vua((byte[]) null, (byte[]) null);
            int i2 = i ^ 1;
            vuaVar.m(mauVarAy.b.getString(i2 != 0 ? 2132018177 : 2132018179));
            vuaVar.k(1 != i2 ? 2131231340 : 2131231080);
            boolean z = (((java.lang.Boolean) mauVarAy.f.a()).booleanValue() && android.os.Build.VERSION.SDK_INT >= 37) || (kguVarB.b & 32) != 0;
            boolean z2 = 1 == i2;
            vuaVar.l(z);
            vuaVar.c = new defpackage.maq(mauVarAy, (alad) kguVarB, z2, 7);
            arrayList.add(vuaVar.i());
            arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
            return aify.n(arrayList);
        }
        int i3 = kiuVar.o;
        boolean z3 = (i3 & 32) == 32;
        int i4 = i3 & 1;
        tcp tcpVar2 = tcp.e;
        if (tcpVar != tcpVar2 && z3 && i4 == 0) {
            arrayList.add(mauVarAy.l(kiuVar, false, wgiVar));
        } else if (tcpVar == tcp.d || (tcpVar != tcpVar2 && z3)) {
            arrayList.add(mauVarAy.i(kiuVar, false));
        }
        if (kiuVar.i == 1) {
            defpackage.kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            if (!kiwVar.r && !kiuVar.s) {
                defpackage.kiw kiwVar2 = kiuVar.r;
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                if (kiwVar2.j && !knnVarU.ox().u(kiuVar) && !knnVarU.ox().t(kiuVar)) {
                    arrayList.add(mauVarAy.j(kiuVar, false));
                    arrayList.add(mauVarAy.c(kiuVar, false));
                    arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
                    if (d(mauVarAy, kiuVar, arrayList.size())) {
                        c(knnVarU);
                        arrayList.add(mauVarAy.h(kiuVar));
                    }
                    return aify.n(arrayList);
                }
                defpackage.kiw kiwVar3 = kiuVar.r;
                if (kiwVar3 == null) {
                    kiwVar3 = defpackage.kiw.a;
                }
                if (kiwVar3.j && knnVarU.ox().t(kiuVar)) {
                    arrayList.add(mauVarAy.j(kiuVar, false));
                    arrayList.add(mauVarAy.f(kiuVar, false));
                    arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
                    if (d(mauVarAy, kiuVar, arrayList.size())) {
                        c(knnVarU);
                        arrayList.add(mauVarAy.h(kiuVar));
                    }
                    return aify.n(arrayList);
                }
                defpackage.kiw kiwVar4 = kiuVar.r;
                if (kiwVar4 == null) {
                    kiwVar4 = defpackage.kiw.a;
                }
                if (!kiwVar4.j && knnVarU.ox().t(kiuVar)) {
                    arrayList.add(mauVarAy.b(kiuVar, false));
                    arrayList.add(mauVarAy.f(kiuVar, false));
                    arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
                    if (d(mauVarAy, kiuVar, arrayList.size())) {
                        c(knnVarU);
                        arrayList.add(mauVarAy.h(kiuVar));
                    }
                    return aify.n(arrayList);
                }
                defpackage.kiw kiwVar5 = kiuVar.r;
                if (kiwVar5 == null) {
                    kiwVar5 = defpackage.kiw.a;
                }
                if (kiwVar5.j && knnVarU.ox().u(kiuVar)) {
                    arrayList.add(mauVarAy.j(kiuVar, false));
                    arrayList.add(mauVarAy.g(kiuVar, false));
                    arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
                    if (d(mauVarAy, kiuVar, arrayList.size())) {
                        c(knnVarU);
                        arrayList.add(mauVarAy.h(kiuVar));
                    }
                    return aify.n(arrayList);
                }
                defpackage.kiw kiwVar6 = kiuVar.r;
                if (kiwVar6 == null) {
                    kiwVar6 = defpackage.kiw.a;
                }
                if (!kiwVar6.j && knnVarU.ox().u(kiuVar)) {
                    arrayList.add(mauVarAy.b(kiuVar, false));
                    arrayList.add(mauVarAy.g(kiuVar, false));
                    arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
                    if (d(mauVarAy, kiuVar, arrayList.size())) {
                        c(knnVarU);
                        arrayList.add(mauVarAy.h(kiuVar));
                    }
                    return aify.n(arrayList);
                }
                if (i4 != 0) {
                    arrayList.add(mauVarAy.l(kiuVar, false, wgiVar));
                    arrayList.add(mauVarAy.e(kiuVar, false));
                    arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
                    if (d(mauVarAy, kiuVar, arrayList.size())) {
                        c(knnVarU);
                        arrayList.add(mauVarAy.h(kiuVar));
                    }
                    return aify.n(arrayList);
                }
                defpackage.kiw kiwVar7 = kiuVar.r;
                if (kiwVar7 == null) {
                    kiwVar7 = defpackage.kiw.a;
                }
                rmt rmtVarB = rmt.b(kiwVar7.o);
                if (rmtVarB == null) {
                    rmtVarB = rmt.a;
                }
                if (rmtVarB == rmt.b && (kiuVar.o & 1) != 1) {
                    defpackage.mao maoVarK = mauVarAy.k(kiuVar, false, wgiVar, defpackage.nwt.CONVERSATION_HISTORY_DROPDOWN_MENU);
                    if (!((java.lang.Boolean) defpackage.hgu.u(azVar).hM().a()).booleanValue()) {
                        arrayList.add(maoVarK);
                        if (maoVarK.d) {
                            defpackage.hgu.u(azVar).bt().n(rmw.eZ);
                        }
                    } else if (maoVarK.d) {
                        arrayList.add(maoVarK);
                        defpackage.hgu.u(azVar).bt().n(rmw.eZ);
                    }
                    arrayList.add(mauVarAy.e(kiuVar, false));
                    arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
                    return aify.n(arrayList);
                }
                if (knnVarU.qS().O(kiuVar).l) {
                    defpackage.kiw kiwVar8 = kiuVar.r;
                    rmt rmtVarB2 = rmt.b((kiwVar8 == null ? defpackage.kiw.a : kiwVar8).o);
                    if (rmtVarB2 == null) {
                        rmtVarB2 = rmt.a;
                    }
                    if (rmtVarB2 != rmt.a) {
                        arrayList.add(mauVarAy.a(azVar, kiuVar, false));
                    } else {
                        if ((kiwVar8 == null ? defpackage.kiw.a : kiwVar8).j) {
                            arrayList.add(mauVarAy.a(azVar, kiuVar, false));
                        } else {
                            if (kiwVar8 == null) {
                                kiwVar8 = defpackage.kiw.a;
                            }
                            if (kiwVar8.r || kiuVar.s) {
                                arrayList.add(mauVarAy.a(azVar, kiuVar, false));
                            } else {
                                if (azVar.findViewById(2131428497) == null) {
                                    throw new java.util.NoSuchElementException("view does not contain R.id.main_activity_coordinator_layout");
                                }
                                vua vuaVar2 = new vua((byte[]) null, (byte[]) null);
                                vuaVar2.k(2131231588);
                                vuaVar2.m(mauVarAy.b.getString(2132018168));
                                vuaVar2.l(true);
                                vuaVar2.c = new defpackage.knj(mauVarAy, kiuVar, azVar, 3);
                                arrayList.add(vuaVar2.i());
                            }
                        }
                    }
                } else {
                    arrayList.add(mauVarAy.a(azVar, kiuVar, false));
                }
                arrayList.add(mauVarAy.e(kiuVar, false));
                arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
                if (d(mauVarAy, kiuVar, arrayList.size())) {
                    c(knnVarU);
                    arrayList.add(mauVarAy.h(kiuVar));
                }
                return aify.n(arrayList);
            }
        }
        arrayList.add(mauVarAy.a(azVar, kiuVar, false));
        arrayList.add(mauVarAy.e(kiuVar, false));
        arrayList.add(mauVarAy.d(azVar, kiuVar, defpackage.lyo.a(azVar, kiuVar)));
        return aify.n(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [ahth, java.lang.Object] */
    public static void b(az azVar, android.view.ViewGroup viewGroup, kiu kiuVar, tcp tcpVar, wgi wgiVar) {
        aigf aigfVarN;
        aify aifyVarA = a(azVar, kiuVar, tcpVar, wgiVar);
        int size = aifyVarA.size();
        int i = 1;
        if (size == 2) {
            aigfVarN = aigf.l(0, (defpackage.mao) aifyVarA.get(0), 1, (defpackage.mao) aifyVarA.get(1));
        } else if (size == 3) {
            aigfVarN = aigf.m(0, (defpackage.mao) aifyVarA.get(0), 1, (defpackage.mao) aifyVarA.get(1), 3, (defpackage.mao) aifyVarA.get(2));
        } else {
            if (size != 4) {
                throw new java.lang.IllegalStateException("There should always be 2 or 3 or 4 actions for a conversation history entry's dropdown menu.");
            }
            aigfVarN = aigf.n(0, (defpackage.mao) aifyVarA.get(0), 1, (defpackage.mao) aifyVarA.get(1), 2, (defpackage.mao) aifyVarA.get(2), 3, (defpackage.mao) aifyVarA.get(3));
        }
        aike aikeVarS = aify.s((android.widget.TextView) viewGroup.findViewById(2131427874), (android.widget.TextView) viewGroup.findViewById(2131427876), (android.widget.TextView) viewGroup.findViewById(2131427877), (android.widget.TextView) viewGroup.findViewById(2131427875));
        ahvr.bZ(aikeVarS.d == 4, "There should be always be exactly 4 views for a conversation history entry's dropdown menu.");
        j$.lang.Iterable.-EL.forEach(aikeVarS, new defpackage.fch(20));
        int iIntValue = ((java.lang.Integer) java.util.Collections.max(aigfVarN.f())).intValue();
        ailj ailjVarK = aigfVarN.e().k();
        while (ailjVarK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
            int iIntValue2 = ((java.lang.Integer) entry.getKey()).intValue();
            com.google.android.material.button.MaterialButton materialButton = (android.widget.TextView) aikeVarS.get(iIntValue2);
            materialButton.setVisibility(0);
            defpackage.mao maoVar = (defpackage.mao) entry.getValue();
            knn knnVarU = defpackage.hgu.u(azVar);
            defpackage.inx inxVar = new defpackage.inx(iIntValue2 == 0, iIntValue2 == iIntValue);
            com.google.android.material.button.MaterialButton materialButton2 = materialButton;
            materialButton2.n(maoVar.c);
            knnVarU.jl();
            knnVarU.oM().C(materialButton2, inxVar);
            materialButton.setText(maoVar.a);
            j$.util.Optional optional = maoVar.b;
            if (optional.isPresent()) {
                materialButton.setContentDescription((java.lang.CharSequence) optional.orElseThrow());
            } else {
                materialButton.setContentDescription(null);
            }
            boolean z = maoVar.d;
            materialButton.setEnabled(z);
            j$.util.Optional optional2 = maoVar.f;
            defpackage.jrs jrsVar = new defpackage.jrs(materialButton, 20);
            if (true == optional2.isPresent()) {
                ((android.widget.TextView) jrsVar.a).setTag(2131428318, optional2.get());
            }
            j$.util.Optional optional3 = maoVar.g;
            defpackage.kwv kwvVar = new defpackage.kwv(azVar, i);
            if (true == optional3.isPresent()) {
                defpackage.hgu.u((android.content.Context) kwvVar.a).sJ().bm((rmu) optional3.get());
            }
            if (z) {
                materialButton.setOnClickListener(maoVar.e);
                j$.util.Optional optional4 = maoVar.h;
                defpackage.hvp hvpVar = new defpackage.hvp(azVar, materialButton, 6, null);
                if (true == optional4.isPresent()) {
                    ?? r1 = optional4.get();
                    java.lang.Object obj = hvpVar.b;
                    java.lang.Object obj2 = hvpVar.a;
                    a.b().l("com/android/dialer/calllog/ui/menu/ConversationHistoryCallLogDropdownActions", "applyActionToButton", 542, "ConversationHistoryCallLogDropdownActions.java").v("set TikTok Events' onClick");
                    defpackage.hgu.u((android.content.Context) obj).nz().g((android.view.View) obj2, (ahth) r1);
                }
            } else {
                materialButton.setOnClickListener(new defpackage.hww(2));
            }
        }
    }

    private static void c(knn knnVar) {
        a.b().l("com/android/dialer/calllog/ui/menu/ConversationHistoryCallLogDropdownActions", "logReverseLookupActionButtonPopulatedImpression", 443, "ConversationHistoryCallLogDropdownActions.java").v("Display Reverse lookup action button");
        knnVar.bt().o(rmx.oz);
    }

    private static boolean d(mau mauVar, kiu kiuVar, int i) {
        return i < 4 && mauVar.p(kiuVar);
    }
}
