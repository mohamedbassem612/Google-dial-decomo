package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 plr[], still in use, count: 1, list:
  (r1v1 plr[]) from 0x000f: INVOKE (r1v1 plr[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:16)
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
public final class plr {
    CALL_INFO_SHOULD_SHOW_VALIDATION_FOR_CARRIER;

    static {
        ajsz.am(plrVarArr);
    }

    private plr() {
        super("CALL_INFO_SHOULD_SHOW_VALIDATION_FOR_CARRIER", 0);
    }

    public static defpackage.plr[] values() {
        return (defpackage.plr[]) b.clone();
    }
}
