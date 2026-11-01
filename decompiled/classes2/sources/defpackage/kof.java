package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 kof[], still in use, count: 1, list:
  (r9v2 kof[]) from 0x0041: INVOKE (r9v2 kof[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:66)
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
public final class kof {
    CALL_SCREEN(0),
    DOBBY(1),
    FERMAT(2),
    BEESLY(3),
    HEDWIG(4);

    public final int f;

    static {
        ajsz.am(kofVarArr);
    }

    private kof(int i) {
        super(str, i);
        this.f = i;
    }

    public static defpackage.kof[] values() {
        return (defpackage.kof[]) g.clone();
    }
}
