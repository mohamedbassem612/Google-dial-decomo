package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lvp implements defpackage.lvr {
    BY_PRIMARY(2132018352),
    BY_ALTERNATIVE(2132018350);

    private final int d;

    lvp(int i) {
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
