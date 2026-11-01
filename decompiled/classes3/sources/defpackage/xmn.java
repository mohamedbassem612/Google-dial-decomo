package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 xmn[], still in use, count: 1, list:
  (r11v2 xmn[]) from 0x004d: INVOKE (r11v2 xmn[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:78)
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
public final class xmn {
    UNSPECIFIED(0),
    TIMEOUT(1),
    PROCESS_DIED(2),
    CONTRACT_NOT_FOUND(3),
    BINDER_ERROR(4),
    TASK_EXCEPTION(5);

    public static final /* synthetic */ aomi g;
    public final int h;

    static {
        g = ajsz.am(xmnVarArr);
    }

    private xmn(int i2) {
        super(str, i);
        this.h = i2;
    }

    public static defpackage.xmn[] values() {
        return (defpackage.xmn[]) i.clone();
    }
}
