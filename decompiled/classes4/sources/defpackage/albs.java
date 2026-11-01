package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class albs extends defpackage.akyv {
    final defpackage.albt a;
    defpackage.akyy b;
    final /* synthetic */ defpackage.albv c;

    public albs(defpackage.albv albvVar) {
        j$.util.Objects.requireNonNull(albvVar);
        this.c = albvVar;
        this.a = new defpackage.albt(albvVar);
        this.b = b();
    }

    private final defpackage.akyy b() {
        defpackage.albt albtVar = this.a;
        if (albtVar.hasNext()) {
            return albtVar.next().d();
        }
        return null;
    }

    @Override // defpackage.akyy
    public final byte a() {
        defpackage.akyy akyyVar = this.b;
        if (akyyVar == null) {
            throw new java.util.NoSuchElementException();
        }
        byte bA = akyyVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
