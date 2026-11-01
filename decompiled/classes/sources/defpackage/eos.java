package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eos extends defpackage.eoq {
    public eos(defpackage.eoq eoqVar) {
        if (eoqVar == null) {
            defpackage.aooh.i("initialExtras");
        }
        this.b.putAll(eoqVar.b);
    }

    @Override // defpackage.eoq
    public final java.lang.Object a(defpackage.eop eopVar) {
        if (eopVar == null) {
            defpackage.aooh.i("key");
        }
        return this.b.get(eopVar);
    }

    public final void b(defpackage.eop eopVar, java.lang.Object obj) {
        this.b.put(eopVar, obj);
    }

    public eos() {
        throw null;
    }

    public /* synthetic */ eos(byte[] bArr) {
        this(defpackage.eoo.a);
    }
}
