package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vrx implements defpackage.ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vrx(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return j$.util.Collection.-EL.stream((defpackage.aify) obj).anyMatch(new defpackage.vgb(9)) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            case 1:
                return ((java.lang.Boolean) obj).booleanValue() ? vrr.a : vrr.b;
            case 2:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vth.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/settings/storage/VoicemailSettingsStore", "clearGoogleTranscription", 223, "VoicemailSettingsStore.java")).y("cleared %d voicemail transcription", (java.lang.Integer) obj);
                return null;
            case 3:
                if (j$.util.Collection.-EL.stream((java.util.List) obj).anyMatch(new defpackage.vgb(10))) {
                    defpackage.akzx akzxVarM = defpackage.vtn.a.m();
                    akzxVarM.u();
                    defpackage.vtn vtnVar = (defpackage.vtn) akzxVarM.b;
                    vtnVar.b |= 1;
                    vtnVar.c = true;
                    akzxVarM.u();
                    defpackage.vtn vtnVar2 = (defpackage.vtn) akzxVarM.b;
                    vtnVar2.d = 1;
                    vtnVar2.b |= 2;
                    return (defpackage.vtn) akzxVarM.r();
                }
                defpackage.akzx akzxVarM2 = defpackage.vtn.a.m();
                akzxVarM2.u();
                defpackage.vtn vtnVar3 = (defpackage.vtn) akzxVarM2.b;
                vtnVar3.b |= 1;
                vtnVar3.c = false;
                akzxVarM2.u();
                defpackage.vtn vtnVar4 = (defpackage.vtn) akzxVarM2.b;
                vtnVar4.d = 3;
                vtnVar4.b |= 2;
                return (defpackage.vtn) akzxVarM2.r();
            case 4:
                java.lang.String[] strArr = defpackage.vva.a;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                throw new java.lang.IllegalStateException("voicemail content still missing after fetch");
            case 5:
                java.lang.String[] strArr2 = defpackage.vva.a;
                return null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(!((java.lang.Boolean) obj).booleanValue());
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                vts vtsVar = (vts) obj;
                if ((vtsVar.b & 1) == 0) {
                    return j$.util.Optional.empty();
                }
                vtt vttVar = vtsVar.d;
                if (vttVar == null) {
                    vttVar = vtt.a;
                }
                return j$.util.Optional.of(vttVar);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.valueOf(((vvn) obj).c);
            case 9:
                defpackage.akzx akzxVarM3 = vvn.a.m();
                akzxVarM3.u();
                vvn vvnVar = akzxVarM3.b;
                vvnVar.b |= 1;
                vvnVar.c = false;
                return akzxVarM3.r();
            case 10:
                vyj vyjVar = (vyj) obj;
                if (vyjVar.b.isPresent()) {
                    return -1L;
                }
                defpackage.kiu kiuVar = vyjVar.a.d;
                if (kiuVar == null) {
                    kiuVar = defpackage.kiu.a;
                }
                return java.lang.Long.valueOf(kiuVar.d);
            case 11:
                zul zulVar = (zul) obj;
                if (zulVar.equals(zul.b)) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.vyu.a.b()).l("com/android/dialer/voicemail/wear/WearVoicemailNotificationSender", "attachDismissalIdAndSendVoicemailNotificationToWear", 62, "WearVoicemailNotificationSender.java")).v("Recipient node offline.");
                    return null;
                }
                if (zulVar.equals(zul.a)) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.vyu.a.b()).l("com/android/dialer/voicemail/wear/WearVoicemailNotificationSender", "attachDismissalIdAndSendVoicemailNotificationToWear", 69, "WearVoicemailNotificationSender.java")).v("Synced voicemail notification to wear.");
                    return null;
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vyu.a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/wear/WearVoicemailNotificationSender", "attachDismissalIdAndSendVoicemailNotificationToWear", 'C', "WearVoicemailNotificationSender.java")).y("Failed to sync voicemail notification to wear due to : %s", zulVar);
                return null;
            case 12:
                return (defpackage.aigf) j$.util.Collection.-EL.stream((defpackage.aify) obj).collect(defpackage.aido.b(new vun(9), new vun(10)));
            case 13:
                return (defpackage.aify) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).map(new vun(16)).collect(defpackage.aido.a);
            case 14:
                return (defpackage.aigf) j$.util.Collection.-EL.stream((defpackage.aify) obj).collect(defpackage.aido.b(new vun(12), new vun(15)));
            case 15:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.whj.a.b()).l("com/android/dialer/xatu/impl/calllog/XatuCallLogDataSource", "handleDeletes", 230, "XatuCallLogDataSource.java")).y("removed %d entries", (java.lang.Integer) obj);
                return null;
            case 16:
                return null;
            case 17:
                return null;
            case 18:
                apjb apjbVar = (apjb) obj;
                defpackage.aigf aigfVar = whz.a;
                if (apjbVar.n()) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) whz.b.b()).i(defpackage.zct.a)).l("com/android/dialer/xatu/impl/donation/ScottyUploadChannel", "upload", 130, "ScottyUploadChannel.java")).y("Xatu Scotty send failed: %s", ((ammv) apjbVar.a).a);
                }
                if (!apjbVar.m()) {
                    return apjbVar;
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) whz.b.b()).i(defpackage.zct.a)).l("com/android/dialer/xatu/impl/donation/ScottyUploadChannel", "upload", (char) 136, "ScottyUploadChannel.java")).y("Xatu Scotty send completed with %s", ((amwp) apjbVar.b).c());
                return apjbVar;
            case 19:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    ((defpackage.aimw) ((defpackage.aimw) wif.a.b()).l("com/android/dialer/xatu/impl/feedback/XatuFeedbackBuilder", "loadMetrics", 49, "XatuFeedbackBuilder.java")).v("Xatu data absent.");
                    return wqs.a;
                }
                wqt wqtVar = ((wqp) optional.orElseThrow()).e;
                if (wqtVar == null) {
                    wqtVar = wqt.a;
                }
                wqs wqsVar = wqtVar.c;
                return wqsVar == null ? wqs.a : wqsVar;
            default:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    wqt wqtVar2 = ((wqp) optionalOfNullable.get()).e;
                    if (wqtVar2 == null) {
                        wqtVar2 = wqt.a;
                    }
                    wgu wguVar = wqtVar2.d;
                    if (wguVar == null) {
                        wguVar = wgu.a;
                    }
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(wguVar.c));
                }
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                return ((java.lang.Boolean) optionalOfNullable.orElse(bool)).booleanValue() ? java.lang.Boolean.FALSE : bool;
        }
    }
}
