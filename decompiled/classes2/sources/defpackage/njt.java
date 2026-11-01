package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 njt[], still in use, count: 1, list:
  (r12v3 njt[]) from 0x00c6: INVOKE (r12v3 njt[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:199)
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
public final class njt {
    FAMILY_CARE("Priority: Family / Care"),
    MEDICAL_ACCOUNT_ALERT("Medical / Account Alert"),
    DELIVERY_LOGISTICS("Delivery / Logistics"),
    BUSINESS_WORK("Business / Work"),
    PERSONAL_FRIEND("Personal / Friend"),
    PUBLIC_INFO("Public / Info"),
    SOLICITATION_SALES("Solicitation / Sales"),
    LIKELY_SPAM("Likely Spam"),
    REFUSED_TO_IDENTIFY("Refused to Identify"),
    UNKNOWN_INTENT("Unknown Intent"),
    SILENT_OR_UNCLEAR("Silent or Unclear"),
    NONE("N/A");

    public static final /* synthetic */ aomi m;
    public final java.lang.String n;

    static {
        m = ajsz.am(njtVarArr);
    }

    private njt(java.lang.String str) {
        super(str, i);
        this.n = str;
    }

    public static defpackage.njt[] values() {
        return (defpackage.njt[]) o.clone();
    }
}
