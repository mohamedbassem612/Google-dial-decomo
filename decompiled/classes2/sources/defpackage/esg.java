package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class esg {
    public long a;
    public defpackage.erm b;
    public java.lang.Object c;

    public esg(defpackage.esh eshVar) {
        this.a = eshVar.a;
        this.b = eshVar.b;
        this.c = eshVar.c;
    }

    public final defpackage.esh a() {
        java.lang.Object obj;
        if (!this.b.n() && (obj = this.c) != null) {
            ahvr.bM(this.b.a(obj) != -1);
        }
        return new defpackage.esh(this);
    }

    public esg() {
        this.a = 0L;
        this.b = defpackage.erm.a;
        this.c = null;
    }
}
