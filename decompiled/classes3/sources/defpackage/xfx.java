package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v2 xfx[], still in use, count: 1, list:
  (r15v2 xfx[]) from 0x0068: INVOKE (r15v2 xfx[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:105)
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
public final class xfx implements defpackage.xpe {
    OTHER,
    INVISIBLE,
    LOADING,
    EDUCATION,
    INPUT,
    HOST,
    ERROR,
    UNKNOWN;

    public static final defpackage.xfw a = new defpackage.xfw();
    public static final /* synthetic */ aomi j;
    private final java.lang.String l;

    static {
        j = ajsz.am(new defpackage.xfx[]{r0, r1, r3, r5, r7, r9, r11, r13});
    }

    private xfx() {
        super(str, i);
        this.l = name();
    }

    public static defpackage.xfx[] values() {
        return (defpackage.xfx[]) k.clone();
    }

    @Override // defpackage.xpe
    public final java.lang.String a() {
        return this.l;
    }

    @Override // defpackage.xpa
    public final /* synthetic */ android.os.PersistableBundle toPersistableBundle() {
        return defpackage.xhp.n(this);
    }
}
