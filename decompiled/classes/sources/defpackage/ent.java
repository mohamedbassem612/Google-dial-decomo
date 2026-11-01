package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ent implements defpackage.gig, defpackage.gii, defpackage.eoi {
    public android.os.Bundle a;
    private final /* synthetic */ defpackage.gii b;
    private final /* synthetic */ defpackage.eoi c;
    private defpackage.ens d;
    private boolean e;

    public ent(defpackage.gii giiVar, defpackage.eoi eoiVar) {
        this.b = giiVar;
        this.c = eoiVar;
    }

    @Override // defpackage.emx
    public final defpackage.ems P() {
        return this.b.P();
    }

    @Override // defpackage.eoi
    public final defpackage.eoh S() {
        return this.c.S();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [gig, java.lang.Object] */
    @Override // defpackage.gig
    public final android.os.Bundle a() {
        android.os.Bundle bundleR = defpackage.dpe.r((defpackage.aoiu[]) java.util.Arrays.copyOf(new defpackage.aoiu[0], 0));
        android.os.Bundle bundle = this.a;
        if (bundle != null) {
            bundleR.putAll(bundle);
        }
        for (java.util.Map.Entry entry : b().a.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.os.Bundle bundleA = ((defpackage.gat) ((defpackage.enr) entry.getValue()).b).a.a();
            if (!bundleA.isEmpty()) {
                defpackage.gij.b(bundleR, str, bundleA);
            }
        }
        this.e = false;
        return bundleR;
    }

    @Override // defpackage.gii
    public final defpackage.aaha aT() {
        return this.b.aT();
    }

    public final defpackage.ens b() {
        defpackage.ens ensVar = this.d;
        if (ensVar != null && ensVar.b) {
            this.d = null;
        }
        defpackage.ens ensVar2 = this.d;
        if (ensVar2 == null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            defpackage.een eenVar = new defpackage.een(2);
            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
            defpackage.dzl.o(new defpackage.aooa(defpackage.ens.class), eenVar, linkedHashMap);
            ensVar2 = (defpackage.ens) defpackage.enn.g(this, defpackage.dzl.n(linkedHashMap), defpackage.dzo.n(this)).b(new defpackage.aooa(defpackage.ens.class));
            this.d = ensVar2;
        }
        if (ensVar2 == null) {
            defpackage.aooh.g();
        }
        return ensVar2;
    }

    public final void c() {
        if (this.e) {
            return;
        }
        android.os.Bundle bundleC = aT().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        android.os.Bundle bundleR = defpackage.dpe.r((defpackage.aoiu[]) java.util.Arrays.copyOf(new defpackage.aoiu[0], 0));
        android.os.Bundle bundle = this.a;
        if (bundle != null) {
            bundleR.putAll(bundle);
        }
        if (bundleC != null) {
            bundleR.putAll(bundleC);
        }
        this.a = bundleR;
        this.e = true;
        b();
    }
}
