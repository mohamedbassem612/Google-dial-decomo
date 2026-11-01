package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rqt implements defpackage.rnv {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/main/impl/ui/searchcontainer/DialpadMainScreenFeatureProvider");
    private final defpackage.teh b;
    private final defpackage.aiyy c;

    public rqt(defpackage.aiyy aiyyVar, defpackage.teh tehVar) {
        if (aiyyVar == null) {
            defpackage.aooh.i("stateHolder");
        }
        this.c = aiyyVar;
        this.b = tehVar;
    }

    @Override // defpackage.rnv
    public final defpackage.aw a() {
        ((defpackage.aimw) a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadMainScreenFeatureProvider", "createScreen", 29, "DialpadMainScreenFeatureProvider.kt")).v("creating dialpad fragment");
        if (this.b.a()) {
            rrh rrhVar = rri.a;
            rqv rqvVarE = ((defpackage.rrw) this.c.a).a;
            if (rqvVarE == null) {
                rqvVarE = defpackage.pez.bw(rqv.a.m()).E();
            }
            return defpackage.pez.bc(rqvVarE);
        }
        defpackage.aimz aimzVar = rqz.a;
        rqv rqvVarE2 = ((defpackage.rrw) this.c.a).a;
        if (rqvVarE2 == null) {
            rqvVarE2 = defpackage.pez.bw(rqv.a.m()).E();
        }
        return defpackage.pez.be(rqvVarE2);
    }

    @Override // defpackage.rnv
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.ipc ipcVarAb = defpackage.ttj.ab(defpackage.rob.a.m());
        ipcVarAb.aV(defpackage.roc.DIALPAD_KEY);
        ipcVarAb.aW(true);
        ipcVarAb.aU(false);
        return ipcVarAb.aT();
    }

    @Override // defpackage.rnv
    public final java.lang.String c() {
        return "dialpad_fragment";
    }

    @Override // defpackage.rnv
    public final java.util.Set d() {
        return defpackage.aoke.a;
    }
}
