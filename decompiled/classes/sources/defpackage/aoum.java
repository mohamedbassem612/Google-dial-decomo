package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoum {
    public static final boolean a = defpackage.aosv.x("kotlinx.coroutines.fast.path.cancellation", false);
    public static final boolean b = defpackage.aosv.x("kotlinx.coroutines.job.propagation.trampoline", true);
    public static final defpackage.apcm c = new defpackage.apcm("COMPLETING_ALREADY");
    public static final defpackage.apcm d = new defpackage.apcm("COMPLETING_WAITING_CHILDREN");
    public static final defpackage.apcm e = new defpackage.apcm("COMPLETING_RETRY");
    public static final defpackage.apcm f = new defpackage.apcm("TOO_LATE_TO_CANCEL");
    public static final defpackage.apcm g = new defpackage.apcm("SEALED");
    public static final defpackage.aotl h = new defpackage.aotl(false);
    public static final defpackage.aotl i = new defpackage.aotl(true);
    public static final java.lang.ThreadLocal j = new java.lang.ThreadLocal();

    public static final java.lang.Object a(java.lang.Object obj) {
        return obj instanceof defpackage.aotx ? new defpackage.aoty((defpackage.aotx) obj) : obj;
    }

    public static final java.lang.Object b(java.lang.Object obj) {
        defpackage.aotx aotxVar;
        defpackage.aoty aotyVar = obj instanceof defpackage.aoty ? (defpackage.aoty) obj : null;
        return (aotyVar == null || (aotxVar = aotyVar.a) == null) ? obj : aotxVar;
    }
}
