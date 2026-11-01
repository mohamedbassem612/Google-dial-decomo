package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hms implements defpackage.xu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ hms(defpackage.hod hodVar, defpackage.hol holVar, quf qufVar, int i) {
        this.$cid = i;
        this.c = hodVar;
        this.b = holVar;
        this.a = qufVar;
    }

    @Override // defpackage.xu
    public final void onClick() {
        switch (this.$cid) {
            case 0:
                java.lang.String str = ((defpackage.hmu) ajsz.bE(((defpackage.hmg) this.b).b)).c;
                java.lang.Object obj = this.c;
                java.lang.Object obj2 = this.a;
                ahok ahokVarF = ((defpackage.hmt) obj2).b.f(23, "ContactsTemplateConverter.onPhoneIconClicked");
                try {
                    ((defpackage.hmt) obj2).d.i((java.lang.String) null).b(mce.gp);
                    ahoq ahoqVarW = ahvr.W(24, "ContactsTemplateConverter_placeCall");
                    try {
                        ((defpackage.hmt) obj2).c.o(rmx.qC);
                        defpackage.hqe hqeVar = ((defpackage.hmt) obj2).a;
                        com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA = defpackage.jwz.a();
                        callIntent$BuilderA.y(str);
                        callIntent$BuilderA.z(30);
                        hqeVar.a((defpackage.tt) obj, callIntent$BuilderA);
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
            case 1:
                java.lang.Object obj3 = this.a;
                java.lang.Object obj4 = this.c;
                java.lang.Object obj5 = this.b;
                ahok ahokVarF2 = ((defpackage.hlo) obj5).b.f(5, "CallLogTemplateConverter.onCallLogEntryClicked");
                try {
                    ((defpackage.hlo) obj5).d(mce.ge);
                    ahoq ahoqVarW2 = ahvr.W(6, "CallLogTemplateConverter_placeCall");
                    try {
                        ((defpackage.hlo) obj5).c.o(rmx.qE);
                        defpackage.hls hlsVar = ((defpackage.hlt) obj3).b;
                        j$.util.Objects.checkIndex(0, 3);
                        if (hlsVar instanceof defpackage.hlq) {
                            defpackage.hqe hqeVar2 = ((defpackage.hlo) obj5).a;
                            com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA2 = defpackage.jwz.a();
                            callIntent$BuilderA2.y(((defpackage.hlq) hlsVar).a);
                            callIntent$BuilderA2.z(31);
                            hqeVar2.a((defpackage.tt) obj4, callIntent$BuilderA2);
                        } else {
                            if (!(hlsVar instanceof defpackage.hlr)) {
                                throw new aois();
                            }
                            j$.util.Optional optionalG = ((defpackage.hlo) obj5).d.g();
                            aooh.e(optionalG, "getFeature(...)");
                            java.lang.Object objQ = aooh.q(optionalG);
                            if (objQ == null) {
                                throw new java.lang.IllegalStateException("Required value was null.");
                            }
                            ((kgz) objQ).g(((defpackage.hlr) hlsVar).a, 1);
                        }
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
            case 2:
                java.lang.Object obj6 = this.a;
                ahpz ahpzVar = ((defpackage.hmt) obj6).b;
                java.lang.Object obj7 = this.c;
                java.lang.Object obj8 = this.b;
                ahok ahokVarF3 = ahpzVar.f(25, "ContactsTemplateConverter.showContactNumberScreen");
                try {
                    ((defpackage.hmt) obj6).d.i((java.lang.String) null).b(mce.gf);
                    defpackage.him himVar = ((defpackage.hio) ((defpackage.hmt) obj6).e.a).a;
                    defpackage.tt ttVar = (defpackage.tt) obj7;
                    defpackage.hmi hmiVar = new defpackage.hmi((android.content.Context) himVar.s.a(), ttVar, (defpackage.hmg) obj8, (ssq) himVar.qE.a(), himVar.a.d(), (ahpz) himVar.bb.a(), (rlv) himVar.fq.a(), (gpd) himVar.fD.a());
                    hmiVar.c = "preCall_contact";
                    java.lang.Object objD = ((defpackage.tt) obj7).d();
                    aooh.d(objD, "null cannot be cast to non-null type androidx.car.app.ScreenManager");
                    ((defpackage.uc) objD).e(hmiVar);
                    ajsz.ak(ahokVarF3, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th9) {
                    try {
                        throw th9;
                    } catch (java.lang.Throwable th10) {
                        ajsz.ak(ahokVarF3, th9);
                        throw th10;
                    }
                }
            case 3:
                java.lang.Object obj9 = this.a;
                java.lang.Object obj10 = this.b;
                ahok ahokVarF4 = ((defpackage.hmx) obj10).b.f(26, "DialpadTemplateConverter.onCallButtonClicked");
                try {
                    java.lang.String str2 = ((defpackage.hmy) obj9).a;
                    java.lang.Object obj11 = this.c;
                    if (str2 == null || str2.length() == 0) {
                        defpackage.bjz.b((defpackage.tt) j$.util.Objects.requireNonNull(obj11), ((defpackage.tt) obj11).getString(2132018291), 0).a();
                    } else {
                        ((defpackage.hmx) obj10).e(mce.gB);
                        ahoq ahoqVarW3 = ahvr.W(27, "DialpadTemplateConverter_placeCall");
                        try {
                            ((defpackage.hmx) obj10).c.o(rmx.qF);
                            defpackage.hqe hqeVar3 = ((defpackage.hmx) obj10).a;
                            com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA3 = defpackage.jwz.a();
                            callIntent$BuilderA3.y(str2);
                            callIntent$BuilderA3.z(33);
                            hqeVar3.a((defpackage.tt) obj11, callIntent$BuilderA3);
                            ajsz.ak(ahoqVarW3, (java.lang.Throwable) null);
                        } catch (java.lang.Throwable th11) {
                            try {
                                throw th11;
                            } catch (java.lang.Throwable th12) {
                                ajsz.ak(ahoqVarW3, th11);
                                throw th12;
                            }
                        }
                    }
                    ajsz.ak(ahokVarF4, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th13) {
                    try {
                        throw th13;
                    } catch (java.lang.Throwable th14) {
                        ajsz.ak(ahokVarF4, th13);
                        throw th14;
                    }
                }
            case 4:
                java.lang.Object obj12 = this.b;
                java.lang.Object obj13 = this.a;
                ahok ahokVarF5 = ((defpackage.hng) obj13).b.f(31, "FavoritesTemplateConverter.onFavoriteClicked");
                try {
                    ((defpackage.hng) obj13).f(mce.fS);
                    upl uplVar = ((defpackage.hmz) obj12).g;
                    java.lang.Object obj14 = this.c;
                    if (uplVar != null) {
                        java.lang.String str3 = uplVar.c;
                        aooh.e(str3, "getNumber(...)");
                        ahoq ahoqVarW4 = ahvr.W(32, "FavoritesTemplateConverter_placeCall");
                        try {
                            ((defpackage.hng) obj13).c.o(rmx.qz);
                            defpackage.hqe hqeVar4 = ((defpackage.hng) obj13).a;
                            com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA4 = defpackage.jwz.a();
                            callIntent$BuilderA4.y(str3);
                            callIntent$BuilderA4.z(32);
                            hqeVar4.a((defpackage.tt) obj14, callIntent$BuilderA4);
                            ajsz.ak(ahoqVarW4, (java.lang.Throwable) null);
                        } catch (java.lang.Throwable th15) {
                            try {
                                throw th15;
                            } catch (java.lang.Throwable th16) {
                                ajsz.ak(ahoqVarW4, th15);
                                throw th16;
                            }
                        }
                    } else {
                        ahoq ahoqVarW5 = ahvr.W(33, "FavoritesTemplateConverter_showNumberPickerScreen");
                        try {
                            defpackage.him himVar2 = ((defpackage.hio) ((defpackage.hng) obj13).d.a).a;
                            defpackage.hnd hndVar = new defpackage.hnd((android.content.Context) himVar2.s.a(), (defpackage.tt) obj14, (defpackage.hmz) obj12, himVar2.a.d(), (ahpz) himVar2.bb.a(), (rlv) himVar2.fq.a(), (gpd) himVar2.fD.a());
                            hndVar.c = "preCall_favorites";
                            java.lang.Object objD2 = ((defpackage.tt) obj14).d();
                            aooh.d(objD2, "null cannot be cast to non-null type androidx.car.app.ScreenManager");
                            ((defpackage.uc) objD2).e(hndVar);
                            ajsz.ak(ahoqVarW5, (java.lang.Throwable) null);
                        } catch (java.lang.Throwable th17) {
                            try {
                                throw th17;
                            } catch (java.lang.Throwable th18) {
                                ajsz.ak(ahoqVarW5, th17);
                                throw th18;
                            }
                        }
                    }
                    ajsz.ak(ahokVarF5, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th19) {
                    try {
                        throw th19;
                    } catch (java.lang.Throwable th20) {
                        ajsz.ak(ahokVarF5, th19);
                        throw th20;
                    }
                }
            case 5:
                java.lang.Object obj15 = this.c;
                ahpz ahpzVar2 = ((defpackage.hod) obj15).e;
                defpackage.hol holVar = (defpackage.hol) this.b;
                qtx qtxVar = holVar.n;
                boolean z = ((quf) this.a).j;
                ahok ahokVarF6 = ahpzVar2.f(41, "CarInCallTemplateConverter.callNotesButtonClicked");
                try {
                    ahoq ahoqVarW6 = ahvr.W(42, "CarInCallTemplateConverter_onCallNotesButtonClicked_logImpression");
                    java.lang.String str4 = holVar.a;
                    try {
                        if (!z) {
                            qbe qbeVarG = ((defpackage.hod) obj15).g(str4);
                            if (qbeVarG != null) {
                                qbeVarG.a(qbc.mC);
                            }
                        } else if (((defpackage.hod) obj15).m == 3) {
                            qbe qbeVarG2 = ((defpackage.hod) obj15).g(str4);
                            if (qbeVarG2 != null) {
                                qbeVarG2.a(qbc.mE);
                            }
                        } else {
                            qbe qbeVarG3 = ((defpackage.hod) obj15).g(str4);
                            if (qbeVarG3 != null) {
                                qbeVarG3.a(qbc.mD);
                            }
                        }
                        ajsz.ak(ahoqVarW6, (java.lang.Throwable) null);
                        ahoq ahoqVarW7 = ahvr.W(43, "CarInCallTemplateConverter_onCallNotesButtonClicked_onButtonClicked");
                        try {
                            if (qtxVar == null) {
                                throw new java.lang.IllegalStateException("BUTTON_FERMAT listener not injected to CallScopeComponent");
                            }
                            qtxVar.a();
                            ajsz.ak(ahoqVarW7, (java.lang.Throwable) null);
                            ajsz.ak(ahokVarF6, (java.lang.Throwable) null);
                            return;
                        } catch (java.lang.Throwable th21) {
                            try {
                                throw th21;
                            } catch (java.lang.Throwable th22) {
                                ajsz.ak(ahoqVarW7, th21);
                                throw th22;
                            }
                        }
                    } catch (java.lang.Throwable th23) {
                        try {
                            throw th23;
                        } catch (java.lang.Throwable th24) {
                            ajsz.ak(ahoqVarW6, th23);
                            throw th24;
                        }
                    }
                } catch (java.lang.Throwable th25) {
                    try {
                        throw th25;
                    } catch (java.lang.Throwable th26) {
                        ajsz.ak(ahokVarF6, th25);
                        throw th26;
                    }
                }
            case 6:
                java.lang.Object obj16 = this.b;
                ahpz ahpzVar3 = ((defpackage.hod) obj16).e;
                defpackage.hol holVar2 = (defpackage.hol) this.a;
                aonj aonjVar = holVar2.h;
                aomy aomyVar = holVar2.i;
                ahok ahokVarF7 = ahpzVar3.f(44, "CarInCallTemplateConverter.dialpadButtonClicked");
                java.lang.String str5 = holVar2.a;
                java.lang.Object obj17 = this.c;
                try {
                    ((defpackage.hod) obj16).n.i(str5).b(mce.gm);
                    ahoq ahoqVarW8 = ahvr.W(45, "CarInCallTemplateConverter_onDialpadButtonClicked_logImpression");
                    try {
                        qbe qbeVarG4 = ((defpackage.hod) obj16).g(str5);
                        if (qbeVarG4 != null) {
                            qbeVarG4.a(qbc.ms);
                        }
                        ajsz.ak(ahoqVarW8, (java.lang.Throwable) null);
                        ahoq ahoqVarW9 = ahvr.W(46, "CarInCallTemplateConverter_onDialpadButtonClicked_push");
                        try {
                            java.lang.Object objD3 = ((defpackage.tt) obj17).d();
                            aooh.d(objD3, "null cannot be cast to non-null type androidx.car.app.ScreenManager");
                            defpackage.him himVar3 = ((defpackage.hio) ((defpackage.hod) obj16).o.a).a;
                            defpackage.hpp hppVar = new defpackage.hpp((defpackage.tt) obj17, aonjVar, aomyVar, (zpm) himVar3.fn.a(), (gpd) himVar3.fD.a());
                            hppVar.c = "inCall_dialpad";
                            ((defpackage.uc) objD3).e(hppVar);
                            ajsz.ak(ahoqVarW9, (java.lang.Throwable) null);
                            ajsz.ak(ahokVarF7, (java.lang.Throwable) null);
                            return;
                        } catch (java.lang.Throwable th27) {
                            try {
                                throw th27;
                            } catch (java.lang.Throwable th28) {
                                ajsz.ak(ahoqVarW9, th27);
                                throw th28;
                            }
                        }
                        break;
                    } catch (java.lang.Throwable th29) {
                        try {
                            throw th29;
                        } catch (java.lang.Throwable th30) {
                            ajsz.ak(ahoqVarW8, th29);
                            throw th30;
                        }
                    }
                } catch (java.lang.Throwable th31) {
                    try {
                        throw th31;
                    } catch (java.lang.Throwable th32) {
                        ajsz.ak(ahokVarF7, th31);
                        throw th32;
                    }
                }
            default:
                java.lang.Object obj18 = this.b;
                ahpz ahpzVar4 = ((defpackage.hod) obj18).e;
                java.lang.Object obj19 = this.c;
                java.lang.Object obj20 = this.a;
                ahok ahokVarF8 = ahpzVar4.f(38, "CarInCallTemplateConverter.audioRouteButtonClicked");
                java.lang.String str6 = ((defpackage.hol) obj20).a;
                try {
                    ((defpackage.hod) obj18).n.i(str6).b(mce.gk);
                    ahoq ahoqVarW10 = ahvr.W(39, "CarInCallTemplateConverter_onAudioRouteButtonClicked_logImpression");
                    try {
                        qbe qbeVarG5 = ((defpackage.hod) obj18).g(str6);
                        if (qbeVarG5 != null) {
                            qbeVarG5.a(qbc.mr);
                        }
                        ajsz.ak(ahoqVarW10, (java.lang.Throwable) null);
                        ahoq ahoqVarW11 = ahvr.W(40, "CarInCallTemplateConverter_onAudioRouteButtonClicked_push");
                        try {
                            java.lang.Object objD4 = ((defpackage.tt) obj19).d();
                            aooh.d(objD4, "null cannot be cast to non-null type androidx.car.app.ScreenManager");
                            defpackage.hqv hqvVarA = ((defpackage.hod) obj18).d.a((defpackage.tt) obj19, ((defpackage.hod) obj18).b, ((defpackage.hod) obj18).c);
                            hqvVarA.c = "inCall_audio";
                            ((defpackage.uc) objD4).e(hqvVarA);
                            ajsz.ak(ahoqVarW11, (java.lang.Throwable) null);
                            ajsz.ak(ahokVarF8, (java.lang.Throwable) null);
                            return;
                        } catch (java.lang.Throwable th33) {
                            try {
                                throw th33;
                            } catch (java.lang.Throwable th34) {
                                ajsz.ak(ahoqVarW11, th33);
                                throw th34;
                            }
                        }
                        break;
                    } catch (java.lang.Throwable th35) {
                        try {
                            throw th35;
                        } catch (java.lang.Throwable th36) {
                            ajsz.ak(ahoqVarW10, th35);
                            throw th36;
                        }
                    }
                } catch (java.lang.Throwable th37) {
                    try {
                        throw th37;
                    } catch (java.lang.Throwable th38) {
                        ajsz.ak(ahokVarF8, th37);
                        throw th38;
                    }
                }
        }
    }

    public /* synthetic */ hms(defpackage.hod hodVar, defpackage.tt ttVar, defpackage.hol holVar, int i) {
        this.$cid = i;
        this.b = hodVar;
        this.c = ttVar;
        this.a = holVar;
    }

    public /* synthetic */ hms(java.lang.Object obj, java.lang.Object obj2, defpackage.tt ttVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = ttVar;
    }

    public /* synthetic */ hms(java.lang.Object obj, java.lang.Object obj2, defpackage.tt ttVar, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = ttVar;
    }
}
