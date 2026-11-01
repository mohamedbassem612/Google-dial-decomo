package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v5 oeu[], still in use, count: 1, list:
  (r4v5 oeu[]) from 0x0065: INVOKE (r4v5 oeu[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:102)
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
public final class oeu {
    URGENT(2132018649, 2132018650, 2131951670, "🚨"),
    QUESTION(2132018633, 2132018634, 2131951671, "❓"),
    CATCH_UP(2132018614, 2132018615, 2131951668, "👋"),
    NEWS(2132018627, 2132018628, 2131951669, "🔔");

    public final int e;
    public final int f;
    public final int g;
    public final java.lang.String h;

    static {
        ajsz.am(oeuVarArr);
    }

    private oeu(int i2, int i3, int i4, java.lang.String str) {
        super(str, i);
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = str;
    }

    public static defpackage.oeu[] values() {
        return (defpackage.oeu[]) i.clone();
    }
}
