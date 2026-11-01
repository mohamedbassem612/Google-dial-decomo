package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anaf extends defpackage.amzz {
    private final defpackage.amzz a;

    public anaf(defpackage.amzz amzzVar) {
        this.a = amzzVar;
    }

    @Override // defpackage.amzz
    public final defpackage.anaa a(java.lang.Object obj) {
        try {
            return new defpackage.anag(this.a.a(obj));
        } catch (java.lang.RuntimeException e) {
            defpackage.anah.b(e, this.a, obj);
            return defpackage.anaa.b;
        }
    }
}
