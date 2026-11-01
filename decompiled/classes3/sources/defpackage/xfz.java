package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v3 xfz[], still in use, count: 1, list:
  (r7v3 xfz[]) from 0x0038: INVOKE (r7v3 xfz[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:57)
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
public final class xfz implements defpackage.xgk, defpackage.xpa {
    USER_CANCELLED(1),
    RESULT_NO_LONGER_NEEDED(2),
    TEST(1000),
    UNKNOWN(-1);

    public static final /* synthetic */ aomi e;
    public final int f;

    static {
        e = ajsz.am(xfzVarArr);
    }

    private xfz(int i) {
        super(str, i);
        this.f = i;
    }

    public static defpackage.xfz[] values() {
        return (defpackage.xfz[]) g.clone();
    }

    @Override // defpackage.xgk, defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt("type", this.f);
        return persistableBundle;
    }

    @Override // defpackage.xgk
    public final defpackage.xfz a() {
        return this;
    }
}
