package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class we {
    public java.lang.Object c = new aca();
    public java.lang.Object d = new aca();
    public java.lang.Object b = new aca();
    public boolean a = false;

    public we(defpackage.pd pdVar) {
        ((aca) this.c).putAll(pdVar.a);
        ((aca) this.d).putAll(pdVar.b);
        ((aca) this.b).putAll(pdVar.c);
    }

    private final void e() {
        if (this.a) {
            this.c = new aca((aec) this.c);
            this.d = new aca((aec) this.d);
            this.b = new aca((aec) this.b);
            this.a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.pd a() {
        this.a = true;
        return new defpackage.pd(this.c, this.d, this.b);
    }

    public final void b(java.lang.Object obj, int i, java.lang.String str) {
        dzk.x(obj);
        e();
        c(obj, new defpackage.pg(i, null, str));
    }

    public final void c(java.lang.Object obj, defpackage.pg pgVar) {
        dzk.x(obj);
        e();
        if (pgVar.b()) {
            ((aec) this.c).put(obj, pgVar.a());
            ((aec) this.d).remove(obj);
        } else {
            ((aec) this.d).put(obj, pgVar);
            ((aec) this.c).remove(obj);
        }
        ((aec) this.b).put(obj, pgVar);
    }

    public final void d(java.lang.Object obj, java.lang.Object obj2) {
        dzk.x(obj);
        e();
        c(obj, new defpackage.pg(0, obj2, null));
    }

    public we(byte[] bArr) {
    }
}
