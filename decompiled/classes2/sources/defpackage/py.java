package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class py {
    private java.util.Map b;
    private java.util.Map c;
    public java.util.ArrayList a = new java.util.ArrayList();
    private boolean d = false;

    public py() {
        d(true);
    }

    public final defpackage.pz a() {
        if (this.b != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (defpackage.qb qbVar : this.b.values()) {
                qbVar.f = true;
                java.lang.String str = qbVar.a;
                boolean z = qbVar.b;
                defpackage.qk qkVarA = qbVar.c.a();
                java.util.List list = qbVar.d;
                int i = qbVar.e;
                arrayList.add(new defpackage.qc(str, z, qkVarA, list));
            }
        }
        if (this.c != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            for (java.util.Map.Entry entry : this.c.entrySet()) {
                bundle.putStringArrayList((java.lang.String) entry.getKey(), new java.util.ArrayList<>((java.util.Collection) entry.getValue()));
            }
        }
        this.d = true;
        return new defpackage.pz(this.a);
    }

    public final defpackage.qb b(java.lang.String str) {
        java.util.Map map = this.b;
        if (map == null) {
            throw new java.lang.IllegalStateException("GetSchemaResponse is not configured withvisibility setting support");
        }
        defpackage.qb qbVar = (defpackage.qb) map.get(str);
        if (qbVar != null) {
            return qbVar;
        }
        defpackage.qb qbVar2 = new defpackage.qb(str);
        this.b.put(str, qbVar2);
        return qbVar2;
    }

    public final void c() {
        if (this.d) {
            this.a = new java.util.ArrayList(this.a);
            if (this.c != null) {
                aca acaVar = new aca();
                acaVar.putAll(this.c);
                this.c = acaVar;
            }
            this.d = false;
        }
    }

    public final void d(boolean z) {
        this.b = z ? new aca() : null;
    }
}
