package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kjd implements defpackage.abyf {
    public static final aimz a = aimz.i("com/android/dialer/calllog/multibindingintegration/callscreentranscript/CallScreenTranscriptViewBinder");
    public final rlv b;
    public final j$.util.Optional c;
    public final aoin d;
    public final ldb e;
    public final gpd f;
    public final aeqx g;
    public final zjm h;
    public final rsr i;
    private final ahey j;
    private final aoss k;
    private final aoin l;
    private final aoin m;
    private final kaw n;
    private final defpackage.oq o;

    public kjd(ahey aheyVar, rlv rlvVar, j$.util.Optional optional, gpd gpdVar, aeqx aeqxVar, defpackage.oq oqVar, zjm zjmVar, kaw kawVar, aoss aossVar, j$.util.Optional optional2, rsr rsrVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(optional, "transcriptAudioFeedback");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "enableAgenticCallScreen");
        aooh.f(aoinVar2, "gacsUseGeminiBranding");
        aooh.f(aoinVar3, "enableCancelMissedCallNotificationByCreationTime");
        this.j = aheyVar;
        this.b = rlvVar;
        this.c = optional;
        this.f = gpdVar;
        this.g = aeqxVar;
        this.o = oqVar;
        this.h = zjmVar;
        this.n = kawVar;
        this.k = aossVar;
        this.i = rsrVar;
        this.l = aoinVar;
        this.m = aoinVar2;
        this.d = aoinVar3;
        this.e = (ldb) aooh.q(optional2);
    }

    private final java.lang.CharSequence e(java.lang.String str, int i) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(this.j, i), 0, spannableString.length(), 17);
        return spannableString;
    }

    private static final boolean f(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 3 || i == 5) {
            return true;
        }
        a.d().l("com/android/dialer/calllog/multibindingintegration/callscreentranscript/CallScreenTranscriptViewBinder", "shouldShowBamCustomizedView", 551, "CallScreenTranscriptViewBinder.kt").w("Unexpected call type for BAM: %d", i);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0258  */
    /* JADX WARN: Code duplicated, block: B:102:0x025c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0269  */
    /* JADX WARN: Code duplicated, block: B:106:0x026d  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x0204  */
    /* JADX WARN: Code duplicated, block: B:86:0x0208  */
    /* JADX WARN: Code duplicated, block: B:90:0x0213  */
    /* JADX WARN: Code duplicated, block: B:92:0x0217  */
    /* JADX WARN: Code duplicated, block: B:95:0x0221  */
    /* JADX WARN: Code duplicated, block: B:97:0x0225  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v30, types: [aonj, java.lang.Object] */
    @Override // defpackage.abyf
    public final /* synthetic */ abya a(java.lang.Object obj) {
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequenceConcat;
        mmy mmyVarO;
        int iAR;
        java.lang.String string;
        defpackage.kjg kjgVar;
        java.lang.Boolean bool;
        java.lang.String str;
        defpackage.kir kirVar;
        java.lang.String str2;
        defpackage.kis kisVar;
        defpackage.kir kirVar2;
        defpackage.kis kisVar2;
        java.lang.String strValueOf;
        defpackage.ied iedVarD;
        android.view.View.OnClickListener onClickListener;
        java.lang.String str3;
        defpackage.kis kisVar3;
        defpackage.kis kisVar4;
        defpackage.kis kisVar5;
        defpackage.kis kisVar6;
        kiu kiuVar = ((defpackage.klb) obj).a;
        byte[] bArr = null;
        if ((kiuVar.b & 67108864) != 0) {
            defpackage.kir kirVar3 = kiuVar.D;
            if (kirVar3 == null) {
                kirVar3 = defpackage.kir.a;
            }
            aooh.e(kirVar3, "getCallScreenDetails(...)");
            if (!defpackage.hgt.t(kirVar3)) {
                if (!defpackage.hgt.u(this.i.O(kiuVar))) {
                    return null;
                }
            }
        } else if (!defpackage.hgt.u(this.i.O(kiuVar))) {
            return null;
        }
        rsr rsrVar = this.i;
        mmy mmyVarO2 = rsrVar.O(kiuVar);
        int i = 2;
        if (!defpackage.hgt.u(mmyVarO2)) {
            defpackage.kir kirVar4 = kiuVar.D;
            if (kirVar4 == null) {
                kirVar4 = defpackage.kir.a;
            }
            aooh.e(kirVar4, "getCallScreenDetails(...)");
            if (!defpackage.hgt.t(kirVar4) || this.e == null) {
                charSequence = null;
            } else {
                defpackage.kir kirVar5 = kiuVar.D;
                if (kirVar5 == null) {
                    kirVar5 = defpackage.kir.a;
                }
                aooh.e(kirVar5, "getCallScreenDetails(...)");
                java.lang.String str4 = kirVar5.c;
                aooh.e(str4, "getTranscriptSnippet(...)");
                if (str4.length() == 0) {
                    java.lang.String str5 = kirVar5.e;
                    aooh.e(str5, "getEmptySnippetDescription(...)");
                    charSequenceConcat = e(str5, 2132086244);
                } else if (kirVar5.f) {
                    java.lang.String string2 = this.j.getString(2132020597);
                    aooh.e(string2, "getString(...)");
                    charSequenceConcat = android.text.TextUtils.concat(e(string2, 2132086245), " ", kirVar5.c);
                    aooh.c(charSequenceConcat);
                } else {
                    charSequenceConcat = kirVar5.c;
                    aooh.c(charSequenceConcat);
                }
            }
            if (charSequence != null) {
                return null;
            }
            mmyVarO = rsrVar.O(kiuVar);
            iAR = a.aR(mmyVarO.n);
            if ((iAR != 0 ? iAR : 1) == 4) {
                a.b().l("com/android/dialer/calllog/multibindingintegration/callscreentranscript/CallScreenTranscriptViewBinder", "getViewData", 118, "CallScreenTranscriptViewBinder.kt").v("Hides the view for Beesly call.");
                return null;
            }
            if (!mmyVarO.m && !f(kiuVar.q)) {
                a.b().l("com/android/dialer/calllog/multibindingintegration/callscreentranscript/CallScreenTranscriptViewBinder", "getViewData", 124, "CallScreenTranscriptViewBinder.kt").v("hide the view for answered bam call.");
                return null;
            }
            if (rsrVar.O(kiuVar).m || !f(kiuVar.q)) {
                string = null;
            } else {
                string = this.j.getString(2132017497);
            }
            if (this.o.t(kiuVar)) {
                kjgVar = null;
            } else {
                bool = (java.lang.Boolean) this.d.a();
                str = rsrVar.O(kiuVar).f;
                aooh.e(str, "getAudioRecordingFilePath(...)");
                if (str.length() <= 0) {
                    kirVar = kiuVar.D;
                    if (kirVar == null) {
                        kirVar = defpackage.kir.a;
                    }
                    str2 = kirVar.d;
                    aooh.e(str2, "getAudioRecordingFilePath(...)");
                    if (str2.length() > 0 && this.e != null) {
                        if (bool.booleanValue()) {
                            kisVar4 = kiuVar.u;
                            if (kisVar4 == null) {
                                kisVar4 = defpackage.kis.a;
                            }
                            if (kisVar4.d.size() != 0) {
                                kirVar2 = kiuVar.D;
                                if (kirVar2 == null) {
                                    kirVar2 = defpackage.kir.a;
                                }
                                java.lang.String str6 = kirVar2.d;
                                aooh.e(str6, "getAudioRecordingFilePath(...)");
                                defpackage.knj knjVar = new defpackage.knj(bool, kiuVar, this, 1, (byte[]) null);
                                defpackage.heq heqVarT = defpackage.hgz.t(defpackage.ied.a.m());
                                java.lang.String string3 = this.n.v(str6).toString();
                                aooh.e(string3, "toString(...)");
                                heqVarT.H(string3);
                                heqVarT.E(defpackage.iec.CALL_SCREEN_AUDIO_UNDER_CALL_LOG);
                                if (bool.booleanValue()) {
                                    kisVar3 = kiuVar.u;
                                    if (kisVar3 == null) {
                                        kisVar3 = defpackage.kis.a;
                                    }
                                    strValueOf = java.lang.String.valueOf(kisVar3.d.get(0));
                                } else {
                                    kisVar2 = kiuVar.u;
                                    if (kisVar2 == null) {
                                        kisVar2 = defpackage.kis.a;
                                    }
                                    java.lang.Object obj2 = kisVar2.c.get(0);
                                    aooh.c(obj2);
                                    strValueOf = (java.lang.String) obj2;
                                }
                                aooh.f(strValueOf, "value");
                                akzx akzxVar = (akzx) heqVarT.a;
                                akzxVar.u();
                                defpackage.ied iedVar = (defpackage.ied) akzxVar.b;
                                j$.util.Objects.requireNonNull(strValueOf);
                                iedVar.b |= 2;
                                iedVar.g = strValueOf;
                                iedVarD = heqVarT.D();
                                onClickListener = knjVar;
                                str3 = str6;
                                kjgVar = new defpackage.kjg(kiuVar.d, str3, onClickListener, iedVarD);
                            }
                        } else {
                            kisVar = kiuVar.u;
                            if (kisVar == null) {
                                kisVar = defpackage.kis.a;
                            }
                            if (kisVar.c.size() != 0) {
                                kirVar2 = kiuVar.D;
                                if (kirVar2 == null) {
                                    kirVar2 = defpackage.kir.a;
                                }
                                java.lang.String str7 = kirVar2.d;
                                aooh.e(str7, "getAudioRecordingFilePath(...)");
                                defpackage.knj knjVar2 = new defpackage.knj(bool, kiuVar, this, 1, (byte[]) null);
                                defpackage.heq heqVarT2 = defpackage.hgz.t(defpackage.ied.a.m());
                                java.lang.String string4 = this.n.v(str7).toString();
                                aooh.e(string4, "toString(...)");
                                heqVarT2.H(string4);
                                heqVarT2.E(defpackage.iec.CALL_SCREEN_AUDIO_UNDER_CALL_LOG);
                                if (bool.booleanValue()) {
                                    kisVar3 = kiuVar.u;
                                    if (kisVar3 == null) {
                                        kisVar3 = defpackage.kis.a;
                                    }
                                    strValueOf = java.lang.String.valueOf(kisVar3.d.get(0));
                                } else {
                                    kisVar2 = kiuVar.u;
                                    if (kisVar2 == null) {
                                        kisVar2 = defpackage.kis.a;
                                    }
                                    java.lang.Object obj3 = kisVar2.c.get(0);
                                    aooh.c(obj3);
                                    strValueOf = (java.lang.String) obj3;
                                }
                                aooh.f(strValueOf, "value");
                                akzx akzxVar2 = (akzx) heqVarT2.a;
                                akzxVar2.u();
                                defpackage.ied iedVar2 = (defpackage.ied) akzxVar2.b;
                                j$.util.Objects.requireNonNull(strValueOf);
                                iedVar2.b |= 2;
                                iedVar2.g = strValueOf;
                                iedVarD = heqVarT2.D();
                                onClickListener = knjVar2;
                                str3 = str7;
                                kjgVar = new defpackage.kjg(kiuVar.d, str3, onClickListener, iedVarD);
                            }
                        }
                    }
                    kjgVar = null;
                } else {
                    kisVar5 = kiuVar.u;
                    if (kisVar5 == null) {
                        kisVar5 = defpackage.kis.a;
                    }
                    if (kisVar5.d.size() != 0) {
                        java.lang.String str8 = rsrVar.O(kiuVar).f;
                        aooh.e(str8, "getAudioRecordingFilePath(...)");
                        defpackage.jjg jjgVar = new defpackage.jjg(kiuVar, this, i, bArr);
                        defpackage.heq heqVarT3 = defpackage.hgz.t(defpackage.ied.a.m());
                        java.lang.String string5 = this.n.v(str8).toString();
                        aooh.e(string5, "toString(...)");
                        heqVarT3.H(string5);
                        heqVarT3.E(defpackage.iec.DOBBY_AUDIO_UNDER_CALL_LOG);
                        kisVar6 = kiuVar.u;
                        if (kisVar6 == null) {
                            kisVar6 = defpackage.kis.a;
                        }
                        java.lang.Object obj4 = kisVar6.d.get(0);
                        aooh.e(obj4, "get(...)");
                        heqVarT3.G(((java.lang.Number) obj4).longValue());
                        iedVarD = heqVarT3.D();
                        str3 = str8;
                        onClickListener = jjgVar;
                    } else {
                        kirVar = kiuVar.D;
                        if (kirVar == null) {
                            kirVar = defpackage.kir.a;
                        }
                        str2 = kirVar.d;
                        aooh.e(str2, "getAudioRecordingFilePath(...)");
                        if (str2.length() > 0) {
                            if (bool.booleanValue()) {
                                kisVar4 = kiuVar.u;
                                if (kisVar4 == null) {
                                    kisVar4 = defpackage.kis.a;
                                }
                                if (kisVar4.d.size() != 0) {
                                    kirVar2 = kiuVar.D;
                                    if (kirVar2 == null) {
                                        kirVar2 = defpackage.kir.a;
                                    }
                                    java.lang.String str9 = kirVar2.d;
                                    aooh.e(str9, "getAudioRecordingFilePath(...)");
                                    defpackage.knj knjVar3 = new defpackage.knj(bool, kiuVar, this, 1, (byte[]) null);
                                    defpackage.heq heqVarT4 = defpackage.hgz.t(defpackage.ied.a.m());
                                    java.lang.String string6 = this.n.v(str9).toString();
                                    aooh.e(string6, "toString(...)");
                                    heqVarT4.H(string6);
                                    heqVarT4.E(defpackage.iec.CALL_SCREEN_AUDIO_UNDER_CALL_LOG);
                                    if (bool.booleanValue()) {
                                        kisVar3 = kiuVar.u;
                                        if (kisVar3 == null) {
                                            kisVar3 = defpackage.kis.a;
                                        }
                                        strValueOf = java.lang.String.valueOf(kisVar3.d.get(0));
                                    } else {
                                        kisVar2 = kiuVar.u;
                                        if (kisVar2 == null) {
                                            kisVar2 = defpackage.kis.a;
                                        }
                                        java.lang.Object obj5 = kisVar2.c.get(0);
                                        aooh.c(obj5);
                                        strValueOf = (java.lang.String) obj5;
                                    }
                                    aooh.f(strValueOf, "value");
                                    akzx akzxVar3 = (akzx) heqVarT4.a;
                                    akzxVar3.u();
                                    defpackage.ied iedVar3 = (defpackage.ied) akzxVar3.b;
                                    j$.util.Objects.requireNonNull(strValueOf);
                                    iedVar3.b |= 2;
                                    iedVar3.g = strValueOf;
                                    iedVarD = heqVarT4.D();
                                    onClickListener = knjVar3;
                                    str3 = str9;
                                }
                            } else {
                                kisVar = kiuVar.u;
                                if (kisVar == null) {
                                    kisVar = defpackage.kis.a;
                                }
                                if (kisVar.c.size() != 0) {
                                    kirVar2 = kiuVar.D;
                                    if (kirVar2 == null) {
                                        kirVar2 = defpackage.kir.a;
                                    }
                                    java.lang.String str10 = kirVar2.d;
                                    aooh.e(str10, "getAudioRecordingFilePath(...)");
                                    defpackage.knj knjVar4 = new defpackage.knj(bool, kiuVar, this, 1, (byte[]) null);
                                    defpackage.heq heqVarT5 = defpackage.hgz.t(defpackage.ied.a.m());
                                    java.lang.String string7 = this.n.v(str10).toString();
                                    aooh.e(string7, "toString(...)");
                                    heqVarT5.H(string7);
                                    heqVarT5.E(defpackage.iec.CALL_SCREEN_AUDIO_UNDER_CALL_LOG);
                                    if (bool.booleanValue()) {
                                        kisVar3 = kiuVar.u;
                                        if (kisVar3 == null) {
                                            kisVar3 = defpackage.kis.a;
                                        }
                                        strValueOf = java.lang.String.valueOf(kisVar3.d.get(0));
                                    } else {
                                        kisVar2 = kiuVar.u;
                                        if (kisVar2 == null) {
                                            kisVar2 = defpackage.kis.a;
                                        }
                                        java.lang.Object obj6 = kisVar2.c.get(0);
                                        aooh.c(obj6);
                                        strValueOf = (java.lang.String) obj6;
                                    }
                                    aooh.f(strValueOf, "value");
                                    akzx akzxVar4 = (akzx) heqVarT5.a;
                                    akzxVar4.u();
                                    defpackage.ied iedVar4 = (defpackage.ied) akzxVar4.b;
                                    j$.util.Objects.requireNonNull(strValueOf);
                                    iedVar4.b |= 2;
                                    iedVar4.g = strValueOf;
                                    iedVarD = heqVarT5.D();
                                    onClickListener = knjVar4;
                                    str3 = str10;
                                }
                            }
                        }
                        kjgVar = null;
                    }
                    kjgVar = new defpackage.kjg(kiuVar.d, str3, onClickListener, iedVarD);
                }
            }
            return new defpackage.kje(charSequence, kjgVar, urg.c(this.j, 2130969107), new defpackage.jln(new defpackage.khx(this, kiuVar, 6, null), 12, bArr), string);
        }
        java.lang.String str11 = mmyVarO2.c;
        aooh.e(str11, "getTranscriptSnippet(...)");
        if (str11.length() == 0) {
            java.lang.String str12 = mmyVarO2.d;
            aooh.e(str12, "getFallbackSnippet(...)");
            charSequenceConcat = e(str12, 2132086244);
        } else if (mmyVarO2.e) {
            j$.util.Optional optionalG = this.h.g();
            defpackage.kdb kdbVar = new defpackage.kdb(new defpackage.jpi(mmyVarO2, 11), 4);
            if (true == optionalG.isPresent()) {
                optionalG = j$.util.Optional.ofNullable(kdbVar.a.a(optionalG.get()));
            }
            java.lang.Object objOrElse = optionalG.orElse(mmyVarO2.c);
            aooh.c(objOrElse);
            charSequenceConcat = (java.lang.CharSequence) objOrElse;
        } else {
            charSequenceConcat = mmyVarO2.c;
            aooh.c(charSequenceConcat);
        }
        charSequence = charSequenceConcat;
        if (charSequence != null) {
            return null;
        }
        mmyVarO = rsrVar.O(kiuVar);
        iAR = a.aR(mmyVarO.n);
        if ((iAR != 0 ? iAR : 1) == 4) {
            a.b().l("com/android/dialer/calllog/multibindingintegration/callscreentranscript/CallScreenTranscriptViewBinder", "getViewData", 118, "CallScreenTranscriptViewBinder.kt").v("Hides the view for Beesly call.");
            return null;
        }
        if (!mmyVarO.m) {
        }
        if (rsrVar.O(kiuVar).m) {
            string = null;
        } else {
            string = null;
        }
        if (this.o.t(kiuVar)) {
            bool = (java.lang.Boolean) this.d.a();
            str = rsrVar.O(kiuVar).f;
            aooh.e(str, "getAudioRecordingFilePath(...)");
            if (str.length() <= 0) {
                kirVar = kiuVar.D;
                if (kirVar == null) {
                    kirVar = defpackage.kir.a;
                }
                str2 = kirVar.d;
                aooh.e(str2, "getAudioRecordingFilePath(...)");
                if (str2.length() > 0) {
                    if (bool.booleanValue()) {
                        kisVar4 = kiuVar.u;
                        if (kisVar4 == null) {
                            kisVar4 = defpackage.kis.a;
                        }
                        if (kisVar4.d.size() != 0) {
                            kirVar2 = kiuVar.D;
                            if (kirVar2 == null) {
                                kirVar2 = defpackage.kir.a;
                            }
                            java.lang.String str13 = kirVar2.d;
                            aooh.e(str13, "getAudioRecordingFilePath(...)");
                            defpackage.knj knjVar5 = new defpackage.knj(bool, kiuVar, this, 1, (byte[]) null);
                            defpackage.heq heqVarT6 = defpackage.hgz.t(defpackage.ied.a.m());
                            java.lang.String string8 = this.n.v(str13).toString();
                            aooh.e(string8, "toString(...)");
                            heqVarT6.H(string8);
                            heqVarT6.E(defpackage.iec.CALL_SCREEN_AUDIO_UNDER_CALL_LOG);
                            if (bool.booleanValue()) {
                                kisVar3 = kiuVar.u;
                                if (kisVar3 == null) {
                                    kisVar3 = defpackage.kis.a;
                                }
                                strValueOf = java.lang.String.valueOf(kisVar3.d.get(0));
                            } else {
                                kisVar2 = kiuVar.u;
                                if (kisVar2 == null) {
                                    kisVar2 = defpackage.kis.a;
                                }
                                java.lang.Object obj7 = kisVar2.c.get(0);
                                aooh.c(obj7);
                                strValueOf = (java.lang.String) obj7;
                            }
                            aooh.f(strValueOf, "value");
                            akzx akzxVar5 = (akzx) heqVarT6.a;
                            akzxVar5.u();
                            defpackage.ied iedVar5 = (defpackage.ied) akzxVar5.b;
                            j$.util.Objects.requireNonNull(strValueOf);
                            iedVar5.b |= 2;
                            iedVar5.g = strValueOf;
                            iedVarD = heqVarT6.D();
                            onClickListener = knjVar5;
                            str3 = str13;
                            kjgVar = new defpackage.kjg(kiuVar.d, str3, onClickListener, iedVarD);
                        }
                    } else {
                        kisVar = kiuVar.u;
                        if (kisVar == null) {
                            kisVar = defpackage.kis.a;
                        }
                        if (kisVar.c.size() != 0) {
                            kirVar2 = kiuVar.D;
                            if (kirVar2 == null) {
                                kirVar2 = defpackage.kir.a;
                            }
                            java.lang.String str14 = kirVar2.d;
                            aooh.e(str14, "getAudioRecordingFilePath(...)");
                            defpackage.knj knjVar6 = new defpackage.knj(bool, kiuVar, this, 1, (byte[]) null);
                            defpackage.heq heqVarT7 = defpackage.hgz.t(defpackage.ied.a.m());
                            java.lang.String string9 = this.n.v(str14).toString();
                            aooh.e(string9, "toString(...)");
                            heqVarT7.H(string9);
                            heqVarT7.E(defpackage.iec.CALL_SCREEN_AUDIO_UNDER_CALL_LOG);
                            if (bool.booleanValue()) {
                                kisVar3 = kiuVar.u;
                                if (kisVar3 == null) {
                                    kisVar3 = defpackage.kis.a;
                                }
                                strValueOf = java.lang.String.valueOf(kisVar3.d.get(0));
                            } else {
                                kisVar2 = kiuVar.u;
                                if (kisVar2 == null) {
                                    kisVar2 = defpackage.kis.a;
                                }
                                java.lang.Object obj8 = kisVar2.c.get(0);
                                aooh.c(obj8);
                                strValueOf = (java.lang.String) obj8;
                            }
                            aooh.f(strValueOf, "value");
                            akzx akzxVar6 = (akzx) heqVarT7.a;
                            akzxVar6.u();
                            defpackage.ied iedVar6 = (defpackage.ied) akzxVar6.b;
                            j$.util.Objects.requireNonNull(strValueOf);
                            iedVar6.b |= 2;
                            iedVar6.g = strValueOf;
                            iedVarD = heqVarT7.D();
                            onClickListener = knjVar6;
                            str3 = str14;
                            kjgVar = new defpackage.kjg(kiuVar.d, str3, onClickListener, iedVarD);
                        }
                    }
                }
                kjgVar = null;
            } else {
                kisVar5 = kiuVar.u;
                if (kisVar5 == null) {
                    kisVar5 = defpackage.kis.a;
                }
                if (kisVar5.d.size() != 0) {
                    java.lang.String str15 = rsrVar.O(kiuVar).f;
                    aooh.e(str15, "getAudioRecordingFilePath(...)");
                    defpackage.jjg jjgVar2 = new defpackage.jjg(kiuVar, this, i, bArr);
                    defpackage.heq heqVarT8 = defpackage.hgz.t(defpackage.ied.a.m());
                    java.lang.String string10 = this.n.v(str15).toString();
                    aooh.e(string10, "toString(...)");
                    heqVarT8.H(string10);
                    heqVarT8.E(defpackage.iec.DOBBY_AUDIO_UNDER_CALL_LOG);
                    kisVar6 = kiuVar.u;
                    if (kisVar6 == null) {
                        kisVar6 = defpackage.kis.a;
                    }
                    java.lang.Object obj9 = kisVar6.d.get(0);
                    aooh.e(obj9, "get(...)");
                    heqVarT8.G(((java.lang.Number) obj9).longValue());
                    iedVarD = heqVarT8.D();
                    str3 = str15;
                    onClickListener = jjgVar2;
                } else {
                    kirVar = kiuVar.D;
                    if (kirVar == null) {
                        kirVar = defpackage.kir.a;
                    }
                    str2 = kirVar.d;
                    aooh.e(str2, "getAudioRecordingFilePath(...)");
                    if (str2.length() > 0) {
                        if (bool.booleanValue()) {
                            kisVar4 = kiuVar.u;
                            if (kisVar4 == null) {
                                kisVar4 = defpackage.kis.a;
                            }
                            if (kisVar4.d.size() != 0) {
                                kirVar2 = kiuVar.D;
                                if (kirVar2 == null) {
                                    kirVar2 = defpackage.kir.a;
                                }
                                java.lang.String str16 = kirVar2.d;
                                aooh.e(str16, "getAudioRecordingFilePath(...)");
                                defpackage.knj knjVar7 = new defpackage.knj(bool, kiuVar, this, 1, (byte[]) null);
                                defpackage.heq heqVarT9 = defpackage.hgz.t(defpackage.ied.a.m());
                                java.lang.String string11 = this.n.v(str16).toString();
                                aooh.e(string11, "toString(...)");
                                heqVarT9.H(string11);
                                heqVarT9.E(defpackage.iec.CALL_SCREEN_AUDIO_UNDER_CALL_LOG);
                                if (bool.booleanValue()) {
                                    kisVar3 = kiuVar.u;
                                    if (kisVar3 == null) {
                                        kisVar3 = defpackage.kis.a;
                                    }
                                    strValueOf = java.lang.String.valueOf(kisVar3.d.get(0));
                                } else {
                                    kisVar2 = kiuVar.u;
                                    if (kisVar2 == null) {
                                        kisVar2 = defpackage.kis.a;
                                    }
                                    java.lang.Object obj10 = kisVar2.c.get(0);
                                    aooh.c(obj10);
                                    strValueOf = (java.lang.String) obj10;
                                }
                                aooh.f(strValueOf, "value");
                                akzx akzxVar7 = (akzx) heqVarT9.a;
                                akzxVar7.u();
                                defpackage.ied iedVar7 = (defpackage.ied) akzxVar7.b;
                                j$.util.Objects.requireNonNull(strValueOf);
                                iedVar7.b |= 2;
                                iedVar7.g = strValueOf;
                                iedVarD = heqVarT9.D();
                                onClickListener = knjVar7;
                                str3 = str16;
                            }
                        } else {
                            kisVar = kiuVar.u;
                            if (kisVar == null) {
                                kisVar = defpackage.kis.a;
                            }
                            if (kisVar.c.size() != 0) {
                                kirVar2 = kiuVar.D;
                                if (kirVar2 == null) {
                                    kirVar2 = defpackage.kir.a;
                                }
                                java.lang.String str17 = kirVar2.d;
                                aooh.e(str17, "getAudioRecordingFilePath(...)");
                                defpackage.knj knjVar8 = new defpackage.knj(bool, kiuVar, this, 1, (byte[]) null);
                                defpackage.heq heqVarT10 = defpackage.hgz.t(defpackage.ied.a.m());
                                java.lang.String string12 = this.n.v(str17).toString();
                                aooh.e(string12, "toString(...)");
                                heqVarT10.H(string12);
                                heqVarT10.E(defpackage.iec.CALL_SCREEN_AUDIO_UNDER_CALL_LOG);
                                if (bool.booleanValue()) {
                                    kisVar3 = kiuVar.u;
                                    if (kisVar3 == null) {
                                        kisVar3 = defpackage.kis.a;
                                    }
                                    strValueOf = java.lang.String.valueOf(kisVar3.d.get(0));
                                } else {
                                    kisVar2 = kiuVar.u;
                                    if (kisVar2 == null) {
                                        kisVar2 = defpackage.kis.a;
                                    }
                                    java.lang.Object obj11 = kisVar2.c.get(0);
                                    aooh.c(obj11);
                                    strValueOf = (java.lang.String) obj11;
                                }
                                aooh.f(strValueOf, "value");
                                akzx akzxVar8 = (akzx) heqVarT10.a;
                                akzxVar8.u();
                                defpackage.ied iedVar8 = (defpackage.ied) akzxVar8.b;
                                j$.util.Objects.requireNonNull(strValueOf);
                                iedVar8.b |= 2;
                                iedVar8.g = strValueOf;
                                iedVarD = heqVarT10.D();
                                onClickListener = knjVar8;
                                str3 = str17;
                            }
                        }
                    }
                    kjgVar = null;
                }
                kjgVar = new defpackage.kjg(kiuVar.d, str3, onClickListener, iedVarD);
            }
        } else {
            kjgVar = null;
        }
        return new defpackage.kje(charSequence, kjgVar, urg.c(this.j, 2130969107), new defpackage.jln(new defpackage.khx(this, kiuVar, 6, null), 12, bArr), string);
    }

    @Override // defpackage.abyf
    public final /* bridge */ /* synthetic */ void b(android.view.View view, abya abyaVar) {
        defpackage.ied iedVar;
        defpackage.kjg kjgVar;
        defpackage.kje kjeVar = (defpackage.kje) abyaVar;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131427885);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131427880);
        android.view.View viewFindViewById = view.findViewById(2131427884);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(2131427879);
        android.graphics.drawable.Drawable background = viewFindViewById.getBackground();
        aooh.d(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) background;
        android.widget.TextView textView4 = (android.widget.TextView) view.findViewById(2131427886);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) view.findViewById(2131427882);
        int i = 0;
        if (kjeVar != null) {
            ahey aheyVar = this.j;
            android.text.SpannableString spannableString = new android.text.SpannableString(aheyVar.getString(2132018190));
            spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, spannableString.length(), 33);
            textView.setText(spannableString);
            textView3.setText(spannableString);
            int i2 = kjeVar.c;
            textView.setBackgroundColor(i2);
            gradientDrawable.setColors(new int[]{0, i2, i2});
            java.lang.String string = aheyVar.getResources().getString(2132018190);
            aooh.e(string, "getString(...)");
            aooh.e(textView.getTypeface(), "getTypeface(...)");
            java.lang.CharSequence charSequence = kjeVar.a;
            android.text.SpannableString spannableString2 = new android.text.SpannableString(android.text.TextUtils.concat(charSequence, "  ", string));
            spannableString2.setSpan(defpackage.kjf.a, charSequence.length() + 2, spannableString2.length(), 34);
            textView2.setText(spannableString2);
            textView3.setOnClickListener(kjeVar.d);
            java.lang.CharSequence charSequence2 = kjeVar.e;
            if (charSequence2 != null) {
                a.b().l("com/android/dialer/calllog/multibindingintegration/callscreentranscript/CallScreenTranscriptViewBinder", "bindViewData", 186, "CallScreenTranscriptViewBinder.kt").v("overwrite the default transcript title text view");
                textView4.setText(charSequence2);
            }
            if (((java.lang.Boolean) this.l.a()).booleanValue() && ((java.lang.Boolean) this.m.a()).booleanValue()) {
                lottieAnimationView.setImageResource(2131232150);
            } else {
                lottieAnimationView.setImageResource(2131231909);
            }
            iedVar = null;
        } else {
            iedVar = null;
            textView.setText((java.lang.CharSequence) null);
            textView.setBackground(null);
            textView2.setText((java.lang.CharSequence) null);
            gradientDrawable.setColors(null);
            textView3.setText((java.lang.CharSequence) null);
            textView3.setOnClickListener(null);
            textView4.setText(this.j.getString(2132018192));
        }
        defpackage.ied iedVar2 = (kjeVar == null || (kjgVar = kjeVar.b) == null) ? iedVar : kjgVar.a;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(2131427499);
        aooh.c(viewGroup);
        int childCount = viewGroup.getChildCount();
        if (iedVar2 == null) {
            if (childCount != 0) {
                defpackage.hgz.f(defpackage.hgz.a(this.j, viewGroup));
            }
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        if (childCount == 0) {
            ahvr.f(view, defpackage.ieh.class, new defpackage.kiz(this, i));
        }
        android.view.View viewA = defpackage.hgz.a(this.j, viewGroup);
        defpackage.heq heqVarL = defpackage.hhb.l(defpackage.iek.a.m());
        heqVarL.z(iedVar2);
        heqVarL.B();
        heqVarL.C();
        heqVarL.A();
        defpackage.hgz.c(viewA, heqVarL.y());
        defpackage.hgz.d(viewA, new defpackage.kja(iedVar2, this, 0));
    }

    public final void c(java.lang.String str) {
        if (this.e == null) {
            throw new java.util.NoSuchElementException();
        }
        aimz aimzVar = zih.a;
        aoov.al(this.k, zih.b.plus(aols.a), 1, new defpackage.apw((aoln) null, this, str, 15));
    }

    public final void d(long j) {
        aimz aimzVar = zih.a;
        aoov.al(this.k, zih.b.plus(aols.a), 1, new defpackage.kjb((aoln) null, this, j, 0));
    }
}
