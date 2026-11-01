package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vyz implements dxx {
    public final /* synthetic */ vze a;
    public final /* synthetic */ vzi b;

    public /* synthetic */ vyz(vze vzeVar, vzi vziVar) {
        this.a = vzeVar;
        this.b = vziVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        vzi vziVar;
        vze vzeVar;
        boolean z;
        vzi vziVarC;
        char c;
        this = this;
        vzj vzjVar = (vzj) obj;
        akzx akzxVarP = vzjVar.p();
        akzxVarP.u();
        akzxVarP.b.c = albq.a;
        java.util.Iterator it = vzjVar.c.iterator();
        boolean z2 = false;
        while (true) {
            vziVar = this.b;
            vzeVar = this.a;
            if (!it.hasNext()) {
                break;
            }
            vzi vziVar2 = (vzi) it.next();
            if (vziVar2.e.equals(vziVar.e) && vziVar2.f.equals(vziVar.f)) {
                if ((vziVar2.b & 16) == 0 || (vziVar.b & 16) == 0) {
                    z = true;
                } else {
                    vcp vcpVar = vziVar2.g;
                    if (vcpVar == null) {
                        vcpVar = vcp.a;
                    }
                    java.lang.String strG = vze.g(vcpVar);
                    vcp vcpVar2 = vziVar.g;
                    if (vcpVar2 == null) {
                        vcpVar2 = vcp.a;
                    }
                    java.lang.String strG2 = vze.g(vcpVar2);
                    aooh.f(vziVar2, "currentStatus");
                    aooh.f(vziVar, "newStatus");
                    if ((vziVar2.b & 16) == 0 || (vziVar.b & 16) == 0) {
                        c = 0;
                    } else {
                        c = 0;
                        if (wsc.aK(vziVar) - 1 > wsc.aK(vziVar2) - 1) {
                            mgw mgwVar = vzeVar.c;
                            akzx akzxVarM = mhc.a.m();
                            z = true;
                            java.lang.String str = java.lang.String.format("Current Error %s: New Error (ignored): %s", strG, strG2);
                            akzxVarM.u();
                            mhc mhcVar = akzxVarM.b;
                            j$.util.Objects.requireNonNull(str);
                            mhcVar.b = 2;
                            mhcVar.c = str;
                            akzxVarM.p();
                            mgwVar.c();
                            vze.a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl", "logAndMergeErrors", 402, "VoicemailStatusDataServiceImpl.java").I("Existing error is unresolved and has higher priority so not setting new error, Existing error: %s, New error: %s", strG, strG2);
                            akzx akzxVarP2 = vziVar.p();
                            vcp vcpVar3 = vziVar2.g;
                            if (vcpVar3 == null) {
                                vcpVar3 = vcp.a;
                            }
                            akzxVarP2.u();
                            vzi vziVar3 = akzxVarP2.b;
                            j$.util.Objects.requireNonNull(vcpVar3);
                            vziVar3.g = vcpVar3;
                            vziVar3.b |= 16;
                            vzi vziVarP = akzxVarP2.p();
                            vzh vzhVar = vzeVar.b;
                            akzx akzxVarN = vzi.a.n(vziVar2);
                            akzxVarN.z(vziVarP);
                            vziVarC = vzhVar.c(akzxVarN.p());
                        }
                        akzxVarP.ae(vziVarC);
                        vze.a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl", "insertOrUpdateVoicemailStatus", 269, "VoicemailStatusDataServiceImpl.java").y("merged status: %s", vziVarC);
                        z2 = z;
                    }
                    z = true;
                    mgw mgwVar2 = vzeVar.c;
                    akzx akzxVarM2 = mhc.a.m();
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[c] = strG;
                    objArr[1] = strG2;
                    java.lang.String str2 = java.lang.String.format("Overriding current Error %s with new Error: %s", objArr);
                    akzxVarM2.u();
                    mhc mhcVar2 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str2);
                    mhcVar2.b = 2;
                    mhcVar2.c = str2;
                    akzxVarM2.p();
                    mgwVar2.c();
                    vze.a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl", "logAndMergeErrors", 389, "VoicemailStatusDataServiceImpl.java").I("Existing error is lower priority and thus overridden, Existing error: %s, New error: %s", strG, strG2);
                }
                vzh vzhVar2 = vzeVar.b;
                akzx akzxVarN2 = vzi.a.n(vziVar2);
                akzxVarN2.z(vziVar);
                vziVarC = vzhVar2.c(akzxVarN2.p());
                akzxVarP.ae(vziVarC);
                vze.a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl", "insertOrUpdateVoicemailStatus", 269, "VoicemailStatusDataServiceImpl.java").y("merged status: %s", vziVarC);
                z2 = z;
            } else {
                akzxVarP.ae(vziVar2);
            }
        }
        if (!z2) {
            vze.a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl", "insertOrUpdateVoicemailStatus", 276, "VoicemailStatusDataServiceImpl.java").v("insert new status");
            akzxVarP.ae(vzeVar.b.c(vziVar));
        }
        return akzxVarP.p();
    }
}
