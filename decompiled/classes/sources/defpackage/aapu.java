package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aapu extends defpackage.aais {
    public aapu() {
        super((short[]) null);
    }

    @Override // defpackage.aais
    public final /* bridge */ /* synthetic */ defpackage.aacv b(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, java.lang.Object obj, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        defpackage.aact aactVar = (defpackage.aact) obj;
        if (looper == null) {
            defpackage.aooh.i("looper");
        }
        if (aactVar == null) {
            defpackage.aooh.i("apiOptions");
        }
        return new defpackage.aapw(context, looper, aagiVar, aaeiVar, aafiVar);
    }
}
