package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anyx extends defpackage.anxt {
    final /* synthetic */ defpackage.anzg b;

    public anyx(defpackage.anzg anzgVar) {
        j$.util.Objects.requireNonNull(anzgVar);
        this.b = anzgVar;
    }

    @Override // defpackage.anxt
    protected final void a() {
        this.b.g();
    }

    @Override // defpackage.anxt
    protected final void b() {
        defpackage.anzg anzgVar = this.b;
        if (anzgVar.B.get()) {
            return;
        }
        anzgVar.j();
    }
}
