package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 agiz[], still in use, count: 1, list:
  (r7v2 agiz[]) from 0x0035: INVOKE (r7v2 agiz[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:54)
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
public final class agiz {
    HIDDEN(0),
    ENTRY(1),
    LOOP(2),
    EXIT(3);

    public static final ccp a;
    public final int f;

    static {
        ajsz.am(agizVarArr);
        a = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
    }

    private agiz(int i) {
        super(str, i);
        this.f = i;
    }

    public static defpackage.agiz[] values() {
        return (defpackage.agiz[]) g.clone();
    }
}
