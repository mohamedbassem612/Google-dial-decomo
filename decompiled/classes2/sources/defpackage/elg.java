package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elg implements cbm {
    final /* synthetic */ bo a;
    final /* synthetic */ aw b;
    final /* synthetic */ aoop c;
    final /* synthetic */ defpackage.yz d;

    public elg(bo boVar, aw awVar, defpackage.yz yzVar, aoop aoopVar) {
        this.a = boVar;
        this.b = awVar;
        this.d = yzVar;
        this.c = aoopVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ccp, java.lang.Object] */
    public final void a() {
        aw awVar = this.b;
        bo boVar = this.a;
        bt btVarD = boVar.c.d(awVar.l);
        if (btVarD == null || !btVarD.a.equals(awVar)) {
            boVar.T(new java.lang.IllegalStateException(a.bg(awVar, "Fragment ", " is not currently in the FragmentManager")));
        }
        this.d.a.b(btVarD.a.g >= 0 ? new android.support.v4.app.Fragment$SavedState(btVarD.a()) : null);
        if (this.c.a) {
            u uVar = new u(boVar);
            uVar.k(awVar);
            uVar.d();
        } else {
            if (boVar.ac()) {
                return;
            }
            u uVar2 = new u(boVar);
            uVar2.k(awVar);
            uVar2.c();
        }
    }
}
