package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vds implements defpackage.vdz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.telecom.PhoneAccountHandle a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vds(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, int i) {
        this.$cid = i;
        this.a = phoneAccountHandle;
        this.b = z;
    }

    @Override // defpackage.vdz
    public final ajcq a(vfj vfjVar) {
        if (this.$cid == 0) {
            return vfjVar.l(this.a);
        }
        return vfjVar.a(this.a, this.b);
    }
}
