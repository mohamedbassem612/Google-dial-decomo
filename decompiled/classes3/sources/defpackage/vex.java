package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vex extends java.lang.RuntimeException {
    public final j$.util.Optional a;

    public vex(int i) {
        super("Failed to send the sms");
        this.a = j$.util.Optional.of(java.lang.Integer.valueOf(i));
    }

    public vex() {
        super("receive status sms timeout");
        this.a = j$.util.Optional.empty();
    }
}
