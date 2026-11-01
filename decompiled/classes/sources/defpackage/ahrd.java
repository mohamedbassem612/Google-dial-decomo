package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahrd implements defpackage.aovi {
    public static final defpackage.cch b = new defpackage.cch();
    public final defpackage.ahpn a;
    private final boolean c;
    private final defpackage.ahne d;

    public ahrd(defpackage.ahpn ahpnVar, boolean z, boolean z2) {
        if (ahpnVar == null) {
            defpackage.aooh.i("context");
        }
        this.a = ahpnVar;
        this.c = z2;
        this.d = new defpackage.ahne(ahpnVar, z);
    }

    @Override // defpackage.aovi
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        defpackage.ahne ahneVar = this.d;
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahne ahneVar2 = ahpeVar.e;
        defpackage.ahpj ahpjVar = ahpeVar.c;
        defpackage.ahpj ahpjVar2 = ahpeVar.d;
        if (ahpjVar2 == null) {
            ahpeVar.d = ahpjVar != null ? ahpjVar : ahneVar.a;
        }
        ahpeVar.e = ahneVar;
        defpackage.ahns.s(ahpeVar, ahneVar.a, 1);
        return new defpackage.aogc((java.lang.Object) ahpjVar, (java.lang.Object) ahneVar2, (java.lang.Object) ahpjVar2, (short[]) null);
    }

    public final defpackage.aolr b(defpackage.aolp aolpVar) {
        if (aolpVar == null) {
            defpackage.aooh.i("overwritingElement");
        }
        defpackage.ahrd ahrdVar = (defpackage.ahrd) aolpVar.get(b);
        boolean z = ahrdVar != null ? ahrdVar.c : false;
        defpackage.ahpn ahpnVar = this.a;
        boolean z2 = true;
        if (!z && !defpackage.ahns.a) {
            z2 = false;
        }
        return new defpackage.ahrd(ahpnVar, z2, false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ahpj, java.lang.Object] */
    @Override // defpackage.aovi
    public final /* bridge */ /* synthetic */ void c(defpackage.aolr aolrVar, java.lang.Object obj) {
        defpackage.aogc aogcVar = (defpackage.aogc) obj;
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("oldState");
        }
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahns.s(ahpeVar, aogcVar.c, 3);
        ahpeVar.e = (defpackage.ahne) aogcVar.b;
        ahpeVar.d = aogcVar.a;
    }

    public final defpackage.ahrd d() {
        boolean z = true;
        if (!this.c && !defpackage.ahns.a) {
            z = false;
        }
        return new defpackage.ahrd(this.a, z, false);
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.aolp, defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        return defpackage.ajsz.aq(this, aolqVar);
    }

    @Override // defpackage.aolp
    public final defpackage.aolq getKey() {
        return b;
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        return defpackage.ajsz.as(this, aolrVar);
    }
}
