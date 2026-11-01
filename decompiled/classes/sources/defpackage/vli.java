package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vli implements defpackage.vcc {
    public final android.content.Context a;
    public final defpackage.vth b;
    public final defpackage.zth c;
    public final defpackage.rlv d;
    public final defpackage.vvl e;
    public final defpackage.zzx f;
    public final defpackage.aogc g;
    private final defpackage.ajct h;
    private final defpackage.ajct i;
    private final defpackage.vln j;
    private final defpackage.aoin k;
    private final defpackage.vze l;
    private final defpackage.zzx m;

    public vli(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.vth vthVar, defpackage.zth zthVar, defpackage.aogc aogcVar, defpackage.vln vlnVar, defpackage.zzx zzxVar, defpackage.vze vzeVar, defpackage.vvl vvlVar, defpackage.rlv rlvVar, defpackage.zzx zzxVar2, defpackage.aoin aoinVar) {
        this.a = context;
        this.h = ajctVar;
        this.i = ajctVar2;
        this.b = vthVar;
        this.c = zthVar;
        this.g = aogcVar;
        this.j = vlnVar;
        this.m = zzxVar;
        this.l = vzeVar;
        this.e = vvlVar;
        this.d = rlvVar;
        this.f = zzxVar2;
        this.k = aoinVar;
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(java.lang.Boolean.TRUE);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(this.l.b(phoneAccountHandle), new vge(this, 13), this.h);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.F(new defpackage.vms(this, phoneAccountHandle, 1), this.i);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.P(new vez(this, phoneAccountHandle, 20), this.i);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this.d.o(defpackage.rmx.VVM_ACCOUNT_STATE_REMOVE_ACCOUNT_STARTED);
        return defpackage.ahvr.H(this.l.f(phoneAccountHandle), new vfp(this, phoneAccountHandle, 7), this.h);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(j$.util.Optional.empty());
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle, j$.util.Optional optional) {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq h(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        return defpackage.ahvr.O(new rrq(this, phoneAccountHandle, z, 3), this.i);
    }

    @Override // defpackage.vcc
    public final j$.util.Optional i(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.vcc
    public final void k(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        this.b.a(phoneAccountHandle, z);
    }

    @Override // defpackage.vcc
    public final boolean l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.aoin aoinVar = this.k;
        boolean zR = this.j.r(phoneAccountHandle);
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            if (zR) {
                return false;
            }
            zR = false;
        }
        if (!this.m.m()) {
            int iC = this.b.c(phoneAccountHandle);
            if (iC == 3) {
                if (zR) {
                    return false;
                }
            } else if (iC != 1) {
                return false;
            }
        } else if (zR) {
            return false;
        }
        return true;
    }

    public final defpackage.ajcq m(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        return defpackage.ahvr.F(new nyn(this, phoneAccountHandle, z, 6), this.i);
    }

    @Override // defpackage.vcc
    public final void j(android.telecom.PhoneAccountHandle phoneAccountHandle, j$.util.Optional optional) {
    }
}
