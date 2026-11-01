package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazk extends defpackage.aazl {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/abuse/hades/common/encryption/AndroidTinkEncryptionHelper");
    public final android.content.Context b;
    private final defpackage.aoir d;

    public aazk(android.content.Context context) {
        defpackage.aooh.f(context, "context");
        this.b = context;
        this.d = defpackage.aooc.ag(new defpackage.uob(this, 15));
    }

    @Override // defpackage.aazl
    protected final ajex a() {
        java.lang.Object objA = this.d.a();
        defpackage.aooh.e(objA, "getValue(...)");
        return (ajex) objA;
    }

    public final ajlg b() {
        ajlf ajlfVar = new ajlf();
        ajlfVar.c(this.b, "moirai_keyset", "moirai_pref");
        ajlfVar.b("android-keystore://hades_moirai");
        ajlfVar.d = this.c;
        return ajlfVar.a();
    }
}
