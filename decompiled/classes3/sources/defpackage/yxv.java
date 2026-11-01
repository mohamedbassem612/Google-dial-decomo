package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v13 yxv[], still in use, count: 1, list:
  (r2v13 yxv[]) from 0x01a3: INVOKE (r2v13 yxv[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:420)
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
public final class yxv {
    NOT_CONFIGURED(false),
    ALREADY_QUERYING(true),
    AICORE_FEATURE_UNAVAILABLE(false),
    AICORE_FEATURE_NOT_DOWNLOADED(true),
    SUMMARIZATION_SERVICE_UNAVAILABLE(false),
    LLM_SERVICE_UNAVAILABLE(false),
    FAILED_TO_PREPARE_INFERENCE_ENGINE(true),
    AICORE_UNKNOWN(false),
    AICORE_BAD_INPUT(false),
    AICORE_INTERNAL_ERROR(false),
    AICORE_CANCELLED(true),
    AICORE_NOT_AVAILABLE(true),
    AICORE_BUSY(true),
    AICORE_SAFETY_ERROR(false),
    AICORE_DEADLINE_EXCEEDED(true),
    AICORE_UNAUTHENTICATED(false),
    AICORE_QUOTA_EXCEEDED(false),
    AICORE_SUSPENDED(true),
    AICORE_IPC_ERROR(true),
    AICORE_NOT_SUPPORTED(false),
    AICORE_PERMISSION_DENIED(false),
    AICORE_RESOURCE_EXHAUSTED(false),
    AICORE_TURN_FINISHED(true),
    AICORE_INTERNAL_ERROR_MODEL_LOAD_FAILED(false),
    AICORE_BACKGROUND_USE_BLOCKED(false),
    AICORE_OTHER(false);

    public final boolean A;

    static {
        ajsz.am(yxvVarArr);
    }

    private yxv(boolean z) {
        super(str, i);
        this.A = z;
    }

    public static defpackage.yxv[] values() {
        return (defpackage.yxv[]) B.clone();
    }
}
