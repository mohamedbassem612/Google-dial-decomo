package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 xgc[], still in use, count: 1, list:
  (r5v2 xgc[]) from 0x0029: INVOKE (r5v2 xgc[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi A[WRAPPED] (LINE:42)
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
public final class xgc implements defpackage.xpe {
    LIGHT,
    BASELINE,
    V1;

    public static final defpackage.xgb a = new defpackage.xgb();
    public static final /* synthetic */ aomi e;
    private final java.lang.String g;

    static {
        e = ajsz.am(new defpackage.xgc[]{r0, r1, r3});
    }

    private xgc() {
        super(str, i);
        this.g = name();
    }

    public static defpackage.xgc[] values() {
        return (defpackage.xgc[]) f.clone();
    }

    @Override // defpackage.xpe
    public final java.lang.String a() {
        return this.g;
    }

    @Override // defpackage.xpa
    public final /* synthetic */ android.os.PersistableBundle toPersistableBundle() {
        return defpackage.xhp.n(this);
    }
}
