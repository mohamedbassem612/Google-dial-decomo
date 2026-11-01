package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 tek[], still in use, count: 1, list:
  (r12v3 tek[]) from 0x005d: INVOKE (r12v3 tek[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:94)
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
public final class tek {
    TIME_KEEPER(0),
    CONTACTS(1),
    CALL_LOG(2),
    SUGGESTED_CONTACTS(3),
    EXTENDED_DIRECTORY_CONTACTS(4),
    TEST_HIGH_PRIORITY(1000),
    TEST_LOW_PRIORITY(2000);

    public final int h;

    static {
        ajsz.am(tekVarArr);
    }

    private tek(int i2) {
        super(str, i);
        this.h = i2;
    }

    public static defpackage.tek[] values() {
        return (defpackage.tek[]) i.clone();
    }
}
