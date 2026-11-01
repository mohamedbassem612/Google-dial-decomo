package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v4 kut[], still in use, count: 1, list:
  (r10v4 kut[]) from 0x006b: INVOKE (r10v4 kut[]) STATIC call: ajsz.am(java.lang.Enum[]):aomi (LINE:108)
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
public final class kut {
    AR_XA_START(2131951708, "starting_voice-ar_XA.m4a"),
    AR_XA_END(2131951678, "ending_voice-ar_XA.m4a"),
    BEEP_SOUND_START(2131951709, "starting_voice-beep_sound.ogg"),
    BEEP_SOUND_END(2131951679, "ending_voice-beep_sound.ogg"),
    MY_MM_START(2131951710, "starting_voice-my_MM.m4a"),
    MY_MM_END(2131951680, "ending_voice-my_MM.m4a");

    public final int g;
    public final java.lang.String h;

    static {
        ajsz.am(kutVarArr);
    }

    private kut(int i2, java.lang.String str) {
        super(str, i);
        this.g = i2;
        this.h = str;
    }

    public static defpackage.kut[] values() {
        return (defpackage.kut[]) i.clone();
    }
}
