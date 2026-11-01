package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vrn implements agxi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ android.telecom.PhoneAccountHandle a;
    public final /* synthetic */ java.lang.Object b;

    public vrn(defpackage.vrp vrpVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.a = phoneAccountHandle;
        j$.util.Objects.requireNonNull(vrpVar);
        this.b = vrpVar;
    }

    public final ajbg a() {
        if (this.$cid != 0) {
            android.telecom.PhoneAccountHandle phoneAccountHandle = this.a;
            defpackage.vpz vpzVar = (defpackage.vpz) this.b;
            return new ajbg(aosv.F(vpzVar.c, 0, new defpackage.vpx(vpzVar, phoneAccountHandle, null), 3));
        }
        defpackage.vrp vrpVar = (defpackage.vrp) this.b;
        hjx hjxVarIF = ((vro) agab.aH(vrpVar.b, vro.class)).iF();
        android.telecom.PhoneAccountHandle phoneAccountHandle2 = this.a;
        aooc.ao(phoneAccountHandle2);
        hjxVarIF.a = phoneAccountHandle2;
        aooc.an(hjxVarIF.a, android.telecom.PhoneAccountHandle.class);
        ajcq ajcqVarD = new hjz((him) hjxVarIF.b, (android.telecom.PhoneAccountHandle) hjxVarIF.a).M.d();
        if (((java.lang.Boolean) vrpVar.h.a()).booleanValue()) {
            ajcqVarD = ahvr.H(ajcqVarD, ahqx.a(new defpackage.vmb(this, 16)), vrpVar.c);
        }
        return new ajbg(ahvr.H(ajcqVarD, new defpackage.vmj(18), vrpVar.c));
    }

    public final ajcq b() {
        if (this.$cid == 0) {
            return ajcm.a;
        }
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.a;
        defpackage.vpz vpzVar = (defpackage.vpz) this.b;
        return aosv.F(vpzVar.c, 0, new defpackage.vjf(vpzVar, phoneAccountHandle, (aoln) null, 6), 3);
    }

    public final /* synthetic */ java.lang.Object e() {
        return this.$cid != 0 ? defpackage.vpz.b : defpackage.agxz.b(aihd.r(new agxj("voicemail_settings_store_data_source_key"), new agxj("voicemail_settings_data_service_key")));
    }

    public vrn(defpackage.vpz vpzVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.b = vpzVar;
        this.a = phoneAccountHandle;
    }
}
