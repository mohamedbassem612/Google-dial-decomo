package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hnc implements defpackage.xu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ hnc(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.xu
    public final void onClick() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.String str = ((upl) this.b).c;
            aooh.e(str, "getNumber(...)");
            java.lang.Object obj = this.a;
            ahok ahokVarF = ((defpackage.hnd) obj).h.f(29, "FavoritesNumberPickerScreen.onNumberClicked");
            try {
                ((defpackage.hnd) obj).j.i((java.lang.String) null).b(mce.fT);
                ahoq ahoqVarW = ahvr.W(30, "FavoritesNumberPickerScreen_placeCall");
                try {
                    ((defpackage.hnd) obj).i.o(rmx.qA);
                    defpackage.hqe hqeVar = ((defpackage.hnd) obj).g;
                    defpackage.tt ttVar = ((defpackage.hnd) obj).f;
                    com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA = defpackage.jwz.a();
                    callIntent$BuilderA.y(str);
                    callIntent$BuilderA.z(32);
                    hqeVar.a(ttVar, callIntent$BuilderA);
                    ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                    ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahoqVarW, th);
                        throw th2;
                    }
                }
            } catch (java.lang.Throwable th3) {
                try {
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    ajsz.ak(ahokVarF, th3);
                    throw th4;
                }
            }
        }
        if (i == 1) {
            java.lang.String str2 = ((defpackage.hmu) this.b).c;
            java.lang.Object obj2 = this.a;
            ahok ahokVarF2 = ((defpackage.hmi) obj2).h.f(21, "ContactNumberScreen.onNumberClicked");
            try {
                ((defpackage.hmi) obj2).j.i((java.lang.String) null).b(mce.gh);
                ahoq ahoqVarW2 = ahvr.W(22, "ContactNumberScreen_placeCall");
                try {
                    ((defpackage.hmi) obj2).i.o(rmx.qD);
                    defpackage.hqe hqeVar2 = ((defpackage.hmi) obj2).g;
                    defpackage.tt ttVar2 = ((defpackage.hmi) obj2).f;
                    com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA2 = defpackage.jwz.a();
                    callIntent$BuilderA2.y(str2);
                    callIntent$BuilderA2.z(30);
                    hqeVar2.a(ttVar2, callIntent$BuilderA2);
                    ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                    ajsz.ak(ahokVarF2, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th5) {
                    try {
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        ajsz.ak(ahoqVarW2, th5);
                        throw th6;
                    }
                }
            } catch (java.lang.Throwable th7) {
                try {
                    throw th7;
                } catch (java.lang.Throwable th8) {
                    ajsz.ak(ahokVarF2, th7);
                    throw th8;
                }
            }
        }
        if (i == 2) {
            java.lang.Object obj3 = this.a;
            ahpz ahpzVar = ((defpackage.hod) obj3).e;
            defpackage.hol holVar = (defpackage.hol) this.b;
            qtx qtxVar = holVar.m;
            ahok ahokVarF3 = ahpzVar.f(56, "CarInCallTemplateConverter.swapCallButtonClicked");
            try {
                boolean zBooleanValue = ((java.lang.Boolean) ((defpackage.hod) obj3).f.a()).booleanValue();
                java.lang.String str3 = holVar.a;
                if (zBooleanValue) {
                    try {
                        ahoq ahoqVarW3 = ahvr.W(59, "CarInCallTemplateConverter_onSwapCallButtonClicked_onButtonClicked");
                        try {
                            if (qtxVar == null) {
                                throw new java.lang.IllegalStateException("BUTTON_SWAP listener not injected to CallScopeComponent");
                            }
                            qtxVar.a();
                            ajsz.ak(ahoqVarW3, (java.lang.Throwable) null);
                            ahoq ahoqVarW4 = ahvr.W(60, "CarInCallTemplateConverter_onSwapCallButtonClicked_logImpression");
                            try {
                                qbe qbeVarG = ((defpackage.hod) obj3).g(str3);
                                if (qbeVarG != null) {
                                    qbeVarG.a(qbc.mt);
                                }
                                ajsz.ak(ahoqVarW4, (java.lang.Throwable) null);
                            } catch (java.lang.Throwable th9) {
                                try {
                                    throw th9;
                                } catch (java.lang.Throwable th10) {
                                    ajsz.ak(ahoqVarW4, th9);
                                    throw th10;
                                }
                            }
                        } catch (java.lang.Throwable th11) {
                            try {
                                throw th11;
                            } catch (java.lang.Throwable th12) {
                                ajsz.ak(ahoqVarW3, th11);
                                throw th12;
                            }
                        }
                    } catch (java.lang.Throwable th13) {
                        ahoq ahoqVarW5 = ahvr.W(61, "CarInCallTemplateConverter_onSwapCallButtonClicked_logImpression");
                        try {
                            qbe qbeVarG2 = ((defpackage.hod) obj3).g(str3);
                            if (qbeVarG2 != null) {
                                qbeVarG2.a(qbc.mt);
                            }
                            ajsz.ak(ahoqVarW5, (java.lang.Throwable) null);
                            throw th13;
                        } catch (java.lang.Throwable th14) {
                            try {
                                throw th14;
                            } catch (java.lang.Throwable th15) {
                                ajsz.ak(ahoqVarW5, th14);
                                throw th15;
                            }
                        }
                    }
                } else {
                    ahoq ahoqVarW6 = ahvr.W(57, "CarInCallTemplateConverter_onSwapCallButtonClicked_logImpression");
                    try {
                        qbe qbeVarG3 = ((defpackage.hod) obj3).g(str3);
                        if (qbeVarG3 != null) {
                            qbeVarG3.a(qbc.mt);
                        }
                        ajsz.ak(ahoqVarW6, (java.lang.Throwable) null);
                        ahoq ahoqVarW7 = ahvr.W(58, "CarInCallTemplateConverter_onSwapCallButtonClicked_onButtonClicked");
                        try {
                            if (qtxVar == null) {
                                throw new java.lang.IllegalStateException("BUTTON_SWAP listener not injected to CallScopeComponent");
                            }
                            qtxVar.a();
                            ajsz.ak(ahoqVarW7, (java.lang.Throwable) null);
                        } catch (java.lang.Throwable th16) {
                            try {
                                throw th16;
                            } catch (java.lang.Throwable th17) {
                                ajsz.ak(ahoqVarW7, th16);
                                throw th17;
                            }
                        }
                    } catch (java.lang.Throwable th18) {
                        try {
                            throw th18;
                        } catch (java.lang.Throwable th19) {
                            ajsz.ak(ahoqVarW6, th18);
                            throw th19;
                        }
                    }
                }
                ajsz.ak(ahokVarF3, (java.lang.Throwable) null);
                return;
            } catch (java.lang.Throwable th20) {
                try {
                    throw th20;
                } catch (java.lang.Throwable th21) {
                    ajsz.ak(ahokVarF3, th20);
                    throw th21;
                }
            }
        }
        if (i == 3) {
            java.lang.Object obj4 = this.a;
            ahpz ahpzVar2 = ((defpackage.hod) obj4).e;
            java.lang.Object obj5 = this.b;
            ahok ahokVarF4 = ahpzVar2.f(47, "CarInCallTemplateConverter.endCallButtonClicked");
            try {
                gpd gpdVar = ((defpackage.hod) obj4).n;
                java.lang.String str4 = ((defpackage.hol) obj5).a;
                gpdVar.i(str4).b(mce.gz);
                ahoq ahoqVarW8 = ahvr.W(48, "CarInCallTemplateConverter_onEndCallButtonClicked_logImpression");
                try {
                    qbe qbeVarG4 = ((defpackage.hod) obj4).g(str4);
                    if (qbeVarG4 != null) {
                        qbeVarG4.a(qbc.mp);
                    }
                    ajsz.ak(ahoqVarW8, (java.lang.Throwable) null);
                    ahoq ahoqVarW9 = ahvr.W(49, "CarInCallTemplateConverter_onEndCallButtonClicked_onClick");
                    try {
                        ((defpackage.hol) obj5).j.a();
                        ajsz.ak(ahoqVarW9, (java.lang.Throwable) null);
                        ajsz.ak(ahokVarF4, (java.lang.Throwable) null);
                        return;
                    } catch (java.lang.Throwable th22) {
                        try {
                            throw th22;
                        } catch (java.lang.Throwable th23) {
                            ajsz.ak(ahoqVarW9, th22);
                            throw th23;
                        }
                    }
                } catch (java.lang.Throwable th24) {
                    try {
                        throw th24;
                    } catch (java.lang.Throwable th25) {
                        ajsz.ak(ahoqVarW8, th24);
                        throw th25;
                    }
                }
            } catch (java.lang.Throwable th26) {
                try {
                    throw th26;
                } catch (java.lang.Throwable th27) {
                    ajsz.ak(ahokVarF4, th26);
                    throw th27;
                }
            }
        }
        if (i == 4) {
            java.lang.Object obj6 = this.a;
            ahpz ahpzVar3 = ((defpackage.hod) obj6).e;
            defpackage.hol holVar2 = (defpackage.hol) this.b;
            qtx qtxVar2 = holVar2.l;
            ahok ahokVarF5 = ahpzVar3.f(50, "CarInCallTemplateConverter.muteButtonClicked");
            java.lang.String str5 = holVar2.a;
            try {
                java.lang.Boolean bool = (java.lang.Boolean) ((defpackage.hod) obj6).f.a();
                ((defpackage.hod) obj6).n.i(str5).b(mce.gi);
                if (!bool.booleanValue()) {
                    ahoq ahoqVarW10 = ahvr.W(55, "CarInCallTemplateConverter_onMuteButtonClicked_logImpression");
                    try {
                        qbe qbeVarG5 = ((defpackage.hod) obj6).g(str5);
                        if (qbeVarG5 != null) {
                            qbeVarG5.a(qbc.mq);
                        }
                        ajsz.ak(ahoqVarW10, (java.lang.Throwable) null);
                    } catch (java.lang.Throwable th28) {
                        try {
                            throw th28;
                        } catch (java.lang.Throwable th29) {
                            ajsz.ak(ahoqVarW10, th28);
                            throw th29;
                        }
                    }
                }
                ((defpackage.hod) obj6).k.add(str5);
                if (qtxVar2 == null) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("BUTTON_MUTE listener not injected to CallScopeComponent");
                    ((defpackage.hod) obj6).n.i(str5).a(mcd.aY);
                    defpackage.hod.a.d().k(illegalStateException).l("com/android/dialer/androidauto/impl/incall/CarInCallTemplateConverter", "onMuteButtonClicked$<anonymous>", 490, "CarInCallTemplateConverter.kt").v("AndroidAutoMuteButtonClickedToMuteButtonUpdated error due to null mute listener");
                    throw illegalStateException;
                }
                if (bool.booleanValue()) {
                    try {
                        ahoq ahoqVarW11 = ahvr.W(52, "CarInCallTemplateConverter_onMuteButtonClicked_onButtonClicked");
                        try {
                            qtxVar2.a();
                            ajsz.ak(ahoqVarW11, (java.lang.Throwable) null);
                            ahoq ahoqVarW12 = ahvr.W(53, "CarInCallTemplateConverter_onMuteButtonClicked_logImpression");
                            try {
                                qbe qbeVarG6 = ((defpackage.hod) obj6).g(str5);
                                if (qbeVarG6 != null) {
                                    qbeVarG6.a(qbc.mq);
                                }
                                ajsz.ak(ahoqVarW12, (java.lang.Throwable) null);
                            } catch (java.lang.Throwable th30) {
                                try {
                                    throw th30;
                                } catch (java.lang.Throwable th31) {
                                    ajsz.ak(ahoqVarW12, th30);
                                    throw th31;
                                }
                            }
                        } catch (java.lang.Throwable th32) {
                            try {
                                throw th32;
                            } catch (java.lang.Throwable th33) {
                                ajsz.ak(ahoqVarW11, th32);
                                throw th33;
                            }
                        }
                    } catch (java.lang.Throwable th34) {
                        ahoq ahoqVarW13 = ahvr.W(54, "CarInCallTemplateConverter_onMuteButtonClicked_logImpression");
                        try {
                            qbe qbeVarG7 = ((defpackage.hod) obj6).g(str5);
                            if (qbeVarG7 != null) {
                                qbeVarG7.a(qbc.mq);
                            }
                            ajsz.ak(ahoqVarW13, (java.lang.Throwable) null);
                            throw th34;
                        } catch (java.lang.Throwable th35) {
                            try {
                                throw th35;
                            } catch (java.lang.Throwable th36) {
                                ajsz.ak(ahoqVarW13, th35);
                                throw th36;
                            }
                        }
                    }
                } else {
                    ahoq ahoqVarW14 = ahvr.W(51, "CarInCallTemplateConverter_onMuteButtonClicked_onButtonClicked");
                    try {
                        qtxVar2.a();
                        ajsz.ak(ahoqVarW14, (java.lang.Throwable) null);
                    } catch (java.lang.Throwable th37) {
                        try {
                            throw th37;
                        } catch (java.lang.Throwable th38) {
                            ajsz.ak(ahoqVarW14, th37);
                            throw th38;
                        }
                    }
                }
                ajsz.ak(ahokVarF5, (java.lang.Throwable) null);
                return;
            } catch (java.lang.Throwable th39) {
                try {
                    throw th39;
                } catch (java.lang.Throwable th40) {
                    ajsz.ak(ahokVarF5, th39);
                    throw th40;
                }
            }
        }
        if (i != 5) {
            android.telecom.PhoneAccountHandle phoneAccountHandle = ((defpackage.hpa) this.b).a;
            java.lang.Object obj7 = this.a;
            defpackage.hoy hoyVar = (defpackage.hoy) obj7;
            hoyVar.f.b.a(phoneAccountHandle);
            hoyVar.h.f(false);
            ((defpackage.ub) obj7).c();
            return;
        }
        java.lang.Object obj8 = this.a;
        ahpz ahpzVar4 = ((defpackage.hod) obj8).e;
        defpackage.hol holVar3 = (defpackage.hol) this.b;
        qtx qtxVar3 = holVar3.k;
        ahok ahokVarF6 = ahpzVar4.f(62, "CarInCallTemplateConverter.unholdButtonClicked");
        java.lang.String str6 = holVar3.a;
        try {
            ((defpackage.hod) obj8).n.i(str6).b(mce.gG);
            if (((java.lang.Boolean) ((defpackage.hod) obj8).f.a()).booleanValue()) {
                try {
                    ahoq ahoqVarW15 = ahvr.W(65, "CarInCallTemplateConverter_onUnholdButtonClicked_onButtonClicked");
                    try {
                        if (qtxVar3 == null) {
                            throw new java.lang.IllegalStateException("BUTTON_UNHOLD listener not injected to CallScopeComponent");
                        }
                        qtxVar3.a();
                        ajsz.ak(ahoqVarW15, (java.lang.Throwable) null);
                        ahoq ahoqVarW16 = ahvr.W(66, "CarInCallTemplateConverter_onUnholdButtonClicked_logImpression");
                        try {
                            qbe qbeVarG8 = ((defpackage.hod) obj8).g(str6);
                            if (qbeVarG8 != null) {
                                qbeVarG8.a(qbc.mB);
                            }
                            ajsz.ak(ahoqVarW16, (java.lang.Throwable) null);
                        } catch (java.lang.Throwable th41) {
                            try {
                                throw th41;
                            } catch (java.lang.Throwable th42) {
                                ajsz.ak(ahoqVarW16, th41);
                                throw th42;
                            }
                        }
                    } catch (java.lang.Throwable th43) {
                        try {
                            throw th43;
                        } catch (java.lang.Throwable th44) {
                            ajsz.ak(ahoqVarW15, th43);
                            throw th44;
                        }
                    }
                } catch (java.lang.Throwable th45) {
                    ahoq ahoqVarW17 = ahvr.W(67, "CarInCallTemplateConverter_onUnholdButtonClicked_logImpression");
                    try {
                        qbe qbeVarG9 = ((defpackage.hod) obj8).g(str6);
                        if (qbeVarG9 != null) {
                            qbeVarG9.a(qbc.mB);
                        }
                        ajsz.ak(ahoqVarW17, (java.lang.Throwable) null);
                        throw th45;
                    } catch (java.lang.Throwable th46) {
                        try {
                            throw th46;
                        } catch (java.lang.Throwable th47) {
                            ajsz.ak(ahoqVarW17, th46);
                            throw th47;
                        }
                    }
                }
            } else {
                ahoq ahoqVarW18 = ahvr.W(63, "CarInCallTemplateConverter_onUnholdButtonClicked_logImpression");
                try {
                    qbe qbeVarG10 = ((defpackage.hod) obj8).g(str6);
                    if (qbeVarG10 != null) {
                        qbeVarG10.a(qbc.mB);
                    }
                    ajsz.ak(ahoqVarW18, (java.lang.Throwable) null);
                    ahoq ahoqVarW19 = ahvr.W(64, "CarInCallTemplateConverter_onUnholdButtonClicked_onButtonClicked");
                    try {
                        if (qtxVar3 == null) {
                            throw new java.lang.IllegalStateException("BUTTON_UNHOLD listener not injected to CallScopeComponent");
                        }
                        qtxVar3.a();
                        ajsz.ak(ahoqVarW19, (java.lang.Throwable) null);
                    } catch (java.lang.Throwable th48) {
                        try {
                            throw th48;
                        } catch (java.lang.Throwable th49) {
                            ajsz.ak(ahoqVarW19, th48);
                            throw th49;
                        }
                    }
                } catch (java.lang.Throwable th50) {
                    try {
                        throw th50;
                    } catch (java.lang.Throwable th51) {
                        ajsz.ak(ahoqVarW18, th50);
                        throw th51;
                    }
                }
            }
            ajsz.ak(ahokVarF6, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th52) {
            try {
                throw th52;
            } catch (java.lang.Throwable th53) {
                ajsz.ak(ahokVarF6, th52);
                throw th53;
            }
        }
    }
}
