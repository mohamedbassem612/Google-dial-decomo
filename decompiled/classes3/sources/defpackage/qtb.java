package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qtb implements emj {
    final /* synthetic */ defpackage.qtd a;

    public qtb(defpackage.qtd qtdVar) {
        j$.util.Objects.requireNonNull(qtdVar);
        this.a = qtdVar;
    }

    public final void f(emx emxVar) {
        defpackage.qtd qtdVar = this.a;
        if (qtdVar.d.G().isChangingConfigurations()) {
            return;
        }
        j$.util.Optional optionalK = qtdVar.k();
        if (true == optionalK.isPresent()) {
            ((defpackage.qrv) optionalK.get()).f();
        }
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void b(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void e(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
