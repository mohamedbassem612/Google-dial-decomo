package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v4 xnn[], still in use, count: 1, list:
  (r10v4 xnn[]) from 0x00bd: INVOKE (r10v4 xnn[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:190)
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
public final class xnn implements defpackage.xpe {
    UNKNOWN,
    PHENOTYPE_SYNC_COMPLETE,
    PLAY_EARLY_UPDATE_COMPLETE,
    AUTH_EARLY_UPDATE_COMPLETE,
    FIRST_ACCOUNT_ADDED,
    ACCOUNT_SETUP_COMPLETE,
    RESTORE_READY,
    PERSONALIZATION_FLOW_STARTED,
    CONSENT_READY,
    DEFERRED_SETUP_STARTED,
    INITIAL_CHECKIN_COMPLETE,
    ACCOUNT_CHECKIN_COMPLETE,
    ACCOUNT_PHENOTYPE_SYNC_COMPLETE;

    public static final defpackage.xnm a = new defpackage.xnm();
    public static final /* synthetic */ aomi o;
    private final java.lang.String r;

    static {
        o = ajsz.am(new defpackage.xnn[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2, r4, r6, r8});
    }

    private xnn() {
        super(str, i);
        this.r = name();
    }

    public static defpackage.xnn[] values() {
        return (defpackage.xnn[]) q.clone();
    }

    @Override // defpackage.xpe
    public final java.lang.String a() {
        return this.r;
    }

    @Override // defpackage.xpa
    public final /* synthetic */ android.os.PersistableBundle toPersistableBundle() {
        return defpackage.xhp.n(this);
    }
}
