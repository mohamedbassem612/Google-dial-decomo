package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 agmf[], still in use, count: 1, list:
  (r7v2 agmf[]) from 0x0035: INVOKE (r7v2 agmf[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:54)
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
public final class agmf {
    ACTION(0),
    ALL_OF(1),
    ANY_OF(2),
    NOT(3);

    public final int e;

    static {
        ajsz.am(agmfVarArr);
    }

    private agmf(int i) {
        super(str, i);
        this.e = i;
    }

    public static defpackage.agmf[] values() {
        return (defpackage.agmf[]) f.clone();
    }
}
