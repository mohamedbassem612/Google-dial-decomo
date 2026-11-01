package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apiz {
    private final appb a;
    private apiy b;
    private final java.util.List c;

    public apiz(java.lang.String str) {
        appb appbVar = appb.a;
        this.a = aoov.aQ(str);
        this.b = defpackage.apjc.a;
        this.c = new java.util.ArrayList();
    }

    public final defpackage.apjc a() {
        java.util.List list = this.c;
        if (list.isEmpty()) {
            throw new java.lang.IllegalStateException("Multipart body must have at least one part.");
        }
        return new defpackage.apjc(this.a, this.b, apjx.e(list));
    }

    public final void b(apiu apiuVar, apjk apjkVar) {
        if (apiuVar.b("Content-Type") != null) {
            throw new java.lang.IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (apiuVar.b("Content-Length") != null) {
            throw new java.lang.IllegalArgumentException("Unexpected header: Content-Length");
        }
        this.c.add(new defpackage.apjb(apiuVar, apjkVar));
    }

    public final void c(apiy apiyVar) {
        aooh.f(apiyVar, "type");
        if (aooh.n(apiyVar.d, "multipart")) {
            this.b = apiyVar;
        } else {
            java.util.Objects.toString(apiyVar);
            throw new java.lang.IllegalArgumentException("multipart != ".concat(java.lang.String.valueOf(apiyVar)));
        }
    }
}
