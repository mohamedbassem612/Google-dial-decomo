package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vze {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl");
    public final defpackage.vzh b;
    public final defpackage.mgw c;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final j$.util.Optional f;
    public final defpackage.kaw g;
    public final defpackage.aogc h;
    private final defpackage.ajct i;
    private final defpackage.ajct j;
    private final defpackage.aoin k;
    private final defpackage.aoin l;
    private final defpackage.ahzi m;
    private final defpackage.aogc n;

    public vze(defpackage.aogc aogcVar, defpackage.kaw kawVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.vzh vzhVar, defpackage.aogc aogcVar2, defpackage.mgw mgwVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, j$.util.Optional optional) {
        this.i = ajctVar;
        this.j = ajctVar2;
        this.b = vzhVar;
        this.h = aogcVar;
        this.g = kawVar;
        this.n = aogcVar2;
        this.c = mgwVar;
        this.k = aoinVar;
        this.l = aoinVar2;
        this.m = defpackage.ahvr.bJ(new exm(this, 20), j$.time.Duration.ofSeconds(((java.lang.Long) aoinVar3.a()).longValue()));
        this.d = aoinVar4;
        this.e = aoinVar5;
        this.f = optional;
    }

    public static java.lang.String g(defpackage.vcp vcpVar) {
        vbs vbsVarB;
        vbx vbxVarB;
        vbw vbwVarB;
        int i = vcpVar.b;
        int iX = defpackage.a.X(i);
        if (iX == 0) {
            throw null;
        }
        int i2 = iX - 1;
        if (i2 == 0) {
            if (i == 1) {
                vbsVarB = vbs.b(((java.lang.Integer) vcpVar.c).intValue());
                if (vbsVarB == null) {
                    vbsVarB = vbs.H;
                }
            } else {
                vbsVarB = vbs.a;
            }
            return "GENERAL_FAILURE_REASON.".concat(java.lang.String.valueOf(vbsVarB.name()));
        }
        if (i2 == 1) {
            if (i == 2) {
                vbxVarB = vbx.b(((java.lang.Integer) vcpVar.c).intValue());
                if (vbxVarB == null) {
                    vbxVarB = vbx.o;
                }
            } else {
                vbxVarB = vbx.a;
            }
            return "REST_FAILURE_REASON.".concat(java.lang.String.valueOf(vbxVarB.name()));
        }
        if (i2 != 2) {
            return "Failure not set";
        }
        if (i == 3) {
            vbwVarB = vbw.b(((java.lang.Integer) vcpVar.c).intValue());
            if (vbwVarB == null) {
                vbwVarB = vbw.ab;
            }
        } else {
            vbwVarB = vbw.a;
        }
        return "OMTP_FAILURE_REASON.".concat(java.lang.String.valueOf(vbwVarB.name()));
    }

    public static boolean i(defpackage.vzi vziVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (vziVar.e.equals(phoneAccountHandle.getComponentName().flattenToString())) {
            return vziVar.f.equals(phoneAccountHandle.getId());
        }
        return false;
    }

    public final defpackage.ajcq a(final android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl", "clearVoicemailFailure", 148, "VoicemailStatusDataServiceImpl.java")).v("enter");
        defpackage.ajcq ajcqVarBl = this.h.bl(new defpackage.dxx() { // from class: vza
            @Override // defpackage.dxx
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.vzj vzjVar = (defpackage.vzj) obj;
                defpackage.akzx akzxVarL = vzjVar.L();
                akzxVarL.u();
                ((defpackage.vzj) akzxVarL.b).c = defpackage.albq.a;
                for (defpackage.vzi vziVar : vzjVar.c) {
                    android.telecom.PhoneAccountHandle phoneAccountHandle2 = phoneAccountHandle;
                    if (defpackage.vze.i(vziVar, phoneAccountHandle2)) {
                        defpackage.vze vzeVar = this.a;
                        defpackage.akzx akzxVarL2 = vziVar.L();
                        akzxVarL2.u();
                        defpackage.vzi vziVar2 = (defpackage.vzi) akzxVarL2.b;
                        vziVar2.g = null;
                        vziVar2.b &= -17;
                        if (((java.lang.Boolean) vzeVar.e.a()).booleanValue()) {
                            akzxVarL2.u();
                            defpackage.vzi vziVar3 = (defpackage.vzi) akzxVarL2.b;
                            vziVar3.b |= 64;
                            vziVar3.i = 0;
                        }
                        akzxVarL.ay(akzxVarL2);
                    } else {
                        akzxVarL.ae(vziVar);
                    }
                }
                return (defpackage.vzj) akzxVarL.r();
            }
        });
        h(ajcqVarBl);
        return this.g.p(ajcqVarBl);
    }

    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.H(c(), new defpackage.vuj(phoneAccountHandle, 12), this.j);
    }

    public final defpackage.ajcq c() {
        if (!((java.lang.Boolean) this.k.a()).booleanValue()) {
            return d();
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.l.a()).booleanValue();
        defpackage.ahzi ahziVar = this.m;
        return zBooleanValue ? defpackage.aiql.A((defpackage.ajcq) ahziVar.eZ()) : (defpackage.ajcq) ahziVar.eZ();
    }

    public final defpackage.ajcq d() {
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("source_package").aI("=", "com.google.android.apps.tycho"));
        defpackage.rsr rsrVarAB = rsrVar.aB();
        defpackage.ajcq ajcqVarBk = this.h.bk();
        defpackage.vut vutVar = new defpackage.vut(this, 3);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), vutVar);
        int i = defpackage.ajan.c;
        defpackage.ajct ajctVar = this.i;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarBk, ahqvVar);
        ajcqVarBk.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        defpackage.ajcq ajcqVarG = this.b.g(rsrVarAB);
        defpackage.ahda ahdaVar = new defpackage.ahda(new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajamVar, ajcqVarG})), (byte[]) null), (byte[]) null);
        defpackage.nyf nyfVar = new defpackage.nyf(ajamVar, ajcqVarG, 8);
        defpackage.ajct ajctVar2 = this.j;
        return ahdaVar.e(nyfVar, ajctVar2).h(new defpackage.vut(this, 2), ajctVar2);
    }

    public final defpackage.ajcq e(defpackage.vzi vziVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl", "insertOrUpdateVoicemailStatus", 256, "VoicemailStatusDataServiceImpl.java")).v("enter");
        defpackage.ajcq ajcqVarBl = this.h.bl(new vyz(this, vziVar));
        h(ajcqVarBl);
        return this.g.p(ajcqVarBl);
    }

    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl", "removeVoicemailStatus", 289, "VoicemailStatusDataServiceImpl.java")).v("enter");
        defpackage.ajcq ajcqVarBl = this.h.bl(new tbd(phoneAccountHandle, 5));
        h(ajcqVarBl);
        return this.g.p(ajcqVarBl);
    }

    public final void h(defpackage.ajcq ajcqVar) {
        this.n.t(ajcqVar, new defpackage.agxj("VoicemailStatus"));
    }
}
