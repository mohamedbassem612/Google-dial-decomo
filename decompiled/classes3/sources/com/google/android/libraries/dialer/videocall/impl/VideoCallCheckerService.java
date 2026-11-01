package com.google.android.libraries.dialer.videocall.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class VideoCallCheckerService extends defpackage.abyi {
    public static final aimz a = aimz.i("com/google/android/libraries/dialer/videocall/impl/VideoCallCheckerService");
    public static final java.lang.String b = "VideoCallCheckerService";
    private static final aihd f = aihd.s("com.google.android.dialer", "com.google.android.contacts", "com.google.android.apps.tachyon");
    public aaco c;
    final defpackage.abyh d = new defpackage.abyh(this);
    public zjm e;

    public static void e(defpackage.abyg abygVar) {
        try {
            defpackage.aehn aehnVarC = com.google.android.libraries.dialer.videocall.ViLteStatus.c();
            aehnVarC.c = 3;
            com.google.android.libraries.dialer.videocall.ViLteStatus viLteStatusB = aehnVarC.b();
            android.os.Parcel parcelEP = abygVar.eP();
            yld.d(parcelEP, viLteStatusB);
            abygVar.eS(1, parcelEP);
        } catch (android.os.RemoteException e) {
            a.by(a.c(), "Could not invoke onComplete callback", "com/google/android/libraries/dialer/videocall/impl/VideoCallCheckerService", "setCallbackUnknownError", (char) 272, "VideoCallCheckerService.java", e);
        }
    }

    public final android.telecom.PhoneAccount c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (dvx.c(this, "android.permission.READ_PHONE_STATE") != 0) {
            return null;
        }
        return ((android.telecom.TelecomManager) getSystemService(android.telecom.TelecomManager.class)).getPhoneAccount(phoneAccountHandle);
    }

    public final boolean d(int i) {
        if (f.contains(getPackageManager().getNameForUid(i))) {
            return this.c.c(i);
        }
        return false;
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.d;
    }
}
