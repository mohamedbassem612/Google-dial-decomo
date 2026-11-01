package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vdu implements defpackage.vdz {
    public final /* synthetic */ android.telecom.PhoneAccountHandle a;
    public final /* synthetic */ defpackage.vbz b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vdu(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vbz vbzVar, boolean z) {
        this.a = phoneAccountHandle;
        this.b = vbzVar;
        this.c = z;
    }

    @Override // defpackage.vdz
    public final ajcq a(vfj vfjVar) {
        defpackage.vcn vcnVar = this.b.c;
        if (vcnVar == null) {
            vcnVar = defpackage.vcn.a;
        }
        return vfjVar.i(this.a, vcnVar, this.c);
    }
}
