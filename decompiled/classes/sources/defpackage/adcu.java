package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adcu implements defpackage.ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ adcu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((defpackage.acxd) obj).b);
            case 1:
                return java.lang.Boolean.valueOf(((defpackage.acxd) obj).c);
            case 2:
                return java.lang.Boolean.valueOf(((defpackage.acxd) obj).a);
            case 3:
                return defpackage.adct.a;
            case 4:
                defpackage.akof akofVar = ((defpackage.adfl) obj).b;
                return akofVar == null ? defpackage.akof.a : akofVar;
            case 5:
                return (defpackage.akof) obj;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((com.google.android.libraries.micore.superpacks.common.Slice) obj).h(true, false);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ahyo ahyoVar = (defpackage.ahyo) obj;
                ahyoVar.getClass();
                return ahyoVar.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.util.Set set = defpackage.adik.a;
                return obj != null ? obj.toString() : "";
            case 9:
                return java.lang.Integer.valueOf(((com.google.android.libraries.micore.superpacks.SuperpackManifest) obj).a());
            case 10:
                break;
            case 11:
                return ((defpackage.aemh) obj).c();
            case 12:
                return ((defpackage.adff) obj).c();
            case 13:
                return ((defpackage.aemh) obj).c();
            case 14:
                return defpackage.ahyn.g(((android.app.ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
            case 15:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k((java.lang.RuntimeException) obj)).l("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 406, "MemoryMetricServiceImpl.java")).v("Metric extension provider failed.");
                break;
            case 16:
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) obj));
            case 17:
                defpackage.aeyx aeyxVar = defpackage.aeyy.a;
                return "";
            case 18:
                return java.lang.Boolean.FALSE;
            case 19:
                break;
            default:
                defpackage.aexj aexjVar = (defpackage.aexj) obj;
                if (aexjVar.a != 29514) {
                    throw aexjVar;
                }
                defpackage.akzx akzxVarM = defpackage.aexy.a.m();
                defpackage.akzx akzxVarM2 = defpackage.aexv.b.m();
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                akzxVarM2.u();
                defpackage.aexv aexvVar = (defpackage.aexv) akzxVarM2.b;
                aexvVar.c |= 8;
                aexvVar.g = jCurrentTimeMillis;
                akzxVarM.u();
                defpackage.aexy aexyVar = (defpackage.aexy) akzxVarM.b;
                defpackage.aexv aexvVar2 = (defpackage.aexv) akzxVarM2.r();
                j$.util.Objects.requireNonNull(aexvVar2);
                aexyVar.c = aexvVar2;
                aexyVar.b |= 1;
                return (defpackage.aexy) akzxVarM.r();
        }
        return null;
    }
}
