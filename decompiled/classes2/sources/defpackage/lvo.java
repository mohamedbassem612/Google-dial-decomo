package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lvo implements defpackage.lvr {
    PRIMARY(2132018360),
    ALTERNATIVE(2132018358);

    private final int d;

    lvo(int i) {
        this.d = i;
    }

    @Override // defpackage.lvr
    public final int a() {
        return this.d;
    }

    @Override // defpackage.lvr
    public final /* synthetic */ java.lang.String b(android.content.Context context) {
        return mni.bL(this, context);
    }
}
