package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anzd extends defpackage.anmc {
    public final java.util.concurrent.atomic.AtomicReference a;
    public final java.lang.String b;
    public final /* synthetic */ defpackage.anzg c;
    private final defpackage.anmc d;

    public anzd(defpackage.anzg anzgVar, java.lang.String str) {
        j$.util.Objects.requireNonNull(anzgVar);
        this.c = anzgVar;
        this.a = new java.util.concurrent.atomic.AtomicReference(defpackage.anzg.f);
        this.d = new defpackage.anza(this);
        if (str == null) {
            throw new java.lang.NullPointerException("authority");
        }
        this.b = str;
    }

    @Override // defpackage.anmc
    public final java.lang.String a() {
        return this.b;
    }

    @Override // defpackage.anmc
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.a;
        java.lang.Object obj = atomicReference.get();
        defpackage.annp annpVar = defpackage.anzg.f;
        if (obj != annpVar) {
            return d(anpkVar, anmbVar);
        }
        defpackage.anzg anzgVar = this.c;
        java.lang.Runnable anwoVar = new anwo(this, 19, (char[]) null);
        defpackage.anrc anrcVar = anzgVar.n;
        anrcVar.execute(anwoVar);
        if (atomicReference.get() != annpVar) {
            return d(anpkVar, anmbVar);
        }
        if (anzgVar.B.get()) {
            return new anzb(this);
        }
        anzc anzcVar = new anzc(this, anmv.k(), anpkVar, anmbVar);
        anrcVar.execute(new defpackage.anxz(this, anzcVar, 3));
        return anzcVar;
    }

    public final void c(defpackage.annp annpVar) {
        java.util.Collection collection;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.a;
        defpackage.annp annpVar2 = (defpackage.annp) atomicReference.get();
        atomicReference.set(annpVar);
        defpackage.annp annpVar3 = defpackage.anzg.f;
        if (annpVar2 != annpVar3 || annpVar == annpVar3 || (collection = this.c.x) == null) {
            return;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((anzc) it.next()).dO();
        }
    }

    public final defpackage.ajsz d(anpk anpkVar, defpackage.anmb anmbVar) {
        anzr anzrVar = (defpackage.annp) this.a.get();
        if (anzrVar == null) {
            return this.d.b(anpkVar, anmbVar);
        }
        if (!(anzrVar instanceof anzr)) {
            return new anyu(anzrVar, this.d, this.c.l, anpkVar, anmbVar);
        }
        anzq anzqVarB = anzrVar.b.b(anpkVar);
        if (anzqVarB != null) {
            anmbVar = anmbVar.e(anzq.a, anzqVarB);
        }
        return this.d.b(anpkVar, anmbVar);
    }
}
