package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 aehg[], still in use, count: 1, list:
  (r5v4 aehg[]) from 0x008c: INVOKE (r5v4 aehg[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:141)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aehg implements defpackage.aehi {
    OK(-1),
    START_QR_PROVISION(101),
    DPM_USER_COMPLETE(111),
    DPM_PROFILE_COMPLETE(112),
    WORK_SETUP_INTERRUPTED_QR_SCAN(114),
    WORK_SETUP_INTERRUPTED_CONSUMER_FLOW(115),
    CHECK_USER_UNLOCK_NFC(124),
    CHECK_USER_UNLOCK_WORK_SETUP_INTERRUPTED_NFC(125),
    START_MANUAL_ENROLLMENT(10001);

    public static final /* synthetic */ aomi j;
    private final int l;

    static {
        j = ajsz.am(aehgVarArr);
    }

    private aehg(int i) {
        super(str, i);
        this.l = i;
    }

    public static defpackage.aehg[] values() {
        return (defpackage.aehg[]) k.clone();
    }

    @Override // defpackage.aehi
    public final int a() {
        return this.l;
    }
}
