package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ajyg implements defpackage.ajvg {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int f;

    ajyg(int i) {
        this.f = i;
    }

    @Override // defpackage.ajvg
    public final int a() {
        return this.f;
    }
}
