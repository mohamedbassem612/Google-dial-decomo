package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vla extends android.telephony.TelephonyManager.BootstrapAuthenticationCallback {
    final /* synthetic */ dsd a;

    public vla(vlb vlbVar, dsd dsdVar) {
        this.a = dsdVar;
        j$.util.Objects.requireNonNull(vlbVar);
    }

    public final void onAuthenticationFailure(int i) {
        defpackage.vbx vbxVar;
        super.onAuthenticationFailure(i);
        vlb.a.d().i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/GbaCredentialProvider$1", "onAuthenticationFailure", 105, "GbaCredentialProvider.java").w("GBA failed with reason: %d", i);
        if (i == 1) {
            vbxVar = defpackage.vbx.GBA_AUTHENTICATION_FAILURE_FEATURE_NOT_SUPPORTED;
        } else if (i == 2) {
            vbxVar = defpackage.vbx.GBA_AUTHENTICATION_FAILURE_FEATURE_NOT_READY;
        } else if (i == 3) {
            vbxVar = defpackage.vbx.GBA_AUTHENTICATION_FAILURE_NETWORK_FAILURE;
        } else if (i != 4) {
            vbxVar = i != 5 ? defpackage.vbx.GBA_AUTHENTICATION_FAILURE_UNKNOWN : defpackage.vbx.GBA_AUTHENTICATION_FAILURE_SECURITY_PROTOCOL_NOT_SUPPORTED;
        } else {
            vbxVar = defpackage.vbx.GBA_AUTHENTICATION_FAILURE_INCORRECT_NAF_ID;
        }
        this.a.d(new defpackage.vcx(vbxVar, "VVM failure reason: " + vbxVar.a()));
    }

    public final void onKeysAvailable(byte[] bArr, java.lang.String str) {
        super.onKeysAvailable(bArr, str);
        akzx akzxVarM = orj.a.m();
        akzx akzxVarM2 = ori.a.m();
        akzxVarM2.u();
        ori oriVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        oriVar.b |= 1;
        oriVar.c = str;
        java.lang.String strK = aish.e.k(bArr);
        akzxVarM2.u();
        ori oriVar2 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(strK);
        oriVar2.b |= 2;
        oriVar2.d = strK;
        akzxVarM.u();
        orj orjVar = akzxVarM.b;
        ori oriVarP = akzxVarM2.p();
        j$.util.Objects.requireNonNull(oriVarP);
        orjVar.c = oriVarP;
        orjVar.b = 2;
        this.a.b(akzxVarM.p());
    }
}
