package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aplg extends defpackage.apjz {
    public final defpackage.apiq e;
    private final defpackage.apir f;
    private final java.util.concurrent.atomic.AtomicReference g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aplg(defpackage.apkc apkcVar, defpackage.apir apirVar, defpackage.apiq apiqVar) {
        super(apiqVar.a.concat(" dns"), false);
        if (apkcVar == null) {
            defpackage.aooh.i("taskRunner");
        }
        this.f = apirVar;
        this.e = apiqVar;
        this.g = new java.util.concurrent.atomic.AtomicReference(defpackage.apld.a);
    }

    @Override // defpackage.apjz
    public final long a() {
        try {
            this.f.a(this.e.a);
            aple apleVar = (defpackage.aplf) defpackage.apjx.b(this.g, aplc.a, new agkh(19));
            if ((apleVar instanceof aple ? apleVar : null) != null) {
                throw null;
            }
            return -1L;
        } catch (java.net.UnknownHostException unused) {
            aple apleVar2 = (defpackage.aplf) defpackage.apjx.b(this.g, aplc.a, new agkh(20));
            if ((apleVar2 instanceof aple ? apleVar2 : null) == null) {
                return -1L;
            }
            throw null;
        }
    }
}
