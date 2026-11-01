package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anag extends defpackage.anaa {
    private final defpackage.anaa a;

    public anag(defpackage.anaa anaaVar) {
        this.a = anaaVar;
    }

    @Override // defpackage.anaa
    public final defpackage.amzv a(amzw amzwVar) {
        try {
            return new defpackage.anae(this.a.a(amzwVar));
        } catch (java.lang.RuntimeException e) {
            defpackage.anah.d(e, this.a, amzwVar);
            return defpackage.amzv.e;
        }
    }
}
