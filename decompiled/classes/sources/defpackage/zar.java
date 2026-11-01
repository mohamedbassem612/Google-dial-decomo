package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 zar[], still in use, count: 1, list:
  (r0v7 zar[]) from 0x012b: INVOKE (r0v7 zar[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[MD:(java.lang.Enum[]):aomi (m)] (LINE:300)
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
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zar {
    OK(0),
    UNKNOWN_ERROR(2),
    CUI_TIMEOUT(4),
    PERMISSION_DENIED(7),
    CRASH(17),
    TIMEOUT_FAILURE(18),
    PRODUCE_MODEL_FAILURE(19),
    ILLEGAL_STATE(20),
    EXTERNAL_ERROR(21),
    IO_EXCEPTION(22),
    AUDIO_ERROR(23),
    TELECOM_ERROR(24),
    INVALID_ARGUMENT(3),
    NOT_FOUND(5),
    FAILED_PRECONDITION(9),
    INTERNAL(13),
    UNAVAILABLE(14),
    UNAUTHENTICATED(16);

    public final int s;

    static {
        defpackage.ajsz.am(zarVarArr);
    }

    private zar(int i) {
        super(str, i);
        this.s = i;
    }

    public static defpackage.zar[] values() {
        return (defpackage.zar[]) t.clone();
    }
}
