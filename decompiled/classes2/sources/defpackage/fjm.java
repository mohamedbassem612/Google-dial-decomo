package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fjm implements defpackage.fkk {
    final /* synthetic */ defpackage.fea a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.fjo c;

    public fjm(defpackage.fjo fjoVar, defpackage.fea feaVar, int i) {
        this.a = feaVar;
        this.b = i;
        j$.util.Objects.requireNonNull(fjoVar);
        this.c = fjoVar;
    }

    @Override // defpackage.fkk
    public final void a(long j) {
        this.c.aW(this.a, this.b, j);
    }

    @Override // defpackage.fkk
    public final void b() {
        this.c.aV(this.a, this.b);
    }
}
