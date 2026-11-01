package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vdt implements defpackage.vdz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.telecom.PhoneAccountHandle a;
    public final /* synthetic */ alad b;

    public /* synthetic */ vdt(android.telecom.PhoneAccountHandle phoneAccountHandle, alad aladVar, int i) {
        this.$cid = i;
        this.a = phoneAccountHandle;
        this.b = aladVar;
    }

    @Override // defpackage.vdz
    public final ajcq a(vfj vfjVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.vce vceVar = (defpackage.vce) this.b;
            defpackage.veo veoVar = (vceVar.b == 16 ? (defpackage.vbt) vceVar.c : defpackage.vbt.a).c;
            if (veoVar == null) {
                veoVar = defpackage.veo.a;
            }
            return vfjVar.g(this.a, veoVar);
        }
        if (i == 1) {
            defpackage.vbr vbrVar = (defpackage.vbr) this.b;
            defpackage.vcm vcmVar = vbrVar.c;
            if (vcmVar == null) {
                vcmVar = defpackage.vcm.a;
            }
            return vfjVar.f(this.a, vcmVar, vbrVar.d);
        }
        alad aladVar = this.b;
        if (i == 2) {
            defpackage.vbn vbnVar = (defpackage.vbn) aladVar;
            return vfjVar.b(this.a, vbnVar.b, vbnVar.c);
        }
        defpackage.vci vciVar = ((defpackage.vcb) aladVar).c;
        if (vciVar == null) {
            vciVar = defpackage.vci.a;
        }
        return vfjVar.j(this.a, vciVar);
    }
}
