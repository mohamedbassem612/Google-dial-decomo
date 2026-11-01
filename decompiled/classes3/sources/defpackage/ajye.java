package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ajye implements defpackage.ajvg {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int e;

    ajye(int i) {
        this.e = i;
    }

    @Override // defpackage.ajvg
    public final int a() {
        return this.e;
    }
}
