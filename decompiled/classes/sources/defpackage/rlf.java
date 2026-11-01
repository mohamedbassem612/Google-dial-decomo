package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rlf implements defpackage.rkt {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public rlf(java.util.List list, int i) {
        this.$cid = i;
        if (list == null) {
            defpackage.aooh.i("buildTypes");
        }
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rkt] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rkt
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        defpackage.rku rkuVar;
        if (this.$cid == 0) {
            if (obj == null) {
                defpackage.aooh.i("state");
            }
            defpackage.alat<defpackage.rli> alatVar = ((defpackage.rln) obj).a().e;
            defpackage.aooh.e(alatVar, "getSimStatesList(...)");
            if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                for (defpackage.rli rliVar : alatVar) {
                    ?? r2 = this.a;
                    if (rliVar == null) {
                        defpackage.aooh.g();
                    }
                    if (r2.a(rliVar)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (obj == null) {
            defpackage.aooh.i("state");
        }
        ?? r3 = this.a;
        switch (((defpackage.rln) obj).a().d) {
            case 0:
                rkuVar = defpackage.rku.BUILD_TYPE_UNSPECIFIED;
                break;
            case 1:
                rkuVar = defpackage.rku.BUGFOOD;
                break;
            case 2:
                rkuVar = defpackage.rku.FISHFOOD;
                break;
            case 3:
                rkuVar = defpackage.rku.DOGFOOD;
                break;
            case 4:
                rkuVar = defpackage.rku.PUBLIC_BETA;
                break;
            case 5:
                rkuVar = defpackage.rku.RELEASE;
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                rkuVar = defpackage.rku.TEST;
                break;
            default:
                rkuVar = null;
                break;
        }
        if (rkuVar == null) {
            rkuVar = defpackage.rku.UNRECOGNIZED;
        }
        return r3.contains(rkuVar);
    }

    public rlf(defpackage.rkt rktVar, int i) {
        this.$cid = i;
        this.a = rktVar;
    }
}
