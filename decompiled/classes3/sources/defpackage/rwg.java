package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rwg implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ rwg(int i, android.telecom.PhoneAccountHandle phoneAccountHandle, java.util.concurrent.atomic.AtomicReference atomicReference, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = phoneAccountHandle;
        this.c = atomicReference;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        defpackage.vbw vbwVar;
        int i = this.$cid;
        if (i == 0) {
            int i2 = this.a;
            java.lang.Object obj2 = this.b;
            ((j$.util.Optional) this.c).ifPresentOrElse(new qss(obj2, i2, 2), new eyd(obj2, i2, 7));
        } else {
            if (i != 1) {
                if (i == 2) {
                    defpackage.xqt xqtVar = (defpackage.xqt) obj;
                    java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(xqtVar.b);
                    int i3 = this.a;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
                    if (mapUnmodifiableMap.containsKey(numValueOf)) {
                        optionalOf = j$.util.Optional.of(new android.telecom.PhoneAccountHandle(android.content.ComponentName.unflattenFromString(((defpackage.xqs) mapUnmodifiableMap.get(numValueOf)).c), ((defpackage.xqs) mapUnmodifiableMap.get(numValueOf)).d));
                    } else {
                        defpackage.vah.a.b().l("com/android/dialer/voicemail/dualsim/impl/SimPhoneAccountRecords", "getExistingPhoneAccountAtSlot", 111, "SimPhoneAccountRecords.java").w("No existing phoneAccount at slot: %d", i3);
                        optionalOf = j$.util.Optional.empty();
                    }
                    java.lang.Object obj3 = this.c;
                    android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.b;
                    defpackage.vag vagVar = new defpackage.vag(phoneAccountHandle, i3, (java.util.concurrent.atomic.AtomicReference) obj3, 0);
                    if (true == optionalOf.isPresent()) {
                        java.lang.Object obj4 = optionalOf.get();
                        java.lang.Object obj5 = vagVar.b;
                        int i4 = vagVar.a;
                        java.lang.Object obj6 = vagVar.c;
                        if (!((android.telecom.PhoneAccountHandle) obj4).equals(obj5)) {
                            defpackage.vah.a.b().l("com/android/dialer/voicemail/dualsim/impl/SimPhoneAccountRecords", "replaceExistingPhoneAccount", 86, "SimPhoneAccountRecords.java").w("SIM at slot %d replaced", i4);
                            ((java.util.concurrent.atomic.AtomicReference) obj6).set(j$.util.Optional.of(obj4));
                        }
                    }
                    akzx akzxVarP = xqtVar.p();
                    akzx akzxVarM = defpackage.xqs.a.m();
                    java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
                    akzxVarM.u();
                    defpackage.xqs xqsVar = (defpackage.xqs) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strFlattenToString);
                    xqsVar.b |= 1;
                    xqsVar.c = strFlattenToString;
                    java.lang.String id = phoneAccountHandle.getId();
                    akzxVarM.u();
                    defpackage.xqs xqsVar2 = (defpackage.xqs) akzxVarM.b;
                    j$.util.Objects.requireNonNull(id);
                    xqsVar2.b |= 2;
                    xqsVar2.d = id;
                    defpackage.xqs xqsVar3 = (defpackage.xqs) akzxVarM.p();
                    j$.util.Objects.requireNonNull(xqsVar3);
                    akzxVarP.u();
                    defpackage.xqt xqtVar2 = (defpackage.xqt) akzxVarP.b;
                    albe albeVar = xqtVar2.b;
                    if (!albeVar.b) {
                        xqtVar2.b = albeVar.a();
                    }
                    xqtVar2.b.put(numValueOf, xqsVar3);
                    return (defpackage.xqt) akzxVarP.p();
                }
                java.lang.Object obj7 = this.c;
                int i5 = this.a;
                java.lang.Object obj8 = this.b;
                if (!(obj7 instanceof defpackage.vex)) {
                    if (!(obj7 instanceof java.util.concurrent.TimeoutException)) {
                        throw new defpackage.ahzr((java.lang.Throwable) obj7);
                    }
                    ((vku) obj8).d(i5, j$.util.Optional.empty(), j$.util.Optional.empty(), 3);
                    throw new defpackage.vcx(((java.lang.Exception) obj7).getMessage(), defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_TIMED_OUT);
                }
                j$.util.Optional optional = ((defpackage.vex) obj7).a;
                ((vku) obj8).d(i5, optional, j$.util.Optional.empty(), 3);
                if (optional.isEmpty()) {
                    vbwVar = defpackage.vbw.FAILED_SENDING_SMS_TO_SMS_SERVER;
                } else {
                    int iIntValue = ((java.lang.Integer) optional.orElseThrow()).intValue();
                    if (iIntValue == 0) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_CANCELLED;
                    } else if (iIntValue == 1) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_GENERIC_FAILURE;
                    } else if (iIntValue == 2) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_ERROR_RADIO_OFF;
                    } else if (iIntValue == 3) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_ERROR_NULL_PDU;
                    } else if (iIntValue == 4) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_NO_SERVICE;
                    } else if (iIntValue == 16) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_MODEM_ERROR;
                    } else if (iIntValue == 17) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_NETWORK_ERROR;
                    } else if (iIntValue == 101) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_FAIL_RETRY;
                    } else if (iIntValue == 102) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_RIL_NETWORK_REJECT;
                    } else if (iIntValue == 111) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_RIL_MODEM_ERR;
                    } else if (iIntValue == 112) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_RIL_NETWORK_ERR;
                    } else if (iIntValue == 116) {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_RIL_NETWORK_NOT_READY;
                    } else if (iIntValue != 122) {
                        vbwVar = iIntValue != 124 ? defpackage.vbw.FAILED_SENDING_SMS_TO_SMS_SERVER : defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_RIL_GENERIC_ERROR;
                    } else {
                        vbwVar = defpackage.vbw.SENDING_SMS_TO_SMS_SERVER_RIL_ACCESS_BARRED;
                    }
                }
                if (!optional.isPresent() || vku.b.contains(optional.orElseThrow())) {
                    throw new defpackage.vcx(((java.lang.Exception) obj7).getMessage(), vbwVar);
                }
                throw new defpackage.vcv(vbwVar, "OMTP VVM error state: " + vbwVar.a(), (java.lang.Throwable) obj7);
            }
            j$.util.Optional optional2 = (j$.util.Optional) obj;
            if (optional2.isPresent()) {
                java.lang.Object obj9 = this.c;
                int i6 = this.a;
                rmo rmoVar = (rmo) this.b;
                akzx akzxVarH = rmoVar.H();
                akzx akzxVarM2 = amrb.a.m();
                java.lang.String str = (java.lang.String) optional2.orElseThrow();
                akzxVarM2.u();
                amrb amrbVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str);
                amrbVar.b |= 2;
                amrbVar.d = str;
                akzxVarM2.u();
                amrb amrbVar2 = akzxVarM2.b;
                amrbVar2.c = i6 - 1;
                amrbVar2.b |= 1;
                akzxVarM2.u();
                amrb amrbVar3 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(obj9);
                amrbVar3.e = (defpackage.amra) obj9;
                amrbVar3.b |= 4;
                amrb amrbVarP = akzxVarM2.p();
                akzxVarH.u();
                ampv ampvVar = akzxVarH.b;
                ampv ampvVar2 = ampv.a;
                j$.util.Objects.requireNonNull(amrbVarP);
                ampvVar.l = amrbVarP;
                ampvVar.b |= 4194304;
                rmoVar.G(akzxVarH.p());
            }
        }
        return null;
    }

    public /* synthetic */ rwg(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    public /* synthetic */ rwg(rmo rmoVar, int i, defpackage.amra amraVar, int i2) {
        this.$cid = i2;
        this.b = rmoVar;
        this.a = i;
        this.c = amraVar;
    }
}
