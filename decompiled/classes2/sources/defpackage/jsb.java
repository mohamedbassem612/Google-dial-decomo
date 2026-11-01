package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jsb implements defpackage.jye {
    private static final aimz a = aimz.i("com/android/dialer/calleridfeedback/impl/chip/CallerIdFeedbackChipIntegration");
    private final android.content.Context b;
    private final rlv c;
    private final rsr d;
    private final ipc e;

    public jsb(android.content.Context context, zjm zjmVar, rlv rlvVar, ipc ipcVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        this.b = context;
        this.c = rlvVar;
        this.e = ipcVar;
        j$.util.Optional optionalG = zjmVar.g();
        aooh.e(optionalG, "getFeature(...)");
        this.d = (rsr) aooh.q(optionalG);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int d(defpackage.jyd jydVar) {
        java.lang.String str = jydVar.b;
        if (str != null) {
            switch (str.hashCode()) {
                case -1139252176:
                    if (str.equals("caller_id_crowdsourcing_opt_in_chip")) {
                        return 5;
                    }
                    break;
                case 179490067:
                    if (str.equals("caller_tag_selector_chip")) {
                        return 4;
                    }
                    break;
                case 382315821:
                    if (str.equals("caller_tag_feedback_chip")) {
                        return 3;
                    }
                    break;
                case 1249559254:
                    if (str.equals("caller_id_feedback_chip")) {
                        return 2;
                    }
                    break;
            }
        }
        throw new java.lang.IllegalStateException("not a caller id feedback chip");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x009e  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x00ff  */
    @Override // defpackage.jye
    public final defpackage.jyd a(kiu kiuVar) {
        int i;
        defpackage.jyd jydVar;
        defpackage.jyd jydVar2;
        defpackage.kiw kiwVar;
        defpackage.kiw kiwVar2;
        defpackage.kiw kiwVar3;
        zag zagVar;
        zai zaiVar;
        java.lang.String languageTag;
        defpackage.kiw kiwVar4;
        zag zagVar2;
        defpackage.kiw kiwVar5;
        aooh.f(kiuVar, "row");
        rsr rsrVar = this.d;
        if (rsrVar == null) {
            return null;
        }
        if (kiuVar.G) {
            kit kitVarB = kit.b(kiuVar.v);
            if (kitVarB == null) {
                kitVarB = kit.a;
            }
            if (kitVarB == kit.d || kiuVar.g.isEmpty()) {
                i = 1;
            } else {
                defpackage.kiw kiwVar6 = kiuVar.r;
                if (kiwVar6 == null) {
                    kiwVar6 = defpackage.kiw.a;
                }
                if (kiwVar6.j || kiuVar.i != 1) {
                    i = 1;
                } else {
                    defpackage.kiw kiwVar7 = kiuVar.r;
                    if ((kiwVar7 == null ? defpackage.kiw.a : kiwVar7).r) {
                        i = 1;
                    } else {
                        if (kiwVar7 == null) {
                            kiwVar7 = defpackage.kiw.a;
                        }
                        rmt rmtVarB = rmt.b(kiwVar7.o);
                        if (rmtVarB == null) {
                            rmtVarB = rmt.a;
                        }
                        if ((defpackage.hhv.i(rmtVarB) || kaw.c(kiuVar)) && !kiuVar.s) {
                            i = 2;
                        } else if (!kaw.d(kiuVar)) {
                            defpackage.kiw kiwVar8 = kiuVar.r;
                            if (kiwVar8 == null) {
                                kiwVar8 = defpackage.kiw.a;
                            }
                            if (kiwVar8.w) {
                                i = 3;
                            } else if (kaw.d(kiuVar)) {
                                kiwVar = kiuVar.r;
                                if (kiwVar == null) {
                                    kiwVar2 = defpackage.kiw.a;
                                } else {
                                    kiwVar2 = kiwVar;
                                }
                                if (kiwVar2.A) {
                                    if (kiwVar == null) {
                                        kiwVar3 = defpackage.kiw.a;
                                    } else {
                                        kiwVar3 = kiwVar;
                                    }
                                    if (kiwVar3.B) {
                                        if (kiwVar == null) {
                                            kiwVar = defpackage.kiw.a;
                                        }
                                        zagVar = kiwVar.u;
                                        if (zagVar == null) {
                                            zagVar = zag.a;
                                        }
                                        zaiVar = zagVar.c;
                                        if (zaiVar == null) {
                                            zaiVar = zai.a;
                                        }
                                        if (zaiVar.equals(zai.a)) {
                                            languageTag = java.util.Locale.getDefault().toLanguageTag();
                                            kiwVar4 = kiuVar.r;
                                            if (kiwVar4 == null) {
                                                kiwVar4 = defpackage.kiw.a;
                                            }
                                            zagVar2 = kiwVar4.u;
                                            if (zagVar2 == null) {
                                                zagVar2 = zag.a;
                                            }
                                            if (!languageTag.equals(zagVar2.d)) {
                                                kiwVar5 = kiuVar.r;
                                                if (kiwVar5 == null) {
                                                    kiwVar5 = defpackage.kiw.a;
                                                }
                                                if (kiwVar5.y) {
                                                    i = 4;
                                                } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                                    i = 1;
                                                } else {
                                                    i = 1;
                                                }
                                            } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                                i = 1;
                                            } else {
                                                i = 1;
                                            }
                                        } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                            i = 1;
                                        } else {
                                            i = 1;
                                        }
                                    } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                        i = 1;
                                    } else {
                                        i = 1;
                                    }
                                } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                    i = 1;
                                } else {
                                    i = 1;
                                }
                            } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                        } else if (kaw.d(kiuVar)) {
                            kiwVar = kiuVar.r;
                            if (kiwVar == null) {
                                kiwVar2 = defpackage.kiw.a;
                            } else {
                                kiwVar2 = kiwVar;
                            }
                            if (kiwVar2.A) {
                                if (kiwVar == null) {
                                    kiwVar3 = defpackage.kiw.a;
                                } else {
                                    kiwVar3 = kiwVar;
                                }
                                if (kiwVar3.B) {
                                    if (kiwVar == null) {
                                        kiwVar = defpackage.kiw.a;
                                    }
                                    zagVar = kiwVar.u;
                                    if (zagVar == null) {
                                        zagVar = zag.a;
                                    }
                                    zaiVar = zagVar.c;
                                    if (zaiVar == null) {
                                        zaiVar = zai.a;
                                    }
                                    if (zaiVar.equals(zai.a)) {
                                        languageTag = java.util.Locale.getDefault().toLanguageTag();
                                        kiwVar4 = kiuVar.r;
                                        if (kiwVar4 == null) {
                                            kiwVar4 = defpackage.kiw.a;
                                        }
                                        zagVar2 = kiwVar4.u;
                                        if (zagVar2 == null) {
                                            zagVar2 = zag.a;
                                        }
                                        if (!languageTag.equals(zagVar2.d)) {
                                            kiwVar5 = kiuVar.r;
                                            if (kiwVar5 == null) {
                                                kiwVar5 = defpackage.kiw.a;
                                            }
                                            if (kiwVar5.y) {
                                                i = 4;
                                            } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                                i = 1;
                                            } else {
                                                i = 1;
                                            }
                                        } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                            i = 1;
                                        } else {
                                            i = 1;
                                        }
                                    } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                        i = 1;
                                    } else {
                                        i = 1;
                                    }
                                } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                    i = 1;
                                } else {
                                    i = 1;
                                }
                            } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar)) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                        } else if (((tkl) ((kaw) rsrVar.b).a).u(kiuVar) || kiuVar.s) {
                            i = 1;
                        } else {
                            defpackage.kiw kiwVar9 = kiuVar.r;
                            if (kiwVar9 == null) {
                                kiwVar9 = defpackage.kiw.a;
                            }
                            i = 5;
                            if ((!kiwVar9.z || kaw.d(kiuVar)) && !kaw.c(kiuVar)) {
                                i = 1;
                            }
                        }
                    }
                }
            }
        } else {
            i = 1;
        }
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                java.lang.CharSequence text = this.b.getText(((kaw) rsrVar.a).b());
                java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[1];
                defpackage.kiw kiwVar10 = kiuVar.r;
                if (kiwVar10 == null) {
                    kiwVar10 = defpackage.kiw.a;
                }
                zag zagVar3 = kiwVar10.u;
                if (zagVar3 == null) {
                    zagVar3 = zag.a;
                }
                zai zaiVar2 = zagVar3.c;
                if (zaiVar2 == null) {
                    zaiVar2 = zai.a;
                }
                charSequenceArr[0] = zaiVar2.d;
                java.lang.CharSequence charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(text, charSequenceArr);
                aooh.e(charSequenceExpandTemplate, "expandTemplate(...)");
                jydVar2 = new defpackage.jyd(2131231682, new defpackage.jyj(charSequenceExpandTemplate), "caller_tag_feedback_chip", null, defpackage.abja.bO, 1);
            } else if (i2 == 3) {
                java.lang.CharSequence text2 = this.b.getText(((kaw) rsrVar.a).b());
                java.lang.CharSequence[] charSequenceArr2 = new java.lang.CharSequence[1];
                defpackage.kiw kiwVar11 = kiuVar.r;
                if (kiwVar11 == null) {
                    kiwVar11 = defpackage.kiw.a;
                }
                zag zagVar4 = kiwVar11.u;
                if (zagVar4 == null) {
                    zagVar4 = zag.a;
                }
                zai zaiVar3 = zagVar4.c;
                if (zaiVar3 == null) {
                    zaiVar3 = zai.a;
                }
                charSequenceArr2[0] = zaiVar3.d;
                java.lang.CharSequence charSequenceExpandTemplate2 = android.text.TextUtils.expandTemplate(text2, charSequenceArr2);
                aooh.e(charSequenceExpandTemplate2, "expandTemplate(...)");
                jydVar2 = new defpackage.jyd(2131231682, new defpackage.jyj(charSequenceExpandTemplate2), "caller_tag_selector_chip", null, defpackage.abja.bO, 1);
            } else {
                if (i2 != 4) {
                    return null;
                }
                jydVar = new defpackage.jyd(2131231680, new defpackage.jyk(((kaw) rsrVar.a).b()), "caller_id_crowdsourcing_opt_in_chip", null, defpackage.abja.fZ, 1);
            }
            return jydVar2;
        }
        jydVar = new defpackage.jyd(2131231680, new defpackage.jyk(((kaw) rsrVar.a).b()), "caller_id_feedback_chip", null, defpackage.abja.fZ, 1);
        return jydVar;
    }

    @Override // defpackage.jye
    public final void b(defpackage.jyg jygVar) {
        if (this.d == null) {
            throw new java.lang.IllegalStateException("CallerIdFeedbackChipIntegration#onClick called when CallerIdFeedback is null");
        }
        int iD = d(jygVar.b) - 1;
        if (iD == 1) {
            a.b().l("com/android/dialer/calleridfeedback/impl/chip/CallerIdFeedbackChipIntegration", "callerIdFeedbackOnClick", 121, "CallerIdFeedbackChipIntegration.kt").v("clicked");
            this.c.o(rmx.ew);
            rsr.al(defpackage.hhv.j(jygVar.a, 2, 2131428497)).r(jygVar.c.a(), "caller_id_feedback_dialog_fragment");
            return;
        }
        if (iD == 2) {
            a.b().l("com/android/dialer/calleridfeedback/impl/chip/CallerIdFeedbackChipIntegration", "callerTagFeedbackOnClick", 157, "CallerIdFeedbackChipIntegration.kt").v("clicked");
            this.c.o(rmx.fb);
            rsr.an(defpackage.hhv.j(jygVar.a, 2, 2131428497)).r(jygVar.c.a(), "caller_tag_feedback_dialog_fragment");
            return;
        }
        aimz aimzVar = a;
        if (iD == 3) {
            aimzVar.b().l("com/android/dialer/calleridfeedback/impl/chip/CallerIdFeedbackChipIntegration", "callerTagSelectorOnClick", 193, "CallerIdFeedbackChipIntegration.kt").v("clicked");
            this.c.o(rmx.fg);
            rsr.ao(defpackage.hhv.j(jygVar.a, 2, 2131428497)).r(jygVar.c.a(), "caller_tag_selector_dialog_fragment");
            return;
        }
        aimzVar.b().l("com/android/dialer/calleridfeedback/impl/chip/CallerIdFeedbackChipIntegration", "callerCrowdsourcingOptInOnClick", 223, "CallerIdFeedbackChipIntegration.kt").v("clicked");
        this.c.o(rmx.ey);
        defpackage.jrz jrzVarAk = rsr.ak(defpackage.hhv.j(jygVar.a, 2, 2131428497));
        defpackage.jua juaVar = new defpackage.jua();
        amxr.g(juaVar);
        ahgl.b(juaVar, jrzVarAk);
        juaVar.r(jygVar.c.a(), "caller_id_feedback_dialog_fragment");
    }

    @Override // defpackage.jye
    public final java.lang.Object c(defpackage.jyd jydVar) {
        int iD = d(jydVar) - 1;
        if (iD == 1) {
            this.c.o(rmx.et);
        } else if (iD == 2) {
            this.e.bm(rmu.D);
            this.c.o(rmx.eY);
        } else if (iD != 3) {
            this.c.o(rmx.ex);
        } else {
            this.e.bm(rmu.E);
            this.c.o(rmx.ff);
        }
        return aojh.a;
    }
}
