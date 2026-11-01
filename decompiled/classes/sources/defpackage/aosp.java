package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aosp extends defpackage.aolj implements defpackage.aolo {
    public static final defpackage.aolk l = new defpackage.aolk(defpackage.aolo.k, new defpackage.aoso(0));

    public aosp() {
        super(defpackage.aolo.k);
    }

    public abstract void a(defpackage.aolr aolrVar, java.lang.Runnable runnable);

    public boolean dB(defpackage.aolr aolrVar) {
        return true;
    }

    public defpackage.aosp e(int i) {
        defpackage.aosv.B(i);
        return new defpackage.apbz(this, i);
    }

    @Override // defpackage.aolo
    public final defpackage.aoln f(defpackage.aoln aolnVar) {
        return new defpackage.apbn(this, aolnVar);
    }

    @Override // defpackage.aolo
    public final void g(defpackage.aoln aolnVar) {
        defpackage.aorq aorqVar = ((defpackage.apbn) aolnVar).f;
        while (aorqVar.a == defpackage.apbo.b) {
        }
        java.lang.Object obj = aorqVar.a;
        defpackage.aosc aoscVar = obj instanceof defpackage.aosc ? (defpackage.aosc) obj : null;
        if (aoscVar != null) {
            aoscVar.x();
        }
    }

    @Override // defpackage.aolj, defpackage.aolp, defpackage.aolr
    public final /* bridge */ defpackage.aolp get(defpackage.aolq aolqVar) {
        if (aolqVar == null) {
            defpackage.aooh.i("key");
        }
        if (aolqVar instanceof defpackage.aolk) {
            defpackage.aolk aolkVar = (defpackage.aolk) aolqVar;
            if (aolkVar.b(getKey())) {
                defpackage.aolp aolpVarA = aolkVar.a(this);
                if (aolpVarA instanceof defpackage.aolp) {
                    return aolpVarA;
                }
            }
        } else if (defpackage.aolo.k == aolqVar) {
            return this;
        }
        return null;
    }

    public void i(defpackage.aolr aolrVar, java.lang.Runnable runnable) throws defpackage.aotd {
        try {
            a(aolrVar, runnable);
        } catch (java.lang.Throwable th) {
            throw new defpackage.aotd(th, this, aolrVar);
        }
    }

    @Override // defpackage.aolj, defpackage.aolr
    public final /* bridge */ defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        if (aolqVar == null) {
            defpackage.aooh.i("key");
        }
        if (aolqVar instanceof defpackage.aolk) {
            defpackage.aolk aolkVar = (defpackage.aolk) aolqVar;
            if (!aolkVar.b(getKey()) || aolkVar.a(this) == null) {
                return this;
            }
        } else if (defpackage.aolo.k != aolqVar) {
            return this;
        }
        return defpackage.aols.a;
    }

    public java.lang.String toString() {
        return defpackage.aosv.a(this) + '@' + defpackage.aosv.b(this);
    }
}
