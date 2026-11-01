package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v3 mbk[], still in use, count: 1, list:
  (r7v3 mbk[]) from 0x003d: INVOKE (r7v3 mbk[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:62)
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
public final class mbk {
    VALID("valid"),
    TIMED_OUT("timed out"),
    CANCELLED("cancelled"),
    ERROR("error");

    public final java.lang.String e;

    static {
        ajsz.am(mbkVarArr);
    }

    private mbk(java.lang.String str) {
        super(str, i);
        this.e = str;
    }

    public static defpackage.mbk[] values() {
        return (defpackage.mbk[]) f.clone();
    }
}
