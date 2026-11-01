package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ken[], still in use, count: 1, list:
  (r8v3 ken[]) from 0x00a0: INVOKE (r8v3 ken[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[MD:(java.lang.Enum[]):aomi (m)] (LINE:161)
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
public final class ken {
    MOMONGA("momonga"),
    FERMAT("fermat"),
    BEESLY("beesly"),
    SHARPIE("sharpie"),
    EXPRESSO("expresso"),
    HALO("halo"),
    STIR_SHAKEN("stir_shaken"),
    DOBBY("dobby"),
    CONTACT_CHECKER("contact_checker"),
    HEDWIG("hedwig");

    public final java.lang.String k;

    static {
        defpackage.ajsz.am(kenVarArr);
    }

    private ken(java.lang.String str) {
        super(str, i);
        this.k = str;
    }

    public static defpackage.ken[] values() {
        return (defpackage.ken[]) l.clone();
    }
}
