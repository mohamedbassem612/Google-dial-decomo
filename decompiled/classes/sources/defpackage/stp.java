package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class stp implements defpackage.agye {
    final /* synthetic */ defpackage.stq a;

    public stp(defpackage.stq stqVar) {
        j$.util.Objects.requireNonNull(stqVar);
        this.a = stqVar;
    }

    @Override // defpackage.agye
    public final void a(java.lang.Throwable th) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.stq.a.d()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/postcall/impl/ui/PostCallFragmentPeer$1", "onError", 'T', "PostCallFragmentPeer.java")).v("failed to load selected post call feature integration fragment");
    }

    @Override // defpackage.agye
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        stf stfVar;
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (optional.isPresent()) {
            defpackage.stq stqVar = this.a;
            defpackage.stm stmVar = stqVar.b.b;
            defpackage.agsm.i(836, stmVar.d.p(stmVar.e.bl(new lbn(11))), "fail to clear logged post call data", new java.lang.Object[0]);
            int i = ((stj) optional.orElseThrow()).c;
            if (i == 0) {
                stfVar = stf.a;
            } else if (i == 1) {
                stfVar = stf.b;
            } else if (i == 2) {
                stfVar = stf.c;
            } else if (i == 3) {
                stfVar = stf.d;
            } else if (i != 4) {
                stfVar = i != 5 ? null : stf.f;
            } else {
                stfVar = stf.e;
            }
            if (stfVar == null) {
                stfVar = stf.g;
            }
            defpackage.zzx zzxVar = stqVar.g;
            if (zzxVar.k().containsKey(stfVar)) {
                stg stgVar = (stg) ((defpackage.aoin) zzxVar.k().get(stfVar)).a();
                defpackage.u uVar = new defpackage.u(stqVar.c.I());
                uVar.q(2131428711, stgVar.a(), null);
                uVar.c();
                stqVar.d.o(defpackage.rmx.POST_CALL_EVENT_TRIGGERED);
            }
            stqVar.i.bm(defpackage.rmu.CALL_END_WITHIN_APP);
        }
    }

    @Override // defpackage.agye
    public final /* synthetic */ void c() {
    }
}
