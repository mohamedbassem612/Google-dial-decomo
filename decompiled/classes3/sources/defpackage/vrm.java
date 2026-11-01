package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vrm implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vrm(ibk ibkVar, java.lang.String str, boolean z, int i) {
        this.$cid = i;
        this.c = ibkVar;
        this.b = str;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r13v14, types: [adba, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        ibl iblVarD = null;
        if (i == 0) {
            if (this.a) {
                java.lang.Object obj2 = this.c;
                java.lang.Object obj3 = this.b;
                defpackage.vrp.a.b().l("com/android/dialer/voicemail/settings/service/VoicemailSettingsDataService", "setVoicemailTranscriptionEnabled", 291, "VoicemailSettingsDataService.java").v("backfill transcription for voicemails with soda");
                ((defpackage.vrp) obj3).n.s((android.telecom.PhoneAccountHandle) obj2);
            }
        } else if (i == 1) {
            hzm hzmVar = (hzm) obj;
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(hzmVar);
            java.lang.Object obj4 = this.c;
            ibk ibkVar = (ibk) obj4;
            ibkVar.i = optionalOfNullable;
            iblVarD = ibkVar.m.d(hzmVar != null ? dff.m(new hyd(obj4, 3)) : aiql.z(hxe.c), (java.lang.String) this.b, this.a);
            if (hzmVar != null) {
                iblVarD.c = hzmVar.a();
            }
            ibkVar.j = j$.util.Optional.of(iblVarD);
        } else {
            if (i != 2) {
                if (!this.a) {
                    java.lang.Object obj5 = this.c;
                    defpackage.vaa vaaVar = (defpackage.vaa) this.b;
                    defpackage.acvu acvuVar = (defpackage.acvu) obj5;
                    vaaVar.F(1009, acvuVar);
                    akzx akzxVarM = aiwm.a.m();
                    java.lang.String str = acvuVar.e;
                    akzxVarM.u();
                    aiwm aiwmVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(str);
                    aiwmVar.b |= 4;
                    aiwmVar.e = str;
                    java.lang.String str2 = acvuVar.d;
                    akzxVarM.u();
                    aiwm aiwmVar2 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(str2);
                    aiwmVar2.b |= 1;
                    aiwmVar2.c = str2;
                    int i2 = acvuVar.f;
                    akzxVarM.u();
                    aiwm aiwmVar3 = akzxVarM.b;
                    aiwmVar3.b |= 2;
                    aiwmVar3.d = i2;
                    int size = acvuVar.o.size();
                    akzxVarM.u();
                    aiwm aiwmVar4 = akzxVarM.b;
                    aiwmVar4.b |= 8;
                    aiwmVar4.f = size;
                    long j = acvuVar.s;
                    akzxVarM.u();
                    aiwm aiwmVar5 = akzxVarM.b;
                    aiwmVar5.b |= 64;
                    aiwmVar5.i = j;
                    java.lang.String str3 = acvuVar.t;
                    akzxVarM.u();
                    aiwm aiwmVar6 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(str3);
                    aiwmVar6.b |= 128;
                    aiwmVar6.j = str3;
                    aiwm aiwmVarP = akzxVarM.p();
                    defpackage.acvs acvsVar = acvuVar.c;
                    if (acvsVar == null) {
                        acvsVar = defpackage.acvs.a;
                    }
                    long j2 = acvsVar.d;
                    long j3 = acvsVar.f;
                    long j4 = acvsVar.e;
                    akzx akzxVarM2 = aiwr.a.m();
                    int i3 = acvsVar.g;
                    akzxVarM2.u();
                    aiwr aiwrVar = akzxVarM2.b;
                    aiwrVar.b |= 1;
                    aiwrVar.c = i3;
                    long j5 = j4 - j3;
                    akzxVarM2.u();
                    aiwr aiwrVar2 = akzxVarM2.b;
                    aiwrVar2.b |= 2;
                    aiwrVar2.d = j5;
                    akzxVarM2.u();
                    aiwr aiwrVar3 = akzxVarM2.b;
                    aiwrVar3.b |= 4;
                    aiwrVar3.e = j4 - j2;
                    defpackage.acvs acvsVar2 = acvuVar.c;
                    if (acvsVar2 == null) {
                        acvsVar2 = defpackage.acvs.a;
                    }
                    boolean z = acvsVar2.i;
                    akzxVarM2.u();
                    aiwr aiwrVar4 = akzxVarM2.b;
                    aiwrVar4.b |= 8;
                    aiwrVar4.f = z;
                    vaaVar.a.f(aiwmVarP, akzxVarM2.p());
                }
                return defpackage.acyt.b;
            }
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            if (this.a) {
                java.lang.Object obj6 = this.c;
                defpackage.vrp vrpVar = (defpackage.vrp) this.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj6;
                if (vrpVar.l.h(phoneAccountHandle) && !bool.booleanValue()) {
                    lop lopVarE = new jyn(vrpVar.b, phoneAccountHandle).e();
                    lopVarE.b("accept_cellular_data", true);
                    lopVarE.a();
                }
            }
        }
        return iblVarD;
    }

    public /* synthetic */ vrm(defpackage.vrp vrpVar, boolean z, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.b = vrpVar;
        this.a = z;
        this.c = phoneAccountHandle;
    }

    public /* synthetic */ vrm(boolean z, defpackage.vaa vaaVar, defpackage.acvu acvuVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = vaaVar;
        this.c = acvuVar;
    }
}
