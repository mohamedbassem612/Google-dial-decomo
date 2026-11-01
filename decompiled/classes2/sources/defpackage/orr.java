package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v15 orr[], still in use, count: 1, list:
  (r0v15 orr[]) from 0x01d2: INVOKE (r0v15 orr[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:467)
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
public final class orr {
    CS_CZ("cs-CZ"),
    DA_DK("da-DK"),
    DE_DE("de-DE"),
    EN_US("en-US"),
    ES_ES("es-ES"),
    ES_MX("es-MX"),
    ET_EE("et-EE"),
    FI_FI("fi-FI"),
    FR_FR("fr-FR"),
    HI_IN("hi-IN"),
    HU_HU("hu-HU"),
    IT_IT("it-IT"),
    JA_JP("ja-JP"),
    LT_LT("lt-LT"),
    LV_LV("lv-LV"),
    MS_MY("ms-MY"),
    NB_NO("nb-NO"),
    NL_NL("nl-NL"),
    PL_PL("pl-PL"),
    PT_PT("pt-PT"),
    RO_RO("ro-RO"),
    SK_SK("sk-SK"),
    SL_SI("sl-SI"),
    SV_SE("sv-SE"),
    TA_IN("ta-IN"),
    ZH_TW("zh-TW");

    public static final /* synthetic */ aomi A;
    public final java.lang.String B;

    static {
        A = ajsz.am(orrVarArr);
    }

    private orr(java.lang.String str) {
        super(str, i);
        this.B = str;
    }

    public static defpackage.orr[] values() {
        return (defpackage.orr[]) C.clone();
    }
}
