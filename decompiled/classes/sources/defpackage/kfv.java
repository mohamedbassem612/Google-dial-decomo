package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kfv {
    private static final defpackage.kcq b = new defpackage.kcq();
    private final j$.util.Optional a;

    public kfv(j$.util.Optional optional) {
        if (optional == null) {
            defpackage.aooh.i("debugDumpRefreshCallLogDebugEventRecorder");
        }
        this.a = optional;
    }

    public final defpackage.kcq a() {
        j$.util.Optional optional = this.a;
        if (optional == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.kcq kcqVar = (defpackage.kcq) optional.orElse((java.lang.Object) null);
        return kcqVar == null ? b : kcqVar;
    }
}
