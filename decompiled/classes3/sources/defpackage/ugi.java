package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 ugi[], still in use, count: 1, list:
  (r2v4 ugi[]) from 0x002b: INVOKE (r2v4 ugi[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:44)
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
public final class ugi {
    GET_DOWNLOAD_STATUS(new aenj("MoiraiApiBuilder.getStatus")),
    FORCE_DOWNLOAD_PROTECTIONS(new aenj("MoiraiApiFactoryImpl.downloadProtections"));

    public final aenj c;

    static {
        ajsz.am(ugiVarArr);
    }

    private ugi(aenj aenjVar) {
        super(str, i);
        this.c = aenjVar;
    }

    public static defpackage.ugi[] values() {
        return (defpackage.ugi[]) d.clone();
    }
}
