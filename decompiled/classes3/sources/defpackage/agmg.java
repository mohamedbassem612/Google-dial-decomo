package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 agmg[], still in use, count: 1, list:
  (r5v2 agmg[]) from 0x0029: INVOKE (r5v2 agmg[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:42)
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
public final class agmg {
    COMPLETED(0),
    DISCOVERED(1),
    UI_REQUESTED(2);

    public final int d;

    static {
        ajsz.am(agmgVarArr);
    }

    private agmg(int i) {
        super(str, i);
        this.d = i;
    }

    public static defpackage.agmg[] values() {
        return (defpackage.agmg[]) e.clone();
    }
}
