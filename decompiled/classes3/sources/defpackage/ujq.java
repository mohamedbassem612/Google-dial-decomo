package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v3 ujq[], still in use, count: 1, list:
  (r7v3 ujq[]) from 0x003d: INVOKE (r0v1 aojo) = (r7v3 ujq[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:62)
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
public final class ujq {
    SHOW_SPAM_DIALOG("com.android.dialer.spamnotification.SHOW_SPAM_DIALOG"),
    SHOW_NON_SPAM_DIALOG("com.android.dialer.spamnotification.SHOW_NON_SPAM_DIALOG"),
    ADD_TO_CONTACTS("com.android.dialer.spamnotification.ADD_TO_CONTACTS"),
    SHOW_SPAM_BLOCKING_PROMO("com.android.dialer.spamnotification.SHOW_SPAM_BLOCKING_PROMO");

    public static final java.util.Map a;
    private static final /* synthetic */ aomi h;
    public final java.lang.String f;

    static {
        aojo aojoVarAm = ajsz.am(ujqVarArr);
        h = aojoVarAm;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aojoVarAm, 10)), 16));
        aojl aojlVar = new aojl(aojoVarAm);
        while (aojlVar.hasNext()) {
            java.lang.Object next = aojlVar.next();
            linkedHashMap.put(((defpackage.ujq) next).f, next);
        }
        a = linkedHashMap;
    }

    private ujq(java.lang.String str) {
        super(str, i);
        this.f = str;
    }

    public static defpackage.ujq[] values() {
        return (defpackage.ujq[]) g.clone();
    }
}
