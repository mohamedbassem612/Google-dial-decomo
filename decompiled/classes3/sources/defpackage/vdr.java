package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vdr implements defpackage.vdz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.telecom.PhoneAccountHandle a;

    public /* synthetic */ vdr(android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.a = phoneAccountHandle;
    }

    @Override // defpackage.vdz
    public final ajcq a(vfj vfjVar) {
        int i = this.$cid;
        if (i == 0) {
            return vfjVar.e(this.a);
        }
        if (i == 1) {
            return vfjVar.c(this.a);
        }
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.a;
        return i != 2 ? vfjVar.d(phoneAccountHandle) : vfjVar.k(phoneAccountHandle);
    }
}
