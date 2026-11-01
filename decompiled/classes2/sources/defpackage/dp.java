package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dp implements gd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ dq a;

    public dp(dq dqVar, int i) {
        this.$cid = i;
        this.a = dqVar;
    }

    public final void a(ft ftVar, boolean z) {
        if (this.$cid != 0) {
            this.a.B(ftVar);
            return;
        }
        ft ftVarA = ftVar.a();
        ft ftVar2 = ftVarA != ftVar ? ftVarA : ftVar;
        dq dqVar = this.a;
        do doVarW = dqVar.w(ftVar2);
        if (doVarW != null) {
            if (ftVarA == ftVar) {
                dqVar.C(doVarW, z);
            } else {
                dqVar.A(doVarW.a, doVarW, ftVarA);
                dqVar.C(doVarW, true);
            }
        }
    }

    public final boolean b(ft ftVar) {
        android.view.Window.Callback callbackX;
        if (this.$cid != 0) {
            android.view.Window.Callback callbackX2 = this.a.x();
            if (callbackX2 != null) {
                callbackX2.onMenuOpened(108, ftVar);
            }
        } else if (ftVar == ftVar.a()) {
            dq dqVar = this.a;
            if (dqVar.x && (callbackX = dqVar.x()) != null && !dqVar.E) {
                callbackX.onMenuOpened(108, ftVar);
            }
        }
        return true;
    }
}
