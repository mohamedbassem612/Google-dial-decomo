package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afhe implements defpackage.ajas {
    public java.util.List a;
    public final /* synthetic */ defpackage.afhf b;

    public afhe(defpackage.afhf afhfVar) {
        j$.util.Objects.requireNonNull(afhfVar);
        this.b = afhfVar;
    }

    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        defpackage.afhf afhfVar = this.b;
        defpackage.ahoq ahoqVarB = afhfVar.e.b("Initialize ".concat(java.lang.String.valueOf(afhfVar.a)));
        try {
            synchronized (afhfVar.d) {
                if (this.a == null) {
                    this.a = afhfVar.f;
                    afhfVar.f = java.util.Collections.EMPTY_LIST;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.a.size());
            defpackage.apnt apntVar = new defpackage.apnt(this.b);
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((defpackage.ajat) it.next()).a(apntVar));
                } catch (java.lang.Exception e) {
                    arrayList.add(new defpackage.ajdd(e));
                }
            }
            defpackage.ajcq ajcqVarB = new defpackage.anpu(true, defpackage.aify.j(arrayList)).b(new defpackage.vcz(this, 14), defpackage.ajbm.INSTANCE);
            ahoqVarB.a(ajcqVarB);
            ahoqVarB.close();
            return ajcqVarB;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarB.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
