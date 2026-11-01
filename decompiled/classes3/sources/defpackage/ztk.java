package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ztk[], still in use, count: 1, list:
  (r1v1 ztk[]) from 0x000f: INVOKE (r1v1 ztk[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:16)
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
public final class ztk {
    EXPERIMENT_SYNC;

    public final java.lang.String b;

    static {
        ajsz.am(ztkVarArr);
    }

    private ztk() {
        super("EXPERIMENT_SYNC", 0);
        this.b = "/dialershared/dataclient/experiment_sync/";
    }

    public static defpackage.ztk[] values() {
        return (defpackage.ztk[]) c.clone();
    }
}
