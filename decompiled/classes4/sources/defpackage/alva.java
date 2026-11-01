package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alva implements defpackage.allg {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor");
    private final defpackage.alvg b;
    private final defpackage.allj c;
    private defpackage.alvz d;
    private alln e;
    private java.util.List f;
    private boolean g;
    private int h;
    private int i;

    public alva(defpackage.alvg alvgVar, defpackage.alli alliVar) {
        aooh.f(alvgVar, "stateManager");
        aooh.f(alliVar, "publisherFactory");
        this.b = alvgVar;
        this.c = alliVar.a("AGENTIC_CALL_SCREEN_QUICK_REPLY");
        this.f = aokc.a;
        this.h = 1;
        this.i = 1;
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarT = aihd.t(defpackage.alnb.EVENT_FLOW_OUTPUT, defpackage.alnb.EVENT_QUICK_REPLY_CHIP_CLICKED, defpackage.alnb.EVENT_START_CONVERSATION, defpackage.alnb.EVENT_SELECTED_OPTION);
        aooh.e(aihdVarT, "of(...)");
        return aihdVarT;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x04c0  */
    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        int i;
        defpackage.amgz amgzVarD;
        int i2;
        boolean z;
        char c;
        defpackage.amgz amgzVarD2;
        aooh.f(almyVar, "event");
        if (this.b.c != defpackage.alvd.j) {
            defpackage.almz almzVar = almyVar.h;
            if (almzVar == null) {
                almzVar = defpackage.almz.a;
            }
            defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
            if (alnbVarB == null) {
                alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
            }
            int iOrdinal = alnbVarB.ordinal();
            boolean z2 = true;
            char c2 = 2;
            if (iOrdinal == 4) {
                int i3 = 1;
                defpackage.almz almzVar2 = almyVar.h;
                if (almzVar2 == null) {
                    almzVar2 = defpackage.almz.a;
                }
                apdi apdiVar = defpackage.alnf.k;
                aooh.e(apdiVar, "flowOutputEvent");
                defpackage.alsy alsyVarB = defpackage.alsy.b(((defpackage.alnf) akmr.x(almzVar2, apdiVar)).g);
                if (alsyVarB == null) {
                    alsyVarB = defpackage.alsy.NO_ACTION;
                }
                if (alsyVarB == defpackage.alsy.START_RINGING) {
                    aimz aimzVar = a;
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "generateQuickReplies", 191, "AgenticCallScreenQuickReplyProcessor.kt").v("AgenticQuickReplyProcessor: Generating quick replies for user UI.");
                    if (this.h != 2) {
                        aimzVar.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "generateQuickReplies", 193, "AgenticCallScreenQuickReplyProcessor.kt").v("Quick reply mode is not set to FIXED_INTENTS or not enabled.");
                        return;
                    }
                    if (this.f.isEmpty()) {
                        aimzVar.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "generateQuickReplies", 198, "AgenticCallScreenQuickReplyProcessor.kt").v("No fixed quick reply intents found.");
                        return;
                    }
                    akzx akzxVarM = defpackage.alsl.a.m();
                    aooh.f(akzxVarM, "builder");
                    for (java.lang.String str : this.f) {
                        try {
                            alln allnVar = this.e;
                            if (allnVar != null && (amgzVarD = allnVar.d(str)) != null) {
                                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.alsl) akzxVarM.b).b);
                                aooh.e(listUnmodifiableList, "getQuickReplyChipsList(...)");
                                new alct(listUnmodifiableList);
                                akzx akzxVarM2 = defpackage.alsj.a.m();
                                aooh.f(akzxVarM2, "builder");
                                aooh.f(str, "value");
                                akzxVarM2.u();
                                defpackage.alsj alsjVar = (defpackage.alsj) akzxVarM2.b;
                                j$.util.Objects.requireNonNull(str);
                                alsjVar.b |= 1;
                                alsjVar.c = str;
                                java.lang.String str2 = amgzVarD.l;
                                aooh.e(str2, "getDisplayName(...)");
                                aooh.f(str2, "value");
                                akzxVarM2.u();
                                defpackage.alsj alsjVar2 = (defpackage.alsj) akzxVarM2.b;
                                j$.util.Objects.requireNonNull(str2);
                                alsjVar2.b |= 2;
                                alsjVar2.d = str2;
                                defpackage.alsy alsyVarB2 = defpackage.alsy.b(amgzVarD.n);
                                if (alsyVarB2 == null) {
                                    alsyVarB2 = defpackage.alsy.NO_ACTION;
                                }
                                int iOrdinal2 = alsyVarB2.ordinal();
                                i = i3;
                                if (iOrdinal2 == i) {
                                    i2 = 4;
                                } else if (iOrdinal2 == 3) {
                                    i2 = 2;
                                } else if (iOrdinal2 != 6) {
                                    i2 = i;
                                } else {
                                    i2 = 4;
                                }
                                try {
                                    akzxVarM2.u();
                                    defpackage.alsj alsjVar3 = (defpackage.alsj) akzxVarM2.b;
                                    alsjVar3.e = i2 - 1;
                                    alsjVar3.b |= 4;
                                    alad aladVarP = akzxVarM2.p();
                                    aooh.e(aladVarP, "build(...)");
                                    defpackage.alsj alsjVar4 = (defpackage.alsj) aladVarP;
                                    aooh.f(alsjVar4, "value");
                                    akzxVarM.u();
                                    defpackage.alsl alslVar = (defpackage.alsl) akzxVarM.b;
                                    j$.util.Objects.requireNonNull(alsjVar4);
                                    alslVar.b();
                                    alslVar.b.add(alsjVar4);
                                } catch (java.lang.IllegalArgumentException e) {
                                    e = e;
                                    a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "generateQuickReplies$<anonymous>", 215, "AgenticCallScreenQuickReplyProcessor.kt").y("Intent %s not found in spec, skipping quick reply.", str);
                                }
                                i3 = i;
                            }
                        } catch (java.lang.IllegalArgumentException e2) {
                            e = e2;
                            i = i3;
                        }
                    }
                    alad aladVarP2 = akzxVarM.p();
                    aooh.e(aladVarP2, "build(...)");
                    xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
                    xtqVarO.ah(defpackage.alnb.EVENT_QUICK_REPLY_CHIPS_READY);
                    apdi apdiVar2 = defpackage.alog.b;
                    aooh.e(apdiVar2, "quickReplyChipsReadyEvent");
                    xtqVarO.ax(apdiVar2, (defpackage.alsl) aladVarP2);
                    this.c.a(xtqVarO.ag(), almyVar);
                    return;
                }
                return;
            }
            if (iOrdinal == 9) {
                aimz aimzVar2 = a;
                aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "generateSuggestedReplies", 229, "AgenticCallScreenQuickReplyProcessor.kt").v("AgenticQuickReplyProcessor: Generating suggested replies for in-call UI.");
                if (this.i == 1) {
                    aimzVar2.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "generateSuggestedReplies", 231, "AgenticCallScreenQuickReplyProcessor.kt").v("Smart reply mode is disabled.");
                    return;
                }
                if (this.f.isEmpty()) {
                    aimzVar2.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "generateSuggestedReplies", 236, "AgenticCallScreenQuickReplyProcessor.kt").v("No fixed quick reply intents found.");
                    return;
                }
                vaa vaaVarC = airh.C(defpackage.alyf.a.m());
                for (java.lang.String str3 : this.f) {
                    try {
                        alln allnVar2 = this.e;
                        if (allnVar2 != null && (amgzVarD2 = allnVar2.d(str3)) != null) {
                            z = z2;
                            try {
                                java.lang.Object obj = vaaVarC.a;
                                c = c2;
                                try {
                                    java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.alyf) ((akzx) obj).b).c);
                                    aooh.e(listUnmodifiableList2, "getOptionsList(...)");
                                    new alct(listUnmodifiableList2);
                                    akzx akzxVarM3 = defpackage.alxf.a.m();
                                    aooh.f(akzxVarM3, "builder");
                                    aooh.f(str3, "value");
                                    akzxVarM3.u();
                                    defpackage.alxf alxfVar = (defpackage.alxf) akzxVarM3.b;
                                    j$.util.Objects.requireNonNull(str3);
                                    alxfVar.c = 4;
                                    alxfVar.d = str3;
                                    java.lang.String str4 = amgzVarD2.l;
                                    aooh.e(str4, "getDisplayName(...)");
                                    aooh.f(str4, "value");
                                    akzxVarM3.u();
                                    defpackage.alxf alxfVar2 = (defpackage.alxf) akzxVarM3.b;
                                    j$.util.Objects.requireNonNull(str4);
                                    vaaVarC = vaaVarC;
                                    try {
                                        alxfVar2.b |= 1;
                                        alxfVar2.e = str4;
                                        defpackage.alsy alsyVarB3 = defpackage.alsy.b(amgzVarD2.n);
                                        if (alsyVarB3 == null) {
                                            alsyVarB3 = defpackage.alsy.NO_ACTION;
                                        }
                                        akzxVarM3.u();
                                        defpackage.alxf alxfVar3 = (defpackage.alxf) akzxVarM3.b;
                                        alxfVar3.f = alsyVarB3.j;
                                        alxfVar3.b |= 2;
                                        akzxVarM3.u();
                                        defpackage.alxf alxfVar4 = (defpackage.alxf) akzxVarM3.b;
                                        alxfVar4.g = 4;
                                        alxfVar4.b |= 4;
                                        alad aladVarP3 = akzxVarM3.p();
                                        aooh.e(aladVarP3, "build(...)");
                                        defpackage.alxf alxfVar5 = (defpackage.alxf) aladVarP3;
                                        aooh.f(alxfVar5, "value");
                                        ((akzx) obj).u();
                                        defpackage.alyf alyfVar = (defpackage.alyf) ((akzx) obj).b;
                                        j$.util.Objects.requireNonNull(alxfVar5);
                                        alyfVar.b();
                                        alyfVar.c.add(alxfVar5);
                                    } catch (java.lang.IllegalArgumentException e3) {
                                        e = e3;
                                        a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "generateSuggestedReplies$<anonymous>", 254, "AgenticCallScreenQuickReplyProcessor.kt").y("Intent %s not found in spec, skipping suggested reply.", str3);
                                    }
                                } catch (java.lang.IllegalArgumentException e4) {
                                    e = e4;
                                    vaaVarC = vaaVarC;
                                }
                            } catch (java.lang.IllegalArgumentException e5) {
                                e = e5;
                                c = c2;
                                a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "generateSuggestedReplies$<anonymous>", 254, "AgenticCallScreenQuickReplyProcessor.kt").y("Intent %s not found in spec, skipping suggested reply.", str3);
                                z2 = z;
                                c2 = c;
                                vaaVarC = vaaVarC;
                            }
                            z2 = z;
                            c2 = c;
                            vaaVarC = vaaVarC;
                        }
                    } catch (java.lang.IllegalArgumentException e6) {
                        e = e6;
                        z = z2;
                    }
                }
                defpackage.alyf alyfVarAv = vaaVarC.av();
                xtq xtqVarO2 = defpackage.alpv.o(defpackage.almz.a.m());
                xtqVarO2.ah(defpackage.alnb.EVENT_SMART_REPLY_OPTIONS);
                apdi apdiVar3 = defpackage.aloz.b;
                aooh.e(apdiVar3, "suggestSmartRepliesEvent");
                xtqVarO2.ax(apdiVar3, alyfVarAv);
                this.c.a(xtqVarO2.ag(), almyVar);
                return;
            }
            if (iOrdinal == 35) {
                aimz aimzVar3 = a;
                aimzVar3.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "handleQuickReplyClick", 149, "AgenticCallScreenQuickReplyProcessor.kt").v("AgenticQuickReplyProcessor: Quick reply chip clicked.");
                defpackage.almz almzVar3 = almyVar.h;
                if (almzVar3 == null) {
                    almzVar3 = defpackage.almz.a;
                }
                apdi apdiVar4 = defpackage.alof.b;
                aooh.e(apdiVar4, "quickReplyChipClickedEvent");
                if (!akmr.y(almzVar3, apdiVar4)) {
                    aimzVar3.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "handleQuickReplyClick", 152, "AgenticCallScreenQuickReplyProcessor.kt").v("QuickReplyChipClickedEvent extension missing.");
                    return;
                }
                defpackage.almz almzVar4 = almyVar.h;
                if (almzVar4 == null) {
                    almzVar4 = defpackage.almz.a;
                }
                aooh.e(apdiVar4, "quickReplyChipClickedEvent");
                java.lang.String str5 = ((defpackage.alsk) akmr.x(almzVar4, apdiVar4)).c;
                aooh.e(str5, "getReplyChipClickedContentId(...)");
                alln allnVar3 = this.e;
                defpackage.alsy alsyVarC = allnVar3 != null ? allnVar3.c(str5) : null;
                if (alsyVarC == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                if (alsyVarC != defpackage.alsy.START_TAKING_MESSAGE) {
                    xtq xtqVarN = defpackage.alpv.n(defpackage.alnf.a.m());
                    xtqVarN.af(defpackage.alsz.USER);
                    xtq xtqVarP = defpackage.alpv.p(defpackage.almm.a.m());
                    xtqVarP.aj(str5);
                    xtqVarN.ad(xtqVarP.ai());
                    xtqVarN.ae(alsyVarC);
                    defpackage.alnf alnfVarAc = xtqVarN.ac();
                    defpackage.alvg alvgVar = this.b;
                    int iOrdinal3 = alsyVarC.ordinal();
                    alvgVar.k(iOrdinal3 != 2 ? iOrdinal3 != 3 ? defpackage.alvd.c : defpackage.alvd.f : defpackage.alvd.e);
                    defpackage.almz almzVar5 = defpackage.almz.a;
                    xtq xtqVarO3 = defpackage.alpv.o(almzVar5.m());
                    xtqVarO3.ah(defpackage.alnb.EVENT_FLOW_OUTPUT);
                    apdi apdiVar5 = defpackage.alnf.k;
                    aooh.e(apdiVar5, "flowOutputEvent");
                    xtqVarO3.ax(apdiVar5, alnfVarAc);
                    defpackage.almz almzVarAg = xtqVarO3.ag();
                    defpackage.allj alljVar = this.c;
                    alljVar.a(almzVarAg, almyVar);
                    xtq xtqVarO4 = defpackage.alpv.o(almzVar5.m());
                    xtqVarO4.ah(defpackage.alnb.EVENT_CONTINUE_TRANSCRIBING);
                    alljVar.a(xtqVarO4.ag(), almyVar);
                    return;
                }
                return;
            }
            if (iOrdinal == 48) {
                aimz aimzVar4 = a;
                aimzVar4.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "handleSelectedOptionClick", 268, "AgenticCallScreenQuickReplyProcessor.kt").v("AgenticQuickReplyProcessor: Suggested reply chip clicked.");
                defpackage.almz almzVar6 = almyVar.h;
                if (almzVar6 == null) {
                    almzVar6 = defpackage.almz.a;
                }
                apdi apdiVar6 = defpackage.aloo.e;
                aooh.e(apdiVar6, "selectedOptionEvent");
                if (!akmr.y(almzVar6, apdiVar6)) {
                    aimzVar4.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "handleSelectedOptionClick", 270, "AgenticCallScreenQuickReplyProcessor.kt").v("SelectedOptionEvent extension missing.");
                    return;
                }
                defpackage.almz almzVar7 = almyVar.h;
                if (almzVar7 == null) {
                    almzVar7 = defpackage.almz.a;
                }
                aooh.e(apdiVar6, "selectedOptionEvent");
                defpackage.aloo alooVar = (defpackage.aloo) akmr.x(almzVar7, apdiVar6);
                int i4 = alooVar.b;
                java.lang.String str6 = "";
                if ((i4 & 1) != 0) {
                    defpackage.alxf alxfVar6 = alooVar.c;
                    if (alxfVar6 == null) {
                        alxfVar6 = defpackage.alxf.a;
                    }
                    if (alxfVar6.c == 4) {
                        str6 = (java.lang.String) alxfVar6.d;
                    }
                } else if ((i4 & 2) != 0) {
                    int i5 = (int) alooVar.d;
                    if (i5 < 0 || i5 >= this.f.size()) {
                        aimzVar4.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "handleSelectedOptionClick", 283, "AgenticCallScreenQuickReplyProcessor.kt").w("Received invalid suggested reply index: %d", i5);
                    } else {
                        str6 = (java.lang.String) this.f.get(i5);
                    }
                }
                aooh.c(str6);
                if (str6.length() == 0) {
                    aimzVar4.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenQuickReplyProcessor", "handleSelectedOptionClick", 291, "AgenticCallScreenQuickReplyProcessor.kt").v("Selected option has empty botIntentName or invalid suggestedReplyId.");
                    return;
                }
                alln allnVar4 = this.e;
                defpackage.alsy alsyVarC2 = allnVar4 != null ? allnVar4.c(str6) : null;
                if (alsyVarC2 == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                if (alsyVarC2 != defpackage.alsy.START_TAKING_MESSAGE) {
                    xtq xtqVarN2 = defpackage.alpv.n(defpackage.alnf.a.m());
                    xtqVarN2.af(defpackage.alsz.USER);
                    xtq xtqVarP2 = defpackage.alpv.p(defpackage.almm.a.m());
                    xtqVarP2.aj(str6);
                    xtqVarN2.ad(xtqVarP2.ai());
                    xtqVarN2.ae(alsyVarC2);
                    defpackage.alnf alnfVarAc2 = xtqVarN2.ac();
                    defpackage.alvg alvgVar2 = this.b;
                    int iOrdinal4 = alsyVarC2.ordinal();
                    alvgVar2.k(iOrdinal4 != 2 ? iOrdinal4 != 3 ? defpackage.alvd.c : defpackage.alvd.f : defpackage.alvd.e);
                    defpackage.almz almzVar8 = defpackage.almz.a;
                    xtq xtqVarO5 = defpackage.alpv.o(almzVar8.m());
                    xtqVarO5.ah(defpackage.alnb.EVENT_FLOW_OUTPUT);
                    apdi apdiVar7 = defpackage.alnf.k;
                    aooh.e(apdiVar7, "flowOutputEvent");
                    xtqVarO5.ax(apdiVar7, alnfVarAc2);
                    defpackage.almz almzVarAg2 = xtqVarO5.ag();
                    defpackage.allj alljVar2 = this.c;
                    alljVar2.a(almzVarAg2, almyVar);
                    xtq xtqVarO6 = defpackage.alpv.o(almzVar8.m());
                    xtqVarO6.ah(defpackage.alnb.EVENT_CONTINUE_TRANSCRIBING);
                    alljVar2.a(xtqVarO6.ag(), almyVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        defpackage.alxd alxdVarT;
        alat alatVar;
        int iAe;
        aooh.f(alqhVar, "callContext");
        aooh.f(alqkVar, "conversationContext");
        aooh.f(almbVar, "assetConfig");
        aooh.f(almlVar, "botConfig");
        aooh.f(alkfVar, "experimentChecker");
        apdi apdiVar = defpackage.alvz.p;
        aooh.e(apdiVar, "agenticBotConfig");
        this.d = (defpackage.alvz) akmr.x(almlVar, apdiVar);
        if (this.e == null) {
            this.e = alln.g(alqdVar, almbVar.f, alkfVar);
        }
        this.h = 1;
        this.i = 1;
        apdi apdiVar2 = defpackage.alwn.r;
        aooh.e(apdiVar2, "callAssistantConversationContext");
        defpackage.alwn alwnVar = (defpackage.alwn) akmr.x(alqkVar, apdiVar2);
        if (alwnVar != null && (alwnVar.b & 16) != 0) {
            defpackage.alxj alxjVar = alwnVar.e;
            if (alxjVar == null) {
                alxjVar = defpackage.alxj.a;
            }
            int iQ = airh.q(alxjVar.c);
            this.i = iQ != 0 ? iQ : 1;
        }
        aooh.e(apdiVar2, "callAssistantConversationContext");
        defpackage.alwn alwnVar2 = (defpackage.alwn) akmr.x(alqkVar, apdiVar2);
        defpackage.alxe alxeVarS = alwnVar2 != null ? airh.s(alwnVar2) : null;
        this.g = alxeVarS != null ? alxeVarS.h : false;
        defpackage.alvz alvzVar = this.d;
        if (alvzVar == null || (alxdVarT = airh.t(alvzVar)) == null) {
            return;
        }
        java.lang.String str = alqhVar.b;
        aooh.e(str, "getCalleeNumber(...)");
        if (this.g) {
            alat alatVar2 = alxdVarT.d;
            aooh.e(alatVar2, "getIntentsForManualScreeningList(...)");
            if (!alatVar2.isEmpty()) {
                alatVar = alxdVarT.d;
            } else if (str.length() == 0) {
                alatVar = alxdVarT.c;
            } else {
                alatVar = alxdVarT.b;
            }
        } else if (str.length() == 0) {
            alatVar = alxdVarT.c;
        } else {
            alatVar = alxdVarT.b;
        }
        aooh.c(alatVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
        java.util.Iterator it = alatVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.almm) it.next()).c);
        }
        this.f = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        aooh.e(apdiVar2, "callAssistantConversationContext");
        defpackage.alwn alwnVar3 = (defpackage.alwn) akmr.x(alqkVar, apdiVar2);
        if (alwnVar3 == null || (iAe = a.ae(alwnVar3.j)) == 0 || iAe != 2) {
            return;
        }
        this.h = 2;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
