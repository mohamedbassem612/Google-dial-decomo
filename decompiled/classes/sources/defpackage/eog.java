package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eog {
    public static final defpackage.eop a = new defpackage.enu(4);
    public final defpackage.kgl b;

    public eog(defpackage.eoh eohVar, defpackage.eoe eoeVar, defpackage.eoq eoqVar) {
        if (eohVar == null) {
            defpackage.aooh.i("store");
        }
        if (eoeVar == null) {
            defpackage.aooh.i("factory");
        }
        if (eoqVar == null) {
            defpackage.aooh.i("defaultCreationExtras");
        }
        this.b = new defpackage.kgl(eohVar, eoeVar, eoqVar);
    }

    public final defpackage.eoa a(java.lang.Class cls) {
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        return b(new defpackage.aooa(cls));
    }

    public final defpackage.eoa b(defpackage.aopu aopuVar) {
        java.lang.String strB = aopuVar.b();
        if (strB != null) {
            return this.b.I(aopuVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final defpackage.eoa c(java.lang.String str, java.lang.Class cls) {
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        return this.b.I(new defpackage.aooa(cls), str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eog(defpackage.eoh eohVar, defpackage.eoe eoeVar) {
        this(eohVar, eoeVar, defpackage.eoo.a);
        if (eohVar == null) {
            defpackage.aooh.i("store");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eog(defpackage.eoi eoiVar) {
        this(eoiVar.S(), defpackage.dzo.m(eoiVar), defpackage.dzo.n(eoiVar));
        if (eoiVar == null) {
            defpackage.aooh.i("owner");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eog(defpackage.eoi eoiVar, defpackage.eoe eoeVar) {
        this(eoiVar.S(), eoeVar, defpackage.dzo.n(eoiVar));
        if (eoiVar == null) {
            defpackage.aooh.i("owner");
        }
    }
}
