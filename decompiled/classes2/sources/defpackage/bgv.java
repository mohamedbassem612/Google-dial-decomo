package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 bgv[], still in use, count: 1, list:
  (r5v6 bgv[]) from 0x006c: INVOKE (r5v6 bgv[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:109)
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
public final class bgv {
    Cut(defpackage.bhg.a, android.R.string.cut, android.R.attr.actionModeCutDrawable),
    Copy(defpackage.bhg.b, android.R.string.copy, android.R.attr.actionModeCopyDrawable),
    Paste(defpackage.bhg.c, android.R.string.paste, android.R.attr.actionModePasteDrawable),
    SelectAll(defpackage.bhg.d, android.R.string.selectAll, android.R.attr.actionModeSelectAllDrawable),
    Autofill(defpackage.bhg.e, android.R.string.autofill, 0);

    public final java.lang.Object f;
    public final int g;
    public final int h;

    static {
        ajsz.am(bgvVarArr);
    }

    private bgv(java.lang.Object obj, int i2, int i3) {
        super(str, i);
        this.f = obj;
        this.g = i2;
        this.h = i3;
    }

    public static defpackage.bgv[] values() {
        return (defpackage.bgv[]) i.clone();
    }
}
