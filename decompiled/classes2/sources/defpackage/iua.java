package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 iua[], still in use, count: 1, list:
  (r14v3 iua[]) from 0x00d9: INVOKE (r14v3 iua[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:218)
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
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iua {
    UNKNOWN("unknown"),
    FORMAT_ERROR("format_error"),
    GENERAL_ERROR("general_error"),
    UNSAFE_CALL_ACTIONS("unsafe_call_actions"),
    TIMEOUT_ERROR("timeout_error"),
    FEATURE_UNAVAILABLE("aicore_feature_available"),
    DOWNLOAD_INCOMPLETE("download_incomplete"),
    TRANSCRIPT_UNSAFE("transcript_unsafe"),
    SUMMARY_UNSAFE_HADES("summary_unsafe"),
    TRANSCRIPT_TOO_LARGE("transcript_too_large"),
    SUMMARY_UNSAFE_GEMINI("summary_unsafe_gemini"),
    DUPLEX_ERROR("duplex_error"),
    FATAL_MODEL_ERROR("fatal_model_error");

    public static final /* synthetic */ aomi n;
    public final java.lang.String o;

    static {
        n = ajsz.am(iuaVarArr);
    }

    private iua(java.lang.String str) {
        super(str, i);
        this.o = str;
    }

    public static defpackage.iua[] values() {
        return (defpackage.iua[]) p.clone();
    }
}
