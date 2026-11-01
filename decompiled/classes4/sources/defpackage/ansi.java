package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ansi implements ajcb {
    final /* synthetic */ defpackage.anpk a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ ajdd c;
    final /* synthetic */ defpackage.ansj d;

    public ansi(defpackage.ansj ansjVar, defpackage.anpk anpkVar, java.lang.String str, ajdd ajddVar) {
        this.a = anpkVar;
        this.b = str;
        this.c = ajddVar;
        j$.util.Objects.requireNonNull(ansjVar);
        this.d = ansjVar;
    }

    public final void a(java.lang.Throwable th) {
        this.d.b.remove(this.b, this.c);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        if (this.a.f) {
            return;
        }
        defpackage.ansj ansjVar = this.d;
        ansjVar.b.remove(this.b, this.c);
    }
}
