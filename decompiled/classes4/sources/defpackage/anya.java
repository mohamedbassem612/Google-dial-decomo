package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anya extends defpackage.anxd {
    final /* synthetic */ defpackage.anvr a;
    final /* synthetic */ defpackage.anyb b;

    public anya(defpackage.anyb anybVar, defpackage.anvr anvrVar) {
        this.a = anvrVar;
        j$.util.Objects.requireNonNull(anybVar);
        this.b = anybVar;
    }

    @Override // defpackage.anxd, defpackage.anvr
    public final void a(anqw anqwVar, defpackage.anvq anvqVar, anph anphVar) {
        this.b.b.a.a(anqwVar.h());
        this.a.a(anqwVar, anvqVar, anphVar);
    }

    @Override // defpackage.anxd
    protected final defpackage.anvr b() {
        return this.a;
    }
}
