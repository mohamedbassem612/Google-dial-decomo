package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akpi implements alah {
    FEATURE_UNSPECIFIED(0),
    USER_FEEDBACK_IHNR(1),
    IN_APP_PROMPTS(2),
    NO_TRAY_NOTIFICATIONS(3),
    USER_FEEDBACK_IHNR_ACTION_BUTTONS(5),
    CHIME_SOURCED_GMS_CORE(6);

    public final int g;

    akpi(int i) {
        this.g = i;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
