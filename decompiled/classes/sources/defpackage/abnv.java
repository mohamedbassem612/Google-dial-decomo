package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class abnv implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ abnv(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        boolean zBg;
        if (this.$cid == 0) {
            defpackage.cav cavVar = (defpackage.cav) obj;
            ((java.lang.Integer) obj2).intValue();
            defpackage.aonn aonnVar = defpackage.abny.a;
            cavVar.u(645631879);
            defpackage.abnk abnkVarB = defpackage.abno.b(this.a);
            cavVar.o();
            return abnkVarB;
        }
        defpackage.cav cavVar2 = (defpackage.cav) obj;
        ((java.lang.Integer) obj2).intValue();
        cavVar2.u(-1353689978);
        if (this.a) {
            cavVar2.u(1964815330);
            cavVar2.o();
            zBg = true;
        } else {
            cavVar2.u(1964847601);
            zBg = defpackage.den.bg(cavVar2);
            cavVar2.o();
        }
        cavVar2.o();
        return java.lang.Boolean.valueOf(zBg);
    }
}
