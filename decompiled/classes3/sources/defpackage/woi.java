package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class woi implements defpackage.wot {
    private final /* synthetic */ int $cid;
    private java.lang.Object a;

    public woi(int i, char[] cArr) {
        this.$cid = i;
        defpackage.vqu vquVarE = wsc.e(defpackage.wpc.a.m());
        vquVarE.o(wsc.d(defpackage.woz.a.m()).m());
        this.a = vquVarE.n();
    }

    @Override // defpackage.wot
    public final defpackage.wos a(defpackage.wos wosVar) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(wosVar, "model");
            defpackage.vqf vqfVarP = wsc.P(wosVar.p());
            defpackage.vqu vquVarR = wsc.R(vqfVarP.f().p());
            java.lang.Object obj = this.a;
            aooh.f(obj, "value");
            akzx akzxVar = (akzx) vquVarR.a;
            akzxVar.u();
            ((defpackage.wpg) akzxVar.b).f = ((defpackage.wow) obj).a();
            vqfVarP.g(vquVarR.q());
            return vqfVarP.e();
        }
        if (i == 1) {
            aooh.f(wosVar, "model");
            defpackage.vqf vqfVarP2 = wsc.P(wosVar.p());
            defpackage.vqu vquVarR2 = wsc.R(vqfVarP2.f().p());
            java.lang.Object obj2 = this.a;
            aooh.f(obj2, "value");
            akzx akzxVar2 = (akzx) vquVarR2.a;
            akzxVar2.u();
            ((defpackage.wpg) akzxVar2.b).h = ((defpackage.wov) obj2).a();
            vqfVarP2.g(vquVarR2.q());
            return vqfVarP2.e();
        }
        if (i != 2) {
            aooh.f(wosVar, "model");
            defpackage.vqf vqfVarP3 = wsc.P(wosVar.p());
            defpackage.vqu vquVarR3 = wsc.R(vqfVarP3.f().p());
            java.lang.Object obj3 = this.a;
            aooh.f(obj3, "value");
            akzx akzxVar3 = (akzx) vquVarR3.a;
            akzxVar3.u();
            ((defpackage.wpg) akzxVar3.b).d = ((defpackage.wpd) obj3).a();
            vqfVarP3.g(vquVarR3.q());
            return vqfVarP3.e();
        }
        aooh.f(wosVar, "model");
        defpackage.vqf vqfVarP4 = wsc.P(wosVar.p());
        defpackage.vqu vquVarR4 = wsc.R(vqfVarP4.f().p());
        defpackage.vqu vquVarS = wsc.S(vquVarR4.p().p());
        java.lang.Object obj4 = this.a;
        aooh.f(obj4, "value");
        akzx akzxVar4 = (akzx) vquVarS.a;
        akzxVar4.u();
        defpackage.woy woyVar = (defpackage.woy) akzxVar4.b;
        j$.util.Objects.requireNonNull(obj4);
        woyVar.d = (defpackage.wpc) obj4;
        woyVar.b |= 1;
        vquVarR4.r(vquVarS.s());
        vqfVarP4.g(vquVarR4.q());
        return vqfVarP4.e();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    @Override // defpackage.wot
    public final void b(defpackage.wor worVar) {
        defpackage.wow wowVar;
        defpackage.wov wovVar;
        defpackage.wpc wpcVarN;
        defpackage.wpd wpdVar;
        int i = this.$cid;
        if (i == 0) {
            aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
            int iH = wsc.H(worVar.b);
            if (iH == 0) {
                throw null;
            }
            int i2 = iH - 1;
            if (i2 == 12) {
                wowVar = defpackage.wow.INTRO_FOR_IVR_DATA;
            } else {
                if (i2 != 13) {
                    throw new java.lang.IllegalStateException("Unsupported Action");
                }
                wowVar = defpackage.wow.INTRO_FOR_LIVE_TRANSCRIPTION;
            }
            this.a = wowVar;
            return;
        }
        if (i == 1) {
            aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
            int iH2 = wsc.H(worVar.b);
            if (iH2 == 0) {
                throw null;
            }
            switch (iH2 - 1) {
                case 22:
                    wovVar = defpackage.wov.AUTOMATIC_DISPLAY_OPT_OUT_SNACKBAR;
                    break;
                case 23:
                    wovVar = defpackage.wov.AUTOMATIC_DISPLAY_OPT_OUT_CONFIRMATION_SNACKBAR;
                    break;
                case 24:
                    wovVar = defpackage.wov.AUTOMATIC_DISPLAY_SNACKBAR_NONE;
                    break;
                default:
                    throw new java.lang.IllegalStateException("Unsupported Action");
            }
            this.a = wovVar;
            return;
        }
        if (i != 2) {
            aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
            int i3 = worVar.b;
            int iH3 = wsc.H(i3);
            if (iH3 == 0) {
                throw null;
            }
            int i4 = iH3 - 1;
            if (i4 == 6) {
                wpdVar = defpackage.wpd.PROMPT_NONE;
            } else if (i4 == 8) {
                defpackage.wns wnsVar = i3 == 10 ? (defpackage.wns) worVar.c : defpackage.wns.a;
                aooh.e(wnsVar, "getShowAddonFeatureWaitingToActivatePrompt(...)");
                defpackage.wha whaVarB = defpackage.wha.b(wnsVar.c);
                if (whaVarB == null) {
                    whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
                }
                if (whaVarB.ordinal() != 1) {
                    throw new java.lang.IllegalStateException("Unsupported addon feature key");
                }
                wpdVar = defpackage.wpd.HOLD_FOR_ME_WAITING_TO_ACTIVATE;
            } else if (i4 != 9) {
                switch (i4) {
                    case 15:
                        wpdVar = defpackage.wpd.LOW_QUALITY_TRANSCRIPT;
                        break;
                    case 16:
                        wpdVar = defpackage.wpd.AUDIO_ERROR;
                        break;
                    case 17:
                        wpdVar = defpackage.wpd.PROMPT_NONE;
                        break;
                    case 18:
                        wpdVar = defpackage.wpd.HUMAN_AGENT_DETECTED;
                        break;
                    case 19:
                        wpdVar = defpackage.wpd.CONNECTING_TO_HUMAN_AGENT;
                        break;
                    case 20:
                        wpdVar = defpackage.wpd.HOLD_DETECTED;
                        break;
                    case 21:
                        wpdVar = defpackage.wpd.PIPELINE_ERROR;
                        break;
                    default:
                        throw new java.lang.IllegalStateException("Unsupported Action");
                }
            } else {
                wpdVar = defpackage.wpd.PROMPT_NONE;
            }
            this.a = wpdVar;
            return;
        }
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        int iH4 = wsc.H(worVar.b);
        if (iH4 == 0) {
            throw null;
        }
        int i5 = iH4 - 1;
        if (i5 == 2) {
            defpackage.vqu vquVarE = wsc.e(defpackage.wpc.a.m());
            vquVarE.o(wsc.d(defpackage.woz.a.m()).m());
            wpcVarN = vquVarE.n();
        } else if (i5 == 3) {
            defpackage.vqu vquVarE2 = wsc.e(defpackage.wpc.a.m());
            akzx akzxVarM = defpackage.wpb.a.m();
            aooh.f(akzxVarM, "builder");
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.wpb wpbVar = (defpackage.wpb) aladVarP;
            aooh.f(wpbVar, "value");
            akzx akzxVar = (akzx) vquVarE2.a;
            akzxVar.u();
            defpackage.wpc wpcVar = (defpackage.wpc) akzxVar.b;
            j$.util.Objects.requireNonNull(wpbVar);
            wpcVar.c = wpbVar;
            wpcVar.b = 2;
            wpcVarN = vquVarE2.n();
        } else {
            if (i5 != 4) {
                throw new java.lang.IllegalStateException("Unsupported Action");
            }
            defpackage.vqu vquVarE3 = wsc.e(defpackage.wpc.a.m());
            akzx akzxVarM2 = defpackage.wpa.a.m();
            aooh.f(akzxVarM2, "builder");
            boolean z = (worVar.b == 5 ? (defpackage.wnx) worVar.c : defpackage.wnx.a).c;
            akzxVarM2.u();
            ((defpackage.wpa) akzxVarM2.b).b = z;
            alad aladVarP2 = akzxVarM2.p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.wpa wpaVar = (defpackage.wpa) aladVarP2;
            aooh.f(wpaVar, "value");
            akzx akzxVar2 = (akzx) vquVarE3.a;
            akzxVar2.u();
            defpackage.wpc wpcVar2 = (defpackage.wpc) akzxVar2.b;
            j$.util.Objects.requireNonNull(wpaVar);
            wpcVar2.c = wpaVar;
            wpcVar2.b = 3;
            wpcVarN = vquVarE3.n();
        }
        this.a = wpcVarN;
    }

    @Override // defpackage.wot
    public final int c(defpackage.wor worVar) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
            int iH = wsc.H(worVar.b);
            if (iH == 0) {
                throw null;
            }
            int i2 = iH - 1;
            if (i2 != 6) {
                if (i2 != 12) {
                    if (i2 != 13) {
                        return 1;
                    }
                    if (this.a != defpackage.wow.INTRO_FOR_LIVE_TRANSCRIPTION) {
                        return 2;
                    }
                } else if (this.a != defpackage.wow.INTRO_FOR_IVR_DATA) {
                    return 2;
                }
            }
        } else {
            if (i == 1) {
                aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
                int iH2 = wsc.H(worVar.b);
                if (iH2 == 0) {
                    throw null;
                }
                switch (iH2 - 1) {
                    case 22:
                    case 23:
                    case 24:
                        return 2;
                    default:
                        return 1;
                }
            }
            if (i != 2) {
                aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
                int i3 = worVar.b;
                int iH3 = wsc.H(i3);
                if (iH3 == 0) {
                    throw null;
                }
                int i4 = iH3 - 1;
                if (i4 != 6) {
                    if (i4 == 8) {
                        defpackage.wns wnsVar = i3 == 10 ? (defpackage.wns) worVar.c : defpackage.wns.a;
                        aooh.e(wnsVar, "getShowAddonFeatureWaitingToActivatePrompt(...)");
                        defpackage.wha whaVarB = defpackage.wha.b(wnsVar.c);
                        if (whaVarB == null) {
                            whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
                        }
                        if (whaVarB == defpackage.wha.ADDON_FEATURE_KEY_HOLD_FOR_ME && this.a != defpackage.wpd.HOLD_FOR_ME_WAITING_TO_ACTIVATE) {
                            return 2;
                        }
                    } else if (i4 != 9) {
                        switch (i4) {
                            case 15:
                                if (this.a != defpackage.wpd.LOW_QUALITY_TRANSCRIPT) {
                                    return 2;
                                }
                                break;
                            case 16:
                                if (this.a != defpackage.wpd.AUDIO_ERROR) {
                                    return 2;
                                }
                                break;
                            case 17:
                                if (this.a == defpackage.wpd.AUDIO_ERROR) {
                                    return 2;
                                }
                                break;
                            case 18:
                                if (this.a != defpackage.wpd.HUMAN_AGENT_DETECTED) {
                                    return 2;
                                }
                                break;
                            case 19:
                                if (this.a != defpackage.wpd.CONNECTING_TO_HUMAN_AGENT) {
                                    return 2;
                                }
                                break;
                            case 20:
                                if (this.a != defpackage.wpd.HOLD_DETECTED) {
                                    return 2;
                                }
                                break;
                            case 21:
                                if (this.a != defpackage.wpd.PIPELINE_ERROR) {
                                    return 2;
                                }
                                break;
                            default:
                                return 1;
                        }
                    } else {
                        defpackage.wnm wnmVar = i3 == 11 ? (defpackage.wnm) worVar.c : defpackage.wnm.a;
                        aooh.e(wnmVar, "getHideAddonFeatureWaitingToActivatePrompt(...)");
                        defpackage.wha whaVarB2 = defpackage.wha.b(wnmVar.c);
                        if (whaVarB2 == null) {
                            whaVarB2 = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
                        }
                        if (whaVarB2 == defpackage.wha.ADDON_FEATURE_KEY_HOLD_FOR_ME && this.a == defpackage.wpd.HOLD_FOR_ME_WAITING_TO_ACTIVATE) {
                            return 2;
                        }
                    }
                } else if (this.a != defpackage.wpd.PROMPT_NONE) {
                    return 2;
                }
            } else {
                aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
                int i5 = worVar.b;
                int iH4 = wsc.H(i5);
                if (iH4 == 0) {
                    throw null;
                }
                int i6 = iH4 - 1;
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            return 1;
                        }
                        defpackage.wnx wnxVar = i5 == 5 ? (defpackage.wnx) worVar.c : defpackage.wnx.a;
                        aooh.e(wnxVar, "getShowEducationHeader(...)");
                        defpackage.wpc wpcVar = (defpackage.wpc) this.a;
                        int i7 = wpcVar.b;
                        if (a.X(i7) != 3) {
                            return 2;
                        }
                        if ((i7 == 3 ? (defpackage.wpa) wpcVar.c : defpackage.wpa.a).b != wnxVar.c) {
                            return 2;
                        }
                    } else if (a.X(((defpackage.wpc) this.a).b) != 2) {
                        return 2;
                    }
                } else if (a.X(((defpackage.wpc) this.a).b) != 1) {
                    return 2;
                }
            }
        }
        return 3;
    }

    @Override // defpackage.wot
    public final void d(defpackage.wor worVar) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
            return;
        }
        if (i == 1) {
            aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        } else if (i != 2) {
            aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        } else {
            aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        }
    }

    public woi(int i, byte[] bArr) {
        this.$cid = i;
        this.a = defpackage.wov.AUTOMATIC_DISPLAY_SNACKBAR_NONE;
    }

    public woi(int i, short[] sArr) {
        this.$cid = i;
        this.a = defpackage.wpd.PROMPT_NONE;
    }

    public woi(int i) {
        this.$cid = i;
        this.a = defpackage.wow.CACHED_IVR_DATA_BANNER_NONE;
    }
}
