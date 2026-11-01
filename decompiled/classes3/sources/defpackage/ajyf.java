package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ajyf implements defpackage.ajvg {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int f;

    ajyf(int i) {
        this.f = i;
    }

    @Override // defpackage.ajvg
    public final int a() {
        return this.f;
    }
}
